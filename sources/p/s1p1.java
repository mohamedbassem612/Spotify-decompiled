package p;

import android.content.Context;
import android.content.res.Configuration;
import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class s1p1 {
    public static b180 a;
    public static b180 b;

    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        	at jadx.core.dex.visitors.ConstructorVisitor.visit(ConstructorVisitor.java:43)
        */
    public static final p.kmg A(
    /*  JADX ERROR: Method generation error
        jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r21v0 ??
        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
        	at jadx.core.codegen.MethodGen.addMethodArguments(MethodGen.java:215)
        	at jadx.core.codegen.MethodGen.addDefinition(MethodGen.java:150)
        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:415)
        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
        */
    /*  JADX ERROR: NullPointerException in pass: ConstructorVisitor
        java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.RegisterArg.sameRegAndSVar(jadx.core.dex.instructions.args.InsnArg)" because "resultArg" is null
        	at jadx.core.dex.visitors.MoveInlineVisitor.processMove(MoveInlineVisitor.java:52)
        	at jadx.core.dex.visitors.MoveInlineVisitor.moveInline(MoveInlineVisitor.java:41)
        */

    public static final void a(u20 u20Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-783751634);
        if ((i & 6) == 0) {
            i2 = (x340Var.e(u20Var.ordinal()) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function0) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("video_card_big_action_button_test_tag", nim0.a);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            qim0 qim0VarB = uyn1.B(qim0VarN, 0.0f, 0.0f, 16.0f, 16.0f, 3);
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = l6j1.h;
                x340Var.s0(objT);
            }
            wro1.h(new gbx(z50.c, function0), new idx(6), s161.b(qim0VarB, false, (iu30) objT), null, null, null, false, null, null, apo.r(31192069, new muh1(u20Var, (byte) 17), x340Var), x340Var, 0, 6, 1016);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(u20Var, function0, i, (byte) 25);
        }
    }

    public static final void b(int i, String str, b0k b0kVar, qim0 qim0Var, boolean z) {
        qim0 qim0Var2;
        cr31 cr31VarB;
        qim0 qim0Var3;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(485399562);
        int i2 = i | (b0kVar2.g(str) ? 4 : 2) | (b0kVar2.h(z) ? 32 : 16) | 384;
        if (b0kVar2.Y(i2 & 1, (i2 & 147) != 146)) {
            if (z) {
                b0kVar2.i0(-1682452395);
                b0kVar2.r(false);
                cr31VarB = er31.a;
            } else {
                b0kVar2.i0(-1682451806);
                uwr uwrVar = cbx.a;
                cua cuaVar = cbx.b(b0kVar2).f;
                cr31VarB = er31.b(4.0f);
                b0kVar2.r(false);
            }
            int length = str.length();
            qim0 qim0Var4 = nim0.a;
            if (length > 0) {
                b0kVar2.i0(-616301619);
                qim0Var3 = qim0Var4;
                b0kVar2 = b0kVar2;
                cwl1.f(oi7.a(Uri.parse(str), (gw70) null, (xb10) null, (yqi1) null, (jmr0) null, (jmr0) null, false, false, (j6m) null, (iu30) null, (iu30) null, (iu30) null, 0L, b0kVar2, 0, 0, 131070), (String) null, i1p1.q(u291.r(qim0Var3, 155.0f), cr31VarB), (tl3) null, mif1.P0, 0.0f, (ColorFilter) null, b0kVar2, 48, 104);
                b0kVar2.r(false);
            } else {
                qim0Var3 = qim0Var4;
                b0kVar2.i0(-616092400);
                qim0 qim0VarQ = i1p1.q(u291.r(qim0Var3, 155.0f), cr31VarB);
                uwr uwrVar2 = cbx.a;
                t1c.a(dug.f(qim0VarQ, cbx.a(b0kVar2).a.a.a(), d4o1.a), b0kVar2, 0);
                b0kVar2.r(false);
            }
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ltj(str, z, qim0Var2, i, (byte) 4);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x007d  */
    /* JADX WARN: Code duplicated, block: B:59:0x0140  */
    /* JADX WARN: Multi-variable type inference failed */
    public static final void c(cu70 cu70Var, au70 au70Var, Function0 function0, Function0 function1, qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        boolean z;
        float f;
        p3v p3vVar;
        Object obj;
        xu30 xu30Var;
        int i2;
        xu30 xu30Var2;
        xu30 xu30Var3;
        xu30 xu30Var4;
        boolean z2;
        boolean z3;
        xu30 xu30Var5;
        Object obj2;
        m4c m4cVar = fkj0.X;
        bu70 bu70Var = cu70Var.h;
        j47 j47Var = cu70Var.a;
        String str = cu70Var.c;
        String str2 = cu70Var.b;
        String str3 = cu70Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(174291662);
        int i3 = i | (b0kVar3.i(cu70Var) ? 4 : 2) | (b0kVar3.g(au70Var) ? 32 : 16) | (b0kVar3.i(function0) ? 256 : 128) | (b0kVar3.i(function1) ? 2048 : 1024) | 24576;
        if (b0kVar3.Y(i3 & 1, (i3 & 9363) != 9362)) {
            float fS = s(au70Var, b0kVar3);
            String str4 = cu70Var.f;
            if (str4 != null) {
                Set set = s4b1.f;
                if (uic.h(str4, new blc0[]{blc0.u1, blc0.A1, blc0.M1})) {
                    z = true;
                } else {
                    z = false;
                }
            } else {
                z = false;
            }
            boolean z4 = z && (str == null || ihc1.y0(str)) && (str3 == null || ihc1.y0(str3));
            b0kVar3.i0(1498236938);
            Integer num = cu70Var.g;
            j2i j2iVarR = null;
            if (num == null) {
                str = str;
                str2 = str2;
                f = 8.0f;
                b0kVar3.r(false);
                p3vVar = null;
            } else {
                if (num.intValue() <= 0) {
                    num = null;
                }
                if (num != null) {
                    int iIntValue = num.intValue();
                    f = 8.0f;
                    yae1 yae1VarQ = d5p1.q(0, b0kVar3, 1);
                    uwr uwrVar = cbx.a;
                    lee1 lee1Var = cbx.d(b0kVar3).k;
                    wat watVar = (wat) b0kVar3.k(t4k.h);
                    boolean zE = b0kVar3.e(iIntValue) | b0kVar3.g(lee1Var) | b0kVar3.g(watVar);
                    Object objT = b0kVar3.T();
                    float f2 = ((p3v) ((zE || objT == m4cVar) ? ktd.k(watVar.M0((int) (yae1.b(yae1VarQ, new af5(nhc1.V(iIntValue - 1, "\n")), lee1Var, 0, false, 0, 0L, (flb0) null, (wat) null, (f930) null, 2044).c & 4294967295L)), b0kVar3) : objT)).a;
                    if (j47Var != null) {
                        x47 x47Var = j47Var.b;
                    }
                    float f3 = z4 ? 8.0f : 4.0f;
                    b0kVar3.r(false);
                    p3vVar = new p3v((fS / 1.0f) + 8.0f + f2 + f3);
                } else {
                    str = str;
                    str2 = str2;
                    f = 8.0f;
                    b0kVar3.r(false);
                    p3vVar = null;
                }
            }
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarThen = u291.v(qim0Var3, fS).then(p3vVar != null ? u291.j(p3vVar.a, 0.0f, 2, qim0Var3) : qim0Var3);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            boolean zD = b0kVar3.d(12.0f);
            Object objT2 = b0kVar3.T();
            if (zD || objT2 == m4cVar) {
                ydx ydxVar = new ydx(2.0f, 12.0f, f, new zzq0(0.0f, 0.0f, 0.0f, 0.0f));
                b0kVar3.s0(ydxVar);
                obj = ydxVar;
            } else {
                obj = objT2;
            }
            ydx ydxVar2 = (ydx) obj;
            jtr jtrVar = jtr.f;
            z50 z50Var = z50.c;
            gbx gbxVar = new gbx(z50Var, function0);
            gbx gbxVar2 = new gbx(z50Var, function1);
            b0kVar3.i0(604586402);
            if (j47Var == null) {
                b0kVar3.r(false);
                jtrVar = jtrVar;
                xu30Var = null;
            } else {
                String str5 = cu70Var.d;
                isl jslVar = ((str2 != 0 && !ihc1.y0(str2)) || str5 == null || ihc1.y0(str5)) ? isl.a : new jsl(str5);
                boolean zG = b0kVar3.g(j47Var) | b0kVar3.g(jslVar) | b0kVar3.d(fS) | b0kVar3.h(z);
                Object objT3 = b0kVar3.T();
                if (zG || objT3 == m4cVar) {
                    j2i j2iVar = new j2i(-1347313041, new x08(j47Var, z, fS, jslVar), true);
                    b0kVar3.s0(j2iVar);
                    objT3 = j2iVar;
                }
                xu30Var = (xu30) objT3;
                b0kVar3.r(false);
            }
            if (z4) {
                i2 = 2;
                b0kVar3.i0(-291604785);
                b0kVar3.r(false);
                xu30Var2 = null;
            } else {
                b0kVar3.i0(-9407484);
                b0kVar3.i0(-573894967);
                if (str3 == null || ihc1.y0(str3)) {
                    z3 = false;
                    i2 = 2;
                    b0kVar3.r(false);
                    xu30Var5 = null;
                } else {
                    int i4 = bu70Var != null ? bu70Var.a : 1;
                    boolean zG2 = b0kVar3.g(str3) | b0kVar3.e(i4);
                    Object objT4 = b0kVar3.T();
                    if (zG2 || objT4 == m4cVar) {
                        i2 = 2;
                        j2i j2iVar2 = new j2i(-1752164905, new qvh(str3, i4, (byte) 2), true);
                        b0kVar3.s0(j2iVar2);
                        obj2 = j2iVar2;
                    } else {
                        i2 = 2;
                        obj2 = objT4;
                    }
                    xu30Var5 = (xu30) obj2;
                    z3 = false;
                    b0kVar3.r(false);
                }
                b0kVar3.r(z3);
                xu30Var2 = xu30Var5;
            }
            if (z4) {
                b0kVar3.i0(-291532369);
                b0kVar3.r(false);
                xu30Var3 = null;
            } else {
                b0kVar3.i0(-9405148);
                b0kVar3.i0(-1227425332);
                int i5 = ((str3 == null || ihc1.y0(str3)) ? 1 : 0) ^ 1;
                int i6 = ((str2 == 0 || ihc1.y0(str2)) ? 1 : 0) ^ 1;
                char c = (str == null || ihc1.y0(str)) ? (char) 1 : (char) 0;
                boolean z5 = c ^ 1;
                boolean z6 = cu70Var.i && (i5 + i6) + (z5 ? 1 : 0) < 3;
                if (c == 0 || z6) {
                    String str6 = str == null ? "" : str;
                    int i7 = bu70Var != null ? bu70Var.c : i2;
                    boolean zG3 = b0kVar3.g(str6) | b0kVar3.h(z5) | b0kVar3.h(z6) | b0kVar3.e(i7);
                    Object objT5 = b0kVar3.T();
                    Object obj3 = objT5;
                    if (zG3 || objT5 == m4cVar) {
                        j2i j2iVar3 = new j2i(1165981593, new jb7(z5, i7, str6, z6), true);
                        b0kVar3.s0(j2iVar3);
                        obj3 = j2iVar3;
                    }
                    xu30Var4 = (xu30) obj3;
                    z2 = false;
                    b0kVar3.r(false);
                } else {
                    z2 = false;
                    b0kVar3.r(false);
                    xu30Var4 = null;
                }
                b0kVar3.r(z2);
                xu30Var3 = xu30Var4;
            }
            if (!z4 || str2 == 0 || ihc1.y0(str2)) {
                b0kVar3.i0(-291059618);
                b0kVar3.r(false);
            } else {
                b0kVar3.i0(-291442964);
                j2iVarR = apo.r(2131543740, new gn50(cu70Var, (byte) 21), b0kVar3);
                b0kVar3.r(false);
            }
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarThen, null, ydxVar2, null, null, null, jtrVar, gbxVar, gbxVar2, xu30Var, null, xu30Var2, xu30Var3, null, j2iVarR, null, apo.r(-970302535, new zw2((Object) cu70Var, z4, (byte) 9), b0kVar3), b0kVar2, 1573376, 1572864, 42042);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new uk20((byte) 12, i, (Object) cu70Var, (Object) au70Var, (Object) function0, (Object) function1, (Object) qim0Var2);
        }
    }

    public static final void d(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-895037657);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            uwr uwrVar = cbx.a;
            qim0 qim0VarN = anm1.N("video_card_big_image_placeholder_test_tag", dug.f(qim0Var, cbx.a(x340Var).a.a.a(), d4o1.a));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
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
            nko1.H(gfh0VarC, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarA = h2c.a.a(nim0.a, een.h);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(xtx.c, isl.a, u291.r(qim0VarA, 64.0f), 0L, 0L, false, x340Var, xtx.d | 48, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 16);
        }
    }

    public static final void e(gmd0 gmd0Var, vu30 vu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(729495184);
        if ((i & 6) == 0) {
            i2 = (b0kVar2.g(gmd0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar2.i(vu30Var) ? 32 : 16;
        }
        int i3 = i2;
        if (b0kVar2.Y(i3 & 1, (i3 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar2).b;
            mbh mbhVarA = jbh.a(new d36(16.0f, true, new um5(false)), een.P0, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            nim0 nim0Var = nim0.a;
            qim0 qim0VarE = zr7.E(b0kVar2, nim0Var);
            hzj.A.getClass();
            if (((x340) b0kVar2).a == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(hmb0.t1);
            } else {
                b0kVar2.v0();
            }
            nko1.H(mbhVarA, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            tb81 tb81Var = gmd0Var.a;
            String str = tb81Var.b;
            String str2 = tb81Var.c;
            cvx cvxVar2 = cbx.b(b0kVar2).b;
            a6o1.i(0, str, str2, b0kVar2, null, uyn1.z(16.0f, 0.0f, 2, nim0Var));
            cvx cvxVar3 = cbx.b(b0kVar2).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            cvx cvxVar4 = cbx.b(b0kVar2).b;
            zzq0 zzq0VarH = uyn1.h(2, 16.0f, 0.0f);
            boolean z = ((i3 & 14) == 4) | ((i3 & 112) == 32);
            Object objT = b0kVar2.T();
            if (z || objT == fkj0.X) {
                objT = new j2d0(gmd0Var, vu30Var, (byte) 5);
                b0kVar2.s0(objT);
            }
            b0kVar2 = b0kVar2;
            ujo1.e(null, null, zzq0VarH, d36Var, null, null, false, null, (iu30) objT, b0kVar2, 0, 491);
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new lg60(gmd0Var, vu30Var, i, (byte) 18);
        }
    }

    public static final void f(String str, String str2, boolean z, boolean z2, boolean z3, Function0 function0, Function0 function1, Function0 function2, b0k b0kVar, int i) {
        int i2;
        boolean z4;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1577105439);
        j06 j06Var = x340Var.a;
        int i3 = i | (x340Var.g(str) ? 4 : 2) | (x340Var.g(str2) ? 32 : 16) | (x340Var.h(z) ? 256 : 128) | (x340Var.h(z2) ? 2048 : 1024) | (x340Var.h(z3) ? 16384 : 8192) | (x340Var.i(function0) ? 131072 : 65536) | (x340Var.i(function1) ? 1048576 : 524288) | (x340Var.i(function2) ? 8388608 : 4194304);
        if (x340Var.Y(i3 & 1, (4793491 & i3) != 4793490)) {
            if (z2) {
                i2 = 2131957659;
            } else {
                i2 = z ? 2131959685 : 2131959808;
            }
            String strO0 = cwl1.o0(x340Var, i2);
            x340Var.i0(525148530);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(8.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarQ = i1p1.q(nim0Var, cr31VarB);
            if (z3) {
                boolean zG = ((i3 & 112) == 32) | x340Var.g(strO0) | ((i3 & 7168) == 2048) | ((29360128 & i3) == 8388608) | ((3670016 & i3) == 1048576);
                Object objT = x340Var.T();
                if (zG || objT == m4cVar) {
                    o96 o96Var = new o96(str2, strO0, z2, function2, function1, (byte) 13);
                    x340Var.s0(o96Var);
                    objT = o96Var;
                }
                qim0 qim0VarB = s161.b(nim0Var, true, (iu30) objT);
                pm31 pm31Var = new pm31(0);
                boolean z5 = (458752 & i3) == 131072;
                Object objT2 = x340Var.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new sah1(function0, (byte) 27);
                    x340Var.s0(objT2);
                }
                qim0VarQ = qim0VarQ.then(bin.x(qim0VarB, false, null, pm31Var, null, (Function0) objT2, 11));
            } else {
                i3 = i3;
            }
            x340Var.r(false);
            gra graVar = een.d;
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarQ);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z6 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z6) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            if (z3) {
                x340Var.i0(-1300060547);
                g(str, x340Var, i3 & 14);
                h2c h2cVar = h2c.a;
                int i4 = i3;
                m(h2cVar.b(nim0Var), x340Var, 0);
                qim0 qim0VarA = h2cVar.a(nim0Var, een.Y);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var.T);
                xos0 xos0VarM2 = x340Var.m();
                qim0 qim0VarE2 = zr7.E(x340Var, qim0VarA);
                x340Var.m0();
                if (x340Var.S) {
                    x340Var.l(n4kVar);
                } else {
                    x340Var.v0();
                }
                nko1.H(gfh0VarC2, x340Var, lljVar);
                nko1.H(xos0VarM2, x340Var, lljVar2);
                x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
                nko1.H(qim0VarE2, x340Var, lljVar4);
                if (z2) {
                    x340Var.i0(-941826510);
                    a(u20.LOCK, function2, x340Var, ((i4 >> 18) & 112) | 6);
                    z4 = false;
                    x340Var.r(false);
                } else {
                    z4 = false;
                    if (z) {
                        x340Var.i0(-941823949);
                        a(u20.PAUSE, function1, x340Var, ((i4 >> 15) & 112) | 6);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-941821518);
                        a(u20.PLAY, function1, x340Var, ((i4 >> 15) & 112) | 6);
                        x340Var.r(false);
                    }
                }
                x340Var.r(true);
                x340Var.r(z4);
            } else {
                x340Var.i0(-1299642202);
                cbx.a.getClass();
                d(d7e.r(uwr.d().a, nim0Var, false), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new eob0(str, str2, z, z2, z3, function0, function1, function2, i);
        }
    }

    public static final void g(String str, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1904683053);
        int i2 = (x340Var.g(str) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0VarN = anm1.N("video_card_big_main_image_test_tag", u291.f(nim0.a, 1.0f));
            Uri uri = Uri.parse(str);
            cbx.a.getClass();
            eso1.e(uri, isl.a, qim0VarN, (p3v) null, (zvx) null, uwr.d(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 27696, 0, 4032);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new zsd1(str, i, (byte) 20);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void h(boolean z, iu30 iu30Var, jgx jgxVar, qim0 qim0Var, pgx pgxVar, vu30 vu30Var, b0k b0kVar, int i) {
        vu30 vu30Var2;
        pgx pgxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1617521162);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(iu30Var) ? 32 : 16) | (x340Var.g(jgxVar) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024) | 24576;
        if (x340Var.Y(i2 & 1, (74899 & i2) != 74898)) {
            pgxVar2 = ogx.e;
            vu30Var2 = vu30Var;
            i(z, iu30Var, z ? jgxVar : pgxVar2, qim0Var, apo.r(749383159, new k7f((byte) 23, vu30Var2, false), x340Var), x340Var, (i2 & 14) | 199680 | (i2 & 112) | ((i2 << 3) & 57344));
        } else {
            vu30Var2 = vu30Var;
            x340Var.b0();
            pgxVar2 = pgxVar;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wr1(z, (Object) iu30Var, (Object) jgxVar, (Object) qim0Var, (Object) pgxVar2, (cv30) vu30Var2, i, (byte) 16);
        }
    }

    public static final void i(boolean z, iu30 iu30Var, pgx pgxVar, qim0 qim0Var, j2i j2iVar, b0k b0kVar, int i) {
        boolean z2;
        int i2;
        b0k b0kVar2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1915867387);
        if ((i & 6) == 0) {
            z2 = z;
            i2 = (b0kVar3.h(z2) ? 4 : 2) | i;
        } else {
            z2 = z;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= b0kVar3.g(pgxVar) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= b0kVar3.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= b0kVar3.g(qim0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= b0kVar3.i(j2iVar) ? 131072 : 65536;
        }
        if (b0kVar3.Y(i2 & 1, (74899 & i2) != 74898)) {
            qim0 qim0VarX = u291.x(94.0f, 0.0f, 2, qim0Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(b0kVar3).d;
            b0kVar2 = b0kVar3;
            cwl1.c(z2, iu30Var, u291.j(48.0f, 0.0f, 2, qim0VarX), een.h, (hw61) null, pgxVar, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, apo.r(-79867204, new rv71(j2iVar, (byte) 19), b0kVar3), b0kVar2, (i2 & 14) | 1575936 | (i2 & 112) | ((i2 << 9) & 458752) | ((i2 << 15) & 234881024), 48, 1680);
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1(z, (Object) iu30Var, (Object) pgxVar, (Object) qim0Var, (Object) j2iVar, i, (byte) 25);
        }
    }

    public static final void j(int i, b0k b0kVar, vu30 vu30Var, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-76952518);
        j06 j06Var = x340Var.a;
        int i2 = (x340Var.i(vu30Var) ? 32 : 16) | i;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            gfh0 gfh0VarC = t1c.c(een.h, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            uwr uwrVar = cbx.a;
            qim0 qim0VarZ = uyn1.z(cbx.b(x340Var).e.b, 0.0f, 2, nim0.a);
            gfh0 gfh0VarC2 = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarZ);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            if (vu30Var != null) {
                x340Var.i0(-243606343);
                us71.j((i2 >> 3) & 14, vu30Var, x340Var, false);
            } else {
                x340Var.i0(-243580396);
                x340Var.r(false);
            }
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jxj0(qim0Var, vu30Var, i);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static final void k(boolean z, Function0 function0, Function0 function1, jgx jgxVar, qim0 qim0Var, pgx pgxVar, vu30 vu30Var, b0k b0kVar, int i) {
        pgx pgxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1560153950);
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.i(function0) ? 32 : 16) | (x340Var.g(jgxVar) ? 2048 : 1024) | (x340Var.g(qim0Var) ? 16384 : 8192) | 196608;
        if (x340Var.Y(i2 & 1, (599187 & i2) != 599186)) {
            jgx jgxVar2 = ogx.e;
            qim0 qim0VarX = u291.x(94.0f, 0.0f, 2, qim0Var);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarJ = u291.j(48.0f, 0.0f, 2, qim0VarX);
            jgx jgxVar3 = z ? jgxVar : jgxVar2;
            zzq0 zzq0Var = new zzq0(0.0f, 0.0f, 0.0f, 0.0f);
            gra graVar = een.h;
            z50 z50Var = z50.c;
            cwl1.b(qim0VarJ, graVar, (hw61) null, jgxVar3, zzq0Var, (max) null, z, (idn0) null, (ga80) null, new gbx(z50Var, function0), new gbx(z50Var, function1), apo.r(-2099628903, new a2(vu30Var, (byte) 10), x340Var), x340Var, ((i2 << 18) & 3670016) | 24624, 48, 420);
            pgxVar2 = jgxVar2;
        } else {
            x340Var.b0();
            pgxVar2 = pgxVar;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uu(z, function0, function1, jgxVar, qim0Var, pgxVar2, vu30Var, i);
        }
    }

    public static final void l(ksw kswVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-655729865);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kswVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Object objT = x340Var.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = bb00.h(100, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT;
            boolean zI = x340Var.i(hdn0Var) | ((i2 & 112) == 32);
            Object objT2 = x340Var.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new rj0(iu30Var, hdn0Var, (byte) 0);
                x340Var.s0(objT2);
            }
            n9p1.e(kswVar, (iu30) objT2, x340Var, i2 & 14);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sj0(kswVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void m(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2036544091);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            t1c.a(dug.e(qim0Var, v9c.h(p7h.M(new u7h[]{new u7h(u7h.j), new u7h(u7h.b(u7h.b, 0.4f, 0.0f, 0.0f, 0.0f, 14))}), 0.0f, 0.0f, 14), null, 0.0f, 6), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wfe1(qim0Var, i, (byte) 17);
        }
    }

    /* JADX WARN: Type inference failed for: r3v2 */
    /* JADX WARN: Type inference failed for: r3v3, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r3v4 */
    /* JADX WARN: Type inference failed for: r3v6 */
    public static final void n(cvt0 cvt0Var, hft0 hft0Var, wh1 wh1Var, d0r d0rVar, hjv0 hjv0Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        vu30 vu30Var;
        llj lljVar;
        vu30 vu30Var2;
        m4c m4cVar;
        ?? r3;
        Function0 function0;
        vu30 vu30Var3;
        qim0 qim0Var3;
        x340 x340Var;
        long j;
        cvt0 cvt0Var2 = cvt0Var;
        String str = cvt0Var2.c;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(1638138178);
        j06 j06Var = x340Var2.a;
        if ((i & 6) == 0) {
            i2 = (x340Var2.g(cvt0Var2) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.i(hft0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.i(wh1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(d0rVar) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= (32768 & i) == 0 ? x340Var2.g(hjv0Var) : x340Var2.i(hjv0Var) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 131072 : 65536;
        }
        int i3 = i2 | 1572864;
        if (x340Var2.Y(i3 & 1, (i3 & 599187) != 599186)) {
            fra fraVar = een.N0;
            uwr uwrVar = cbx.a;
            float f = cbx.b(x340Var2).b.f;
            qim0 qim0Var4 = nim0.a;
            qim0 qim0VarJ = u291.j(f, 0.0f, 2, qim0Var4);
            jtr jtrVar = jtr.f;
            Object objT = x340Var2.T();
            m4c m4cVar2 = fkj0.X;
            if (objT == m4cVar2) {
                objT = ktd.n(x340Var2);
            }
            idn0 idn0Var = (idn0) objT;
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar2) {
                objT2 = tnt0.d;
                x340Var2.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z = (i3 & 458752) == 131072;
            Object objT3 = x340Var2.T();
            if (z || objT3 == m4cVar2) {
                objT3 = new smt0(iu30Var, (byte) 6);
                x340Var2.s0(objT3);
            }
            qim0 qim0VarY = bin.y(qim0VarJ, idn0Var, jtrVar, false, null, null, null, function1, (Function0) objT3, 444);
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarY);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function2 = hmb0.t1;
            if (z2) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            vu30 vu30Var4 = y580.O0;
            nko1.H(jw31VarA, x340Var2, vu30Var4);
            vu30 vu30Var5 = y580.N0;
            nko1.H(xos0VarM, x340Var2, vu30Var5);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar2);
            nko1.F(x340Var2);
            vu30 vu30Var6 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var6);
            int iC = l1d.C(cvt0Var2.g);
            isl islVar = isl.a;
            if (iC == 0) {
                vu30Var = vu30Var4;
                lljVar = lljVar2;
                vu30Var2 = vu30Var6;
                m4cVar = m4cVar2;
                r3 = 0;
                function0 = function2;
                vu30Var3 = vu30Var5;
                qim0Var3 = qim0Var4;
                x340Var2.i0(-661919981);
                eso1.e(Uri.parse(str), islVar, u291.r(qim0Var3, 48.0f), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
                x340Var = x340Var2;
                x340Var.r(false);
            } else if (iC == 1) {
                lljVar = lljVar2;
                vu30Var2 = vu30Var6;
                function0 = function2;
                vu30Var3 = vu30Var5;
                r3 = 0;
                qim0Var3 = qim0Var4;
                x340Var2.i0(-661914171);
                vu30Var = vu30Var4;
                m4cVar = m4cVar2;
                eso1.e(Uri.parse(str), islVar, i1p1.q(u291.r(qim0Var3, 48.0f), er31.a), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 48, 0, 4088);
                x340Var = x340Var2;
                x340Var.r(false);
            } else {
                if (iC != 2) {
                    throw p3d1.k(x340Var2, -661921630, false);
                }
                x340Var2.i0(-661907779);
                String str2 = cvt0Var2.i;
                if (str2 != null) {
                    str = str2;
                }
                Uri uri = Uri.parse(str);
                qim0 qim0VarH = u291.h(qim0Var4, 48.0f);
                cbx.a.getClass();
                vu30Var2 = vu30Var6;
                vu30Var3 = vu30Var5;
                function0 = function2;
                lljVar = lljVar2;
                r3 = 0;
                qim0Var3 = qim0Var4;
                eso1.e(uri, islVar, qim0VarH, (p3v) null, (zvx) null, uwr.d(), (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 3120, 0, 4048);
                x340Var = x340Var2;
                x340Var.r(false);
                vu30Var = vu30Var4;
                m4cVar = m4cVar2;
            }
            wnb0 wnb0VarK = c13.k(qim0Var3, 12.0f, x340Var, 1.0f, true);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, (int) r3);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, wnb0VarK);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, vu30Var);
            nko1.H(xos0VarM2, x340Var, vu30Var3);
            x0d.q(iHashCode2, x340Var, lljVar, x340Var);
            nko1.H(qim0VarE2, x340Var, vu30Var2);
            cvt0Var2 = cvt0Var;
            String str3 = cvt0Var2.a;
            lee1 lee1Var = cbx.d(x340Var).g;
            if (cvt0Var2.f) {
                x340Var.i0(-1099782776);
                j = cbx.a(x340Var).b.c;
            } else {
                x340Var.i0(-1099781536);
                j = cbx.a(x340Var).b.a;
            }
            x340Var.r((boolean) r3);
            x340 x340Var3 = x340Var;
            uwo1.e(str3, null, lee1Var, j, null, null, 2, false, new cjc0(1), 0, null, x340Var3, 0, 0, 1714);
            uwo1.e(cvt0Var2.b, null, cbx.d(x340Var3).j, u7h.b(cbx.a(x340Var3).b.a, 0.7f, 0.0f, 0.0f, 0.0f, 14), null, null, 2, false, new cjc0(1), 0, null, x340Var3, 0, 0, 1714);
            x340Var2 = x340Var3;
            x340Var2.r(true);
            op71.g(x340Var2, u291.v(qim0Var3, 12.0f));
            if (cvt0Var2.j) {
                x340Var2.i0(956612468);
                String str4 = cvt0Var2.d;
                otw.c(hjv0Var, new wiv0(str4, str4, cvt0Var2.k, (iu30) null), (qim0) null, (ipb1) null, x340Var2, 8 | ((i3 >> 12) & 14), 12);
                x340Var2.r((boolean) r3);
            } else {
                x340Var2.i0(956893607);
                boolean zG = x340Var2.g(d0rVar);
                Object objT4 = x340Var2.T();
                if (zG || objT4 == m4cVar) {
                    objT4 = wh1Var.a.m().a(d0rVar);
                    x340Var2.s0(objT4);
                }
                int i4 = i3 >> 3;
                i1o1.e((vh1) objT4, new uho(cvt0Var2.d, (String) null, (tho) null, (nho) null, (String) null, (Function0) null, 254), d0rVar, null, null, l8j.a, l8j.b, 0, null, x340Var2, 1769480 | (i4 & 896), 204);
                x340Var2 = x340Var2;
                if (cvt0Var2.h) {
                    x340Var2.i0(957231693);
                    otw.c(hft0Var, new set0(cvt0Var2.e, true, "playable-content-client-native", "home_feed", (Function0) null, false, false, (Function0) null, (String) null, (String) null, false, 2032), (qim0) null, (ipb1) null, x340Var2, i4 & 14, 12);
                    x340Var2 = x340Var2;
                    x340Var2.r((boolean) r3);
                } else {
                    x340Var2.i0(957553628);
                    x340Var2.r((boolean) r3);
                }
                x340Var2.r((boolean) r3);
            }
            x340Var2.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var2.v();
        if (h311VarV != null) {
            h311VarV.d = new kt3((Object) cvt0Var2, (Object) hft0Var, (Object) wh1Var, (Object) d0rVar, (Object) hjv0Var, (Object) iu30Var, (Object) qim0Var2, i, (byte) 15);
        }
    }

    public static final void o(int i, int i2, int i3, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        elx elxVar;
        long j;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1048011343);
        int i4 = i3 | (x340Var.e(i) ? 4 : 2) | (x340Var.e(l1d.C(i2)) ? 32 : 16) | 384;
        if (x340Var.Y(i4 & 1, (i4 & 147) != 146)) {
            int iC = l1d.C(i2);
            if (iC == 0) {
                elxVar = apx.c;
            } else if (iC == 1) {
                elxVar = glx.c;
            } else {
                if (iC != 2) {
                    eg.o();
                    return;
                }
                elxVar = elx.c;
            }
            int iC2 = l1d.C(i2);
            if (iC2 == 0) {
                x340Var.i0(2116569558);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.b;
                x340Var.r(false);
            } else if (iC2 == 1) {
                x340Var.i0(2116565527);
                uwr uwrVar2 = cbx.a;
                j = cbx.a(x340Var).b.f;
                x340Var.r(false);
            } else {
                if (iC2 != 2) {
                    throw p3d1.k(x340Var, 2116563457, false);
                }
                x340Var.i0(2116567543);
                uwr uwrVar3 = cbx.a;
                j = cbx.a(x340Var).b.d;
                x340Var.r(false);
            }
            fra fraVar = een.N0;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(2.0f, true, new um5(false));
            long jB = u7h.b(cbx.a(x340Var).b.f, 0.1f, 0.0f, 0.0f, 0.0f, 14);
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = dug.f(qim0Var3, jB, cr31VarB);
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarY = uyn1.y(qim0VarF, 6.0f, 2.0f);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarY);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            zov0 zov0Var = cbx.b(x340Var).g;
            w0h1.a(elxVar, isl.a, u291.r(qim0Var3, 12.0f), j, 0L, false, x340Var, 56, 48);
            uwo1.e(String.valueOf(i), null, cbx.d(x340Var).p, cbx.a(x340Var).b.a, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new f0e((byte) 6, i, i2, i3, qim0Var2);
        }
    }

    public static final void p(dc81 dc81Var, rv21 rv21Var, qim0 qim0Var, Function0 function0, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1511280163);
        int i2 = i | (b0kVar3.g(dc81Var) ? 4 : 2) | (b0kVar3.g(rv21Var) ? 32 : 16) | 384 | (b0kVar3.i(function0) ? 2048 : 1024);
        if (b0kVar3.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gbx gbxVar = new gbx(z50.c, function0);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            zzq0 zzq0Var = new zzq0(8.0f, 8.0f, 8.0f, 8.0f);
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarV = u291.v(qim0Var3, 171.0f);
            long j = cbx.a(b0kVar3).a.d;
            cua cuaVar = cbx.b(b0kVar3).f;
            b0kVar2 = b0kVar3;
            cwl1.b(dug.f(qim0VarV, j, er31.b(8.0f)), (tl3) null, (hw61) null, (pgx) null, zzq0Var, (max) null, false, (idn0) null, (ga80) null, gbxVar, (gbx) null, apo.r(-2040025786, new h6a0(rv21Var, dc81Var, (byte) 12), b0kVar3), b0kVar2, 0, 48, 1518);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new cb60(i, (Object) dc81Var, (Object) rv21Var, (Object) qim0Var2, (Object) function0, (byte) 23);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void q(ydj1 ydj1Var, int i, Function0 function0, b0k b0kVar, int i2) throws NoWhenBranchMatchedException {
        Function0 function1;
        ydj1 ydj1Var2 = ydj1Var;
        xdj1 xdj1Var = ydj1Var2.a;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(860221567);
        j06 j06Var = x340Var.a;
        int i3 = i2 | (x340Var.g(ydj1Var2) ? 4 : 2) | (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 32 : 16) | (x340Var.i(function0) ? 256 : 128);
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(12.0f, true, new um5(false));
            fra fraVar = een.N0;
            qim0 qim0Var = nim0.a;
            qim0 qim0VarX = bin.x(anm1.N("video_card_big_title_row_test_tag", qim0Var), false, null, new pm31(0), null, function0, 11);
            jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z = x340Var.S;
            Function0 function2 = hmb0.t1;
            if (z) {
                x340Var.l(function2);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            qim0 qim0VarQ = xdj1Var.b == 2 ? i1p1.q(qim0Var, er31.a) : qim0Var;
            Uri uri = Uri.parse(xdj1Var.a);
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            zov0 zov0Var = cbx.b(x340Var).g;
            eso1.e(uri, isl.a, anm1.N("video_card_big_cover_image_test_tag", qim0VarQ), new p3v(40.0f), (zvx) null, ecxVarA, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4048);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var);
            x340Var.m0();
            if (x340Var.S) {
                function1 = function2;
                x340Var.l(function1);
            } else {
                function1 = function2;
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            cvx cvxVar2 = cbx.b(x340Var).b;
            jw31 jw31VarA2 = ew31.a(new d36(4.0f, true, new um5(false)), fraVar, x340Var, 0);
            int iHashCode3 = Long.hashCode(x340Var.T);
            xos0 xos0VarM3 = x340Var.m();
            qim0 qim0VarE3 = zr7.E(x340Var, qim0Var);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(function1);
            } else {
                x340Var.v0();
            }
            nko1.H(jw31VarA2, x340Var, lljVar);
            nko1.H(xos0VarM3, x340Var, lljVar2);
            x0d.q(iHashCode3, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE3, x340Var, lljVar4);
            if (i != 0) {
                x340Var.i0(1203603356);
                kqn1.d(i, (i3 >> 3) & 14, 0, x340Var, anm1.N("video_card_big_content_restriction_badge_test_tag", qim0Var));
                x340Var.r(false);
            } else {
                x340Var.i0(1203771841);
                x340Var.r(false);
            }
            ydj1Var2 = ydj1Var;
            uwo1.e(ydj1Var2.c, anm1.N("video_card_big_subtitle_test_tag", qim0Var), cbx.d(x340Var).j, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1720);
            x340Var.r(true);
            uwo1.e(ydj1Var2.b, anm1.N("video_card_big_title_test_tag", qim0Var), cbx.d(x340Var).h, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1720);
            x340Var.r(true);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new heb1(ydj1Var2, i, function0, i2, (byte) 26);
        }
    }

    public static final void r(zdj1 zdj1Var, Function0 function0, Function0 function1, Function0 function2, Function0 function3, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        Function0 function4;
        Function0 function5;
        Function0 function6;
        Function0 function7;
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-1184376835);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(zdj1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            function4 = function0;
            i2 |= b0kVar3.i(function4) ? 32 : 16;
        } else {
            function4 = function0;
        }
        if ((i & 384) == 0) {
            function5 = function1;
            i2 |= b0kVar3.i(function5) ? 256 : 128;
        } else {
            function5 = function1;
        }
        if ((i & 3072) == 0) {
            function6 = function2;
            i2 |= b0kVar3.i(function6) ? 2048 : 1024;
        } else {
            function6 = function2;
        }
        if ((i & 24576) == 0) {
            function7 = function3;
            i2 |= b0kVar3.i(function7) ? 16384 : 8192;
        } else {
            function7 = function3;
        }
        int i3 = i2 | 196608;
        if (b0kVar3.Y(i3 & 1, (74899 & i3) != 74898)) {
            boolean z = zdj1Var.e;
            qim0 qim0Var3 = nim0.a;
            b0kVar2 = b0kVar3;
            cwl1.b(!z ? d9y0.k(qim0Var3, 0.4f) : qim0Var3, (tl3) null, (hw61) null, (pgx) null, new zzq0(0.0f, 0.0f, 0.0f, 0.0f), (max) null, false, (idn0) null, (ga80) null, (gbx) null, (gbx) null, apo.r(484749940, new n2y0(zdj1Var, function5, function4, function6, function7, (byte) 11), b0kVar3), b0kVar2, 0, 48, 2030);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new ryb1(zdj1Var, function0, function1, function2, function3, qim0Var2, i, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final float s(au70 au70Var, b0k b0kVar) throws NoWhenBranchMatchedException {
        if (!(au70Var instanceof au70)) {
            throw p3d1.k((x340) b0kVar, 144400881, false);
        }
        x340 x340Var = (x340) b0kVar;
        x340Var.i0(181513492);
        float f = ((Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a)).screenWidthDp * 0.4f;
        float fU0 = ((wat) x340Var.k(t4k.h)).U0();
        if (fU0 < 1.0f) {
            fU0 = 1.0f;
        }
        float fMin = Math.min(f, 200.0f) * fU0;
        x340Var.r(false);
        return fMin;
    }

    public static yjq t(ml01 ml01Var, nl01 nl01Var, q7r0 q7r0Var, rih1 rih1Var) {
        ml01Var.getClass();
        rih1Var.getClass();
        return new yjq(ml01Var, nl01Var, q7r0Var);
    }

    public static final Type u(gc11 gc11Var) {
        Type[] lowerBounds;
        if (gc11Var.isSuspend()) {
            Object objC0 = o7h.C0(gc11Var.getCaller().a());
            ParameterizedType parameterizedType = objC0 instanceof ParameterizedType ? (ParameterizedType) objC0 : null;
            if (u890.j(parameterizedType != null ? parameterizedType.getRawType() : null, lnm.class)) {
                Object objB0 = f46.B0(parameterizedType.getActualTypeArguments());
                WildcardType wildcardType = objB0 instanceof WildcardType ? (WildcardType) objB0 : null;
                if (wildcardType != null && (lowerBounds = wildcardType.getLowerBounds()) != null) {
                    return (Type) f46.j0(lowerBounds);
                }
            }
        }
        return null;
    }

    public static o9n1 v(Context context) {
        return new o9n1(context, null, o9n1.m, ixd1.b, jz40.c);
    }

    public static final boolean w(Set set) {
        String strX = x(set);
        return !(strX == null || strX.length() == 0);
    }

    public static final String x(Set set) {
        Object next;
        Iterator it = set.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!(((orc0) next) instanceof jrc0));
        jrc0 jrc0Var = next instanceof jrc0 ? (jrc0) next : null;
        if (jrc0Var != null) {
            return jrc0Var.a;
        }
        return null;
    }

    public static final boolean y(pf9 pf9Var, jh9 jh9Var) {
        if (jh9Var != null) {
            if (pf9Var instanceof hf9) {
                if ((jh9Var instanceof dh9) && ((hf9) pf9Var).a.equals(((dh9) jh9Var).a.getAddress())) {
                    return true;
                }
            } else if (pf9Var instanceof gf9) {
                if ((jh9Var instanceof dh9) && ((gf9) pf9Var).a.equals(((dh9) jh9Var).a.getAddress())) {
                    return true;
                }
            } else if (pf9Var instanceof if9) {
                if ((jh9Var instanceof ah9) && ((if9) pf9Var).a.equals(((ah9) jh9Var).a)) {
                    return true;
                }
                if ((jh9Var instanceof bh9) && ((if9) pf9Var).a.equals(((bh9) jh9Var).a)) {
                    return true;
                }
            } else if (pf9Var instanceof of9) {
                if ((jh9Var instanceof ch9) && ((of9) pf9Var).a.equals(((ch9) jh9Var).a)) {
                    return true;
                }
            } else if (pf9Var instanceof nf9) {
                if ((jh9Var instanceof ch9) && ((nf9) pf9Var).a.equals(((ch9) jh9Var).a)) {
                    return true;
                }
            } else if (pf9Var instanceof df9) {
                if (jh9Var instanceof fh9) {
                    df9 df9Var = (df9) pf9Var;
                    if (df9Var.a.equals(((fh9) jh9Var).a) && df9Var.b.equals(pe9.b)) {
                        return true;
                    }
                }
                if (jh9Var instanceof eh9) {
                    df9 df9Var2 = (df9) pf9Var;
                    eh9 eh9Var = (eh9) jh9Var;
                    if (df9Var2.a.equals(eh9Var.a) && df9Var2.b.equals(eh9Var.b)) {
                        return true;
                    }
                }
            } else if (pf9Var instanceof cf9) {
                if (jh9Var instanceof fh9) {
                    cf9 cf9Var = (cf9) pf9Var;
                    if (cf9Var.a.equals(((fh9) jh9Var).a) && cf9Var.b.equals(pe9.b)) {
                        return true;
                    }
                }
                if (jh9Var instanceof eh9) {
                    cf9 cf9Var2 = (cf9) pf9Var;
                    eh9 eh9Var2 = (eh9) jh9Var;
                    if (cf9Var2.a.equals(eh9Var2.a) && cf9Var2.b.equals(eh9Var2.b)) {
                        return true;
                    }
                }
            } else if (pf9Var instanceof ff9) {
                if (jh9Var instanceof ih9) {
                    ff9 ff9Var = (ff9) pf9Var;
                    ih9 ih9Var = (ih9) jh9Var;
                    if (ff9Var.a.equals(ih9Var.a) && ff9Var.b.equals(ih9Var.b)) {
                        return true;
                    }
                }
            } else if (pf9Var instanceof ef9) {
                if (jh9Var instanceof ih9) {
                    ef9 ef9Var = (ef9) pf9Var;
                    ih9 ih9Var2 = (ih9) jh9Var;
                    if (ef9Var.a.equals(ih9Var2.a) && ef9Var.b.equals(ih9Var2.b)) {
                        return true;
                    }
                }
            } else if (pf9Var instanceof jf9) {
                if ((jh9Var instanceof hh9) && ((jf9) pf9Var).a.equals(((hh9) jh9Var).a)) {
                    return true;
                }
            } else if (pf9Var instanceof lf9) {
                if ((jh9Var instanceof gh9) && ((lf9) pf9Var).a.equals(((gh9) jh9Var).a)) {
                    return true;
                }
            } else if (pf9Var instanceof kf9) {
                if ((jh9Var instanceof gh9) && ((kf9) pf9Var).a.equals(((gh9) jh9Var).a)) {
                    return true;
                }
            } else if (!(pf9Var instanceof mf9)) {
                eg.o();
                return false;
            }
        }
        return false;
    }

    public static final hur z(gc11 gc11Var, String str) {
        dh30 dh30VarN = bpi1.n(str);
        ArrayList arrayList = (ArrayList) dh30VarN.b;
        boolean zJ = u890.j(o7h.C0(arrayList), "Lkotlin/jvm/internal/DefaultConstructorMarker;");
        int size = upn1.u(gc11Var).size() + (zJ ? 1 : 0);
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.addAll(o7h.d1(arrayList, arrayList.size() - size));
        for (mmr0 mmr0Var : o7h.v1(upn1.u(gc11Var), o7h.e1(size, arrayList))) {
            hc11 hc11Var = (hc11) mmr0Var.a;
            String str2 = (String) mmr0Var.b;
            if (hc11Var.l() && bpi1.h(hc11Var.t())) {
                Iterator it = z561.S(z561.c0(hf41.c, hc11Var.t()), 1).iterator();
                while (true) {
                    if (it.hasNext()) {
                        if (bpi1.j((oma0) it.next())) {
                            linkedHashSet.add(Integer.valueOf(arrayList2.size()));
                            arrayList2.add("L" + ((tka0) hc11Var.t().k()).b.getName().replace('.', '/') + ';');
                            break;
                        }
                    }
                }
            }
            arrayList2.add(str2);
        }
        if (zJ) {
            arrayList2.add("Lkotlin/jvm/internal/DefaultConstructorMarker;");
        }
        return linkedHashSet.isEmpty() ? new hur(str, w7x.a, (byte) 23) : new hur(o7h.y0(arrayList2, "", "(", ")", (iu30) null, 56).concat((String) dh30VarN.c), linkedHashSet, (byte) 23);
    }
}
