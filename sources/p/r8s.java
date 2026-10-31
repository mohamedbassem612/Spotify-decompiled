package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import io.reactivex.rxjava3.core.Flowable;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r8s implements xpw {
    public final Object N0;
    public final Object X;
    public final Object Y;
    public final Object Z;
    public final /* synthetic */ byte a;
    public final psw b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object t;

    public r8s(av0 av0Var, fza1 fza1Var, lzn0 lzn0Var, pxc pxcVar, ao0 ao0Var, n0b1 n0b1Var, n0b1 n0b1Var2, Flowable flowable, zo51 zo51Var, ur00 ur00Var, zob1 zob1Var) {
        this.a = (byte) 4;
        this.c = av0Var;
        this.d = fza1Var;
        this.e = lzn0Var;
        this.f = pxcVar;
        this.g = ao0Var;
        this.h = n0b1Var;
        this.i = n0b1Var2;
        this.t = ur00Var;
        this.X = zob1Var;
        vbm[] vbmVarArr = q601.a;
        this.Y = hu20.e(new x010(zo51Var, rqt0.u(new h801(new kge(flowable), (byte) 15)), f0b1.h, (byte) 1), new af01((lnm) null, this, (byte) 28));
        this.Z = x3p1.n(new e0b1(this, (byte) 0), qva1.Z0, new wh91(this, (byte) 15), (o8n) null, new e0b1(this, (byte) 1), 8);
        this.N0 = n3o1.q(this).a(vva1.f, vva1.g);
        j2i j2iVar = new j2i(-403107623, new u491(this, (byte) 19), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        switch (this.a) {
            case 0:
                return (eih1) this.N0;
            case 1:
                return (ia00) this.N0;
            case 2:
                return (ia00) this.N0;
            case 3:
                return new ghz(this, (byte) 14);
            default:
                return (ia00) this.N0;
        }
    }

    public final jsw c() {
        switch (this.a) {
            case 0:
                break;
            case 1:
                break;
            case 2:
                break;
            case 3:
                break;
        }
        return this.b;
    }

    public e0s0 e(d0s0 d0s0Var) {
        String str = d0s0Var.a;
        String str2 = d0s0Var.b;
        boolean z = d0s0Var.c;
        Context context = (Context) this.c;
        return new e0s0(str, str2, z, context.getString(2131956943, str2), d0s0Var.c ? new cd90(p7h.M(new String[]{context.getString(2131956944), context.getString(2131956945)})) : new cd90(p7h.M(new String[]{context.getString(2131956946), context.getString(2131956944)})), "https://support.spotify.com/us/article/jam/", d0s0Var.d, false, false);
    }

    public final mqw getBehavior() {
        switch (this.a) {
            case 0:
                return (e7m0) this.Z;
            case 1:
                return (js20) this.Z;
            case 2:
                return (js20) this.Z;
            case 3:
                return (rey0) this.N0;
            default:
                return (js20) this.Z;
        }
    }

    public r8s(Context context, z710 z710Var, pkp pkpVar, los losVar, b7b b7bVar, r630 r630Var, lzn0 lzn0Var, xvo xvoVar, sbl0 sbl0Var) {
        this.a = (byte) 2;
        this.c = context;
        this.d = z710Var;
        this.e = pkpVar;
        this.f = losVar;
        this.g = b7bVar;
        this.h = r630Var;
        this.i = lzn0Var;
        this.t = sbl0Var;
        this.X = gio1.b(Boolean.FALSE);
        this.Y = rqt0.u(yoi1.g(xvoVar.a(true)));
        this.Z = x3p1.n(new f0s0(this, (byte) 0), new f0s0(this, (byte) 1), new nso0(this, (byte) 21), (o8n) null, new f0s0(this, (byte) 2), 8);
        this.N0 = n3o1.q(this).a(new x3o0(this, (byte) 18), jgq0.d1);
        j2i j2iVar = new j2i(-276530590, new t9r0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public r8s(xe01 xe01Var, esv0 esv0Var, esv0 esv0Var2, gw70 gw70Var, woa woaVar, kma kmaVar, yxk0 yxk0Var, m4c m4cVar, pe peVar, ov20 ov20Var, ywp ywpVar, ywp ywpVar2) {
        this.a = (byte) 3;
        this.d = xe01Var;
        this.e = esv0Var;
        this.f = esv0Var2;
        this.c = gw70Var;
        this.g = woaVar;
        this.h = kmaVar;
        this.i = yxk0Var;
        this.t = peVar;
        this.X = ov20Var;
        this.Y = ywpVar;
        this.Z = ywpVar2;
        this.N0 = k1o1.p();
        j2i j2iVar = new j2i(1489218186, new qsu0(this, (byte) 4), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public r8s(kgp kgpVar, lbp lbpVar, jxa jxaVar, l0x0 l0x0Var, d0r d0rVar, ggx0 ggx0Var, kko kkoVar, ohi0 ohi0Var, qhi0 qhi0Var, cgi0 cgi0Var, Function0 function0, hs00 hs00Var, zox0 zox0Var, apx0 apx0Var, y6w0 y6w0Var, p731 p731Var) {
        this.a = (byte) 1;
        this.c = kgpVar;
        this.d = d0rVar;
        this.e = ggx0Var;
        this.f = kkoVar;
        this.g = ohi0Var;
        this.h = qhi0Var;
        this.i = hs00Var;
        this.t = y6w0Var;
        this.X = p731Var;
        this.Y = new ioj0();
        this.Z = pro1.r(this, new z6h0(this, (byte) 20), new z8i0(this, (byte) 8), zox0Var, apx0Var);
        this.N0 = n3o1.q(this).a(h40.X0, new bii0(l0x0Var, (byte) 1));
        j2i j2iVar = new j2i(-1115767524, new hef0(function0, jxaVar, cgi0.a(cgi0Var, ohi0Var.a), lbpVar, new j2i(-570639128, new y3i0(this, (byte) 3), true), (byte) 1), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }

    public r8s(gw70 gw70Var, q8n q8nVar, paj0 paj0Var, aqw aqwVar, aqw aqwVar2, aqw aqwVar3, String str, String str2, String str3, String str4) {
        this.a = (byte) 0;
        this.c = gw70Var;
        this.d = q8nVar;
        this.e = paj0Var;
        this.f = aqwVar;
        this.g = aqwVar2;
        this.h = aqwVar3;
        this.i = str;
        this.t = str2;
        this.X = str3;
        this.Y = str4;
        this.Z = sbl.z(new jfj0((MessageResponseToken) null, false, true, w7x.a), t2m.g, new ku1(this, (byte) 9), szr.d, new m4r(this, (byte) 26));
        this.N0 = new eih1();
        j2i j2iVar = new j2i(419740953, new i6r(this, (byte) 10), true);
        ien0 ien0Var = qsw.a;
        this.b = new psw(j2iVar, (byte) 0);
    }
}
