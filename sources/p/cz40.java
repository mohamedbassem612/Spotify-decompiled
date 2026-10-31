package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cz40 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public Object c;
    public /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz40(jqf0 jqf0Var, ypf0 ypf0Var, iu30 iu30Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 1;
        this.e = jqf0Var;
        this.f = ypf0Var;
        this.g = iu30Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.g;
        switch (b) {
            case 0:
                cz40 cz40Var = new cz40((pt) obj5, (lnm) obj4);
                cz40Var.d = (bz40) obj;
                cz40Var.e = (az40) obj2;
                cz40Var.f = (tqw) obj3;
                return cz40Var.invokeSuspend(rih1Var);
            case 1:
                cz40 cz40Var2 = new cz40((jqf0) this.e, (ypf0) this.f, (iu30) obj5, (lnm) obj4);
                cz40Var2.c = (iqf0) obj;
                cz40Var2.d = (gqf0) obj2;
                return cz40Var2.invokeSuspend(rih1Var);
            case 2:
                cz40 cz40Var3 = new cz40((pt) this.d, (ven0) this.e, (ven0) obj5, (lnm) obj4, (byte) 2);
                cz40Var3.c = (imp0) obj2;
                cz40Var3.f = (tqw) obj3;
                return cz40Var3.invokeSuspend(rih1Var);
            case 3:
                cz40 cz40Var4 = new cz40(this.e, obj5, (lnm) obj4, (byte) 3);
                cz40Var4.c = (yjt0) obj;
                cz40Var4.d = (qjt0) obj2;
                cz40Var4.f = (tqw) obj3;
                return cz40Var4.invokeSuspend(rih1Var);
            case 4:
                cz40 cz40Var5 = new cz40(this.e, obj5, (lnm) obj4, (byte) 4);
                cz40Var5.c = (pey0) obj;
                cz40Var5.d = (f700) obj2;
                cz40Var5.f = (tqw) obj3;
                return cz40Var5.invokeSuspend(rih1Var);
            case 5:
                cz40 cz40Var6 = new cz40((ven0) this.d, (zf21) this.e, (wf21) obj5, (lnm) obj4, (byte) 5);
                cz40Var6.c = (vf21) obj2;
                cz40Var6.f = (tqw) obj3;
                return cz40Var6.invokeSuspend(rih1Var);
            default:
                cz40 cz40Var7 = new cz40((ven0) this.d, (c591) this.e, (z491) obj5, (lnm) obj4, (byte) 6);
                cz40Var7.c = (y491) obj2;
                cz40Var7.f = (tqw) obj3;
                return cz40Var7.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:236:0x0516  */
    /* JADX WARN: Code duplicated, block: B:242:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:245:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:28:0x0082  */
    /* JADX WARN: Code duplicated, block: B:33:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x011e  */
    /* JADX WARN: Code duplicated, block: B:68:0x013d  */
    public final Object invokeSuspend(Object obj) {
        String strZ;
        Object objA;
        ou80 ou80Var;
        Object objD;
        ou80 ou80Var2;
        Object objD2;
        byte b = this.a;
        hjx0 hjx0Var = hjx0.a;
        rih1 rih1Var = d9n.a;
        Object obj2 = this.g;
        rih1 rih1Var2 = rih1.a;
        switch (b) {
            case 0:
                pt ptVar = (pt) obj2;
                bz40 bz40Var = (bz40) this.d;
                az40 az40Var = (az40) this.e;
                tqw tqwVar = (tqw) this.f;
                byte b2 = this.b;
                if (b2 == 0) {
                    hm5.M(obj);
                    if (u890.j(az40Var, zy40.a)) {
                        Set set = s4b1.f;
                        String strZ2 = uic.C(bz40Var.a, (String) null).z();
                        if (strZ2 != null) {
                            f1n0 f1n0Var = (f1n0) ptVar.e;
                            tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                            dwn0 dwn0Var = new dwn0(strZ2, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY != null ? new bwn0(tv80VarY) : null);
                            this.d = null;
                            this.e = null;
                            this.f = null;
                            this.c = null;
                            this.b = (byte) 1;
                            if (f1n0Var.c(dwn0Var, null, this) == rih1Var) {
                                return rih1Var;
                            }
                        }
                    } else {
                        if (!u890.j(az40Var, yy40.a)) {
                            eg.o();
                            return null;
                        }
                        Set set2 = s4b1.f;
                        strZ = uic.C(bz40Var.a, (String) null).z();
                        if (strZ != null) {
                            joo jooVar = (joo) ptVar.h;
                            this.d = bz40Var;
                            this.e = null;
                            this.f = tqwVar;
                            this.c = strZ;
                            this.b = (byte) 2;
                            objA = jooVar.a(this);
                            if (objA == rih1Var) {
                                return rih1Var;
                            }
                            String str = strZ;
                            mfm mfmVarA = ((i4q) ptVar.i).a((lik1) ptVar.d);
                            m441 m441Var = new m441(new xoh1((e8i1) ptVar.g, new z7i1(str, bz40Var.a, bz40Var.d, bz40Var.b, (String) objA), (lnm) null, (byte) 2));
                            AtomicReferenceArray atomicReferenceArray = p6r0.e;
                            mfm.d(mfmVarA, m441Var, yon1.d1(), new bjm(6, str, (String) null), tqwVar != null ? n3o1.y(tqwVar) : null, 16);
                        }
                    }
                } else if (b2 == 1) {
                    hm5.M(obj);
                } else {
                    if (b2 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    strZ = (String) this.c;
                    hm5.M(obj);
                    objA = obj;
                    String str2 = strZ;
                    mfm mfmVarA2 = ((i4q) ptVar.i).a((lik1) ptVar.d);
                    m441 m441Var2 = new m441(new xoh1((e8i1) ptVar.g, new z7i1(str2, bz40Var.a, bz40Var.d, bz40Var.b, (String) objA), (lnm) null, (byte) 2));
                    AtomicReferenceArray atomicReferenceArray2 = p6r0.e;
                    mfm.d(mfmVarA2, m441Var2, yon1.d1(), new bjm(6, str2, (String) null), tqwVar != null ? n3o1.y(tqwVar) : null, 16);
                }
                return rih1Var2;
            case 1:
                v061 v061Var = v061.b;
                jqf0 jqf0Var = (jqf0) this.e;
                rzq rzqVar = jqf0Var.e;
                iqf0 iqf0Var = (iqf0) this.c;
                fqf0 fqf0Var = (gqf0) this.d;
                byte b3 = this.b;
                if (b3 != 0) {
                    if (b3 == 1 || b3 == 2 || b3 == 3 || b3 == 4) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (fqf0Var instanceof fqf0) {
                    kjk kjkVar = jqf0Var.a;
                    String str3 = fqf0Var.a;
                    kjkVar.invoke(str3);
                    y441 y441Var = jqf0Var.f;
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 1;
                    y441Var.r(1, str3);
                    if (rih1Var2 == rih1Var) {
                        return rih1Var;
                    }
                } else if (fqf0Var instanceof eqf0) {
                    myb1 myb1Var = new myb1("MESSAGING_LYRICS");
                    jyb1 jyb1Var = new jyb1(((eqf0) fqf0Var).a);
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 2;
                    if (d0r.d(rzqVar, v061Var, myb1Var, jyb1Var, this) == rih1Var) {
                        return rih1Var;
                    }
                } else if (fqf0Var instanceof bqf0) {
                    String str4 = ((bqf0) fqf0Var).a;
                    boolean z = str4.length() >= 3;
                    boolean z2 = str4.length() == 0 && iqf0Var.d;
                    if (z || z2) {
                        ((iu30) obj2).invoke(iqf0.a(iqf0Var, false, (List) null, (ArrayList) null, z, false, 23));
                        myb1 myb1Var2 = new myb1("MESSAGING_LYRICS");
                        kyb1 kyb1Var = new kyb1(str4);
                        this.c = null;
                        this.d = null;
                        this.b = (byte) 3;
                        if (d0r.d(rzqVar, v061Var, myb1Var2, kyb1Var, this) == rih1Var) {
                            return rih1Var;
                        }
                    }
                } else if (fqf0Var instanceof aqf0) {
                    myb1 myb1Var3 = new myb1("MESSAGING_LYRICS");
                    this.c = null;
                    this.d = null;
                    this.b = (byte) 4;
                    if (d0r.d(rzqVar, v061Var, myb1Var3, iyb1.a, this) == rih1Var) {
                        return rih1Var;
                    }
                } else if (!(fqf0Var instanceof dqf0) && !(fqf0Var instanceof cqf0)) {
                    eg.o();
                    return null;
                }
                return rih1Var2;
            case 2:
                ven0 ven0Var = (ven0) this.e;
                ven0 ven0Var2 = (ven0) obj2;
                pt ptVar2 = (pt) this.d;
                drj0 drj0Var = (drj0) ptVar2.i;
                Context context = (Context) ptVar2.h;
                imp0 imp0Var = (imp0) this.c;
                tqw tqwVar2 = (tqw) this.f;
                byte b4 = this.b;
                if (b4 != 0) {
                    if (b4 == 1 || b4 == 2) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!(imp0Var instanceof imp0)) {
                    eg.o();
                    return null;
                }
                if (((kmp0) ven0Var.getValue()).b) {
                    if (((jmp0) ven0Var2.getValue()).j) {
                        ((gmt) ptVar2.e).o(drj0Var.h(((jmp0) ven0Var2.getValue()).a), true);
                    }
                    bnj0 bnj0Var = (bnj0) ptVar2.f;
                    jmp0 jmp0Var = (jmp0) ven0Var2.getValue();
                    tv80 tv80VarD = cvl1.d(tqwVar2);
                    this.c = null;
                    this.f = null;
                    this.b = (byte) 1;
                    Object objA2 = ((wh71) bnj0Var.b).a(new mmt(new ukt(jmp0Var.a, ((drj0) bnj0Var.c).h(jmp0Var.a).b(), tv80VarD.a), jmp0Var.e.b), this);
                    if (objA2 != rih1Var) {
                        objA2 = rih1Var2;
                    }
                    if (objA2 == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    g471 g471VarH = drj0Var.h(((kmp0) ven0Var.getValue()).a);
                    wh71 wh71Var = (wh71) ptVar2.g;
                    nmt nmtVar = new nmt(new ne71(context.getString(2131962287, context.getString(g471VarH.e())), context.getString(2131962286), context.getString(2131962280)), g471VarH, cvl1.d(tqwVar2));
                    this.c = null;
                    this.f = null;
                    this.b = (byte) 2;
                    if (wh71Var.a(nmtVar, this) == rih1Var) {
                        return rih1Var;
                    }
                }
                return rih1Var2;
            case 3:
                yjt0 yjt0Var = (yjt0) this.c;
                qjt0 qjt0Var = (qjt0) this.d;
                tqw tqwVar3 = (tqw) this.f;
                byte b5 = this.b;
                if (b5 != 0) {
                    if (b5 == 1 || b5 == 2) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (qjt0Var == null) {
                    eg.o();
                    return null;
                }
                tv80 tv80VarY2 = tqwVar3 != null ? n3o1.y(tqwVar3) : null;
                boolean z3 = yjt0Var.b instanceof vjt0;
                ckt0 ckt0Var = (ckt0) this.e;
                xjt0 xjt0Var = (xjt0) obj2;
                if (z3) {
                    String str5 = qjt0Var.a;
                    this.c = null;
                    this.d = null;
                    this.f = null;
                    this.b = (byte) 1;
                    if (ckt0Var.g(xjt0Var, yjt0Var, tv80VarY2, str5, this) == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    String str6 = qjt0Var.a;
                    this.c = null;
                    this.d = null;
                    this.f = null;
                    this.b = (byte) 2;
                    if (ckt0Var.f(xjt0Var, yjt0Var, tv80VarY2, str6, this) == rih1Var) {
                        return rih1Var;
                    }
                }
                return rih1Var2;
            case 4:
                pey0 pey0Var = (pey0) this.c;
                f700 f700Var = (f700) this.d;
                tqw tqwVar4 = (tqw) this.f;
                byte b6 = this.b;
                if (b6 != 0) {
                    if (b6 == 1 || b6 == 2) {
                        hm5.M(obj);
                        return rih1Var2;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (u890.j(f700Var, cxz.a)) {
                    ix7 ix7Var = (ix7) this.e;
                    this.c = null;
                    this.d = null;
                    this.f = null;
                    this.b = (byte) 1;
                    bpb1 bpb1Var = ((h3b) ix7Var.b).a;
                    Boolean bool = Boolean.TRUE;
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, bool);
                    Object objS = smo1.s(new hb1((m911) ix7Var.c, (String) ix7Var.d, null, (byte) 26), this);
                    if (objS != rih1Var) {
                        objS = rih1Var2;
                    }
                    if (objS == rih1Var) {
                        return rih1Var;
                    }
                } else {
                    if (!u890.j(f700Var, sxz.a)) {
                        eg.o();
                        return null;
                    }
                    f3b f3bVar = (f3b) obj2;
                    String str7 = pey0Var.e;
                    this.c = null;
                    this.d = null;
                    this.f = null;
                    this.b = (byte) 2;
                    f3bVar.getClass();
                    tv80 tv80VarY3 = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                    f3bVar.a.f(new dwn0(str7, "", false, false, 0, 0, false, (a690) null, (Bundle) null, tv80VarY3 != null ? new bwn0(tv80VarY3) : null));
                    if (rih1Var2 == rih1Var) {
                        return rih1Var;
                    }
                }
                return rih1Var2;
            case 5:
                wf21 wf21Var = (wf21) obj2;
                List list = wf21Var.c;
                ven0 ven0Var3 = (ven0) this.d;
                zf21 zf21Var = (zf21) this.e;
                uf21 uf21Var = (vf21) this.c;
                tqw tqwVar5 = (tqw) this.f;
                byte b7 = this.b;
                if (b7 == 0) {
                    hm5.M(obj);
                    if (uf21Var instanceof uf21) {
                        ven0Var3.setValue(Boolean.valueOf(uf21Var.a));
                    } else {
                        if (!u890.j(uf21Var, tf21.a)) {
                            eg.o();
                            return null;
                        }
                        String str8 = (tqwVar5 == null || (ou80Var = n3o1.y(tqwVar5).a) == null) ? null : ou80Var.a;
                        this.c = null;
                        this.f = null;
                        this.b = (byte) 1;
                        if (zf21Var.e(wf21Var, str8, this) == rih1Var) {
                            return rih1Var;
                        }
                        if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                            this.c = null;
                            this.f = null;
                            this.b = (byte) 2;
                            if (list.isEmpty()) {
                                objD = rih1Var2;
                            } else {
                                objD = rih1Var2;
                            }
                            if (objD == rih1Var) {
                                return rih1Var;
                            }
                        }
                    }
                    return rih1Var2;
                }
                if (b7 == 1) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var3.getValue()).booleanValue()) {
                        this.c = null;
                        this.f = null;
                        this.b = (byte) 2;
                        if (list.isEmpty() || (objD = d0r.d(zf21Var.d, hjx0Var, wf21Var.a, new tz(list), this)) != rih1Var) {
                            objD = rih1Var2;
                        }
                        if (objD == rih1Var) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (b7 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                zf21Var.b.dismiss();
                return rih1Var2;
            default:
                z491 z491Var = (z491) obj2;
                List list2 = z491Var.c;
                ven0 ven0Var4 = (ven0) this.d;
                c591 c591Var = (c591) this.e;
                x491 x491Var = (y491) this.c;
                tqw tqwVar6 = (tqw) this.f;
                byte b8 = this.b;
                if (b8 == 0) {
                    hm5.M(obj);
                    if (x491Var instanceof x491) {
                        ven0Var4.setValue(Boolean.valueOf(x491Var.a));
                    } else {
                        if (!u890.j(x491Var, w491.a)) {
                            eg.o();
                            return null;
                        }
                        String str9 = (tqwVar6 == null || (ou80Var2 = n3o1.y(tqwVar6).a) == null) ? null : ou80Var2.a;
                        this.c = null;
                        this.f = null;
                        this.b = (byte) 1;
                        if (c591Var.e(z491Var, str9, this) == rih1Var) {
                            return rih1Var;
                        }
                        if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                            this.c = null;
                            this.f = null;
                            this.b = (byte) 2;
                            if (list2.isEmpty()) {
                                objD2 = rih1Var2;
                            } else {
                                objD2 = rih1Var2;
                            }
                            if (objD2 == rih1Var) {
                                return rih1Var;
                            }
                        }
                    }
                    return rih1Var2;
                }
                if (b8 == 1) {
                    hm5.M(obj);
                    if (((Boolean) ven0Var4.getValue()).booleanValue()) {
                        this.c = null;
                        this.f = null;
                        this.b = (byte) 2;
                        if (list2.isEmpty() || (objD2 = d0r.d(c591Var.d, hjx0Var, z491Var.a, new sz(list2), this)) != rih1Var) {
                            objD2 = rih1Var2;
                        }
                        if (objD2 == rih1Var) {
                            return rih1Var;
                        }
                    }
                } else {
                    if (b8 != 2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                c591Var.b.dismiss();
                return rih1Var2;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz40(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.e = obj;
        this.g = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cz40(pt ptVar, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 0;
        this.g = ptVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cz40(Object obj, Object obj2, Object obj3, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.g = obj3;
    }
}
