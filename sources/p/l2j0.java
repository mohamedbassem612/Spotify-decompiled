package p;

import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class l2j0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    public l2j0(c380 c380Var, tob1 tob1Var, int i, xtb0 xtb0Var, iu30 iu30Var) {
        this.a = (byte) 0;
        this.c = c380Var;
        this.d = tob1Var;
        this.b = i;
        this.e = xtb0Var;
        this.f = iu30Var;
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0073 A[PHI: r10
      0x0073: PHI (r10v5 java.lang.Integer) = (r10v2 java.lang.Integer), (r10v6 java.lang.Integer) binds: [B:32:0x008c, B:27:0x0071] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:49:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object b(h2j0 h2j0Var, lnm lnmVar) {
        k2j0 k2j0Var;
        Integer num;
        f3a ij81Var;
        Object objF;
        iu30 iu30Var;
        if (lnmVar instanceof k2j0) {
            k2j0Var = (k2j0) lnmVar;
            int i = k2j0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                k2j0Var.d = i - Integer.MIN_VALUE;
            } else {
                k2j0Var = new k2j0(this, lnmVar);
            }
        } else {
            k2j0Var = new k2j0(this, lnmVar);
        }
        Object obj = k2j0Var.b;
        int i2 = k2j0Var.d;
        rih1 rih1Var = rih1.a;
        Integer num2 = null;
        if (i2 == 0) {
            hm5.M(obj);
            int i3 = 0;
            if (h2j0Var instanceof g2j0) {
                Iterator it = ((c380) this.c).iterator();
                while (true) {
                    if (!it.hasNext()) {
                        i3 = -1;
                        break;
                    }
                    w1j0 w1j0Var = (a2j0) it.next();
                    if ((w1j0Var instanceof w1j0) && u890.j(w1j0Var.getId(), ((g2j0) h2j0Var).a)) {
                        break;
                    }
                    i3++;
                }
                num = new Integer(i3);
                if (num.intValue() != -1) {
                    num2 = num;
                }
            } else {
                if (!(h2j0Var instanceof f2j0)) {
                    eg.o();
                    return null;
                }
                num = new Integer(0);
                if (!((Boolean) ((tob1) this.d).getValue()).booleanValue()) {
                    num2 = num;
                }
            }
            if (num2 != null) {
                xtb0 xtb0Var = (xtb0) this.e;
                iu30 iu30Var2 = (iu30) this.f;
                int iIntValue = num2.intValue();
                int i4 = xtb0Var.h().n + xtb0Var.h().m;
                qtb0 qtb0Var = (qtb0) o7h.C0(xtb0Var.h().l);
                int i5 = this.b;
                if (qtb0Var == null || qtb0Var.a >= iIntValue) {
                    qtb0 qtb0Var2 = (qtb0) o7h.C0(xtb0Var.h().l);
                    f3a f3aVar = c2j0.a;
                    if (qtb0Var2 == null || qtb0Var2.a != iIntValue) {
                        qtb0 qtb0Var3 = (qtb0) o7h.s0(xtb0Var.h().l);
                        if (qtb0Var3 != null && qtb0Var3.a == iIntValue) {
                            qtb0 qtb0Var4 = (qtb0) o7h.s0(xtb0Var.h().l);
                            if (qtb0Var4 == null || qtb0Var4.p != 0) {
                                ij81Var = new ij81(iIntValue, (byte) 21);
                            } else {
                                ij81Var = f3aVar;
                            }
                        } else if (iIntValue == 0) {
                            ij81Var = d2j0.a;
                        } else {
                            ij81Var = f3aVar;
                        }
                    } else {
                        qtb0 qtb0Var5 = (qtb0) o7h.C0(xtb0Var.h().l);
                        if (qtb0Var5 != null && qtb0Var5.p + qtb0Var5.q <= i4) {
                            ij81Var = f3aVar;
                        } else {
                            ij81Var = ((qtb0) o7h.A0(xtb0Var.h().l)).q <= i4 ? new f3a(iIntValue, i4, i5) : new ij81(iIntValue, (byte) 21);
                        }
                    }
                } else {
                    ij81Var = new f3a(iIntValue, i4, i5);
                }
                k2j0Var.a = iu30Var2;
                k2j0Var.d = 1;
                boolean zG = ij81Var.g();
                d9n d9nVar = d9n.a;
                if (!zG || (objF = xtb0Var.f(ij81Var.f(), ij81Var.a(), k2j0Var)) != d9nVar) {
                    objF = rih1Var;
                }
                if (objF == d9nVar) {
                    return d9nVar;
                }
                iu30Var = iu30Var2;
            }
            return rih1Var;
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        iu30Var = k2j0Var.a;
        hm5.M(obj);
        iu30Var.invoke(l0j0.a);
        return rih1Var;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x0099  */
    /* JADX WARN: Code duplicated, block: B:60:0x012d  */
    /* JADX WARN: Code duplicated, block: B:78:? A[RETURN, SYNTHETIC] */
    public final Object emit(Object obj, lnm lnmVar) {
        j4r0 j4r0Var;
        jv61 jv61Var;
        av61 av61Var;
        int i;
        vr20 vr20Var;
        wu61 wu61Var;
        int i2;
        av61 av61Var2;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        rih1 rih1Var = rih1.a;
        int i3 = this.b;
        Object obj2 = this.e;
        Object obj3 = this.c;
        Object obj4 = this.f;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                return b((h2j0) obj, lnmVar);
            case 1:
                if (lnmVar instanceof j4r0) {
                    j4r0Var = (j4r0) lnmVar;
                    int i4 = j4r0Var.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        j4r0Var.b = i4 - Integer.MIN_VALUE;
                    } else {
                        j4r0Var = new j4r0(this, lnmVar);
                    }
                } else {
                    j4r0Var = new j4r0(this, lnmVar);
                }
                Object obj6 = j4r0Var.a;
                int i5 = j4r0Var.b;
                if (i5 == 0) {
                    hm5.M(obj6);
                    List listN = ((zl5) obj5).n(i3, (String) obj4, (ioj0) ((zob1) obj2).getValue());
                    j4r0Var.b = 1;
                    if (((vr20) obj3).emit(listN, j4r0Var) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i5 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj6);
                }
                return rih1Var;
            case 2:
                if (lnmVar instanceof jv61) {
                    jv61Var = (jv61) lnmVar;
                    int i6 = jv61Var.b;
                    if ((i6 & Integer.MIN_VALUE) != 0) {
                        jv61Var.b = i6 - Integer.MIN_VALUE;
                    } else {
                        jv61Var = new jv61(this, lnmVar);
                    }
                } else {
                    jv61Var = new jv61(this, lnmVar);
                }
                Object obj7 = jv61Var.a;
                int i7 = jv61Var.b;
                if (i7 != 0) {
                    if (i7 == 1) {
                        i2 = jv61Var.d;
                        av61Var = jv61Var.f;
                        vr20Var = jv61Var.c;
                        hm5.M(obj7);
                    } else {
                        if (i7 != 2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj7);
                    }
                    return rih1Var;
                }
                hm5.M(obj7);
                vr20 vr20Var2 = (vr20) obj3;
                bu61 bu61Var = (bu61) obj;
                av61Var = (av61) obj5;
                i = 0;
                if (bu61Var != null) {
                    jv61Var.c = vr20Var2;
                    jv61Var.f = av61Var;
                    jv61Var.d = 0;
                    jv61Var.b = 1;
                    int i8 = kv61.r;
                    Object objA = ((zu61) obj4).a(i3 + ".subject", bu61Var, new cv61(i3, (kv61) obj2, bu61Var, (lnm) null), jv61Var);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                    vr20Var = vr20Var2;
                    obj7 = objA;
                    i2 = 0;
                } else {
                    vr20Var = vr20Var2;
                    wu61Var = null;
                }
                av61Var2 = new av61(wu61Var, av61Var.b, av61Var.c);
                jv61Var.c = null;
                jv61Var.f = null;
                jv61Var.d = i;
                jv61Var.b = 2;
                if (vr20Var.emit(av61Var2, jv61Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
                wu61Var = (wu61) obj7;
                i = i2;
                av61Var2 = new av61(wu61Var, av61Var.b, av61Var.c);
                jv61Var.c = null;
                jv61Var.f = null;
                jv61Var.d = i;
                jv61Var.b = 2;
                if (vr20Var.emit(av61Var2, jv61Var) == d9nVar) {
                    return d9nVar;
                }
                return rih1Var;
            default:
                h1r h1rVar = (k1r) obj;
                c0r c0rVar = (c0r) obj5;
                psw0 psw0Var = (nsw0) obj4;
                dpb1 dpb1Var = (dpb1) obj3;
                if (h1rVar instanceof i1r) {
                    c0r c0rVar2 = dpb1Var.a;
                    if (c0rVar2 != null && c0rVar2 != c0rVar) {
                        c0rVar2.dispose();
                    }
                    dpb1Var.a = c0rVar;
                    dpb1Var.b = obj2;
                    psw0Var.setValue(new dm60(obj2));
                    return rih1Var;
                }
                if (h1rVar instanceof j1r) {
                    Object obj8 = dpb1Var.b;
                    psw0Var.setValue(obj8 != null ? new dm60(obj8) : cm60.a);
                    return rih1Var;
                }
                if (!(h1rVar instanceof h1r)) {
                    eg.o();
                    return null;
                }
                Object obj9 = dpb1Var.b;
                Object bm60Var = (obj9 == null || i3 == 1) ? new bm60(h1rVar.a) : new dm60(obj9);
                psw0Var.setValue(bm60Var);
                return rih1Var;
        }
    }

    public /* synthetic */ l2j0(int i, Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.c = obj;
        this.d = obj2;
        this.e = obj3;
        this.f = obj4;
        this.b = i;
    }
}
