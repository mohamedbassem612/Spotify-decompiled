package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class skb implements iu30 {
    public final /* synthetic */ float a;
    public final /* synthetic */ float b;
    public final /* synthetic */ int c;
    public final /* synthetic */ hw61 d;
    public final /* synthetic */ boolean e;

    public /* synthetic */ skb(float f, float f2, int i, hw61 hw61Var, boolean z) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = hw61Var;
        this.e = z;
    }

    public final Object invoke(Object obj) {
        kd31 kd31Var = (kd31) obj;
        float fH = kd31Var.T0.h() * this.a;
        float fH2 = kd31Var.T0.h() * this.b;
        kd31Var.k((fH <= 0.0f || fH2 <= 0.0f) ? null : new pkb(this.c, fH, fH2));
        u5j1 u5j1Var = this.d;
        if (u5j1Var == null) {
            u5j1Var = d4o1.a;
        }
        kd31Var.w(u5j1Var);
        kd31Var.f(this.e);
        return rih1.a;
    }
}
