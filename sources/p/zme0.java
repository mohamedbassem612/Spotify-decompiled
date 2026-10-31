package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class zme0 implements h0r0 {
    public final dne0 a;
    public final kyj b;
    public final sme0 c;
    public final g5s d;
    public final in01 e;
    public final yge0 f;
    public final cbr0 g;

    public zme0(dne0 dne0Var, kyj kyjVar, sme0 sme0Var, g5s g5sVar, in01 in01Var, yge0 yge0Var) {
        this.a = dne0Var;
        this.b = kyjVar;
        this.c = sme0Var;
        this.d = g5sVar;
        this.e = in01Var;
        this.f = yge0Var;
        yxe1 yxe1Var = new yxe1(new ehc1("LocationSearchPage"));
        Parcelable.Creator<lik1> creator = lik1.CREATOR;
        this.g = new cbr0(new dbr0[]{yxe1Var, new bn70((n6r0) jon1.a, oap1.i(dne0Var.getUri()), (nar0) null), new qod1("trending-near-you-location-search")}, false);
    }

    @Override // p.h0r0
    public final cbr0 a() {
        return this.g;
    }

    @Override // p.h0r0
    public final p2r0 b() {
        return this.b.a(apo.j(167629725, new kmd0(this, (byte) 8), true), new dx81(new wme0(this), new l6d0(this, (byte) 23), dj10.Y, gje0.g));
    }
}
