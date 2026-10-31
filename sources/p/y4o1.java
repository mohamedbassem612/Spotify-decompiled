package p;

import android.R;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AlphaAnimation;
import androidx.compose.ui.graphics.ColorFilter;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import androidx.compose.ui.unit.TextUnit;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class y4o1 {
    public static final int[] a = {R.attr.state_pressed};
    public static final int[] b = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] c = {R.attr.state_selected};
    public static final int[] d = {R.attr.state_enabled, R.attr.state_pressed};
    public static b180 e;

    public static final void a(cwb1 cwb1Var, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(658335544);
        int i2 = (x340Var.g(cwb1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarN = anm1.N("sticker-track-info", qim0Var);
            jw31 jw31VarA = ew31.a(h36.e, een.N0, x340Var, 0);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            Uri uri = Uri.parse(cwb1Var.a);
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var).g;
            cvx cvxVar = cbx.b(x340Var).b;
            eso1.e(uri, isl.a, anm1.N("sticker-cover-art", uyn1.B(nim0.a, 0.0f, 0.0f, 2.0f, 0.0f, 11)), new p3v(16.0f), (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var, 48, 0, 4080);
            uwo1.e(xcg1.i(cwb1Var.b, " • ", cwb1Var.c), new wnb0(1.0f, false), cbx.d(x340Var).m, 0L, null, null, 2, false, new cjc0(1), 0, null, x340Var, 0, 0, 1720);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(cwb1Var, qim0Var, i, (byte) 3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:98:0x0220 A[LOOP:0: B:96:0x021a->B:98:0x0220, LOOP_END] */
    public static final void b(c380 c380Var, long j, float f, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        qim0 qim0Var3;
        boolean z;
        fi51 fi51Var;
        qim0 qim0Var4;
        Object obj;
        Iterator it;
        c380 c380Var2 = c380Var;
        float f2 = f;
        llj lljVar = y580.Y;
        llj lljVar2 = y580.R0;
        llj lljVar3 = y580.N0;
        llj lljVar4 = y580.O0;
        Object obj2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-650437968);
        j06 j06Var = x340Var.a;
        int i2 = (i & 6) == 0 ? ((i & 8) == 0 ? x340Var.g(c380Var2) : x340Var.i(c380Var2) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i2 |= x340Var.f(j) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f2) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var5 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var5);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z2 = x340Var.S;
            Function0 function0 = hmb0.t1;
            if (z2) {
                x340Var.l(function0);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA, x340Var, lljVar4);
            nko1.H(xos0VarM, x340Var, lljVar3);
            x0d.q(iHashCode, x340Var, lljVar2, x340Var);
            nko1.H(qim0VarE, x340Var, lljVar);
            if (c380Var2.isEmpty()) {
                qim0Var3 = qim0Var5;
                x340Var.i0(-1959856866);
                it = c380Var.iterator();
                while (it.hasNext()) {
                    l(((fi51) it.next()).b, j, f, null, 0, null, x340Var, 8 | (i3 & 112) | (i3 & 896), 56);
                }
                x340Var.r(false);
                z = true;
            } else {
                Iterator it2 = c380Var2.iterator();
                while (true) {
                    if (it2.hasNext()) {
                        vnr0 vnr0Var = ((fi51) it2.next()).a;
                        String str = vnr0Var != null ? vnr0Var.a : null;
                        if (str == null || ihc1.y0(str)) {
                            function0 = function0;
                            qim0Var5 = qim0Var5;
                            f2 = f;
                            obj2 = obj2;
                            c380Var2 = c380Var;
                        } else {
                            x340Var.i0(-1959613795);
                            float fW = oto1.w(f2, 4, x340Var);
                            boolean zE = x340Var.e(c380Var2.size());
                            Object objT = x340Var.T();
                            if (zE || objT == obj2) {
                                objT = new y9e1[c380Var2.size()];
                                x340Var.s0(objT);
                            }
                            y9e1[] y9e1VarArr = (y9e1[]) objT;
                            boolean zD = x340Var.d(fW) | ((i3 & 14) == 4 || ((i3 & 8) != 0 && x340Var.i(c380Var2))) | x340Var.i(y9e1VarArr);
                            Object objT2 = x340Var.T();
                            if (zD || objT2 == obj2) {
                                objT2 = new ih6(fW, c380Var2, y9e1VarArr);
                                x340Var.s0(objT2);
                            }
                            gfh0 gfh0Var = (gfh0) objT2;
                            Object obj3 = obj2;
                            int iHashCode2 = Long.hashCode(x340Var.T);
                            xos0 xos0VarM2 = x340Var.m();
                            qim0 qim0VarE2 = zr7.E(x340Var, qim0Var5);
                            hzj.A.getClass();
                            x340Var.m0();
                            if (x340Var.S) {
                                x340Var.l(function0);
                            } else {
                                x340Var.v0();
                            }
                            nko1.H(gfh0Var, x340Var, lljVar4);
                            nko1.H(xos0VarM2, x340Var, lljVar3);
                            x0d.q(iHashCode2, x340Var, lljVar2, x340Var);
                            int i4 = 0;
                            for (Iterator itN = kk0.n(x340Var, qim0VarE2, lljVar, 1408441025, c380Var2); itN.hasNext(); itN = itN) {
                                Object next = itN.next();
                                int i5 = i4 + 1;
                                if (i4 < 0) {
                                    p7h.T();
                                    throw null;
                                }
                                fi51 fi51Var2 = (fi51) next;
                                if (fi51Var2.a != null) {
                                    x340Var.i0(-815219747);
                                    fi51Var = fi51Var2;
                                    qim0Var4 = qim0Var5;
                                    l(fi51Var2.a, j, f2, null, 3, null, x340Var, 8 | (i3 & 112) | (i3 & 896), 40);
                                    x340Var.r(false);
                                } else {
                                    fi51Var = fi51Var2;
                                    qim0Var4 = qim0Var5;
                                    x340Var.i0(-815009598);
                                    op71.g(x340Var, qim0Var4);
                                    x340Var.r(false);
                                }
                                vnr0 vnr0Var2 = fi51Var.b;
                                boolean zI = x340Var.i(y9e1VarArr) | x340Var.e(i4);
                                Object objT3 = x340Var.T();
                                if (zI) {
                                    obj = obj3;
                                } else {
                                    obj = obj3;
                                    if (objT3 == obj) {
                                    }
                                    f2 = f;
                                    l(vnr0Var2, j, f2, null, 0, (iu30) objT3, x340Var, 8 | (i3 & 112) | (i3 & 896), 24);
                                    obj3 = obj;
                                    qim0Var5 = qim0Var4;
                                    i4 = i5;
                                }
                                objT3 = new ym((Object) y9e1VarArr, i4, (byte) 7);
                                x340Var.s0(objT3);
                                f2 = f;
                                l(vnr0Var2, j, f2, null, 0, (iu30) objT3, x340Var, 8 | (i3 & 112) | (i3 & 896), 24);
                                obj3 = obj;
                                qim0Var5 = qim0Var4;
                                i4 = i5;
                            }
                            qim0Var3 = qim0Var5;
                            z = true;
                            us71.m(x340Var, false, true, false);
                        }
                    } else {
                        qim0Var3 = qim0Var5;
                        x340Var.i0(-1959856866);
                        it = c380Var.iterator();
                        while (it.hasNext()) {
                            l(((fi51) it.next()).b, j, f, null, 0, null, x340Var, 8 | (i3 & 112) | (i3 & 896), 56);
                        }
                        x340Var.r(false);
                        z = true;
                    }
                }
            }
            x340Var.r(z);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uud(c380Var, j, f, qim0Var2, i, (byte) 1);
        }
    }

    public static final void c(int i, int i2, String str, String str2, Function0 function0, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(290668374);
        int i3 = i2 | (x340Var.g(str) ? 4 : 2) | (x340Var.e(i) ? 32 : 16) | (x340Var.g(str2) ? 256 : 128) | (x340Var.i(function0) ? 16384 : 8192);
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            boolean z = (i3 & 112) == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = yv91.a(new ia9(i, (byte) 1));
                x340Var.s0(objT);
            }
            tob1 tob1Var = (tob1) objT;
            boolean zG = ((i3 & 896) == 256) | x340Var.g((String) tob1Var.getValue());
            Object objT2 = x340Var.T();
            if (zG || objT2 == m4cVar) {
                objT2 = yv91.a(new yd6(str2, tob1Var, (byte) 1));
                x340Var.s0(objT2);
            }
            tob1 tob1Var2 = (tob1) objT2;
            uwr uwrVar = cbx.a;
            qim0Var2 = qim0Var;
            qim0 qim0VarF = dug.f(qim0Var2, cbx.a(x340Var).a.c, d4o1.a);
            cvx cvxVar = cbx.b(x340Var).b;
            mta mtaVar = cbx.b(x340Var).d;
            qim0 qim0VarB = uyn1.B(qim0VarF, 0.0f, 12.0f, 48.0f, 0.0f, 9);
            x340Var.j0(475845883);
            wat watVar = (wat) x340Var.k(t4k.h);
            x340Var.j0(-492369756);
            Object objT3 = x340Var.T();
            if (objT3 == m4cVar) {
                objT3 = x0d.o(watVar, x340Var);
            }
            x340Var.r(false);
            ufh0 ufh0Var = (ufh0) objT3;
            x340Var.j0(-492369756);
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar) {
                objT4 = x0d.m(x340Var);
            }
            x340Var.r(false);
            xhl xhlVar = (xhl) objT4;
            x340Var.j0(-492369756);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            x340Var.r(false);
            ven0 ven0Var = (ven0) objT5;
            x340Var.j0(-492369756);
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar) {
                objT6 = x0d.n(xhlVar, x340Var);
            }
            x340Var.r(false);
            nil nilVar = (nil) objT6;
            x340Var.j0(-492369756);
            Object objT7 = x340Var.T();
            if (objT7 == m4cVar) {
                objT7 = bb00.i(rih1.a, f331.X0, x340Var);
            }
            x340Var.r(false);
            ven0 ven0Var2 = (ven0) objT7;
            who1.h(s161.b(qim0VarB, false, new tu(ufh0Var, (byte) 13)), apo.i(x340Var, -1488813576, new uuy((Object) ven0Var2, (Object) xhlVar, (Object) new su(ven0Var, nilVar, (byte) 9), (Object) function0, str, (Object) tob1Var2, (byte) 6)), new ru(ven0Var2, ufh0Var, nilVar, ven0Var, (byte) 9), x340Var, 48);
            x340Var.r(false);
        } else {
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jmd(str, i, str2, qim0Var2, function0, i2);
        }
    }

    public static final void d(int i, String str, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1444760367);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            Uri uri = Uri.parse(str);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            zvx zvxVar = new zvx();
            ecx ecxVar = new ecx(3.0f, 1.0f);
            box boxVar = box.c;
            eso1.e(uri, isl.a, anm1.N("landscape-artwork-highlight-tag", u291.f(qim0Var, 1.0f)), (p3v) null, zvxVar, ecxVar, (j6m) null, (tl3) null, (ColorFilter) null, new nux(boxVar, boxVar), false, false, x340Var, 1073744944, 0, 3520);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var, i, (byte) 3);
        }
    }

    public static final void e(qim0 qim0Var, b0k b0kVar, int i) {
        b0k b0kVar2;
        qim0 qim0Var2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(770778453);
        int i2 = i | 6;
        if (b0kVar3.Y(i2 & 1, (i2 & 3) != 2)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(b0kVar3).b;
            cvx cvxVar2 = cbx.b(b0kVar3).b;
            cvx cvxVar3 = cbx.b(b0kVar3).b;
            cvx cvxVar4 = cbx.b(b0kVar3).b;
            b0kVar2 = b0kVar3;
            ioo1.c(qim0VarF, null, new ydx(4.0f, 12.0f, 8.0f, new zzq0(12.0f, 12.0f, 12.0f, 12.0f)), null, null, null, null, null, null, gni.z, null, null, gni.A, null, null, null, gni.B, b0kVar2, 805306880, 1573248, 60922);
            qim0Var2 = qim0Var3;
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wdk(qim0Var2, i, (byte) 23);
        }
    }

    /* JADX WARN: Code duplicated, block: B:189:0x0401  */
    /* JADX WARN: Code duplicated, block: B:191:0x045e  */
    /* JADX WARN: Code duplicated, block: B:192:0x0469  */
    /* JADX WARN: Code duplicated, block: B:194:0x0473  */
    /* JADX WARN: Code duplicated, block: B:195:0x0475  */
    /* JADX WARN: Code duplicated, block: B:202:0x0487  */
    /* JADX WARN: Code duplicated, block: B:204:0x048a  */
    /* JADX WARN: Code duplicated, block: B:205:0x048c  */
    /* JADX WARN: Code duplicated, block: B:209:0x0495  */
    /* JADX WARN: Code duplicated, block: B:212:0x04a3  */
    /* JADX WARN: Code duplicated, block: B:213:0x04a5  */
    /* JADX WARN: Code duplicated, block: B:217:0x04b7  */
    /* JADX WARN: Code duplicated, block: B:219:0x04ce  */
    public static final void f(mah0 mah0Var, iu30 iu30Var, p410 p410Var, String str, b0k b0kVar, int i) {
        int i2;
        ven0 ven0Var;
        boolean z;
        boolean z2;
        jax haxVar;
        m4c m4cVar;
        Function0 function0;
        int i3;
        f8a f8aVar;
        int i4;
        boolean z3;
        boolean z4;
        Object objT;
        boolean z5;
        boolean zE;
        Object objT2;
        iu30 iu30Var2 = iu30Var;
        m4c m4cVar2 = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1022878120);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mah0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var2) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(p410Var) : x340Var.i(p410Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.g(str) ? 2048 : 1024;
        }
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            boolean z6 = (i2 & 896) == 256 || ((i2 & 512) != 0 && x340Var.i(p410Var));
            Object objT3 = x340Var.T();
            if (z6 || objT3 == m4cVar2) {
                objT3 = new z6h0(p410Var, (byte) 3);
                x340Var.s0(objT3);
            }
            qxd0.i(p410Var, (iu30) objT3, x340Var);
            Object[] objArr = new Object[0];
            Object objT4 = x340Var.T();
            if (objT4 == m4cVar2) {
                objT4 = lxf0.X0;
                x340Var.s0(objT4);
            }
            ven0 ven0Var2 = (ven0) k5p1.s(objArr, (Function0) objT4, x340Var, 48);
            Object objT5 = x340Var.T();
            if (objT5 == m4cVar2) {
                objT5 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT5);
            }
            ven0 ven0Var3 = (ven0) objT5;
            Object objT6 = x340Var.T();
            if (objT6 == m4cVar2) {
                objT6 = v8r.q((Object) null);
                x340Var.s0(objT6);
            }
            ven0 ven0Var4 = (ven0) objT6;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarD, cbx.a(x340Var).a.c, d4o1.a);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z7 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z7) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            boolean zBooleanValue = ((Boolean) ven0Var3.getValue()).booleanValue();
            boolean z8 = !mah0Var.i(mah0Var.b()).isEmpty();
            boolean z9 = !mah0Var.e(mah0Var.b()).isEmpty();
            boolean zD = mah0Var.d();
            int i5 = i2 & 112;
            boolean z10 = i5 == 32;
            Object objT7 = x340Var.T();
            if (z10 || objT7 == m4cVar2) {
                objT7 = new ebg0(iu30Var2, (byte) 17);
                x340Var.s0(objT7);
            }
            Function0 function1 = (Function0) objT7;
            Object objT8 = x340Var.T();
            if (objT8 == m4cVar2) {
                objT8 = new sqa0(ven0Var3, (byte) 27);
                x340Var.s0(objT8);
            }
            iu30 iu30Var3 = (iu30) objT8;
            int i6 = i2 & 14;
            boolean z11 = (i5 == 32) | (i6 == 4);
            Object objT9 = x340Var.T();
            if (z11 || objT9 == m4cVar2) {
                objT9 = new zah0(iu30Var2, mah0Var, (byte) 0);
                x340Var.s0(objT9);
            }
            Function0 function2 = (Function0) objT9;
            boolean z12 = (i5 == 32) | (i6 == 4);
            Object objT10 = x340Var.T();
            if (z12 || objT10 == m4cVar2) {
                objT10 = new zah0(iu30Var2, mah0Var, (byte) 1);
                x340Var.s0(objT10);
            }
            Function0 function3 = (Function0) objT10;
            boolean z13 = i5 == 32;
            Object objT11 = x340Var.T();
            if (z13 || objT11 == m4cVar2) {
                objT11 = new ebg0(iu30Var2, (byte) 19);
                x340Var.s0(objT11);
            }
            int i7 = i2;
            a6o1.g(zBooleanValue, z8, z9, zD, function1, iu30Var3, function2, function3, (Function0) objT11, x340Var, 196608);
            String str2 = (String) ven0Var2.getValue();
            bbh0 bbh0Var = (bbh0) ven0Var4.getValue();
            wnb0 wnb0Var = new wnb0(1.0f, true);
            boolean z14 = i5 == 32;
            Object objT12 = x340Var.T();
            if (z14 || objT12 == m4cVar2) {
                ven0Var = ven0Var4;
                objT12 = new gp0(iu30Var2, ven0Var, (byte) 21);
                x340Var.s0(objT12);
            } else {
                ven0Var = ven0Var4;
            }
            iu30 iu30Var4 = (iu30) objT12;
            Object objT13 = x340Var.T();
            if (objT13 == m4cVar2) {
                objT13 = new sqa0(ven0Var, (byte) 28);
                x340Var.s0(objT13);
            }
            iu30 iu30Var5 = (iu30) objT13;
            Object objT14 = x340Var.T();
            if (objT14 == m4cVar2) {
                objT14 = new sqa0(ven0Var, (byte) 29);
                x340Var.s0(objT14);
            }
            iu30 iu30Var6 = (iu30) objT14;
            boolean zG = x340Var.g(ven0Var2);
            Object objT15 = x340Var.T();
            if (zG || objT15 == m4cVar2) {
                z = false;
                objT15 = new abh0(ven0Var2, (byte) 0);
                x340Var.s0(objT15);
            } else {
                z = false;
            }
            iu30 iu30Var7 = (iu30) objT15;
            boolean z15 = i5 == 32 ? true : z;
            Object objT16 = x340Var.T();
            if (z15 || objT16 == m4cVar2) {
                objT16 = new mhg0(iu30Var2, (byte) 8);
                x340Var.s0(objT16);
            }
            iu30 iu30Var8 = (iu30) objT16;
            boolean z16 = i5 == 32 ? true : z;
            Object objT17 = x340Var.T();
            if (z16 || objT17 == m4cVar2) {
                objT17 = new mhg0(iu30Var2, (byte) 9);
                x340Var.s0(objT17);
            }
            iu30 iu30Var9 = (iu30) objT17;
            boolean z17 = i5 == 32 ? true : z;
            Object objT18 = x340Var.T();
            if (z17 || objT18 == m4cVar2) {
                objT18 = new ipy(iu30Var2, (byte) 16);
                x340Var.s0(objT18);
            }
            int i8 = i7 << 3;
            o4o1.f(mah0Var, str2, bbh0Var, p410Var, str, iu30Var4, iu30Var5, iu30Var6, iu30Var7, iu30Var8, iu30Var9, wnb0Var, (xu30) objT18, x340Var, i6 | 14155776 | (i8 & 7168) | (i8 & 57344));
            qim0 qim0VarN = anm1.N("match_review_save_footer", u291.f(nim0Var, 1.0f));
            mbh mbhVarA2 = jbh.a(f36Var, een.Q0, x340Var, 48);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(mbhVarA2, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            cvx cvxVar = cbx.b(x340Var).b;
            op71.g(x340Var, anm1.N("match_review_save_top_spacer", u291.h(qim0VarF2, 16.0f)));
            idx idxVar = new idx(4);
            if (mah0Var.f == 1) {
                x340Var.i0(-1987817752);
                z2 = false;
                x340Var.r(false);
                haxVar = jax.a;
            } else {
                z2 = false;
                x340Var.i0(-1987816135);
                haxVar = new hax(cwl1.o0(x340Var, 2131957294));
                x340Var.r(false);
            }
            jax jaxVar = haxVar;
            String strO0 = cwl1.o0(x340Var, 2131957293);
            boolean z18 = i5 == 32 ? true : z2;
            Object objT19 = x340Var.T();
            if (z18) {
                m4cVar = m4cVar2;
            } else {
                m4cVar = m4cVar2;
                if (objT19 != m4cVar) {
                    iu30Var2 = iu30Var;
                }
                function0 = (Function0) objT19;
                if (!ihc1.y0(strO0)) {
                    hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                    return;
                }
                foo1.c(new gbx(new y50(strO0), function0), idxVar, anm1.N("match_review_save", nim0Var), jaxVar, null, null, null, null, null, null, apo.r(-909366317, new iah0(mah0Var), x340Var), x340Var, 384, 48, 2024);
                cvx cvxVar2 = cbx.b(x340Var).b;
                op71.g(x340Var, u291.h(nim0Var, 16.0f));
                WeakHashMap weakHashMap = osl1.x;
                op71.g(x340Var, yoo1.D(nim0Var, lhc.g(x340Var).e));
                x340Var.r(true);
                x340Var.r(true);
                i3 = mah0Var.g;
                if (i3 == 0) {
                    x340Var.i0(-227115872);
                    x340Var.r(z2);
                } else {
                    x340Var.i0(-227115871);
                    f8aVar = mah0Var.c;
                    if (f8aVar == null) {
                        i4 = -1;
                    } else {
                        i4 = lah0.a[f8aVar.ordinal()];
                    }
                    if (i4 != 1 || i4 == 2 || i4 == 3) {
                        z3 = true;
                    } else {
                        z3 = z2;
                    }
                    if (i5 == 32) {
                        z4 = true;
                    } else {
                        z4 = z2;
                    }
                    objT = x340Var.T();
                    if (z4 || objT == m4cVar) {
                        objT = new ebg0(iu30Var2, (byte) 20);
                        x340Var.s0(objT);
                    }
                    Function0 function4 = (Function0) objT;
                    if (i5 == 32) {
                        z5 = true;
                    } else {
                        z5 = z2;
                    }
                    zE = x340Var.e(l1d.C(i3)) | z5;
                    objT2 = x340Var.T();
                    if (zE || objT2 == m4cVar) {
                        objT2 = new ck0(iu30Var2, i3, (byte) 15);
                        x340Var.s0(objT2);
                    }
                    h4o1.f(i3, z3, function4, (Function0) objT2, x340Var, 0);
                    x340Var.r(z2);
                }
            }
            iu30Var2 = iu30Var;
            objT19 = new ebg0(iu30Var2, (byte) 18);
            x340Var.s0(objT19);
            function0 = (Function0) objT19;
            if (!ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            }
            foo1.c(new gbx(new y50(strO0), function0), idxVar, anm1.N("match_review_save", nim0Var), jaxVar, null, null, null, null, null, null, apo.r(-909366317, new iah0(mah0Var), x340Var), x340Var, 384, 48, 2024);
            cvx cvxVar3 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.h(nim0Var, 16.0f));
            WeakHashMap weakHashMap2 = osl1.x;
            op71.g(x340Var, yoo1.D(nim0Var, lhc.g(x340Var).e));
            x340Var.r(true);
            x340Var.r(true);
            i3 = mah0Var.g;
            if (i3 == 0) {
                x340Var.i0(-227115872);
                x340Var.r(z2);
            } else {
                x340Var.i0(-227115871);
                f8aVar = mah0Var.c;
                if (f8aVar == null) {
                    i4 = -1;
                } else {
                    i4 = lah0.a[f8aVar.ordinal()];
                }
                if (i4 != 1) {
                    z3 = true;
                } else {
                    z3 = true;
                }
                if (i5 == 32) {
                    z4 = true;
                } else {
                    z4 = z2;
                }
                objT = x340Var.T();
                if (z4) {
                    objT = new ebg0(iu30Var2, (byte) 20);
                    x340Var.s0(objT);
                } else {
                    objT = new ebg0(iu30Var2, (byte) 20);
                    x340Var.s0(objT);
                }
                Function0 function5 = (Function0) objT;
                if (i5 == 32) {
                    z5 = true;
                } else {
                    z5 = z2;
                }
                zE = x340Var.e(l1d.C(i3)) | z5;
                objT2 = x340Var.T();
                if (zE) {
                    objT2 = new ck0(iu30Var2, i3, (byte) 15);
                    x340Var.s0(objT2);
                } else {
                    objT2 = new ck0(iu30Var2, i3, (byte) 15);
                    x340Var.s0(objT2);
                }
                h4o1.f(i3, z3, function5, (Function0) objT2, x340Var, 0);
                x340Var.r(z2);
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new etg0(mah0Var, iu30Var2, p410Var, str, i, (byte) 2);
        }
    }

    public static final void g(mah0 mah0Var, iu30 iu30Var, p410 p410Var, String str, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        String str2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1898778406);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(mah0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= (i & 512) == 0 ? x340Var.g(p410Var) : x340Var.i(p410Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            str2 = str;
            i2 |= x340Var.g(str2) ? 2048 : 1024;
        } else {
            str2 = str;
        }
        int i3 = i2 | 24576;
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            int i4 = i3 & 112;
            boolean z = i4 == 32;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ebg0(iu30Var, (byte) 21);
                x340Var.s0(objT);
            }
            q3p1.b(0, 1, (Function0) objT, x340Var, false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarE = zr7.E(x340Var, qim0Var3);
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
            if (mah0Var.f == 3) {
                x340Var.i0(-1956800485);
                boolean z2 = i4 == 32;
                Object objT2 = x340Var.T();
                if (z2 || objT2 == m4cVar) {
                    objT2 = new ebg0(iu30Var, (byte) 22);
                    x340Var.s0(objT2);
                }
                d4o1.b(0, (Function0) objT2, x340Var, null);
                x340Var.r(false);
            } else {
                x340Var.i0(-1956692791);
                f(mah0Var, iu30Var, p410Var, str2, x340Var, i3 & 8190);
                x340Var.r(false);
            }
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new lqf0(mah0Var, iu30Var, p410Var, str, qim0Var2, i, (byte) 6);
        }
    }

    public static final void h(xfx xfxVar, uvm0 uvm0Var, qim0 qim0Var, boolean z, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(60218608);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xfxVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(uvm0Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(z) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= x340Var.i(iu30Var) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarN = anm1.N("pam-multi-user-prepaid-manager", qim0Var3);
            boolean zI = ((i3 & 7168) == 2048) | x340Var.i(xfxVar) | ((i3 & 57344) == 16384);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new bnr0(xfxVar, z, iu30Var, (byte) 1);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            boolean zI2 = x340Var.i(uvm0Var);
            Object objT2 = x340Var.T();
            if (zI2 || objT2 == m4cVar) {
                objT2 = new wvq0(uvm0Var, (byte) 15);
                x340Var.s0(objT2);
            }
            dm5.a(iu30Var2, qim0VarN, (iu30) objT2, x340Var, 0, 0);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sx1((Object) xfxVar, (Object) uvm0Var, (Object) qim0Var2, z, (Object) iu30Var, i, (byte) 29);
        }
    }

    public static final void i(iu30 iu30Var, jtl1 jtl1Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-444839710);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(iu30Var) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(jtl1Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if (x340Var.Y(i3 & 1, (i3 & 147) != 146)) {
            s260 s260Var = new s260();
            String strO0 = cwl1.o0(x340Var, 2131960700);
            String strO1 = cwl1.o0(x340Var, 2131960699);
            wd50 wd50Var = new wd50(new sd50(2131886207), ud50.f);
            cm10 cm10Var = new cm10(cwl1.o0(x340Var, 2131960684), vnx.c);
            String strO2 = cwl1.o0(x340Var, 2131960698);
            int i4 = i3 & 14;
            boolean z = i4 == 4;
            Object objT = x340Var.T();
            if (z || objT == m4cVar) {
                objT = new ccy0(iu30Var, (byte) 8);
                x340Var.s0(objT);
            }
            Function0 function0 = (Function0) objT;
            boolean z2 = i4 == 4;
            Object objT2 = x340Var.T();
            if (z2 || objT2 == m4cVar) {
                objT2 = new ccy0(iu30Var, (byte) 9);
                x340Var.s0(objT2);
            }
            Function0 function1 = (Function0) objT2;
            boolean z3 = i4 == 4;
            Object objT3 = x340Var.T();
            if (z3 || objT3 == m4cVar) {
                objT3 = new ccy0(iu30Var, (byte) 10);
                x340Var.s0(objT3);
            }
            l6o1.n(wd50Var, strO0, strO2, cm10Var, function0, function1, (Function0) objT3, jtl1Var, s260Var, false, strO1, null, x340Var, ((i3 << 18) & 29360128) | 4096 | ((i3 << 21) & 1879048192), 0, 5120);
            qim0Var2 = nim0.a;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cry0(iu30Var, jtl1Var, qim0Var2, i, (byte) 0);
        }
    }

    public static final void j(zud zudVar, long j, float f, qim0 qim0Var, b0k b0kVar, int i) {
        long j2;
        vnr0 vnr0VarA;
        boolean z;
        vnr0 vnr0VarA2;
        ArrayList<sud> arrayList = zudVar.c;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(974348581);
        int i2 = (i & 6) == 0 ? (x340Var.g(zudVar) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            j2 = j;
            i2 |= x340Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        int i3 = i2;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            mbh mbhVarA = jbh.a(new d36(oto1.w(f, 8, x340Var), true, new um5(false)), een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
            hzj.A.getClass();
            int i4 = 8;
            vnr0 vnr0VarA3 = null;
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
            Paragraph paragraph = zudVar.a;
            if (paragraph == null) {
                x340Var.i0(-531731277);
                x340Var.r(false);
                vnr0VarA = null;
            } else {
                x340Var.i0(-155699954);
                vnr0VarA = shy0.a(paragraph, x340Var);
                x340Var.r(false);
            }
            if (vnr0VarA == null) {
                x340Var.i0(-531708523);
                x340Var.r(false);
                i4 = 8;
                z = false;
            } else {
                x340Var.i0(-531708522);
                if (ihc1.y0(vnr0VarA.a)) {
                    z = false;
                    x340Var.i0(-2119571757);
                } else {
                    x340Var.i0(1594193680);
                    z = false;
                    l(vnr0VarA, j2, f, null, 0, null, x340Var, 8 | (i3 & 112) | (i3 & 896), 56);
                }
                x340Var.r(z);
                x340Var.r(z);
            }
            if (arrayList.isEmpty()) {
                x340Var.i0(-531231897);
                x340Var.r(z);
            } else {
                x340Var.i0(-531576896);
                x340Var.i0(-155692532);
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (sud sudVar : arrayList) {
                    Paragraph paragraph2 = sudVar.a;
                    if (paragraph2 == null) {
                        x340Var.i0(-1768986933);
                        x340Var.r(z);
                        vnr0VarA2 = null;
                    } else {
                        x340Var.i0(635672566);
                        vnr0VarA2 = shy0.a(paragraph2, x340Var);
                        x340Var.r(z);
                    }
                    arrayList2.add(new fi51(vnr0VarA2, shy0.a(sudVar.b, x340Var)));
                }
                x340Var.r(z);
                b(mqo1.A(arrayList2), j, f, null, x340Var, i4 | (i3 & 112) | (i3 & 896));
                x340Var.r(z);
            }
            Paragraph paragraph3 = zudVar.b;
            if (paragraph3 == null) {
                x340Var.i0(-531208493);
            } else {
                x340Var.i0(-155683090);
                vnr0VarA3 = shy0.a(paragraph3, x340Var);
            }
            x340Var.r(z);
            vnr0 vnr0Var = vnr0VarA3;
            if (vnr0Var == null) {
                x340Var.i0(-531185739);
                x340Var.r(z);
            } else {
                x340Var.i0(-531185738);
                if (ihc1.y0(vnr0Var.a)) {
                    x340Var.i0(-1865416964);
                } else {
                    x340Var.i0(-1307101753);
                    l(vnr0Var, j, f, null, 0, null, x340Var, i4 | (i3 & 112) | (i3 & 896), 56);
                }
                x340Var.r(z);
                x340Var.r(z);
            }
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uud(zudVar, j, f, qim0Var, i, (byte) 2);
        }
    }

    public static final void k(int i, String str, b0k b0kVar, qim0 qim0Var) {
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-16945515);
        int i2 = (x340Var.g(str) ? 4 : 2) | i | 48;
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var).h;
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarF = u291.f(qim0Var3, 1.0f);
            float f = cbx.b(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            qim0 qim0VarW = uyn1.w(qim0VarF, new zzq0(16.0f, f, 16.0f, 16.0f));
            Object objT = x340Var.T();
            if (objT == fkj0.X) {
                objT = ej41.c1;
                x340Var.s0(objT);
            }
            uwo1.e(str, anm1.N("section_header_element_test_tag", s161.b(qim0VarW, false, (iu30) objT)), lee1Var, 0L, null, null, 0, false, null, 0, null, x340Var, i2 & 14, 0, 2040);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new uo50(str, qim0Var2, i, (byte) 21);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:56:0x009b  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00be  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:78:0x012a  */
    /* JADX WARN: Code duplicated, block: B:80:0x0138  */
    /* JADX WARN: Code duplicated, block: B:82:0x013c  */
    /* JADX WARN: Code duplicated, block: B:85:0x015d A[LOOP:0: B:83:0x0157->B:85:0x015d, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:89:0x01d9  */
    /* JADX WARN: Code duplicated, block: B:91:0x01e2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:97:? A[RETURN, SYNTHETIC] */
    public static final void l(vnr0 vnr0Var, long j, float f, qim0 qim0Var, int i, iu30 iu30Var, b0k b0kVar, int i2, int i3) throws NoWhenBranchMatchedException {
        long j2;
        int i4;
        iu30 iu30Var2;
        boolean z;
        qim0 qim0Var2;
        iu30 iu30Var3;
        int i5;
        h311 h311VarV;
        iu30 iu30Var4;
        qim0 qim0Var3;
        int i6;
        Object objT;
        lee1 lee1VarA;
        kor0 kor0VarF;
        ArrayList arrayList;
        lee1 lee1Var;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-330467080);
        int i7 = (i2 & 6) == 0 ? ((i2 & 8) == 0 ? x340Var.g(vnr0Var) : x340Var.i(vnr0Var) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            j2 = j;
            i7 |= x340Var.f(j2) ? 32 : 16;
        } else {
            j2 = j;
        }
        if ((i2 & 384) == 0) {
            i7 |= x340Var.d(f) ? 256 : 128;
        }
        int i8 = i7 | 3072;
        if ((i2 & 24576) == 0) {
            if ((i3 & 16) == 0) {
                i4 = i;
                int i9 = x340Var.e(i4) ? 16384 : 8192;
                i8 |= i9;
            } else {
                i4 = i;
            }
            i8 |= i9;
        } else {
            i4 = i;
        }
        int i10 = i3 & 32;
        if (i10 == 0) {
            if ((196608 & i2) == 0) {
                iu30Var2 = iu30Var;
                i8 |= x340Var.i(iu30Var2) ? 131072 : 65536;
            }
            if ((74899 & i8) != 74898) {
                z = true;
            } else {
                z = false;
            }
            if (x340Var.Y(i8 & 1, z)) {
                x340Var.d0();
                if ((i2 & 1) != 0 || x340Var.E()) {
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                        i4 = 5;
                    }
                    qim0 qim0Var4 = nim0.a;
                    if (i10 != 0) {
                        objT = x340Var.T();
                        if (objT == fkj0.X) {
                            objT = fjd.Y;
                            x340Var.s0(objT);
                        }
                        iu30Var4 = (iu30) objT;
                    } else {
                        iu30Var4 = iu30Var2;
                    }
                    qim0Var3 = qim0Var4;
                    i6 = i4;
                } else {
                    x340Var.b0();
                    if ((i3 & 16) != 0) {
                        i8 &= -57345;
                    }
                    qim0Var3 = qim0Var;
                    i8 = i8;
                    i6 = i4;
                    iu30Var4 = iu30Var2;
                }
                x340Var.s();
                lee1 lee1Var2 = vnr0Var.b;
                lee1VarA = lee1.a(lee1Var2, 0L, ((wat) x340Var.k(t4k.h)).L(TextUnit.c(lee1Var2.a.b) * f), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
                kor0VarF = vnr0Var.c;
                if (kor0VarF instanceof jor0) {
                    x340Var.i0(1317600451);
                    x340Var.r(false);
                    lee1Var = lee1VarA;
                } else {
                    if (kor0VarF instanceof ior0) {
                        throw p3d1.k(x340Var, 1317598354, false);
                    }
                    x340Var.i0(1317603089);
                    ior0 ior0Var = (ior0) kor0VarF;
                    List<mor0> list = ior0Var.a;
                    arrayList = new ArrayList(q7h.U(list, 10));
                    for (mor0 mor0Var : list) {
                        zma1 zma1Var = mor0Var.b;
                        arrayList.add(new mor0(mor0Var.a, zma1.a(zma1Var, j2, ((wat) x340Var.k(t4k.h)).L(TextUnit.c(zma1Var.b) * f), (FontWeight) null, (FontStyle) null, (FontFamily) null, 65532)));
                        j2 = j;
                        lee1VarA = lee1VarA;
                    }
                    lee1Var = lee1VarA;
                    kor0VarF = ior0.f(ior0Var, arrayList, (cjc0) null, 14);
                    x340Var.r(false);
                }
                int i11 = i8 >> 6;
                i4 = i6;
                qgo1.f(vnr0.a(vnr0Var, null, lee1Var, kor0VarF, j, 17), qim0Var3, new a0e1(i6), 2, false, iu30Var4, x340Var, (i11 & 896) | (i11 & 112) | 8 | (458752 & i8), 16);
                qim0Var2 = qim0Var3;
                iu30Var3 = iu30Var4;
            } else {
                x340Var.b0();
                qim0Var2 = qim0Var;
                iu30Var3 = iu30Var2;
            }
            i5 = i4;
            h311VarV = x340Var.v();
            if (h311VarV != null) {
                h311VarV.d = new pvd(vnr0Var, j, f, qim0Var2, i5, iu30Var3, i2, i3);
            }
        }
        i8 |= 196608;
        iu30Var2 = iu30Var;
        if ((74899 & i8) != 74898) {
            z = true;
        } else {
            z = false;
        }
        if (x340Var.Y(i8 & 1, z)) {
            x340Var.d0();
            if ((i2 & 1) != 0) {
                if ((i3 & 16) != 0) {
                    i8 &= -57345;
                    i4 = 5;
                }
                qim0 qim0Var5 = nim0.a;
                if (i10 != 0) {
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = fjd.Y;
                        x340Var.s0(objT);
                    }
                    iu30Var4 = (iu30) objT;
                } else {
                    iu30Var4 = iu30Var2;
                }
                qim0Var3 = qim0Var5;
                i6 = i4;
            } else {
                if ((i3 & 16) != 0) {
                    i8 &= -57345;
                    i4 = 5;
                }
                qim0 qim0Var6 = nim0.a;
                if (i10 != 0) {
                    objT = x340Var.T();
                    if (objT == fkj0.X) {
                        objT = fjd.Y;
                        x340Var.s0(objT);
                    }
                    iu30Var4 = (iu30) objT;
                } else {
                    iu30Var4 = iu30Var2;
                }
                qim0Var3 = qim0Var6;
                i6 = i4;
            }
            x340Var.s();
            lee1 lee1Var3 = vnr0Var.b;
            lee1VarA = lee1.a(lee1Var3, 0L, ((wat) x340Var.k(t4k.h)).L(TextUnit.c(lee1Var3.a.b) * f), (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777213);
            kor0VarF = vnr0Var.c;
            if (kor0VarF instanceof jor0) {
                x340Var.i0(1317600451);
                x340Var.r(false);
                lee1Var = lee1VarA;
            } else {
                if (kor0VarF instanceof ior0) {
                    throw p3d1.k(x340Var, 1317598354, false);
                }
                x340Var.i0(1317603089);
                ior0 ior0Var2 = (ior0) kor0VarF;
                List<mor0> list2 = ior0Var2.a;
                arrayList = new ArrayList(q7h.U(list2, 10));
                while (r5.hasNext()) {
                    zma1 zma1Var2 = mor0Var.b;
                    arrayList.add(new mor0(mor0Var.a, zma1.a(zma1Var2, j2, ((wat) x340Var.k(t4k.h)).L(TextUnit.c(zma1Var2.b) * f), (FontWeight) null, (FontStyle) null, (FontFamily) null, 65532)));
                    j2 = j;
                    lee1VarA = lee1VarA;
                }
                lee1Var = lee1VarA;
                kor0VarF = ior0.f(ior0Var2, arrayList, (cjc0) null, 14);
                x340Var.r(false);
            }
            int i12 = i8 >> 6;
            i4 = i6;
            qgo1.f(vnr0.a(vnr0Var, null, lee1Var, kor0VarF, j, 17), qim0Var3, new a0e1(i6), 2, false, iu30Var4, x340Var, (i12 & 896) | (i12 & 112) | 8 | (458752 & i8), 16);
            qim0Var2 = qim0Var3;
            iu30Var3 = iu30Var4;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
            iu30Var3 = iu30Var2;
        }
        i5 = i4;
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new pvd(vnr0Var, j, f, qim0Var2, i5, iu30Var3, i2, i3);
        }
    }

    public static final void m(float f, float f2, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1315281210);
        int i2 = (x340Var.d(f) ? 4 : 2) | i | (x340Var.d(f2) ? 32 : 16) | 128;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            qim0 qim0VarB = uyn1.B(u291.h(u291.v(nim0.a, f), f2), 0.0f, 0.0f, 0.0f, 0.0f, 13);
            uwr uwrVar = cbx.a;
            long jA = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(dug.f(qim0VarB, jA, er31.b(4.0f)), 0L, (hw61) null, 15), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cru(f, f2, i, (byte) 2);
        }
    }

    public static final void n(Uri uri, String str, cwb1 cwb1Var, qim0 qim0Var, b0k b0kVar, int i) {
        Uri uri2;
        int i2;
        x340 x340Var;
        boolean z;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1866239331);
        if ((i & 6) == 0) {
            uri2 = uri;
            i2 = (x340Var2.g(uri2) ? 4 : 2) | i;
        } else {
            uri2 = uri;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.g(cwb1Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 2048 : 1024;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 1171) != 1170)) {
            qim0 qim0VarB = u291.B(qim0Var, (gra) null, 3);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (x340Var2.a == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(hmb0.t1);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            jsl jslVar = !ihc1.y0(str) ? new jsl(str) : isl.a;
            uwr uwrVar = cbx.a;
            cbx.a.getClass();
            ecx ecxVarD = uwr.d();
            h6m h6mVar = mif1.Q0;
            nim0 nim0Var = nim0.a;
            eso1.e(uri2, jslVar, anm1.N("sticker-image", u291.f(nim0Var, 1.0f)), (p3v) null, (zvx) null, ecxVarD, h6mVar, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, i2 & 14, 0, 3992);
            x340Var = x340Var2;
            if (cwb1Var == null) {
                x340Var.i0(1856254549);
                x340Var.r(false);
                z = true;
            } else {
                x340Var.i0(1856254550);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                cvx cvxVar = cbx.b(x340Var).b;
                z = true;
                a(cwb1Var, uyn1.z(0.0f, 4.0f, 1, qim0VarF), x340Var, 0);
                x340Var.r(false);
            }
            x340Var.r(z);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, uri, str, cwb1Var, qim0Var, (byte) 25);
        }
    }

    public static final void o(ewb1 ewb1Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        String str = ewb1Var.b;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1616933102);
        int i2 = (x340Var.g(ewb1Var) ? 4 : 2) | i | (x340Var.i(qim0Var) ? 32 : 16);
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0Var2 = qim0Var;
            x340Var.b0();
        } else if (ewb1Var.e) {
            x340Var.i0(-905446211);
            p(anm1.N("sticker-loading", u291.f(qim0Var, 1.0f)), x340Var, 0);
            x340Var.r(false);
            qim0Var2 = qim0Var;
        } else if (ihc1.y0(str)) {
            qim0Var2 = qim0Var;
            x340Var.i0(-905435694);
            x340Var.r(false);
        } else {
            x340Var.i0(-905441974);
            qim0Var2 = qim0Var;
            n(Uri.parse(str), ewb1Var.c, ewb1Var.f, qim0Var2, x340Var, (i2 << 6) & 7168);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new sdb1(ewb1Var, qim0Var2, i, (byte) 4);
        }
    }

    public static final void p(qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(34911120);
        int i2 = (x340Var.i(qim0Var) ? 4 : 2) | i;
        if (x340Var.Y(i2 & 1, (i2 & 3) != 2)) {
            cbx.a.getClass();
            t1c.a(hno1.f(qim0Var, uwr.d()), x340Var, 0);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nws0(qim0Var, i, (byte) 27);
        }
    }

    public static final void q(qim0 qim0Var, wdn0 wdn0Var, wdn0 wdn0Var2) {
        wdn0Var2.b(qim0Var);
        gv20 gv20Var = null;
        while (wdn0Var2.j()) {
            bdh bdhVar = (qim0) wdn0Var2.l(wdn0Var2.b - 1);
            if (bdhVar instanceof bdh) {
                bdh bdhVar2 = bdhVar;
                wdn0Var2.b(bdhVar2.b);
                wdn0Var2.b(bdhVar2.a);
            } else if (bdhVar instanceof oim0) {
                wdn0Var.b(bdhVar);
            } else {
                if (gv20Var == null) {
                    gv20Var = new gv20(wdn0Var, (byte) 28);
                }
                bdhVar.all(gv20Var);
            }
        }
    }

    public static final void r(uim0 uim0Var, pim0 pim0Var) {
        uim0Var.b(pim0Var);
    }

    public static final int s(oim0 oim0Var, oim0 oim0Var2) {
        if (u890.j(oim0Var, oim0Var2)) {
            return 2;
        }
        return oim0Var.getClass() == oim0Var2.getClass() ? 1 : 0;
    }

    public static void t() {
        Exception exc = new Exception();
        String simpleName = t4n1.class.getSimpleName();
        StackTraceElement stackTraceElement = exc.getStackTrace()[0];
        new StackTraceElement("_COROUTINE.".concat(simpleName), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
    }

    public static od41 u(ipb1 ipb1Var, r1t r1tVar) {
        LinkedHashMap linkedHashMap;
        Bundle bundleC = ipb1Var.c();
        if (bundleC != null) {
            Set<String> setKeySet = bundleC.keySet();
            int iS = zno1.s(q7h.U(setKeySet, 10));
            if (iS < 16) {
                iS = 16;
            }
            linkedHashMap = new LinkedHashMap(iS);
            for (Object obj : setKeySet) {
                linkedHashMap.put(obj, bundleC.getParcelableArrayList((String) obj));
            }
        } else {
            linkedHashMap = null;
        }
        kiv kivVar = pd41.a;
        return new od41(linkedHashMap, r1tVar);
    }

    public static final void v(View view, Function0 function0) {
        if (view.getVisibility() != 0) {
            view.setVisibility(0);
            AlphaAnimation alphaAnimation = new AlphaAnimation(0.0f, 1.0f);
            alphaAnimation.setDuration(1000L);
            alphaAnimation.setFillAfter(true);
            alphaAnimation.setInterpolator(new AccelerateDecelerateInterpolator());
            view.startAnimation(alphaAnimation);
            function0.invoke();
        }
    }

    public static ColorStateList w(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(d, 0));
        }
        return colorStateList;
    }

    public static String x(String str, Object... objArr) {
        int length;
        int iIndexOf;
        StringBuilder sb = new StringBuilder(str.length() + (objArr.length * 16));
        int i = 0;
        int i2 = 0;
        while (true) {
            length = objArr.length;
            if (i >= length || (iIndexOf = str.indexOf("%s", i2)) == -1) {
                break;
            }
            sb.append((CharSequence) str, i2, iIndexOf);
            sb.append(y(objArr[i]));
            i2 = iIndexOf + 2;
            i++;
        }
        sb.append((CharSequence) str, i2, str.length());
        if (i < length) {
            String str2 = " [";
            while (i < objArr.length) {
                sb.append(str2);
                sb.append(y(objArr[i]));
                i++;
                str2 = ", ";
            }
            sb.append(']');
        }
        return sb.toString();
    }

    public static String y(Object obj) {
        if (obj == null) {
            return "null";
        }
        try {
            return obj.toString();
        } catch (Exception e2) {
            String strF = f4i1.f(obj.getClass().getName(), "@", Integer.toHexString(System.identityHashCode(obj)));
            Logger.getLogger("com.google.common.base.Strings").logp(Level.WARNING, "com.google.common.base.Strings", "lenientToString", "Exception during lenientFormat for ".concat(strF), (Throwable) e2);
            return cy30.p("<", strF, " threw ", e2.getClass().getName(), ">");
        }
    }
}
