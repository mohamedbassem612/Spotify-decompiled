package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e6m1 implements h0r0 {
    public final qyj a;
    public final g6m1 b;
    public final sag c;
    public final cbr0 d;

    public e6m1(qyj qyjVar, g6m1 g6m1Var, sag sagVar) {
        this.a = qyjVar;
        this.b = g6m1Var;
        this.c = sagVar;
        dbr0 yxe1Var = new yxe1(new ehc1("World"));
        a2g a2gVar = a2g.d;
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(a2gVar, new lik1(l1d.m("spotify:internal:worlds-web:", g6m1Var.a)), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(1321444568, new fak1(this, (byte) 18), true));
    }
}
