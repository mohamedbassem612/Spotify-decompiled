package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class hu91 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public byte b;
    public float c;
    public Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu91(adn adnVar, o95 o95Var, ven0 ven0Var, ven0 ven0Var2, lnm lnmVar) {
        super(2, lnmVar);
        this.d = adnVar;
        this.e = o95Var;
        this.f = ven0Var;
        this.g = ven0Var2;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.g;
        Object obj3 = this.f;
        Object obj4 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new hu91((adn) this.d, (o95) obj4, (ven0) obj3, (ven0) obj2, lnmVar);
            default:
                return new hu91((ru91) obj4, this.c, (iu30) obj3, (bs41) obj2, lnmVar);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    /* JADX WARN: Code duplicated, block: B:83:? A[RETURN, SYNTHETIC] */
    public final Object invokeSuspend(Object obj) {
        Object obj2;
        float f;
        Float f2;
        pxg1 pxg1VarO0;
        m811 m811Var;
        ru91 ru91Var;
        Object objD;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        Object obj3 = this.f;
        Object obj4 = this.g;
        Object obj5 = this.e;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                ven0 ven0Var = (ven0) obj4;
                ven0 ven0Var2 = (ven0) obj3;
                adn adnVar = (adn) this.d;
                o95 o95Var = (o95) obj5;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    List<hg50> list = adnVar.f.a;
                    ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                    for (hg50 hg50Var : list) {
                        arrayList.add(new mmr0(new Float(hg50Var.a), new Float(hg50Var.b)));
                    }
                    float fFloatValue = ((Number) o95Var.e()).floatValue();
                    List list2 = (List) ven0Var2.getValue();
                    List list3 = (List) ven0Var.getValue();
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    int i = 0;
                    for (Iterator it = arrayList.iterator(); it.hasNext(); it = it) {
                        Object next = it.next();
                        int i2 = i + 1;
                        if (i < 0) {
                            p7h.T();
                            throw null;
                        }
                        mmr0 mmr0Var = (mmr0) next;
                        float fFloatValue2 = ((Number) mmr0Var.a).floatValue();
                        float fFloatValue3 = ((Number) mmr0Var.b).floatValue();
                        Object obj6 = obj5;
                        mmr0 mmr0Var2 = (mmr0) ((i < 0 || i >= list2.size()) ? new mmr0(new Float(fFloatValue2), new Float(fFloatValue3)) : list2.get(i));
                        float fFloatValue4 = ((Number) mmr0Var2.a).floatValue();
                        float fFloatValue5 = ((Number) mmr0Var2.b).floatValue();
                        mmr0 mmr0Var3 = (mmr0) ((i < 0 || i >= list3.size()) ? new mmr0(new Float(fFloatValue2), new Float(fFloatValue3)) : list3.get(i));
                        arrayList2.add(new mmr0(new Float(l1d.e(((Number) mmr0Var3.a).floatValue(), fFloatValue4, fFloatValue, fFloatValue4)), new Float(l1d.e(((Number) mmr0Var3.b).floatValue(), fFloatValue5, fFloatValue, fFloatValue5))));
                        list2 = list2;
                        i = i2;
                        obj5 = obj6;
                    }
                    obj2 = obj5;
                    ven0Var2.setValue(arrayList2);
                    ven0Var.setValue(arrayList);
                    if (adnVar.e != yy30.b || arrayList2.equals(arrayList)) {
                        Float f3 = new Float(1.0f);
                        this.c = fFloatValue;
                        this.b = (byte) 3;
                        if (o95Var.g(f3, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        Float f4 = new Float(0.0f);
                        this.c = fFloatValue;
                        this.b = (byte) 1;
                        if (o95Var.g(f4, this) == d9nVar) {
                            return d9nVar;
                        }
                        f = fFloatValue;
                        f2 = new Float(1.0f);
                        pxg1VarO0 = irn1.o0(150, 0, mlv.d, 2);
                        this.c = f;
                        this.b = (byte) 2;
                        if (o95.b((o95) obj2, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else if (b2 == 1) {
                    f = this.c;
                    hm5.M(obj);
                    obj2 = obj5;
                    f2 = new Float(1.0f);
                    pxg1VarO0 = irn1.o0(150, 0, mlv.d, 2);
                    this.c = f;
                    this.b = (byte) 2;
                    if (o95.b((o95) obj2, f2, pxg1VarO0, (Float) null, (iu30) null, this, 12) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (b2 != 2 && b2 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return rih1.a;
            default:
                iu30 iu30Var = (iu30) obj3;
                float f5 = this.c;
                ru91 ru91Var2 = (ru91) obj5;
                wu91 wu91Var = ru91Var2.a;
                byte b3 = this.b;
                if (b3 == 0) {
                    hm5.M(obj);
                    float fB = wu91Var.b(f5, t5p1.k(ru91Var2.b, 0.0f, f5));
                    if (Float.isNaN(fB)) {
                        tf80.c("calculateApproachOffset returned NaN. Please use a valid value.");
                    }
                    m811Var = new m811();
                    float fSignum = Math.signum(f5) * Math.abs(fB);
                    m811Var.a = fSignum;
                    iu30Var.invoke(new Float(fSignum));
                    float f6 = m811Var.a;
                    float f7 = this.c;
                    ru91Var = ru91Var2;
                    ou91 ou91Var = new ou91(m811Var, iu30Var, (byte) 0);
                    this.d = m811Var;
                    this.b = (byte) 1;
                    objD = ru91Var.d((bs41) obj4, f6, f7, ou91Var, this);
                    if (objD != d9nVar) {
                    }
                    return d9nVar;
                }
                if (b3 != 1) {
                    if (b3 == 2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                m811 m811Var2 = (m811) this.d;
                hm5.M(obj);
                objD = obj;
                m811Var = m811Var2;
                ru91Var = ru91Var2;
                ie5 ie5Var = (ie5) objD;
                float fA = wu91Var.a(((Number) ie5Var.c()).floatValue());
                if (Float.isNaN(fA)) {
                    tf80.c("calculateSnapOffset returned NaN. Please use a valid value.");
                }
                m811Var.a = fA;
                ie5 ie5VarL = prn1.l(ie5Var, 0.0f, 0.0f, 30);
                fe5 fe5Var = ru91Var.c;
                ou91 ou91Var2 = new ou91(m811Var, iu30Var, (byte) 1);
                this.d = null;
                this.b = (byte) 2;
                Object objR = jch0.r((bs41) obj4, fA, fA, ie5VarL, fe5Var, ou91Var2, this);
                if (objR != d9nVar) {
                    return objR;
                }
                return d9nVar;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public hu91(ru91 ru91Var, float f, iu30 iu30Var, bs41 bs41Var, lnm lnmVar) {
        super(2, lnmVar);
        this.e = ru91Var;
        this.c = f;
        this.f = iu30Var;
        this.g = bs41Var;
    }
}
