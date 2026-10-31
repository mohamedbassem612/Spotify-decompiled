package p;

import android.app.NotificationManager;
import android.content.Context;
import android.os.Handler;
import com.comscore.android.util.AndroidTcfDataLoader;
import com.spotify.accessory.categorizer.BluetoothCategorizer;
import com.spotify.connect.devicessortingimpl.data.DevicePickerSortingDatabase;
import com.spotify.connect.esperanto.proto.ConnectMessages$StateResponse;
import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.cosmos.rxrouter.RxRouter;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class a8p implements jly0 {
    public final b8p a;
    public final short b;

    /* JADX WARN: Multi-variable type inference failed */
    public a8p(b8p b8pVar, int i) {
        this.a = b8pVar;
        this.b = i;
    }

    public final Object get() {
        g0u g0uVar;
        short s = this.b;
        int i = s / 100;
        b8p b8pVar = this.a;
        if (i != 0) {
            if (i != 1) {
                jah.e(s);
                return null;
            }
            switch (s) {
                case 100:
                    return new flr((p7s) b8pVar.Z.get(), b8pVar.a.f(), (ilr) b8pVar.P0.get(), (g0l) b8pVar.s.get());
                case 101:
                    return new j0u0((dfs) b8pVar.u0.get());
                case 102:
                    return new flp0(b8pVar.d1, (xcs) b8pVar.c1.get(), (Scheduler) b8pVar.l.get(), (apr) b8pVar.a0.get());
                case 103:
                    return new wkp0((g0l) b8pVar.s.get(), (zzp0) b8pVar.w.get(), (dxz0) b8pVar.a.C.get(), (zor) b8pVar.m.get(), (zcs) b8pVar.a1.get(), (Scheduler) b8pVar.f11p.get(), (clp0) b8pVar.b1.get(), (xcs) b8pVar.c1.get(), (Flowable) b8pVar.w0.get(), (c9c0) b8pVar.E.get());
                case 104:
                    return new zcs();
                case 105:
                    k3l k3lVar = b8pVar.a;
                    return new ycs(k3lVar.a(), (NotificationManager) k3lVar.c.get(), (dto0) k3lVar.Y.get(), (String) k3lVar.F.get());
                case 106:
                    return new xcs(xqu.a(b8pVar.I));
                case 107:
                    return new wcs((Observable) b8pVar.a.n.get(), new na((mw7) b8pVar.a.m.get()));
                case 108:
                    return new vhb1(b8pVar.s, b8pVar.v, b8pVar.j0, b8pVar.w, (g3e) b8pVar.O.get(), b8pVar.a.d());
                case 109:
                    dfs dfsVar = (dfs) b8pVar.u0.get();
                    boa1 boa1Var = new boa1();
                    boa1Var.a = true;
                    dfsVar.b.add(boa1Var);
                    return boa1Var;
                case 110:
                    return new spr(xqu.a(b8pVar.j1), xqu.a(b8pVar.w0), xqu.a(b8pVar.k1), xqu.a(b8pVar.d), xqu.a(b8pVar.l1), xqu.a(b8pVar.m1));
                case 111:
                    return new wpr(xqu.a(b8pVar.i1), (q8n) b8pVar.a.i.get());
                case 112:
                    return (qor) b8pVar.V.get();
                case 113:
                    return (qor) b8pVar.V.get();
                case 114:
                    return (l6h1) b8pVar.a.Z.get();
                case 115:
                    return (wnr) b8pVar.a.b0.get();
                case 116:
                    return new pvh0(b8pVar.a.a(), qvh0.q(xqu.a(b8pVar.p1), xqu.a(b8pVar.q1), xqu.a(b8pVar.r1)), j9g0.n(xqu.a(b8pVar.p1), (y7p) b8pVar.u1.get(), (z7p) b8pVar.v1.get(), (g0l) b8pVar.s.get(), (l7s) b8pVar.j0.get(), (y7l) b8pVar.o1.get(), (ilr) b8pVar.P0.get(), b8pVar.a.d()), hl20.k(b8pVar.I), (l7s) b8pVar.j0.get(), (e4l) b8pVar.w1.get(), (jts) b8pVar.x1.get(), (ilr) b8pVar.P0.get());
                case 117:
                    return new xa80((y7l) b8pVar.o1.get(), (l7s) b8pVar.j0.get());
                case 118:
                    return new y7l((g0l) b8pVar.s.get(), (ark1) b8pVar.K.get(), (m0s) b8pVar.m0.get());
                case 119:
                    return new i3e((p7s) b8pVar.Z.get(), (l7s) b8pVar.j0.get(), new ekb((byte) 6), (m0s) b8pVar.m0.get());
                case 120:
                    return new wa6((itz) b8pVar.i0.get(), (y7l) b8pVar.o1.get(), b8pVar.a.d());
                case 121:
                    return new y7p(this);
                case 122:
                    return new lpr(b8pVar.a.e(), new ekb((byte) 6), b8pVar.a.f());
                case 123:
                    return new fwr((p7s) b8pVar.Z.get(), (l7s) b8pVar.j0.get(), (y7l) b8pVar.o1.get(), b8pVar.a.f(), new ekb((byte) 6));
                case 124:
                    return new z7p(this);
                case 125:
                    return new e4l((ajg) b8pVar.a.D.get(), (knr) b8pVar.v.get(), (iur) b8pVar.G.get());
                case 126:
                    return new jts((g3e) b8pVar.O.get(), hl20.k(b8pVar.I), (l7s) b8pVar.j0.get(), new ekb((byte) 6), (g0l) b8pVar.s.get());
                case 127:
                    return new f2l((j0u) b8pVar.z1.get());
                case 128:
                    Context contextA = b8pVar.a.a();
                    j0u j0uVar = new j0u();
                    if (wpb1.z(contextA.getPackageManager())) {
                        g0uVar = g0u.b;
                    } else {
                        Pattern pattern = j0u.b;
                        if (mka.b() || mka.a(contextA)) {
                            g0uVar = g0u.h;
                        } else {
                            g0uVar = xoi1.b(contextA) ? g0u.c : g0u.d;
                        }
                    }
                    j0uVar.a = g0uVar;
                    return j0uVar;
                case 129:
                    return mid.B(xqu.a(b8pVar.O), new a0m(xqu.a(b8pVar.I), (byte) 12));
                case 130:
                    return new lkx0((dfs) b8pVar.u0.get());
                case 131:
                    return new d89((dfs) b8pVar.u0.get());
                case 132:
                    return new qig((g0l) b8pVar.s.get(), new li9(b8pVar.a.b()));
                case 133:
                    return new i4s0((rs31) b8pVar.u.get());
                default:
                    jah.e(s);
                    return null;
            }
        }
        switch (s) {
            case 0:
                return new inr(b8pVar.c, b8pVar.f, b8pVar.m, b8pVar.n, b8pVar.o, b8pVar.l, b8pVar.f11p, b8pVar.r, b8pVar.a.c());
            case 1:
                k3l k3lVar2 = b8pVar.a;
                return new c3l(j1l.j((CallbackRouter) k3lVar2.G.get()), (q8n) k3lVar2.j.get(), (nfa0) k3lVar2.I.get());
            case 2:
                return new sor((jde0) b8pVar.e.get(), (y2l) b8pVar.c.get(), hl20.t(b8pVar.I), b8pVar.a.c());
            case 3:
                return new jde0((dma1) b8pVar.a.M.get(), new uq8(new xid((i8h1) b8pVar.d.get(), new l2a((byte) 20), (byte) 28), (byte) 19));
            case 4:
                return (i8h1) b8pVar.a.O.get();
            case 5:
                return new zor((y2l) b8pVar.c.get(), new hwb((byte) 6), (lur) b8pVar.k.get(), (Scheduler) b8pVar.l.get(), b8pVar.a.c());
            case 6:
                return new lur(b8pVar.g, b8pVar.h, (mur) b8pVar.j.get(), new h94(), (Scheduler) b8pVar.a.g.get());
            case 7:
                return brt.r((Context) b8pVar.a.b.get());
            case 8:
                return brt.p((DevicePickerSortingDatabase) b8pVar.g.get());
            case 9:
                return new mur((o6s) b8pVar.i.get());
            case 10:
                return new o6s((sor) b8pVar.f.get());
            case 11:
                return (Scheduler) b8pVar.a.e.get();
            case 12:
                return new mnr((Scheduler) b8pVar.l.get());
            case 13:
                return (ezt) b8pVar.a.P.get();
            case 14:
                return (Scheduler) b8pVar.a.f.get();
            case 15:
                return new lk(b8pVar.q, b8pVar.a.c());
            case 16:
                return (ck) b8pVar.a.l.get();
            case 17:
                a8p a8pVar = b8pVar.f11p;
                k3l k3lVar3 = b8pVar.a;
                return new knr((Scheduler) a8pVar.get(), (Scheduler) b8pVar.l.get(), (agr) b8pVar.t.get(), new rtz(ulk1.f((RxRouter) k3lVar3.H.get())), xqu.a(b8pVar.u), (ufe0) k3lVar3.A.get());
            case 18:
                return new agr((Observable) b8pVar.a.E.get());
            case 19:
                return (rs31) b8pVar.a.r.get();
            case 20:
                return npp0.f((Observable) b8pVar.a.E.get());
            case 21:
                a8p a8pVar2 = b8pVar.I;
                return new sfr(b8pVar.a(), b8pVar.a.c());
            case 22:
                return new onr((mw7) b8pVar.a.m.get());
            case 23:
                return new bor((Observable) b8pVar.a.o.get());
            case 24:
                return new n6s();
            case 25:
                return new ftk1((g0l) b8pVar.s.get(), (d6b1) b8pVar.a.S.get(), (u7p) b8pVar.L.get(), (euk1) b8pVar.M.get(), (Scheduler) b8pVar.l.get(), (g3e) b8pVar.O.get());
            case 26:
                return new u7p(this);
            case 27:
                return new w7l((zsk1) b8pVar.D.get(), (q900) b8pVar.B.get());
            case 28:
                return new zsk1(xqu.a(b8pVar.J));
            case 29:
                jly0 jly0Var = b8pVar.B;
                k3l k3lVar4 = b8pVar.a;
                q900 q900Var = (q900) jly0Var.get();
                agr agrVar = (agr) b8pVar.t.get();
                g0l g0lVar = (g0l) b8pVar.s.get();
                onr onrVar = (onr) b8pVar.y.get();
                l6s l6sVar = new l6s(k3lVar4.a(), (Handler) k3lVar4.w.get());
                Scheduler scheduler = (Scheduler) b8pVar.f11p.get();
                cpr cprVar = new cpr(k3lVar4.b());
                bih1 bih1Var = new bih1(ulk1.g((RxRouter) k3lVar4.H.get()), (Scheduler) b8pVar.l.get(), (byte) 14);
                c3s c3sVar = (c3s) b8pVar.C.get();
                Scheduler scheduler2 = (Scheduler) b8pVar.l.get();
                x6m0 x6m0Var = (x6m0) b8pVar.F.get();
                jks jksVarE = k3lVar4.e();
                k3lVar4.c();
                return new jzs(q900Var, agrVar, g0lVar, onrVar, l6sVar, scheduler, cprVar, bih1Var, c3sVar, scheduler2, x6m0Var, jksVarE, (iur) b8pVar.G.get(), (fpr) b8pVar.H.get(), hl20.n(b8pVar.I), hl20.A(b8pVar.I));
            case 30:
                return ulk1.p((Scheduler) b8pVar.l.get());
            case 31:
                return new c3s((g0l) b8pVar.s.get(), (n6s) b8pVar.A.get(), (Scheduler) b8pVar.f11p.get(), hl20.C(b8pVar.I));
            case 32:
                return new x6m0((g0l) b8pVar.s.get(), (zsk1) b8pVar.D.get(), b8pVar.E);
            case 33:
                return (c9c0) b8pVar.a.Q.get();
            case 34:
                return new iur();
            case 35:
                return new fpr(xqu.a(b8pVar.C), xqu.a(b8pVar.G), hl20.A(b8pVar.I), b8pVar.a.d());
            case 36:
                return new p3l(false, false, false, false, false, l3l.CAST_BASIC_WITH_GOOGLE_OUTPUT_SWITCHER, false, true, 5, false, false, false, false, false, false, false, false, false, false, false, m3l.b, false, false, false, false, false, false, 30, false, false, false, false, false, n3l.GOS, false, false, 0, false, false, false, o3l.ICON_3D, false, 3000, false, false, false, (luk) b8pVar.a.R.get());
            case 37:
                return new euk1((ark1) b8pVar.K.get(), (Scheduler) b8pVar.l.get());
            case 38:
                return new iuq0(b8pVar.N);
            case 39:
                return hl20.v(b8pVar.I);
            case 40:
                return new bhe0((zsk1) b8pVar.D.get(), (q900) b8pVar.B.get());
            case 41:
                return new i8h0((zsk1) b8pVar.D.get(), (q900) b8pVar.B.get());
            case 42:
                return new vk50((zsk1) b8pVar.D.get(), (q900) b8pVar.B.get());
            case 43:
                return (qor) b8pVar.V.get();
            case 44:
                a8p a8pVar3 = b8pVar.T;
                k3l k3lVar5 = b8pVar.a;
                return new qor(xqu.a(a8pVar3), b8pVar.U, new mwb(k3lVar5.b()), (oqs) b8pVar.B0.get(), k3lVar5.c());
            case 45:
                return (e4j0) b8pVar.a.T.get();
            case ConnectMessages$StateResponse.Device.IS_AUTHENTICATED_WITH_CURRENT_USER_FIELD_NUMBER /* 46 */:
                return new p40((byte) 4);
            case ConnectMessages$StateResponse.Device.SUPPORTS_ZEPHYR_FIELD_NUMBER /* 47 */:
                return new kor(xqu.a(b8pVar.R), (g0l) b8pVar.s.get(), b8pVar.b(), (c3s) b8pVar.C.get());
            case ConnectMessages$StateResponse.Device.SUPPORTS_GAPLESS_FIELD_NUMBER /* 48 */:
                return (qzs) b8pVar.a.W.get();
            case ConnectMessages$StateResponse.Device.SUPPORTS_CROSSFADE_FIELD_NUMBER /* 49 */:
                return (p7s) b8pVar.a.t.get();
            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_EQUALIZER_FIELD_NUMBER /* 50 */:
                return new bwh0(xqu.a(b8pVar.s0));
            case ConnectMessages$StateResponse.Device.LOGICAL_PLAYBACK_IDENTIFIER_FIELD_NUMBER /* 51 */:
                b8pVar.getClass();
                t360 t360Var = new t360(6);
                b8p b8pVar2 = b8pVar.b;
                apr aprVar = (apr) b8pVar2.a0.get();
                j0l j0lVar = (j0l) b8pVar2.g0.get();
                ogr ogrVar = new ogr((tor) b8pVar2.f0.get(), (byte) 1);
                p7s p7sVar = (p7s) b8pVar2.Z.get();
                k3l k3lVar6 = b8pVar2.a;
                t360Var.a(new c3g0(aprVar, j0lVar, new cp31(ogrVar, p7sVar, k3lVar6.f(), (g3e) b8pVar2.O.get(), hl20.k(b8pVar2.I), (itz) b8pVar2.i0.get()), (l7s) b8pVar2.j0.get(), (g3e) b8pVar2.O.get(), k3lVar6.d()));
                t360Var.a(b8pVar2.l0.get());
                t360Var.a(b8pVar2.n0.get());
                t360Var.a(b8pVar2.o0.get());
                t360Var.a(b8pVar2.p0.get());
                t360Var.a(b8pVar2.r0.get());
                return t360Var.d();
            case ConnectMessages$StateResponse.Device.SUPPORTS_REMOTE_NORMALIZATION_FIELD_NUMBER /* 52 */:
                return new apr((o241) b8pVar.a.L.get(), hl20.m(b8pVar.I));
            case 53:
                g0l g0lVar2 = (g0l) b8pVar.s.get();
                c9c0 c9c0Var = (c9c0) b8pVar.E.get();
                qn1 qn1Var = new qn1((v7p) b8pVar.b0.get(), (lur) b8pVar.k.get(), (byte) 1);
                k3l k3lVar7 = b8pVar.a;
                return new j0l(g0lVar2, c9c0Var, qn1Var, new toj0(k3lVar7.a(), (p7s) b8pVar.Z.get(), new ogr((tor) b8pVar.f0.get(), (byte) 1), hl20.z(b8pVar.I), (ufe0) k3lVar7.A.get(), hl20.k(b8pVar.I)));
            case 54:
                return new v7p(this);
            case 55:
                return new tor((clr) b8pVar.e0.get(), (g0l) b8pVar.s.get(), b8pVar.a.c());
            case 56:
                ekb ekbVar = new ekb((byte) 6);
                a8p a8pVar4 = b8pVar.Z;
                k3l k3lVar8 = b8pVar.a;
                return new clr(ekbVar, (p7s) a8pVar4.get(), (ewh0) k3lVar8.u.get(), (qtz) b8pVar.d0.get(), (yqg) k3lVar8.J.get(), (dxz0) k3lVar8.C.get(), k3lVar8.d());
            case 57:
                return new qtz((a4e) b8pVar.c0.get(), (nfa0) b8pVar.a.I.get());
            case 58:
                return mid.w((CallbackRouter) b8pVar.a.G.get());
            case 59:
                return new itz(b8pVar.h0, hl20.k(b8pVar.I), b8pVar.a.d());
            case 60:
                return a06.p((CallbackRouter) b8pVar.a.G.get());
            case 61:
                return new l7s();
            case 62:
                k3l k3lVar9 = b8pVar.a;
                return new f3g0(k3lVar9.a(), (apr) b8pVar.a0.get(), (p7s) b8pVar.Z.get(), k3lVar9.e(), (j0l) b8pVar.g0.get(), new l6s((mwh0) b8pVar.k0.get(), k3lVar9.f(), (g3e) b8pVar.O.get()), k3lVar9.d());
            case 63:
                return (mwh0) b8pVar.a.d.get();
            case 64:
                return new suy0(b8pVar.a.e(), (g0l) b8pVar.s.get(), (zor) b8pVar.m.get(), (m0s) b8pVar.m0.get(), b8pVar.a.d());
            case 65:
                return new m0s((i8h1) b8pVar.d.get());
            case 66:
                return new lu51((p7s) b8pVar.Z.get(), (zor) b8pVar.m.get(), b8pVar.a.d());
            case 67:
                a8p a8pVar5 = b8pVar.Z;
                k3l k3lVar10 = b8pVar.a;
                return new zu51((p7s) a8pVar5.get(), (g0l) b8pVar.s.get(), k3lVar10.e(), k3lVar10.d());
            case 68:
                return new lu51(b8pVar.a.e(), (d5l) b8pVar.q0.get(), b8pVar.a.d());
            case 69:
                return new d5l((g0l) b8pVar.s.get(), (zor) b8pVar.m.get(), (lur) b8pVar.k.get(), (m0s) b8pVar.m0.get());
            case 70:
                return new dfs(gcs0.s());
            case 71:
                k3l k3lVar11 = b8pVar.a;
                return new f8s(k3lVar11.a(), (ut71) k3lVar11.N.get(), (Flowable) k3lVar11.V.get(), (yqg) k3lVar11.J.get(), hl20.u(b8pVar.I));
            case 72:
                return new jvr(xqu.a(b8pVar.z0), (apr) b8pVar.a0.get());
            case 73:
                return new ivr((vou) b8pVar.y0.get(), (mvr) b8pVar.x0.get());
            case 74:
                return new lvr((Observable) b8pVar.a.E.get(), (Flowable) b8pVar.w0.get(), (mvr) b8pVar.x0.get(), (g0l) b8pVar.s.get());
            case 75:
                return (Flowable) b8pVar.a.K.get();
            case 76:
                return new mvr();
            case AndroidTcfDataLoader.COMSCORE_VENDOR_INDEX /* 77 */:
                return new oqs();
            case 78:
                return new stt();
            case 79:
                return new eur();
            case 80:
                return new w7p(this);
            case 81:
                return new e8s((eur) b8pVar.D0.get(), (f8s) b8pVar.v0.get());
            case 82:
                return new x7p(this);
            case 83:
                a8p a8pVar6 = b8pVar.I;
                k3l k3lVar12 = b8pVar.a;
                kly0 kly0Var = k3lVar12.i;
                kly0 kly0Var2 = k3lVar12.z;
                return new hir(hl20.B(a8pVar6), (o7s) k3lVar12.x.get(), (g0l) b8pVar.s.get(), (fuf0) k3lVar12.y.get(), (o4o0) kly0Var2.get(), new mks(k3lVar12.a(), (a84) k3lVar12.f60p.get(), (o4o0) kly0Var2.get(), (BluetoothCategorizer) k3lVar12.q.get(), (q8n) kly0Var.get()), k3lVar12.c(), (q8n) kly0Var.get());
            case 84:
                bih1 bih1Var2 = new bih1(ulk1.g((RxRouter) b8pVar.a.H.get()), (Scheduler) b8pVar.l.get(), (byte) 14);
                return new bpr(bih1Var2, (wqk1) b8pVar.I0.get(), (ifs) b8pVar.J0.get(), (Scheduler) b8pVar.f11p.get(), (x6m0) b8pVar.F.get());
            case 85:
                return new wqk1((yqg) b8pVar.a.J.get());
            case 86:
                return new ifs(ulk1.g((RxRouter) b8pVar.a.H.get()), (wqk1) b8pVar.I0.get());
            case 87:
                return new wtk1(new cpr(b8pVar.a.b()), (Scheduler) b8pVar.f11p.get(), (Scheduler) b8pVar.l.get(), (agr) b8pVar.t.get());
            case 88:
                return new a3e((y2e) b8pVar.X0.get());
            case 89:
                return mid.C(xqu.a(b8pVar.W0), hl20.k(b8pVar.I));
            case 90:
                b8pVar.getClass();
                t360 t360Var2 = new t360(6);
                t360Var2.a(b8pVar.Q0.get());
                t360Var2.a(b8pVar.e0.get());
                t360Var2.a(b8pVar.R0.get());
                t360Var2.a(b8pVar.V0.get());
                t360Var2.a(b8pVar.f0.get());
                t360Var2.a(b8pVar.T0.get());
                return new wkr(t360Var2.d(), (y2g0) b8pVar.a.X.get(), (n0s) b8pVar.O0.get());
            case 91:
                jly0 jly0Var2 = b8pVar.N0;
                k3l k3lVar13 = b8pVar.a;
                return new vkr((elr) jly0Var2.get(), (qtz) b8pVar.d0.get(), (nfa0) k3lVar13.I.get(), k3lVar13.d(), (ilr) b8pVar.P0.get());
            case 92:
                return new elr(b8pVar.a.a(), b8pVar.a.d(), (Executor) b8pVar.M0.get());
            case 93:
                return mid.D((q8n) b8pVar.a.j.get());
            case 94:
                return new ilr(b8pVar.a.b(), xqu.a(b8pVar.O0));
            case 95:
                Context contextA2 = b8pVar.a.a();
                mc40.s();
                Object obj = lz40.d;
                return new n0s(contextA2);
            case 96:
                return new glr((elr) b8pVar.N0.get(), b8pVar.a.d(), hl20.l(b8pVar.I));
            case 97:
                return new i4e((hts) b8pVar.U0.get(), b8pVar.a.d(), (ilr) b8pVar.P0.get());
            case 98:
                return new hts((txs) b8pVar.T0.get(), (glr) b8pVar.R0.get(), (vkr) b8pVar.Q0.get(), (qtz) b8pVar.d0.get(), new hlr(b8pVar.a.b()));
            case 99:
                return new txs(b8pVar.a.e(), (p7s) b8pVar.Z.get(), (qtz) b8pVar.d0.get(), new ekb((byte) 6), (zor) b8pVar.m.get(), (g3e) b8pVar.O.get(), b8pVar.a.d(), (ilr) b8pVar.P0.get(), hl20.x(b8pVar.I), (elr) b8pVar.N0.get(), (glr) b8pVar.R0.get(), (flr) b8pVar.S0.get());
            default:
                jah.e(s);
                return null;
        }
    }
}
