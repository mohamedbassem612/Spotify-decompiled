package p;

import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ml10 extends gf30 {
    public final iu30 b;
    public boolean c;

    public ml10(c291 c291Var, iu30 iu30Var) {
        super(c291Var);
        this.b = iu30Var;
    }

    @Override // p.gf30, p.c291
    public final void B0(nac nacVar, long j) {
        if (this.c) {
            nacVar.skip(j);
            return;
        }
        try {
            super.B0(nacVar, j);
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // p.gf30, p.c291, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        try {
            super.close();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }

    @Override // p.gf30, p.c291, java.io.Flushable
    public final void flush() {
        if (this.c) {
            return;
        }
        try {
            super.flush();
        } catch (IOException e) {
            this.c = true;
            this.b.invoke(e);
        }
    }
}
