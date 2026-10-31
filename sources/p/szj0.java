package p;

import com.spotify.mobius.coroutines.CoroutinesSubtypeEffectHandlerBuilder;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class szj0 implements CoroutinesSubtypeEffectHandlerBuilder.EffectHandler {
    public final /* synthetic */ xzj0 a;

    public szj0(xzj0 xzj0Var) {
        this.a = xzj0Var;
    }

    /* JADX WARN: Code duplicated, block: B:104:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:111:0x020b  */
    /* JADX WARN: Code duplicated, block: B:113:0x0213  */
    /* JADX WARN: Code duplicated, block: B:114:0x021b  */
    /* JADX WARN: Code duplicated, block: B:117:0x0222  */
    /* JADX WARN: Code duplicated, block: B:119:0x022e  */
    /* JADX WARN: Code duplicated, block: B:120:0x023a  */
    /* JADX WARN: Code duplicated, block: B:136:0x023d A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:137:0x0202 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:138:? A[LOOP:1: B:105:0x01ee->B:138:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Object obj, r261 r261Var, onm onmVar) {
        rzj0 rzj0Var;
        Object b3k0Var;
        wj60 wj60VarA;
        jyj0 jyj0Var;
        ArrayDeque arrayDeque;
        Iterator it;
        a3k0 a3k0Var;
        wj60 wj60Var;
        wj60 wj60Var2;
        lyj0 lyj0VarC;
        lyj0 lyj0VarG;
        if (onmVar instanceof rzj0) {
            rzj0Var = (rzj0) onmVar;
            int i = rzj0Var.b;
            if ((i & Integer.MIN_VALUE) != 0) {
                rzj0Var.b = i - Integer.MIN_VALUE;
            } else {
                rzj0Var = new rzj0(this, onmVar);
            }
        } else {
            rzj0Var = new rzj0(this, onmVar);
        }
        Object obj2 = rzj0Var.a;
        int i2 = rzj0Var.b;
        jyj0 jyj0Var2 = null;
        j7k0VarI = null;
        j7k0VarI = null;
        j7k0 j7k0VarI = null;
        j7k0VarI = null;
        j7k0VarI = null;
        j7k0 j7k0VarI2 = null;
        if (i2 == 0) {
            hm5.M(obj2);
            bnj0 bnj0Var = this.a.j;
            oyj0 oyj0Var = (oyj0) bnj0Var.b;
            i7k0 i7k0Var = ((h1k0) obj).a;
            if (i7k0Var instanceof d7k0) {
                d7k0 d7k0Var = (d7k0) i7k0Var;
                a7k0 a7k0Var = d7k0Var.a;
                a7k0 a7k0Var2 = d7k0Var.b;
                woo wooVar = d7k0Var.c;
                kyj0 kyj0Var = oyj0Var.b;
                if (kyj0Var.a == 0) {
                    lyj0VarG = kyj0Var.c();
                } else {
                    kyj0Var.a();
                    lyj0VarG = kyj0Var.g(a7k0Var, a7k0Var2, wooVar);
                }
                b3k0Var = new b3k0(lyj0VarG);
            } else if (i7k0Var instanceof g7k0) {
                g7k0 g7k0Var = (g7k0) i7k0Var;
                a7k0 a7k0Var3 = g7k0Var.a;
                a7k0 a7k0Var4 = g7k0Var.b;
                kyj0 kyj0Var2 = oyj0Var.b;
                if (kyj0Var2.a != 0) {
                    jyj0 jyj0Var3 = kyj0Var2.h;
                    kyj0Var2.h = jyj0Var3 != null ? new jyj0(jyj0Var3.a, a7k0Var4) : new jyj0(a7k0Var3, a7k0Var4);
                }
                b3k0Var = new b3k0(kyj0Var2.c());
            } else if (i7k0Var.equals(b7k0.a)) {
                kyj0 kyj0Var3 = oyj0Var.b;
                if (kyj0Var3.a == 0) {
                    lyj0VarC = kyj0Var3.c();
                } else {
                    kyj0Var3.a();
                    lyj0VarC = kyj0Var3.c();
                }
                b3k0Var = new b3k0(lyj0VarC);
            } else if (i7k0Var instanceof f7k0) {
                f7k0 f7k0Var = (f7k0) i7k0Var;
                a7k0 a7k0Var5 = f7k0Var.a;
                kyj0 kyj0Var4 = oyj0Var.b;
                LinkedHashMap linkedHashMap = kyj0Var4.f;
                kyj0Var4.a();
                wj60 wj60Var3 = kyj0Var4.g;
                if (wj60Var3 != null) {
                    d0k0 d0k0Var = wj60Var3.b;
                    Object obj3 = linkedHashMap.get(wj60Var3.c);
                    if (obj3 == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    if (v1p1.l(new a7k0(d0k0Var, (ilk0) obj3), a7k0Var5) && (wj60Var2 = (wj60) kyj0Var4.c.pollLast()) != null) {
                        wj60 wj60Var4 = kyj0Var4.g;
                        if (wj60Var4 == null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        long j = wj60Var4.a;
                        ilk0 ilk0Var = a7k0Var5.b;
                        linkedHashMap.put(ilk0Var.a, ilk0Var);
                        kyj0Var4.d.addLast(kyj0.h(a7k0Var5, j));
                        kyj0Var4.g = wj60Var2;
                        j7k0VarI = kyj0Var4.i(wj60Var2);
                    }
                }
                if (j7k0VarI != null) {
                    a3k0Var = new a3k0(bnj0Var.y(j7k0VarI), f7k0Var.b);
                    b3k0Var = a3k0Var;
                } else {
                    b3k0Var = new b3k0(oyj0Var.b.c());
                }
            } else if (i7k0Var instanceof e7k0) {
                e7k0 e7k0Var = (e7k0) i7k0Var;
                a7k0 a7k0Var6 = e7k0Var.a;
                kyj0 kyj0Var5 = oyj0Var.b;
                LinkedHashMap linkedHashMap2 = kyj0Var5.f;
                kyj0Var5.a();
                wj60 wj60Var5 = kyj0Var5.g;
                if (wj60Var5 != null) {
                    d0k0 d0k0Var2 = wj60Var5.b;
                    Object obj4 = linkedHashMap2.get(wj60Var5.c);
                    if (obj4 == null) {
                        eg.m("Required value was null.");
                        return null;
                    }
                    if (v1p1.l(new a7k0(d0k0Var2, (ilk0) obj4), a7k0Var6) && (wj60Var = (wj60) kyj0Var5.d.pollLast()) != null) {
                        wj60 wj60Var6 = kyj0Var5.g;
                        if (wj60Var6 == null) {
                            eg.m("Required value was null.");
                            return null;
                        }
                        long j2 = wj60Var6.a;
                        ilk0 ilk0Var2 = a7k0Var6.b;
                        linkedHashMap2.put(ilk0Var2.a, ilk0Var2);
                        kyj0Var5.c.addLast(kyj0.h(a7k0Var6, j2));
                        kyj0Var5.g = wj60Var;
                        j7k0VarI2 = kyj0Var5.i(wj60Var);
                    }
                }
                if (j7k0VarI2 != null) {
                    a3k0Var = new a3k0(bnj0Var.y(j7k0VarI2), e7k0Var.b);
                    b3k0Var = a3k0Var;
                } else {
                    b3k0Var = new b3k0(oyj0Var.b.c());
                }
            } else if (i7k0Var instanceof h7k0) {
                a7k0 a7k0Var7 = ((h7k0) i7k0Var).a;
                kyj0 kyj0Var6 = oyj0Var.b;
                ilk0 ilk0Var3 = a7k0Var7.b;
                ntf1 ntf1Var = ilk0Var3.a;
                if (kyj0Var6.a != 0) {
                    wj60 wj60Var7 = kyj0Var6.g;
                    if (u890.j(wj60Var7 != null ? wj60Var7.c : null, ntf1Var)) {
                        kyj0Var6.f.put(ntf1Var, ilk0Var3);
                        wj60VarA = kyj0Var6.g;
                        if (wj60VarA == null) {
                            wj60VarA = null;
                        } else if (wj60VarA.c.equals(ntf1Var)) {
                            wj60VarA = wj60.a(wj60VarA, a7k0Var7.a, null, 5);
                        }
                        kyj0Var6.g = wj60VarA;
                        jyj0Var = kyj0Var6.h;
                        if (jyj0Var != null) {
                            if (jyj0Var.b.b.a.equals(ntf1Var)) {
                                jyj0Var2 = new jyj0(a7k0.a(jyj0Var.a, ilk0Var3), a7k0Var7);
                            } else {
                                jyj0Var2 = jyj0Var;
                            }
                        }
                        kyj0Var6.h = jyj0Var2;
                    } else {
                        ArrayDeque arrayDeque2 = kyj0Var6.c;
                        if (arrayDeque2.isEmpty()) {
                            arrayDeque = kyj0Var6.d;
                            if (!arrayDeque.isEmpty()) {
                                it = arrayDeque.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        if (((wj60) it.next()).c.equals(ntf1Var)) {
                                            kyj0Var6.f.put(ntf1Var, ilk0Var3);
                                            wj60VarA = kyj0Var6.g;
                                            if (wj60VarA == null) {
                                                wj60VarA = null;
                                            } else if (wj60VarA.c.equals(ntf1Var)) {
                                                wj60VarA = wj60.a(wj60VarA, a7k0Var7.a, null, 5);
                                            }
                                            kyj0Var6.g = wj60VarA;
                                            jyj0Var = kyj0Var6.h;
                                            if (jyj0Var != null) {
                                                if (jyj0Var.b.b.a.equals(ntf1Var)) {
                                                    jyj0Var2 = new jyj0(a7k0.a(jyj0Var.a, ilk0Var3), a7k0Var7);
                                                } else {
                                                    jyj0Var2 = jyj0Var;
                                                }
                                            }
                                            kyj0Var6.h = jyj0Var2;
                                        }
                                    }
                                }
                            }
                        } else {
                            Iterator it2 = arrayDeque2.iterator();
                            while (true) {
                                if (!it2.hasNext()) {
                                    arrayDeque = kyj0Var6.d;
                                    if (!arrayDeque.isEmpty()) {
                                        it = arrayDeque.iterator();
                                        while (true) {
                                            if (!it.hasNext()) {
                                                if (((wj60) it.next()).c.equals(ntf1Var)) {
                                                }
                                            }
                                        }
                                    }
                                } else if (((wj60) it2.next()).c.equals(ntf1Var)) {
                                }
                                kyj0Var6.f.put(ntf1Var, ilk0Var3);
                                wj60VarA = kyj0Var6.g;
                                if (wj60VarA == null) {
                                    wj60VarA = null;
                                } else if (wj60VarA.c.equals(ntf1Var)) {
                                    wj60VarA = wj60.a(wj60VarA, a7k0Var7.a, null, 5);
                                }
                                kyj0Var6.g = wj60VarA;
                                jyj0Var = kyj0Var6.h;
                                if (jyj0Var != null) {
                                    if (jyj0Var.b.b.a.equals(ntf1Var)) {
                                        jyj0Var2 = new jyj0(a7k0.a(jyj0Var.a, ilk0Var3), a7k0Var7);
                                    } else {
                                        jyj0Var2 = jyj0Var;
                                    }
                                }
                                kyj0Var6.h = jyj0Var2;
                            }
                        }
                    }
                }
                b3k0Var = new b3k0(oyj0Var.b.c());
            } else {
                if (!(i7k0Var instanceof c7k0)) {
                    eg.o();
                    return null;
                }
                c7k0 c7k0Var = (c7k0) i7k0Var;
                ntf1 ntf1Var2 = c7k0Var.a;
                a7k0 a7k0Var8 = c7k0Var.b;
                oyj0Var.getClass();
                ntf1 ntf1Var3 = a7k0Var8.b.a;
                oyj0Var.c = new nyj0(ntf1Var3.c, ntf1Var3.d);
                b3k0Var = new b3k0(oyj0Var.b.e(ntf1Var2, a7k0Var8));
            }
            rzj0Var.b = 1;
            Object objB = r261Var.b(b3k0Var, rzj0Var);
            d9n d9nVar = d9n.a;
            if (objB == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(obj2);
        }
        return rih1.a;
    }
}
