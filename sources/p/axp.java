package p;

import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class axp {
    public final i7d a;
    public final ywp b = new ywp(this, 1, (byte) 2);
    public final ywp c = new ywp(this, 0, (byte) 2);
    public final ywp d = new ywp(this, 2, (byte) 2);

    public axp(i7d i7dVar) {
        this.a = i7dVar;
    }

    public final opl0 a() {
        xxl0 xxl0Var = (xxl0) this.a.g;
        c8o.l(xxl0Var);
        return new opl0(xxl0Var.b(), (byte) 18);
    }

    public final jxp0 b() {
        i7d i7dVar = this.a;
        Context context = (Context) i7dVar.h;
        wh71 wh71Var = (wh71) i7dVar.Z;
        c8o.l(wh71Var);
        return new jxp0(new rwj(context, new jkp0(wh71Var, (byte) 4), a(), wh71Var, (fjb) i7dVar.N0), (byte) 1);
    }
}
