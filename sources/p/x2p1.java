package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.hardware.camera2.CameraCharacteristics;
import android.os.Build;
import android.os.Handler;
import androidx.camera.camera2.internal.compat.quirk.FlashAvailabilityBufferUnderflowQuirk;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.nio.BufferUnderflowException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TimeZone;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class x2p1 {
    public static b180 a;
    public static b180 b;

    public static final void a(fyg fygVar, iu30 iu30Var, b0k b0kVar, int i) {
        int i2;
        b0k b0kVar2;
        long j;
        Object au0Var;
        long j2;
        b0k b0kVar3 = (x340) b0kVar;
        b0kVar3.k0(578464056);
        if ((i & 6) == 0) {
            i2 = (b0kVar3.g(fygVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= b0kVar3.i(iu30Var) ? 32 : 16;
        }
        if (b0kVar3.Y(i2 & 1, (i2 & 19) != 18)) {
            u7h u7hVar = fygVar.g;
            if (u7hVar != null) {
                j = u7hVar.a;
            } else {
                uwr uwrVar = cbx.a;
                j = ((yex) zex.a.d).e;
            }
            qim0 qim0VarN = anm1.N("collaborator-card", u291.v(nim0.a, 132.0f));
            Object objT = b0kVar3.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = xj.T0;
                b0kVar3.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarN, true, (iu30) objT);
            byte b2 = 3;
            zzq0 zzq0VarH = uyn1.h(3, 0.0f, 0.0f);
            String strO0 = cwl1.o0(b0kVar3, 2131954578);
            boolean zF = ((i2 & 112) == 32) | ((i2 & 14) == 4) | b0kVar3.f(j);
            Object objT2 = b0kVar3.T();
            if (zF || objT2 == m4cVar) {
                j2 = j;
                au0Var = new au0(iu30Var, fygVar, j2, (byte) 2);
                b0kVar3.s0(au0Var);
            } else {
                au0Var = objT2;
                j2 = j;
            }
            Function0 function0 = (Function0) au0Var;
            if (ihc1.y0(strO0)) {
                hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                return;
            } else {
                b0kVar2 = b0kVar3;
                cwl1.b(qim0VarB, (tl3) null, (hw61) null, (pgx) null, zzq0VarH, (max) null, false, (idn0) null, ny3.a, new gbx(new y50(strO0), function0), (gbx) null, apo.r(786678063, new gv6(fygVar, j2, b2), b0kVar3), b0kVar2, 100687872, 48, 1262);
            }
        } else {
            b0kVar2 = b0kVar3;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(fygVar, iu30Var, i, (byte) 26);
        }
    }

    public static final void b(b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(155745978);
        if (x340Var.Y(i & 1, i != 0)) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarN = anm1.N("collaborator-card-skeleton", u291.v(nim0Var, 132.0f));
            era eraVar = een.Q0;
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            mbh mbhVarA = jbh.a(new d36(8.0f, true, new um5(false)), eraVar, x340Var, 48);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            qim0 qim0VarR = u291.r(nim0Var, 120.0f);
            long jA = cbx.a(x340Var).a.b.a();
            cr31 cr31Var = er31.a;
            t1c.a(cwl1.l0(dug.f(qim0VarR, jA, cr31Var), 0L, cr31Var, 13), x340Var, 0);
            qim0 qim0VarN2 = u291.n(nim0Var, 80.0f, 12.0f);
            long jA2 = cbx.a(x340Var).a.b.a();
            cua cuaVar = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(qim0VarN2, jA2, er31.b(8.0f));
            cua cuaVar2 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF, 0L, er31.b(8.0f), 13), x340Var, 0);
            qim0 qim0VarN3 = u291.n(nim0Var, 48.0f, 10.0f);
            long jA3 = cbx.a(x340Var).a.b.a();
            cua cuaVar3 = cbx.b(x340Var).f;
            qim0 qim0VarF2 = dug.f(qim0VarN3, jA3, er31.b(8.0f));
            cua cuaVar4 = cbx.b(x340Var).f;
            t1c.a(cwl1.l0(qim0VarF2, 0L, er31.b(8.0f), 13), x340Var, 0);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new qza((byte) 21, i, false);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public static final void c(iyg iygVar, iu30 iu30Var, b0k b0kVar, int i) throws NoWhenBranchMatchedException {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1216509501);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? x340Var.g(iygVar) : x340Var.i(iygVar) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        if (!x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            x340Var.b0();
        } else if (iygVar.equals(gyg.a)) {
            x340Var.i0(834531915);
            b(x340Var, 0);
            x340Var.r(false);
        } else if (iygVar.equals(hyg.a)) {
            x340Var.i0(834533953);
            x340Var.r(false);
        } else {
            if (!(iygVar instanceof fyg)) {
                throw p3d1.k(x340Var, 834530194, false);
            }
            x340Var.i0(834535646);
            a((fyg) iygVar, iu30Var, x340Var, i2 & 126);
            x340Var.r(false);
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new g90(iygVar, iu30Var, i, (byte) 27);
        }
    }

    public static final void d(dp71 dp71Var, z6q z6qVar, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-622808366);
        j06 j06Var = x340Var.a;
        if ((i & 6) == 0) {
            i2 = (x340Var.g(dp71Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(z6qVar) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var.i(iu30Var) ? 256 : 128;
        }
        int i3 = i2 | 3072;
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            qim0 qim0VarC = u291.c(qim0Var3, 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarC);
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
            nko1.H(mbhVarA, x340Var, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var, lljVar3);
            nko1.F(x340Var);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var, lljVar4);
            d3p1.s(dp71Var.b, null, x340Var, 0);
            qim0 qim0VarD = u291.d(qim0Var3, 1.0f);
            uwr uwrVar = cbx.a;
            cvx cvxVar = cbx.b(x340Var).b;
            qim0 qim0VarN = anm1.N("error_element", uyn1.x(qim0VarD, 8.0f));
            gfh0 gfh0VarC = t1c.c(een.X, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarN);
            x340Var.m0();
            if (x340Var.S) {
                x340Var.l(n4kVar);
            } else {
                x340Var.v0();
            }
            nko1.H(gfh0VarC, x340Var, lljVar);
            nko1.H(xos0VarM2, x340Var, lljVar2);
            x0d.q(iHashCode2, x340Var, lljVar3, x340Var);
            nko1.H(qim0VarE2, x340Var, lljVar4);
            boolean z2 = (i3 & 896) == 256;
            Object objT = x340Var.T();
            if (z2 || objT == fkj0.X) {
                objT = new m861(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            otw.c(z6qVar.a((Function0) objT), rih1.a, (qim0) null, (ipb1) null, x340Var, 48, 12);
            x340Var.r(true);
            x340Var.r(true);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nk31(i, dp71Var, z6qVar, iu30Var, qim0Var2, (byte) 12);
        }
    }

    public static final void e(c380 c380Var, String str, j2i j2iVar, b0k b0kVar, int i) {
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1946023492);
        int i2 = i | (x340Var.g(c380Var) ? 4 : 2) | (x340Var.g(str) ? 32 : 16);
        if (x340Var.Y(i2 & 1, (i2 & 147) != 146)) {
            uwr uwrVar = cbx.a;
            long jC = cbx.a(x340Var).a.a.c();
            cua cuaVar = cbx.b(x340Var).f;
            cr31 cr31VarB = er31.b(16.0f);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(dug.f(nim0Var, jC, cr31VarB), 1.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
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
            nko1.H(mbhVarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            lee1 lee1Var = cbx.d(x340Var).h;
            long j = cbx.a(x340Var).b.a;
            cvx cvxVar = cbx.b(x340Var).b;
            cvx cvxVar2 = cbx.b(x340Var).b;
            cvx cvxVar3 = cbx.b(x340Var).b;
            uwo1.e(str, uyn1.B(nim0Var, 16.0f, 16.0f, 16.0f, 0.0f, 8), lee1Var, j, null, null, 0, false, null, 0, null, x340Var, (i2 >> 3) & 14, 0, 2032);
            cvx cvxVar4 = cbx.b(x340Var).b;
            op71.g(x340Var, u291.r(nim0Var, 8.0f));
            x340Var.i0(-1331166582);
            int i3 = 0;
            for (Object obj : c380Var) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    p7h.T();
                    throw null;
                }
                j2iVar.c1(pbh.a, (String) obj, Integer.valueOf(i3), x340Var, 3078);
                i3 = i4;
            }
            x340Var.r(false);
            uwr uwrVar2 = cbx.a;
            cvx cvxVar5 = cbx.b(x340Var).b;
            ywx0.n(nim0Var, 8.0f, x340Var, true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new hl11(c380Var, str, j2iVar, i, (byte) 0);
        }
    }

    public static final c0r f(d0r d0rVar, o3r o3rVar, Object obj) {
        return d0rVar.c(o3rVar.a(obj));
    }

    public static final Drawable g(oq70 oq70Var, Resources resources) {
        if (oq70Var instanceof t7v) {
            return ((t7v) oq70Var).a;
        }
        return oq70Var instanceof kxa ? new BitmapDrawable(resources, ((kxa) oq70Var).a) : new ns70(oq70Var, (byte) 0);
    }

    public static final oq70 h(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new kxa(((BitmapDrawable) drawable).getBitmap()) : new t7v(drawable);
    }

    public static kxa i(Bitmap bitmap) {
        return new kxa(bitmap);
    }

    public static final w j(uw0 uw0Var) {
        gal galVar = new gal(uw0Var);
        liv0 liv0Var = (liv0) uw0Var.e;
        c8o.l(liv0Var);
        jwo jwoVar = (jwo) galVar.c;
        fza1 fza1Var = (fza1) uw0Var.g;
        c8o.l(fza1Var);
        i42 i42Var = (i42) uw0Var.f;
        c8o.l(i42Var);
        Context context = (Context) uw0Var.d;
        c8o.l(context);
        bqb1 bqb1Var = (bqb1) uw0Var.t;
        c8o.l(bqb1Var);
        ptt pttVar = (ptt) uw0Var.X;
        c8o.l(pttVar);
        luk lukVar = (luk) uw0Var.O0;
        c8o.l(lukVar);
        g44 g44Var = new g44(false, lukVar);
        Scheduler scheduler = (Scheduler) uw0Var.c;
        c8o.l(scheduler);
        x8c0 x8c0Var = (x8c0) uw0Var.N0;
        c8o.l(x8c0Var);
        Observable observable = (Observable) uw0Var.b;
        c8o.l(observable);
        Handler handler = (Handler) uw0Var.Z;
        c8o.l(handler);
        tp7 tp7Var = new tp7(context, bqb1Var, pttVar, g44Var, scheduler, x8c0Var, observable, handler);
        ov20 ov20Var = (ov20) uw0Var.h;
        c8o.l(ov20Var);
        q8n q8nVar = (q8n) uw0Var.Y;
        c8o.l(q8nVar);
        return new w(new ip31(liv0Var, jwoVar, fza1Var, i42Var, tp7Var, ov20Var, q8nVar));
    }

    public static final String k(long j, esa1 esa1Var) {
        String strValueOf;
        n4t n4tVar = new n4t((byte) 1, j);
        g2z g2zVar = (g2z) esa1Var.b;
        Calendar calendarD = ((yqg) g2zVar.a).d();
        Calendar calendar = Calendar.getInstance((TimeZone) g2zVar.b);
        calendar.setTimeInMillis(n4tVar.b);
        calendarD.getClass();
        if (g2z.G(calendar, calendarD) && calendar.get(6) == calendarD.get(6)) {
            strValueOf = (String) g2zVar.c;
        } else if (g2z.G(calendar, calendarD) && calendar.get(6) - calendarD.get(6) == 1) {
            strValueOf = (String) g2zVar.d;
        } else {
            int i = calendar.get(6) - calendarD.get(6);
            strValueOf = (!g2z.G(calendar, calendarD) || i <= 0 || i > 7) ? String.valueOf(((SimpleDateFormat) g2zVar.f).format(calendar.getTime())) : ((SimpleDateFormat) g2zVar.e).format(calendar.getTime());
        }
        q6r q6rVar = (q6r) esa1Var.c;
        Calendar calendarD2 = q6rVar.a.d();
        calendarD2.setTimeInMillis(n4tVar.b);
        return f4i1.f(strValueOf, " • ", q6rVar.b.format(calendarD2.getTime()));
    }

    public static final CharSequence l(i4e1 i4e1Var) {
        return i4e1Var.d.subSequence(nbe1.g(i4e1Var.e), nbe1.f(i4e1Var.e));
    }

    public static boolean m(vq6 vq6Var) {
        Boolean bool;
        try {
            CameraCharacteristics.Key key = CameraCharacteristics.FLASH_INFO_AVAILABLE;
            bool = (Boolean) ((w2d) vq6Var.b).a(CameraCharacteristics.FLASH_INFO_AVAILABLE);
        } catch (BufferUnderflowException unused) {
            if (vvt.a.m(FlashAvailabilityBufferUnderflowQuirk.class) != null) {
                String.format("Device is known to throw an exception while checking flash availability. Flash is not available. [Manufacturer: %s, Model: %s, API Level: %d].", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                j2h1.o("FlashAvailability");
            } else {
                String.format("Exception thrown while checking for flash availability on device not known to throw exceptions during this check. Please file an issue at https://issuetracker.google.com/issues/new?component=618491&template=1257717 with this error message [Manufacturer: %s, Model: %s, API Level: %d].\nFlash is not available.", Build.MANUFACTURER, Build.MODEL, Integer.valueOf(Build.VERSION.SDK_INT));
                j2h1.q("FlashAvailability");
            }
            bool = Boolean.FALSE;
        }
        if (bool == null) {
            j2h1.M("FlashAvailability");
        }
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public static final k1r n(d0r d0rVar, o3r o3rVar, Object obj) {
        return d0rVar.b(o3rVar.a(obj));
    }

    public static final k1r o(d0r d0rVar, f4r f4rVar, Object obj) {
        return d0rVar.b(f4rVar.a(obj));
    }

    public static boolean p(Context context) {
        return xoi1.b(context);
    }

    public static Bitmap q(oq70 oq70Var) {
        int width = oq70Var.getWidth();
        int height = oq70Var.getHeight();
        boolean z = oq70Var instanceof kxa;
        Bitmap.Config config = z ? ((kxa) oq70Var).a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((kxa) oq70Var).a;
            if (bitmap.getWidth() == width && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap bitmapCreateBitmap = Bitmap.createBitmap(width, height, config);
        oq70Var.c(new Canvas(bitmapCreateBitmap));
        return bitmapCreateBitmap;
    }

    public static final ugf r(int i) {
        int iC = l1d.C(i);
        if (iC == 0) {
            return ugf.a;
        }
        if (iC == 1) {
            return ugf.b;
        }
        if (iC == 2) {
            return ugf.c;
        }
        if (iC == 3) {
            return ugf.d;
        }
        eg.o();
        return null;
    }

    public static ArrayList s(List list, List list2) {
        ArrayList arrayList;
        wak0 wak0Var;
        String str;
        ArrayList arrayList2 = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            aom0 aom0Var = (ilq0) it.next();
            if (aom0Var instanceof aom0) {
                aom0 aom0Var2 = aom0Var;
                Set<String> set = aom0Var2.a;
                arrayList = new ArrayList();
                for (String str2 : set) {
                    String str3 = aom0Var2.b;
                    if (str3 != null) {
                        wak0Var = new wak0(str2, str3, true);
                    } else {
                        ftv ftvVar = (ftv) o7h.C0(list2);
                        wak0Var = (ftvVar == null || (str = ftvVar.a) == null) ? null : new wak0(str2, str, false);
                    }
                    if (wak0Var != null) {
                        arrayList.add(wak0Var);
                    }
                }
            } else if (aom0Var instanceof r8t) {
                Set set2 = ((r8t) aom0Var).a;
                arrayList = new ArrayList(q7h.U(set2, 10));
                Iterator it2 = set2.iterator();
                while (it2.hasNext()) {
                    arrayList.add(new xak0((String) it2.next()));
                }
            } else {
                arrayList = z6x.a;
            }
            r7h.W(arrayList, arrayList2);
        }
        return arrayList2;
    }

    public static final o3r t(String str) {
        return w3p1.o(new l4r(v061.d, 2, jmj1.i, new j4r(new ysf1(str, (byte) 28)), jmj1.t), jmj1.X);
    }
}
