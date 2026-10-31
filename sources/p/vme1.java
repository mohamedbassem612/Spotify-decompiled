package p;

import com.spotify.wrapped.v1.proto.SceneTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vme1 extends a8d1 implements vu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ ane1 b;
    public final /* synthetic */ qam1 c;
    public final /* synthetic */ ven0 d;
    public final /* synthetic */ ven0 e;
    public final /* synthetic */ hdn0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vme1(boolean z, ane1 ane1Var, qam1 qam1Var, ven0 ven0Var, ven0 ven0Var2, hdn0 hdn0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = z;
        this.b = ane1Var;
        this.c = qam1Var;
        this.d = ven0Var;
        this.e = ven0Var2;
        this.f = hdn0Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        return new vme1(this.a, this.b, this.c, this.d, this.e, this.f, lnmVar);
    }

    public final Object invoke(Object obj, Object obj2) {
        vme1 vme1VarCreate = create((c9n) obj, (lnm) obj2);
        rih1 rih1Var = rih1.a;
        vme1VarCreate.invokeSuspend(rih1Var);
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        ane1 ane1Var = this.b;
        xgm1 xgm1Var = ane1Var.e;
        hm5.M(obj);
        if (this.a) {
            ven0 ven0Var = this.d;
            if (!((wgm1) ven0Var.getValue()).c.e) {
                xgm1Var.a(igm1.a);
            }
            if (!((wgm1) ven0Var.getValue()).c.a) {
                xgm1Var.a(fgm1.a);
                if (((Boolean) this.e.getValue()).booleanValue() && ane1Var.j) {
                    sam1.a(this.c);
                }
            }
            ine1.e((SceneTemplate.TimeMachineContent.Card2.YearEntry) ane1Var.a.get(this.f.s()), xgm1Var);
        }
        return rih1.a;
    }
}
