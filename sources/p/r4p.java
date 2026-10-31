package p;

import android.content.Context;
import android.content.pm.PackageManager;
import android.hardware.usb.UsbAccessory;
import android.hardware.usb.UsbManager;
import androidx.car.app.k;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class r4p {
    public final Object A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;
    public final Object f;
    public final Object g;
    public final Object h;
    public final Object i;
    public final Object j;
    public final Object k;
    public final Object l;
    public final Object m;
    public final Object n;
    public final Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final Object f56p;
    public final Object q;
    public final Object r;
    public final Object s;
    public final Object t;
    public final Object u;
    public final Object v;
    public final Object w;
    public final Object x;
    public final Object y;
    public final Object z;

    public r4p(daq daqVar, e0q e0qVar) {
        this.b = daqVar;
        this.c = new w0q(daqVar, this, 3);
        this.a = xqu.b(new w0q(daqVar, this, 2));
        this.d = new g5t();
        this.e = new w0q(daqVar, this, 4);
        this.f = xqu.b(new w0q(daqVar, this, 5));
        g5t.a((g5t) this.d, xqu.b(new w0q(daqVar, this, 1)));
        this.g = xqu.b(new w0q(daqVar, this, 6));
        this.h = new w0q(daqVar, this, 7);
        this.i = new w0q(daqVar, this, 10);
        this.j = new w0q(daqVar, this, 11);
        this.k = new w0q(daqVar, this, 12);
        this.l = new w0q(daqVar, this, 9);
        this.m = xqu.b(new w0q(daqVar, this, 15));
        this.n = xqu.b(new w0q(daqVar, this, 17));
        this.o = xqu.b(new w0q(daqVar, this, 16));
        this.f56p = xqu.b(new w0q(daqVar, this, 14));
        this.q = xqu.b(new w0q(daqVar, this, 18));
        this.r = new w0q(daqVar, this, 13);
        this.s = iy81.a(new w0q(daqVar, this, 19));
        this.t = new w0q(daqVar, this, 21);
        this.u = new w0q(daqVar, this, 20);
        this.v = iy81.a(new w0q(daqVar, this, 22));
        this.w = new w0q(daqVar, this, 23);
        this.x = new w0q(daqVar, this, 24);
        this.y = new w0q(daqVar, this, 25);
        this.z = xqu.b(new w0q(daqVar, this, 27));
        this.A = iy81.a(new w0q(daqVar, this, 26));
        this.B = new w0q(daqVar, this, 28);
        this.C = xqu.b(new w0q(daqVar, this, 8));
        this.D = xqu.b(new w0q(daqVar, this, 0));
    }

    public gg11 A() {
        h380 h380VarB = j380.b(7);
        Object obj = this.c;
        h380VarB.e(avc.class, new pax(xqu.a((w0q) obj), h(), (byte) 0));
        l2a l2aVar = new l2a(xqu.a((w0q) obj), (byte) 7);
        xqu.a((w0q) obj);
        h380VarB.e(bvc.class, new fg10(l2aVar, h(), (byte) 0));
        l2a l2aVar2 = new l2a(xqu.a((w0q) obj), (byte) 7);
        daq daqVar = (daq) this.b;
        h380VarB.e(cvc.class, new b750(l2aVar2, (aai0) daqVar.D9.get(), F(), h()));
        h380VarB.e(dvc.class, F());
        h380VarB.e(evc.class, new pax(xqu.a((w0q) obj), h(), (byte) 1));
        h380VarB.e(fvc.class, new cx21(xqu.a((w0q) obj), h()));
        h380VarB.e(gvc.class, new p2i1((aai0) daqVar.D9.get(), F(), h()));
        return h380VarB.b(true);
    }

    public gg11 B() {
        Object obj = this.c;
        return j380.j(kwc.class, new owc(xqu.a((w0q) obj), (byte) 0), lwc.class, new a7t0(), mwc.class, new owc(new cx21(xqu.a((w0q) obj), h()), (byte) 1));
    }

    public zb91 C() {
        return new zb91((d6b1) ((daq) this.b).Uf.get());
    }

    public ae5 D() {
        return new ae5((t2j0) ((daq) this.b).f2.get());
    }

    public l4p0 E() {
        ro30 ro30Var = new ro30(m(), g(), (byte) 26);
        daq daqVar = (daq) this.b;
        return new l4p0(ro30Var, (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get(), (qmu) ((jly0) this.f56p).get(), (qzn0) ((g5t) this.d).get(), i(), (Context) daqVar.x1.a, (npd) ((jly0) this.n).get(), b(), (t290) ((jly0) this.q).get());
    }

    public fg10 F() {
        Object obj = this.c;
        l2a l2aVar = new l2a(xqu.a((w0q) obj), (byte) 7);
        xqu.a((w0q) obj);
        return new fg10(l2aVar, h(), (byte) 1);
    }

    public l0x0 G() {
        return new l0x0((fln0) ((w0q) this.i).get(), (kzp0) ((w0q) this.j).get(), (jln0) ((w0q) this.k).get(), (byte) 8);
    }

    public haz0 H() {
        ro30 ro30Var = new ro30(m(), g(), (byte) 26);
        dh30 dh30VarT = t();
        qzn0 qzn0Var = (qzn0) ((g5t) this.d).get();
        daq daqVar = (daq) this.b;
        return new haz0(ro30Var, dh30VarT, qzn0Var, (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get(), s(), new wam0((byte) 9));
    }

    public vhd I() {
        return new vhd(q(), i());
    }

    public jhd1 J() {
        vx40 vx40VarU = u();
        qzn0 qzn0Var = (qzn0) ((g5t) this.d).get();
        dh30 dh30VarT = t();
        daq daqVar = (daq) this.b;
        return new jhd1(vx40VarU, qzn0Var, dh30VarT, (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get(), new myq0((zle1) daqVar.a3.get()), i());
    }

    public q881 K() {
        return new q881((k) ((w0q) this.c).get(), (byte) 20);
    }

    public t64 a() {
        return new t64((g510) ((daq) this.b).L5.get(), o());
    }

    public ow3 b() {
        return new ow3((c9c0) ((daq) this.b).Ed.get());
    }

    public kr60 c() {
        return new kr60((y241) ((daq) this.b).Mo.get(), (byte) 13);
    }

    public x6o0 d() {
        return new x6o0((f77) ((daq) this.b).Po.get());
    }

    public l84 e() {
        return new l84(true, (luk) ((daq) this.b).L1.get());
    }

    public jc9 f() {
        return new jc9((xuc) ((jly0) this.n).get(), (byte) 9);
    }

    public ae5 g() {
        return new ae5((t2j0) ((daq) this.b).f2.get());
    }

    public lvc h() {
        return new lvc((t2j0) ((daq) this.b).f2.get());
    }

    public l7m0 i() {
        return new l7m0(new k84(true, true, false, false, false, false, false, false, true, false, false, false, true, false, false, false, (luk) ((daq) this.b).L1.get()), (byte) 9);
    }

    public mwn0 j() {
        b6h1 b6h1Var = (b6h1) ((qtq) ((daq) this.b).F4.get()).t.get();
        c8o.m(b6h1Var);
        mwn0 mwn0Var = (mwn0) b6h1Var.a(rj41.c);
        c8o.m(mwn0Var);
        return mwn0Var;
    }

    public i8h1 k() {
        i8h1 i8h1Var = (i8h1) ((b6h1) ((qtq) ((daq) this.b).F4.get()).Y.get()).a(rj41.c);
        c8o.m(i8h1Var);
        return i8h1Var;
    }

    public cce l() {
        return new cce(q(), i(), new l7m0(new i6b((k) ((w0q) this.c).get()), (byte) 11), (byte) 28);
    }

    public goq m() {
        daq daqVar = (daq) this.b;
        i710 i710Var = (i710) ((ghp) daqVar.qa.get()).A0.get();
        c8o.m(i710Var);
        a710 a710Var = (a710) daqVar.ui.get();
        Flowable flowable = (Flowable) daqVar.D5.get();
        bnj0 bnj0Var = new bnj0(((k) ((w0q) this.c).get()).getResources(), g7y.y(new hv4(false, false, false, (luk) daqVar.L1.get()), (fza1) daqVar.Df.get(), new jxa((byte) 2), (yqg) daqVar.J1.get()), (byte) 10);
        r8q r8qVar = (r8q) daqVar.Oo.get();
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        return new goq(i710Var, a710Var, flowable, bnj0Var, new dg8(new ye90(r8qVar.a.a.M1(), yon1.A3(), (byte) 1), (byte) 5), new fgr(), (dxz0) daqVar.I4.get(), (Scheduler) daqVar.A2.get());
    }

    public b6y n() {
        return new b6y((t2j0) ((daq) this.b).f2.get());
    }

    public m210 o() {
        String str;
        String str2;
        Object obj = ((daq) this.b).x1.a;
        Context context = (Context) obj;
        Context context2 = (Context) obj;
        UsbManager usbManager = (UsbManager) context.getSystemService(UsbManager.class);
        UsbAccessory[] accessoryList = usbManager != null ? usbManager.getAccessoryList() : null;
        if (accessoryList != null && accessoryList.length != 0) {
            int length = accessoryList.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    str = "bluetooth_or_usb";
                    break;
                }
                UsbAccessory usbAccessory = accessoryList[i];
                if (u890.j(usbAccessory.getModel(), "Android Open Automotive Protocol") || u890.j(usbAccessory.getModel(), "Android Auto")) {
                    str = "usb";
                    break;
                }
                i++;
            }
        } else {
            str = "wireless";
        }
        String str3 = str;
        try {
            str2 = context2.getPackageManager().getPackageInfo("com.google.android.projection.gearhead", 0).versionName;
            if (str2 == null) {
                str2 = "unknown";
            }
        } catch (PackageManager.NameNotFoundException unused) {
            str2 = "not_installed";
        }
        return new m210(1238, "android_auto", (String) null, (String) null, str3, "car", (String) null, (String) null, str2, "car_app_library", (String) null);
    }

    public md10 p() {
        daq daqVar = (daq) this.b;
        return new md10(new z8c0((y490) daqVar.Qf.get()), (qzn0) ((g5t) this.d).get(), (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get());
    }

    public t7y q() {
        return new t7y(r(), i(), (byte) 18);
    }

    public fna r() {
        return new fna((k) ((w0q) this.c).get(), (byte) 5);
    }

    public ro30 s() {
        daq daqVar = (daq) this.b;
        return new ro30(new g23((c9c0) daqVar.Ed.get(), (i5a1) ((w0q) this.t).get(), (up90) daqVar.Oj.get(), (byte) 13), g(), (byte) 25);
    }

    public dh30 t() {
        daq daqVar = (daq) this.b;
        a710 a710Var = (a710) daqVar.ui.get();
        h610 h610Var = (h610) ((ghp) daqVar.qa.get()).l0.get();
        c8o.m(h610Var);
        return new dh30(new tjq(new tow(a710Var, h610Var, o()), new ppw((a710) daqVar.ui.get()), new row((a710) daqVar.ui.get()), new fpw((a710) daqVar.ui.get()), new qmr((a710) daqVar.ui.get(), (byte) 24)), g(), (byte) 27);
    }

    public vx40 u() {
        daq daqVar = (daq) this.b;
        return new vx40(new dxy(tk00.a((ghp) daqVar.qa.get()), new zeu((agc0) daqVar.B7.get(), (upp0) daqVar.I9.get(), new fgr(), i()), o(), (mr20) daqVar.u5.get(), new mlw0((six0) daqVar.ca.get(), (byte) 4), q(), (byte) 2), g(), (byte) 20);
    }

    public ex80 v() {
        qmu qmuVar = (qmu) ((jly0) this.f56p).get();
        qzn0 qzn0Var = (qzn0) ((g5t) this.d).get();
        daq daqVar = (daq) this.b;
        return new ex80(qmuVar, qzn0Var, (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get());
    }

    public vz90 w() {
        daq daqVar = (daq) this.b;
        return new vz90((q8n) daqVar.V2.get(), (q8n) daqVar.r2.get(), s());
    }

    public k2a0 x() {
        ro30 ro30VarS = s();
        qzn0 qzn0Var = (qzn0) ((g5t) this.d).get();
        daq daqVar = (daq) this.b;
        return new k2a0(new c2a0(ro30VarS, qzn0Var, new q881((up90) daqVar.Oj.get(), (byte) 7), (q8n) daqVar.r2.get(), m()), (q8n) daqVar.V2.get(), (q8n) daqVar.r2.get());
    }

    public ek2 y() {
        return new ek2(j(), (byte) 11);
    }

    public gg11 z() {
        Object obj = this.c;
        pax paxVar = new pax(xqu.a((w0q) obj), h(), (byte) 0);
        l2a l2aVar = new l2a(xqu.a((w0q) obj), (byte) 7);
        xqu.a((w0q) obj);
        return j380.k(avc.class, paxVar, bvc.class, new fg10(l2aVar, h(), (byte) 0), cvc.class, new b750(new l2a(xqu.a((w0q) obj), (byte) 7), (aai0) ((daq) this.b).D9.get(), F(), h()), dvc.class, F(), evc.class, new pax(xqu.a((w0q) obj), h(), (byte) 1));
    }

    public r4p(ose oseVar, sse sseVar) {
        this.b = oseVar;
        byte b = 15;
        this.c = new b2p(this, 0, b);
        this.d = new b2p(this, 1, b);
        this.e = new b2p(this, 3, b);
        this.f = new b2p(this, 5, b);
        this.g = new b2p(this, 6, b);
        this.h = new b2p(this, 7, b);
        this.i = new b2p(this, 8, b);
        this.j = new b2p(this, 9, b);
        this.k = new b2p(this, 10, b);
        this.l = new b2p(this, 11, b);
        this.m = new b2p(this, 12, b);
        new b2p(this, 13, b);
        this.n = new b2p(this, 14, b);
        new b2p(this, b, b);
        this.o = new b2p(this, 16, b);
        this.f56p = new b2p(this, 17, b);
        this.q = new b2p(this, 18, b);
        this.r = new b2p(this, 19, b);
        this.s = new b2p(this, 20, b);
        this.t = new b2p(this, 21, b);
        new b2p(this, 22, b);
        this.u = new b2p(this, 23, b);
        this.v = new b2p(this, 4, b);
        this.w = new b2p(this, 2, b);
        this.x = new b2p(this, 26, b);
        this.y = new b2p(this, 25, b);
        this.z = new b2p(this, 24, b);
        this.A = new b2p(this, 29, b);
        this.B = new b2p(this, 28, b);
        this.C = new b2p(this, 27, b);
        this.a = iy81.a(new b2p(this, 30, b));
        this.D = new b2p(this, 31, b);
    }

    public r4p(d0r d0rVar, xrc0 xrc0Var, uu00 uu00Var, woa woaVar, kma kmaVar, yqg yqgVar, gm31 gm31Var, em31 em31Var, q8n q8nVar, q8n q8nVar2, gw70 gw70Var, ruz ruzVar, zxa zxaVar, Context context, ggv ggvVar, luk lukVar, wh41 wh41Var, dc31 dc31Var, ewn0 ewn0Var, bbb1 bbb1Var, g871 g871Var, lag1 lag1Var, u8v u8vVar, RetrofitMaker retrofitMaker, qns0 qns0Var, oj3 oj3Var, rzo rzoVar, ycm ycmVar, aas aasVar, n1k n1kVar) {
        this.b = d0rVar;
        this.c = xrc0Var;
        this.d = uu00Var;
        this.e = woaVar;
        this.f = kmaVar;
        this.g = yqgVar;
        this.h = gm31Var;
        this.i = em31Var;
        this.j = q8nVar;
        this.k = q8nVar2;
        this.l = gw70Var;
        this.m = ruzVar;
        this.n = zxaVar;
        this.o = context;
        this.f56p = ggvVar;
        this.q = lukVar;
        this.r = wh41Var;
        this.s = dc31Var;
        this.t = ewn0Var;
        this.u = bbb1Var;
        this.v = g871Var;
        this.w = lag1Var;
        this.x = u8vVar;
        this.y = retrofitMaker;
        this.z = qns0Var;
        this.A = oj3Var;
        this.B = rzoVar;
        this.C = ycmVar;
        this.D = aasVar;
        this.a = n1kVar;
    }
}
