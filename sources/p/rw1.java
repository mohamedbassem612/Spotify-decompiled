package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class rw1 extends hab0 implements zu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ Function0 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(ow1 ow1Var, dx1 dx1Var, fu1 fu1Var, kw1 kw1Var, jw1 jw1Var, iu30 iu30Var, Function0 function0) {
        super(4);
        this.d = ow1Var;
        this.e = dx1Var;
        this.f = fu1Var;
        this.g = kw1Var;
        this.h = jw1Var;
        this.b = iu30Var;
        this.c = function0;
    }

    /* JADX WARN: Code duplicated, block: B:84:0x02b6  */
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        int i;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj5 = this.h;
        Object obj6 = this.g;
        Object obj7 = this.e;
        Object obj8 = this.f;
        Object obj9 = this.d;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                tu1 tu1Var = (tu1) obj;
                vzq0 vzq0Var = (vzq0) obj2;
                x340 x340Var = (b0k) obj3;
                int iIntValue = ((Number) obj4).intValue();
                m4c m4cVar = fkj0.X;
                dx1 dx1Var = (dx1) obj7;
                if ((iIntValue & 6) == 0) {
                    i = ((iIntValue & 8) == 0 ? x340Var.g(tu1Var) : x340Var.i(tu1Var) ? 4 : 2) | iIntValue;
                } else {
                    i = iIntValue;
                }
                if ((iIntValue & 48) == 0) {
                    i |= x340Var.g(vzq0Var) ? 32 : 16;
                }
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(i & 1, (i & 147) != 146)) {
                    n9p1.d(tu1Var, ((ow1) obj9).a, x340Var2, i & 14);
                    su1 su1VarA = tu1Var.a();
                    vo1 vo1Var = su1VarA.b;
                    n2 n2Var = dx1Var.h;
                    if (u890.j(vo1Var, qn31.a)) {
                        x340Var2.i0(1863367055);
                        p8p1.a((fu1) obj8, (kw1) obj6, (jw1) obj5, (ow1) obj9, this.b, vzq0Var, x340Var2, (i << 12) & 458752);
                        x340Var2.r(false);
                    } else {
                        vo1 vo1Var2 = su1VarA.b;
                        p030 p030Var = vo1Var2 instanceof p030 ? (p030) vo1Var2 : null;
                        if (u890.j(p030Var != null ? p030Var.b : null, "atp")) {
                            x340Var2.i0(1863367055);
                            p8p1.a((fu1) obj8, (kw1) obj6, (jw1) obj5, (ow1) obj9, this.b, vzq0Var, x340Var2, (i << 12) & 458752);
                            x340Var2.r(false);
                        } else if (vo1Var instanceof rms) {
                            x340Var2.i0(1863639297);
                            long j = su1VarA.a;
                            rms rmsVar = (rms) vo1Var;
                            ju1 ju1Var = dx1Var.b;
                            boolean zI = x340Var2.i(ju1Var);
                            Object objT = x340Var2.T();
                            if (zI || objT == m4cVar) {
                                objT = new q01(0, ju1Var, ju1.class, "back", "back()V", 0, (byte) 2);
                                x340Var2.s0(objT);
                            }
                            t8p1.a(j, rmsVar, n2Var, vzq0Var, this.c, (Function0) objT, x340Var2, (i << 6) & 7168);
                            x340Var2.r(false);
                        } else if (u890.j(vo1Var, u7c0.a)) {
                            x340Var2.i0(1864006151);
                            dx1Var.i.a(dx1Var.b, vzq0Var, (qim0) null, x340Var2, 8 | (i & 112));
                            x340Var2.r(false);
                        } else {
                            x340Var2.i0(1864105010);
                            Long lValueOf = Long.valueOf(su1VarA.a);
                            boolean zG = x340Var2.g(dx1Var);
                            Object objT2 = x340Var2.T();
                            if (zG || objT2 == m4cVar) {
                                objT2 = new kk(dx1Var, (lnm) null, (byte) 3);
                                x340Var2.s0(objT2);
                            }
                            qxd0.t(lValueOf, x340Var2, (vu30) objT2);
                            x340Var2.r(false);
                        }
                    }
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            default:
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                x340 x340Var3 = (b0k) obj3;
                ((Number) obj4).intValue();
                wux wuxVar = (wux) obj8;
                m4c m4cVar2 = fkj0.X;
                ven0 ven0Var = (ven0) obj7;
                if (zBooleanValue) {
                    x340 x340Var4 = x340Var3;
                    x340Var4.i0(-1803021900);
                    id01 id01Var = (id01) obj9;
                    iu30 iu30Var = this.b;
                    boolean zG2 = x340Var4.g(iu30Var) | x340Var4.i(ven0Var);
                    Object objT3 = x340Var4.T();
                    if (zG2 || objT3 == m4cVar2) {
                        objT3 = new i5r0(iu30Var, ven0Var, (byte) 5);
                        x340Var4.s0(objT3);
                    }
                    iu30 iu30Var2 = (iu30) objT3;
                    Function0 function0 = this.c;
                    boolean zG3 = x340Var4.g(function0) | x340Var4.i(ven0Var);
                    Object objT4 = x340Var4.T();
                    if (zG3 || objT4 == m4cVar2) {
                        objT4 = new swi0(function0, ven0Var, (byte) 12);
                        x340Var4.s0(objT4);
                    }
                    Function0 function1 = (Function0) objT4;
                    boolean zI2 = x340Var4.i(ven0Var);
                    Object objT5 = x340Var4.T();
                    if (zI2 || objT5 == m4cVar2) {
                        objT5 = new g8y0(ven0Var, (byte) 16);
                        x340Var4.s0(objT5);
                    }
                    u890.a(id01Var, iu30Var2, function1, (Function0) objT5, x340Var4, 0);
                    x340Var4.r(false);
                } else {
                    x340 x340Var5 = x340Var3;
                    x340Var5.i0(-1802516507);
                    d36 d36Var = new d36(wuxVar.b.b, true, new um5(false));
                    qim0 qim0VarT = l6o1.t(nim0.a, l6o1.C(0, 0, 1, x340Var5), 14);
                    Function0 function2 = (Function0) obj6;
                    Function0 function3 = (Function0) obj5;
                    id01 id01Var2 = (id01) obj9;
                    jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var5, 0);
                    int iHashCode = Long.hashCode(x340Var5.T);
                    xos0 xos0VarM = x340Var5.m();
                    qim0 qim0VarE = zr7.E(x340Var5, qim0VarT);
                    hzj.A.getClass();
                    if (x340Var5.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var5.m0();
                    if (x340Var5.S) {
                        x340Var5.l(hmb0.t1);
                    } else {
                        x340Var5.v0();
                    }
                    nko1.H(jw31VarA, x340Var5, y580.O0);
                    nko1.H(xos0VarM, x340Var5, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode), x340Var5, y580.R0);
                    nko1.F(x340Var5);
                    nko1.H(qim0VarE, x340Var5, y580.Y);
                    j2i j2iVarR = apo.r(842050607, new u841(wuxVar, id01Var2), x340Var5);
                    String strO0 = cwl1.o0(x340Var5, 2131955668);
                    boolean zI3 = x340Var5.i(ven0Var);
                    Object objT6 = x340Var5.T();
                    if (zI3 || objT6 == m4cVar2) {
                        objT6 = new g8y0(ven0Var, (byte) 17);
                        x340Var5.s0(objT6);
                    }
                    yy51.b(3078, strO0, "ereader_selection_menu_highlight", (Function0) objT6, j2iVarR, x340Var5);
                    yy51.b(3078, cwl1.o0(x340Var5, 2131955667), "ereader_selection_menu_copy", function2, yfj.a, x340Var5);
                    yy51.b(3078, cwl1.o0(x340Var5, 2131955670), "ereader_selection_menu_report", function3, yfj.b, x340Var5);
                    x340Var5.r(true);
                    x340Var5.r(false);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rw1(id01 id01Var, iu30 iu30Var, ven0 ven0Var, Function0 function0, wux wuxVar, Function0 function1, Function0 function2) {
        super(4);
        this.d = id01Var;
        this.b = iu30Var;
        this.e = ven0Var;
        this.c = function0;
        this.f = wuxVar;
        this.g = function1;
        this.h = function2;
    }
}
