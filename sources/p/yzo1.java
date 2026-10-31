package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.inputmethod.ExtractedText;
import android.widget.TextView;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.unit.TextUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class yzo1 {
    public static b180 a;
    public static b180 b;

    public static final void a(int i, Function0 function0, j2i j2iVar, b0k b0kVar, qim0 qim0Var) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1667421116);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.i(function0) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            gdx gdxVarR = yla.r(b0kVar3);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(cbx.b(b0kVar3).b.a, 0.0f, cbx.b(b0kVar3).b.a, 12.0f);
            ldx ldxVar = ldx.c;
            String strO0 = cwl1.o0(b0kVar3, 2131951805);
            boolean z = (i2 & 14) == 4;
            Object objT = b0kVar3.T();
            if (z || objT == fkj0.X) {
                objT = new aba0(function0, (byte) 16);
                b0kVar3.s0(objT);
            }
            b0kVar2 = b0kVar3;
            foo1.c(new gbx(new y50(strO0), (Function0) objT), ldxVar, qim0Var, null, gdxVarR, zzq0Var, null, null, null, wvi.a, apo.r(-1723566235, new ak10(j2iVar, (byte) 13), b0kVar3), b0kVar2, (i2 << 3) & 896, 54, 920);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pv50(function0, qim0Var, j2iVar, i, (byte) 1);
        }
    }

    public static final void b(String str, String str2, c380 c380Var, int i, TextUnit textUnit, int i2, j2i j2iVar, iu30 iu30Var, b0k b0kVar, int i3) {
        int i4;
        String str3;
        j2i j2iVar2;
        era eraVar;
        long j;
        pbh pbhVar;
        boolean z;
        float f;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(690637055);
        int i5 = i3 & 6;
        pbh pbhVar2 = pbh.a;
        if (i5 == 0) {
            i4 = (b0kVar2.i(pbhVar2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            str3 = str;
            i4 |= b0kVar2.g(str3) ? 32 : 16;
        } else {
            str3 = str;
        }
        if ((i3 & 384) == 0) {
            i4 |= b0kVar2.g(str2) ? 256 : 128;
        }
        if ((i3 & 3072) == 0) {
            i4 |= b0kVar2.i(c380Var) ? 2048 : 1024;
        }
        if ((i3 & 24576) == 0) {
            i4 |= b0kVar2.e(i) ? 16384 : 8192;
        }
        if ((196608 & i3) == 0) {
            i4 |= b0kVar2.g(textUnit) ? 131072 : 65536;
        }
        if ((1572864 & i3) == 0) {
            i4 |= b0kVar2.e(i2) ? 1048576 : 524288;
        }
        if ((12582912 & i3) == 0) {
            i4 |= b0kVar2.i(j2iVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i3) == 0) {
            i4 |= b0kVar2.i(iu30Var) ? 67108864 : 33554432;
        }
        int i6 = i4;
        if (b0kVar2.Y(i6 & 1, (i6 & 38347923) != 38347922)) {
            if (i == 5 || i == 1) {
                eraVar = een.P0;
            } else {
                eraVar = (i == 6 || i == 2) ? een.R0 : een.Q0;
            }
            nim0 nim0Var = nim0.a;
            qim0 qim0VarC = pbhVar2.c(eraVar, nim0Var);
            if (textUnit == null) {
                b0kVar2.i0(-2017705305);
                uwr uwrVar = cbx.a;
                j = cbx.d(b0kVar2).c.a.b;
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-2017706824);
                b0kVar2.r(false);
                j = textUnit.a;
            }
            int i7 = i6 >> 6;
            long j2 = j;
            nim0 nim0Var2 = nim0Var;
            g0p1.r(str3, qim0VarC, i, j2, b0kVar2, ((i6 >> 3) & 14) | (i7 & 896), 0);
            if (str2 != null) {
                b0kVar2.i0(1875696571);
                uwr uwrVar2 = cbx.a;
                pbhVar = pbhVar2;
                uwo1.e(str2, uyn1.z(cbx.b(b0kVar2).b.a, 0.0f, 2, ab80.o(nim0Var2, cbx.b(b0kVar2).b.c, b0kVar2, nim0Var2, 1.0f)), cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, new a0e1(i), null, 0, false, null, 0, null, b0kVar2, (i7 & 14) | (i6 & 57344), 0, 2016);
                b0kVar2 = b0kVar2;
                cvx cvxVar = cbx.b(b0kVar2).b;
                f = 8.0f;
                nim0Var2 = nim0Var2;
                z = false;
            } else {
                pbhVar = pbhVar2;
                z = false;
                b0kVar2.i0(1876112436);
                uwr uwrVar3 = cbx.a;
                f = cbx.b(b0kVar2).b.a;
            }
            x0d.s(nim0Var2, f, b0kVar2, z);
            int i8 = i6 >> 9;
            b0k b0kVar3 = b0kVar2;
            zzo1.i(c380Var, uyn1.B(u291.f(nim0Var2, 1.0f), cbx.b(b0kVar2).b.a, 0.0f, cbx.b(b0kVar2).b.a, 0.0f, 10), cbx.d(b0kVar2).g, cbx.a(b0kVar2).b.b, i2, iu30Var, b0kVar3, (i8 & 14) | (i7 & 57344) | (i8 & 458752), 0);
            b0kVar2 = b0kVar3;
            j2iVar2 = j2iVar;
            j2iVar2.invoke(pbhVar, b0kVar2, Integer.valueOf((i6 & 14) | ((i6 >> 18) & 112)));
        } else {
            j2iVar2 = j2iVar;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new i2j1(str, str2, c380Var, i, textUnit, i2, j2iVar2, iu30Var, i3);
        }
    }

    public static final void c(int i, String str, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        int i2;
        Function0 function1;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(470476064);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function1 = function0;
            i2 |= x340Var.i(function1) ? 32 : 16;
        } else {
            function1 = function0;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            ung ungVar = (ung) x340Var.k(t4k.f);
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = qxd0.M(o6x.a, x340Var);
                x340Var.s0(objT);
            }
            c9n c9nVar = (c9n) objT;
            String strO0 = cwl1.o0(x340Var, 2131962300);
            boolean zI = ((i2 & 112) == 32) | x340Var.i(c9nVar) | x340Var.i(ungVar) | x340Var.g(strO0) | ((i2 & 14) == 4) | x340Var.i(context);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                ndp0 ndp0Var = new ndp0(function1, c9nVar, ungVar, strO0, str, context, (byte) 6);
                x340Var.s0(ndp0Var);
                objT2 = ndp0Var;
            }
            d(str, new gbx(z50.c, (Function0) objT2), qim0Var, x340Var, i2 & 910);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new o82(str, function0, qim0Var, i, (byte) 14);
        }
    }

    public static final void d(String str, gbx gbxVar, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(788731291);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(gbxVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.i(qim0Var) ? 256 : 128;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            Object objT = b0kVar3.T();
            if (objT == fkj0.X) {
                objT = s571.P0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0Var, true, (iu30) objT);
            ogx ogxVar = ogx.e;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(b0kVar3).f;
            cr31 cr31VarB = er31.b(4.0f);
            cvx cvxVar = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            cwl1.b(qim0VarB, (tl3) null, cr31VarB, ogxVar, new zzq0(12.0f, 12.0f, 12.0f, 12.0f), (max) null, false, (idn0) null, ny3.a, gbxVar, (gbx) null, apo.r(819016836, new iww0(str, (byte) 24), b0kVar3), b0kVar2, (i2 << 24) & 1879048192, 48, 1250);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new kk31(str, gbxVar, qim0Var, i, (byte) 16);
        }
    }

    public static final void e(String str, Function0 function0, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1174007362);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(str) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.i(j2iVar) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("group-listening-activity-button-test-tag", qim0Var3);
            boolean z = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new z9b0(str, (byte) 6);
                x340Var.s0(objT);
            }
            a((i3 >> 3) & 910, function0, j2iVar, x340Var, s161.a(qim0VarN, (iu30) objT));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nca0(i, str, function0, qim0Var2, j2iVar, (byte) 12);
        }
    }

    public static final void f(boolean z, String str, String str2, String str3, String str4, Function0 function0, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(456402335);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.g(str) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.g(str3) ? 2048 : 1024) | (x340Var.g(str4) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | 1572864;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            qim0 qim0Var3 = nim0.a;
            a(((i2 >> 15) & 14) | 384, function0, apo.r(497498490, new ey(z, (Object) str3, (Object) str4, (Object) str2, (Object) str, (byte) 25), x340Var), x340Var, anm1.N("listening-activity-button-test-tag", qim0Var3));
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(z, str, str2, str3, str4, function0, qim0Var2, i);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void g(bot0 bot0Var, boolean z, fit0 fit0Var, dmq dmqVar, emq emqVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        w9e0 w9e0Var;
        boolean z2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(277056920);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(bot0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.h(z) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(fit0Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= (i & 4096) == 0 ? x340Var.g(dmqVar) : x340Var.i(dmqVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var.g(emqVar) : x340Var.i(emqVar) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var.i(iu30Var) ? 131072 : 65536;
        }
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarD);
            hzj.A.getClass();
            if (x340Var.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(hmb0.t1);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                ojq ojqVar = (ojq) dmqVar.a.c;
                yqg yqgVar = (yqg) ((jiz0) ojqVar.b).k.get();
                c8o.l(yqgVar);
                objT = new bae0(yqgVar, (zja1) ojqVar.f.get(), (sip) ojqVar.h.get());
                x340Var.s0(objT);
            }
            bae0 bae0Var = (bae0) objT;
            art0 art0Var = bot0Var.g;
            int i3 = bot0Var.c;
            List list = bot0Var.f;
            if (art0Var instanceof art0) {
                x340Var.i0(1270070716);
                xp31 xp31Var = (xp31) o7h.t0(i3, list);
                if (xp31Var == null) {
                    x340Var.i0(1270182904);
                    x340Var.r(false);
                    z2 = false;
                } else {
                    x340Var.i0(1270182905);
                    int i4 = bot0Var.c;
                    int size = list.size();
                    zbe0 zbe0Var = art0Var.a;
                    if (u890.j(zbe0Var, cbe0.a)) {
                        w9e0Var = w9e0.a;
                    } else if (zbe0Var instanceof uae0) {
                        w9e0Var = v9e0.a;
                    } else {
                        if (!u890.j(zbe0Var, abe0.a)) {
                            eg.o();
                            return;
                        }
                        w9e0Var = u9e0.a;
                    }
                    w9e0 w9e0Var2 = w9e0Var;
                    String str = xp31Var.a;
                    String str2 = xp31Var.b;
                    int i5 = i2;
                    List list2 = xp31Var.c;
                    pbf0 pbf0Var = bot0Var.e;
                    if (pbf0Var == null) {
                        pbf0Var = new pbf0("", b7x.a);
                    }
                    pbf0 pbf0Var2 = pbf0Var;
                    String str3 = xp31Var.d;
                    pbf0 pbf0Var3 = xp31Var.e;
                    int i6 = i5 & 458752;
                    boolean z3 = i6 == 131072;
                    Object objT2 = x340Var.T();
                    if (z3 || objT2 == m4cVar) {
                        objT2 = new g0s0(iu30Var, (byte) 28);
                        x340Var.s0(objT2);
                    }
                    Function0 function0 = (Function0) objT2;
                    boolean z4 = i6 == 131072;
                    Object objT3 = x340Var.T();
                    if (z4 || objT3 == m4cVar) {
                        objT3 = new g0s0(iu30Var, (byte) 29);
                        x340Var.s0(objT3);
                    }
                    z2 = false;
                    otw.c(bae0Var, new z9e0(i4, size, w9e0Var2, str, str2, list2, pbf0Var2, str3, pbf0Var3, function0, (Function0) objT3), u291.d(nim0Var, 1.0f), (ipb1) null, x340Var, 0, 8);
                    x340Var.r(false);
                }
                x340Var.r(z2);
            } else {
                int i7 = i2;
                if (!(art0Var instanceof prt0)) {
                    throw p3d1.k(x340Var, -1067409541, false);
                }
                x340Var.i0(1271390696);
                boolean z5 = i3 == bot0Var.d + (-1);
                boolean z6 = bot0Var.h instanceof jhz0;
                String str4 = fit0Var.b;
                vp31 vp31Var = ((prt0) art0Var).a;
                String str5 = vp31Var.c;
                int i8 = i7 & 458752;
                boolean z7 = i8 == 131072;
                Object objT4 = x340Var.T();
                if (z7 || objT4 == m4cVar) {
                    objT4 = new azr0(iu30Var, (byte) 13);
                    x340Var.s0(objT4);
                }
                iu30 iu30Var2 = (iu30) objT4;
                boolean z8 = i8 == 131072;
                Object objT5 = x340Var.T();
                if (z8 || objT5 == m4cVar) {
                    objT5 = new azr0(iu30Var, (byte) 14);
                    x340Var.s0(objT5);
                }
                gq31 gq31Var = new gq31(str4, str5, vp31Var, z5, z6, z, iu30Var2, (iu30) objT5);
                boolean zG = x340Var.g(vp31Var.a);
                Object objT6 = x340Var.T();
                if (zG || objT6 == m4cVar) {
                    ojq ojqVar2 = (ojq) emqVar.a.c;
                    fmq fmqVar = (fmq) ojqVar2.N0.get();
                    hlq hlqVar = (hlq) ojqVar2.O0.get();
                    ilq ilqVar = (ilq) ojqVar2.X0.get();
                    slq slqVar = (slq) ojqVar2.g1.get();
                    yqg yqgVar2 = (yqg) ((jiz0) ojqVar2.b).k.get();
                    c8o.l(yqgVar2);
                    objT6 = new iq31(gq31Var, fmqVar, hlqVar, ilqVar, slqVar, yqgVar2);
                    x340Var.s0(objT6);
                }
                iq31 iq31Var = (iq31) objT6;
                ipb1 ipb1VarC = wpb1.C(vp31Var.a, iq31Var, gq31Var, x340Var, 0, 8);
                x340Var = x340Var;
                otw.c(iq31Var, gq31Var, (qim0) null, ipb1VarC, x340Var, 0, 4);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new si2(bot0Var, z, fit0Var, dmqVar, emqVar, iu30Var, i);
        }
    }

    public static final void h(int i, String str, Function0 function0, Function0 function1, b0k b0kVar, qim0 qim0Var) {
        String str2;
        Function0 function2;
        qim0 qim0Var2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1954448923);
        j06 j06Var = ((x340) b0kVar2).a;
        int i2 = i | (b0kVar2.i(function0) ? 32 : 16) | (b0kVar2.i(function1) ? 256 : 128) | 3072;
        if (b0kVar2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            u85 u85Var = (erl1) b0kVar2.k(szf0.b);
            if (u85Var == null) {
                b0kVar2.i0(-241884180);
                WeakHashMap weakHashMap = osl1.x;
                u85Var = lhc.g(b0kVar2).g;
            } else {
                b0kVar2.i0(-241885792);
            }
            b0kVar2.r(false);
            qim0 qim0VarJ = too1.j(qim0VarF, new bgc0(u85Var, 16));
            mbh mbhVarA = jbh.a(h36.c, een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarJ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, b0kVar2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, b0kVar2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, b0kVar2, lljVar3);
            nko1.F(b0kVar2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, b0kVar2, lljVar4);
            qim0Var2 = qim0Var3;
            bzn1.e(null, chj.a, false, null, rgr0.a, null, null, null, b0kVar2, 48, 237);
            rqo1.g(0, 1, b0kVar2, null);
            qim0 qim0VarH = l6o1.H(u291.f(qim0Var2, 1.0f), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            WeakHashMap weakHashMap2 = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar2).g, 32, qim0VarH);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            qim0 qim0VarA = uyn1.A(qim0VarP, 16.0f, 12.0f, 16.0f, 16.0f);
            era eraVar = een.Q0;
            cvx cvxVar5 = cbx.b(b0kVar2).b;
            mbh mbhVarA2 = jbh.a(new d36(16.0f, true, new um5(false)), eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarA);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, lljVar2);
            x0d.q(iHashCode2, b0kVar2, lljVar3, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar4);
            uwo1.e(cwl1.o0(b0kVar2, 2131962301), u291.f(qim0Var2, 1.0f), cbx.d(b0kVar2).g, 0L, new a0e1(3), null, 0, false, null, 0, null, b0kVar2, 0, 0, 2024);
            foo1.c(new gbx(z50.c, function1), jdx.c, null, null, null, null, null, null, null, null, chj.b, b0kVar2, 0, 48, 2044);
            b0kVar2 = b0kVar2;
            str2 = str;
            function2 = function0;
            c(i2 & 126, str2, function2, b0kVar2, u291.f(qim0Var2, 1.0f));
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            str2 = str;
            function2 = function0;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new aur0(str2, function2, function1, qim0Var2, i, (byte) 1);
        }
    }

    public static final void i(jtl1 jtl1Var, String str, String str2, c380 c380Var, int i, j2i j2iVar, qim0 qim0Var, String str3, a0e1 a0e1Var, TextUnit textUnit, iu30 iu30Var, b0k b0kVar, int i2, int i3) {
        int i4;
        int i5;
        int i6;
        x340 x340Var;
        qim0 qim0Var2;
        String str4;
        a0e1 a0e1Var2;
        TextUnit textUnit2;
        String str5;
        qim0 qim0Var3;
        TextUnit textUnit3;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        Float fValueOf = Float.valueOf(1.0f);
        Float fValueOf2 = Float.valueOf(2.2f);
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1894283265);
        j06 j06Var = x340Var2.a;
        int i7 = i2 | (x340Var2.i(jtl1Var) ? 4 : 2) | (x340Var2.g(str) ? 32 : 16) | (x340Var2.g(str2) ? 256 : 128) | (x340Var2.i(c380Var) ? 2048 : 1024) | (x340Var2.e(i) ? 16384 : 8192);
        int i8 = i7 | 1572864;
        int i9 = i3 & 128;
        if (i9 != 0) {
            i4 = i7 | 14155776;
        } else {
            i4 = i8 | (x340Var2.g(str3) ? 8388608 : 4194304);
        }
        int i10 = i3 & 256;
        if (i10 != 0) {
            i5 = i4 | 100663296;
        } else {
            i5 = i4 | (x340Var2.g(a0e1Var) ? 67108864 : 33554432);
        }
        int i11 = i3 & 512;
        if (i11 != 0) {
            i6 = i5 | 805306368;
        } else {
            i6 = i5 | (x340Var2.g(textUnit) ? 536870912 : 268435456);
        }
        int i12 = i6;
        int i13 = x340Var2.i(iu30Var) ? 4 : 2;
        if (x340Var2.Y(i12 & 1, ((i12 & 306783379) == 306783378 && (i13 & 3) == 2) ? false : true)) {
            String str6 = i9 != 0 ? null : str3;
            a0e1 a0e1Var3 = i10 != 0 ? null : a0e1Var;
            TextUnit textUnit4 = i11 != 0 ? null : textUnit;
            htl1 htl1Var = (htl1) f4p1.k(jtl1Var.b, (iac0) null, x340Var2, 7).getValue();
            boolean zJ = u890.j(htl1Var != null ? htl1Var.b : null, brl1.b);
            f36 f36Var = h36.c;
            n4k n4kVar = hmb0.t1;
            qim0 qim0Var4 = nim0.a;
            if (zJ) {
                str5 = str6;
                x340Var2.i0(1018036643);
                jw31 jw31VarA = ew31.a(h36.a, een.N0, x340Var2, 0);
                int iHashCode = Long.hashCode(x340Var2.T);
                xos0 xos0VarM = x340Var2.m();
                qim0 qim0VarE = zr7.E(x340Var2, qim0Var4);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, x340Var2, lljVar4);
                nko1.H(xos0VarM, x340Var2, lljVar3);
                x0d.q(iHashCode, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE, x340Var2, lljVar);
                mmr0 mmr0Var = new mmr0(fValueOf2, fValueOf);
                if (1.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                int i14 = i12 >> 3;
                xzo1.h(str, mmr0Var, new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), x340Var2, (i14 & 14) | 48, 0);
                if (2.0f <= 0.0d) {
                    of80.a("invalid weight; must be greater than zero");
                }
                qim0 qim0VarF = u291.f(new wnb0(2.0f <= Float.MAX_VALUE ? 2.0f : Float.MAX_VALUE, true), 1.0f);
                mbh mbhVarA = jbh.a(f36Var, een.P0, x340Var2, 0);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA, x340Var2, lljVar4);
                nko1.H(xos0VarM2, x340Var2, lljVar3);
                x0d.q(iHashCode2, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE2, x340Var2, lljVar);
                textUnit3 = textUnit4;
                b(str2, str5, c380Var, a0e1Var3 != null ? a0e1Var3.a : 1, textUnit3, i, j2iVar, iu30Var, x340Var2, 6 | (i14 & 112) | ((i12 >> 15) & 896) | (i12 & 7168) | ((i12 >> 12) & 458752) | ((i12 << 6) & 3670016) | 12582912 | ((i13 << 24) & 234881024));
                us71.m(x340Var2, true, true, false);
                qim0Var3 = qim0Var4;
                x340Var = x340Var2;
            } else {
                str5 = str6;
                TextUnit textUnit5 = textUnit4;
                x340Var2.i0(1018736127);
                qim0Var3 = qim0Var4;
                qim0 qim0VarF2 = u291.f(qim0Var3, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, x340Var2, lljVar4);
                nko1.H(xos0VarM3, x340Var2, lljVar3);
                x0d.q(iHashCode3, x340Var2, lljVar2, x340Var2);
                nko1.H(qim0VarE3, x340Var2, lljVar);
                int i15 = i12 >> 3;
                xzo1.h(str, new mmr0(fValueOf2, fValueOf), null, x340Var2, (i15 & 14) | 48, 4);
                x340Var = x340Var2;
                uwr uwrVar = cbx.a;
                op71.g(x340Var, u291.h(qim0Var3, cbx.b(x340Var).b.c));
                textUnit3 = textUnit5;
                b(str2, str5, c380Var, a0e1Var3 != null ? a0e1Var3.a : 3, textUnit3, i, j2iVar, iu30Var, x340Var, 6 | (i15 & 112) | ((i12 >> 15) & 896) | (i12 & 7168) | ((i12 >> 12) & 458752) | ((i12 << 6) & 3670016) | 12582912 | ((i13 << 24) & 234881024));
                x340Var.r(true);
                x340Var.r(false);
            }
            a0e1Var2 = a0e1Var3;
            qim0Var2 = qim0Var3;
            textUnit2 = textUnit3;
            str4 = str5;
        } else {
            x340Var = x340Var2;
            x340Var.b0();
            qim0Var2 = qim0Var;
            str4 = str3;
            a0e1Var2 = a0e1Var;
            textUnit2 = textUnit;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mj2(jtl1Var, str, str2, c380Var, i, j2iVar, qim0Var2, str4, a0e1Var2, textUnit2, iu30Var, i2, i3);
        }
    }

    public static ay8 j(Object obj, vu30 vu30Var) {
        return new ay8(gio1.b(obj), ygn0.a(), new AtomicInteger(0), new p811(), vu30Var, o6x.a);
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:331:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String k(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "kotlin.Double.Companion";
            case "java.lang.Integer":
                return "kotlin.Int";
            case "java.lang.Cloneable":
                return "kotlin.Cloneable";
            case "java.lang.annotation.Annotation":
                return "kotlin.Annotation";
            case "java.lang.Comparable":
                return "kotlin.Comparable";
            case "java.util.Map":
                return "kotlin.collections.Map";
            case "java.util.Set":
                return "kotlin.collections.Set";
            case "double":
                return "kotlin.Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "kotlin.Byte.Companion";
            case "java.lang.CharSequence":
                return "kotlin.CharSequence";
            case "java.util.Collection":
                return "kotlin.collections.Collection";
            case "java.lang.Float":
                return "kotlin.Float";
            case "java.lang.Short":
                return "kotlin.Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "kotlin.Char.Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "kotlin.Long.Companion";
            case "java.util.Map$Entry":
                return "kotlin.collections.Map.Entry";
            case "int":
                return "kotlin.Int";
            case "byte":
                return "kotlin.Byte";
            case "char":
                return "kotlin.Char";
            case "long":
                return "kotlin.Long";
            case "boolean":
                return "kotlin.Boolean";
            case "java.util.List":
                return "kotlin.collections.List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "kotlin.Short.Companion";
            case "float":
                return "kotlin.Float";
            case "short":
                return "kotlin.Short";
            case "java.lang.Character":
                return "kotlin.Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "kotlin.Enum.Companion";
            case "java.lang.Boolean":
                return "kotlin.Boolean";
            case "java.lang.Byte":
                return "kotlin.Byte";
            case "java.lang.Enum":
                return "kotlin.Enum";
            case "java.lang.Long":
                return "kotlin.Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "kotlin.Float.Companion";
            case "java.util.Iterator":
                return "kotlin.collections.Iterator";
            case "java.util.ListIterator":
                return "kotlin.collections.ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "kotlin.String.Companion";
            case "java.lang.Double":
                return "kotlin.Double";
            case "java.lang.Number":
                return "kotlin.Number";
            case "java.lang.Object":
                return "kotlin.Any";
            case "java.lang.String":
                return "kotlin.String";
            case "java.lang.Iterable":
                return "kotlin.collections.Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "kotlin.Boolean.Companion";
            case "java.lang.Throwable":
                return "kotlin.Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "kotlin.Int.Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "kotlin.Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "kotlin.Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "kotlin.Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "kotlin.Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "kotlin.Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "kotlin.Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "kotlin.Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "kotlin.Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "kotlin.Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "kotlin.Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "kotlin.Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "kotlin.Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "kotlin.Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "kotlin.Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "kotlin.Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "kotlin.Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "kotlin.Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "kotlin.Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "kotlin.Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "kotlin.Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "kotlin.Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "kotlin.Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "kotlin.Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static ezo l(hc3 hc3Var, lc3 lc3Var, q7r0 q7r0Var, rih1 rih1Var) {
        hc3Var.getClass();
        rih1Var.getClass();
        return new ezo(hc3Var, lc3Var, q7r0Var);
    }

    public static final String m(List list) {
        List list2 = list;
        if (list2 == null || list2.isEmpty()) {
            return null;
        }
        return (String) o7h.q0(list);
    }

    public static final String n(vno1 vno1Var) {
        if (vno1Var instanceof asz0) {
            return "★ ".concat(String.format("%.1f", Arrays.copyOf(new Object[]{Double.valueOf(((asz0) vno1Var).c)}, 1)));
        }
        return null;
    }

    public static final void o(z2s z2sVar, iac0 iac0Var, twa twaVar, iu30 iu30Var, Function0 function0, boolean z, vu30 vu30Var, ArrayList arrayList, boolean z2, ArrayList arrayList2, iu30 iu30Var2, Context context) {
        z2sVar.R(ito.class, new qm91(iu30Var, z, function0, z2, arrayList, new ood1(arrayList, twaVar, context, iu30Var2, arrayList2, iac0Var, vu30Var)), new k011(arrayList, (byte) 5), kmd1.e1, kmd1.d1, false, imd1.d1);
    }

    public static final void p(TextView textView) {
        j4b1 j4b1Var = j4b1.O1;
        Context context = textView.getContext();
        g4b1 g4b1Var = new g4b1(context, j4b1Var, context.getResources().getDimension(2131167135));
        g4b1Var.b(context.getColor(2131104462));
        textView.setCompoundDrawablesRelativeWithIntrinsicBounds((Drawable) null, (Drawable) null, (Drawable) g4b1Var, (Drawable) null);
    }

    /* JADX WARN: Failed to clean up code after switch over string restore
    jadx.core.utils.exceptions.JadxRuntimeException: Can't remove SSA var: r0v0 int, still in use, count: 3, list:
      (r0v0 int) from 0x0007: SWITCH (r0v0 int)
     case -1811142716: goto B:118:0x0130
     case -1811142715: goto B:113:0x0123
     case -1811142714: goto B:108:0x0116
     case -1811142713: goto B:103:0x0109
     case -1811142712: goto B:98:0x00fc
     case -1811142711: goto B:93:0x00ef
     case -1811142710: goto B:88:0x00e2
     case -1811142709: goto B:83:0x00d5
     case -1811142708: goto B:78:0x00c8
     case -1811142707: goto B:73:0x00bb
     default: goto B:5:0x000a A[RegionRef:SW:4] (LINE:8)
      (r0v0 int) from 0x000a: SWITCH (r0v0 int)
     case -1811142685: goto B:68:0x00ae
     case -1811142684: goto B:63:0x00a1
     case -1811142683: goto B:58:0x0094
     default: goto B:6:0x000d A[RegionRef:SW:5] (LINE:11)
      (r0v0 int) from 0x000d: SWITCH (r0v0 int)
     case 80123371: goto B:53:0x0087
     case 80123372: goto B:48:0x007a
     case 80123373: goto B:43:0x006d
     case 80123374: goto B:38:0x0060
     case 80123375: goto B:33:0x0053
     case 80123376: goto B:28:0x0046
     case 80123377: goto B:23:0x0039
     case 80123378: goto B:18:0x002c
     case 80123379: goto B:13:0x001f
     case 80123380: goto B:8:0x0012
     default: goto B:313:? A[RegionRef:SW:6] (LINE:14)
    	at jadx.core.utils.InsnRemover.removeSsaVar(InsnRemover.java:164)
    	at jadx.core.utils.InsnRemover.unbindResult(InsnRemover.java:129)
    	at jadx.core.utils.InsnRemover.unbindInsn(InsnRemover.java:93)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:226)
    	at jadx.core.utils.InsnRemover.remove(InsnRemover.java:215)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.replaceWithMergedSwitch(SwitchOverStringVisitor.java:355)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:111)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:72)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:140)
    	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterative(DepthRegionTraversal.java:47)
    	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visit(SwitchOverStringVisitor.java:66)
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static String q(String str) {
        switch (str) {
            case "kotlin.jvm.internal.DoubleCompanionObject":
                return "Companion";
            case "java.lang.Integer":
                return "Int";
            case "java.lang.Cloneable":
                return "Cloneable";
            case "java.lang.annotation.Annotation":
                return "Annotation";
            case "java.lang.Comparable":
                return "Comparable";
            case "java.util.Map":
                return "Map";
            case "java.util.Set":
                return "Set";
            case "double":
                return "Double";
            case "kotlin.jvm.internal.ByteCompanionObject":
                return "Companion";
            case "java.lang.CharSequence":
                return "CharSequence";
            case "java.util.Collection":
                return "Collection";
            case "java.lang.Float":
                return "Float";
            case "java.lang.Short":
                return "Short";
            case "kotlin.jvm.internal.CharCompanionObject":
                return "Companion";
            case "kotlin.jvm.internal.LongCompanionObject":
                return "Companion";
            case "java.util.Map$Entry":
                return "Entry";
            case "int":
                return "Int";
            case "byte":
                return "Byte";
            case "char":
                return "Char";
            case "long":
                return "Long";
            case "boolean":
                return "Boolean";
            case "java.util.List":
                return "List";
            case "kotlin.jvm.internal.ShortCompanionObject":
                return "Companion";
            case "float":
                return "Float";
            case "short":
                return "Short";
            case "java.lang.Character":
                return "Char";
            case "kotlin.jvm.internal.EnumCompanionObject":
                return "Companion";
            case "java.lang.Boolean":
                return "Boolean";
            case "java.lang.Byte":
                return "Byte";
            case "java.lang.Enum":
                return "Enum";
            case "java.lang.Long":
                return "Long";
            case "kotlin.jvm.internal.FloatCompanionObject":
                return "Companion";
            case "java.util.Iterator":
                return "Iterator";
            case "java.util.ListIterator":
                return "ListIterator";
            case "kotlin.jvm.internal.StringCompanionObject":
                return "Companion";
            case "java.lang.Double":
                return "Double";
            case "java.lang.Number":
                return "Number";
            case "java.lang.Object":
                return "Any";
            case "java.lang.String":
                return "String";
            case "java.lang.Iterable":
                return "Iterable";
            case "kotlin.jvm.internal.BooleanCompanionObject":
                return "Companion";
            case "java.lang.Throwable":
                return "Throwable";
            case "kotlin.jvm.internal.IntCompanionObject":
                return "Companion";
            default:
                switch (str) {
                    case -1811142716:
                        if (str.equals("kotlin.jvm.functions.Function10")) {
                            return "Function10";
                        }
                        return null;
                    case -1811142715:
                        if (str.equals("kotlin.jvm.functions.Function11")) {
                            return "Function11";
                        }
                        return null;
                    case -1811142714:
                        if (str.equals("kotlin.jvm.functions.Function12")) {
                            return "Function12";
                        }
                        return null;
                    case -1811142713:
                        if (str.equals("kotlin.jvm.functions.Function13")) {
                            return "Function13";
                        }
                        return null;
                    case -1811142712:
                        if (str.equals("kotlin.jvm.functions.Function14")) {
                            return "Function14";
                        }
                        return null;
                    case -1811142711:
                        if (str.equals("kotlin.jvm.functions.Function15")) {
                            return "Function15";
                        }
                        return null;
                    case -1811142710:
                        if (str.equals("kotlin.jvm.functions.Function16")) {
                            return "Function16";
                        }
                        return null;
                    case -1811142709:
                        if (str.equals("kotlin.jvm.functions.Function17")) {
                            return "Function17";
                        }
                        return null;
                    case -1811142708:
                        if (str.equals("kotlin.jvm.functions.Function18")) {
                            return "Function18";
                        }
                        return null;
                    case -1811142707:
                        if (str.equals("kotlin.jvm.functions.Function19")) {
                            return "Function19";
                        }
                        return null;
                    default:
                        switch (str) {
                            case -1811142685:
                                if (str.equals("kotlin.jvm.functions.Function20")) {
                                    return "Function20";
                                }
                                return null;
                            case -1811142684:
                                if (str.equals("kotlin.jvm.functions.Function21")) {
                                    return "Function21";
                                }
                                return null;
                            case -1811142683:
                                if (str.equals("kotlin.jvm.functions.Function22")) {
                                    return "Function22";
                                }
                                return null;
                            default:
                                switch (str) {
                                    case 80123371:
                                        if (str.equals("kotlin.jvm.functions.Function0")) {
                                            return "Function0";
                                        }
                                        return null;
                                    case 80123372:
                                        if (str.equals("kotlin.jvm.functions.Function1")) {
                                            return "Function1";
                                        }
                                        return null;
                                    case 80123373:
                                        if (str.equals("kotlin.jvm.functions.Function2")) {
                                            return "Function2";
                                        }
                                        return null;
                                    case 80123374:
                                        if (str.equals("kotlin.jvm.functions.Function3")) {
                                            return "Function3";
                                        }
                                        return null;
                                    case 80123375:
                                        if (str.equals("kotlin.jvm.functions.Function4")) {
                                            return "Function4";
                                        }
                                        return null;
                                    case 80123376:
                                        if (str.equals("kotlin.jvm.functions.Function5")) {
                                            return "Function5";
                                        }
                                        return null;
                                    case 80123377:
                                        if (str.equals("kotlin.jvm.functions.Function6")) {
                                            return "Function6";
                                        }
                                        return null;
                                    case 80123378:
                                        if (str.equals("kotlin.jvm.functions.Function7")) {
                                            return "Function7";
                                        }
                                        return null;
                                    case 80123379:
                                        if (str.equals("kotlin.jvm.functions.Function8")) {
                                            return "Function8";
                                        }
                                        return null;
                                    case 80123380:
                                        if (str.equals("kotlin.jvm.functions.Function9")) {
                                            return "Function9";
                                        }
                                        return null;
                                    default:
                                        return null;
                                }
                        }
                }
        }
    }

    public static final pk1 r(tby tbyVar) {
        return new pk1(tbyVar.a ? qk1.b : qk1.a, false, (String) null, (String) null, (j7p1) null, 30);
    }

    public static final sru s(qby qbyVar) {
        return new sru(qbyVar.a, (String) null, (String) null, (String) null, 14);
    }

    public static final cet0 t(sby sbyVar) {
        int i = sbyVar.a;
        int i2 = 1;
        boolean z = i == 2;
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC != 1) {
                i2 = 3;
                if (iC != 2) {
                    if (iC != 3) {
                        eg.o();
                        return null;
                    }
                    i2 = 4;
                }
            } else {
                i2 = 2;
            }
        }
        return new cet0(z, new tft0(i2), (String) null, 4);
    }

    public static final ExtractedText u(c8e1 c8e1Var) {
        ExtractedText extractedText = new ExtractedText();
        String str = c8e1Var.a.b;
        extractedText.text = str;
        extractedText.startOffset = 0;
        extractedText.partialEndOffset = str.length();
        extractedText.partialStartOffset = -1;
        long j = c8e1Var.b;
        extractedText.selectionStart = nbe1.g(j);
        extractedText.selectionEnd = nbe1.f(j);
        extractedText.flags = !ihc1.i0(c8e1Var.a.b, '\n') ? 1 : 0;
        return extractedText;
    }
}
