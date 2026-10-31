package p;

import android.app.Application;
import android.content.Context;
import android.os.Bundle;
import androidx.compose.ui.graphics.Brush;
import com.facebook.FacebookException;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.Arrays;
import java.util.Set;
import java.util.UUID;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class w0o1 {
    public static final f0u[] a = {f0u.e, f0u.Y, f0u.X, f0u.h, f0u.g, f0u.b, f0u.c, f0u.d, f0u.i, f0u.t, f0u.N0, f0u.R0};
    public static b180 b;

    public static final void a(v3h1 v3h1Var, int i, Object obj, int i2, b0k b0kVar, int i3) {
        h311 h311VarV;
        z3h1 z3h1Var;
        maa maaVarB;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(2132290934);
        int i4 = (x340Var.i(v3h1Var) ? 4 : 2) | i3 | (x340Var.e(i) ? 32 : 16) | (x340Var.i(obj) ? 256 : 128) | (x340Var.e(i2) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            if (i < 0 || i >= v3h1Var.a()) {
                h311VarV = x340Var.v();
                if (h311VarV == null) {
                    return;
                } else {
                    z3h1Var = new z3h1(v3h1Var, i, obj, i2, i3, (byte) 0);
                }
            } else {
                e(v3h1Var, i, obj, i2, x340Var, i4 & 8190);
                v3h1Var.h(i);
                y3h1 y3h1VarI = (i < 0 || i >= v3h1Var.a()) ? null : v3h1Var.i(i);
                if (y3h1VarI == null || !u890.j(y3h1VarI.a.getId(), obj)) {
                    y3h1VarI = null;
                }
                if (y3h1VarI == null) {
                    x340Var.i0(513233261);
                    x340Var.r(false);
                } else {
                    x340Var.i0(513233262);
                    fuj item = y3h1VarI.a.getItem();
                    if (item == null) {
                        x340Var.i0(-2054189660);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(-2054189659);
                        Class<?> cls = item.getClass();
                        jd11 jd11Var = rc11.a;
                        tka0 tka0VarB = jd11Var.b(cls);
                        if (item instanceof fuj) {
                            maaVarB = item.a;
                        } else {
                            if (item instanceof aak1) {
                                throw null;
                            }
                            maaVarB = item instanceof d2i ? ((d2i) item).a : jd11Var.b(item.getClass());
                        }
                        x340Var.f0(-526981658, x340Var.K(tka0VarB, maaVarB));
                        xpn1.b(item, y3h1VarI.d, y3h1VarI.b, x340Var, 0);
                        x340Var.r(false);
                        x340Var.r(false);
                    }
                    x340Var.r(false);
                }
            }
            h311VarV.d = z3h1Var;
        }
        x340Var.b0();
        h311VarV = x340Var.v();
        if (h311VarV != null) {
            z3h1Var = new z3h1(v3h1Var, i, obj, i2, i3, (byte) 1);
            h311VarV.d = z3h1Var;
        }
    }

    public static final void b(pu50 pu50Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1165739102);
        if ((i & 6) == 0) {
            i2 = (x340Var.g(pu50Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.g(qim0Var) ? 256 : 128;
        }
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            xtb0 xtb0VarA = aub0.a(0, x340Var, 3);
            qim0 qim0VarT = zro1.t(qim0Var, xtb0VarA);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            d36 d36Var = new d36(16.0f, true, new um5(false));
            boolean z = ((i2 & 14) == 4) | ((i2 & 112) == 32);
            Object objT = x340Var.T();
            if (z || objT == fkj0.X) {
                objT = new fz40(pu50Var, iu30Var, (byte) 13);
                x340Var.s0(objT);
            }
            ujo1.e(qim0VarT, xtb0VarA, null, d36Var, null, null, false, null, (iu30) objT, x340Var, 0, 492);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(pu50Var, iu30Var, qim0Var, i, (byte) 22);
        }
    }

    public static final void c(kes kesVar, qim0 qim0Var, float f, float f2, long j, long j2, b0k b0kVar, int i) {
        int i2;
        Object i8i0Var;
        int i3;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1778334260);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(kesVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(qim0Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.d(f) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var.d(6.0f) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var.d(f2) ? 16384 : 8192;
        }
        if ((i & 196608) == 0) {
            i2 |= x340Var.d(4.0f) ? 131072 : 65536;
        }
        if ((i & 1572864) == 0) {
            i2 |= x340Var.f(j) ? 1048576 : 524288;
        }
        if ((i & 12582912) == 0) {
            i2 |= x340Var.f(j2) ? 8388608 : 4194304;
        }
        if (x340Var.Y(i2 & 1, (i2 & 4793491) != 4793490)) {
            x340Var.d0();
            if ((i & 1) != 0 && !x340Var.E()) {
                x340Var.b0();
            }
            x340Var.s();
            boolean zI = ((((57344 & i2) ^ 24576) > 16384 && x340Var.d(f2)) || (i2 & 24576) == 16384) | ((((i2 & 7168) ^ 3072) > 2048 && x340Var.d(6.0f)) || (i2 & 3072) == 2048) | ((((i2 & 896) ^ 384) > 256 && x340Var.d(f)) || (i2 & 384) == 256) | x340Var.i(kesVar) | ((((458752 & i2) ^ 196608) > 131072 && x340Var.d(4.0f)) || (i2 & 196608) == 131072) | ((((3670016 & i2) ^ 1572864) > 1048576 && x340Var.f(j)) || (i2 & 1572864) == 1048576) | ((((29360128 & i2) ^ 12582912) > 8388608 && x340Var.f(j2)) || (i2 & 12582912) == 8388608);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                i3 = i2;
                i8i0Var = new i8i0(f2, f, kesVar, j, j2, (byte) 1);
                x340Var.s0(i8i0Var);
            } else {
                i3 = i2;
                i8i0Var = objT;
            }
            j0o1.b((i3 >> 3) & 14, x340Var, (iu30) i8i0Var, qim0Var);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ljr0(kesVar, qim0Var, f, f2, j, j2, i, (byte) 0);
        }
    }

    public static final void d(int i, j2i j2iVar, b0k b0kVar, int i2) {
        int i3;
        mic0 mic0VarK;
        boolean z;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(371783175);
        if ((i2 & 6) == 0) {
            i3 = (x340Var.e(i == 0 ? -1 : l1d.C(i)) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if (x340Var.Y(i3 & 1, (i3 & 19) != 18)) {
            qim0 qim0VarZ = u291.z(u291.f(nim0.a, 1.0f), (fra) null, 3);
            boolean z2 = (i3 & 14) == 4;
            Object objT = x340Var.T();
            if (z2 || objT == m4cVar) {
                Float fValueOf = Float.valueOf(0.5f);
                uwr uwrVar = cbx.a;
                zsc zscVar = zex.a;
                mmr0[] mmr0VarArr = {new mmr0(fValueOf, new u7h(((vex) zscVar.e).a)), new mmr0(Float.valueOf(1.0f), new u7h(((vex) zscVar.e).d))};
                int iC = l1d.C(i);
                if (iC != 0) {
                    if (iC == 1) {
                        mic0VarK = v9c.t((mmr0[]) Arrays.copyOf(mmr0VarArr, 2), 0.0f, 0.0f, 14);
                    } else {
                        if (iC != 2) {
                            eg.o();
                            return;
                        }
                        objT = null;
                    }
                    x340Var.s0(objT);
                } else {
                    mic0VarK = v9c.k((mmr0[]) Arrays.copyOf(mmr0VarArr, 2), 0.0f, 0.0f, 14);
                }
                objT = mic0VarK;
                x340Var.s0(objT);
            }
            Brush brush = (Brush) objT;
            if (brush != null) {
                x340Var.i0(-927705991);
                boolean zI = x340Var.i(brush);
                Object objT2 = x340Var.T();
                if (zI || objT2 == m4cVar) {
                    objT2 = new hk6(brush, (byte) 4);
                    x340Var.s0(objT2);
                }
                qim0VarZ = exd0.s(qim0VarZ, (iu30) objT2);
                z = false;
                x340Var.r(false);
            } else {
                z = false;
                x340Var.i0(-927605055);
                x340Var.r(false);
            }
            gfh0 gfh0VarC = t1c.c(een.d, z);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarZ);
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
            ywx0.l(54, j2iVar, h2c.a, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new y9i0(i, j2iVar, i2);
        }
    }

    public static final void e(v3h1 v3h1Var, int i, Object obj, int i2, b0k b0kVar, int i3) {
        v3h1 v3h1Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-506649871);
        int i4 = (x340Var.i(v3h1Var) ? 4 : 2) | i3 | (x340Var.e(i) ? 32 : 16) | (x340Var.i(obj) ? 256 : 128) | (x340Var.e(i2) ? 2048 : 1024);
        if (x340Var.Y(i4 & 1, (i4 & 1171) != 1170)) {
            d4h1 d4h1Var = v3h1Var instanceof d4h1 ? (d4h1) v3h1Var : null;
            if (d4h1Var == null || (v3h1Var2 = d4h1Var.b) == null) {
                v3h1Var2 = v3h1Var;
            }
            boolean zG = x340Var.g(v3h1Var2) | ((i4 & 7168) == 2048) | ((i4 & 112) == 32) | x340Var.g(obj);
            Object objT = x340Var.T();
            if (zG || objT == fkj0.X) {
                x340Var.s0(new lm90(v3h1Var.m(i)));
            }
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new z3h1(v3h1Var, i, obj, i2, i3, (byte) 2);
        }
    }

    public static final void f(xtb0 xtb0Var, b851 b851Var, Function0 function0, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-716476302);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(xtb0Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.g(b851Var) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(function0) ? 256 : 128;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            x340Var.b0();
        } else {
            if (!b851Var.a || b851Var.b) {
                h311 h311VarV = x340Var.v();
                if (h311VarV != null) {
                    h311VarV.d = new j751(xtb0Var, b851Var, function0, i, (byte) 0);
                    return;
                }
                return;
            }
            boolean zI = x340Var.i(xtb0Var) | ((i2 & 896) == 256);
            Object objT = x340Var.T();
            if (zI || objT == fkj0.X) {
                objT = new lc41(xtb0Var, function0, (lnm) null, (byte) 17);
                x340Var.s0(objT);
            }
            qxd0.t(xtb0Var, x340Var, (vu30) objT);
        }
        h311 h311VarV2 = x340Var.v();
        if (h311VarV2 != null) {
            h311VarV2.d = new j751(xtb0Var, b851Var, function0, i, (byte) 1);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.facebook.FacebookException */
    public static void g(Application application, String str) throws FacebookException {
        if (!wf10.q.get()) {
            throw new FacebookException("The Facebook sdk must be initialized before calling activateApp");
        }
        if (!vz3.c) {
            if (rm5.h() == null) {
                wbx0.j();
            }
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorH = rm5.h();
            if (scheduledThreadPoolExecutorH == null) {
                eg.m("Required value was null.");
                return;
            }
            scheduledThreadPoolExecutorH.execute(new k((byte) 4));
        }
        h8i1 h8i1Var = h8i1.a;
        if (!dhn.a.contains(h8i1.class)) {
            try {
                if (!h8i1.c.get()) {
                    h8i1.a.b();
                }
            } catch (Throwable th) {
                dhn.a(h8i1.class, th);
            }
        }
        Set set = dhn.a;
        if (!set.contains(wf10.class)) {
            try {
                Context applicationContext = application.getApplicationContext();
                if (applicationContext != null) {
                    if (!b120.b("app_events_killswitch", wf10.b(), false)) {
                        wf10.c().execute(new uf10(applicationContext, str, (byte) 0));
                    }
                    if (mn10.b(kn10.U0) && x4q0.a() && !set.contains(x4q0.class)) {
                        try {
                            wf10.c().execute(new uf10(wf10.a(), str, (byte) 1));
                        } catch (Throwable th2) {
                            dhn.a(x4q0.class, th2);
                        }
                    }
                }
            } catch (Throwable th3) {
                dhn.a(wf10.class, th3);
            }
        }
        og0.d(application, str);
        if (mn10.b(kn10.l1)) {
            vxq0 vxq0Var = vxq0.a;
            if (!dhn.a.contains(vxq0Var)) {
                try {
                    if (!vxq0.c) {
                        vxq0.a();
                    }
                    if (vxq0.b) {
                        vxq0Var.b(str, "fb_mobile_app_install");
                    }
                } catch (Throwable th4) {
                    dhn.a(vxq0Var, th4);
                }
            }
        }
        if (mn10.b(kn10.k1)) {
            l550.a.d(str, new bm5("unknown", "MOBILE_INSTALL_EVENT", (Double) null, (Bundle) null, false, og0.c(), og0.b(), (ylq0) null));
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0026 A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:28:0x0027  */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0011, code lost:
    
        if (r5 == false) goto L15;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0015, code lost:
    
        return r2 - r3;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final int h(int r2, int r3, int r4, boolean r5) {
        /*
            r0 = 0
            if (r3 < r4) goto L8
            if (r5 == 0) goto L6
            return r0
        L6:
            int r4 = r4 - r3
            return r4
        L8:
            if (r5 != 0) goto Ld
            if (r3 > r2) goto L16
            goto L11
        Ld:
            int r1 = r4 - r3
            if (r1 <= r2) goto L16
        L11:
            if (r5 == 0) goto L14
            goto L21
        L14:
            int r2 = r2 - r3
            return r2
        L16:
            if (r5 == 0) goto L1b
            if (r3 > r2) goto L24
            goto L1f
        L1b:
            int r1 = r4 - r3
            if (r1 <= r2) goto L24
        L1f:
            if (r5 != 0) goto L22
        L21:
            return r2
        L22:
            int r2 = r2 - r3
            return r2
        L24:
            if (r5 != 0) goto L27
            return r0
        L27:
            int r4 = r4 - r3
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: p.w0o1.h(int, int, int, boolean):int");
    }

    public static js20 i(iu30 iu30Var, vu30 vu30Var, ju70 ju70Var, int i) {
        fns fnsVar = igu.a;
        if ((i & 8) != 0) {
            ju70Var = cgb1.Z;
        }
        return d1o1.o(iu30Var, vu30Var, fnsVar, ju70Var);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0039 A[Catch: all -> 0x0073, TRY_LEAVE, TryCatch #0 {, blocks: (B:6:0x000e, B:8:0x0014, B:15:0x0033, B:17:0x0039, B:24:0x005b, B:23:0x0058, B:14:0x0030, B:20:0x0054, B:11:0x002c), top: B:37:0x000e, inners: #1, #2 }] */
    /* JADX WARN: Code duplicated, block: B:39:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Instruction removed from duplicated block: B:17:0x0039, please report this as an issue */
    public static String j(Context context) {
        String str;
        if (rm5.g() == null) {
            synchronized (rm5.j()) {
                if (rm5.g() == null) {
                    String string = context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).getString("anonymousAppDeviceGUID", null);
                    if (!dhn.a.contains(rm5.class)) {
                        try {
                            rm5.e = string;
                        } catch (Throwable th) {
                            dhn.a(rm5.class, th);
                        }
                        if (rm5.g() == null) {
                            str = "XZ" + UUID.randomUUID();
                            if (!dhn.a.contains(rm5.class)) {
                                rm5.e = str;
                            }
                            context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", rm5.g()).apply();
                        }
                    } else if (rm5.g() == null) {
                        str = "XZ" + UUID.randomUUID();
                        if (!dhn.a.contains(rm5.class)) {
                            try {
                                rm5.e = str;
                            } catch (Throwable th2) {
                                dhn.a(rm5.class, th2);
                            }
                        }
                        context.getSharedPreferences("com.facebook.sdk.appEventPreferences", 0).edit().putString("anonymousAppDeviceGUID", rm5.g()).apply();
                    }
                }
            }
        }
        String strG = rm5.g();
        if (strG != null) {
            return strG;
        }
        eg.m("Required value was null.");
        return null;
    }

    public static int k() {
        return wbx0.h();
    }

    public static final float l(jkr0 jkr0Var) {
        return ((drr0) jkr0Var.d.d).s() + ((err0) jkr0Var.d.c).s();
    }

    public static final mmr0 m(kes kesVar) {
        Float fValueOf = Float.valueOf(0.0f);
        if (kesVar.l() <= 4) {
            return new mmr0(fValueOf, Float.valueOf(kesVar.l() - 1.0f));
        }
        float fL = l(kesVar) - 1.0f;
        if (fL < 0.0f) {
            return new mmr0(fValueOf, Float.valueOf(3.0f));
        }
        float fL2 = kesVar.l() - 4;
        if (fL > fL2) {
            fL = fL2;
        }
        return new mmr0(Float.valueOf(fL), Float.valueOf((fL + 4.0f) - 1.0f));
    }

    public static void n(Context context, String str) {
        wf10 wf10Var = wf10.a;
        if (wgi1.c()) {
            rm5 rm5Var = new rm5(context, str);
            ScheduledThreadPoolExecutor scheduledThreadPoolExecutorH = rm5.h();
            if (scheduledThreadPoolExecutorH != null) {
                scheduledThreadPoolExecutorH.execute(new ny2(context, rm5Var, (byte) 9));
            } else {
                eg.m("Required value was null.");
            }
        }
    }

    public static t7o0 o(Context context) {
        return new t7o0(context);
    }

    public static boolean p(hg4 hg4Var) {
        return hg4Var.b();
    }

    public static final float q(float f, float f2, int i, kes kesVar) {
        Float fValueOf = Float.valueOf(0.0f);
        int iL = kesVar.l();
        Float[] fArr = new Float[iL];
        for (int i2 = 0; i2 < iL; i2++) {
            fArr[i2] = Float.valueOf(1.0f);
        }
        if (kesVar.l() >= 4) {
            mmr0 mmr0VarM = m(kesVar);
            float fFloatValue = ((Number) mmr0VarM.a).floatValue();
            float fFloatValue2 = ((Number) mmr0VarM.b).floatValue();
            double d = fFloatValue;
            int iCeil = (int) Math.ceil(d);
            int iFloor = (int) Math.floor(d);
            for (int i3 = 0; i3 < iFloor; i3++) {
                fArr[i3] = fValueOf;
            }
            if (iCeil != iFloor) {
                float f3 = fFloatValue - iFloor;
                if (iFloor > 0 || iCeil > 0) {
                    float f4 = 1.0f - f3;
                    fArr[iFloor] = Float.valueOf(f4);
                    fArr[iCeil] = Float.valueOf(f4);
                }
            } else if (iCeil > 0) {
                fArr[iCeil] = fValueOf;
            }
            double d2 = fFloatValue2;
            int iFloor2 = (int) Math.floor(d2);
            int iCeil2 = (int) Math.ceil(d2);
            int iL2 = kesVar.l();
            for (int i4 = iCeil2 + 1; i4 < iL2; i4++) {
                fArr[i4] = fValueOf;
            }
            if (iFloor2 != iCeil2) {
                float f5 = iCeil2 - fFloatValue2;
                if (iCeil2 < kesVar.l() - 1 || iFloor2 < kesVar.l() - 1) {
                    float f6 = 1.0f - f5;
                    fArr[iCeil2] = Float.valueOf(f6);
                    fArr[iFloor2] = Float.valueOf(f6);
                }
            } else if (iFloor2 < kesVar.l() - 1) {
                fArr[iFloor2] = fValueOf;
            }
        }
        float fFloatValue3 = fArr[i].floatValue();
        float fFloatValue4 = ((Number) m(kesVar).a).floatValue();
        float fFloatValue5 = ((Number) m(kesVar).b).floatValue();
        float f7 = i;
        if (fFloatValue4 > f7 || f7 > fFloatValue5) {
            return (i == 0 || i == kesVar.l() + (-1)) ? fFloatValue3 * f2 : fFloatValue3 * f;
        }
        return l1d.e(f2, f, fFloatValue3, f);
    }

    public static void r(dg30 dg30Var, String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        bvg0 bvg0Var = new bvg0();
        bvg0Var.T0(mno1.h(new mmr0[]{new mmr0("artist_uri", str), new mmr0("lineitem_id", str2), new mmr0("ad_id", str3), new mmr0("disclosure_text", str4), new mmr0("disclosure_cta_text", str5), new mmr0("optout_artist_text", str6), new mmr0("optout_marquee_text", str7)}));
        bvg0Var.g1(dg30Var.e0(), "MarqueeOptOut");
    }

    public static r0o0 s(y0o0 y0o0Var, Context context, boolean z) {
        return new r0o0(2131231039, context.getString(2131952979), p7h.M(new q0o0[]{new q0o0(context.getString(2131952981), context.getString(2131952980), eox.c), new q0o0(context.getString(2131952983), context.getString(2131952982), knx.c)}), z, y0o0Var, false, (iu30) null);
    }

    public static p0o0 t(y0o0 y0o0Var, Context context, boolean z) {
        return new p0o0(context.getString(2131952956), context.getString(2131952955), z, y0o0Var);
    }

    public static final uld u(nrl nrlVar) {
        if (nrlVar instanceof irl) {
            return old.a;
        }
        if (nrlVar instanceof jrl) {
            return qld.a;
        }
        if (nrlVar instanceof lrl) {
            orl orlVar = ((lrl) nrlVar).a;
            return new sld(orlVar != null ? new ttw0(orlVar.a, orlVar.b) : null);
        }
        if (nrlVar instanceof krl) {
            return rld.a;
        }
        boolean z = nrlVar instanceof mrl;
        tld tldVar = tld.a;
        if (z || nrlVar == null) {
            return tldVar;
        }
        eg.o();
        return null;
    }

    public static final fz5 v(ln7 ln7Var) {
        switch (ln7Var.ordinal()) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
            case 8:
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
            case grn1.d /* 12 */:
                return fz5.X;
            case 1:
                return fz5.a;
            case 2:
                return fz5.b;
            case 3:
                return fz5.c;
            case 4:
                return fz5.d;
            case 5:
                return fz5.e;
            case 6:
                return fz5.f;
            case 7:
                return fz5.g;
            case 9:
                return fz5.h;
            case 10:
                return fz5.i;
            default:
                eg.o();
                return null;
        }
    }

    public static final void w(rtb0 rtb0Var, utl utlVar, v3h1 v3h1Var, int i, int i2, int i3) {
        if (i2 == i3) {
            return;
        }
        rtb0Var.e(i3 - i2, new a4h1(utlVar, i2, (byte) 0), new a4h1(utlVar, i2, (byte) 1), new j2i(-1462119914, new b4h1(v3h1Var, i2, utlVar, i), true));
    }

    public static String x(pjp1 pjp1Var) {
        pjp1Var.getClass();
        throw null;
    }

    public static int y(pjp1 pjp1Var) {
        pjp1Var.getClass();
        throw null;
    }
}
