package com.dragon.talon;

import ch.qos.logback.classic.spi.ILoggingEvent;
import ch.qos.logback.core.LayoutBase;
import com.dragon.talon.utils.TraceUtils;

/**
 * @author chenshun00@gmail.com
 * @since 2022/7/31 11:17
 */
public class LayOut extends LayoutBase<ILoggingEvent> {

    @Override
    public String doLayout(ILoggingEvent iLoggingEvent) {
        final String trace = TraceUtils.getTrace();
        return Thread.currentThread().getName() + "\t" + trace + "\t" + iLoggingEvent.getFormattedMessage();
    }
}
