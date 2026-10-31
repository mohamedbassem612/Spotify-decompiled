package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class uy71 extends a8d1 implements zu30 {
    public boolean a;
    public /* synthetic */ n24 b;
    public /* synthetic */ zmg0 c;
    public /* synthetic */ xy71 d;
    public final /* synthetic */ vy71 e;
    public final /* synthetic */ float f;
    public final /* synthetic */ ni20 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uy71(vy71 vy71Var, float f, ni20 ni20Var, lnm lnmVar) {
        super(4, lnmVar);
        this.e = vy71Var;
        this.f = f;
        this.g = ni20Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        float f = this.f;
        ni20 ni20Var = this.g;
        uy71 uy71Var = new uy71(this.e, f, ni20Var, (lnm) obj4);
        uy71Var.b = (n24) obj;
        uy71Var.c = (zmg0) obj2;
        uy71Var.d = (xy71) obj3;
        return uy71Var.invokeSuspend(rih1.a);
    }

    public final Object invokeSuspend(Object obj) {
        boolean z = this.a;
        if (!z) {
            hm5.M(obj);
            n24 n24Var = this.b;
            float fD = this.c.d(this.d);
            if (!Float.isNaN(fD)) {
                m811 m811Var = new m811();
                vy71 vy71Var = this.e;
                float fG = Float.isNaN(vy71Var.g()) ? 0.0f : vy71Var.g();
                m811Var.a = fG;
                j14 j14Var = new j14(n24Var, m811Var, (byte) 1);
                this.b = null;
                this.c = null;
                this.a = true;
                Object objR = wwo1.r(fG, fD, this.f, this.g, j14Var, this);
                d9n d9nVar = d9n.a;
                if (objR == d9nVar) {
                    return d9nVar;
                }
            }
        } else {
            if (!z) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj);
        }
        return rih1.a;
    }
}
