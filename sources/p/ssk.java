package p;

import java.util.ArrayList;
import java.util.Iterator;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ssk extends hab0 implements xu30 {
    public final /* synthetic */ Object X;
    public final /* synthetic */ Object Y;
    public final /* synthetic */ Object Z;
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;
    public final /* synthetic */ Object t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssk(bp0 bp0Var, xu30 xu30Var, Function0 function0, Function0 function1, ven0 ven0Var, vu30 vu30Var, bab1 bab1Var, iu30 iu30Var, vu30 vu30Var2, vu30 vu30Var3, iu30 iu30Var2, Function0 function2) {
        super(3);
        this.b = bp0Var;
        this.c = xu30Var;
        this.d = function0;
        this.e = function1;
        this.g = ven0Var;
        this.h = vu30Var;
        this.X = bab1Var;
        this.Y = iu30Var;
        this.i = vu30Var2;
        this.t = vu30Var3;
        this.Z = iu30Var2;
        this.f = function2;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Type inference failed for: r0v26 */
    /* JADX WARN: Type inference failed for: r0v28, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r0v35 */
    public final Object invoke(Object obj, Object obj2, Object obj3) throws NoWhenBranchMatchedException {
        ?? r0;
        b0k b0kVar;
        boolean z;
        b0k b0kVar2;
        int i;
        b1m0 b1m0Var;
        h3h1 h3h1Var;
        c1m0 c1m0Var;
        Object fca1Var;
        Object aca1Var;
        String str;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.X;
        Object obj5 = this.t;
        Object obj6 = this.f;
        Object obj7 = this.i;
        Object obj8 = this.e;
        Object obj9 = this.d;
        Object obj10 = this.Z;
        Object obj11 = this.Y;
        Object obj12 = this.b;
        Object obj13 = this.h;
        Object obj14 = this.g;
        Object obj15 = this.c;
        switch (b) {
            case 0:
                String str3 = (String) obj;
                x340 x340Var = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar = fkj0.X;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var.g(str3) ? 4 : 2;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    for (r32 r32Var : ((bp0) obj12).a.a) {
                        if (u890.j(r32Var.getId(), str3)) {
                            xu30 xu30Var = (xu30) obj15;
                            Function0 function0 = (Function0) obj9;
                            Function0 function1 = (Function0) obj8;
                            ven0 ven0Var = (ven0) obj14;
                            vu30 vu30Var = (vu30) obj13;
                            bab1 bab1Var = (bab1) obj4;
                            iu30 iu30Var = (iu30) obj11;
                            vu30 vu30Var2 = (vu30) obj7;
                            vu30 vu30Var3 = (vu30) obj5;
                            iu30 iu30Var2 = (iu30) obj10;
                            Function0 function2 = (Function0) obj6;
                            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
                            int i2 = iIntValue;
                            int iHashCode = Long.hashCode(((x340) x340Var2).T);
                            xos0 xos0VarM = x340Var2.m();
                            nim0 nim0Var = nim0.a;
                            qim0 qim0VarE = zr7.E(x340Var2, nim0Var);
                            hzj.A.getClass();
                            if (((x340) x340Var2).a == null) {
                                tgp1.p();
                                throw null;
                            }
                            x340Var2.m0();
                            if (((x340) x340Var2).S) {
                                x340Var2.l(hmb0.t1);
                            } else {
                                x340Var2.v0();
                            }
                            nko1.H(mbhVarA, x340Var2, y580.O0);
                            nko1.H(xos0VarM, x340Var2, y580.N0);
                            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
                            nko1.F(x340Var2);
                            nko1.H(qim0VarE, x340Var2, y580.Y);
                            k32 k32VarA = r32Var.a();
                            if (k32VarA == null) {
                                x340Var2.i0(-855028127);
                                x340Var2.r(false);
                                vu30Var3 = vu30Var3;
                                iu30Var = iu30Var;
                                xu30Var = xu30Var;
                                ven0Var = ven0Var;
                                vu30Var = vu30Var;
                            } else {
                                x340Var2.i0(-855028126);
                                if (k32VarA instanceof i32) {
                                    x340Var2.i0(-107482572);
                                    i32 i32Var = (i32) k32VarA;
                                    e130.a(i32Var.b, 0, i32Var.a, x340Var2);
                                    uwr uwrVar = cbx.a;
                                    cvx cvxVar = cbx.b(x340Var2).b;
                                    x0d.s(nim0Var, 6.0f, x340Var2, false);
                                    vu30Var3 = vu30Var3;
                                    r0 = 0;
                                    iu30Var = iu30Var;
                                    xu30Var = xu30Var;
                                    ven0Var = ven0Var;
                                    vu30Var = vu30Var;
                                } else {
                                    if (!(k32VarA instanceof j32)) {
                                        throw p3d1.k(x340Var2, 1936193790, false);
                                    }
                                    x340Var2.i0(1936202768);
                                    int i3 = ((j32) k32VarA).a;
                                    boolean zG = ((i2 & 14) == 4) | x340Var2.g(iu30Var2) | x340Var2.g(function2) | x340Var2.i(bab1Var);
                                    Object objT = x340Var2.T();
                                    if (zG || objT == m4cVar) {
                                        f80 f80Var = new f80(str3, iu30Var2, function2, bab1Var, (byte) 25);
                                        x340Var2.s0(f80Var);
                                        objT = f80Var;
                                    }
                                    r0 = 0;
                                    e130.b(i3, 0, (Function0) objT, x340Var2);
                                    x340Var2.r(false);
                                }
                                rqo1.g((int) r0, 1, x340Var2, (qim0) null);
                                x340Var2.r((boolean) r0);
                            }
                            if (r32Var instanceof r32) {
                                x340Var2.i0(-854156964);
                                r32 r32Var2 = r32Var;
                                boolean zG2 = x340Var2.g(xu30Var) | x340Var2.g(function0) | x340Var2.g(function1) | x340Var2.i(r32Var) | x340Var2.i(ven0Var) | x340Var2.g(vu30Var) | x340Var2.i(bab1Var);
                                Object objT2 = x340Var2.T();
                                if (zG2 || objT2 == m4cVar) {
                                    objT2 = new z1(xu30Var, function0, function1, r32Var, bab1Var, vu30Var, ven0Var);
                                    x340Var2.s0(objT2);
                                }
                                b0k b0kVar3 = x340Var2;
                                myo1.h(r32Var2, (iu30) objT2, iu30Var, (qim0) null, b0kVar3, 0);
                                b0kVar = b0kVar3;
                                b0kVar.r(false);
                            } else {
                                b0kVar = x340Var2;
                                if (r32Var instanceof s32) {
                                    b0kVar.i0(526677287);
                                    s32 s32Var = (s32) r32Var;
                                    boolean zG3 = b0kVar.g(xu30Var) | b0kVar.i(r32Var) | b0kVar.i(ven0Var) | b0kVar.i(bab1Var);
                                    Object objT3 = b0kVar.T();
                                    if (zG3 || objT3 == m4cVar) {
                                        objT3 = new f80(xu30Var, r32Var, bab1Var, ven0Var, (byte) 26);
                                        b0kVar.s0(objT3);
                                    }
                                    yoo1.s(s32Var, (Function0) objT3, (qim0) null, b0kVar, 0);
                                    b0kVar.r(false);
                                } else {
                                    if (!(r32Var instanceof q32)) {
                                        throw p3d1.k(b0kVar, 526634161, false);
                                    }
                                    b0kVar.i0(526691129);
                                    q32 q32Var = (q32) r32Var;
                                    boolean zI = b0kVar.i(ven0Var) | b0kVar.g(vu30Var2);
                                    Object objT4 = b0kVar.T();
                                    if (zI || objT4 == m4cVar) {
                                        objT4 = new rsk(ven0Var, vu30Var2, (byte) 0);
                                        b0kVar.s0(objT4);
                                    }
                                    Function0 function3 = (Function0) objT4;
                                    vu30 vu30Var4 = vu30Var3;
                                    boolean zI2 = b0kVar.i(ven0Var) | b0kVar.g(vu30Var4);
                                    Object objT5 = b0kVar.T();
                                    if (zI2 || objT5 == m4cVar) {
                                        z = true;
                                        objT5 = new rsk(ven0Var, vu30Var4, (byte) 1);
                                        b0kVar.s0(objT5);
                                    } else {
                                        z = true;
                                    }
                                    u7n0.b(q32Var, function3, (Function0) objT5, (qim0) null, b0kVar, 0);
                                    b0kVar2 = b0kVar;
                                    b0kVar2.r(false);
                                }
                                b0kVar2.r(z);
                            }
                            b0kVar2 = b0kVar;
                            z = true;
                            b0kVar2.r(z);
                        } else {
                            x340Var2 = x340Var2;
                            iIntValue = iIntValue;
                        }
                    }
                    bhn0.t("Collection contains no element matching the predicate.");
                    return null;
                }
                x340Var2.b0();
                return rih1Var;
            case 1:
                sda1 sda1Var = (sda1) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                pda1 pda1Var = (pda1) obj12;
                m4c m4cVar2 = fkj0.X;
                String str4 = sda1Var.c;
                xca1 xca1Var = sda1Var.b;
                if ((iIntValue2 & 6) == 0) {
                    iIntValue2 |= (iIntValue2 & 8) == 0 ? x340Var3.g(sda1Var) : x340Var3.i(sda1Var) ? 4 : 2;
                } else {
                    obj14 = obj14;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 19) != 18)) {
                    x340Var4.b0();
                } else if (sda1Var.a) {
                    x340Var4.i0(1391780351);
                    boolean z2 = xca1Var instanceof wca1;
                    boolean z3 = !z2;
                    int i4 = !z2 ? 3 : 2;
                    c1m0 c1m0VarP = d9y0.p(pda1Var.m, i4, str4 == null ? null : str4);
                    boolean zG4 = x340Var4.g(c1m0VarP) | x340Var4.g(xca1Var);
                    Object objT6 = x340Var4.T();
                    vca1 vca1Var = vca1.a;
                    wca1 wca1Var = wca1.a;
                    if (zG4 || objT6 == m4cVar2) {
                        if (c1m0VarP != null) {
                            if (!(xca1Var instanceof uca1)) {
                                i = i4;
                                if (xca1Var instanceof tca1) {
                                    b1m0Var = new b1m0(c1m0VarP, ((tca1) xca1Var).a, "");
                                } else if (!xca1Var.equals(wca1Var) && !xca1Var.equals(vca1Var)) {
                                    eg.o();
                                }
                                return null;
                            }
                            uca1 uca1Var = (uca1) xca1Var;
                            i = i4;
                            String str5 = uca1Var.d;
                            b1m0Var = new b1m0(c1m0VarP, uca1Var.c, str5 != null ? str5 : "");
                            x340Var4.s0(b1m0Var);
                            objT6 = b1m0Var;
                        } else {
                            i = i4;
                        }
                        b1m0Var = null;
                        x340Var4.s0(b1m0Var);
                        objT6 = b1m0Var;
                    } else {
                        i = i4;
                    }
                    b1m0 b1m0Var2 = (b1m0) objT6;
                    boolean zG5 = x340Var4.g(b1m0Var2);
                    Object objT7 = x340Var4.T();
                    if (zG5 || objT7 == m4cVar2) {
                        r6h1 r6h1VarB = b1m0Var2 != null ? b1m0Var2.b() : null;
                        x340Var4.s0(r6h1VarB);
                        objT7 = r6h1VarB;
                    }
                    r6h1 r6h1Var = (r6h1) objT7;
                    boolean zG6 = x340Var4.g(b1m0Var2);
                    Object objT8 = x340Var4.T();
                    if (zG6 || objT8 == m4cVar2) {
                        objT8 = b1m0Var2 != null ? new h3h1(new dr91(b1m0Var2, (byte) 18)) : null;
                        x340Var4.s0(objT8);
                    } else {
                        z3 = z3;
                        obj5 = obj5;
                    }
                    h3h1 h3h1Var2 = (h3h1) objT8;
                    boolean zG7 = x340Var4.g(xca1Var) | x340Var4.g(str4 != null ? new eda1(str4) : null) | x340Var4.g(r6h1Var);
                    Object objT9 = x340Var4.T();
                    if (zG7 || objT9 == m4cVar2) {
                        boolean zEquals = xca1Var.equals(wca1Var);
                        ArrayList arrayList = z6x.a;
                        if (zEquals) {
                            aca1Var = new bca1(arrayList);
                        } else {
                            if (!xca1Var.equals(vca1Var)) {
                                if (xca1Var instanceof tca1) {
                                    aca1Var = new aca1("song_dna_search_results_failed", new rca1(r6h1Var, lca1.a));
                                } else if (xca1Var instanceof uca1) {
                                    if (r6h1Var == null) {
                                        h3h1Var = h3h1Var2;
                                        c1m0Var = c1m0VarP;
                                    } else if (str4 == null) {
                                        ArrayList arrayList2 = ((uca1) xca1Var).b;
                                        ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
                                        Iterator it = arrayList2.iterator();
                                        int i5 = 0;
                                        while (it.hasNext()) {
                                            Object next = it.next();
                                            int i6 = i5 + 1;
                                            if (i5 < 0) {
                                                p7h.T();
                                                throw null;
                                            }
                                            h3h1 h3h1Var3 = h3h1Var2;
                                            kca1 kca1Var = (kca1) next;
                                            Iterator it2 = it;
                                            if (kca1Var instanceof ica1) {
                                                String str6 = ((ica1) kca1Var).a;
                                                fca1Var = new eca1(i5, acq0.M(str4, xca1Var, str6), str6);
                                            } else if (kca1Var instanceof jca1) {
                                                String str7 = ((jca1) kca1Var).a;
                                                fca1Var = new fca1(i5, acq0.M(str4, xca1Var, str7), str7);
                                            } else {
                                                eg.o();
                                            }
                                            arrayList3.add(fca1Var);
                                            h3h1Var2 = h3h1Var3;
                                            it = it2;
                                            i5 = i6;
                                            c1m0VarP = c1m0VarP;
                                        }
                                        h3h1Var = h3h1Var2;
                                        c1m0Var = c1m0VarP;
                                        arrayList = arrayList3;
                                    } else {
                                        h3h1Var = h3h1Var2;
                                        c1m0Var = c1m0VarP;
                                        if (str4.equals("artists")) {
                                            ArrayList arrayList4 = ((uca1) xca1Var).e;
                                            arrayList = new ArrayList(q7h.U(arrayList4, 10));
                                            Iterator it3 = arrayList4.iterator();
                                            int i7 = 0;
                                            while (it3.hasNext()) {
                                                Object next2 = it3.next();
                                                int i8 = i7 + 1;
                                                if (i7 < 0) {
                                                    p7h.T();
                                                    throw null;
                                                }
                                                String str8 = (String) next2;
                                                arrayList.add(new eca1(i7, acq0.M(str4, xca1Var, str8), str8));
                                                it3 = it3;
                                                i7 = i8;
                                            }
                                        } else {
                                            ArrayList arrayList5 = ((uca1) xca1Var).f;
                                            arrayList = new ArrayList(q7h.U(arrayList5, 10));
                                            Iterator it4 = arrayList5.iterator();
                                            int i9 = 0;
                                            while (it4.hasNext()) {
                                                Object next3 = it4.next();
                                                int i10 = i9 + 1;
                                                if (i9 < 0) {
                                                    p7h.T();
                                                    throw null;
                                                }
                                                String str9 = (String) next3;
                                                arrayList.add(new fca1(i9, acq0.M(str4, xca1Var, str9), str9));
                                                it4 = it4;
                                                i9 = i10;
                                            }
                                        }
                                    }
                                    objT9 = arrayList.isEmpty() ? new aca1("song_dna_search_results_empty", new rca1(r6h1Var, pca1.a)) : new bca1(arrayList);
                                    x340Var4.s0(objT9);
                                } else {
                                    eg.o();
                                }
                                return null;
                            }
                            aca1Var = new cca1("song_dna_search_results_skeleton");
                        }
                        h3h1Var = h3h1Var2;
                        objT9 = aca1Var;
                        c1m0Var = c1m0VarP;
                        x340Var4.s0(objT9);
                    } else {
                        h3h1Var = h3h1Var2;
                        c1m0Var = c1m0VarP;
                    }
                    dca1 dca1Var = (dca1) objT9;
                    xtb0 xtb0Var = (xtb0) obj15;
                    d0r d0rVar = pda1Var.f;
                    iea1 iea1Var = (iea1) obj9;
                    cba1 cba1Var = (cba1) obj8;
                    cca1 cca1Var = new cca1("song_dna_search_results_skeleton");
                    v6f v6fVar = pda1Var.j;
                    if (xca1Var.equals(wca1Var) || xca1Var.equals(vca1Var)) {
                        str = null;
                    } else {
                        if (xca1Var instanceof tca1) {
                            if (str4 == null) {
                                str4 = "all";
                            }
                            str2 = str4 + ":" + ((tca1) xca1Var).a;
                        } else {
                            if (!(xca1Var instanceof uca1)) {
                                eg.o();
                                return null;
                            }
                            if (str4 == null) {
                                str4 = "all";
                            }
                            str2 = str4 + ":" + ((uca1) xca1Var).c;
                        }
                        str = str2;
                    }
                    pda1Var.c(6, apo.r(441468805, new rpr(pda1Var, (erl1) obj14, (wat) obj13, (xtb0) obj15, h3h1Var, z3, u7n0.C(xtb0Var, dca1Var, d0rVar, iea1Var, cba1Var, cca1Var, v6fVar, str, x340Var4), (vba1) obj7, i, sda1Var, c1m0Var, (qba1) obj5), x340Var4), x340Var4);
                    x340Var4.r(false);
                } else {
                    x340Var4.i0(1395938567);
                    e1m0 e1m0Var = (e1m0) obj6;
                    boolean zG8 = x340Var4.g(e1m0Var);
                    Object objT10 = x340Var4.T();
                    if (zG8 || objT10 == m4cVar2) {
                        h3h1 h3h1Var4 = e1m0Var != null ? new h3h1(new dr91(e1m0Var, (byte) 19)) : null;
                        x340Var4.s0(h3h1Var4);
                        objT10 = h3h1Var4;
                    }
                    pda1Var.c(6, apo.r(641857692, new wy51(pda1Var, (erl1) obj14, (wat) obj13, (xtb0) obj4, (h3h1) objT10, (zba1) obj11, e1m0Var, (qba1) obj10, (byte) 5), x340Var4), x340Var4);
                    x340Var4.r(false);
                }
                return rih1Var;
            default:
                x340 x340Var5 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4m1 m4m1Var = (m4m1) obj12;
                if (m4m1Var != null) {
                    ws61 ws61Var = m4m1Var.a;
                    x340 x340Var6 = x340Var5;
                    Object objT11 = x340Var6.T();
                    if (objT11 == fkj0.X) {
                        objT11 = owl1.R0;
                        x340Var6.s0(objT11);
                    }
                    hm5.a(ws61Var, (qim0) null, (iu30) objT11, (tl3) null, "panel_transition", (iu30) null, apo.r(747644277, new c2m1(m4m1Var, (iu30) obj11, (iu30) obj10, (Function0) obj9, (iu30) obj15, (Function0) obj8, (iu30) obj14, (iu30) obj13, (iu30) obj7, (Function0) obj6, (iu30) obj5, (Function0) obj4), x340Var6), x340Var6, 1597824, 42);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssk(pda1 pda1Var, xtb0 xtb0Var, iea1 iea1Var, cba1 cba1Var, e1m0 e1m0Var, u85 u85Var, wat watVar, vba1 vba1Var, qba1 qba1Var, xtb0 xtb0Var2, zba1 zba1Var, qba1 qba1Var2) {
        super(3);
        this.b = pda1Var;
        this.c = xtb0Var;
        this.d = iea1Var;
        this.e = cba1Var;
        this.f = e1m0Var;
        this.g = u85Var;
        this.h = watVar;
        this.i = vba1Var;
        this.t = qba1Var;
        this.X = xtb0Var2;
        this.Y = zba1Var;
        this.Z = qba1Var2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ssk(m4m1 m4m1Var, iu30 iu30Var, iu30 iu30Var2, Function0 function0, iu30 iu30Var3, Function0 function1, iu30 iu30Var4, iu30 iu30Var5, iu30 iu30Var6, Function0 function2, iu30 iu30Var7, Function0 function3) {
        super(3);
        this.b = m4m1Var;
        this.Y = iu30Var;
        this.Z = iu30Var2;
        this.d = function0;
        this.c = iu30Var3;
        this.e = function1;
        this.g = iu30Var4;
        this.h = iu30Var5;
        this.i = iu30Var6;
        this.f = function2;
        this.t = iu30Var7;
        this.X = function3;
    }
}
