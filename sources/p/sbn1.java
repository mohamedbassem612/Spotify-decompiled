package p;

import java.security.spec.ECPoint;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sbn1 extends jfn1 {
    public final bkp1 d;
    public final ECPoint e;
    public final mhn1 f;
    public final Integer g;

    public sbn1(bkp1 bkp1Var, ECPoint eCPoint, mhn1 mhn1Var, Integer num) {
        this.d = bkp1Var;
        this.e = eCPoint;
        this.f = mhn1Var;
        this.g = num;
    }

    @Override // p.pno1
    public final /* synthetic */ w9p1 u() {
        return this.d;
    }

    @Override // p.pno1
    public final Integer v() {
        return this.g;
    }

    @Override // p.jfn1
    public final mhn1 w() {
        return this.f;
    }
}
