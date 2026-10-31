package p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class mpw extends a8d1 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public /* synthetic */ Object b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpw(su01 su01Var, vr01 vr01Var, lnm lnmVar) {
        super(3, lnmVar);
        this.c = su01Var;
        this.d = vr01Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        switch (b) {
            case 0:
                mpw mpwVar = new mpw((yjq) obj4, (lnm) obj3);
                mpwVar.b = (List) obj;
                mpwVar.c = (z3p0) obj2;
                return mpwVar.invokeSuspend(rih1Var);
            default:
                mpw mpwVar2 = new mpw((su01) this.c, (vr01) obj4, (lnm) obj3);
                mpwVar2.b = (Throwable) obj2;
                mpwVar2.invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                List list = (List) this.b;
                z3p0 z3p0Var = (z3p0) this.c;
                hm5.M(obj);
                List<ba51> list2 = list;
                yjq yjqVar = (yjq) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                for (ba51 ba51Var : list2) {
                    String strB = ba51Var.b();
                    List<aa51> listA = ba51Var.a();
                    ArrayList arrayList2 = new ArrayList(q7h.U(listA, 10));
                    for (aa51 aa51Var : listA) {
                        lwc lwcVar = new lwc(aa51Var.c());
                        hvc hvcVarC = yjq.c(yjqVar, aa51Var);
                        String strB2 = aa51Var.b();
                        lwc lwcVar2 = strB2 != null ? new lwc(strB2) : null;
                        String strA = aa51Var.a();
                        arrayList2.add(new apd(lwcVar, lwcVar2, hvcVarC, strA != null ? new j80(strA, aa51Var.d()) : new j80(aa51Var.d(), (String) null), yjq.d(yjqVar, aa51Var, z3p0Var), (Float) null, 208));
                    }
                    arrayList.add(new dpd(strB, arrayList2, 1020));
                }
                return arrayList;
            default:
                su01 su01Var = (su01) this.c;
                Throwable th = (Throwable) this.b;
                hm5.M(obj);
                if (th != null) {
                    if (!(th instanceof CancellationException) || (th instanceof TimeoutCancellationException)) {
                        ((vr01) obj2).f("RecentsDataSource load failed: " + th.getMessage());
                        su01Var.g(2);
                    } else {
                        su01Var.g(3);
                    }
                }
                return rih1.a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mpw(yjq yjqVar, lnm lnmVar) {
        super(3, lnmVar);
        this.d = yjqVar;
    }
}
