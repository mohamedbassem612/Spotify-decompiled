package p;

import java.io.Closeable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public interface h1d1 extends Closeable {
    sk30 G0();

    String getDatabaseName();

    void setWriteAheadLoggingEnabled(boolean z);
}
