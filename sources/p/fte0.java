package p;

import app.p000rive.semantics.SemanticState;
import java.io.Writer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fte0 extends Writer {
    public final StringBuilder a = new StringBuilder(SemanticState.Focused);

    public final void a() {
        StringBuilder sb = this.a;
        if (sb.length() > 0) {
            sb.delete(0, sb.length());
        }
    }

    @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a();
    }

    @Override // java.io.Writer, java.io.Flushable
    public final void flush() {
        a();
    }

    @Override // java.io.Writer
    public final void write(char[] cArr, int i, int i2) {
        for (int i3 = 0; i3 < i2; i3++) {
            char c = cArr[i + i3];
            if (c == '\n') {
                a();
            } else {
                this.a.append(c);
            }
        }
    }
}
