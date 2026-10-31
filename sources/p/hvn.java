package p;

import android.app.Application;
import android.view.ViewGroup;
import com.spotify.mobius.Connectable;
import com.spotify.nowplaying.scroll.ScrollCardType;
import io.reactivex.rxjava3.core.Flowable;
import java.util.Calendar;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hvn implements sve0 {
    public final /* synthetic */ h2c1 a;
    public final /* synthetic */ h2c1 b;
    public final /* synthetic */ vp11 c;
    public final /* synthetic */ kvn d;
    public final /* synthetic */ cp11 e;
    public final /* synthetic */ iac0 f;
    public final /* synthetic */ fvn g;
    public final /* synthetic */ l8h1 h;
    public final /* synthetic */ d0r i;

    public hvn(h2c1 h2c1Var, vp11 vp11Var, kvn kvnVar, cp11 cp11Var, iac0 iac0Var, fvn fvnVar, l8h1 l8h1Var, d0r d0rVar) {
        this.b = h2c1Var;
        this.c = vp11Var;
        this.d = kvnVar;
        this.e = cp11Var;
        this.f = iac0Var;
        this.g = fvnVar;
        this.h = l8h1Var;
        this.i = d0rVar;
        this.a = h2c1Var;
    }

    @Override // p.sve0
    public final void a(Class cls, Class cls2, Class cls3, Object obj, nve0 nve0Var) {
        this.a.a(cls, cls2, cls3, obj, nve0Var);
    }

    @Override // p.sve0
    public final void b(Class cls, Connectable connectable) {
        this.a.b(cls, connectable);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x01fe  */
    /* JADX WARN: Code duplicated, block: B:18:0x0209  */
    /* JADX WARN: Code duplicated, block: B:21:0x021a  */
    /* JADX WARN: Code duplicated, block: B:22:0x0223  */
    /* JADX WARN: Code duplicated, block: B:30:0x026f  */
    /* JADX WARN: Code duplicated, block: B:39:0x02ed  */
    /* JADX WARN: Code duplicated, block: B:41:0x02f6  */
    /* JADX WARN: Code duplicated, block: B:48:0x0307  */
    /* JADX WARN: Code duplicated, block: B:54:0x03b5  */
    /* JADX WARN: Code duplicated, block: B:56:0x03bb  */
    /* JADX WARN: Code duplicated, block: B:57:0x03bd  */
    /* JADX WARN: Code duplicated, block: B:59:0x03c3  */
    /* JADX WARN: Code duplicated, block: B:60:0x03c5  */
    /* JADX WARN: Code duplicated, block: B:65:0x02da A[EXC_TOP_SPLITTER, SYNTHETIC] */
    public final fsl c() {
        mmr0 m231Var;
        fai0 fai0VarF;
        vx50 vx50Var;
        ymd0 ymd0Var;
        iu30 iu30Var;
        ymd0 ymd0Var2;
        iu30 iu30Var2;
        mr20 huzVar;
        mmr0 m231Var2;
        lmm pwnVar;
        boolean z;
        boolean z2;
        wch eq80Var;
        wch h3h1Var;
        wch wchVar;
        wch wchVar2;
        mr20 mr20Var;
        h2c1 h2c1Var = this.b;
        sck1 sck1Var = h2c1Var.a;
        hce1 hce1Var = new hce1(sck1Var.o(), new t2c1(o7h.l1(h2c1Var.c), h2c1Var.d, h2c1Var.b), n9p1.s(sck1Var));
        tka0 tka0VarB = rc11.a.b(w2c1.class);
        String strO = tka0VarB.o();
        if (strO == null) {
            hhg1.n("Local and anonymous classes can not be ViewModels");
            return null;
        }
        w2c1 w2c1Var = (y1c1) hce1Var.t("androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(strO), tka0VarB);
        vp11 vp11Var = this.c;
        n6r0 n6r0Var = vp11Var.h;
        kvn kvnVar = this.d;
        Application application = kvnVar.a;
        String strPath = n6r0Var.path();
        fvn fvnVar = this.g;
        ioc iocVar = fvnVar.c;
        boolean z3 = kvnVar.B;
        up11 up11Var = vp11Var.g;
        cp11 cp11Var = this.e;
        String str = cp11Var.a;
        kpc kpcVar = new kpc(up11Var, str, w2c1Var, this.f, strPath, new w3l0(strPath, str), application.getResources(), kvnVar.x, kvnVar.j, iocVar, z3, kvnVar.I, kvnVar.J);
        ((vu30) vp11Var.f.d).invoke(kpcVar, w2c1Var);
        fpc fpcVar = new fpc(kpcVar, (byte) 0);
        d0r d0rVar = this.i;
        jto jtoVarI = new ham(new ssm(d0rVar, fvnVar, kvnVar, (byte) 6), fpcVar, (byte) 17).i();
        iac0 iac0Var = this.f;
        x8c0 lifecycle = iac0Var.getLifecycle();
        lifecycle.a(new zh0(new l1k(0, jtoVarI, jto.class, "dispose", "dispose()V", 0, (byte) 17), lifecycle, (byte) 4));
        yuw yuwVar = kvnVar.b;
        fhv0 fhv0Var = kvnVar.c;
        vfs vfsVar = kvnVar.d;
        a4v0 a4v0Var = kvnVar.e;
        gw70 gw70Var = kvnVar.f;
        xfx xfxVar = kvnVar.g;
        jus jusVar = kvnVar.h;
        yqg yqgVar = kvnVar.i;
        lzn0 lzn0Var = kvnVar.j;
        wf4 wf4Var = kvnVar.K;
        Flowable flowable = kvnVar.k;
        quc0 quc0Var = kvnVar.r;
        af10 af10Var = kvnVar.s;
        w6e0 w6e0Var = kvnVar.t;
        xmu0 xmu0Var = kvnVar.y;
        ioc iocVar2 = fvnVar.c;
        boolean z4 = kvnVar.B;
        opv0 opv0Var = kvnVar.C;
        o241 o241Var = kvnVar.D;
        dvp dvpVar = kvnVar.E;
        fcq fcqVar = kvnVar.F;
        boolean z5 = kvnVar.G;
        mr20 mr20Var2 = fvnVar.l;
        application.getClass();
        l8h1 l8h1Var = this.h;
        l8h1Var.getClass();
        i8h1 i8h1Var = l8h1Var.a;
        yuwVar.getClass();
        fhv0Var.getClass();
        vfsVar.getClass();
        a4v0Var.getClass();
        gw70Var.getClass();
        d0rVar.getClass();
        xfxVar.getClass();
        jusVar.getClass();
        yqgVar.getClass();
        lzn0Var.getClass();
        flowable.getClass();
        quc0Var.getClass();
        af10Var.getClass();
        iocVar2.getClass();
        opv0Var.getClass();
        o241Var.getClass();
        dvpVar.getClass();
        fcqVar.getClass();
        i7d i7dVar = new i7d(iac0Var, l8h1Var, w2c1Var, d0rVar, xfxVar, jusVar, yqgVar, lzn0Var, jtoVarI, cp11Var, vp11Var, wf4Var, quc0Var, af10Var, w6e0Var, xmu0Var, Boolean.valueOf(z4), opv0Var, dvpVar, fcqVar, Boolean.valueOf(z5), mr20Var2);
        w3l0 w3l0VarH = i7dVar.h();
        l0x0 l0x0Var = new l0x0(new ofx(xfxVar.a, (byte) 5), i7dVar.h(), lzn0Var, (byte) 22);
        w3l0 w3l0VarH2 = i7dVar.h();
        rt01 rt01Var = new rt01(lzn0Var, i7dVar.h());
        my50 my50Var = vp11Var.a;
        String str2 = cp11Var.a;
        if (z4) {
            try {
                m231Var = w2c1Var.V(whx0.class);
            } catch (Throwable th) {
                m231Var = new m231(th);
            }
            if (!(m231Var instanceof m231)) {
                mmr0 mmr0VarV = w2c1Var.V(whx0.class);
                fai0VarF = wgo1.F((ymd0) mmr0VarV.a, mmr0VarV.b);
            }
            vx50Var = my50Var.h;
            if (vx50Var != null) {
                ymd0Var = (ymd0) vx50Var.a.invoke(w2c1Var);
            } else {
                ymd0Var = null;
            }
            rl1 rl1Var = new rl1(str2, ymd0Var, fai0VarF, z4, (byte) 8);
            iu30Var = my50Var.f;
            if (iu30Var != null) {
                ymd0Var2 = (ymd0) iu30Var.invoke(w2c1Var);
            } else {
                ymd0Var2 = null;
            }
            qmj0 qmj0Var = new qmj0(f6o1.A(new kls0((lzn0) xmu0Var.b, (o241) xmu0Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new qbk((xe01) w6e0Var.c, cp11Var, (byte) 19));
            c1v0 c1v0Var = new c1v0(opv0Var.b(str2, (ymd0) null), (byte) 7);
            iu30Var2 = my50Var.f12p;
            if (iu30Var2 != null || (mr20Var = (mr20) iu30Var2.invoke(w2c1Var)) == null) {
                huzVar = new huz(Boolean.FALSE, (byte) 10);
            } else {
                huzVar = mr20Var;
            }
            dx0 dx0Var = new dx0(rl1Var, ymd0Var2, qmj0Var, c1v0Var, huzVar);
            af10 af10Var2 = (af10) i7dVar.g;
            jo80 jo80Var = (jo80) i7dVar.O0;
            jo80 jo80Var2 = (jo80) i7dVar.P0;
            c8o.m(i8h1Var);
            x4o x4oVar = new x4o(af10Var2, lzn0Var, new d5o(), new eyh0(jo80Var, jo80Var2, i8h1Var, (byte) 28), d0rVar);
            w6e0 w6e0Var2 = new w6e0(xmu0Var, opv0Var, new ofx(((xfx) i7dVar.c).a, (byte) 5), (yqg) i7dVar.h, (byte) 28);
            wf4 wf4Var2 = (wf4) i7dVar.i;
            r6h1 r6h1VarB = w3l0VarH2.b();
            Calendar calendar = Calendar.getInstance();
            if (z4) {
                try {
                    m231Var2 = w2c1Var.V(whx0.class);
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                if (m231Var2 instanceof m231) {
                    z = false;
                    pwnVar = lmm.S0;
                } else {
                    z = false;
                    pwnVar = new pwn(w2c1Var, iac0Var, (byte) 0);
                }
            } else {
                z = false;
                pwnVar = lmm.S0;
            }
            lmm lmmVar = pwnVar;
            if (!vp11Var.k || wf4Var2.a()) {
                z2 = true;
            } else {
                z2 = z;
            }
            qp11 qp11Var = new qp11(vp11Var, l0x0Var, xmu0Var, rt01Var, dx0Var, w2c1Var, iac0Var, d0rVar, r6h1VarB, x4oVar, calendar, lmmVar, z4, w6e0Var2, z2);
            asn asnVar = new asn(lzn0Var, i8h1Var, i7dVar.h());
            vp11 vp11Var2 = (vp11) i7dVar.b;
            nwn nwnVar = new nwn(new c21(xfxVar, qp11Var, asnVar, vp11Var2, (iac0) i7dVar.e, (y1c1) i7dVar.d, (quc0) i7dVar.t, (d0r) i7dVar.f, (jus) i7dVar.X, (byte) 12), cp11Var);
            qwn qwnVar = new qwn(vp11Var2, (jto) i7dVar.Y, i7dVar.h());
            hoc hocVar = (hoc) ((jly0) i7dVar.Q0).get();
            mr20 mr20Var3 = (mr20) i7dVar.N0;
            String str3 = cp11Var.a;
            eq80Var = new eq80(new e3h1(l8h1Var.b, l8h1Var.c, i8h1Var));
            h3h1Var = new h3h1(new fnn(w3l0VarH, (byte) 4));
            wchVar = q6x.b;
            if (!eq80Var.equals(wchVar) && h3h1Var.equals(wchVar)) {
                wchVar2 = wchVar;
            } else if (eq80Var.equals(wchVar)) {
                wchVar2 = h3h1Var;
            } else if (h3h1Var.equals(wchVar)) {
                wchVar2 = eq80Var;
            } else {
                wchVar = new wch(eq80Var, h3h1Var);
                wchVar2 = wchVar;
            }
            return new fsl(str3, wchVar2, nwnVar, qwnVar, hocVar, mr20Var3, (byte) 1);
        }
        rt01Var = rt01Var;
        fai0VarF = null;
        vx50Var = my50Var.h;
        if (vx50Var != null) {
            ymd0Var = (ymd0) vx50Var.a.invoke(w2c1Var);
        } else {
            ymd0Var = null;
        }
        rl1 rl1Var2 = new rl1(str2, ymd0Var, fai0VarF, z4, (byte) 8);
        iu30Var = my50Var.f;
        if (iu30Var != null) {
            ymd0Var2 = (ymd0) iu30Var.invoke(w2c1Var);
        } else {
            ymd0Var2 = null;
        }
        qmj0 qmj0Var2 = new qmj0(f6o1.A(new kls0((lzn0) xmu0Var.b, (o241) xmu0Var.c), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3), new qbk((xe01) w6e0Var.c, cp11Var, (byte) 19));
        c1v0 c1v0Var2 = new c1v0(opv0Var.b(str2, (ymd0) null), (byte) 7);
        iu30Var2 = my50Var.f12p;
        if (iu30Var2 != null) {
            huzVar = new huz(Boolean.FALSE, (byte) 10);
        } else {
            huzVar = new huz(Boolean.FALSE, (byte) 10);
        }
        dx0 dx0Var2 = new dx0(rl1Var2, ymd0Var2, qmj0Var2, c1v0Var2, huzVar);
        af10 af10Var3 = (af10) i7dVar.g;
        jo80 jo80Var3 = (jo80) i7dVar.O0;
        jo80 jo80Var4 = (jo80) i7dVar.P0;
        c8o.m(i8h1Var);
        x4o x4oVar2 = new x4o(af10Var3, lzn0Var, new d5o(), new eyh0(jo80Var3, jo80Var4, i8h1Var, (byte) 28), d0rVar);
        w6e0 w6e0Var3 = new w6e0(xmu0Var, opv0Var, new ofx(((xfx) i7dVar.c).a, (byte) 5), (yqg) i7dVar.h, (byte) 28);
        wf4 wf4Var3 = (wf4) i7dVar.i;
        r6h1 r6h1VarB2 = w3l0VarH2.b();
        Calendar calendar2 = Calendar.getInstance();
        if (z4) {
            m231Var2 = w2c1Var.V(whx0.class);
            if (m231Var2 instanceof m231) {
                z = false;
                pwnVar = new pwn(w2c1Var, iac0Var, (byte) 0);
            } else {
                z = false;
                pwnVar = lmm.S0;
            }
        } else {
            z = false;
            pwnVar = lmm.S0;
        }
        lmm lmmVar2 = pwnVar;
        if (vp11Var.k) {
            z2 = true;
        } else {
            z2 = true;
        }
        qp11 qp11Var2 = new qp11(vp11Var, l0x0Var, xmu0Var, rt01Var, dx0Var2, w2c1Var, iac0Var, d0rVar, r6h1VarB2, x4oVar2, calendar2, lmmVar2, z4, w6e0Var3, z2);
        asn asnVar2 = new asn(lzn0Var, i8h1Var, i7dVar.h());
        vp11 vp11Var3 = (vp11) i7dVar.b;
        nwn nwnVar2 = new nwn(new c21(xfxVar, qp11Var2, asnVar2, vp11Var3, (iac0) i7dVar.e, (y1c1) i7dVar.d, (quc0) i7dVar.t, (d0r) i7dVar.f, (jus) i7dVar.X, (byte) 12), cp11Var);
        qwn qwnVar2 = new qwn(vp11Var3, (jto) i7dVar.Y, i7dVar.h());
        hoc hocVar2 = (hoc) ((jly0) i7dVar.Q0).get();
        mr20 mr20Var4 = (mr20) i7dVar.N0;
        String str4 = cp11Var.a;
        eq80Var = new eq80(new e3h1(l8h1Var.b, l8h1Var.c, i8h1Var));
        h3h1Var = new h3h1(new fnn(w3l0VarH, (byte) 4));
        wchVar = q6x.b;
        if (!eq80Var.equals(wchVar)) {
            if (eq80Var.equals(wchVar)) {
                wchVar2 = h3h1Var;
            } else if (h3h1Var.equals(wchVar)) {
                wchVar2 = eq80Var;
            } else {
                wchVar = new wch(eq80Var, h3h1Var);
                wchVar2 = wchVar;
            }
        } else if (eq80Var.equals(wchVar)) {
            wchVar2 = h3h1Var;
        } else if (h3h1Var.equals(wchVar)) {
            wchVar2 = eq80Var;
        } else {
            wchVar = new wch(eq80Var, h3h1Var);
            wchVar2 = wchVar;
        }
        return new fsl(str4, wchVar2, nwnVar2, qwnVar2, hocVar2, mr20Var4, (byte) 1);
    }
}
