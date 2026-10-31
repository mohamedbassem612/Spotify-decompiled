package p;

import java.io.Closeable;
import java.io.Flushable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public interface c291 extends Closeable, Flushable {
    void B0(nac nacVar, long j);

    @Override // java.io.Closeable, java.lang.AutoCloseable
    void close();

    void flush();

    gve1 l();
}
