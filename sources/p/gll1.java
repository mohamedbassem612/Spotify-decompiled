package p;

import android.os.Parcelable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gll1 implements h0r0 {
    public final qyj a;
    public final ill1 b;
    public final sag c;
    public final cbr0 d;

    public gll1(qyj qyjVar, ill1 ill1Var, sag sagVar) {
        this.a = qyjVar;
        this.b = ill1Var;
        this.c = sagVar;
        dbr0 yxe1Var = new yxe1(new ehc1("Webview"));
        a2g a2gVar = a2g.c;
        Parcelable.Creator creator = lik1.CREATOR;
        this.d = new cbr0(new dbr0[]{yxe1Var, new bn70(a2gVar, new lik1(l1d.m("spotify:webview:", ill1Var.a)), (nar0) null)}, false);
    }

    public final cbr0 a() {
        return this.d;
    }

    public final p2r0 b() {
        return this.a.a(new j2i(-77662401, new fak1(this, (byte) 13), true));
    }
}
