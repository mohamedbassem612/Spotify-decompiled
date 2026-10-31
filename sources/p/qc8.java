package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qc8 implements h0r0 {
    public final hvj a;
    public final sc8 b;
    public final v0e0 c;
    public final kly0 d;
    public final cbr0 e;

    public qc8(hvj hvjVar, sc8 sc8Var, v0e0 v0e0Var, b2p b2pVar) {
        this.a = hvjVar;
        this.b = sc8Var;
        this.c = v0e0Var;
        this.d = b2pVar;
        awz0 awz0Var = new awz0("audiobook_series");
        Parcelable.Creator creator = lik1.CREATOR;
        this.e = new cbr0(new dbr0[]{new bn70(awz0Var, oap1.i(sc8Var.a()), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.e;
    }

    public final p2r0 b() {
        return hvj.b(this.a, f610.e(new p6e0[0], new dt0(this, (lnm) null, (byte) 12)), apo.j(-964365991, new ub3(this, (byte) 21), true));
    }
}
