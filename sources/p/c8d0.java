package p;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.media.session.MediaController;
import android.media.session.MediaSession;
import android.os.Bundle;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcelable;
import android.os.RemoteException;
import android.util.SparseArray;
import androidx.car.app.media.IMediaPlaybackHost;
import androidx.car.app.navigation.model.Maneuver;
import androidx.media3.exoplayer.video.b;
import androidx.media3.exoplayer.video.e;
import com.spotify.localfiles.localfilesmonorepo.LocalFilesFeature;
import io.reactivex.rxjava3.functions.Function;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class c8d0 implements yg30, Function, jn20, wlh0, pw60, lvh0, ezh0, e2i0, b2i0, qy70 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ c8d0(pa61 pa61Var) {
        this.a = (byte) 20;
        Bundle bundle = Bundle.EMPTY;
        this.b = pa61Var;
    }

    public void a(rlh0 rlh0Var) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 15:
                xal xalVar = (xal) obj;
                kh70 kh70Var = xalVar.c;
                hi61 hi61Var = rlh0Var.e;
                tkh0 tkh0Var = rlh0Var.a;
                if (rlh0Var.C != null) {
                    oon1.v("Cannot be notified about the connection result many times. Probably a bug or malicious app.");
                    tkh0Var.f1();
                } else {
                    b380 b380Var = xalVar.n;
                    Bundle bundle = xalVar.i;
                    rlh0Var.C = kh70Var;
                    rlh0Var.f128p = xalVar.j;
                    rlh0Var.q = xalVar.d;
                    rlh0Var.v = xalVar.e;
                    m8u0 m8u0Var = xalVar.f;
                    rlh0Var.w = m8u0Var;
                    m8u0 m8u0Var2 = xalVar.g;
                    rlh0Var.x = m8u0Var2;
                    m8u0 m8u0VarC = rlh0Var.c(m8u0Var, m8u0Var2);
                    rlh0Var.y = m8u0VarC;
                    b380 b380Var2 = xalVar.k;
                    rlh0Var.r = b380Var2;
                    b380 b380Var3 = xalVar.l;
                    rlh0Var.s = b380Var3;
                    bg11 bg11VarE = rlh0.E(b380Var3, b380Var2, rlh0Var.v, m8u0VarC, bundle);
                    rlh0Var.t = bg11VarE;
                    rlh0Var.u = rlh0.D(bg11VarE, rlh0Var.r, xalVar.i, rlh0Var.v, rlh0Var.y, xalVar.b);
                    h380 h380Var = new h380(4);
                    for (int i = 0; i < b380Var.size(); i++) {
                        udh udhVar = (udh) b380Var.get(i);
                        pa61 pa61Var = udhVar.a;
                        if (pa61Var != null && pa61Var.a == 0) {
                            h380Var.e(pa61Var.b, udhVar);
                        }
                    }
                    h380Var.b(true);
                    MediaSession.Token token = xalVar.m;
                    if (token == null) {
                        token = hi61Var.a.h;
                    }
                    if (token != null) {
                        rlh0Var.D = new MediaController(rlh0Var.d, token);
                    }
                    try {
                        kh70Var.asBinder().linkToDeath(rlh0Var.g, 0);
                        ki61 ki61Var = hi61Var.a;
                        rlh0Var.n = new hi61(ki61Var.a, xalVar.a, xalVar.b, ki61Var.d, xalVar.c, xalVar.h, token, xalVar.o);
                        rlh0Var.H = bundle;
                        tkh0Var.getClass();
                        dm5.y(Looper.myLooper() == tkh0Var.e.getLooper());
                        dm5.y(!tkh0Var.g);
                        tkh0Var.g = true;
                        xkh0 xkh0Var = tkh0Var.h;
                        xkh0Var.g = true;
                        tkh0 tkh0Var2 = xkh0Var.f;
                        if (tkh0Var2 != null) {
                            xkh0Var.u(tkh0Var2);
                        }
                    } catch (RemoteException unused) {
                        tkh0Var.f1();
                        return;
                    }
                }
                break;
            default:
                xg61 xg61Var = (xg61) obj;
                if (rlh0Var.p() && rlh0Var.k.isEmpty()) {
                    xg61 xg61Var2 = rlh0Var.f128p.c;
                    if (xg61Var2.c < xg61Var.c && bai0.a(xg61Var, xg61Var2)) {
                        rlh0Var.f128p = rlh0Var.f128p.j(xg61Var);
                        break;
                    }
                }
                break;
        }
    }

    public Object apply(Object obj) {
        o3e0 o3e0Var = ((yuf0) this.b).e;
        return ((puf0) ((z8c0) o3e0Var.b).b).a().toObservable().map(new mna0((byte) 25)).onErrorReturn(new mna0((byte) 26)).map((c681) o3e0Var.c).compose((lve1) o3e0Var.d);
    }

    public void b(ffu0 ffu0Var, ixh0 ixh0Var) {
        ((akl) this.b).accept(ffu0Var);
    }

    public void c(mvh0 mvh0Var, gvh0 gvh0Var, Collection collection) {
        evh0 evh0Var;
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 18:
                fvh0 fvh0Var = ((uvh0) obj).i;
                synchronized (fvh0Var.a) {
                    try {
                        u36 it = fvh0Var.c.entrySet().iterator();
                        while (true) {
                            u36 u36Var = it;
                            if (u36Var.hasNext()) {
                                u36Var.next();
                                evh0Var = (evh0) u36Var.getValue();
                                if (evh0Var.b == mvh0Var) {
                                }
                            } else {
                                evh0Var = null;
                            }
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (evh0Var == null) {
                    return;
                }
                evh0Var.b(gvh0Var, collection);
                return;
            default:
                xvh0 xvh0Var = (xvh0) obj;
                SparseArray sparseArray = xvh0Var.f;
                int iIndexOfValue = sparseArray.indexOfValue(mvh0Var);
                if (iIndexOfValue < 0) {
                    Objects.toString(mvh0Var);
                    return;
                }
                int iKeyAt = sparseArray.keyAt(iIndexOfValue);
                ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
                Iterator it2 = collection.iterator();
                while (it2.hasNext()) {
                    kvh0 kvh0Var = (kvh0) it2.next();
                    if (kvh0Var.f == null) {
                        Bundle bundle = new Bundle();
                        kvh0Var.f = bundle;
                        bundle.putBundle("mrDescriptor", kvh0Var.a.a);
                        kvh0Var.f.putInt("selectionState", kvh0Var.b);
                        kvh0Var.f.putBoolean("isUnselectable", kvh0Var.c);
                        kvh0Var.f.putBoolean("isGroupable", kvh0Var.d);
                        kvh0Var.f.putBoolean("isTransferable", kvh0Var.e);
                    }
                    arrayList.add(kvh0Var.f);
                }
                Bundle bundle2 = new Bundle();
                if (gvh0Var != null) {
                    bundle2.putParcelable("groupRoute", gvh0Var.a);
                }
                bundle2.putParcelableArrayList("dynamicRoutes", arrayList);
                zvh0.d(xvh0Var.a, 7, 0, iKeyAt, bundle2, (Bundle) null);
                return;
        }
    }

    public Object d(IInterface iInterface) {
        ((IMediaPlaybackHost) iInterface).registerMediaSessionToken((tcc) this.b);
        return null;
    }

    public void e(ry70 ry70Var) {
        ekj0 ekj0Var = (ekj0) this.b;
        synchronized (ekj0Var.a) {
            ekj0Var.c++;
        }
        ekj0Var.i(ry70Var);
    }

    public void f(zf30 zf30Var) {
        byte b = this.a;
        t700 t700Var = (t700) this.b;
        switch (b) {
            case 4:
                kvd0 kvd0Var = (kvd0) zf30Var;
                lvd0 lvd0Var = (lvd0) t700Var.b.get();
                lvd0Var.getClass();
                kvd0Var.getClass();
                c21 c21Var = new c21(lvd0Var, kvd0Var);
                Context context = (Context) lvd0Var.a.get();
                c8o.l(context);
                gw70 gw70Var = (gw70) lvd0Var.c.get();
                c8o.l(gw70Var);
                c8o.l((im4) lvd0Var.g.get());
                kvd0Var.W1 = new bgx(new vfx(context, gw70Var), (byte) 1);
                xvd0 xvd0Var = (xvd0) ((jly0) c21Var.d).get();
                Resources resources = (Resources) lvd0Var.b.get();
                c8o.l(resources);
                vqv0 vqv0Var = new vqv0(resources, (byte) 24);
                pg0 pg0Var = (pg0) lvd0Var.d.get();
                c8o.l(pg0Var);
                kvd0Var.X1 = new tjq(xvd0Var, vqv0Var, new uq8(pg0Var, (byte) 20), new uy2((blp) c21Var.f, (blp) c21Var.h, (blp) c21Var.i, (blp) c21Var.t));
                kvd0Var.Y1 = new ptf1(new vnd1(new g5l0(), xqu.a((blp) c21Var.e), (byte) 23), new yla((byte) 2), (xvd0) ((jly0) c21Var.d).get());
                break;
            case 10:
                quf0 quf0Var = (quf0) zf30Var;
                ruf0 ruf0Var = (ruf0) t700Var.b.get();
                ruf0Var.getClass();
                quf0Var.getClass();
                em0 em0Var = new em0(ruf0Var, quf0Var);
                quf0Var.G1 = (suf0) ((jly0) em0Var.h).get();
                quf0Var.H1 = (yuf0) ((jly0) em0Var.X).get();
                xvo xvoVar = (xvo) ruf0Var.l.get();
                c8o.l(xvoVar);
                f1n0 f1n0Var = (f1n0) ruf0Var.k.get();
                c8o.l(f1n0Var);
                quf0Var.I1 = new ur00(xvoVar, f1n0Var);
                quf0Var.J1 = ((Boolean) ruf0Var.m.get()).booleanValue();
                break;
            case 12:
                kwf0 kwf0Var = (kwf0) zf30Var;
                lwf0 lwf0Var = (lwf0) t700Var.b.get();
                lwf0Var.getClass();
                kwf0Var.getClass();
                c8o.l((iwe0) lwf0Var.a.get());
                nxf0 nxf0Var = (nxf0) lwf0Var.b.get();
                c8o.l(nxf0Var);
                kwf0Var.G1 = nxf0Var;
                kg0 kg0Var = (kg0) lwf0Var.c.get();
                c8o.l(kg0Var);
                kwf0Var.H1 = kg0Var;
                break;
            default:
                twf0 twf0Var = (twf0) zf30Var;
                uwf0 uwf0Var = (uwf0) t700Var.b.get();
                uwf0Var.getClass();
                twf0Var.getClass();
                tnm tnmVar = new tnm(uwf0Var);
                lde0 lde0Var = (lde0) uwf0Var.c.get();
                c8o.l(lde0Var);
                twf0Var.I1 = lde0Var;
                kly0 kly0Var = uwf0Var.b;
                nxf0 nxf0Var2 = (nxf0) kly0Var.get();
                c8o.l(nxf0Var2);
                twf0Var.J1 = nxf0Var2;
                wwf0 wwf0Var = (wwf0) uwf0Var.a.get();
                c8o.l(wwf0Var);
                drm1 drm1Var = new drm1((byte) 26);
                nxf0 nxf0Var3 = (nxf0) kly0Var.get();
                c8o.l(nxf0Var3);
                twf0Var.K1 = new ywf0(wwf0Var, drm1Var, nxf0Var3);
                c8o.l((kg0) uwf0Var.d.get());
                twf0Var.L1 = (wnh1) ((jly0) tnmVar.d).get();
                twf0Var.M1 = (mir0) ((jly0) tnmVar.e).get();
                twf0Var.N1 = (t8h1) ((jly0) tnmVar.f).get();
                twf0Var.O1 = new bvw();
                twf0Var.P1 = (qhe0) ((jly0) tnmVar.c).get();
                twf0Var.Q1 = (udl0) ((jly0) tnmVar.g).get();
                twf0Var.R1 = (ydl0) ((jly0) tnmVar.h).get();
                mwn0 mwn0Var = (mwn0) uwf0Var.f.get();
                c8o.l(mwn0Var);
                twf0Var.S1 = mwn0Var;
                break;
        }
    }

    @Override // p.jn20
    public void g(float f) {
        b bVar = (b) this.b;
        e eVar = bVar.m2.b;
        if (eVar.f != f) {
            eVar.f = f;
            eVar.c(false);
        }
        bVar.R0(bVar.n1);
    }

    public void h(hxh0 hxh0Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 20:
                Bundle bundle = Bundle.EMPTY;
                hxh0Var.j(i, (pa61) obj);
                break;
            case 21:
                hxh0Var.f(i, (b380) obj);
                break;
            default:
                hxh0Var.h(i, (ke61) obj);
                break;
        }
    }

    public Object i(fzh0 fzh0Var, ixh0 ixh0Var, int i) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 23:
                return ((iqh0) fzh0Var).H(ixh0Var, (iph0) obj);
            case 24:
                f280 f280Var = f280.b;
                b2i0 b2i0Var = (b2i0) obj;
                if (!fzh0Var.p()) {
                    fzh0Var.C();
                    b2i0Var.b(fzh0Var.t, ixh0Var);
                    h2i0.i1(fzh0Var, ixh0Var, i, new ch61(0));
                }
                return f280Var;
            default:
                return fzh0Var.x(ixh0Var, b380.t((yoh0) obj), -1, -9223372036854775807L);
        }
    }

    public Object j(Object obj, Object obj2) {
        byte b = this.a;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                qop qopVar = (qop) obj;
                lbt lbtVar = (lbt) obj2;
                b0q b0qVar = new b0q(((q2q) obj3).a);
                qopVar.getClass();
                lbtVar.getClass();
                return new j1b((aqp) ((jly0) new t7p(b0qVar, qopVar, lbtVar).a).get());
            case 1:
                daq daqVar = ((d0q) obj3).a;
                ((sq21) obj).getClass();
                ((jq21) obj2).getClass();
                xrm1 xrm1Var = (xrm1) daqVar.l7.get();
                c8o.l(xrm1Var);
                return new h8d0(xrm1Var);
            case 2:
                nzp nzpVar = (nzp) obj3;
                qop qopVar2 = (qop) obj;
                ozp ozpVar = new ozp(nzpVar.a, nzpVar.b);
                qopVar2.getClass();
                ((lbt) obj2).getClass();
                return new j1b((ikp) new qjp(ozpVar, qopVar2).c);
            case 3:
                kzp kzpVar = (kzp) obj3;
                bct bctVar = (bct) obj2;
                daq daqVar2 = kzpVar.a;
                teq teqVar = kzpVar.b;
                nzp nzpVar2 = new nzp(daqVar2, teqVar);
                ((qop) obj).getClass();
                bctVar.getClass();
                d3p d3pVar = new d3p(nzpVar2, bctVar);
                Context context = (Context) daqVar2.x1.a;
                c8o.l(context);
                uu00 uu00Var = (uu00) daqVar2.a5.get();
                c8o.l(uu00Var);
                koc0 koc0Var = bctVar.d;
                rl1 rl1Var = new rl1(uu00Var, koc0Var, new y1x0((byte) 29));
                omr omrVar = (omr) teqVar.wg.get();
                c8o.l(omrVar);
                bvs bvsVar = (bvs) teqVar.xg.get();
                c8o.l(bvsVar);
                haa0 haa0Var = new haa0(omrVar, bvsVar, (ikp) d3pVar.b, (byte) 23);
                y1x0 y1x0Var = new y1x0((byte) 29);
                me30 me30Var = (me30) daqVar2.w7.get();
                c8o.l(me30Var);
                return new apd0(context, rl1Var, haa0Var, y1x0Var, me30Var, koc0Var);
            case 5:
                ozp ozpVar2 = (ozp) obj3;
                qop qopVar3 = (qop) obj;
                act actVar = (act) obj2;
                daq daqVar3 = ozpVar2.a;
                teq teqVar2 = ozpVar2.b;
                qopVar3.getClass();
                actVar.getClass();
                Intent intentA = qopVar3.a();
                i8h1 i8h1Var = (i8h1) daqVar3.A5.get();
                c8o.l(i8h1Var);
                yzc0 yzc0Var = actVar.e;
                LocalFilesFeature localFilesFeature = (LocalFilesFeature) teqVar2.Qd.get();
                c8o.l(localFilesFeature);
                xde0 xde0Var = (xde0) teqVar2.Pd.get();
                c8o.l(xde0Var);
                q8n q8nVar = (q8n) daqVar3.E1.get();
                c8o.l(q8nVar);
                return new rde0(intentA, i8h1Var, yzc0Var, localFilesFeature, xde0Var, q8nVar, actVar.h);
            case 6:
                qop qopVar4 = (qop) obj;
                bct bctVar2 = (bct) obj2;
                teq teqVar3 = ((lzp) obj3).a;
                qopVar4.getClass();
                bctVar2.getClass();
                return new fb3(bctVar2.b, bctVar2.d, qopVar4.d(), new vn8(teqVar3.Eh));
            case 7:
                daq daqVar4 = ((d1q) obj3).a;
                ((qop) obj).getClass();
                ((pbt) obj2).getClass();
                Context context2 = (Context) daqVar4.x1.a;
                c8o.l(context2);
                return new uqg(context2, (byte) 3);
            case 8:
                shv0 shv0Var = (shv0) obj;
                teq teqVar4 = ((l0q) obj3).a;
                shv0Var.getClass();
                ((rhv0) obj2).getClass();
                Intent intent = shv0Var.a;
                c8o.l(intent);
                LocalFilesFeature localFilesFeature2 = (LocalFilesFeature) teqVar4.Qd.get();
                c8o.l(localFilesFeature2);
                xde0 xde0Var2 = (xde0) teqVar4.Pd.get();
                c8o.l(xde0Var2);
                return new bfe0(intent, localFilesFeature2, xde0Var2);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                kzp kzpVar2 = (kzp) obj3;
                qop qopVar5 = (qop) obj;
                nzp nzpVar3 = new nzp(kzpVar2.a, kzpVar2.b);
                qopVar5.getClass();
                ((bct) obj2).getClass();
                return new rb3((k7j0) ((jly0) new qjp(nzpVar3, qopVar5).a).get(), qopVar5.d());
            default:
                kzp kzpVar3 = (kzp) obj3;
                qop qopVar6 = (qop) obj;
                jbt jbtVar = (jbt) obj2;
                daq daqVar5 = kzpVar3.a;
                teq teqVar5 = kzpVar3.b;
                nzp nzpVar4 = new nzp(daqVar5, teqVar5);
                qopVar6.getClass();
                jbtVar.getClass();
                qqp qqpVar = new qqp(nzpVar4, qopVar6, jbtVar);
                String strD = qopVar6.d();
                z6k0 z6k0Var = (z6k0) teqVar5.Z5.get();
                c8o.l(z6k0Var);
                z6k0 z6k0Var2 = (z6k0) teqVar5.Z5.get();
                c8o.l(z6k0Var2);
                koc0 koc0Var2 = jbtVar.d;
                rxj0 rxj0Var = (rxj0) teqVar5.Y5.get();
                c8o.l(rxj0Var);
                mnk0 mnk0Var = (mnk0) teqVar5.b6.get();
                c8o.l(mnk0Var);
                kqi0 kqi0Var = new kqi0(z6k0Var2, koc0Var2, rxj0Var, mnk0Var, (byte) 6);
                rxj0 rxj0Var2 = (rxj0) teqVar5.Y5.get();
                c8o.l(rxj0Var2);
                jbk0 jbk0Var = (jbk0) teqVar5.a6.get();
                c8o.l(jbk0Var);
                xrp xrpVar = (xrp) qqpVar.c;
                me30 me30Var2 = (me30) daqVar5.w7.get();
                c8o.l(me30Var2);
                return new ixj0(strD, z6k0Var, kqi0Var, rxj0Var2, jbk0Var, xrpVar, me30Var2);
        }
    }

    public /* synthetic */ c8d0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
