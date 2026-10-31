package p;

import android.content.Context;
import android.view.accessibility.AccessibilityManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.comscore.streaming.ContentType;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class nt00 {
    public final /* synthetic */ lz20 a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ ven0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ String e;
    public final /* synthetic */ String f;
    public final /* synthetic */ k6a1 g;
    public final /* synthetic */ ven0 h;
    public final /* synthetic */ iu30 i;
    public final /* synthetic */ hdn0 j;
    public final /* synthetic */ hdn0 k;

    public nt00(lz20 lz20Var, boolean z, ven0 ven0Var, String str, String str2, String str3, k6a1 k6a1Var, ven0 ven0Var2, iu30 iu30Var, hdn0 hdn0Var, hdn0 hdn0Var2) {
        this.a = lz20Var;
        this.b = z;
        this.c = ven0Var;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = k6a1Var;
        this.h = ven0Var2;
        this.i = iu30Var;
        this.j = hdn0Var;
        this.k = hdn0Var2;
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0229 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:103:0x022b  */
    /* JADX WARN: Code duplicated, block: B:106:0x024d A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:107:0x024f  */
    /* JADX WARN: Code duplicated, block: B:110:0x026a A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:113:0x026f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0289  */
    /* JADX WARN: Code duplicated, block: B:118:0x028f  */
    /* JADX WARN: Code duplicated, block: B:94:0x0213  */
    /* JADX WARN: Code duplicated, block: B:98:0x021e A[PHI: r34
      0x021e: PHI (r34v4 boolean) = (r34v1 boolean), (r34v5 boolean) binds: [B:97:0x021c, B:95:0x0217] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:99:0x0220  */
    public final void a(final boolean z, final Function0 function0, qim0 qim0Var, es41 es41Var, boolean z2, hw61 hw61Var, long j, float f, final j2i j2iVar, b0k b0kVar, final int i, final int i2) {
        int i3;
        x340 x340Var;
        final qim0 qim0Var2;
        final es41 es41Var2;
        final boolean z3;
        final hw61 hw61VarB;
        final long j2;
        final float f2;
        es41 es41VarC;
        long jE;
        qim0 qim0Var3;
        float f3;
        int i4;
        boolean z4;
        Object obj;
        boolean z5;
        boolean z6;
        boolean z7;
        boolean z8;
        boolean z9;
        boolean z10;
        Object obj2;
        b9d0 b9d0Var;
        boolean zG;
        Object obj3;
        boolean zG2;
        int i5;
        Object obj4;
        int i6;
        boolean z11;
        qim0 qim0Var4;
        es41 es41Var3;
        Object obj5;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-126848451);
        int i7 = i | (x340Var2.h(z) ? 4 : 2) | (x340Var2.i(function0) ? 32 : 16) | 919168384;
        if ((i2 & 6) == 0) {
            i3 = i2 | (x340Var2.i(j2iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var2.g(this) ? 32 : 16;
        }
        if (x340Var2.Y(i7 & 1, ((306783379 & i7) == 306783378 && (i3 & 19) == 18) ? false : true)) {
            x340Var2.d0();
            if ((i & 1) == 0 || x340Var2.E()) {
                es41VarC = l6o1.C(0, 0, 1, x340Var2);
                zzq0 zzq0Var = nsi0.a;
                hw61VarB = px61.b(x340Var2, 5);
                jE = eah.e(x340Var2, 37);
                qim0Var3 = nim0.a;
                f3 = 3.0f;
                i4 = i7 & (-4135937);
                z4 = true;
            } else {
                x340Var2.b0();
                qim0Var3 = qim0Var;
                es41VarC = es41Var;
                hw61VarB = hw61Var;
                jE = j;
                f3 = f;
                i4 = i7 & (-4135937);
                z4 = z2;
            }
            x340Var2.s();
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            Object objI = objT;
            if (objT == m4cVar) {
                objI = bb00.i(rih1.a, f331.X0, x340Var2);
            }
            ven0 ven0Var = (ven0) objI;
            wat watVar = (wat) x340Var2.k(t4k.h);
            WeakHashMap weakHashMap = osl1.x;
            int i8 = lhc.g(x340Var2).f.e().b;
            if (z) {
                x340Var2.i0(629991660);
                Object objT2 = x340Var2.T();
                if (objT2 == m4cVar) {
                    e45 e45Var = new e45(ven0Var, (byte) 4);
                    x340Var2.s0(e45Var);
                    obj5 = e45Var;
                } else {
                    obj5 = objT2;
                }
                gio1.c((Function0) obj5, x340Var2, 6);
                x340Var2.r(false);
            } else {
                z4 = z4;
                x340Var2.i0(630077189);
                x340Var2.r(false);
            }
            Object objT3 = x340Var2.T();
            Object obj6 = objT3;
            if (objT3 == m4cVar) {
                zen0 zen0Var = new zen0(Boolean.FALSE);
                x340Var2.s0(zen0Var);
                obj6 = zen0Var;
            }
            zen0 zen0Var2 = (zen0) obj6;
            zen0Var2.w1(Boolean.valueOf(z));
            if (((Boolean) zen0Var2.c.getValue()).booleanValue() || ((Boolean) zen0Var2.d.getValue()).booleanValue()) {
                x340Var2.i0(630396489);
                Object objT4 = x340Var2.T();
                if (objT4 == m4cVar) {
                    hrr0 hrr0VarQ = v8r.q(new ofg1(ofg1.b));
                    x340Var2.s0(hrr0VarQ);
                    obj = hrr0VarQ;
                } else {
                    obj = objT4;
                }
                ven0 ven0Var2 = (ven0) obj;
                boolean zG3 = x340Var2.g(watVar) | x340Var2.e(i8);
                Object objT5 = x340Var2.T();
                Object obj7 = objT5;
                if (zG3 || objT5 == m4cVar) {
                    ot00 ot00Var = new ot00(watVar, i8, ven0Var, new od4(ven0Var2, (byte) 2));
                    x340Var2.s0(ot00Var);
                    obj7 = ot00Var;
                }
                ot00 ot00Var2 = (ot00) obj7;
                ((gt00) this.h.getValue()).getClass();
                ((Boolean) this.c.getValue()).getClass();
                m4c m4cVar2 = fkj0.X;
                boolean z12 = (7 & 4) != 0;
                AccessibilityManager accessibilityManager = (AccessibilityManager) ((Context) x340Var2.k(AndroidCompositionLocals_androidKt.b)).getSystemService("accessibility");
                boolean z13 = (((0 & 14) ^ 6) > 4 && x340Var2.h(true)) || (0 & 6) == 4;
                if (((0 & ContentType.LONG_FORM_ON_DEMAND) ^ 48) <= 32 || !x340Var2.h(true)) {
                    z5 = false;
                    if ((0 & 48) != 32) {
                        z6 = false;
                    }
                    z7 = z6 | z13;
                    if ((((z5 ? 1 : 0) & 896) ^ 384) > 256 || !x340Var2.h(z12)) {
                        z8 = z7;
                        if ((0 & 384) != 256) {
                            z9 = false;
                        }
                        z10 = z8 | z9;
                        Object objT6 = x340Var2.T();
                        obj2 = objT6;
                        if (z10 || objT6 == m4cVar2) {
                            b9d0 b9d0Var2 = new b9d0(true, true, z12);
                            x340Var2.s0(b9d0Var2);
                            obj2 = b9d0Var2;
                        }
                        b9d0Var = (b9d0) obj2;
                        iac0 iac0Var = (iac0) x340Var2.k(jfe0.a);
                        zG = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                        Object objT7 = x340Var2.T();
                        obj3 = objT7;
                        if (zG || objT7 == m4cVar2) {
                            b6 b6Var = new b6(b9d0Var, accessibilityManager, (byte) 1);
                            x340Var2.s0(b6Var);
                            obj3 = b6Var;
                        }
                        iu30 iu30Var = (iu30) obj3;
                        zG2 = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                        Object objT8 = x340Var2.T();
                        if (!zG2 || objT8 == m4cVar2) {
                            i5 = 0;
                            og ogVar = new og(b9d0Var, accessibilityManager, (byte) 0);
                            x340Var2.s0(ogVar);
                            obj4 = ogVar;
                        } else {
                            i5 = 0;
                            obj4 = objT8;
                        }
                        suo1.o(iac0Var, iu30Var, (Function0) obj4, x340Var2, i5);
                        if (((Boolean) b9d0Var.getValue()).booleanValue()) {
                            i6 = 393216;
                        } else {
                            i6 = 393248;
                        }
                        z11 = z4;
                        qim0Var4 = qim0Var3;
                        es41Var3 = es41VarC;
                        j2 = jE;
                        f2 = f3;
                        sy4.a(ot00Var2, function0, new nfv0(i6, true, true, true, false), apo.r(2063119149, new it00(this, qim0Var4, z11, zen0Var2, ven0Var2, es41Var3, hw61VarB, j2, f2, j2iVar), x340Var2), x340Var2, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 3072, 0);
                        x340Var = x340Var2;
                        x340Var.r(false);
                    } else {
                        z8 = z7;
                    }
                    z9 = true;
                    z10 = z8 | z9;
                    Object objT9 = x340Var2.T();
                    obj2 = objT9;
                    if (z10) {
                        b9d0 b9d0Var3 = new b9d0(true, true, z12);
                        x340Var2.s0(b9d0Var3);
                        obj2 = b9d0Var3;
                    } else {
                        b9d0 b9d0Var4 = new b9d0(true, true, z12);
                        x340Var2.s0(b9d0Var4);
                        obj2 = b9d0Var4;
                    }
                    b9d0Var = (b9d0) obj2;
                    iac0 iac0Var2 = (iac0) x340Var2.k(jfe0.a);
                    zG = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                    Object objT10 = x340Var2.T();
                    obj3 = objT10;
                    if (zG) {
                        b6 b6Var2 = new b6(b9d0Var, accessibilityManager, (byte) 1);
                        x340Var2.s0(b6Var2);
                        obj3 = b6Var2;
                    } else {
                        b6 b6Var3 = new b6(b9d0Var, accessibilityManager, (byte) 1);
                        x340Var2.s0(b6Var3);
                        obj3 = b6Var3;
                    }
                    iu30 iu30Var2 = (iu30) obj3;
                    zG2 = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                    Object objT11 = x340Var2.T();
                    if (zG2) {
                        i5 = 0;
                        og ogVar2 = new og(b9d0Var, accessibilityManager, (byte) 0);
                        x340Var2.s0(ogVar2);
                        obj4 = ogVar2;
                    } else {
                        i5 = 0;
                        og ogVar3 = new og(b9d0Var, accessibilityManager, (byte) 0);
                        x340Var2.s0(ogVar3);
                        obj4 = ogVar3;
                    }
                    suo1.o(iac0Var2, iu30Var2, (Function0) obj4, x340Var2, i5);
                    if (((Boolean) b9d0Var.getValue()).booleanValue()) {
                        i6 = 393248;
                    } else {
                        i6 = 393216;
                    }
                    z11 = z4;
                    qim0Var4 = qim0Var3;
                    es41Var3 = es41VarC;
                    j2 = jE;
                    f2 = f3;
                    sy4.a(ot00Var2, function0, new nfv0(i6, true, true, true, false), apo.r(2063119149, new it00(this, qim0Var4, z11, zen0Var2, ven0Var2, es41Var3, hw61VarB, j2, f2, j2iVar), x340Var2), x340Var2, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 3072, 0);
                    x340Var = x340Var2;
                    x340Var.r(false);
                } else {
                    z5 = false;
                }
                z6 = true;
                z7 = z6 | z13;
                if ((((z5 ? 1 : 0) & 896) ^ 384) > 256) {
                    z8 = z7;
                    if ((0 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                } else {
                    z8 = z7;
                    if ((0 & 384) != 256) {
                        z9 = true;
                    } else {
                        z9 = false;
                    }
                }
                z10 = z8 | z9;
                Object objT12 = x340Var2.T();
                obj2 = objT12;
                if (z10) {
                    b9d0 b9d0Var5 = new b9d0(true, true, z12);
                    x340Var2.s0(b9d0Var5);
                    obj2 = b9d0Var5;
                } else {
                    b9d0 b9d0Var6 = new b9d0(true, true, z12);
                    x340Var2.s0(b9d0Var6);
                    obj2 = b9d0Var6;
                }
                b9d0Var = (b9d0) obj2;
                iac0 iac0Var3 = (iac0) x340Var2.k(jfe0.a);
                zG = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                Object objT13 = x340Var2.T();
                obj3 = objT13;
                if (zG) {
                    b6 b6Var4 = new b6(b9d0Var, accessibilityManager, (byte) 1);
                    x340Var2.s0(b6Var4);
                    obj3 = b6Var4;
                } else {
                    b6 b6Var5 = new b6(b9d0Var, accessibilityManager, (byte) 1);
                    x340Var2.s0(b6Var5);
                    obj3 = b6Var5;
                }
                iu30 iu30Var3 = (iu30) obj3;
                zG2 = x340Var2.g(b9d0Var) | x340Var2.i(accessibilityManager);
                Object objT14 = x340Var2.T();
                if (zG2) {
                    i5 = 0;
                    og ogVar4 = new og(b9d0Var, accessibilityManager, (byte) 0);
                    x340Var2.s0(ogVar4);
                    obj4 = ogVar4;
                } else {
                    i5 = 0;
                    og ogVar5 = new og(b9d0Var, accessibilityManager, (byte) 0);
                    x340Var2.s0(ogVar5);
                    obj4 = ogVar5;
                }
                suo1.o(iac0Var3, iu30Var3, (Function0) obj4, x340Var2, i5);
                if (((Boolean) b9d0Var.getValue()).booleanValue()) {
                    i6 = 393248;
                } else {
                    i6 = 393216;
                }
                z11 = z4;
                qim0Var4 = qim0Var3;
                es41Var3 = es41VarC;
                j2 = jE;
                f2 = f3;
                sy4.a(ot00Var2, function0, new nfv0(i6, true, true, true, false), apo.r(2063119149, new it00(this, qim0Var4, z11, zen0Var2, ven0Var2, es41Var3, hw61VarB, j2, f2, j2iVar), x340Var2), x340Var2, (i4 & ContentType.LONG_FORM_ON_DEMAND) | 3072, 0);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                x340Var2.i0(631807237);
                x340Var2.r(false);
                z11 = z4;
                es41Var3 = es41VarC;
                qim0Var4 = qim0Var3;
                j2 = jE;
                x340Var = x340Var2;
                f2 = f3;
            }
            qim0Var2 = qim0Var4;
            es41Var2 = es41Var3;
            z3 = z11;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            es41Var2 = es41Var;
            z3 = z2;
            hw61VarB = hw61Var;
            j2 = j;
            f2 = f;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vu30(z, function0, qim0Var2, es41Var2, z3, hw61VarB, j2, f2, j2iVar, i, i2) { // from class: p.ht00
                public final /* synthetic */ int X;
                public final /* synthetic */ boolean b;
                public final /* synthetic */ Function0 c;
                public final /* synthetic */ qim0 d;
                public final /* synthetic */ es41 e;
                public final /* synthetic */ boolean f;
                public final /* synthetic */ hw61 g;
                public final /* synthetic */ long h;
                public final /* synthetic */ float i;
                public final /* synthetic */ j2i t;

                {
                    this.X = i2;
                }

                public final Object invoke(Object obj8, Object obj9) {
                    ((Integer) obj9).getClass();
                    int iP = czo1.p(1);
                    int iP2 = czo1.p(this.X);
                    this.a.a(this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.t, (b0k) obj8, iP, iP2);
                    return rih1.a;
                }
            };
        }
    }
}
