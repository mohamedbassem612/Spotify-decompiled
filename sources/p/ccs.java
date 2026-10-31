package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ccs implements rsn0 {
    public final yun0 a;

    public ccs(yun0 yun0Var) {
        this.a = yun0Var;
    }

    @Override // p.rsn0
    public final boolean g() {
        return j() || this.a.h() != null;
    }

    @Override // p.rsn0
    public final boolean j() {
        return this.a.e() > 0;
    }
}
