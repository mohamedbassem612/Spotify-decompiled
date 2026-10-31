package p;

import android.os.Build;
import android.text.StaticLayout;
import android.widget.FrameLayout;
import com.spotify.browsita.v1.resolved.Heading;
import com.spotify.browsita.v1.resolved.NavigationAction;
import com.spotify.contexts.Time;
import com.spotify.eventsender.Fragment;
import com.spotify.eventsender.FragmentsContainer;
import io.reactivex.rxjava3.core.Flowable;
import java.math.BigInteger;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class q1o1 {
    public static final hwt a = new hwt(false, false, false, false, true, false, false);
    public static final zkm b = new zkm((String) null, false, (String) null, false);
    public static String c = "bnc_no_value";
    public static b180 d;

    public static final void a(String str, float f, float f2, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        String str2;
        int i2;
        x340 x340Var;
        x340 x340Var2 = (x340) b0kVar;
        x340Var2.k0(-1627774232);
        if ((i & 6) == 0) {
            str2 = str;
            i2 = (x340Var2.g(str2) ? 4 : 2) | i;
        } else {
            str2 = str;
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var2.d(f) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= x340Var2.d(f2) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i2 |= x340Var2.i(iu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i2 |= x340Var2.i(qim0Var) ? 16384 : 8192;
        }
        if (x340Var2.Y(i2 & 1, (i2 & 9363) != 9362)) {
            wat watVar = (wat) x340Var2.k(t4k.h);
            Object objT = x340Var2.T();
            m4c m4cVar = fkj0.X;
            if (objT == m4cVar) {
                objT = ktd.o(0.0f, x340Var2);
            }
            ven0 ven0Var = (ven0) objT;
            qim0 qim0VarR = i1p1.r(u291.h(u291.f(qim0Var, 1.0f), f));
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarR);
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
            nko1.H(gfh0VarC, x340Var2, y580.O0);
            nko1.H(xos0VarM, x340Var2, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var2, y580.R0);
            nko1.F(x340Var2);
            nko1.H(qim0VarE, x340Var2, y580.Y);
            ibx ibxVarP = bno1.p(x340Var2);
            qim0 qim0VarZ = u291.z(d9y0.k(nim0.a, f2), (fra) null, 1);
            boolean zI = ((i2 & 7168) == 2048) | x340Var2.i(watVar) | x340Var2.i(ven0Var);
            Object objT2 = x340Var2.T();
            if (zI || objT2 == m4cVar) {
                objT2 = new lb50(watVar, iu30Var, ven0Var, (byte) 3);
                x340Var2.s0(objT2);
            }
            zmo1.e(str2, ern1.x(qim0VarZ, (iu30) objT2), ibxVarP, 0L, null, null, 0, false, 2, null, null, x340Var2, (i2 & 14) | 100663808, 1784);
            x340Var = x340Var2;
            x340Var.r(true);
        } else {
            x340Var = x340Var2;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new vv50(str, f, f2, iu30Var, qim0Var, i);
        }
    }

    public static final void b(boolean z, boolean z2, float f, float f2, g2z g2zVar, String str, Function0 function0, iu30 iu30Var, iu30 iu30Var2, j2i j2iVar, b0k b0kVar, int i) {
        j2i j2iVar2;
        float fE;
        qim0 qim0Var;
        m4c m4cVar = fkj0.X;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1065542765);
        j06 j06Var = x340Var.a;
        int i2 = i | (x340Var.h(z) ? 4 : 2) | (x340Var.h(z2) ? 32 : 16) | (x340Var.d(f) ? 256 : 128) | (x340Var.d(f2) ? 2048 : 1024) | (x340Var.i(g2zVar) ? 16384 : 8192) | (x340Var.g(str) ? 131072 : 65536) | (x340Var.i(function0) ? 1048576 : 524288) | (x340Var.i(iu30Var) ? 8388608 : 4194304) | (x340Var.i(iu30Var2) ? 67108864 : 33554432);
        if (x340Var.Y(i2 & 1, (i2 & 306783379) != 306783378)) {
            float f3 = zjy.j(f2, new p3v(dsa0.m(x340Var, 2131166901))).a;
            if (z) {
                x340Var.i0(-518181883);
                x340Var.r(false);
                fE = (f3 - f) / 2.0f;
            } else {
                fE = z5c.e(x340Var, -518033424, 2131167047, x340Var, false);
            }
            tob1 tob1VarA = z95.a(fE, k1o1.k(z2, x340Var), "artwork_horizontal_padding", x340Var, 384, 8);
            boolean z3 = (i2 & 29360128) == 8388608;
            Object objT = x340Var.T();
            if (z3 || objT == m4cVar) {
                objT = new z720(iu30Var, (byte) 18);
                x340Var.s0(objT);
            }
            qim0 qim0Var2 = nim0.a;
            qim0 qim0VarX = ern1.x(qim0Var2, (iu30) objT);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
            xos0 xos0VarM = x340Var.m();
            qim0 qim0VarE = zr7.E(x340Var, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var.m0();
            boolean z4 = x340Var.S;
            n4k n4kVar = hmb0.t1;
            if (z4) {
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
            x340Var.i0(1869671296);
            qim0 qim0VarN = anm1.N("sponsored_playlist_header_artwork", qim0Var2);
            p3v p3vVar = (p3v) ((tob1) g2zVar.e).getValue();
            float f4 = p3vVar.a;
            qim0 qim0VarR = u291.r(uyn1.B(qim0VarN, ((p3v) tob1VarA.getValue()).a, pap1.y(p3vVar, new p3v(0.0f)).a, 0.0f, 0.0f, 12), ((p3v) ((tob1) g2zVar.d).getValue()).a);
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var).f;
            cua cuaVar2 = cbx.b(x340Var).f;
            qim0 qim0VarF = dug.f(i1p1.q(qim0VarR, new zvx()), cbx.a(x340Var).a.c, d4o1.a);
            if (function0 != null) {
                boolean z5 = (i2 & 3670016) == 1048576;
                Object objT2 = x340Var.T();
                if (z5 || objT2 == m4cVar) {
                    objT2 = new zg20(function0, (byte) 28);
                    x340Var.s0(objT2);
                }
                qim0Var = qim0Var2;
                qim0VarF = qim0VarF.then(bin.x(qim0Var2, false, null, null, null, (Function0) objT2, 15));
            } else {
                qim0Var = qim0Var2;
            }
            x340Var.r(false);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var.T);
            xos0 xos0VarM2 = x340Var.m();
            qim0 qim0VarE2 = zr7.E(x340Var, qim0VarF);
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
            j2iVar2 = j2iVar;
            dv20.l(6, j2iVar2, x340Var, true);
            op71.g(x340Var, u291.h(qim0Var, ((p3v) ((tob1) g2zVar.f).getValue()).a));
            a(str, ((p3v) ((tob1) g2zVar.c).getValue()).a, ((Number) ((tob1) g2zVar.b).getValue()).floatValue(), iu30Var2, uyn1.z(dsa0.m(x340Var, 2131167047), 0.0f, 2, qim0Var), x340Var, (i2 >> 15) & 7182);
            x340Var = x340Var;
            x340Var.r(true);
        } else {
            j2iVar2 = j2iVar;
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new wv50(z, z2, f, f2, g2zVar, str, function0, iu30Var, iu30Var2, j2iVar2, i);
        }
    }

    public static final mr20 c(Flowable flowable, c3s c3sVar) {
        vbm[] vbmVarArr = q601.a;
        return rqt0.u(new x010(new kge(flowable), yoi1.g(c3sVar.e), new uvc(3, (lnm) null, (byte) 2), (byte) 1));
    }

    public static StaticLayout d(vrb1 vrb1Var) {
        StaticLayout.Builder builderObtain = StaticLayout.Builder.obtain(vrb1Var.a, 0, vrb1Var.b, vrb1Var.c, vrb1Var.d);
        builderObtain.setTextDirection(vrb1Var.e);
        builderObtain.setAlignment(vrb1Var.f);
        builderObtain.setMaxLines(vrb1Var.g);
        builderObtain.setEllipsize(vrb1Var.h);
        builderObtain.setEllipsizedWidth(vrb1Var.i);
        builderObtain.setLineSpacing(0.0f, 1.0f);
        builderObtain.setIncludePad(vrb1Var.k);
        builderObtain.setBreakStrategy(vrb1Var.l);
        builderObtain.setHyphenationFrequency(vrb1Var.o);
        builderObtain.setIndents(null, null);
        int i = Build.VERSION.SDK_INT;
        if (i >= 26) {
            no80.Q(builderObtain, vrb1Var.j);
        }
        if (i >= 28) {
            ph5.V(builderObtain);
        }
        if (i >= 33) {
            gg.O(builderObtain, vrb1Var.m, vrb1Var.n);
        }
        if (i >= 35) {
            v5w.a(builderObtain);
        }
        return builderObtain.build();
    }

    public static final FragmentsContainer e(byte[] bArr, long j, s900 s900Var) {
        qj30 qj30VarR = FragmentsContainer.r();
        hhc hhcVarE = phc.e(0, bArr, bArr.length);
        wf30 wf30VarN = Fragment.n();
        wf30VarN.q("message");
        wf30VarN.n(hhcVarE);
        qj30VarR.q(wf30VarN.build());
        jke1 jke1VarN = Time.n();
        if (j <= 0) {
            j = System.currentTimeMillis();
        }
        jke1VarN.n(j);
        phc byteString = jke1VarN.build().toByteString();
        wf30 wf30VarN2 = Fragment.n();
        wf30VarN2.q("context_time");
        wf30VarN2.n(byteString);
        qj30VarR.q(wf30VarN2.build());
        List<r900> list = s900Var.a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (r900 r900Var : list) {
            String strA = r900Var.a();
            phc byteString2 = r900Var.getData().toByteString();
            wf30 wf30VarN3 = Fragment.n();
            wf30VarN3.q(strA);
            wf30VarN3.n(byteString2);
            arrayList.add(wf30VarN3.build());
        }
        qj30VarR.n(arrayList);
        return qj30VarR.build();
    }

    public static final long f(jkr0 jkr0Var) {
        return jch0.a0(((drr0) jkr0Var.d.d).s() * jkr0Var.n()) + (((long) ((err0) jkr0Var.d.c).s()) * ((long) jkr0Var.n()));
    }

    public static final boolean g(int i, int i2) {
        return i == i2;
    }

    public static final jc11 h(uqv0 uqv0Var, heg hegVar, joj0 joj0Var) {
        String strReplace = hegVar.b.a.a.replace('.', '$');
        kf30 kf30Var = hegVar.a;
        if (!kf30Var.a.c()) {
            strReplace = kf30Var + '.' + strReplace;
        }
        bm00 bm00VarE = uqv0Var.e(strReplace);
        if (bm00VarE != null) {
            return (jc11) bm00VarE.b;
        }
        return null;
    }

    public static final boolean k(mr4 mr4Var) {
        return mr4Var.q() && !mr4Var.y();
    }

    public static String l() {
        return c;
    }

    public static final boolean m(mr4 mr4Var) {
        return mr4Var.y();
    }

    public static List n() {
        return Collections.singletonList(rc11.a.b(kmd.class));
    }

    public static boolean s(StaticLayout staticLayout) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            return gg.z(staticLayout);
        }
        return i >= 28;
    }

    public static boolean t(qtq qtqVar) {
        return new r55(false, qtqVar.a.b()).a();
    }

    public static fqg0 u(laa laaVar, qim0 qim0Var, FrameLayout.LayoutParams layoutParams, int i) {
        if ((i & 1) != 0) {
            qim0Var = nim0.a;
        }
        boolean z = (i & 2) == 0;
        if ((i & 4) != 0) {
            layoutParams = null;
        }
        return new fqg0(laaVar, z, layoutParams, qim0Var);
    }

    public static final x360 v(Heading heading, boolean z) {
        int iO = heading.o();
        if ((iO == 0 ? -1 : hiy0.a[l1d.C(iO)]) != 1) {
            return null;
        }
        if (z) {
            return new mhq0(heading.q().q(), heading.q().o(), new lay("", "", ""));
        }
        NavigationAction navigationActionP = heading.q().p();
        if (!heading.q().r()) {
            navigationActionP = null;
        }
        return new hvl1(heading.q().q(), 242, (String) null, navigationActionP != null ? navigationActionP.o() : null, false, navigationActionP != null ? navigationActionP.getUri() : null);
    }

    public static void w(ahn1 ahn1Var) throws GeneralSecurityException {
        int iOrdinal = ahn1Var.ordinal();
        if (iOrdinal != 2 && iOrdinal != 3 && iOrdinal != 4) {
            throw new GeneralSecurityException("Unsupported hash: ".concat(String.valueOf(ahn1Var.name())));
        }
    }

    public static void x(int i) throws GeneralSecurityException {
        if (i < 2048) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size >= 2048-bit is supported", Integer.valueOf(i)));
        }
        if (nbp1.a() && i != 2048 && i != 3072) {
            throw new GeneralSecurityException(String.format("Modulus size is %d; only modulus size of 2048- or 3072-bit is supported in FIPS mode.", Integer.valueOf(i)));
        }
    }

    public static void y(BigInteger bigInteger) {
        if (!bigInteger.testBit(0)) {
            k220.r("Public exponent must be odd.");
        } else {
            if (bigInteger.compareTo(BigInteger.valueOf(65536L)) > 0) {
                return;
            }
            k220.r("Public exponent must be greater than 65536.");
        }
    }

    public Integer i() {
        return null;
    }

    public abstract int j();

    public boolean o() {
        return false;
    }

    public abstract String p();

    public boolean q() {
        return false;
    }

    public abstract boolean r();
}
