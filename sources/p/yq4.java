package p;

import java.util.concurrent.CopyOnWriteArraySet;
import java.util.logging.Handler;
import java.util.logging.LogRecord;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class yq4 extends Handler {
    public static final yq4 a = new yq4();

    @Override // java.util.logging.Handler
    public final void publish(LogRecord logRecord) {
        CopyOnWriteArraySet copyOnWriteArraySet = xq4.a;
        xq4.a(mue1.t(logRecord), logRecord.getLoggerName(), logRecord.getMessage(), logRecord.getThrown());
    }

    @Override // java.util.logging.Handler
    public final void close() {
    }

    @Override // java.util.logging.Handler
    public final void flush() {
    }
}
