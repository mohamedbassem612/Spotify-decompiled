package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wk30 implements h1d1 {
    public final Context a;
    public final String b;
    public final up20 c;
    public final boolean d;
    public final boolean e;
    public final idd1 f = new idd1(new g030(this, (byte) 1));
    public boolean g;

    public wk30(Context context, String str, up20 up20Var, boolean z, boolean z2) {
        this.a = context;
        this.b = str;
        this.c = up20Var;
        this.d = z;
        this.e = z2;
    }

    @Override // p.h1d1
    public final sk30 G0() {
        return ((vk30) this.f.getValue()).a(true);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        idd1 idd1Var = this.f;
        if (idd1Var.isInitialized()) {
            ((vk30) idd1Var.getValue()).close();
        }
    }

    @Override // p.h1d1
    public final String getDatabaseName() {
        return this.b;
    }

    @Override // p.h1d1
    public final void setWriteAheadLoggingEnabled(boolean z) {
        idd1 idd1Var = this.f;
        if (idd1Var.isInitialized()) {
            ((vk30) idd1Var.getValue()).setWriteAheadLoggingEnabled(z);
        }
        this.g = z;
    }
}
