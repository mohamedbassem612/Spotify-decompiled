package p;

import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class qw51 extends a8d1 implements iu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ vw51 c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ qw51(vw51 vw51Var, String str, lnm lnmVar, byte b) {
        super(1, lnmVar);
        this.a = b;
        this.c = vw51Var;
        this.d = str;
    }

    public final lnm create(lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        vw51 vw51Var = this.c;
        switch (b) {
            case 0:
                return new qw51(vw51Var, str, lnmVar, (byte) 0);
            default:
                return new qw51(vw51Var, str, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lnm lnmVar = (lnm) obj;
        switch (b) {
            case 0:
                break;
        }
        return create(lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        String str = this.d;
        vw51 vw51Var = this.c;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var = vw51Var.a;
                trc0 trc0Var = new trc0(vw51.g, (g3d0) null, (Set) null, false, (src0) null, jqz0.a, (prc0) null, 0, (List) null, 478);
                this.b = true;
                Object objF = rsc0Var.f(str, trc0Var, this);
                return objF == d9nVar ? d9nVar : objF;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                rsc0 rsc0Var2 = vw51Var.a;
                trc0 trc0Var2 = new trc0(vw51.h, (g3d0) null, Collections.singleton(wqc0.a), false, qrc0.a, hqz0.a, (prc0) null, 0, (List) null, 458);
                this.b = true;
                Object objF2 = rsc0Var2.f(str, trc0Var2, this);
                return objF2 == d9nVar ? d9nVar : objF2;
        }
    }
}
