package p;

import android.content.Context;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableMap;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.WeakHashMap;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tm implements xpw, cvl1 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;

    public tm(vhq vhqVar, op0 op0Var, i01 i01Var, gw70 gw70Var, iiu iiuVar) {
        this.a = (byte) 20;
        this.c = op0Var;
        this.d = i01Var;
        this.e = gw70Var;
        if (!iiuVar.a.equals(new giu())) {
            hhg1.n("DisplayAdElementV2 currently supports only the legacy Home layout");
            throw null;
        }
        uiu uiuVar = uiu.a;
        r1t r1tVar = new r1t(1, uiuVar, uiu.class, "init", "init(Lcom/spotify/adsdisplay/element/display/v2/DisplayAdElementV2$Props;)Lcom/spotify/adsdisplay/elementimpl/display/v2/DisplayAdStateV2;", 0, (byte) 5);
        drm1 drm1Var = new drm1((byte) 12);
        hiu hiuVar = iiuVar.b;
        piu piuVar = hiuVar.a;
        z6n z6nVar = hiuVar.b;
        thq thqVar = vhqVar.a;
        daq daqVar = thqVar.b;
        yhu yhuVar = new yhu(piuVar, z6nVar, i01Var, (q8n) daqVar.V2.get(), (pxc) thqVar.c.t7.get(), (ao0) daqVar.Hk.get(), daqVar.a.a());
        z6n z6nVar2 = new z6n(2, uiuVar, uiu.class, "onPropsChanged", "onPropsChanged(Lcom/spotify/adsdisplay/element/display/v2/DisplayAdElementV2$Props;Lcom/spotify/adsdisplay/elementimpl/display/v2/DisplayAdStateV2;)Lcom/spotify/mobius/Next;", 0, (byte) 22);
        dq7 dq7Var = new dq7(drm1Var, (byte) 21);
        cas casVar = new cas();
        casVar.a = qlt.Y;
        this.f = new e7m0(r1tVar, dq7Var, yhuVar, z6nVar2, casVar);
        this.g = n3o1.q(this).a(v0t.c1, v0t.d1);
        j2i j2iVar = new j2i(-1338689741, new ent(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        byte b = this.a;
        Object obj = this.g;
        Object obj2 = this.f;
        switch (b) {
            case 0:
                return (eih1) obj2;
            case 1:
                return (ia00) obj;
            case 2:
                return (eih1) obj2;
            case 3:
                return (eih1) obj2;
            case 4:
                return (ia00) obj;
            case 5:
                return (ia00) obj2;
            case 6:
                return (ia00) obj;
            case 7:
                return (ia00) obj;
            case 8:
                return (ia00) obj;
            case 9:
                return (ia00) obj;
            case 10:
                return (i7h1) obj2;
            case 11:
                return (azg) obj;
            case 12:
                return (eih1) obj2;
            case 13:
                return (eih1) obj2;
            case 14:
                return (hy00) obj;
            case 15:
                return (rqw) obj2;
            case 16:
                return (eih1) obj2;
            case 17:
                return (hy00) obj;
            case 18:
                return (ia00) obj;
            case 19:
                return (ia00) obj;
            case 20:
                return (ia00) obj;
            case 21:
                return (ia00) obj2;
            case 22:
                return (ia00) obj2;
            case 23:
                return (ia00) obj2;
            case 24:
                return (eih1) obj2;
            case 25:
                return (eih1) obj2;
            case 26:
                return (eih1) obj2;
            case 27:
                return n3o1.r(this).c(vn50.U0, vn50.W0);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (hy00) obj2;
            default:
                return (ia00) obj;
        }
    }

    public final jsw c() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return (psw) obj;
            case 1:
                return (psw) obj;
            case 2:
                return (psw) obj;
            case 3:
                return (psw) obj;
            case 4:
                return (psw) obj;
            case 5:
                return (psw) obj;
            case 6:
                return (psw) obj;
            case 7:
                return (psw) obj;
            case 8:
                return (psw) obj;
            case 9:
                return (psw) obj;
            case 10:
                return (psw) obj;
            case 11:
                return (psw) obj;
            case 12:
                return (psw) obj;
            case 13:
                return (psw) obj;
            case 14:
                return (psw) obj;
            case 15:
                return (psw) obj;
            case 16:
                return (psw) obj;
            case 17:
                return (psw) obj;
            case 18:
                return (psw) obj;
            case 19:
                return (psw) obj;
            case 20:
                return (psw) obj;
            case 21:
                return (psw) obj;
            case 22:
                return (psw) obj;
            case 23:
                return (psw) obj;
            case 24:
                return (psw) obj;
            case 25:
                return (psw) obj;
            case 26:
                return (psw) obj;
            case 27:
                j2i j2iVar = new j2i(1202174515, new zq30(this, (byte) 23), true);
                ien0 ien0Var = qsw.a;
                return new psw(j2iVar, (byte) 0);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (psw) obj;
            default:
                return (psw) obj;
        }
    }

    public void e(Function0 function0, Function0 function1, b0k b0kVar, int i) {
        int i2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1700866993);
        if ((i & 6) == 0) {
            i2 = i | (x340Var.i(function0) ? 4 : 2);
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(function1) ? 32 : 16;
        }
        if (x340Var.Y(i2 & 1, (i2 & 19) != 18)) {
            qim0 qim0VarX = uyn1.x(u291.f(nim0.a, 1.0f), 8.0f);
            jw31 jw31VarA = ew31.a(h36.g, een.Z, x340Var, 0);
            int iHashCode = Long.hashCode(x340Var.T);
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
            nko1.H(jw31VarA, x340Var, y580.O0);
            nko1.H(xos0VarM, x340Var, y580.N0);
            nko1.H(Integer.valueOf(iHashCode), x340Var, y580.R0);
            nko1.F(x340Var);
            nko1.H(qim0VarE, x340Var, y580.Y);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            qim0 qim0VarB = uyn1.B(new wnb0(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 0.0f, 0.0f, 4.0f, 0.0f, 11);
            jdx jdxVar = jdx.c;
            z50 z50Var = z50.c;
            float f = 1.0f;
            foo1.c(new gbx(z50Var, function0), jdxVar, qim0VarB, (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, koi.a, x340Var, 0, 48, 2040);
            if (1.0f <= 0.0d) {
                of80.a("invalid weight; must be greater than zero");
            }
            if (1.0f > Float.MAX_VALUE) {
                f = Float.MAX_VALUE;
            }
            foo1.c(new gbx(z50Var, function1), new idx(4), uyn1.B(new wnb0(f, true), 4.0f, 0.0f, 0.0f, 0.0f, 14), (max) null, (gdx) null, (vzq0) null, (idn0) null, (ga80) null, (vu30) null, (vu30) null, koi.b, x340Var, 0, 48, 2040);
            x340Var.r(true);
        } else {
            x340Var.b0();
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new ze10(this, function0, function1, i, (byte) 2);
        }
    }

    public void f(a720 a720Var, Function0 function0, iu30 iu30Var, vu30 vu30Var, vu30 vu30Var2, b0k b0kVar, int i) {
        Function0 function1;
        tm tmVar;
        vu30 vu30Var3;
        Object obj;
        Object obj2;
        bw91 bw91Var;
        qha1 qha1Var;
        ven0 ven0Var;
        int i2;
        boolean z;
        Object obj3;
        Object obj4;
        m4c m4cVar = fkj0.X;
        b0k b0kVar2 = (x340) b0kVar;
        b0kVar2.k0(1928914795);
        j06 j06Var = ((x340) b0kVar2).a;
        int i3 = (i & 6) == 0 ? (b0kVar2.i(a720Var) ? 4 : 2) | i : i;
        if ((i & 48) == 0) {
            i3 |= b0kVar2.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= b0kVar2.i(iu30Var) ? 256 : 128;
        }
        if ((i & 3072) == 0) {
            i3 |= b0kVar2.i(vu30Var) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= b0kVar2.i(vu30Var2) ? 16384 : 8192;
        }
        if ((196608 & i) == 0) {
            i3 |= b0kVar2.i(this) ? 131072 : 65536;
        }
        if (b0kVar2.Y(i3 & 1, (74899 & i3) != 74898)) {
            Object[] objArr = new Object[0];
            df41 df41Var = (df41) this.d;
            boolean zI = b0kVar2.i(a720Var);
            Object objT = b0kVar2.T();
            if (zI || objT == m4cVar) {
                obj = objT;
                c720 c720Var = new c720(a720Var, (byte) 0);
                b0kVar2.s0(c720Var);
                obj = c720Var;
            }
            bw91 bw91Var2 = (bw91) k5p1.u(objArr, df41Var, (Function0) obj, b0kVar2, 0);
            Object[] objArr2 = new Object[0];
            df41 df41Var2 = (df41) this.e;
            boolean zI2 = b0kVar2.i(a720Var);
            Object objT2 = b0kVar2.T();
            if (zI2 || objT2 == m4cVar) {
                c720 c720Var2 = new c720(a720Var, (byte) 1);
                b0kVar2.s0(c720Var2);
                obj2 = c720Var2;
            } else {
                obj2 = objT2;
            }
            ven0 ven0Var2 = (ven0) k5p1.u(objArr2, df41Var2, (Function0) obj2, b0kVar2, 0);
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            era eraVar = een.P0;
            f36 f36Var = h36.c;
            int i4 = i3;
            mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM = b0kVar2.m();
            qim0 qim0VarE = zr7.E(b0kVar2, qim0VarF);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            b0kVar2.m0();
            boolean z2 = ((x340) b0kVar2).S;
            n4k n4kVar = hmb0.t1;
            if (z2) {
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
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            String strO0 = cwl1.o0(b0kVar2, 2131955969);
            uwr uwrVar = cbx.a;
            uwo1.e(strO0, qim0VarF2, cbx.d(b0kVar2).h, cbx.a(b0kVar2).b.a, new a0e1(3), (iu30) null, 0, false, (djc0) null, 0, (qx8) null, b0kVar2, 0, 0, 2016);
            b0kVar2 = b0kVar2;
            qim0 qim0VarX = uyn1.x(u291.f(nim0Var, 1.0f), 16.0f);
            avw0 avw0Var = cbx.b(b0kVar2).c;
            qim0 qim0VarH = u291.h(qim0VarX, 1.0f);
            long jC = cbx.a(b0kVar2).a.b.c();
            u5j1 u5j1Var = d4o1.a;
            op71.g(b0kVar2, dug.f(qim0VarH, jC, u5j1Var));
            qim0 qim0VarH2 = l6o1.H(u291.f(nim0Var, 1.0f), l6o1.C(0, 0, 1, b0kVar2), false, 14);
            WeakHashMap weakHashMap = osl1.x;
            qim0 qim0VarP = x0d.p(lhc.g(b0kVar2).g, 32, qim0VarH2);
            mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
            int iHashCode2 = Long.hashCode(((x340) b0kVar2).T);
            xos0 xos0VarM2 = b0kVar2.m();
            qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarP);
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
            c380 c380Var = a720Var.c;
            c380<uha1> c380Var2 = a720Var.b;
            if (c380Var.isEmpty()) {
                bw91Var = bw91Var2;
                qha1Var = null;
                b0kVar2.i0(-1500179189);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1500990273);
                bw91Var = bw91Var2;
                qha1Var = null;
                p1p1.k(mqo1.A(bw91Var2), new uny(bw91Var, a720Var, iu30Var, (byte) 28), (qim0) null, b0kVar2, 0);
                b0kVar2.r(false);
            }
            if (c380Var2.isEmpty()) {
                ven0Var = ven0Var2;
                i2 = i4;
                z = false;
                b0kVar2.i0(-1499292341);
                b0kVar2.r(false);
            } else {
                b0kVar2.i0(-1500109191);
                qim0 qim0VarX2 = uyn1.x(u291.f(nim0Var, 1.0f), 16.0f);
                avw0 avw0Var2 = cbx.b(b0kVar2).c;
                op71.g(b0kVar2, dug.f(u291.h(qim0VarX2, 1.0f), cbx.a(b0kVar2).a.b.c(), u5j1Var));
                ArrayList arrayList = new ArrayList(q7h.U(c380Var2, 10));
                for (uha1 uha1Var : c380Var2) {
                    arrayList.add(uha1Var.b == ((uha1) ven0Var2.getValue()).b ? uha1.a(uha1Var, true, ((uha1) ven0Var2.getValue()).d, 3) : uha1.a(uha1Var, false, qha1Var, 11));
                }
                c380 c380VarA = mqo1.A(arrayList);
                ven0Var = ven0Var2;
                i2 = i4;
                boolean zI3 = b0kVar2.i(ven0Var) | ((i2 & 7168) == 2048);
                Object objT3 = b0kVar2.T();
                if (zI3 || objT3 == m4cVar) {
                    z = false;
                    b720 b720Var = new b720(ven0Var, vu30Var, (byte) 0);
                    b0kVar2.s0(b720Var);
                    obj4 = b720Var;
                } else {
                    z = false;
                    obj4 = objT3;
                }
                c921.k(c380VarA, (vu30) obj4, b0kVar2, z ? 1 : 0);
                b0kVar2.r(z);
            }
            if ((57344 & i2) == 16384) {
                z = true;
            }
            boolean z3 = (b0kVar2.i(bw91Var) ? 1 : 0) | z | (b0kVar2.i(ven0Var) ? 1 : 0);
            Object objT4 = b0kVar2.T();
            if (z3 || objT4 == m4cVar) {
                vu30Var3 = vu30Var2;
                xvy xvyVar = new xvy(vu30Var3, bw91Var, ven0Var, (byte) 7);
                b0kVar2.s0(xvyVar);
                obj3 = xvyVar;
            } else {
                vu30Var3 = vu30Var2;
                obj3 = objT4;
            }
            tmVar = this;
            function1 = function0;
            tmVar.e(function1, (Function0) obj3, b0kVar2, ((i2 >> 3) & 14) | ((i2 >> 9) & 896));
            b0kVar2.r(true);
            b0kVar2.r(true);
        } else {
            function1 = function0;
            tmVar = this;
            vu30Var3 = vu30Var2;
            b0kVar2.b0();
        }
        h311 h311VarV = b0kVar2.v();
        if (h311VarV != null) {
            h311VarV.d = new wc0(tmVar, a720Var, function1, iu30Var, vu30Var, vu30Var3, i);
        }
    }

    public final mqw getBehavior() {
        byte b = this.a;
        Object obj = this.f;
        Object obj2 = this.g;
        switch (b) {
            case 0:
                return (rey0) obj2;
            case 1:
                return (js20) obj;
            case 2:
                return (poy0) obj2;
            case 3:
                return (rey0) obj2;
            case 4:
                return (k8d1) obj;
            case 5:
                return (rey0) obj2;
            case 6:
                return (k8d1) obj;
            case 7:
                return (js20) obj;
            case 8:
                return (js20) obj;
            case 9:
                return (js20) obj;
            case 10:
                return (rey0) obj2;
            case 11:
                return (ljm0) this.e;
            case 12:
                return (e7m0) obj2;
            case 13:
                return (rey0) obj2;
            case 14:
                return (k8d1) obj;
            case 15:
                return (rey0) obj2;
            case 16:
                return (ljm0) obj2;
            case 17:
                return (js20) obj;
            case 18:
                return (js20) obj;
            case 19:
                return (js20) obj;
            case 20:
                return (e7m0) obj;
            case 21:
                return (rey0) obj2;
            case 22:
                return (rey0) obj2;
            case 23:
                return (ljm0) obj2;
            case 24:
                return (rey0) obj2;
            case 25:
                return (rey0) obj2;
            case 26:
                return (k8d1) obj2;
            case 27:
                return d4o1.f(new bb60(this, (byte) 0), z860.e, oq50.O0, new bb60(this, (byte) 1), 8);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return (rey0) obj2;
            default:
                return (js20) obj;
        }
    }

    public String h() {
        chr0 chr0Var;
        String str;
        int iOrdinal = ((ea6) ((da6) this.d).b.a.getValue()).a.ordinal();
        if (iOrdinal == 0) {
            chr0Var = chr0.a;
        } else if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            chr0Var = chr0.a;
        } else {
            chr0Var = chr0.b;
        }
        int iOrdinal2 = chr0Var.ordinal();
        if (iOrdinal2 == 0) {
            str = "playlist";
        } else if (iOrdinal2 != 1) {
            if (iOrdinal2 != 2) {
                eg.o();
                return null;
            }
            str = "playlist";
        } else {
            str = "bluejay";
        }
        return "spotify:internal:magpie:assistance?pageType=".concat(str);
    }

    public String i(r620 r620Var) {
        int i;
        Context context = (Context) this.c;
        switch (r620Var.ordinal()) {
            case 0:
                i = 2131952533;
                break;
            case 1:
                i = 2131952531;
                break;
            case 2:
                i = 2131952532;
                break;
            case 3:
                i = 2131952524;
                break;
            case 4:
                i = 2131952525;
                break;
            case 5:
                i = 2131952528;
                break;
            case 6:
                i = 2131952530;
                break;
            case 7:
                i = 2131952526;
                break;
            case 8:
                i = 2131952529;
                break;
            default:
                eg.o();
                return null;
        }
        return context.getString(i);
    }

    public zob1 j(long j) {
        LinkedHashMap linkedHashMap = (LinkedHashMap) this.e;
        jfv jfvVar = new jfv(j);
        Object objT = linkedHashMap.get(jfvVar);
        if (objT == null) {
            k9r k9rVar = (k9r) this.c;
            objT = d5p1.t(o4p1.r(hu20.e(rqt0.u(new m441(new clo(k9rVar, (lnm) null, (byte) 20))), new svr(j, (lnm) null)), (q8n) k9rVar.d), cto1.q(((q7r0) this.d).d.c), new alb1(5000L, 0L), hfx0.a);
            linkedHashMap.put(jfvVar, objT);
        }
        return (zob1) objT;
    }

    public hpc1 k() {
        Object next;
        String language = Locale.forLanguageTag(upn1.q()).getLanguage();
        List list = ((pqc1) this.c).f;
        Iterator it = list.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(Locale.forLanguageTag(((hpc1) next).f).getLanguage(), language));
        hpc1 hpc1Var = (hpc1) next;
        return hpc1Var == null ? (hpc1) o7h.s0(list) : hpc1Var;
    }

    public tm(ynb0 ynb0Var, ynb0 ynb0Var2, udm udmVar) {
        ia00 eih1Var;
        this.a = (byte) 15;
        this.c = ynb0Var;
        this.d = udmVar;
        uks uksVar = (uks) ynb0Var2.get();
        ki90 ki90Var = udmVar.a;
        zv31 zv31Var = ki90Var.a;
        int i = udmVar.b;
        wly0 wly0Var = ki90Var.b;
        n8h1 n8h1VarF = uksVar.a(wly0Var).f(zv31Var, i, udmVar.c);
        this.e = n8h1VarF;
        this.g = new rey0(new mgl(this, (byte) 4));
        if (n8h1VarF != null) {
            eih1Var = n3o1.q(this).a(new cml(this, (byte) 4), fdm.f);
        } else {
            eih1Var = new eih1();
        }
        this.f = eih1Var;
        j2i j2iVar = new j2i(-1172002522, new bfm(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(rm9 rm9Var, w2k1 w2k1Var, iu30 iu30Var) {
        this.a = (byte) 8;
        this.c = rm9Var;
        this.d = w2k1Var;
        this.e = iu30Var;
        this.f = z0o1.k(rm9Var.u, tj8.b1, new uv8(this, (byte) 14), 4);
        j2i j2iVar = new j2i(879889275, new zk9(this, (byte) 6), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(new ap9(this, (byte) 0), new ap9(this, (byte) 1));
    }

    public tm(u961 u961Var, lzn0 lzn0Var, iu30 iu30Var) {
        this.a = (byte) 5;
        this.c = u961Var;
        this.d = lzn0Var;
        this.e = iu30Var;
        this.g = new rey0(new o2(this, (byte) 27));
        j2i j2iVar = new j2i(-2143860212, new i43(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.f = n3o1.q(this).a(mm1.d1, mm1.e1);
    }

    public tm(d0r d0rVar, bnr bnrVar) {
        this.a = (byte) 13;
        this.c = d0rVar;
        this.d = bnrVar;
        this.e = new idd1(new vjh(this, (byte) 18));
        this.g = k1o1.p();
        this.f = new eih1();
        j2i j2iVar = new j2i(-1967804049, new rxg(this, (byte) 21), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(k9r k9rVar, q7r0 q7r0Var) {
        this.a = (byte) 16;
        this.c = k9rVar;
        this.d = q7r0Var;
        this.e = new LinkedHashMap();
        this.g = h7w.B(new m4r(this, (byte) 17), (o8n) null, (iu30) null, new cml(this, (byte) 26), 6);
        this.f = new eih1();
        j2i j2iVar = gii.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(vb2 vb2Var, uzl0 uzl0Var, k7d k7dVar) {
        this.a = (byte) 4;
        this.c = vb2Var;
        this.d = uzl0Var;
        this.e = k7dVar;
        this.f = k1o1.u(new kw0(this, (lnm) null, (byte) 1));
        this.g = n3o1.q(this).a(new v72(this, (byte) 2), mm1.Y0);
        j2i j2iVar = h5i.c;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(a1r0 a1r0Var, da6 da6Var, x1i1 x1i1Var) {
        this.a = (byte) 29;
        this.c = a1r0Var;
        this.d = da6Var;
        this.e = x1i1Var;
        this.f = x3p1.m(r6x.a, hh60.Z0, g070.d, (o8n) null, new zi50(this, (byte) 23), 8);
        this.g = n3o1.q(this).a(oe60.t, new wx00(this, (byte) 29));
        j2i j2iVar = msi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(String str, m980 m980Var, tbn tbnVar) {
        this.a = (byte) 28;
        this.c = str;
        this.d = m980Var;
        this.e = tbnVar;
        this.g = new rey0(new gn50(this, (byte) 15));
        j2i j2iVar = new j2i(1639354981, new zq30(this, (byte) 28), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.f = n3o1.r(this).c(oe60.f, new wx00(this, (byte) 24));
    }

    public tm(oez0 oez0Var, wbr0 wbr0Var) {
        this.a = (byte) 3;
        this.c = oez0Var;
        zbr0 zbr0VarA = wbr0Var.a("AddQuickAccessSettingsElement");
        this.d = zbr0VarA;
        this.e = zbr0VarA.a(uj1.b, new wj1(this, (byte) 0));
        this.g = new rey0(new o2(this, (byte) 19));
        this.f = new eih1();
        j2i j2iVar = new j2i(383118983, new r1(this, (byte) 18), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(d0r d0rVar, jcq jcqVar, d2w d2wVar) {
        this.a = (byte) 24;
        this.c = d0rVar;
        this.d = jcqVar;
        this.e = d2wVar;
        this.g = k1o1.p();
        this.f = new eih1();
        j2i j2iVar = new j2i(-1653673661, new zq30(this, (byte) 5), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(paj0 paj0Var, pu40 pu40Var, gw70 gw70Var) {
        this.a = (byte) 0;
        this.c = paj0Var;
        this.d = pu40Var;
        this.e = gw70Var;
        this.f = new eih1();
        this.g = new rey0(new o2(this, (byte) 1));
        j2i j2iVar = new j2i(-1425444714, new r1(this, (byte) 2), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(ynb0 ynb0Var, ynb0 ynb0Var2, ynb0 ynb0Var3) {
        this.a = (byte) 26;
        this.c = ynb0Var;
        this.d = ynb0Var2;
        this.e = ynb0Var3;
        this.g = k1o1.u(new r20(this, (lnm) null, (byte) 21));
        this.f = new eih1();
        j2i j2iVar = new j2i(1960880585, new zq30(this, (byte) 16), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(pqc1 pqc1Var, nqc1 nqc1Var, rm9 rm9Var) {
        this.a = (byte) 7;
        this.c = pqc1Var;
        this.d = nqc1Var;
        this.e = rm9Var;
        this.f = x3p1.n(new ok9(this, (byte) 0), zv8.Z, tj8.N0, (o8n) null, new ok9(this, (byte) 1), 8);
        j2i j2iVar = m8i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(new pk9(this, (byte) 0), new pk9(this, (byte) 1));
    }

    public tm(Context context, bqk0 bqk0Var, jg7 jg7Var) {
        this.a = (byte) 23;
        this.c = context;
        this.d = bqk0Var;
        this.e = jg7Var;
        this.f = n3o1.q(this).a(new u820(this, (byte) 1), jq00.c1);
        this.g = h7w.B(zs10.Z0, (o8n) null, (iu30) null, new u820(this, (byte) 0), 6);
        j2i j2iVar = moi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(il0 il0Var, pcl pclVar, rwj rwjVar) {
        this.a = (byte) 1;
        this.c = il0Var;
        this.d = pclVar;
        this.e = rwjVar;
        this.f = x3p1.n(new j2(this, (byte) 8), di0.c, e3.Q0, (o8n) null, (iu30) null, 24);
        this.g = n3o1.q(this).a(n1.b1, n1.c1);
        j2i j2iVar = new j2i(-1529105485, new r1(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(k6p k6pVar, hyl0 hyl0Var, oud oudVar) {
        this.a = (byte) 11;
        this.c = hyl0Var;
        this.d = oudVar;
        this.e = h7w.B(tpg.Z0, (o8n) null, (iu30) null, new zyg(this, (byte) 0), 6);
        this.f = n3o1.q(this).a(new zyg(this, (byte) 1), r0f.Y0);
        this.g = new azg(this);
        j2i j2iVar = new j2i(1410975825, new rxg(this, (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(Flowable flowable, FlowableMap flowableMap, w9u0 w9u0Var, j62 j62Var) {
        this.a = (byte) 2;
        this.c = flowableMap;
        this.d = w9u0Var;
        this.e = j62Var;
        this.g = d4o1.g(Flowable.h(flowableMap, flowable, ns80.f), di0.T0, e3.T0, new j2(this, (byte) 16), 8);
        j2i j2iVar = k3i.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.f = new eih1();
    }

    public tm(rm9 rm9Var, it8 it8Var, yqg yqgVar) {
        this.a = (byte) 9;
        this.c = rm9Var;
        this.d = it8Var;
        this.e = yqgVar;
        this.f = x3p1.n(new uq9(this, (byte) 0), fm9.d1, vq9.b, (o8n) null, new uq9(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(pn9.i, new hp9(this, (byte) 3));
        j2i j2iVar = new j2i(-478601605, new zk9(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(gw70 gw70Var, cnk cnkVar, lc20 lc20Var, ynk ynkVar) {
        this.a = (byte) 12;
        this.e = gw70Var;
        this.c = lc20Var;
        this.d = ynkVar;
        this.g = sbl.A(rgk.X, n4.C, cnkVar.a(), yzj.Z, new enk(this));
        this.f = new eih1();
        j2i j2iVar = new j2i(224821653, new rxg(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(ov20 ov20Var, r241 r241Var, f1n0 f1n0Var) {
        this.a = (byte) 6;
        this.c = ov20Var;
        this.d = r241Var;
        this.e = f1n0Var;
        this.f = k1o1.u(new kw0(this, (lnm) null, (byte) 3));
        j2i j2iVar = new j2i(741141184, new i43(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.q(this).a(k63.Q0, k63.R0);
    }

    public tm(lzn0 lzn0Var, z710 z710Var, wen0 wen0Var) {
        this.a = (byte) 21;
        this.c = lzn0Var;
        this.d = z710Var;
        this.e = wen0Var;
        j2i j2iVar = jni.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = new rey0(new o8x(this, (byte) 20));
        this.f = n3o1.q(this).a(jq00.b, jq00.c);
    }

    public tm(paj0 paj0Var, pu40 pu40Var, gw70 gw70Var, byte b) {
        this.a = (byte) 25;
        this.c = paj0Var;
        this.d = pu40Var;
        this.e = gw70Var;
        this.f = new eih1();
        this.g = new rey0(new mp20(this, (byte) 19));
        j2i j2iVar = new j2i(1842138524, new zq30(this, (byte) 8), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(gw70 gw70Var, xfx xfxVar, lzn0 lzn0Var, xf60 xf60Var, ssf1 ssf1Var, ytp0 ytp0Var) {
        this.a = (byte) 27;
        this.e = gw70Var;
        this.c = xfxVar;
        this.d = lzn0Var;
        this.f = xf60Var;
        this.g = ssf1Var;
        this.b = ytp0Var;
    }

    public tm(yjq yjqVar, n7u n7uVar) {
        this.a = (byte) 19;
        this.c = yjqVar;
        this.d = n7uVar;
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.e = bpb1VarB;
        this.f = x3p1.m(new x010(new fu20(rqt0.u(new pzs((pzs) yjqVar.f, yjqVar, (byte) 7)), new oy3(this, (lnm) null, (byte) 5), (byte) 1), bpb1VarB, new ce2(3, (lnm) null, (byte) 14), (byte) 1), a9o.h, v30.Q0, (o8n) null, new nit(this, (byte) 6), 8);
        this.g = n3o1.q(this).a(v0t.X0, v0t.Y0);
        j2i j2iVar = new j2i(626864592, new ent(this, (byte) 3), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(f1n0 f1n0Var, String str, sb7 sb7Var) {
        this.a = (byte) 14;
        this.c = f1n0Var;
        this.d = str;
        this.e = sb7Var;
        this.f = k1o1.u(new r20(this, (lnm) null, (byte) 14));
        j2i j2iVar = ifi.b;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
        this.g = n3o1.r(this).c(ngl.h, ngl.i);
    }

    public tm(ft30 ft30Var, lls0 lls0Var, oi oiVar) {
        this.a = (byte) 17;
        this.c = ft30Var;
        this.d = lls0Var;
        this.e = oiVar;
        this.f = z0o1.j(new vwr(this, (byte) 0), new i4o(this, (byte) 14), new vwr(this, (byte) 1), 4);
        this.g = n3o1.r(this).c(zho.b1, zho.c1);
        j2i j2iVar = gmi.a;
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(nm1 nm1Var, oms omsVar, pms pmsVar) {
        this.a = (byte) 18;
        this.c = nm1Var;
        this.d = omsVar;
        this.e = pmsVar;
        this.f = x3p1.n(new gms(this, (byte) 0), mls.N0, szr.P0, (o8n) null, new gms(this, (byte) 1), 8);
        this.g = n3o1.q(this).a(njs.h, njs.i);
        j2i j2iVar = new j2i(-125310152, new i6r(this, (byte) 17), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(lzn0 lzn0Var, gw70 gw70Var, itd itdVar) {
        this.a = (byte) 10;
        this.c = lzn0Var;
        this.e = gw70Var;
        this.d = itdVar;
        this.g = new rey0(new gaa(this, (byte) 29));
        this.f = new i7h1(new ftd(this, (byte) 0), new ftd(this, (byte) 1));
        j2i j2iVar = new j2i(1860453743, new gtd(this, (byte) 0), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public tm(tbr0 tbr0Var) {
        this.a = (byte) 22;
        this.c = tbr0Var;
        this.d = new df41(zs10.W0, wo10.t);
        this.e = new df41(zs10.X0, wo10.X);
        this.g = new rey0(new o8x(this, (byte) 26));
        this.f = n3o1.q(this).a(jq00.Z0, new kds(this, (byte) 10));
        j2i j2iVar = new j2i(765892815, new m04(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
