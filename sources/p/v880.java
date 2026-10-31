package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class v880 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ gpt c;

    public /* synthetic */ v880(vr20 vr20Var, lhm lhmVar, gpt gptVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = gptVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x0063  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        u880 u880Var;
        qfe1 qfe1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        gpt gptVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof u880) {
                    u880Var = (u880) lnmVar;
                    int i = u880Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        u880Var.b = i - Integer.MIN_VALUE;
                    } else {
                        u880Var = new u880(this, lnmVar);
                    }
                } else {
                    u880Var = new u880(this, lnmVar);
                }
                Object obj2 = u880Var.a;
                int i2 = u880Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                List list = (List) obj;
                list.getClass();
                a980 a980VarB = y880.b(gptVar.a, list);
                u880Var.b = 1;
                return vr20Var.emit(a980VarB, u880Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof qfe1) {
                    qfe1Var = (qfe1) lnmVar;
                    int i3 = qfe1Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        qfe1Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        qfe1Var = new qfe1(this, lnmVar);
                    }
                } else {
                    qfe1Var = new qfe1(this, lnmVar);
                }
                Object obj3 = qfe1Var.a;
                int i4 = qfe1Var.b;
                if (i4 != 0) {
                    if (i4 == 1) {
                        hm5.M(obj3);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj3);
                List list2 = (List) obj;
                list2.getClass();
                ArrayList arrayListC = y880.c(gptVar.a, list2);
                qfe1Var.b = 1;
                return vr20Var.emit(arrayListC, qfe1Var) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
