package p;

import android.content.Context;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o6q0 extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public byte b;
    public /* synthetic */ tqw c;
    public final /* synthetic */ Object d;
    public /* synthetic */ Object e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6q0(rsu0 rsu0Var, csu0 csu0Var, jjm0 jjm0Var, ven0 ven0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 1;
        this.f = rsu0Var;
        this.g = csu0Var;
        this.h = jjm0Var;
        this.d = ven0Var;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.d;
        Object obj6 = this.h;
        Object obj7 = this.g;
        switch (b) {
            case 0:
                o6q0 o6q0Var = new o6q0((xpw) obj7, obj5, obj6, (lnm) obj4, (byte) 0);
                o6q0Var.e = (m6q0) obj;
                o6q0Var.f = (k6q0) obj2;
                o6q0Var.c = (tqw) obj3;
                return o6q0Var.invokeSuspend(rih1Var);
            case 1:
                o6q0 o6q0Var2 = new o6q0((rsu0) this.f, (csu0) obj7, (jjm0) obj6, (ven0) obj5, (lnm) obj4);
                o6q0Var2.e = (vru0) obj2;
                o6q0Var2.c = (tqw) obj3;
                return o6q0Var2.invokeSuspend(rih1Var);
            case 2:
                o6q0 o6q0Var3 = new o6q0((xpw) obj7, obj5, obj6, (lnm) obj4, (byte) 2);
                o6q0Var3.e = (hn61) obj;
                o6q0Var3.f = (fn61) obj2;
                o6q0Var3.c = (tqw) obj3;
                return o6q0Var3.invokeSuspend(rih1Var);
            default:
                o6q0 o6q0Var4 = new o6q0((ysd1) obj7, (psd1) obj6, (ven0) obj5, (lnm) obj4);
                o6q0Var4.e = (tsd1) obj;
                o6q0Var4.f = (osd1) obj2;
                o6q0Var4.c = (tqw) obj3;
                return o6q0Var4.invokeSuspend(rih1Var);
        }
    }

    /* JADX WARN: Code duplicated, block: B:150:0x026c  */
    /* JADX WARN: Code duplicated, block: B:167:0x02b0  */
    /* JADX WARN: Code duplicated, block: B:279:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:280:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:41:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:44:0x00bc  */
    public final Object invokeSuspend(Object obj) {
        String str;
        String string;
        t6q0 s6q0Var;
        m231 m231Var;
        m231 m231Var2;
        Throwable thA;
        Throwable thA2;
        Object objF;
        wsd1 wsd1Var;
        wsd1 wsd1Var2;
        byte b = this.a;
        Object obj2 = this.h;
        d9n d9nVar = d9n.a;
        Object obj3 = this.g;
        Object obj4 = this.d;
        m231 m231Var3 = rih1.a;
        switch (b) {
            case 0:
                ven0 ven0Var = (ven0) obj2;
                rwj rwjVar = (rwj) obj3;
                wh71 wh71Var = (wh71) rwjVar.g;
                Context context = (Context) rwjVar.d;
                m6q0 m6q0Var = (m6q0) this.e;
                k6q0 k6q0Var = (k6q0) this.f;
                tqw tqwVar = this.c;
                byte b2 = this.b;
                if (b2 != 0) {
                    if (b2 == 1 || b2 == 2 || b2 == 3 || b2 == 4) {
                        hm5.M(obj);
                        return m231Var3;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                if (!u890.j(k6q0Var, k6q0.a)) {
                    eg.o();
                    return null;
                }
                y5q0 y5q0Var = m6q0Var.a;
                if (y5q0Var.a() instanceof gnt) {
                    tv80 tv80VarY = tqwVar != null ? n3o1.y(tqwVar) : null;
                    if (tv80VarY != null) {
                        jkp0 jkp0Var = (jkp0) rwjVar.e;
                        l6q0 l6q0Var = (l6q0) ((ven0) obj4).getValue();
                        this.e = null;
                        this.f = null;
                        this.c = null;
                        this.b = (byte) 1;
                        wh71 wh71Var2 = (wh71) jkp0Var.b;
                        o571 o571VarG = l6q0Var.a.g();
                        y5q0 y5q0Var2 = l6q0Var.a;
                        s4b1 s4b1Var = y5q0Var2.b().a;
                        ou80 ou80Var = tv80VarY.a;
                        if (y5q0Var2 instanceof y5q0) {
                            u7q0 u7q0Var = y5q0Var2.a;
                            s6q0Var = new t6q0(u7q0Var.b, u7q0Var.c);
                        } else if (y5q0Var2 instanceof w5q0) {
                            c380 c380Var = ((w5q0) y5q0Var2).a;
                            ArrayList arrayList = new ArrayList(q7h.U(c380Var, 10));
                            Iterator it = c380Var.iterator();
                            while (it.hasNext()) {
                                arrayList.add(((u7q0) it.next()).b);
                            }
                            s6q0Var = new s6q0(arrayList);
                        } else if ((y5q0Var2 instanceof x5q0) || (y5q0Var2 instanceof v5q0) || (y5q0Var2 instanceof z5q0)) {
                            s6q0Var = null;
                        } else {
                            eg.o();
                        }
                        Object objA = wh71Var2.a(new mmt(new vkt(o571VarG, s4b1Var, ou80Var, s6q0Var), l6q0Var.b.b), this);
                        if (objA != d9nVar) {
                            objA = m231Var3;
                        }
                        if (objA == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        hhg1.n("Required value was null.");
                    }
                    return null;
                }
                if (u890.j(y5q0Var.a(), hnt.a)) {
                    String string2 = y5q0Var instanceof x5q0 ? context.getString(2131962289) : context.getString(2131962288, h7w.A(y5q0Var, context));
                    string2.getClass();
                    nmt nmtVar = new nmt(new ne71(string2, context.getString(2131962286), context.getString(2131962280)), fjb.i(((m6q0) ven0Var.getValue()).a.g(), ((m6q0) ven0Var.getValue()).a.b().a), tqwVar != null ? n3o1.y(tqwVar) : null);
                    this.e = null;
                    this.f = null;
                    this.c = null;
                    this.b = (byte) 2;
                    if (wh71Var.a(nmtVar, this) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    boolean z = y5q0Var instanceof y5q0;
                    if (z && y5q0Var.e) {
                        nmt nmtVar2 = new nmt(new ne71(context.getString(2131962284, y5q0Var.a.c), context.getString(2131962285), context.getString(2131962280)), fjb.i(((m6q0) ven0Var.getValue()).a.g(), ((m6q0) ven0Var.getValue()).a.b().a), tqwVar != null ? n3o1.y(tqwVar) : null);
                        this.e = null;
                        this.f = null;
                        this.c = null;
                        this.b = (byte) 3;
                        if (wh71Var.a(nmtVar2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (z) {
                            str = y5q0Var.a.c;
                        } else {
                            str = y5q0Var instanceof w5q0 ? ((w5q0) y5q0Var).b : null;
                        }
                        fkn fknVarI = fjb.i(((m6q0) ven0Var.getValue()).a.g(), ((m6q0) ven0Var.getValue()).a.b().a);
                        tv80 tv80VarY2 = tqwVar != null ? n3o1.y(tqwVar) : null;
                        String string3 = context.getString(2131962281);
                        if (str == null || (string = context.getString(2131962283, str)) == null) {
                            string = context.getString(2131962282);
                        }
                        nmt nmtVar3 = new nmt(new ne71(string3, string, context.getString(2131962280)), fknVarI, tv80VarY2);
                        this.e = null;
                        this.f = null;
                        this.c = null;
                        this.b = (byte) 4;
                        if (wh71Var.a(nmtVar3, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                }
                return m231Var3;
            case 1:
                ven0 ven0Var2 = (ven0) obj4;
                String str2 = ((csu0) obj3).a;
                rsu0 rsu0Var = (rsu0) this.f;
                vru0 vru0Var = (vru0) this.e;
                tqw tqwVar2 = this.c;
                byte b3 = this.b;
                try {
                    try {
                        if (b3 == 0) {
                            hm5.M(obj);
                            if ((vru0Var instanceof qru0) || (vru0Var instanceof mru0)) {
                                d0r d0rVarE = rsu0Var.e();
                                v061 v061Var = v061.a;
                                this.e = null;
                                this.c = null;
                                this.b = (byte) 1;
                                if (d0r.d(d0rVarE, v061Var, str2, t061.a, this) == d9nVar) {
                                    return d9nVar;
                                }
                            } else if (vru0Var instanceof kru0) {
                                this.e = null;
                                this.c = null;
                                this.b = (byte) 2;
                                int i = rsu0.P0;
                                if (rsu0Var.p(str2, this, false) == d9nVar) {
                                    return d9nVar;
                                }
                                m231Var2 = m231Var3;
                                thA = e331.a(m231Var2);
                                if (thA != null) {
                                    Logger.e(thA, "Failed to add to profile", new Object[0]);
                                    int i2 = rsu0.P0;
                                    rsu0Var.s();
                                }
                            } else if (vru0Var instanceof rru0) {
                                ven0Var2.setValue(Boolean.TRUE);
                            } else if (vru0Var instanceof nru0) {
                                ven0Var2.setValue(Boolean.FALSE);
                            } else if (vru0Var instanceof oru0) {
                                this.e = null;
                                this.c = null;
                                this.b = (byte) 3;
                                int i3 = rsu0.P0;
                                if (rsu0Var.p(str2, this, true) == d9nVar) {
                                    return d9nVar;
                                }
                                m231Var = m231Var3;
                                thA2 = e331.a(m231Var);
                                if (thA2 != null) {
                                    Logger.e(thA2, "Failed to make public and add to profile", new Object[0]);
                                    int i4 = rsu0.P0;
                                    rsu0Var.s();
                                }
                            } else {
                                if (!(vru0Var instanceof lru0)) {
                                    eg.o();
                                    return null;
                                }
                                lik1 viewUri = rsu0Var.e.getViewUri();
                                eoc0 eoc0Var = new eoc0(str2, viewUri, mno1.O);
                                if (!rsu0Var.t) {
                                    mfm mfmVarA = rsu0Var.h.a(viewUri);
                                    tv80 tv80VarY3 = tqwVar2 != null ? n3o1.y(tqwVar2) : null;
                                    Observable observableA = rsu0Var.g.a(eoc0Var);
                                    AtomicReferenceArray atomicReferenceArray = p6r0.e;
                                    mfm.b(mfmVarA, observableA, yon1.a1(), (bjm) null, tv80VarY3, 20);
                                } else if (tqwVar2 != null) {
                                    rsu0Var.i.a(eoc0Var, n3o1.y(tqwVar2));
                                }
                            }
                        } else if (b3 == 1) {
                            hm5.M(obj);
                        } else if (b3 == 2) {
                            hm5.M(obj);
                            m231Var2 = m231Var3;
                            thA = e331.a(m231Var2);
                            if (thA != null) {
                                Logger.e(thA, "Failed to add to profile", new Object[0]);
                                int i5 = rsu0.P0;
                                rsu0Var.s();
                            }
                        } else {
                            if (b3 != 3) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            m231Var = m231Var3;
                            thA2 = e331.a(m231Var);
                            if (thA2 != null) {
                                Logger.e(thA2, "Failed to make public and add to profile", new Object[0]);
                                int i6 = rsu0.P0;
                                rsu0Var.s();
                            }
                        }
                    } catch (Throwable th) {
                        m231Var2 = new m231(th);
                    }
                } catch (Throwable th2) {
                    m231Var = new m231(th2);
                }
                return m231Var3;
            case 2:
                jn61 jn61Var = (jn61) obj3;
                gn61 gn61Var = (gn61) obj4;
                vm61 vm61Var = gn61Var.d;
                Function0 function0 = gn61Var.e;
                hn61 hn61Var = (hn61) this.e;
                en61 en61Var = (fn61) this.f;
                tqw tqwVar3 = this.c;
                byte b4 = this.b;
                try {
                    try {
                        if (b4 == 0) {
                            hm5.M(obj);
                            idd1 idd1Var = new idd1(new l451(tqwVar3, (byte) 20));
                            if (en61Var instanceof cn61) {
                                if (u890.j(hn61Var.h, Boolean.TRUE)) {
                                    jn61Var.e(gn61Var);
                                }
                                bn61 bn61Var = new bn61();
                                if (vm61Var instanceof vm61) {
                                    xu30 xu30Var = vm61Var.d;
                                    tv80 tv80Var = (tv80) idd1Var.getValue();
                                    this.e = null;
                                    this.f = null;
                                    this.c = null;
                                    this.b = (byte) 1;
                                    if (xu30Var.invoke(bn61Var, tv80Var, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                } else if (vm61Var instanceof zm61) {
                                    xu30 xu30Var2 = ((zm61) vm61Var).f;
                                    tv80 tv80Var2 = (tv80) idd1Var.getValue();
                                    this.e = null;
                                    this.f = null;
                                    this.c = null;
                                    this.b = (byte) 2;
                                    if (xu30Var2.invoke(bn61Var, tv80Var2, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                } else {
                                    if (!(vm61Var instanceof xm61)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    xu30 xu30Var3 = ((xm61) vm61Var).i;
                                    tv80 tv80Var3 = (tv80) idd1Var.getValue();
                                    this.e = null;
                                    this.f = null;
                                    this.c = null;
                                    this.b = (byte) 3;
                                    if (xu30Var3.invoke(bn61Var, tv80Var3, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                                function0.invoke();
                            } else if (en61Var instanceof dn61) {
                                if (u890.j(hn61Var.h, Boolean.TRUE)) {
                                    jn61Var.e(gn61Var);
                                }
                                bn61 bn61Var2 = new bn61();
                                if (!(vm61Var instanceof vm61) && !(vm61Var instanceof zm61)) {
                                    if (!(vm61Var instanceof xm61)) {
                                        throw new NoWhenBranchMatchedException();
                                    }
                                    xu30 xu30Var4 = ((xm61) vm61Var).j;
                                    tv80 tv80Var4 = (tv80) idd1Var.getValue();
                                    this.e = null;
                                    this.f = null;
                                    this.c = null;
                                    this.b = (byte) 4;
                                    if (xu30Var4.invoke(bn61Var2, tv80Var4, this) == d9nVar) {
                                        return d9nVar;
                                    }
                                }
                                function0.invoke();
                            } else {
                                if (!(en61Var instanceof en61)) {
                                    eg.o();
                                    return null;
                                }
                                ((iu30) obj2).invoke(hn61.a(hn61Var, Boolean.valueOf(en61Var.a)));
                            }
                        } else if (b4 == 1 || b4 == 2 || b4 == 3) {
                            hm5.M(obj);
                            function0.invoke();
                        } else {
                            if (b4 != 4) {
                                eg.m("call to 'resume' before 'invoke' with coroutine");
                                return null;
                            }
                            hm5.M(obj);
                            function0.invoke();
                        }
                        return m231Var3;
                    } catch (Throwable th3) {
                        function0.invoke();
                        throw th3;
                    }
                } catch (Throwable th4) {
                    function0.invoke();
                    throw th4;
                }
            default:
                ven0 ven0Var3 = (ven0) obj4;
                psd1 psd1Var = (psd1) obj2;
                ysd1 ysd1Var = (ysd1) obj3;
                q8n q8nVar = ysd1Var.g;
                tsd1 tsd1Var = (tsd1) this.e;
                osd1 osd1Var = (osd1) this.f;
                tqw tqwVar4 = this.c;
                byte b5 = this.b;
                if (b5 == 0) {
                    hm5.M(obj);
                    tv80 tv80VarY4 = tqwVar4 != null ? n3o1.y(tqwVar4) : null;
                    if (osd1Var instanceof nsd1) {
                        pcf.a(ysd1Var.b, ((nsd1) osd1Var).a, tv80VarY4, (Bundle) null);
                    } else if (osd1Var instanceof msd1) {
                        ysd1Var.c.a(((msd1) osd1Var).a, psd1Var.b, tv80VarY4);
                    } else {
                        if (!u890.j(osd1Var, lsd1.a)) {
                            eg.o();
                            return null;
                        }
                        qsd1 qsd1Var = tsd1Var instanceof qsd1 ? (qsd1) tsd1Var : null;
                        if (qsd1Var != null && qsd1Var.b && !qsd1Var.c) {
                            ven0Var3.setValue(Boolean.TRUE);
                            this.e = null;
                            this.f = null;
                            this.c = null;
                            this.b = (byte) 1;
                            o3r o3rVar = ysd1.Z;
                            objF = ysd1Var.f(psd1Var, this);
                            if (objF == d9nVar) {
                                return d9nVar;
                            }
                            if (((Boolean) objF).booleanValue()) {
                                wsd1Var2 = new wsd1(ysd1Var, (lnm) null, (byte) 0);
                                this.e = null;
                                this.f = null;
                                this.c = null;
                                this.b = (byte) 2;
                                if (fn31.Y(q8nVar, wsd1Var2, this) == d9nVar) {
                                    return d9nVar;
                                }
                            } else {
                                ven0Var3.setValue(Boolean.FALSE);
                                wsd1Var = new wsd1(ysd1Var, (lnm) null, (byte) 1);
                                this.e = null;
                                this.f = null;
                                this.c = null;
                                this.b = (byte) 3;
                                if (fn31.Y(q8nVar, wsd1Var, this) == d9nVar) {
                                    return d9nVar;
                                }
                            }
                        }
                    }
                } else if (b5 == 1) {
                    hm5.M(obj);
                    objF = obj;
                    if (((Boolean) objF).booleanValue()) {
                        wsd1Var2 = new wsd1(ysd1Var, (lnm) null, (byte) 0);
                        this.e = null;
                        this.f = null;
                        this.c = null;
                        this.b = (byte) 2;
                        if (fn31.Y(q8nVar, wsd1Var2, this) == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        ven0Var3.setValue(Boolean.FALSE);
                        wsd1Var = new wsd1(ysd1Var, (lnm) null, (byte) 1);
                        this.e = null;
                        this.f = null;
                        this.c = null;
                        this.b = (byte) 3;
                        if (fn31.Y(q8nVar, wsd1Var, this) == d9nVar) {
                            return d9nVar;
                        }
                    }
                } else {
                    if (b5 != 2 && b5 != 3) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
                return m231Var3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o6q0(xpw xpwVar, Object obj, Object obj2, lnm lnmVar, byte b) {
        super(4, lnmVar);
        this.a = b;
        this.g = xpwVar;
        this.d = obj;
        this.h = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o6q0(ysd1 ysd1Var, psd1 psd1Var, ven0 ven0Var, lnm lnmVar) {
        super(4, lnmVar);
        this.a = (byte) 3;
        this.g = ysd1Var;
        this.h = psd1Var;
        this.d = ven0Var;
    }
}
