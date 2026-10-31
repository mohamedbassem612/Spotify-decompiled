package p;

import android.net.Uri;
import androidx.compose.ui.graphics.ColorFilter;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o3 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o3(boolean z, iu30 iu30Var, eyh0 eyh0Var) {
        super(3);
        this.a = (byte) 2;
        this.c = z;
        this.d = iu30Var;
        this.b = eyh0Var;
    }

    private final Object a(Object obj, Object obj2, Object obj3) {
        cr31 cr31VarB;
        float f;
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        if ((iIntValue & 6) == 0) {
            iIntValue |= x340Var.g(i2cVar) ? 4 : 2;
        }
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
            float fD = i2cVar.d();
            boolean z = this.c;
            float f2 = fD * (z ? 0.852f : 0.864f);
            float fD2 = i2cVar.d() * 0.173f;
            if (z) {
                cr31VarB = er31.a;
            } else {
                float f3 = ply.b;
                cr31VarB = er31.b(2.0f);
            }
            String str = (String) this.b;
            if (str == null) {
                str = "";
            }
            Uri uri = Uri.parse(str);
            gra graVar = een.e;
            nim0 nim0Var = nim0.a;
            qim0 qim0VarR = u291.r(i2cVar.a(nim0Var, graVar), f2);
            if (z) {
                float f4 = ply.b;
                f = 12.0f;
            } else {
                float f5 = ply.b;
                f = 6.0f;
            }
            eso1.e(uri, isl.a, i1p1.q(sto1.k(qim0VarR, cr31VarB, new bw61(f, u7h.b, 0.0f, ply.a, z ? 0.4f : 0.3f, 36, 0)), cr31VarB), (p3v) null, (zvx) null, (ecx) null, (j6m) null, (tl3) null, (ColorFilter) null, (qux) null, false, false, x340Var2, 27696, 0, 4064);
            d36 d36Var = new d36((-fD2) * 0.18f, true, new um5(false));
            qim0 qim0VarA = i2cVar.a(nim0Var, een.X);
            yk80 yk80Var = (yk80) this.d;
            jw31 jw31VarA = ew31.a(d36Var, een.Z, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarA);
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
            nko1.H(jw31VarA, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            x340Var2.i0(-358038467);
            for (bl80 bl80Var : o7h.d1(yk80Var.c, 2)) {
                String str2 = bl80Var.c;
                if (str2 == null) {
                    str2 = "";
                }
                Uri uri2 = Uri.parse(str2);
                String str3 = bl80Var.a;
                String str4 = bl80Var.b;
                long j = bl80Var.d;
                qim0 qim0VarR2 = u291.r(nim0Var, fD2);
                float f6 = ply.b;
                long j2 = o8h0.a;
                cr31 cr31Var = er31.a;
                bmq0.a(uri2, i1p1.q(d1u.E(f6, j2, qim0VarR2, cr31Var), cr31Var), hcx.a, str3, str4, j, 0L, false, x340Var2, 384, 192);
            }
            x340Var2.r(false);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2, Object obj3) {
        qim0 qim0Var = (qim0) obj;
        ((Number) obj3).intValue();
        ya60 ya60Var = ((va60) this.d).a;
        x340 x340Var = (b0k) obj2;
        if (ya60Var == null) {
            x340Var.i0(-1348891068);
            x340Var.r(false);
        } else {
            x340Var.i0(-1348891067);
            zqz0 zqz0Var = (zqz0) this.b;
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
            qim0 qim0VarR = d7e.r(1.0f, uyn1.w(u291.c(j9k1.x(nim0.a, new gn50(zqz0Var, (byte) 14)), 1.0f), zqz0Var.e), false);
            boolean z = this.c;
            boolean zH = x340Var.h(z) | x340Var.i(zqz0Var);
            Object objT = x340Var.T();
            if (zH || objT == fkj0.X) {
                objT = new cb8(z, zqz0Var, (byte) 12);
                x340Var.s0(objT);
            }
            ioo1.t(ya60Var, i541.C(qim0VarR, (iu30) objT), x340Var, 0);
            x340Var.r(true);
            x340Var.r(false);
        }
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2, Object obj3) {
        i2c i2cVar = (i2c) obj;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        es41 es41Var = (es41) this.b;
        nim0 nim0Var = nim0.a;
        qim0 qim0VarB = u291.b(0.0f, i2cVar.c(), 1, l6o1.H(u291.f(nim0Var, 1.0f), es41Var, false, 14));
        era eraVar = een.Q0;
        j2i j2iVar = (j2i) this.d;
        mbh mbhVarA = jbh.a(h36.g, eraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarB);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        j2iVar.invoke(pbh.a, x340Var, 6);
        x340Var3.r(true);
        if (!this.c || es41Var.f.s() <= 0) {
            x340Var3.i0(319883703);
            x340Var3.r(false);
        } else {
            x340Var3.i0(319750124);
            rrn1.r(es41Var, u291.c(i2cVar.a(nim0Var, een.i), 1.0f), x340Var, 0);
            x340Var3.r(false);
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarN = anm1.N("participantRow", u291.f(nim0.a, 1.0f));
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        d36 d36Var = new d36(12.0f, true, new um5(false));
        fra fraVar = een.N0;
        ew90 ew90Var = (ew90) this.d;
        vu30 vu30Var = (vu30) this.b;
        jw31 jw31VarA = ew31.a(d36Var, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        lmt0.j(ew90Var, this.c, x340Var, 0);
        lmt0.l(ew90Var, new wnb0(1.0f, true), x340Var, 0);
        if (vu30Var == null) {
            x340Var3.i0(1866089885);
        } else {
            x340Var3.i0(198743780);
            vu30Var.invoke(x340Var, 0);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2, Object obj3) {
        Uri uri;
        ksl kslVar;
        boolean z;
        qim0 qim0Var;
        xib0 xib0Var;
        x340 x340Var;
        rib0 rib0Var;
        String str;
        x340 x340Var2 = (b0k) obj2;
        ((Number) obj3).intValue();
        gra graVar = een.h;
        xib0 xib0Var2 = (xib0) this.d;
        rib0 rib0Var2 = (rib0) this.b;
        gfh0 gfh0VarC = t1c.c(graVar, false);
        x340 x340Var3 = x340Var2;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0Var2 = nim0.a;
        qim0 qim0VarE = zr7.E(x340Var2, qim0Var2);
        hzj.A.getClass();
        x340 x340Var4 = x340Var2;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(gfh0VarC, x340Var2, y580.O0);
        nko1.H(xos0VarM, x340Var2, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
        nko1.F(x340Var2);
        nko1.H(qim0VarE, x340Var2, y580.Y);
        xkk1 xkk1Var = xib0Var2.c;
        ksl kslVar2 = isl.a;
        if (xkk1Var == null) {
            x340Var4.i0(669384216);
            x340Var4.r(false);
            xib0Var = xib0Var2;
            rib0Var = rib0Var2;
            z = false;
            qim0Var = qim0Var2;
            x340Var = x340Var4;
            kslVar = kslVar2;
        } else {
            x340Var4.i0(669384217);
            as80 as80Var = mif1.P0;
            cbx.a.getClass();
            ecx ecxVarA = uwr.a();
            up70 up70VarA = xkk1Var.a.a(vp70.c);
            if (up70VarA == null || (str = up70VarA.a.a) == null || (uri = Uri.parse(str)) == null) {
                uri = Uri.EMPTY;
            }
            uri.getClass();
            fwx fwxVarG = hso1.G(ltx.c, 0L, 0L, x340Var2, ltx.d, 30);
            pux puxVar = new pux(fwxVarG, fwxVarG);
            kslVar = kslVar2;
            z = false;
            qim0Var = qim0Var2;
            xib0Var = xib0Var2;
            Uri uri2 = uri;
            x340Var = x340Var4;
            eso1.e(uri2, kslVar, (qim0) null, (p3v) null, (zvx) null, ecxVarA, as80Var, (tl3) null, (ColorFilter) null, puxVar, false, false, x340Var2, 1073741872, 0, 3484);
            x340Var.r(false);
            rib0Var = rib0Var2;
        }
        if (rib0Var.e || xib0Var.d == null) {
            x340Var.i0(670307304);
            x340Var.r(z);
        } else {
            x340Var.i0(670029575);
            spx spxVar = this.c ? spx.c : xpx.c;
            uwr uwrVar = cbx.a;
            zov0 zov0Var = cbx.b(x340Var2).g;
            w0h1.a(spxVar, kslVar, u291.r(qim0Var, 16.0f), 0L, 0L, false, x340Var2, 56, 56);
            x340Var.r(z);
        }
        x340Var.r(true);
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2, Object obj3) {
        jax haxVar;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        fra fraVar = een.N0;
        j2i j2iVar = (j2i) this.d;
        Function0 function0 = (Function0) this.b;
        jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, nim0.a);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        j2iVar.invoke(x340Var, 0);
        String strO0 = cwl1.o0(x340Var, 2131957181);
        if (ihc1.y0(strO0)) {
            hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
            return null;
        }
        gbx gbxVar = new gbx(new y50(strO0), function0);
        if (this.c) {
            x340Var3.i0(748612346);
            x340Var3.r(false);
            haxVar = jax.a;
        } else {
            x340Var3.i0(748614085);
            haxVar = new hax(cwl1.o0(x340Var, 2131957181));
            x340Var3.r(false);
        }
        wro1.h(gbxVar, ldx.c, null, haxVar, yla.s(x340Var), null, false, null, null, bvi.a, x340Var, 0, 6, 972);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2, Object obj3) {
        char c;
        int i;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarF = u291.f(nim0.a, 1.0f);
        uwr uwrVar = cbx.a;
        cvx cvxVar = cbx.b(x340Var).b;
        qim0 qim0VarN = anm1.N("library_layout_picker", nho1.F(uyn1.z(0.0f, 16.0f, 1, qim0VarF)));
        b7c0 b7c0Var = (b7c0) this.d;
        iu30 iu30Var = (iu30) this.b;
        jw31 jw31VarA = ew31.a(h36.f, een.Z, x340Var, 0);
        x340 x340Var2 = x340Var;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarN);
        hzj.A.getClass();
        x340 x340Var3 = x340Var;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(hmb0.t1);
        } else {
            x340Var3.v0();
        }
        nko1.H(jw31VarA, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        x340Var3.i0(-1937989926);
        for (b7c0 b7c0Var2 : b7c0.d) {
            int iOrdinal = b7c0Var2.ordinal();
            if (iOrdinal == 0) {
                c = 2742;
            } else {
                if (iOrdinal != 1) {
                    eg.o();
                    return null;
                }
                c = 2741;
            }
            int iOrdinal2 = b7c0Var2.ordinal();
            if (iOrdinal2 == 0) {
                i = 2131962084;
            } else {
                if (iOrdinal2 != 1) {
                    eg.o();
                    return null;
                }
                i = 2131962083;
            }
            String strO0 = cwl1.o0(x340Var, i);
            boolean z = b7c0Var == b7c0Var2;
            boolean zG = x340Var3.g(iu30Var) | x340Var3.e(b7c0Var2.ordinal());
            Object objT = x340Var3.T();
            if (zG || objT == fkj0.X) {
                objT = new x680(iu30Var, b7c0Var2, (byte) 27);
                x340Var3.s0(objT);
            }
            qro1.f(c, strO0, z, this.c, (Function0) objT, null, x340Var, 0);
        }
        x340Var3.r(false);
        x340Var3.r(true);
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2, Object obj3) {
        ((Number) obj3).intValue();
        pto1.m((String) this.b, ((jmb1) this.d).h, this.c, (b0k) obj2, 0);
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        iu30 iu30Var = (iu30) this.b;
        iye0 iye0Var = (iye0) this.d;
        x340 x340Var2 = x340Var;
        if (!x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            x340Var2.b0();
        } else if (this.c) {
            x340Var2.i0(836588703);
            boolean zI = x340Var2.i(iye0Var) | x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zI || objT == fkj0.X) {
                objT = new bsc0(iye0Var, iu30Var, (byte) 11);
                x340Var2.s0(objT);
            }
            wro1.h(new gbx(z50.c, (Function0) objT), ldx.c, null, null, null, null, false, null, null, txi.b, x340Var2, 48, 6, 1020);
            x340Var2.r(false);
        } else {
            x340Var2.i0(837074256);
            x340Var2.r(false);
        }
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2, Object obj3) {
        x340 x340Var = (b0k) obj2;
        int iIntValue = ((Number) obj3).intValue();
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
            oyr0 oyr0Var = (oyr0) this.d;
            xag0 xag0Var = (xag0) this.b;
            otw.c(oyr0Var, new myr0(xag0Var.a, this.c, xag0Var.f), (qim0) null, (ipb1) null, x340Var2, 0, 12);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2, Object obj3) {
        long j;
        y2u0 y2u0Var;
        x340 x340Var = (b0k) obj2;
        ((Number) obj3).intValue();
        qim0 qim0VarD = u291.d(nim0.a, 1.0f);
        boolean z = this.c;
        x340 x340Var2 = x340Var;
        if (z) {
            x340Var2.i0(-445224405);
            uwr uwrVar = cbx.a;
            j = cbx.a(x340Var2).d.b;
            x340Var2.r(false);
        } else {
            x340Var2.i0(-445223799);
            x340Var2.r(false);
            j = u7h.b;
        }
        qim0 qim0VarF = dug.f(qim0VarD, j, d4o1.a);
        hob1 hob1Var = (hob1) this.d;
        dr00 dr00Var = (dr00) this.b;
        gfh0 gfh0VarC = t1c.c(een.d, false);
        x340 x340Var3 = x340Var;
        int iHashCode = Long.hashCode(x340Var3.T);
        xos0 xos0VarM = x340Var3.m();
        qim0 qim0VarE = zr7.E(x340Var, qim0VarF);
        hzj.A.getClass();
        x340 x340Var4 = x340Var;
        if (x340Var4.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var4.m0();
        if (x340Var4.S) {
            x340Var4.l(hmb0.t1);
        } else {
            x340Var4.v0();
        }
        nko1.H(gfh0VarC, x340Var, y580.O0);
        nko1.H(xos0VarM, x340Var, y580.N0);
        nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
        nko1.F(x340Var);
        nko1.H(qim0VarE, x340Var, y580.Y);
        if (z) {
            x340Var4.i0(-102714718);
            String str = hob1Var.h.d;
            bth.j(6, x340Var, (qim0) null, str != null && str.length() == 0 && (y2u0Var = hob1Var.I) != null && y2u0Var.c);
            x340Var4.r(false);
        } else {
            x340Var4.i0(-102611674);
            bth.l(6, dr00Var.d, x340Var, (qim0) null);
            x340Var4.r(false);
        }
        x340Var4.r(true);
        return rih1.a;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        b0k b0kVar;
        ked0 med0Var;
        b0k b0kVar2;
        byte b = this.a;
        b36 b36Var = h36.g;
        f36 f36Var = h36.c;
        byte b2 = 2;
        n4k n4kVar = hmb0.t1;
        nim0 nim0Var = nim0.a;
        boolean z2 = this.c;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.d;
        Object obj5 = this.b;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                b0k b0kVar3 = (b0k) obj2;
                ((Number) obj3).intValue();
                j2i j2iVar = (j2i) obj4;
                String str = (String) obj5;
                jw31 jw31VarA = ew31.a(h36.a, een.N0, b0kVar3, 0);
                x340 x340Var = (x340) b0kVar3;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(b0kVar3, nim0Var);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar3;
                if (x340Var2.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(jw31VarA, b0kVar3, y580.O0);
                nko1.H(xos0VarM, b0kVar3, y580.N0);
                nko1.H(Integer.valueOf(iHashCode), b0kVar3, y580.R0);
                nko1.F(b0kVar3);
                nko1.H(qim0VarE, b0kVar3, y580.Y);
                if (z2) {
                    x340Var2.i0(-139055066);
                    z = false;
                    j2iVar.invoke(b0kVar3, 0);
                } else {
                    z = false;
                    x340Var2.i0(-15728216);
                }
                x340Var2.r(z);
                if (!z2 || str == null) {
                    b0kVar = b0kVar3;
                    x340Var2.i0(-15468312);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-15671083);
                    uwr uwrVar = cbx.a;
                    b0kVar = b0kVar3;
                    uwo1.e(" • ", null, cbx.d(b0kVar3).j, cbx.a(b0kVar3).b.b, null, null, 0, false, null, 0, null, b0kVar, 6, 0, 2034);
                    x340Var2.r(false);
                }
                if (str != null) {
                    x340Var2.i0(-15404204);
                    uwr uwrVar2 = cbx.a;
                    uwo1.e(str, null, cbx.d(b0kVar).j, cbx.a(b0kVar).b.b, null, null, 2, false, new cjc0(1), 0, null, b0kVar, 0, 0, 1714);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(-15123096);
                    x340Var2.r(false);
                }
                x340Var2.r(true);
                return rih1Var;
            case 1:
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 17) != 16)) {
                    g9p1.k(0, 0, (String) obj5, x340Var4, z2 && ((ot1) obj4).h);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 2:
                vzq0 vzq0Var = (vzq0) obj;
                b0k b0kVar4 = (b0k) obj2;
                ((Number) obj3).intValue();
                uwr uwrVar3 = cbx.a;
                j1e1.f((qim0) null, ((xex) ((gmt) zex.a.c).b).z, b0kVar4, 0, 1);
                ujo1.a(uyn1.B(nim0.a, 0.0f, vzq0Var.d(), 0.0f, 0.0f, 13), l6o1.C(0, 0, 1, b0kVar4), apo.r(-917188024, new bk0(vzq0Var, this.c, (iu30) obj4, (eyh0) obj5, (byte) 2), b0kVar4), b0kVar4, 384, 0);
                return rih1Var;
            case 3:
                ((Number) obj3).intValue();
                x340 x340Var5 = (b0k) obj2;
                x340Var5.i0(1425311885);
                iu30 iu30Var = (iu30) obj4;
                f65 f65Var = (f65) obj5;
                ye5 ye5Var = new ye5();
                ye5Var.g(cwl1.o0(x340Var5, z2 ? 2131957337 : 2131952158));
                ye5Var.g(" ");
                String strO0 = cwl1.o0(x340Var5, 2131952160);
                boolean zG = x340Var5.g(iu30Var) | x340Var5.i(f65Var);
                Object objT = x340Var5.T();
                if (zG || objT == fkj0.X) {
                    objT = new cc2(iu30Var, f65Var, (byte) 26);
                    x340Var5.s0(objT);
                }
                vhg.c(ye5Var, strO0, "https://support.spotify.com/article/ai-persona-badge/", vhg.a, (iu30) objT);
                af5 af5VarP = ye5Var.p();
                x340Var5.r(false);
                uwr uwrVar4 = cbx.a;
                uwo1.d(af5VarP, cbx.a(x340Var5).b.b, null, cbx.d(x340Var5).j, null, null, 0, false, null, 0, null, null, x340Var5, 0, 0, 4084);
                return rih1Var;
            case 4:
                ((Number) obj3).intValue();
                h72 h72Var = (h72) obj4;
                otw.c((nm1) h72Var.d, new am1(2, ((zuc0) obj5).c, (String) null, (String) h72Var.b, true, this.c), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 5:
                x340 x340Var6 = (b0k) obj2;
                ((Number) obj3).intValue();
                nim0 nim0Var2 = nim0.a;
                qim0 qim0VarW = uyn1.w(nim0Var2, (vzq0) obj);
                h72 h72Var2 = (h72) obj4;
                ds9 ds9Var = (ds9) obj5;
                era eraVar = een.P0;
                mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var6, 0);
                x340 x340Var7 = x340Var6;
                int iHashCode2 = Long.hashCode(x340Var7.T);
                xos0 xos0VarM2 = x340Var7.m();
                qim0 qim0VarE2 = zr7.E(x340Var6, qim0VarW);
                hzj.A.getClass();
                x340 x340Var8 = x340Var6;
                if (x340Var8.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(mbhVarA, x340Var6, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM2, x340Var6, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode2);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var6, lljVar3);
                nko1.F(x340Var6);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE2, x340Var6, lljVar4);
                qim0 qim0VarH = l6o1.H(nim0Var2, l6o1.C(0, 0, 1, x340Var6), false, 14);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var6, 0);
                int iHashCode3 = Long.hashCode(x340Var8.T);
                xos0 xos0VarM3 = x340Var8.m();
                qim0 qim0VarE3 = zr7.E(x340Var6, qim0VarH);
                x340Var8.m0();
                if (x340Var8.S) {
                    x340Var8.l(n4kVar);
                } else {
                    x340Var8.v0();
                }
                nko1.H(mbhVarA2, x340Var6, lljVar);
                nko1.H(xos0VarM3, x340Var6, lljVar2);
                i3a.l(iHashCode3, x340Var6, lljVar3, x340Var6);
                nko1.H(qim0VarE3, x340Var6, lljVar4);
                h72Var2.l(ds9Var, null, x340Var6, 8);
                h72Var2.d(null, x340Var6, 0);
                uwr uwrVar5 = cbx.a;
                h72Var2.j(uyn1.B(nim0Var2, 0.0f, cbx.b(x340Var6).b.b, 0.0f, 0.0f, 13), x340Var6, 0);
                if (z2) {
                    x340Var8.i0(-611998564);
                    h72Var2.k(null, x340Var6, 0);
                } else {
                    x340Var8.i0(-611997610);
                    h72Var2.g(null, x340Var6, 0);
                }
                x340Var8.r(false);
                cvx cvxVar = cbx.b(x340Var6).b;
                h72Var2.b(uyn1.B(nim0Var2, 0.0f, 16.0f, 0.0f, 0.0f, 13), x340Var6, 0);
                x340Var8.r(true);
                x340Var8.r(true);
                return rih1Var;
            case 6:
                x340 x340Var9 = (b0k) obj2;
                int iIntValue2 = ((Number) obj3).intValue();
                skf skfVar = (skf) obj4;
                ArrayList<w4i1> arrayList = skfVar.d;
                ctf ctfVar = skfVar.b;
                x340 x340Var10 = x340Var9;
                if (x340Var10.Y(iIntValue2 & 1, (iIntValue2 & 17) != 16)) {
                    if (z2 && (ctfVar instanceof atf)) {
                        med0Var = new ked0(((w4i1) o7h.q0(arrayList)).a);
                    } else if (z2 && (ctfVar instanceof btf)) {
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (w4i1 w4i1Var : arrayList) {
                            arrayList2.add(new led0(w4i1Var.a, w4i1Var.b));
                        }
                        med0Var = new med0(arrayList2);
                    } else {
                        med0Var = null;
                    }
                    if (med0Var == null) {
                        x340Var10.i0(2041249459);
                        x340Var10.r(false);
                    } else {
                        x340Var10.i0(2041249460);
                        otw.c((m5b0) obj5, new oed0(med0Var, pcf.d(6, skfVar.a, null)), (qim0) null, (ipb1) null, x340Var10, 0, 12);
                        x340Var10.r(false);
                    }
                } else {
                    x340Var10.b0();
                }
                return rih1Var;
            case 7:
                x340 x340Var11 = (b0k) obj2;
                ((Number) obj3).intValue();
                qim0 qim0VarD = u291.d(nim0Var, 1.0f);
                uwr uwrVar6 = cbx.a;
                qim0 qim0VarW2 = uyn1.w(dug.f(qim0VarD, u7h.b(cbx.a(x340Var11).a.c, 0.95f, 0.0f, 0.0f, 0.0f, 14), d4o1.a), (vzq0) obj);
                Function0 function0 = (Function0) obj4;
                Function0 function1 = (Function0) obj5;
                mbh mbhVarA3 = jbh.a(f36Var, een.P0, x340Var11, 0);
                x340 x340Var12 = x340Var11;
                int iHashCode4 = Long.hashCode(x340Var12.T);
                xos0 xos0VarM4 = x340Var12.m();
                qim0 qim0VarE4 = zr7.E(x340Var11, qim0VarW2);
                hzj.A.getClass();
                x340 x340Var13 = x340Var11;
                if (x340Var13.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var13.m0();
                if (x340Var13.S) {
                    x340Var13.l(n4kVar);
                } else {
                    x340Var13.v0();
                }
                nko1.H(mbhVarA3, x340Var11, y580.O0);
                nko1.H(xos0VarM4, x340Var11, y580.N0);
                nko1.H(Integer.valueOf(iHashCode4), x340Var11, y580.R0);
                nko1.F(x340Var11);
                nko1.H(qim0VarE4, x340Var11, y580.Y);
                ti5.a(pci.a, (qim0) null, (vu30) null, (xu30) null, 0.0f, (erl1) null, kkn.l(cbx.a(x340Var11).c.d, 0L, 0L, x340Var11, 30), x340Var11, 6, 190);
                wyo1.b(z2, function0, function1, x340Var11, 0);
                x340Var13.r(true);
                return rih1Var;
            case 8:
                b0k b0kVar5 = (b0k) obj2;
                ((Number) obj3).intValue();
                fra fraVar = een.N0;
                String str2 = (String) obj5;
                Integer num = (Integer) obj4;
                jw31 jw31VarA2 = ew31.a(b36Var, fraVar, b0kVar5, 0);
                x340 x340Var14 = (x340) b0kVar5;
                int iHashCode5 = Long.hashCode(x340Var14.T);
                xos0 xos0VarM5 = x340Var14.m();
                qim0 qim0VarE5 = zr7.E(b0kVar5, nim0Var);
                hzj.A.getClass();
                x340 x340Var15 = (x340) b0kVar5;
                if (x340Var15.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                llj lljVar5 = y580.O0;
                nko1.H(jw31VarA2, b0kVar5, lljVar5);
                llj lljVar6 = y580.N0;
                nko1.H(xos0VarM5, b0kVar5, lljVar6);
                Integer numValueOf2 = Integer.valueOf(iHashCode5);
                llj lljVar7 = y580.R0;
                nko1.H(numValueOf2, b0kVar5, lljVar7);
                nko1.F(b0kVar5);
                llj lljVar8 = y580.Y;
                nko1.H(qim0VarE5, b0kVar5, lljVar8);
                wnb0 wnb0Var = new wnb0(1.0f, true);
                uwr uwrVar7 = cbx.a;
                uwo1.e(str2, wnb0Var, cbx.d(b0kVar5).e, cbx.a(b0kVar5).b.a, new a0e1(5), null, 2, false, new cjc0(1), 0, null, b0kVar5, 0, 0, 1696);
                qim0 qim0VarN = anm1.N("CollapsibleSectionHeadingChevron", u291.a(nim0Var, 44.0f, 44.0f));
                cvx cvxVar2 = cbx.b(b0kVar5).b;
                jw31 jw31VarA3 = ew31.a(new d36(12.0f, true, new g21(een.R0, (byte) 29)), fraVar, b0kVar5, 0);
                int iHashCode6 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM6 = x340Var15.m();
                qim0 qim0VarE6 = zr7.E(b0kVar5, qim0VarN);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(jw31VarA3, b0kVar5, lljVar5);
                nko1.H(xos0VarM6, b0kVar5, lljVar6);
                i3a.l(iHashCode6, b0kVar5, lljVar7, b0kVar5);
                nko1.H(qim0VarE6, b0kVar5, lljVar8);
                if (z2 || num == null) {
                    b0kVar2 = b0kVar5;
                    x340Var15.i0(-1769450940);
                    x340Var15.r(false);
                } else {
                    x340Var15.i0(-1769676775);
                    b0kVar2 = b0kVar5;
                    uwo1.e(String.valueOf(num.intValue()), null, cbx.d(b0kVar5).j, cbx.a(b0kVar5).b.b, null, null, 0, false, new cjc0(1), 0, null, b0kVar2, 0, 0, 1778);
                    x340Var15.r(false);
                }
                zov0 zov0Var = cbx.b(b0kVar2).g;
                w0h1.a(z2 ? qlx.c : mlx.c, isl.a, u291.r(nim0Var, 16.0f), cbx.a(b0kVar2).b.b, 0L, false, b0kVar2, 56, 48);
                x340Var15.r(true);
                x340Var15.r(true);
                return rih1Var;
            case 9:
                p9p1.c((g2c) obj, (adj1) obj4, (iu30) obj5, this.c, (b0k) obj2, ((Number) obj3).intValue() & 14);
                return rih1Var;
            case 10:
                x340 x340Var16 = (b0k) obj2;
                ((Number) obj3).intValue();
                aob aobVar = (aob) obj4;
                String str3 = aobVar.b;
                iu30 iu30Var2 = (iu30) obj5;
                mbh mbhVarA4 = jbh.a(f36Var, een.P0, x340Var16, 0);
                x340 x340Var17 = x340Var16;
                int iHashCode7 = Long.hashCode(x340Var17.T);
                xos0 xos0VarM7 = x340Var17.m();
                qim0 qim0VarE7 = zr7.E(x340Var16, nim0Var);
                hzj.A.getClass();
                x340 x340Var18 = x340Var16;
                if (x340Var18.a == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var18.m0();
                if (x340Var18.S) {
                    x340Var18.l(n4kVar);
                } else {
                    x340Var18.v0();
                }
                nko1.H(mbhVarA4, x340Var16, y580.O0);
                nko1.H(xos0VarM7, x340Var16, y580.N0);
                nko1.H(Integer.valueOf(iHashCode7), x340Var16, y580.R0);
                nko1.F(x340Var16);
                nko1.H(qim0VarE7, x340Var16, y580.Y);
                if (ihc1.y0(str3)) {
                    x340Var18.i0(-1521679034);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-1521927933);
                    uwr uwrVar8 = cbx.a;
                    uwo1.e(str3, null, cbx.d(x340Var16).k, cbx.a(x340Var16).b.a, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2034);
                    cvx cvxVar3 = cbx.b(x340Var16).b;
                    ydh.l(nim0Var, 4.0f, x340Var16, x340Var18, false);
                }
                String str4 = aobVar.c;
                uwr uwrVar9 = cbx.a;
                uwo1.e(str4, null, cbx.d(x340Var16).j, cbx.a(x340Var16).b.a, null, null, 0, false, null, 0, null, x340Var16, 0, 0, 2034);
                if (z2) {
                    x340Var18.i0(-1521497529);
                    String str5 = aobVar.d;
                    boolean zG2 = x340Var18.g(iu30Var2);
                    Object objT2 = x340Var18.T();
                    if (zG2 || objT2 == fkj0.X) {
                        objT2 = new y8i(iu30Var2, (byte) 3);
                        x340Var18.s0(objT2);
                    }
                    Function0 function2 = (Function0) objT2;
                    if (ihc1.y0(str5)) {
                        hhg1.n("Action label must not be blank. Use EncoreAction.selfDescribed for self-describing actions.");
                        return null;
                    }
                    foo1.c(new gbx(new y50(str5), function2), ldx.c, null, null, yla.s(x340Var16).a(), null, null, null, null, null, apo.r(1261018093, new l8i(aobVar, b2), x340Var16), x340Var16, 0, 48, 2012);
                    x340Var18.r(false);
                } else {
                    x340Var18.i0(-1521160218);
                    x340Var18.r(false);
                }
                x340Var18.r(true);
                return rih1Var;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                x340 x340Var19 = (b0k) obj2;
                int iIntValue3 = ((Number) obj3).intValue();
                x340 x340Var20 = x340Var19;
                if (x340Var20.Y(iIntValue3 & 1, (iIntValue3 & 17) != 16)) {
                    fra fraVar2 = een.N0;
                    qim0 qim0VarZ = uyn1.z(16.0f, 0.0f, 2, u291.z(u291.f(nim0Var, 1.0f), (fra) null, 3));
                    t0o t0oVar = (t0o) obj4;
                    iu30 iu30Var3 = (iu30) obj5;
                    jw31 jw31VarA4 = ew31.a(b36Var, fraVar2, x340Var20, 54);
                    int iHashCode8 = Long.hashCode(x340Var20.T);
                    xos0 xos0VarM8 = x340Var20.m();
                    qim0 qim0VarE8 = zr7.E(x340Var20, qim0VarZ);
                    hzj.A.getClass();
                    if (x340Var20.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var20.m0();
                    if (x340Var20.S) {
                        x340Var20.l(n4kVar);
                    } else {
                        x340Var20.v0();
                    }
                    nko1.H(jw31VarA4, x340Var20, y580.O0);
                    nko1.H(xos0VarM8, x340Var20, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode8), x340Var20, y580.R0);
                    nko1.F(x340Var20);
                    nko1.H(qim0VarE8, x340Var20, y580.Y);
                    lro1.e(t0oVar.c, t0oVar.d, t0oVar.f, t0oVar.b.b, new wnb0(1.0f, true), x340Var20, 0);
                    String str6 = t0oVar.a;
                    q0o q0oVar = t0oVar.e;
                    String str7 = z2 ? q0oVar.b : q0oVar.a;
                    String str8 = z2 ? q0oVar.d : q0oVar.c;
                    boolean zG3 = x340Var20.g(iu30Var3) | x340Var20.g(t0oVar);
                    Object objT3 = x340Var20.T();
                    if (zG3 || objT3 == fkj0.X) {
                        objT3 = new kjk(iu30Var3, t0oVar, (byte) 29);
                        x340Var20.s0(objT3);
                    }
                    w6p1.b(0, str6, str7, str8, x340Var20, (iu30) objT3, null);
                    x340Var20.r(true);
                } else {
                    x340Var20.b0();
                }
                return rih1Var;
            case grn1.d /* 12 */:
                x340 x340Var21 = (b0k) obj2;
                int iIntValue4 = ((Number) obj3).intValue();
                x340 x340Var22 = x340Var21;
                if (x340Var22.Y(iIntValue4 & 1, (iIntValue4 & 17) != 16)) {
                    ArrayList arrayList3 = ((ee20) obj4).a.b.a;
                    bzr bzrVar = (bzr) obj5;
                    int size = arrayList3.size();
                    for (int i = 0; i < size; i++) {
                        otw.c(bzrVar.a, new y920((q620) arrayList3.get(i), i, z2), (qim0) null, (ipb1) null, x340Var22, 0, 12);
                    }
                } else {
                    x340Var22.b0();
                }
                return rih1Var;
            case 13:
                String str9 = (String) obj5;
                x340 x340Var23 = (b0k) obj2;
                int iIntValue5 = ((Number) obj3).intValue();
                x340 x340Var24 = x340Var23;
                if (!x340Var24.Y(iIntValue5 & 1, (iIntValue5 & 17) != 16)) {
                    x340Var24.b0();
                } else if (z2) {
                    x340Var24.i0(-147547060);
                    fra fraVar3 = een.N0;
                    uwr uwrVar10 = cbx.a;
                    cvx cvxVar4 = cbx.b(x340Var24).b;
                    d36 d36Var = new d36(4.0f, true, new um5(false));
                    qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                    fgx0 fgx0Var = (fgx0) obj4;
                    jw31 jw31VarA5 = ew31.a(d36Var, fraVar3, x340Var24, 48);
                    int iHashCode9 = Long.hashCode(x340Var24.T);
                    xos0 xos0VarM9 = x340Var24.m();
                    qim0 qim0VarE9 = zr7.E(x340Var24, qim0VarF);
                    hzj.A.getClass();
                    if (x340Var24.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var24.m0();
                    if (x340Var24.S) {
                        x340Var24.l(n4kVar);
                    } else {
                        x340Var24.v0();
                    }
                    nko1.H(jw31VarA5, x340Var24, y580.O0);
                    nko1.H(xos0VarM9, x340Var24, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode9), x340Var24, y580.R0);
                    nko1.F(x340Var24);
                    nko1.H(qim0VarE9, x340Var24, y580.Y);
                    if (str9 == null || ihc1.y0(str9)) {
                        x340Var24.i0(889166288);
                        x340Var24.r(false);
                    } else {
                        x340Var24.i0(888989464);
                        uwo1.e(str9, null, cbx.d(x340Var24).j, cbx.a(x340Var24).b.b, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2034);
                        x340Var24.r(false);
                    }
                    tto1.d(fgx0Var.a / 100.0f, 0, 12, 0L, 0L, x340Var24, new wnb0(1.0f, true));
                    x340Var24.r(true);
                    x340Var24.r(false);
                } else if (str9 == null || ihc1.y0(str9)) {
                    x340Var24.i0(-146776431);
                    x340Var24.r(false);
                } else {
                    x340Var24.i0(-146930191);
                    uwr uwrVar11 = cbx.a;
                    uwo1.e((String) obj5, null, cbx.d(x340Var24).j, cbx.a(x340Var24).b.b, null, null, 0, false, null, 0, null, x340Var24, 0, 0, 2034);
                    x340Var24.r(false);
                }
                return rih1Var;
            case 14:
                x340 x340Var25 = (b0k) obj2;
                int iIntValue6 = ((Number) obj3).intValue();
                x340 x340Var26 = x340Var25;
                if (x340Var26.Y(iIntValue6 & 1, (iIntValue6 & 17) != 16)) {
                    j9k1.d((Set) obj4, (String) obj5, anm1.N("CardSubtitleTestTag", nim0Var), z2 ? 2 : 1, x340Var26, 384, 0);
                } else {
                    x340Var26.b0();
                }
                return rih1Var;
            case 15:
                return a(obj, obj2, obj3);
            case 16:
                x340 x340Var27 = (b0k) obj2;
                int iIntValue7 = ((Number) obj3).intValue();
                x340 x340Var28 = x340Var27;
                if (x340Var28.Y(iIntValue7 & 1, (iIntValue7 & 17) != 16)) {
                    lpy lpyVar = (lpy) obj4;
                    sgc1.t(lpyVar.b, lpyVar.n, ((mpy) obj5).b, this.c, x340Var28, 0);
                } else {
                    x340Var28.b0();
                }
                return rih1Var;
            case 17:
                ((Number) obj3).intValue();
                byp bypVar = (byp) obj4;
                otw.c((nm1) bypVar.a, new am1(2, ((zuc0) obj5).c, (String) null, (String) bypVar.b, true, this.c), (qim0) null, (ipb1) null, (b0k) obj2, 0, 12);
                return rih1Var;
            case 18:
                i2c i2cVar = (i2c) obj;
                x340 x340Var29 = (b0k) obj2;
                ((Number) obj3).intValue();
                j2i j2iVar2 = (j2i) obj4;
                ta60 ta60Var = (ta60) obj5;
                fa60 fa60Var = ta60Var.c;
                v960.a(z4p1.e(fa60Var.a), z4p1.e(fa60Var.d), z4p1.e(fa60Var.c), ta60Var.d.a, i2cVar.b(nim0Var), x340Var29, 0);
                if (z2) {
                    x340 x340Var30 = x340Var29;
                    x340Var30.i0(35132546);
                    j06 j06Var = x340Var30.a;
                    float fC = i2cVar.c();
                    qim0 qim0VarH2 = l6o1.H(u291.d(nim0Var, 1.0f), l6o1.C(0, 0, 1, x340Var30), false, 14);
                    gra graVar = een.d;
                    gfh0 gfh0VarC = t1c.c(graVar, false);
                    int iHashCode10 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM10 = x340Var30.m();
                    qim0 qim0VarE10 = zr7.E(x340Var30, qim0VarH2);
                    hzj.A.getClass();
                    if (j06Var == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    llj lljVar9 = y580.O0;
                    nko1.H(gfh0VarC, x340Var30, lljVar9);
                    llj lljVar10 = y580.N0;
                    nko1.H(xos0VarM10, x340Var30, lljVar10);
                    Integer numValueOf3 = Integer.valueOf(iHashCode10);
                    llj lljVar11 = y580.R0;
                    nko1.H(numValueOf3, x340Var30, lljVar11);
                    nko1.F(x340Var30);
                    llj lljVar12 = y580.Y;
                    nko1.H(qim0VarE10, x340Var30, lljVar12);
                    qim0 qim0VarJ = u291.j(fC, 0.0f, 2, u291.f(nim0Var, 1.0f));
                    gfh0 gfh0VarC2 = t1c.c(graVar, true);
                    int iHashCode11 = Long.hashCode(x340Var30.T);
                    xos0 xos0VarM11 = x340Var30.m();
                    qim0 qim0VarE11 = zr7.E(x340Var30, qim0VarJ);
                    x340Var30.m0();
                    if (x340Var30.S) {
                        x340Var30.l(n4kVar);
                    } else {
                        x340Var30.v0();
                    }
                    nko1.H(gfh0VarC2, x340Var30, lljVar9);
                    nko1.H(xos0VarM11, x340Var30, lljVar10);
                    x0d.q(iHashCode11, x340Var30, lljVar11, x340Var30);
                    nko1.H(qim0VarE11, x340Var30, lljVar12);
                    ktd.s(j2iVar2, x340Var30, 0, true, true);
                    x340Var30.r(false);
                } else {
                    x340 x340Var31 = x340Var29;
                    x340Var31.i0(35457426);
                    j2iVar2.invoke(x340Var31, 0);
                    x340Var31.r(false);
                }
                return rih1Var;
            case 19:
                return d(obj, obj2, obj3);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return e(obj, obj2, obj3);
            case 21:
                return f(obj, obj2, obj3);
            case 22:
                return g(obj, obj2, obj3);
            case 23:
                return h(obj, obj2, obj3);
            case 24:
                return i(obj, obj2, obj3);
            case 25:
                return j(obj, obj2, obj3);
            case 26:
                return k(obj, obj2, obj3);
            case 27:
                return m(obj, obj2, obj3);
            case 28:
                return n(obj, obj2, obj3);
            default:
                vzq0 vzq0Var2 = (vzq0) obj;
                x340 x340Var32 = (b0k) obj2;
                int iIntValue8 = ((Number) obj3).intValue();
                if ((iIntValue8 & 6) == 0) {
                    iIntValue8 |= x340Var32.g(vzq0Var2) ? (byte) 4 : (byte) 2;
                }
                x340 x340Var33 = x340Var32;
                if (x340Var33.Y(iIntValue8 & 1, (iIntValue8 & 19) != 18)) {
                    qim0 qim0VarD2 = u291.d(nim0Var, 1.0f);
                    xtb0 xtb0Var = (xtb0) obj4;
                    iu30 iu30Var4 = (iu30) obj5;
                    mbh mbhVarA5 = jbh.a(f36Var, een.P0, x340Var33, 0);
                    int iHashCode12 = Long.hashCode(x340Var33.T);
                    xos0 xos0VarM12 = x340Var33.m();
                    qim0 qim0VarE12 = zr7.E(x340Var33, qim0VarD2);
                    hzj.A.getClass();
                    if (x340Var33.a == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var33.m0();
                    if (x340Var33.S) {
                        x340Var33.l(n4kVar);
                    } else {
                        x340Var33.v0();
                    }
                    nko1.H(mbhVarA5, x340Var33, y580.O0);
                    nko1.H(xos0VarM12, x340Var33, y580.N0);
                    nko1.H(Integer.valueOf(iHashCode12), x340Var33, y580.R0);
                    nko1.F(x340Var33);
                    nko1.H(qim0VarE12, x340Var33, y580.Y);
                    qim0 qim0VarN2 = anm1.N("member-details-list-elements", u291.d(nim0Var, 1.0f));
                    zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, vzq0Var2.a(), 7);
                    boolean zG4 = x340Var33.g(iu30Var4);
                    Object objT4 = x340Var33.T();
                    if (zG4 || objT4 == fkj0.X) {
                        objT4 = new mhg0(iu30Var4, (byte) 25);
                        x340Var33.s0(objT4);
                    }
                    ujo1.d(qim0VarN2, xtb0Var, zzq0VarJ, false, null, null, null, false, null, (iu30) objT4, x340Var33, 6, 504);
                    x340Var33.r(true);
                    if (z2) {
                        x340Var33.i0(1994525915);
                        zso1.o(null, x340Var33, 0);
                        x340Var33.r(false);
                    } else {
                        x340Var33.i0(1994567238);
                        x340Var33.r(false);
                    }
                } else {
                    x340Var33.b0();
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(byte b, Object obj, cv30 cv30Var, boolean z) {
        super(3);
        this.a = b;
        this.d = obj;
        this.c = z;
        this.b = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, Object obj2, boolean z, byte b) {
        super(3);
        this.a = b;
        this.d = obj;
        this.b = obj2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(Object obj, boolean z, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.c = z;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(boolean z, Object obj, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.c = z;
        this.d = obj;
        this.b = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(boolean z, Object obj, boolean z2, Object obj2, byte b) {
        super(3);
        this.a = b;
        this.b = obj;
        this.d = obj2;
        this.c = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ o3(byte b, Object obj, String str, boolean z) {
        super(3);
        this.a = b;
        this.c = z;
        this.b = str;
        this.d = obj;
    }
}
