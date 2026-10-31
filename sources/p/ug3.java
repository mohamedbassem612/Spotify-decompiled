package p;

import android.app.Activity;
import android.content.Context;
import android.view.ViewGroup;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Iterator;
import java.util.Map;
import java.util.Optional;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ug3 implements wpw {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final mqw f;
    public final rqw g;
    public final rsw h;

    public ug3(epb1 epb1Var, kly0 kly0Var, u0i u0iVar, lzn0 lzn0Var, vgm vgmVar, boolean z, gw70 gw70Var) {
        this.a = (byte) 7;
        this.b = kly0Var;
        this.c = gw70Var;
        this.e = new idd1(new jzm(u0iVar, lzn0Var, vgmVar, this, (byte) 21));
        this.d = f6o1.A(new c491(), new ViewGroup.LayoutParams(-2, -2), (ScrollCardType) null, 2);
        this.f = c2p1.o(new av70(epb1Var, (byte) 0), new z691(this, (byte) 15), (iu30) null, 12);
        this.g = z ? new eih1() : n3o1.q(this).a(oe60.P0, new kds(this, (byte) 16));
        this.h = new osw(new gk90((zu30) new bt70(this, (byte) 2), (iu30) vu70.X));
    }

    public static vga1 f(ega1 ega1Var) {
        u3x0 u3x0Var;
        tga1 tga1Var;
        cga1 cga1Var = ega1Var.c;
        int iOrdinal = ega1Var.b.ordinal();
        if (iOrdinal == 0) {
            u3x0Var = r3x0.Q0;
        } else if (iOrdinal == 1) {
            u3x0Var = i2x0.N0;
        } else {
            if (iOrdinal != 2) {
                eg.o();
                return null;
            }
            u3x0Var = u3x0.Q0;
        }
        u3x0 u3x0Var2 = u3x0Var;
        cga1 cga1Var2 = ega1Var.a;
        if (u890.j(cga1Var2, yfa1.a) || u890.j(cga1Var2, aga1.a)) {
            tga1Var = b4x0.P0;
        } else if (cga1Var2 instanceof cga1) {
            tga1Var = new tga1(cga1Var2.b);
        } else if (u890.j(cga1Var2, bga1.a)) {
            tga1Var = c4x0.Q0;
        } else {
            if (!u890.j(cga1Var2, zfa1.a)) {
                eg.o();
                return null;
            }
            tga1Var = a4x0.P0;
        }
        return new vga1(tga1Var, u3x0Var2, false, cga1Var, 4);
    }

    public static bb20 g(sga1 sga1Var) {
        if (u890.j(sga1Var, r3x0.Q0)) {
            return bb20.a;
        }
        if (u890.j(sga1Var, i2x0.N0)) {
            return bb20.b;
        }
        if (u890.j(sga1Var, u3x0.Q0)) {
            return bb20.c;
        }
        eg.o();
        return null;
    }

    public static yga1 h(vga1 vga1Var) {
        eia1 eia1VarI = i(vga1Var.a);
        bb20 bb20VarG = g(vga1Var.b);
        cga1 cga1Var = vga1Var.d;
        return new yga1(eia1VarI, bb20VarG, cga1Var != null ? new bia1(cga1Var.b) : null);
    }

    public static eia1 i(uga1 uga1Var) {
        if (uga1Var instanceof tga1) {
            return new bia1(((tga1) uga1Var).a);
        }
        if (u890.j(uga1Var, b4x0.P0)) {
            return aia1.b;
        }
        if (u890.j(uga1Var, c4x0.Q0)) {
            return aia1.c;
        }
        if (u890.j(uga1Var, a4x0.P0)) {
            return aia1.a;
        }
        eg.o();
        return null;
    }

    public final rqw a() {
        byte b = this.a;
        ia00 ia00Var = this.g;
        switch (b) {
            case 0:
                return ia00Var;
            case 1:
                return (eih1) ia00Var;
            case 2:
                return ia00Var;
            case 3:
                return ia00Var;
            case 4:
                return (ghz) ia00Var;
            case 5:
                return ia00Var;
            case 6:
                return (eih1) ia00Var;
            case 7:
                return ia00Var;
            case 8:
                return (eih1) ia00Var;
            case 9:
                return ia00Var;
            case 10:
                return ia00Var;
            case 11:
                return ia00Var;
            case 12:
                return ia00Var;
            case 13:
                return ia00Var;
            default:
                return ia00Var;
        }
    }

    public final rsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
            case 4:
                break;
            case 5:
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                break;
            case 11:
                break;
            case 12:
                break;
            case 13:
                break;
        }
        return this.h;
    }

    public String e(lp20 lp20Var) {
        Object next;
        Iterator it = lp20Var.b.f.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            int i = ((s7t0) next).a;
            Integer num = (Integer) ((op20) this.e).b.e();
            if (num != null && i == num.intValue()) {
                break;
            }
        }
        s7t0 s7t0Var = (s7t0) next;
        if (s7t0Var != null) {
            return s7t0Var.c;
        }
        return null;
    }

    public final mqw getBehavior() {
        byte b = this.a;
        poy0 poy0Var = this.f;
        switch (b) {
            case 0:
                return (js20) poy0Var;
            case 1:
                return (rey0) poy0Var;
            case 2:
                return poy0Var;
            case 3:
                return (rey0) poy0Var;
            case 4:
                return (rey0) poy0Var;
            case 5:
                return (rey0) poy0Var;
            case 6:
                return (rey0) poy0Var;
            case 7:
                return poy0Var;
            case 8:
                return (ljm0) poy0Var;
            case 9:
                return (rey0) poy0Var;
            case 10:
                return poy0Var;
            case 11:
                return (rey0) poy0Var;
            case 12:
                return (js20) poy0Var;
            case 13:
                return (e7m0) poy0Var;
            default:
                return poy0Var;
        }
    }

    public ug3(dgx dgxVar, gis gisVar, gis gisVar2, gis gisVar3) {
        this.a = (byte) 11;
        this.b = dgxVar;
        this.c = gisVar;
        this.d = gisVar2;
        this.e = gisVar3;
        this.f = new rey0(new dvt0(this, (byte) 17));
        this.g = n3o1.q(this).a(nzv0.U0, nzv0.V0);
        this.h = lnn1.h(k1x0.T0, k1x0.U0, new mwv0(this, (byte) 21));
    }

    public ug3(iac0 iac0Var, n9c n9cVar, lal1 lal1Var, lal1 lal1Var2) {
        this.a = (byte) 1;
        this.b = iac0Var;
        this.c = n9cVar;
        this.d = lal1Var;
        this.e = lal1Var2;
        this.f = ila0.D();
        this.g = new eih1();
        this.h = jch0.j(new hp9(this, (byte) 15));
    }

    public ug3(iac0 iac0Var, yfu yfuVar, sjf1 sjf1Var, Function0 function0) {
        this.a = (byte) 6;
        this.b = iac0Var;
        this.c = yfuVar;
        this.d = sjf1Var;
        this.e = function0;
        this.f = ila0.D();
        this.g = new eih1();
        this.h = jch0.j(new wx00(this, (byte) 26));
    }

    public ug3(sfx sfxVar, urk0 urk0Var, Activity activity, iu30 iu30Var) {
        this.a = (byte) 5;
        this.b = sfxVar;
        this.c = urk0Var;
        this.d = activity;
        this.e = iu30Var;
        this.g = n3o1.q(this).a(new wx00(this, (byte) 25), oe60.g);
        this.f = new rey0(new gn50(this, (byte) 17));
        this.h = lnn1.h(hh60.e, hh60.f, new zi50(this, (byte) 17));
    }

    public ug3(Context context, lzn0 lzn0Var, xfx xfxVar, q8n q8nVar, opv0 opv0Var) {
        this.a = (byte) 0;
        this.b = context;
        this.c = lzn0Var;
        this.d = opv0Var;
        this.e = new idd1(ou1.R0);
        byte b = 1;
        this.f = a4p1.h(new sg3(this, (byte) 0), we3.T0, p83.Y0, q8nVar, new sg3(this, b));
        this.g = n3o1.q(this).a(k63.P0, new v72(this, (byte) 8));
        this.h = lnn1.h(new sg3(this, (byte) 2), we3.U0, new m73(xfxVar, b));
    }

    public ug3(egx egxVar, Context context, lzn0 lzn0Var, ymd0 ymd0Var) {
        this.a = (byte) 14;
        this.d = egxVar;
        this.b = context;
        this.c = lzn0Var;
        this.e = ymd0Var;
        this.f = c2p1.o(new lif1(this, (byte) 0), ggf1.c, new lif1(this, (byte) 1), 4);
        this.g = n3o1.q(this).a(kle1.T0, kle1.U0);
        this.h = lnn1.h(new lif1(this, (byte) 2), udf1.Y, new lif1(this, (byte) 3));
    }

    public ug3(hp20 hp20Var, yxk0 yxk0Var, rwp rwpVar, op20 op20Var) {
        this.a = (byte) 4;
        this.b = hp20Var;
        this.c = yxk0Var;
        this.d = rwpVar;
        this.e = op20Var;
        this.f = new rey0(new mp20(this, (byte) 0));
        this.g = new ghz(this, (byte) 2);
        this.h = jch0.j(new wx00(this, (byte) 9));
    }

    public ug3(fwo fwoVar, tm tmVar, c491 c491Var, Context context, zob1 zob1Var) {
        this.a = (byte) 12;
        this.c = fwoVar;
        this.d = tmVar;
        this.e = c491Var;
        this.b = context;
        ziz0 ziz0Var = new ziz0(this, (byte) 25);
        fns fnsVar = igu.a;
        this.f = new js20(new z5d(zob1Var, (byte) 7), new ccb1(ziz0Var, zob1Var, (byte) 7), ziz0Var, new qtr(), false, fnsVar, true);
        this.g = n3o1.q(this).a(ok11.X, ok11.Y);
        this.h = jch0.j(new g001(this, (byte) 21));
    }

    public ug3(Flowable flowable, d0r d0rVar, xrn0 xrn0Var, qzh qzhVar) {
        this.a = (byte) 2;
        this.b = d0rVar;
        this.c = xrn0Var;
        this.d = qzhVar;
        z4m z4mVar = z4m.e1;
        this.e = w3p1.o(new l4r(hjx0.a, 2, rbm.c, new j4r(z4mVar), rbm.d), rbm.b);
        vbm[] vbmVarArr = q601.a;
        this.f = y3o1.Y(yoi1.h(hu20.e(new kge(flowable), new b7c((lnm) null, (Object) this, (byte) 15)), o6x.a), z4m.d1, u2m.f, new qbm(this, (byte) 0), 8);
        this.h = lnn1.h(rbm.e, rbm.f, new qbm(this, (byte) 1));
        this.g = n3o1.q(this).a(ngl.Z0, ngl.a1);
    }

    public ug3(urk0 urk0Var, em0 em0Var, ysr0 ysr0Var, iu30 iu30Var) {
        this.a = (byte) 3;
        this.b = urk0Var;
        this.c = em0Var;
        this.d = ysr0Var;
        this.e = iu30Var;
        this.f = ila0.D();
        this.g = n3o1.q(this).a(new ebo(this, (byte) 0), cnn.Y0);
        this.h = jch0.j(new ebo(this, (byte) 1));
    }

    public ug3(fai0 fai0Var, fpc fpcVar, String str, String str2) {
        this.a = (byte) 13;
        this.b = fai0Var;
        this.c = fpcVar;
        this.d = str;
        this.e = str2;
        this.f = sbl.z(new vga1(null, null, false, null, 15), new wam0(this, (byte) 18), new eaz0(this, (byte) 6), h9a1.S0, new dr91(this, (byte) 20));
        this.g = n3o1.q(this).a(new wga1(this, (byte) 0), new aaq0((Object) this, (byte) 29));
        this.h = jch0.j(new wga1(this, (byte) 1));
    }

    public ug3(dgx dgxVar, String str, gis gisVar, gis gisVar2) {
        this.a = (byte) 9;
        this.b = dgxVar;
        this.c = str;
        this.d = gisVar;
        this.e = gisVar2;
        this.f = new rey0(new qsn0(this, (byte) 26));
        this.g = n3o1.q(this).a(new x3o0(this, (byte) 12), jgq0.d);
        this.h = lnn1.h(rfq0.d, rfq0.e, new cnp0(this, (byte) 22));
    }

    public ug3(mhg0 mhg0Var, Map map, wpw wpwVar, w6e0 w6e0Var) {
        this.a = (byte) 8;
        this.b = map;
        this.c = wpwVar;
        this.d = w6e0Var;
        this.e = new tlj0(map, mhg0Var);
        this.f = h7w.C(new r7j0(this, (byte) 5), new nlj0(this, (byte) 0));
        this.g = new eih1();
        this.h = jch0.j(new nlj0(this, (byte) 1));
    }

    public ug3(a1r0 a1r0Var, gw70 gw70Var, Optional optional, epb1 epb1Var) {
        this.a = (byte) 10;
        this.b = a1r0Var;
        this.c = gw70Var;
        this.d = optional;
        this.e = epb1Var;
        this.f = c2p1.o(new emr0(this, (byte) 0), w0q0.P0, new emr0(this, (byte) 1), 4);
        this.g = n3o1.q(this).a(jgq0.Y, jgq0.Z);
        this.h = f6o1.j((ViewGroup.LayoutParams) null, new j2i(1044310445, new t9r0(this, (byte) 1), true), 5);
    }
}
