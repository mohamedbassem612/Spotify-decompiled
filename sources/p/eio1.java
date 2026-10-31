package p;

import android.app.PendingIntent;
import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.IBinder;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import com.spotify.culturalmoments.stories.v1.FeaturedCardStory;
import com.spotify.culturalmoments.stories.v1.ShareData;
import com.spotify.musicappplatform.state.processor.AppLifecycleServicePendingIntent;
import com.spotify.player.model.PlayerState;
import java.util.List;
import java.util.WeakHashMap;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class eio1 {
    public static final StackTraceElement[] a = new StackTraceElement[0];
    public static b180 b;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0053, code lost:
    
        if (r6.e(r7, r0) == r5) goto L21;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object A(p.a2n r6, java.lang.String r7, p.lnm r8) {
        /*
            boolean r0 = r8 instanceof p.d2n
            if (r0 == 0) goto L13
            r0 = r8
            p.d2n r0 = (p.d2n) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.d2n r0 = new p.d2n
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.c
            int r1 = r0.d
            r2 = 0
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L39
            if (r1 == r4) goto L31
            if (r1 != r3) goto L2b
            p.hm5.M(r8)
            goto L56
        L2b:
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r6)
            return r2
        L31:
            java.lang.String r7 = r0.b
            p.a2n r6 = r0.a
            p.hm5.M(r8)
            goto L49
        L39:
            p.hm5.M(r8)
            r0.a = r6
            r0.b = r7
            r0.d = r4
            java.lang.Object r8 = r6.b(r7, r0)
            if (r8 != r5) goto L49
            goto L55
        L49:
            r0.a = r2
            r0.b = r2
            r0.d = r3
            java.lang.Object r6 = r6.e(r7, r0)
            if (r6 != r5) goto L56
        L55:
            return r5
        L56:
            p.rih1 r6 = p.rih1.a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eio1.A(p.a2n, java.lang.String, p.lnm):java.lang.Object");
    }

    public static final ojo0 B(zhq0 zhq0Var) {
        return new ojo0(new vjo0(2131233426, 2131959203), ((zo5) zhq0Var.c).a(AppLifecycleServicePendingIntent.PLAYER_SEEK_BACK_15_SEC, zhq0.h((String) zhq0Var.b)), true);
    }

    public static final ojo0 C(zhq0 zhq0Var, boolean z) {
        return new ojo0(new vjo0(2131233427, 2131959204), ((zo5) zhq0Var.c).a(AppLifecycleServicePendingIntent.PLAYER_SEEK_FORWARD_15_SEC, zhq0.h((String) zhq0Var.b)), z);
    }

    public static boolean D(fc10 fc10Var, boolean z) {
        int i;
        izr0 izr0Var = new izr0(16);
        boolean z2 = true;
        while (true) {
            izr0Var.O(8);
            if (!fc10Var.d(izr0Var.a, 0, 8, true)) {
                break;
            }
            long jG = izr0Var.G();
            int iQ = izr0Var.q();
            if (jG != 1) {
                i = 8;
            } else {
                if (!fc10Var.d(izr0Var.a, 8, 8, true)) {
                    break;
                }
                izr0Var.Q(16);
                jG = izr0Var.K();
                i = 16;
            }
            long j = i;
            if (jG < j) {
                break;
            }
            int i2 = (int) (jG - j);
            if (z2) {
                if (iQ != 1718909296 || i2 < 8) {
                    break;
                }
                izr0Var.O(4);
                fc10Var.h(0, izr0Var.a, 4);
                if (izr0Var.q() != 1751476579) {
                    break;
                }
                if (!z) {
                    return true;
                }
                fc10Var.k(i2 - 4);
                z2 = false;
            } else {
                if (iQ == 1836086884) {
                    return true;
                }
                if (i2 != 0) {
                    fc10Var.k(i2);
                }
            }
        }
        return false;
    }

    public static void E(int i, int i2) {
        String strF;
        if (i < 0 || i >= i2) {
            if (i < 0) {
                strF = gio1.F("%s (%s) must not be negative", "index", Integer.valueOf(i));
            } else {
                if (i2 < 0) {
                    hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
                    return;
                }
                strF = gio1.F("%s (%s) must be less than size (%s)", "index", Integer.valueOf(i), Integer.valueOf(i2));
            }
            throw new IndexOutOfBoundsException(strF);
        }
    }

    public static void F(int i, int i2) {
        if (i < 0 || i > i2) {
            eg.g(H(i, i2, "index"));
        }
    }

    public static void G(int i, int i2, int i3) {
        String strH;
        if (i < 0 || i2 < i || i2 > i3) {
            if (i < 0 || i > i3) {
                strH = H(i, i3, "start index");
            } else {
                strH = (i2 < 0 || i2 > i3) ? H(i2, i3, "end index") : gio1.F("end index (%s) must not be less than start index (%s)", Integer.valueOf(i2), Integer.valueOf(i));
            }
            throw new IndexOutOfBoundsException(strH);
        }
    }

    public static String H(int i, int i2, String str) {
        if (i < 0) {
            return gio1.F("%s (%s) must not be negative", str, Integer.valueOf(i));
        }
        if (i2 >= 0) {
            return gio1.F("%s (%s) must not be greater than size (%s)", str, Integer.valueOf(i), Integer.valueOf(i2));
        }
        hhg1.n(gvg.l(new StringBuilder(String.valueOf(i2).length() + 15), "negative size: ", i2));
        return null;
    }

    public static final void a(dj6 dj6Var, long j, yux yuxVar, float f, float f2, b0k b0kVar, int i) {
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(-1206489950);
        int i2 = i | (b0kVar2.g(dj6Var) ? 4 : 2) | (b0kVar2.f(j) ? 32 : 16) | (b0kVar2.g(yuxVar) ? 256 : 128);
        if (b0kVar2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            qim0 qim0VarH = vi6.h(yuxVar, f, f2, 88.5f, 35.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
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
            nko1.H(gfh0VarC, b0kVar2, y580.O0);
            nko1.H(xos0VarM, b0kVar2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), b0kVar2, y580.R0);
            nko1.F(b0kVar2);
            nko1.H(qim0VarE, b0kVar2, y580.Y);
            String str = dj6Var.a;
            lee1 lee1VarG = vi6.g(yuxVar, 5.0f, 5.0f, 0.0f, 0.0f, b0kVar2, 24);
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            nim0 nim0Var = nim0.a;
            int i3 = (i2 << 3) & 896;
            b0kVar2 = b0kVar2;
            vi6.c(str, lee1VarG, j, u291.h(u291.f(nim0Var, 1.0f), yuxVar.c(14.0f)), 2, 150.0f, null, b0kVar2, i3 | 24576, 64);
            qim0 qim0VarH2 = u291.h(u291.f(eqr0.D(0.0f, yuxVar.c(17.5f), 1, nim0Var), 1.0f), yuxVar.c(19.0f));
            if (dj6Var.c.length() == 0) {
                b0kVar2.i0(1952917439);
                vi6.c(dj6Var.b, vi6.g(yuxVar, 20.0f, 19.0f, 0.0f, vi6.d, b0kVar2, 8), j, qim0VarH2, 0, 50.0f, null, b0kVar2, i3, 80);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(1953298584);
                b(dj6Var, j, yuxVar, qim0VarH2, b0kVar2, i2 & 1022);
                b0kVar2.r(false);
            }
            b0kVar2.r(true);
        } else {
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new pi6(dj6Var, j, yuxVar, f, f2, i);
        }
    }

    public static final void b(dj6 dj6Var, long j, yux yuxVar, qim0 qim0Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(94739146);
        int i2 = i | (x340Var.g(dj6Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(yuxVar) ? 256 : 128) | (x340Var.g(qim0Var) ? 2048 : 1024);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0Var);
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
            mod.b(t4k.n.a(flb0.a), apo.r(-501765180, new qi6((Object) dj6Var, (Object) yuxVar, j, (byte) 0), x340Var), x340Var, 56);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new cg6((Object) dj6Var, j, (Object) yuxVar, (Object) qim0Var, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(h7e h7eVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1347220513);
        int i2 = (x340Var.g(h7eVar) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            if (m7e.a[l1d.C(h7eVar.c)] == 1) {
                x340Var.i0(1893761497);
                yon1.n(h7eVar, iu30Var, x340Var, i2 & 1022);
                x340Var.r(false);
            } else {
                x340Var.i0(1893763700);
                d(h7eVar, iu30Var, x340Var, i2 & 1022);
                x340Var.r(false);
            }
            qim0Var = nim0.a;
        } else {
            x340Var.b0();
        }
        qim0 qim0Var2 = qim0Var;
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swc(h7eVar, iu30Var, qim0Var2, i, (byte) 4);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void d(h7e h7eVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        long j;
        long jA;
        e7e e7eVar = h7eVar.e;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1012992294);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(h7eVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(nim0.a) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            int i3 = h7eVar.c;
            u7h u7hVar = e7eVar != null ? e7eVar.a : null;
            if (u7hVar == null) {
                x340Var.i0(-1471975958);
                uwr uwrVar = cbx.a;
                j = cbx.a(x340Var).b.a;
                x340Var.r(false);
            } else {
                x340Var.i0(-1471977446);
                x340Var.r(false);
                j = u7hVar.a;
            }
            long j2 = j;
            u7h u7hVar2 = e7eVar != null ? e7eVar.b : null;
            if (u7hVar2 == null) {
                x340Var.i0(-1471972822);
                uwr uwrVar2 = cbx.a;
                jA = cbx.a(x340Var).a.a.a();
                x340Var.r(false);
            } else {
                x340Var.i0(-1471974961);
                x340Var.r(false);
                jA = u7hVar2.a;
            }
            mmr0 mmr0VarR = r(x340Var, i3);
            gfx.b(1, apo.r(-509080741, new k7e(iu30Var, h7eVar, jA, ((p3v) mmr0VarR.b).a, ((p3v) mmr0VarR.a).a, j2, i3 == 1 ? 25.0f : 10.0f), x340Var), x340Var, 54);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new l7e(h7eVar, iu30Var, i, (byte) 0);
        }
    }

    public static final void e(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1069557738);
        if (x340Var.Y(i & 1, i != 0)) {
            Context context = (Context) x340Var.k(AndroidCompositionLocals_androidKt.b);
            IBinder windowToken = ((View) x340Var.k(AndroidCompositionLocals_androidKt.f)).getRootView().getWindowToken();
            InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
            boolean zI = x340Var.i(inputMethodManager) | x340Var.i(windowToken);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new j3y0(inputMethodManager, windowToken, (byte) 6);
                x340Var.s0(objT);
            }
            qxd0.h(inputMethodManager, windowToken, (iu30) objT, x340Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new xgr0(i, (byte) 22);
        }
    }

    public static final void f(hux huxVar, String str, b0k b0kVar, int i) {
        hux huxVar2;
        String str2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(971205269);
        int i2 = ((i & 8) == 0 ? x340Var.g(huxVar) : x340Var.i(huxVar) ? 4 : 2) | i | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            huxVar2 = huxVar;
            str2 = str;
            b9p1.b(huxVar2, str2, uyn1.z(0.0f, 8.0f, 1, nim0.a), x340Var, (i2 & 14) | 8 | (i2 & 112), 0);
        } else {
            huxVar2 = huxVar;
            str2 = str;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new grc(huxVar2, str2, i, (byte) 4);
        }
    }

    public static final void g(cm01 cm01Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        qim0 qim0Var2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1490485664);
        int i2 = (x340Var.i(cm01Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16) | 384;
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            kiv kivVar = xce0.a;
            qim0 qim0VarI = zr7.i(qim0VarD, gce0.c);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(x340Var).g, 32, qim0VarI);
            boolean zI = x340Var.i(cm01Var) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (zI || objT == m4cVar) {
                objT = new w3w(cm01Var, iu30Var, (byte) 11);
                x340Var.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = vrw.a1;
                x340Var.s0(objT2);
            }
            dm5.b(iu30Var2, qim0VarP, (iu30) null, (iu30) objT2, (iu30) null, x340Var, 3072, 20);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g6w(cm01Var, iu30Var, qim0Var2, i, (byte) 5);
        }
    }

    public static final void h(boolean z, iu30 iu30Var, qim0 qim0Var, j2i j2iVar, b0k b0kVar, final int i) {
        j2i j2iVar2;
        qim0 qim0Var2;
        boolean z2;
        final boolean z3 = z;
        final iu30 iu30Var2 = iu30Var;
        Object obj = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1597265892);
        int i2 = i | (x340Var.h(z3) ? 4 : 2) | (x340Var.i(iu30Var2) ? 32 : 16) | (x340Var.g(qim0Var) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            Configuration configuration = (Configuration) x340Var.k(AndroidCompositionLocals_androidKt.a);
            View view = (View) x340Var.k(AndroidCompositionLocals_androidKt.f);
            boolean zG = x340Var.g(configuration) | x340Var.g(view);
            Object objT = x340Var.T();
            if (zG || objT == obj) {
                objT = new oql1(view);
                x340Var.s0(objT);
            }
            final oql1 oql1Var = (oql1) objT;
            wat watVar = (wat) x340Var.k(t4k.h);
            final int iI0 = watVar.i0(48.0f);
            Object objT2 = x340Var.T();
            if (objT2 == obj) {
                objT2 = v8r.q((Object) null);
                x340Var.s0(objT2);
            }
            final ven0 ven0Var = (ven0) objT2;
            Object objT3 = x340Var.T();
            if (objT3 == obj) {
                objT3 = bb00.h(0, x340Var);
            }
            hdn0 hdn0Var = (hdn0) objT3;
            Object objT4 = x340Var.T();
            if (objT4 == obj) {
                objT4 = bb00.h(0, x340Var);
            }
            final hdn0 hdn0Var2 = (hdn0) objT4;
            Object objT5 = x340Var.T();
            if (objT5 == obj) {
                objT5 = pzm.i(x340Var);
            }
            lz20 lz20Var = (lz20) objT5;
            k6a1 k6a1Var = (k6a1) x340Var.k(t4k.q);
            String strQ = bno1.q(x340Var, 2131957969);
            String strQ2 = bno1.q(x340Var, 2131957968);
            String strQ3 = bno1.q(x340Var, 2131957970);
            Object objT6 = x340Var.T();
            if (objT6 == obj) {
                objT6 = v8r.q(new gt00());
                x340Var.s0(objT6);
            }
            ven0 ven0Var2 = (ven0) objT6;
            Object objT7 = x340Var.T();
            if (objT7 == obj) {
                objT7 = v8r.q(Boolean.FALSE);
                x340Var.s0(objT7);
            }
            ven0 ven0Var3 = (ven0) objT7;
            int i3 = i2 & 14;
            boolean z4 = i3 == 4;
            int i4 = i2 & 112;
            boolean zG2 = z4 | (i4 == 32) | x340Var.g(oql1Var) | x340Var.g(watVar);
            Object objT8 = x340Var.T();
            if (zG2 || objT8 == obj) {
                objT8 = new nt00(lz20Var, z3, ven0Var3, strQ, strQ2, strQ3, k6a1Var, ven0Var2, iu30Var2, hdn0Var, hdn0Var2);
                lz20Var = lz20Var;
                z3 = z3;
                iu30Var2 = iu30Var2;
                x340Var.s0(objT8);
            }
            nt00 nt00Var = (nt00) objT8;
            boolean zI = x340Var.i(oql1Var) | x340Var.e(iI0);
            Object objT9 = x340Var.T();
            if (zI || objT9 == obj) {
                objT9 = new jt00(oql1Var, iI0, ven0Var, hdn0Var, hdn0Var2);
                x340Var.s0(objT9);
            }
            qim0Var2 = qim0Var;
            qim0 qim0VarX = ern1.x(qim0Var2, (iu30) objT9);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iK = tgp1.k(x340Var);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
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
            llj lljVar = y580.R0;
            if (x340Var.S || !u890.j(x340Var.T(), Integer.valueOf(iK))) {
                z5c.f(iK, x340Var, iK, lljVar);
            }
            nko1.H(qim0VarE, x340Var, y580.Y);
            j2iVar2 = j2iVar;
            j2iVar2.invoke(nt00Var, x340Var, 48);
            x340Var.r(true);
            if (z3) {
                x340Var.i0(209894723);
                boolean zI2 = x340Var.i(oql1Var) | x340Var.e(iI0);
                Object objT10 = x340Var.T();
                if (zI2 || objT10 == obj) {
                    objT10 = new Function0() { // from class: p.kt00
                        /* JADX WARN: Code duplicated, block: B:15:0x0058  */
                        public final Object invoke() {
                            int iU;
                            View view2 = oql1Var.a;
                            Rect rect = new Rect();
                            view2.getWindowVisibleDisplayFrame(rect);
                            int i5 = rect.top;
                            int i6 = rect.bottom;
                            elb0 elb0Var = (elb0) ven0Var.getValue();
                            n511 n511VarG = (elb0Var == null || !elb0Var.a()) ? n511.e : anm1.g(elb0Var.p(0L), o0c.R(elb0Var.b()));
                            int i7 = iI0;
                            int i8 = i5 + i7;
                            int i9 = i6 - i7;
                            float f = n511VarG.b;
                            if (f <= i6) {
                                float f2 = n511VarG.d;
                                if (f2 < i5) {
                                    iU = i9 - i8;
                                } else {
                                    iU = jch0.U(Math.max(f - i8, i9 - f2));
                                }
                            } else {
                                iU = i9 - i8;
                            }
                            hdn0Var2.t(Math.max(iU, 0));
                            return rih1.a;
                        }
                    };
                    x340Var.s0(objT10);
                }
                z2 = false;
                gio1.c((Function0) objT10, x340Var, 0);
                x340Var.r(false);
            } else {
                z2 = false;
                x340Var.i0(210228190);
                x340Var.r(false);
            }
            boolean z5 = i3 == 4 ? true : z2;
            Object objT11 = x340Var.T();
            if (z5 || objT11 == obj) {
                objT11 = new jea(z3, lz20Var, (byte) 4);
                x340Var.s0(objT11);
            }
            qxd0.S((Function0) objT11, x340Var);
            if (i4 == 32) {
                z2 = true;
            }
            Object objT12 = x340Var.T();
            if (z2 || objT12 == obj) {
                objT12 = new f8v(iu30Var2, (byte) 1);
                x340Var.s0(objT12);
            }
            t3p1.a(i3, (Function0) objT12, x340Var, z3);
        } else {
            j2iVar2 = j2iVar;
            qim0Var2 = qim0Var;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            final qim0 qim0Var3 = qim0Var2;
            final j2i j2iVar3 = j2iVar2;
            h311VarV.d = new vu30(z3, iu30Var2, qim0Var3, j2iVar3, i) { // from class: p.lt00
                public final /* synthetic */ boolean a;
                public final /* synthetic */ iu30 b;
                public final /* synthetic */ qim0 c;
                public final /* synthetic */ j2i d;

                public final Object invoke(Object obj2, Object obj3) {
                    ((Integer) obj3).getClass();
                    int iP = czo1.p(3073);
                    eio1.h(this.a, this.b, this.c, this.d, (b0k) obj2, iP);
                    return rih1.a;
                }
            };
        }
    }

    public static final void i(str0 str0Var, iu30 iu30Var, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-120897799);
        int i2 = (x340Var.g(str0Var) ? 4 : 2) | i | (x340Var.i(iu30Var) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            String strO0 = cwl1.o0(x340Var, 2131959575);
            String strO1 = cwl1.o0(x340Var, 2131959578);
            String strN0 = cwl1.n0(2131959576, new Object[]{strO0, strO1}, x340Var);
            c9 c9VarS = mqo1.s(new mae1(strO0, "https://support.spotify.com/article/explicit-content/plain/"), new mae1(strO1, "https://support.spotify.com/article/managed-accounts/plain/"));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new ozp0(str0Var, iu30Var, (byte) 24);
                x340Var.s0(objT);
            }
            i8p1.i(strN0, c9VarS, (iu30) objT, null, null, 0L, 0L, x340Var, 0, 120);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new jyo0(str0Var, iu30Var, i, (byte) 22);
        }
    }

    public static final void j(lik1 lik1Var, int i, str0 str0Var, iu30 iu30Var, b0k b0kVar, int i2) {
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2085939521);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.g(lik1Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= x340Var.e(i) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= (i2 & 512) == 0 ? x340Var.g(str0Var) : x340Var.i(str0Var) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= x340Var.i(iu30Var) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            irn1.u(null, apo.r(1137935854, new nbf0(i, str0Var, iu30Var), x340Var), null, null, apo.r(1350025704, new hho0(str0Var, iu30Var, lik1Var, (byte) 2), x340Var), x340Var, 24624, 13);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk0(lik1Var, i, str0Var, iu30Var, i2, (byte) 11);
        }
    }

    public static final void k(int i, int i2, b0k b0kVar, qim0 qim0Var) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1982409773);
        int i3 = (x340Var.e(i) ? 4 : 2) | i2 | (x340Var.g(qim0Var) ? 32 : 16);
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            gra graVar = een.h;
            qim0 qim0VarR = u291.r(qim0Var, 24.0f);
            uwr uwrVar = cbx.a;
            qim0 qim0VarF = dug.f(qim0VarR, cbx.a(x340Var).c.c, er31.a);
            gfh0 gfh0VarC = t1c.c(graVar, false);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
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
            uwo1.e(String.valueOf(i), null, cbx.d(x340Var).k, cbx.a(x340Var).a.c, null, null, 0, false, null, 0, null, x340Var, 0, 0, 2034);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new mq2((byte) 28, i, i2, qim0Var);
        }
    }

    public static final void l(fj6 fj6Var, long j, yux yuxVar, b0k b0kVar, int i) {
        yux yuxVar2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(303346234);
        int i2 = i | (x340Var.g(fj6Var) ? 4 : 2) | (x340Var.f(j) ? 32 : 16) | (x340Var.g(yuxVar) ? 256 : 128);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            qim0 qim0VarH = vi6.h(yuxVar, 51.0f, 282.0f, 124.0f, 41.0f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var, 6);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarH);
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
            String str = fj6Var.a;
            float f = vi6.d;
            lee1 lee1VarG = vi6.g(yuxVar, 5.0f, 5.0f, 0.0f, f, x340Var, 8);
            yuxVar2 = yuxVar;
            uwr uwrVar = cbx.a;
            Object obj = ajx.a.b;
            nim0 nim0Var = nim0.a;
            int i3 = (i2 << 3) & 896;
            vi6.c(str, lee1VarG, j, u291.f(nim0Var, 1.0f), 0, 150.0f, new p3v(yuxVar2.c(5.0f)), x340Var, i3 | 3072, 16);
            op71.g(x340Var, u291.h(nim0Var, yuxVar2.c(4.0f)));
            vi6.c(fj6Var.b, vi6.g(yuxVar2, 12.0f, 12.0f, -0.12f, f, x340Var, 0), j, u291.f(nim0Var, 1.0f), 2, 50.0f, new p3v(yuxVar2.c(12.0f)), x340Var, i3 | 27648, 0);
            x340Var.r(true);
        } else {
            yuxVar2 = yuxVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qi6((Object) fj6Var, j, (Object) yuxVar2, i, (byte) 1);
        }
    }

    public static final void m(gj6 gj6Var, aj6 aj6Var, yux yuxVar, b0k b0kVar, int i) {
        b0k b0kVar2;
        tl3 tl3Var;
        vu30 vu30Var;
        wi6 wi6Var = aj6Var.b;
        fj6 fj6Var = wi6Var.e;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(-913385408);
        j06 j06Var = ((x340) b0kVar3).a;
        int i2 = i | (b0kVar3.g(gj6Var) ? 4 : 2) | (b0kVar3.g(aj6Var) ? 32 : 16) | (b0kVar3.g(yuxVar) ? 256 : 128);
        if (b0kVar3.Y(i2 & 1, (i2 & 147) != 146)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarD = u291.d(nim0Var, 1.0f);
            tl3 tl3Var2 = een.d;
            gfh0 gfh0VarC = t1c.c(tl3Var2, false);
            int iHashCode = Long.hashCode(((x340) b0kVar3).T);
            xos0 xos0VarM = b0kVar3.m();
            qim0 qim0VarE = zr7.E(b0kVar3, qim0VarD);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar3.m0();
            boolean z = ((x340) b0kVar3).S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                b0kVar3.l(n4kVar);
            } else {
                b0kVar3.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, b0kVar3, lljVar);
            vu30 vu30Var2 = y580.N0;
            nko1.H(xos0VarM, b0kVar3, vu30Var2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar2 = y580.R0;
            nko1.H(numValueOf, b0kVar3, lljVar2);
            nko1.F(b0kVar3);
            llj lljVar3 = y580.Y;
            nko1.H(qim0VarE, b0kVar3, lljVar3);
            if (fj6Var == null) {
                b0kVar3.i0(377558104);
                b0kVar3.r(false);
                tl3Var = tl3Var2;
                b0kVar2 = b0kVar3;
                vu30Var = vu30Var2;
            } else {
                b0kVar3.i0(377558105);
                b0kVar2 = b0kVar3;
                tl3Var = tl3Var2;
                vu30Var = vu30Var2;
                vi6.b(fj6Var.c, vi6.h(yuxVar, 0.0f, 282.0f, 41.0f, 41.0f), null, b0kVar2, 8, 4);
                b0kVar2.r(false);
            }
            yk4 yk4VarJ = vi6.j(gj6Var.l, b0kVar2);
            long j = yk4VarJ != null ? u7h.f : gj6Var.k;
            z3g1 z3g1Var = gj6Var.f ? vi6.c : vi6.b;
            long j2 = j;
            qim0 qim0VarI = vi6.i(u291.d(nim0Var, 1.0f), yk4VarJ);
            gfh0 gfh0VarC2 = t1c.c(tl3Var, false);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarI);
            b0kVar2.m0();
            if (((x340) b0kVar2).S) {
                b0kVar2.l(n4kVar);
            } else {
                b0kVar2.v0();
            }
            nko1.H(gfh0VarC2, b0kVar2, lljVar);
            nko1.H(xos0VarM2, b0kVar2, vu30Var);
            x0d.q(iHashCode2, b0kVar2, lljVar2, b0kVar2);
            nko1.H(qim0VarE2, b0kVar2, lljVar3);
            int i3 = i2 & 896;
            b0kVar3 = b0kVar2;
            vi6.a(gj6Var.c, j2, yuxVar, z3g1Var, vi6.h(yuxVar, 10.0f, z3g1Var.e + 37.0f, 174.0f, 88.0f), b0kVar3, i3);
            t1c.a(dug.f(vi6.h(yuxVar, 0.0f, 147.0f, 184.0f, 0.5f), j2, d4o1.a), b0kVar3, 0);
            int i4 = i3 | 27648;
            a(wi6Var.a, j2, yuxVar, 0.0f, 160.5f, b0kVar3, i4);
            a(wi6Var.b, j2, yuxVar, 95.0f, 160.5f, b0kVar3, i4);
            a(wi6Var.c, j2, yuxVar, 0.0f, 219.5f, b0kVar3, i4);
            a(wi6Var.d, j2, yuxVar, 95.0f, 219.5f, b0kVar3, i4);
            if (fj6Var == null) {
                b0kVar3.i0(-667778166);
            } else {
                b0kVar3.i0(-667778165);
                l(fj6Var, j2, yuxVar, b0kVar3, i3);
            }
            b0kVar3.r(false);
            b0kVar3.r(true);
            b0kVar3.r(true);
        } else {
            b0kVar3.b0();
        }
        h311 h311VarV = b0kVar3.v();
        if (h311VarV != null) {
            h311VarV.d = new oj2(gj6Var, aj6Var, yuxVar, i, (byte) 25);
        }
    }

    public static final void n(List list, String str, lb50 lb50Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1269136758);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(list) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(str) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(lb50Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.i(qim0Var) ? 2048 : 1024;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 1171) != 1170)) {
            x340Var.b0();
        } else if (list.size() == 1) {
            x340Var.i0(256251152);
            Object objT = x340Var.T();
            if (objT == m4cVar) {
                objT = new bnh1(lb50Var);
                x340Var.s0(objT);
            }
            cnh1 cnh1Var = new cnh1((zmh1) o7h.V0(list), str);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            otw.c((bnh1) objT, cnh1Var, uyn1.z(16.0f, 0.0f, 2, qim0Var), (ipb1) null, x340Var, 0, 8);
            x340Var.r(false);
        } else {
            x340Var.i0(256536941);
            Object objT2 = x340Var.T();
            if (objT2 == m4cVar) {
                objT2 = new wmh1(lb50Var);
                x340Var.s0(objT2);
            }
            otw.c((wmh1) objT2, new xmh1(list, str), qim0Var, (ipb1) null, x340Var, (i2 >> 3) & 896, 8);
            x340Var = x340Var;
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ncf1(i, list, str, lb50Var, qim0Var, (byte) 13);
        }
    }

    public static final pim0 o(x4t x4tVar) {
        pim0 pim0Var = ((pim0) x4tVar).a.f;
        if (pim0Var == null || (pim0Var.d & 4) == 0) {
            return null;
        }
        while (pim0Var != null) {
            int i = pim0Var.c;
            if ((i & 2) != 0) {
                return null;
            }
            if ((i & 4) != 0) {
                return pim0Var;
            }
            pim0Var = pim0Var.f;
        }
        return null;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x009a A[PHI: r9 r10 r11
      0x009a: PHI (r9v5 java.lang.String) = (r9v4 java.lang.String), (r9v10 java.lang.String) binds: [B:32:0x0097, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r10v3 java.lang.String) = (r10v2 java.lang.String), (r10v6 java.lang.String) binds: [B:32:0x0097, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]
      0x009a: PHI (r11v4 p.a2n) = (r11v3 p.a2n), (r11v7 p.a2n) binds: [B:32:0x0097, B:17:0x0038] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a8, code lost:
    
        if (r11.t(r10, r9, r0) == r7) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final java.lang.Object p(p.a2n r9, java.lang.String r10, java.lang.String r11, java.lang.String r12, p.onm r13) {
        /*
            boolean r0 = r13 instanceof p.b2n
            if (r0 == 0) goto L13
            r0 = r13
            p.b2n r0 = (p.b2n) r0
            int r1 = r0.f
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f = r1
            goto L18
        L13:
            p.b2n r0 = new p.b2n
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.e
            int r1 = r0.f
            r2 = 4
            r3 = 3
            r4 = 2
            r5 = 1
            r6 = 0
            p.d9n r7 = p.d9n.a
            if (r1 == 0) goto L58
            if (r1 == r5) goto L4c
            if (r1 == r4) goto L42
            if (r1 == r3) goto L38
            if (r1 != r2) goto L32
            p.hm5.M(r13)
            goto Lab
        L32:
            java.lang.String r9 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r9)
            return r6
        L38:
            java.lang.String r9 = r0.c
            java.lang.String r10 = r0.b
            p.a2n r11 = r0.a
            p.hm5.M(r13)
            goto L9a
        L42:
            java.lang.String r9 = r0.c
            java.lang.String r10 = r0.b
            p.a2n r11 = r0.a
            p.hm5.M(r13)
            goto L89
        L4c:
            java.lang.String r12 = r0.d
            java.lang.String r11 = r0.c
            java.lang.String r10 = r0.b
            p.a2n r9 = r0.a
            p.hm5.M(r13)
            goto L6c
        L58:
            p.hm5.M(r13)
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.d = r12
            r0.f = r5
            java.lang.Object r13 = r9.D(r0)
            if (r13 != r7) goto L6c
            goto Laa
        L6c:
            boolean r12 = p.u890.j(r13, r12)
            if (r12 != 0) goto L75
            java.lang.Boolean r9 = java.lang.Boolean.FALSE
            return r9
        L75:
            r0.a = r9
            r0.b = r10
            r0.c = r11
            r0.d = r6
            r0.f = r4
            java.lang.Object r12 = r9.L(r10, r0)
            if (r12 != r7) goto L86
            goto Laa
        L86:
            r8 = r11
            r11 = r9
            r9 = r8
        L89:
            r0.a = r11
            r0.b = r10
            r0.c = r9
            r0.d = r6
            r0.f = r3
            java.lang.Object r12 = r11.R(r10, r0)
            if (r12 != r7) goto L9a
            goto Laa
        L9a:
            r0.a = r6
            r0.b = r6
            r0.c = r6
            r0.d = r6
            r0.f = r2
            java.lang.Object r9 = r11.t(r10, r9, r0)
            if (r9 != r7) goto Lab
        Laa:
            return r7
        Lab:
            java.lang.Boolean r9 = java.lang.Boolean.TRUE
            return r9
        */
        throw new UnsupportedOperationException("Method not decompiled: p.eio1.p(p.a2n, java.lang.String, java.lang.String, java.lang.String, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:23:0x00db  */
    /* JADX WARN: Code duplicated, block: B:24:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object q(FeaturedCardStory featuredCardStory, g8c1 g8c1Var, onm onmVar) {
        j8c1 j8c1Var;
        mmr0 mmr0Var;
        jlw0 jlw0Var;
        ShareData shareDataT;
        xn10 xn10Var;
        mmr0 mmr0Var2;
        if (onmVar instanceof j8c1) {
            j8c1Var = (j8c1) onmVar;
            int i = j8c1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                j8c1Var.c = i - Integer.MIN_VALUE;
            } else {
                j8c1Var = new j8c1(onmVar);
            }
        } else {
            j8c1Var = new j8c1(onmVar);
        }
        Object objG = j8c1Var.b;
        int i2 = j8c1Var.c;
        if (i2 == 0) {
            hm5.M(objG);
            if (featuredCardStory.s() == wn10.d) {
                v290 v290Var = (v290) g8c1Var.f.d;
                String strX = featuredCardStory.x();
                v290Var.getClass();
                String strN = wqn1.n(strX);
                ua91 ua91Var = g8c1Var.f;
                mmr0Var = new mmr0(new vn10(new hce1(strN, (woa) ua91Var.b, (kma) ua91Var.e), (byte) 1), new jlw0(featuredCardStory.u(), featuredCardStory.n().n()));
            } else {
                gw70 gw70Var = g8c1Var.c;
                String strU = featuredCardStory.u();
                j8c1Var.a = featuredCardStory;
                j8c1Var.c = 1;
                objG = zho1.G(strU, j8c1Var, gw70Var);
                d9n d9nVar = d9n.a;
                if (objG == d9nVar) {
                    return d9nVar;
                }
            }
            vn10 vn10Var = (vn10) mmr0Var.a;
            jlw0Var = (jlw0) mmr0Var.b;
            shareDataT = featuredCardStory.t();
            xn10Var = new xn10(featuredCardStory.w().o(), featuredCardStory.v().o(), featuredCardStory.r(), featuredCardStory.p(), featuredCardStory.o());
            if (shareDataT == null) {
                mmr0Var2 = new mmr0(gy61.a, dy61.a);
            } else {
                mmr0Var2 = new mmr0(hy61.a, new ey61(new yt91(shareDataT, xn10Var, jlw0Var, (byte) 27)));
            }
            return new zn10(vn10Var, (iy61) mmr0Var2.a, (fy61) mmr0Var2.b);
        }
        if (i2 != 1) {
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        featuredCardStory = j8c1Var.a;
        hm5.M(objG);
        mmr0Var = new mmr0(new vn10(new dr70((Bitmap) objG), (byte) 0), new jlw0(featuredCardStory.u(), featuredCardStory.n().n()));
        vn10 vn10Var2 = (vn10) mmr0Var.a;
        jlw0Var = (jlw0) mmr0Var.b;
        shareDataT = featuredCardStory.t();
        xn10Var = new xn10(featuredCardStory.w().o(), featuredCardStory.v().o(), featuredCardStory.r(), featuredCardStory.p(), featuredCardStory.o());
        if (shareDataT == null) {
            mmr0Var2 = new mmr0(gy61.a, dy61.a);
        } else {
            mmr0Var2 = new mmr0(hy61.a, new ey61(new yt91(shareDataT, xn10Var, jlw0Var, (byte) 27)));
        }
        return new zn10(vn10Var2, (iy61) mmr0Var2.a, (fy61) mmr0Var2.b);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final mmr0 r(b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int iC = l1d.C(i);
        if (iC != 0) {
            if (iC == 1) {
                x340 x340Var = (x340) b0kVar;
                x340Var.i0(-236043994);
                p3v p3vVar = new p3v(60.0f);
                uwr uwrVar = cbx.a;
                cvx cvxVar = cbx.b(x340Var).b;
                mmr0 mmr0Var = new mmr0(p3vVar, new p3v(4.0f));
                x340Var.r(false);
                return mmr0Var;
            }
            if (iC != 2) {
                throw p3d1.k((x340) b0kVar, -236047400, false);
            }
        }
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.i0(-236045914);
        p3v p3vVar2 = new p3v(85.0f);
        uwr uwrVar2 = cbx.a;
        cvx cvxVar2 = cbx.b(x340Var2).b;
        mmr0 mmr0Var2 = new mmr0(p3vVar2, new p3v(8.0f));
        x340Var2.r(false);
        return mmr0Var2;
    }

    public static int s(xlb0 xlb0Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        return xlb0Var.d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), new vfh0(afh0Var, 2, 2, (byte) 0), jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int t(xlb0 xlb0Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        return xlb0Var.d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), new vfh0(afh0Var, 2, 1, (byte) 0), jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    public static int u(xlb0 xlb0Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        return xlb0Var.d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), new vfh0(afh0Var, 1, 2, (byte) 0), jjl.b(0, i, 0, 0, 13)).getHeight();
    }

    public static int v(xlb0 xlb0Var, x5f0 x5f0Var, afh0 afh0Var, int i) {
        return xlb0Var.d(new c990(x5f0Var, x5f0Var.getLayoutDirection()), new vfh0(afh0Var, 1, 1, (byte) 0), jjl.b(0, 0, 0, i, 7)).getWidth();
    }

    public static final ojo0 w(PlayerState playerState, zhq0 zhq0Var, boolean z) {
        return playerState.restrictions().disallowSkippingNextReasons().isEmpty() ? new ojo0(new vjo0(2131233420, 2131954296), ((zo5) zhq0Var.c).a(AppLifecycleServicePendingIntent.PLAYER_SKIP_NEXT, zhq0.h((String) zhq0Var.b)), z) : new ojo0(new vjo0(2131233421, 2131954297), (PendingIntent) null, z);
    }

    public static final ojo0 x(PlayerState playerState, zhq0 zhq0Var) {
        String str = (String) zhq0Var.b;
        zo5 zo5Var = (zo5) zhq0Var.c;
        return playerState.isPaused() ? new ojo0(new vjo0(2131233423, 2131954300), zo5Var.a(AppLifecycleServicePendingIntent.PLAYER_RESUME, zhq0.h(str)), true) : new ojo0(new vjo0(2131233422, 2131959877), zo5Var.a(AppLifecycleServicePendingIntent.PLAYER_PAUSE, zhq0.h(str)), true);
    }

    public static final ojo0 y(PlayerState playerState, zhq0 zhq0Var, boolean z) {
        return (playerState.restrictions().disallowSkippingPrevReasons().isEmpty() || playerState.restrictions().disallowSeekingReasons().isEmpty()) ? new ojo0(new vjo0(2131233424, 2131954302), ((zo5) zhq0Var.c).a(AppLifecycleServicePendingIntent.PLAYER_SKIP_PREV, zhq0.h((String) zhq0Var.b)), z) : new ojo0(new vjo0(2131233425, 2131954303), (PendingIntent) null, z);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static final Object z(a2n a2nVar, String str, lnm lnmVar) {
        c2n c2nVar;
        if (lnmVar instanceof c2n) {
            c2nVar = (c2n) lnmVar;
            int i = c2nVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                c2nVar.d = i - Integer.MIN_VALUE;
            } else {
                c2nVar = new c2n(lnmVar);
            }
        } else {
            c2nVar = new c2n(lnmVar);
        }
        Object objD = c2nVar.c;
        int i2 = c2nVar.d;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            c2nVar.a = a2nVar;
            c2nVar.b = str;
            c2nVar.d = 1;
            objD = a2nVar.D(c2nVar);
            if (objD != d9nVar) {
            }
            return d9nVar;
        }
        if (i2 != 1) {
            if (i2 == 2) {
                hm5.M(objD);
                return rih1Var;
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        str = c2nVar.b;
        a2nVar = c2nVar.a;
        hm5.M(objD);
        if (u890.j(objD, str)) {
            c2nVar.a = null;
            c2nVar.b = null;
            c2nVar.d = 2;
            if (a2nVar.R(str, c2nVar) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
    }
}
