package p;

import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bem1 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ cem1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bem1(cem1 cem1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = cem1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        cem1 cem1Var = this.b;
        switch (b) {
            case 0:
                return new bem1(cem1Var, lnmVar, (byte) 0);
            default:
                return new bem1(cem1Var, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        cem1 cem1Var = this.b;
        qem1 qem1Var = null;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                hm5.M(obj);
                ycm1 ycm1Var = cem1Var.e;
                if (ycm1Var != null) {
                    ycm1Var.l = false;
                    ycm1Var.i.clear();
                    cdm1 cdm1Var = (cdm1) o7h.s0(ycm1Var.c);
                    ycm1Var.d = cdm1Var != null ? cdm1Var.a : null;
                    ycm1Var.n = false;
                    ycm1Var.o = true;
                    m3c m3cVar = ycm1Var.j;
                    if (m3cVar != null) {
                        LinkedHashMap linkedHashMap = (LinkedHashMap) m3cVar.d;
                        if (!m3cVar.b) {
                            m3cVar.b = true;
                            for (hth0 hth0Var : linkedHashMap.values()) {
                                hth0Var.g(0.0f);
                                hth0Var.release();
                            }
                            linkedHashMap.clear();
                        }
                    } else {
                        qem1 qem1Var2 = ycm1Var.a;
                        if (qem1Var2 != null) {
                            qem1Var2.e();
                        }
                    }
                    ycm1Var.j = null;
                    ycm1Var.f.clear();
                    ycm1Var.h.clear();
                    ycm1Var.f();
                    ycm1Var.k = 0.0f;
                } else {
                    qem1 qem1Var3 = cem1Var.d;
                    if (qem1Var3 == null) {
                        return null;
                    }
                    qem1Var3.e();
                }
                return rih1Var;
            default:
                hm5.M(obj);
                ycm1 ycm1Var2 = cem1Var.e;
                if (ycm1Var2 != null) {
                    LinkedHashSet linkedHashSet = ycm1Var2.h;
                    if (ycm1Var2.j == null) {
                        ycm1Var2.k = 0.0f;
                        ycm1Var2.f.clear();
                        linkedHashSet.clear();
                        ycm1Var2.f();
                        LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                        qem1 qem1Var4 = ycm1Var2.a;
                        if (qem1Var4 != null && !ycm1Var2.q) {
                            qem1Var = qem1Var4;
                        }
                        if (qem1Var != null) {
                            linkedHashMap2.put(wcm1.a, qem1Var);
                        }
                        for (cdm1 cdm1Var2 : ycm1Var2.e()) {
                            hth0 hth0VarA = ycm1Var2.a(cdm1Var2);
                            if (hth0VarA != null) {
                                linkedHashMap2.put(new xcm1(cdm1Var2), hth0VarA);
                                linkedHashSet.add(cdm1Var2);
                            }
                        }
                        if (qem1Var != null) {
                            qem1Var.f();
                        }
                        m3c m3cVar2 = new m3c(linkedHashMap2, ycm1Var2.b());
                        m3cVar2.j(ycm1Var2.m);
                        if (ycm1Var2.l) {
                            m3cVar2.g();
                        }
                        ycm1Var2.j = m3cVar2;
                        ycm1Var2.g();
                    }
                } else {
                    qem1 qem1Var5 = cem1Var.d;
                    if (qem1Var5 == null) {
                        return null;
                    }
                    qem1Var5.f();
                }
                return rih1Var;
        }
    }
}
