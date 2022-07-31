package com.dragon.talon;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import com.dragon.talon.utils.TraceUtils;

import java.util.Objects;

/**
 * @author chenshun00@gmail.com
 * @since 2022/7/31 11:17
 */
public class LayOut extends LayoutBase<ILoggingEvent> {

    @Override
    public String doLayout(ILoggingEvent iLoggingEvent) {
        if (Objects.equals(Thread.currentThread().getName(), "main")) {
            return iLoggingEvent.getFormattedMessage()+"\t";
        }
        final String trace = TraceUtils.getTrace();
        return Thread.currentThread().getName() + "\t" + trace + "\t" + iLoggingEvent.getFormattedMessage() + "\t";
    }
}
