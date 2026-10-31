package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rjb0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ xtb0 b;
    public final /* synthetic */ float c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ cv30 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb0(xtb0 xtb0Var, float f, hdn0 hdn0Var, hdn0 hdn0Var2, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.b = xtb0Var;
        this.c = f;
        this.d = hdn0Var;
        this.e = hdn0Var2;
        this.f = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        iu30 iu30Var = this.f;
        Object obj2 = this.e;
        Object obj3 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                float f = this.c;
                return new rjb0(this.b, (tl7) obj3, (Function0) obj2, (Function0) iu30Var, f, lnmVar);
            default:
                return new rjb0(this.b, this.c, (hdn0) obj3, (hdn0) obj2, iu30Var, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        Object next;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.f;
        float f = this.c;
        Object obj2 = this.d;
        xtb0 xtb0Var = this.b;
        Object obj3 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                hm5.M(obj);
                if (!xtb0Var.j.b()) {
                    ((tl7) obj2).i((Float) ((Function0) obj3).invoke(), (Float) ((Function0) iu30Var).invoke(), f);
                }
                break;
            default:
                err0 err0Var = (hdn0) obj3;
                hm5.M(obj);
                if (!xtb0Var.j.b()) {
                    float fS = ((hdn0) obj2).s() * f;
                    List<qtb0> list = xtb0Var.h().l;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (qtb0 qtb0Var : list) {
                        arrayList.add(new mmr0(Integer.valueOf(qtb0Var.a), Integer.valueOf((qtb0Var.q - Math.max(0, -qtb0Var.p)) - Math.max(0, (qtb0Var.p + qtb0Var.q) - xtb0Var.h().n))));
                    }
                    ArrayList arrayList2 = new ArrayList();
                    for (Object obj4 : arrayList) {
                        if (((Number) ((mmr0) obj4).b).intValue() >= fS) {
                            arrayList2.add(obj4);
                        }
                    }
                    Iterator it = arrayList2.iterator();
                    Integer num = null;
                    if (it.hasNext()) {
                        next = it.next();
                        if (it.hasNext()) {
                            int iIntValue = ((Number) ((mmr0) next).b).intValue();
                            do {
                                Object next2 = it.next();
                                int iIntValue2 = ((Number) ((mmr0) next2).b).intValue();
                                if (iIntValue < iIntValue2) {
                                    next = next2;
                                    iIntValue = iIntValue2;
                                }
                            } while (it.hasNext());
                        }
                    } else {
                        next = null;
                    }
                    mmr0 mmr0Var = (mmr0) next;
                    Integer num2 = new Integer(mmr0Var != null ? ((Number) mmr0Var.a).intValue() : -1);
                    int iIntValue3 = num2.intValue();
                    if (iIntValue3 >= 0 && iIntValue3 != err0Var.s()) {
                        num = num2;
                    }
                    if (num != null) {
                        int iIntValue4 = num.intValue();
                        err0Var.t(iIntValue4);
                        iu30Var.invoke(Integer.valueOf(iIntValue4));
                    }
                }
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rjb0(xtb0 xtb0Var, tl7 tl7Var, Function0 function0, Function0 function1, float f, lnm lnmVar) {
        super(2, lnmVar);
        this.b = xtb0Var;
        this.d = tl7Var;
        this.e = function0;
        this.f = function1;
        this.c = f;
    }
}
