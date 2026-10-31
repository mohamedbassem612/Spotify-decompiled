package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ve01 implements at71, phd, fx30 {
    public final /* synthetic */ at71 a;
    private final faa0 job;

    public ve01(sen0 sen0Var, xab1 xab1Var) {
        this.a = sen0Var;
        this.job = xab1Var;
    }

    @Override // p.fx30
    public final mr20 b(o8n o8nVar, int i, int i2) {
        return mgo1.r(this, o8nVar, i, i2);
    }

    @Override // p.at71
    public final List c() {
        return this.a.c();
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        return this.a.collect(vr20Var, lnmVar);
    }
}
