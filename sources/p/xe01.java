package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class xe01 implements zob1, phd, fx30 {
    public final /* synthetic */ zob1 a;
    private final faa0 job;

    public xe01(wen0 wen0Var, faa0 faa0Var) {
        this.a = wen0Var;
        this.job = faa0Var;
    }

    @Override // p.fx30
    public final mr20 b(o8n o8nVar, int i, int i2) {
        return gio1.n(this, o8nVar, i, i2);
    }

    @Override // p.at71
    public final List c() {
        return this.a.c();
    }

    @Override // p.mr20
    public final Object collect(vr20 vr20Var, lnm lnmVar) {
        return this.a.collect(vr20Var, lnmVar);
    }

    @Override // p.zob1
    public final Object getValue() {
        return this.a.getValue();
    }
}
