package p;

import android.os.Looper;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ppt0 implements f9v {
    public final o5n b;
    public final String c;

    public ppt0(o5n o5nVar, String str) {
        this.b = o5nVar;
        this.c = str;
    }

    @Override // p.f9v
    public final int g(ie30 ie30Var) {
        return ie30Var.t == null ? 0 : 2;
    }

    @Override // p.f9v
    public final y8v i(b9v b9vVar, ie30 ie30Var) {
        x8v x8vVar = ie30Var.t;
        if (x8vVar == null) {
            return null;
        }
        return new opt0(this.b, z1a1.i(x8vVar, h9v.b), this.c);
    }

    @Override // p.f9v
    public final void release() {
        o5n o5nVar = this.b;
        if (o5nVar != null) {
            o5nVar.b(this.c);
        }
    }

    @Override // p.f9v
    public final void h(Looper looper, dbu0 dbu0Var) {
    }
}
