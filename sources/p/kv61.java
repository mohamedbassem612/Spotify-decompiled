package p;

import android.content.Context;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class kv61 {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final long f19p;
    public static final long q;
    public static final /* synthetic */ int r = 0;
    public final ov20 a;
    public final gu61 b;
    public final jly0 c;
    public final jly0 d;
    public final jly0 e;
    public final jly0 f;
    public final kly0 g;
    public final kly0 h;
    public final y441 i;
    public final idd1 j = new idd1(new bv61(this, 4));
    public final idd1 k = new idd1(new bv61(this, 1));
    public final idd1 l = new idd1(new bv61(this, 3));
    public final idd1 m = new idd1(new bv61(this, 0));
    public final idd1 n = new idd1(new bv61(this, 5));
    public final idd1 o = new idd1(new bv61(this, 2));

    static {
        ytw0 ytw0Var = jfv.b;
        f19p = fdg1.k0(5, ngv.e);
        q = fdg1.k0(500, ngv.d);
    }

    public kv61(ov20 ov20Var, gu61 gu61Var, jly0 jly0Var, jly0 jly0Var2, jly0 jly0Var3, jly0 jly0Var4, jly0 jly0Var5, jly0 jly0Var6, y441 y441Var) {
        this.a = ov20Var;
        this.b = gu61Var;
        this.c = jly0Var;
        this.d = jly0Var2;
        this.e = jly0Var3;
        this.f = jly0Var4;
        this.g = jly0Var5;
        this.h = jly0Var6;
        this.i = y441Var;
    }

    public static final xlc1 d(kv61 kv61Var) {
        return (xlc1) kv61Var.j.getValue();
    }

    public static final wu61 f(String str, jgb1 jgb1Var, kv61 kv61Var, xpw xpwVar, igb1 igb1Var) {
        return new wu61(str, jgb1Var.a, xpwVar, new jp61(kv61Var.b, jgb1Var, igb1Var, rih1.a, kv61Var.i));
    }

    public final void a(boolean z, boolean z2, vzq0 vzq0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        Function0 function0;
        qim0 qim0Var;
        llj lljVar;
        vu30 vu30Var;
        Function0 function1;
        boolean z3;
        vu30 vu30Var2;
        j2i j2iVar2 = j2iVar;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1185646949);
        j06 j06Var = ((x340) b0kVar2).a;
        if ((i & 6) == 0) {
            i2 = (b0kVar2.h(z) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.h(z2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar2.g(vzq0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar2.i(j2iVar2) ? 2048 : 1024;
        }
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            uwr uwrVar = cbx.a;
            pxg1 pxg1VarO0 = irn1.o0(jfv.t(cbx.c(b0kVar2).b.b, ngv.d), 0, ((jhx) cbx.c(b0kVar2).a.b).c, 2);
            Object objT = b0kVar2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = v8r.q(Boolean.FALSE);
                b0kVar2.s0(objT);
            }
            ven0 ven0Var = (ven0) objT;
            Boolean boolValueOf = Boolean.valueOf(z2);
            boolean z4 = (i2 & 112) == 32;
            Object objT2 = b0kVar2.T();
            if (z4 || objT2 == m4cVar) {
                objT2 = new wsh(z2, ven0Var, null, (byte) 5);
                b0kVar2.s0(objT2);
            }
            qxd0.t(boolValueOf, b0kVar2, (vu30) objT2);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, qim0Var2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z5 = ((x340) b0kVar2).S;
            Function0 function2 = hmb0.t1;
            if (z5) {
                b0kVar2.l(function2);
            } else {
                b0kVar2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, b0kVar2, lljVar2);
            vu30 vu30Var3 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, vu30Var3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            vu30 vu30Var4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, vu30Var4);
            tob1 tob1VarB = z95.b(((Boolean) ven0Var.getValue()).booleanValue() ? 1.0f : 0.0f, pxg1VarO0, "settingsSpinnerAlpha", (iu30) null, b0kVar2, 3072, 20);
            if (z2 && ((Number) tob1VarB.getValue()).floatValue() == 0.0f) {
                b0kVar2.i0(175986701);
                b0kVar2.r(false);
                qim0Var = qim0Var2;
                vu30Var2 = vu30Var3;
                lljVar = lljVar3;
                vu30Var = vu30Var4;
                function1 = function2;
                z3 = true;
            } else {
                b0kVar2.i0(175532148);
                qim0 qim0VarF = u291.f(d9y0.k(qim0Var2, ((Number) tob1VarB.getValue()).floatValue()), 1.0f);
                if (!z) {
                    qim0VarF = qim0VarF.then(u291.c(qim0Var2, 1.0f));
                }
                qim0 qim0VarW = uyn1.w(qim0VarF, vzq0Var);
                gfh0 gfh0VarC2 = t1c.c(een.h, false);
                int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
                xos0 xos0VarM2 = b0kVar2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarW);
                b0kVar2.m0();
                if (((x340) b0kVar2).S) {
                    function0 = function2;
                    b0kVar2.l(function0);
                } else {
                    function0 = function2;
                    b0kVar2.v0();
                }
                nko1.H(gfh0VarC2, b0kVar2, lljVar2);
                nko1.H(xos0VarM2, b0kVar2, vu30Var3);
                x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, vu30Var4);
                qim0Var = qim0Var2;
                lljVar = lljVar3;
                vu30Var = vu30Var4;
                function1 = function0;
                z3 = true;
                vu30Var2 = vu30Var3;
                xto1.e(anm1.N(((Boolean) ven0Var.getValue()).booleanValue() ? "SettingsSpinner" : "SettingsSpinnerInvisible", qim0Var2), 5, 0L, 0L, b0kVar2, 48, 12);
                b0kVar2 = b0kVar2;
                b0kVar2.r(true);
                b0kVar2.r(false);
            }
            qim0 qim0VarK = d9y0.k(qim0Var, ((Number) z95.b(z2 ? 1.0f : 0.0f, pxg1VarO0, "settingsContentAlpha", (iu30) null, b0kVar2, 3072, 20).getValue()).floatValue());
            gfh0 gfh0VarC3 = t1c.c(graVar, false);
            int iHashCode3 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM3 = b0kVar2.m();
            qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarK);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(function1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC3, b0kVar2, lljVar2);
            nko1.H(xos0VarM3, b0kVar2, vu30Var2);
            x0d.q(iHashCode3, b0kVar2, lljVar, b0kVar2);
            nko1.H(qim0VarE3, b0kVar2, vu30Var);
            j2iVar2 = j2iVar;
            k4s0.i((i2 >> 9) & 14, j2iVar2, b0kVar2, z3, z3);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new bmg(this, z, z2, vzq0Var, j2iVar2, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0048  */
    /* JADX WARN: Code duplicated, block: B:25:0x0050  */
    /* JADX WARN: Code duplicated, block: B:27:0x0058  */
    /* JADX WARN: Code duplicated, block: B:28:0x005b  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:36:0x0071  */
    /* JADX WARN: Code duplicated, block: B:37:0x0074  */
    /* JADX WARN: Code duplicated, block: B:40:0x0083  */
    /* JADX WARN: Code duplicated, block: B:41:0x0085  */
    /* JADX WARN: Code duplicated, block: B:44:0x008e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:45:0x0090  */
    /* JADX WARN: Code duplicated, block: B:46:0x0093  */
    /* JADX WARN: Code duplicated, block: B:49:0x0098  */
    /* JADX WARN: Code duplicated, block: B:50:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:56:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:63:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:73:0x0162  */
    /* JADX WARN: Code duplicated, block: B:75:0x017a  */
    /* JADX WARN: Code duplicated, block: B:78:0x0185  */
    /* JADX WARN: Code duplicated, block: B:80:? A[RETURN, SYNTHETIC] */
    public final void b(c380 c380Var, qim0 qim0Var, boolean z, String str, vzq0 vzq0Var, b0k b0kVar, int i, int i2) {
        boolean z2;
        int i3;
        String str2;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        boolean z3;
        boolean z4;
        String str3;
        h311 h311VarV;
        boolean z5;
        String str4;
        Context context;
        Object objT;
        Object obj;
        c9n c9nVar;
        Object objT2;
        zu61 zu61Var;
        boolean z6;
        Object objT3;
        ven0 ven0VarG;
        boolean zG;
        Object objT4;
        kv61 kv61Var = this;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-76218759);
        int i9 = (b0kVar2.i(c380Var) ? 4 : 2) | i | (b0kVar2.g(qim0Var) ? 32 : 16);
        int i10 = i2 & 4;
        if (i10 == 0) {
            if ((i & 384) == 0) {
                z2 = z;
                i9 |= b0kVar2.h(z2) ? 256 : 128;
            }
            i3 = i2 & 8;
            if (i3 != 0) {
                i5 = i9 | 3072;
                str2 = str;
            } else {
                str2 = str;
                if (b0kVar2.g(str2)) {
                    i4 = 2048;
                } else {
                    i4 = 1024;
                }
                i5 = i9 | i4;
            }
            if (b0kVar2.g(vzq0Var)) {
                i6 = 16384;
            } else {
                i6 = 8192;
            }
            int i11 = i5 | i6;
            if (b0kVar2.g(kv61Var)) {
                i7 = 131072;
            } else {
                i7 = 65536;
            }
            i8 = i11 | i7;
            if ((74899 & i8) != 74898) {
                z3 = true;
            } else {
                z3 = false;
            }
            if (b0kVar2.Y(i8 & 1, z3)) {
                if (i10 != 0) {
                    z5 = false;
                } else {
                    z5 = z2;
                }
                if (i3 != 0) {
                    str4 = null;
                } else {
                    str4 = str2;
                }
                context = (Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b);
                objT = b0kVar2.T();
                obj = fkj0.X;
                if (objT == obj) {
                    objT = qxd0.M(o6x.a, b0kVar2);
                    b0kVar2.s0(objT);
                }
                c9nVar = (c9n) objT;
                objT2 = b0kVar2.T();
                if (objT2 == obj) {
                    objT2 = new zu61(context);
                    b0kVar2.s0(objT2);
                }
                zu61Var = (zu61) objT2;
                if ((i8 & 14) != 4 || b0kVar2.g(c380Var)) {
                    z6 = true;
                } else {
                    z6 = false;
                }
                objT3 = b0kVar2.T();
                if (z6 || objT3 == obj) {
                    objT3 = d5p1.r(hu20.e(kv61Var.a.a("restrict-settings-for-child", false), new uu61(null, kv61Var, c380Var, zu61Var)), c9nVar, new alb1(0L, Long.MAX_VALUE), 1);
                    b0kVar2.s0(objT3);
                }
                ven0VarG = rwq.g((at71) objT3, fg91.b, (o8n) null, b0kVar2, 48, 2);
                String str5 = str4;
                int i12 = i8 >> 6;
                boolean z7 = z5;
                a(z7, !((c380) ven0VarG.getValue()).isEmpty(), vzq0Var, apo.r(-1541350411, new wnx0(kv61Var, qim0Var, str5, vzq0Var, ven0VarG), b0kVar2), b0kVar2, (i12 & 896) | (i12 & 14) | 3072 | (57344 & (i8 >> 3)));
                kv61Var = this;
                zG = b0kVar2.g(ven0VarG);
                objT4 = b0kVar2.T();
                if (zG || objT4 == obj) {
                    objT4 = new r9y0(ven0VarG, (byte) 21);
                    b0kVar2.s0(objT4);
                }
                kv61Var.i.b(kv61Var.b, (iu30) objT4, b0kVar2, 512);
                str3 = str5;
                z4 = z7;
            } else {
                b0kVar2.b0();
                z4 = z2;
                str3 = str2;
            }
            h311VarV = b0kVar2.v();
            if (h311VarV != null) {
                h311VarV.d = new tu61(kv61Var, c380Var, qim0Var, z4, str3, vzq0Var, i, i2);
            }
        }
        i9 |= 384;
        z2 = z;
        i3 = i2 & 8;
        if (i3 != 0) {
            i5 = i9 | 3072;
            str2 = str;
        } else {
            str2 = str;
            if (b0kVar2.g(str2)) {
                i4 = 2048;
            } else {
                i4 = 1024;
            }
            i5 = i9 | i4;
        }
        if (b0kVar2.g(vzq0Var)) {
            i6 = 16384;
        } else {
            i6 = 8192;
        }
        int i13 = i5 | i6;
        if (b0kVar2.g(kv61Var)) {
            i7 = 131072;
        } else {
            i7 = 65536;
        }
        i8 = i13 | i7;
        if ((74899 & i8) != 74898) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (b0kVar2.Y(i8 & 1, z3)) {
            if (i10 != 0) {
                z5 = false;
            } else {
                z5 = z2;
            }
            if (i3 != 0) {
                str4 = null;
            } else {
                str4 = str2;
            }
            context = (Context) b0kVar2.k(AndroidCompositionLocals_androidKt.b);
            objT = b0kVar2.T();
            obj = fkj0.X;
            if (objT == obj) {
                objT = qxd0.M(o6x.a, b0kVar2);
                b0kVar2.s0(objT);
            }
            c9nVar = (c9n) objT;
            objT2 = b0kVar2.T();
            if (objT2 == obj) {
                objT2 = new zu61(context);
                b0kVar2.s0(objT2);
            }
            zu61Var = (zu61) objT2;
            if ((i8 & 14) != 4) {
                z6 = true;
            } else {
                z6 = true;
            }
            objT3 = b0kVar2.T();
            if (z6) {
                objT3 = d5p1.r(hu20.e(kv61Var.a.a("restrict-settings-for-child", false), new uu61(null, kv61Var, c380Var, zu61Var)), c9nVar, new alb1(0L, Long.MAX_VALUE), 1);
                b0kVar2.s0(objT3);
            } else {
                objT3 = d5p1.r(hu20.e(kv61Var.a.a("restrict-settings-for-child", false), new uu61(null, kv61Var, c380Var, zu61Var)), c9nVar, new alb1(0L, Long.MAX_VALUE), 1);
                b0kVar2.s0(objT3);
            }
            ven0VarG = rwq.g((at71) objT3, fg91.b, (o8n) null, b0kVar2, 48, 2);
            String str6 = str4;
            int i14 = i8 >> 6;
            boolean z8 = z5;
            a(z8, !((c380) ven0VarG.getValue()).isEmpty(), vzq0Var, apo.r(-1541350411, new wnx0(kv61Var, qim0Var, str6, vzq0Var, ven0VarG), b0kVar2), b0kVar2, (i14 & 896) | (i14 & 14) | 3072 | (57344 & (i8 >> 3)));
            kv61Var = this;
            zG = b0kVar2.g(ven0VarG);
            objT4 = b0kVar2.T();
            if (zG) {
                objT4 = new r9y0(ven0VarG, (byte) 21);
                b0kVar2.s0(objT4);
            } else {
                objT4 = new r9y0(ven0VarG, (byte) 21);
                b0kVar2.s0(objT4);
            }
            kv61Var.i.b(kv61Var.b, (iu30) objT4, b0kVar2, 512);
            str3 = str6;
            z4 = z8;
        } else {
            b0kVar2.b0();
            z4 = z2;
            str3 = str2;
        }
        h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new tu61(kv61Var, c380Var, qim0Var, z4, str3, vzq0Var, i, i2);
        }
    }

    public final void c(c380 c380Var, qim0 qim0Var, String str, vzq0 vzq0Var, b0k b0kVar, int i) {
        xtb0 xtb0Var;
        iu30 iu30Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(584273065);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.g(qim0Var) ? 32 : 16) | (x340Var.g(str) ? 256 : 128) | (x340Var.g(vzq0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            Iterator it = c380Var.iterator();
            int size = 0;
            while (it.hasNext()) {
                size += ((av61) it.next()).c.size();
            }
            if (size > 0) {
                x340Var.i0(-1423042721);
                Object objT = x340Var.T();
                if (objT == m4cVar) {
                    objT = yv91.a(new wt41(xtb0VarA, (byte) 2));
                    x340Var.s0(objT);
                }
                tob1 tob1Var = (tob1) objT;
                Object[] objArr = new Object[0];
                Object objT2 = x340Var.T();
                if (objT2 == m4cVar) {
                    objT2 = new bu2(tob1Var, (byte) 20);
                    x340Var.s0(objT2);
                }
                ven0 ven0Var = (ven0) k5p1.s(objArr, (Function0) objT2, x340Var, 48);
                Object[] objArr2 = new Object[0];
                Object objT3 = x340Var.T();
                if (objT3 == m4cVar) {
                    objT3 = w661.a1;
                    x340Var.s0(objT3);
                }
                hdn0 hdn0Var = (hdn0) k5p1.s(objArr2, (Function0) objT3, x340Var, 48);
                Integer numValueOf = Integer.valueOf(size);
                Boolean bool = (Boolean) tob1Var.getValue();
                bool.booleanValue();
                boolean zG = x340Var.g(ven0Var) | x340Var.e(size) | x340Var.g(hdn0Var) | x340Var.g(xtb0VarA);
                Object objT4 = x340Var.T();
                if (zG || objT4 == m4cVar) {
                    xtb0Var = xtb0VarA;
                    objT4 = new tv1(size, xtb0Var, ven0Var, hdn0Var, tob1Var, (lnm) null);
                    x340Var.s0(objT4);
                } else {
                    xtb0Var = xtb0VarA;
                }
                qxd0.s(numValueOf, bool, (vu30) objT4, x340Var);
                x340Var.r(false);
            } else {
                xtb0Var = xtb0VarA;
                x340Var.i0(-1422617959);
                x340Var.r(false);
            }
            if (str == null) {
                x340Var.i0(-1422547311);
                x340Var.r(false);
                iu30Var = null;
            } else {
                x340Var.i0(-1422547310);
                boolean z = (i2 & 896) == 256;
                Object objT5 = x340Var.T();
                if (z || objT5 == m4cVar) {
                    objT5 = new pg61(str, (byte) 4);
                    x340Var.s0(objT5);
                }
                iu30Var = (iu30) objT5;
                x340Var.r(false);
            }
            qim0 qim0VarN = anm1.N("SettingsUI", u291.f(qim0Var, 1.0f));
            av61 av61Var = (av61) o7h.s0(c380Var);
            vzq0 vzq0VarM = (av61Var != null ? av61Var.a : null) != null ? nmn1.m(vzq0Var, (p3v) null, new p3v(0.0f), (p3v) null, (p3v) null, 13) : vzq0Var;
            boolean z2 = (i2 & 14) == 4;
            Object objT6 = x340Var.T();
            if (z2 || objT6 == m4cVar) {
                objT6 = new hbz0(c380Var, (byte) 17);
                x340Var.s0(objT6);
            }
            p6p1.e(iu30Var, qim0VarN, xtb0Var, vzq0VarM, (iu30) objT6, x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wnx0((Object) this, (Object) c380Var, qim0Var, (Object) str, (Object) vzq0Var, i, (byte) 12);
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(vqo vqoVar, String str, onm onmVar) {
        dv61 dv61Var;
        String str2;
        xpw xpwVar;
        String str3;
        tqo tqoVar;
        Object objInvoke;
        if (onmVar instanceof dv61) {
            dv61Var = (dv61) onmVar;
            int i = dv61Var.h;
            if ((i & Integer.MIN_VALUE) != 0) {
                dv61Var.h = i - Integer.MIN_VALUE;
            } else {
                dv61Var = new dv61(this, onmVar);
            }
        } else {
            dv61Var = new dv61(this, onmVar);
        }
        Object obj = dv61Var.f;
        int i2 = dv61Var.h;
        lnm lnmVar = null;
        if (i2 == 0) {
            hm5.M(obj);
            str2 = vqoVar.a;
            xpwVar = (xpw) vqoVar.e.get();
            tqo tqoVar2 = vqoVar.f;
            if (tqoVar2 instanceof sqo) {
                objInvoke = ((sqo) tqoVar2).b.invoke(vqoVar.b);
            } else {
                if (!(tqoVar2 instanceof qqo)) {
                    eg.o();
                    return null;
                }
                lm61 lm61Var = new lm61(tqoVar2, vqoVar, lnmVar, (byte) 2);
                dv61Var.a = vqoVar;
                dv61Var.b = (qqo) tqoVar2;
                dv61Var.c = str;
                dv61Var.d = str2;
                dv61Var.e = xpwVar;
                dv61Var.h = 1;
                Object objP = rc2.P(f19p, lm61Var, dv61Var);
                d9n d9nVar = d9n.a;
                if (objP == d9nVar) {
                    return d9nVar;
                }
                str3 = str2;
                obj = objP;
                tqoVar = tqoVar2;
            }
            return new wu61(str, str2, xpwVar, objInvoke);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        xpw xpwVar2 = dv61Var.e;
        String str4 = dv61Var.d;
        String str5 = dv61Var.c;
        tqoVar = dv61Var.b;
        vqo vqoVar2 = dv61Var.a;
        hm5.M(obj);
        xpwVar = xpwVar2;
        vqoVar = vqoVar2;
        str3 = str4;
        str = str5;
        objInvoke = obj == null ? ((qqo) tqoVar).b.invoke(vqoVar.b) : obj;
        str2 = str3;
        return new wu61(str, str2, xpwVar, objInvoke);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x007c  */
    /* JADX WARN: Code duplicated, block: B:19:0x0084  */
    /* JADX WARN: Code duplicated, block: B:21:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:22:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:25:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:27:0x00d4 A[LOOP:0: B:23:0x00c6->B:27:0x00d4, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:33:0x0138 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:34:0x0139  */
    /* JADX WARN: Code duplicated, block: B:41:0x0112 A[SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:34:0x0139 -> B:35:0x0144). Please report as a decompilation issue!!! */
    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions stack size limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    public final java.lang.Object g(java.util.List r19, p.zu61 r20, boolean r21, p.onm r22) throws java.lang.Throwable {
        /*
            Method dump skipped, instruction units count: 385
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.kv61.g(java.util.List, p.zu61, boolean, p.onm):java.lang.Object");
    }
}
