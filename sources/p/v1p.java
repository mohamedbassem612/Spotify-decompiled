package p;

import android.app.Activity;
import android.content.Context;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class v1p {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jly0 b;

    public /* synthetic */ v1p(jly0 jly0Var, byte b) {
        this.a = b;
        this.b = jly0Var;
    }

    public final el9 a(d0r d0rVar) {
        byte b = this.a;
        lbp lbpVar = this.b;
        switch (b) {
            case 0:
                a680 a680Var = (a680) ((fwo) lbpVar).c;
                Context context = (Context) ((ozp) a680Var.a).a.x1.a;
                c8o.l(context);
                yqg yqgVar = (yqg) ((ozp) a680Var.a).a.J1.get();
                c8o.l(yqgVar);
                oum oumVar = (oum) ((ozp) a680Var.a).a.Eq.get();
                c8o.l(oumVar);
                return new el9(context, yqgVar, oumVar, new hcs((fwo) a680Var.e), d0rVar);
            case 1:
                wdm wdmVar = (wdm) ((b2p) lbpVar).c;
                Activity activityC = ((rc8) wdmVar.b).c();
                c8o.l(activityC);
                yqg yqgVar2 = (yqg) ((rc8) wdmVar.b).b.get();
                c8o.l(yqgVar2);
                oum oumVar2 = (oum) ((rc8) wdmVar.b).k.get();
                c8o.l(oumVar2);
                return new el9(activityC, yqgVar2, oumVar2, new hcs((b2p) wdmVar.t), d0rVar);
            case 2:
                x2p x2pVar = (x2p) ((i8p) lbpVar).c;
                Context context2 = (Context) ((kzp) x2pVar.c).a.x1.a;
                c8o.l(context2);
                yqg yqgVar3 = (yqg) ((kzp) x2pVar.c).a.J1.get();
                c8o.l(yqgVar3);
                oum oumVar3 = (oum) ((kzp) x2pVar.c).a.Eq.get();
                c8o.l(oumVar3);
                return new el9(context2, yqgVar3, oumVar3, new hcs((i8p) x2pVar.d), d0rVar);
            case 3:
                t7p t7pVar = (t7p) ((i8p) lbpVar).c;
                Context context3 = (Context) ((ozp) t7pVar.c).a.x1.a;
                c8o.l(context3);
                yqg yqgVar4 = (yqg) ((ozp) t7pVar.c).a.J1.get();
                c8o.l(yqgVar4);
                oum oumVar4 = (oum) ((ozp) t7pVar.c).a.Eq.get();
                c8o.l(oumVar4);
                return new el9(context3, yqgVar4, oumVar4, new hcs((i8p) t7pVar.d), d0rVar);
            case 4:
                c21 c21Var = (c21) lbpVar.c;
                Context context4 = (Context) ((nzp) c21Var.d).a.x1.a;
                c8o.l(context4);
                yqg yqgVar5 = (yqg) ((nzp) c21Var.d).a.J1.get();
                c8o.l(yqgVar5);
                oum oumVar5 = (oum) ((nzp) c21Var.d).a.Eq.get();
                c8o.l(oumVar5);
                return new el9(context4, yqgVar5, oumVar5, new hcs((lbp) c21Var.h), d0rVar);
            default:
                ip31 ip31Var = (ip31) ((ykq) lbpVar).c;
                Activity activityA = ((lh31) ip31Var.b).a();
                c8o.l(activityA);
                yqg yqgVar6 = (yqg) ((lh31) ip31Var.b).b.get();
                c8o.l(yqgVar6);
                oum oumVar6 = (oum) ((lh31) ip31Var.b).m.get();
                c8o.l(oumVar6);
                return new el9(activityA, yqgVar6, oumVar6, new hcs((ykq) ip31Var.h), d0rVar);
        }
    }
}
