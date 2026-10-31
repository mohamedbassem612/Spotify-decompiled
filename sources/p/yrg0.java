package p;

import android.content.Context;
import com.spotify.interapp.interappprotocol.NotAuthorizedException;
import com.spotify.offline_esperanto.proto.EsOffline$Progress;
import com.spotify.pses.v1.proto.ConfigurationResponse;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDefer;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class yrg0 implements BiFunction, s2k1, Function, fyv0, z5f1, lr61, y4l1, z1q0, h8q0, vy11 {
    public final /* synthetic */ byte a;
    public final Object b;

    public yrg0(byte b) {
        this.a = b;
        switch (b) {
            case 12:
                this.b = new LinkedHashSet();
                break;
            case 16:
                this.b = new HashSet(p7h.O("com.samsung.accessory.atticmgr", "com.samsung.accessory.berrymgr", "com.samsung.accessory.popcornmgr", "com.samsung.accessory.fridaymgr", "com.samsung.accessory.neobeanmgr", "com.samsung.accessory.zenithmgr", "com.samsung.accessory.pearlmgr", "com.samsung.accessory.jellymgr", "com.samsung.accessory.paranmgr", "com.samsung.accessory.pianomgr", "com.samsung.accessory.gemstonemgr", "com.samsung.accessory.budsunitemgr", "com.facebook.stella", "com.facebook.stella_debug"));
                break;
            case 19:
                this.b = new h94();
                break;
            case 20:
                this.b = oap1.r();
                break;
            case 28:
                this.b = new AtomicBoolean(false);
                break;
            default:
                this.b = new nen0();
                break;
        }
    }

    @Override // p.fyv0
    public cbr0 a() {
        return ((uw0) this.b).A();
    }

    public /* synthetic */ void accept(Object obj, Object obj2) {
        vhp1 vhp1Var = (vhp1) obj;
        vhp1Var.n().h1(((arn1) this.b).l, oho1.A());
        vhp1Var.n().g1(oho1.A());
        ((bsd1) obj2).b((Object) null);
    }

    @Override // io.reactivex.rxjava3.functions.BiFunction
    public Object apply(Object obj, Object obj2) {
        String str;
        EsOffline$Progress esOffline$Progress = (EsOffline$Progress) obj;
        EsOffline$Progress esOffline$Progress2 = (EsOffline$Progress) obj2;
        exp0 exp0Var = (exp0) this.b;
        exp0Var.e("bulk_combined", esOffline$Progress2);
        boolean z = esOffline$Progress.s() || esOffline$Progress2.s();
        long jY = esOffline$Progress2.y() + esOffline$Progress.y();
        if (z) {
            str = jY == 0 ? "idle_zero_total" : "downloading";
        } else {
            str = "idle_not_downloading";
        }
        exp0Var.d(str);
        if (!z || jY == 0) {
            return qcd1.a;
        }
        long jR = esOffline$Progress2.r() + esOffline$Progress.r();
        epz epzVarB = EsOffline$Progress.B();
        epzVarB.y(jY);
        epzVarB.r(jR);
        epzVarB.v(esOffline$Progress2.v() + esOffline$Progress.v());
        epzVarB.x(esOffline$Progress2.x() + esOffline$Progress.x());
        epzVarB.q(esOffline$Progress2.q() + esOffline$Progress.q());
        epzVarB.u(esOffline$Progress2.u() + esOffline$Progress.u());
        epzVarB.s();
        epzVarB.n(esOffline$Progress2.p() + esOffline$Progress.p());
        epzVarB.t((jR / jY) * 100.0f);
        epzVarB.w(esOffline$Progress2.w() + esOffline$Progress.w());
        EsOffline$Progress esOffline$Progress3 = (EsOffline$Progress) epzVarB.build();
        esOffline$Progress3.getClass();
        return new pcd1(esOffline$Progress3, esOffline$Progress2.s());
    }

    @Override // p.lr61
    public r6h1 b() {
        return ((zok0) this.b).b();
    }

    public void c() {
        ((ohd) this.b).resumeWith(null);
    }

    @Override // p.y4l1
    public void f(m8b0 m8b0Var) {
        s24 s24Var = (s24) this.b;
        if (s24.n(s24Var) != null) {
            q881 q881VarD = q881.d(m8b0Var);
            q881VarD.e();
            q881VarD.f();
            try {
                s24.n(s24Var).v(q881VarD);
            } catch (NotAuthorizedException unused) {
                s24Var.Z(32, q881VarD.e(), cv5.a, "wamp.error.not_authorized");
            }
        }
    }

    public void g() {
        ((Function0) this.b).invoke();
    }

    @Override // p.fyv0
    public h0r0 h() {
        return ((uw0) this.b).g();
    }

    @Override // p.lr61
    public w7h1 i() {
        return ((zok0) this.b).h();
    }

    @Override // p.lr61
    public w7h1 j() {
        return ((zok0) this.b).i();
    }

    public void k(g2n1 g2n1Var, iu30 iu30Var, qim0 qim0Var, b0k b0kVar, int i) {
        int i2;
        qim0 qim0Var2;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(-1063622525);
        if ((i & 6) == 0) {
            i2 = (x340Var.i(g2n1Var) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= x340Var.i(iu30Var) ? 32 : 16;
        }
        int i3 = i2 | 384;
        if ((i & 3072) == 0) {
            i3 |= (i & 4096) == 0 ? x340Var.g(this) : x340Var.i(this) ? 2048 : 1024;
        }
        if (x340Var.Y(i3 & 1, (i3 & 1171) != 1170)) {
            qim0 qim0Var3 = nim0.a;
            irn1.u(qim0Var3, apo.r(436683446, new vwk1(iu30Var, (byte) 1), x340Var), (vu30) null, (erl1) null, apo.r(-1155026820, new p8e1(g2n1Var, iu30Var, this, (byte) 15), x340Var), x340Var, ((i3 >> 6) & 14) | 24624, 12);
            qim0Var2 = qim0Var3;
        } else {
            x340Var.b0();
            qim0Var2 = qim0Var;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new swk1(i, this, g2n1Var, iu30Var, qim0Var2, (byte) 17);
        }
    }

    public gmy0 l() {
        boolean z = !m(9);
        boolean zM = m(8);
        boolean zM2 = m(2);
        boolean z2 = !m(10);
        boolean zM3 = m(3);
        boolean zM4 = m(4);
        boolean zM5 = m(5);
        boolean zM6 = m(1);
        boolean zM7 = m(11);
        boolean zM8 = m(13);
        boolean zM9 = m(12);
        ConfigurationResponse configurationResponse = (ConfigurationResponse) this.b;
        zeb zebVar = new zeb(configurationResponse, m(1), m(2), m(3), !m(9), !m(10), m(4), m(5));
        int iQ = configurationResponse.q();
        return new gmy0(z, z2, zM2, zM3, zM4, zM5, zM6, zM, zM7, zM8, zM9, (iQ == 0 ? -1 : yeb.a[l1d.C(iQ)]) == 1 ? zebVar.b(configurationResponse.p()) : zebVar.b(null));
    }

    public boolean m(int i) {
        h290 h290VarO = ((ConfigurationResponse) this.b).o();
        if (h290VarO.isEmpty()) {
            return false;
        }
        Iterator it = h290VarO.iterator();
        while (it.hasNext()) {
            if (nhc1.S((String) it.next(), bb00.f(i), true)) {
                return true;
            }
        }
        return false;
    }

    public od51 n(id51 id51Var) {
        a851 a851Var;
        od51 od51VarB = id51Var.b();
        lw41 lw41VarA = od51VarB != null ? od51VarB.a() : null;
        pc51 pc51VarQ = q(id51Var.c());
        pc51 pc51VarQ2 = q(id51Var.a());
        if (lw41VarA == null || !pc51VarQ.equals(pc51VarQ2)) {
            if (!sjb.v(id51Var.c().B(), id51Var.a().B())) {
                lw41VarA = null;
            }
            lw41VarA = ((qc51) this.b).b(pc51VarQ2, lw41VarA);
        }
        lw41 lw41Var = lw41VarA;
        z551 z551VarA = id51Var.a();
        boolean z = !z551VarA.F();
        String strB = z551VarA.b();
        ue20 ue20VarJ = z551VarA.j();
        boolean z2 = z551VarA.B() instanceof a951;
        klr0 klr0VarR = z551VarA.r();
        klr0 klr0Var = klr0VarR instanceof klr0 ? klr0VarR : null;
        b851 b851Var = new b851(z2, klr0Var != null && klr0Var.a());
        f951 f951VarB = z551VarA.B();
        if (f951VarB instanceof a951) {
            a851Var = a851.c;
        } else if (f951VarB instanceof z851) {
            a851Var = a851.d;
        } else if (f951VarB instanceof b951) {
            a851Var = a851.t;
        } else if (f951VarB instanceof w851) {
            a851Var = a851.h;
        } else if (f951VarB instanceof x851) {
            a851Var = a851.X;
        } else if (f951VarB instanceof u851) {
            a851Var = a851.b;
        } else if (f951VarB instanceof y851) {
            a851Var = a851.a;
        } else if (f951VarB instanceof r851) {
            a851Var = a851.f;
        } else if (f951VarB instanceof q851) {
            a851Var = a851.g;
        } else {
            if (!(f951VarB instanceof p851)) {
                eg.o();
                return null;
            }
            a851Var = a851.i;
        }
        return new od51(lw41Var, z, strB, ue20VarJ, b851Var, a851Var, z551VarA.g(), z551VarA.n());
    }

    /* JADX WARN: Code duplicated, block: B:26:0x0067 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:27:0x0069 A[LOOP:0: B:16:0x0033->B:27:0x0069, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:36:0x006c A[SYNTHETIC] */
    public void o(mmr0 mmr0Var) {
        Object obj = mmr0Var.a;
        Object obj2 = mmr0Var.b;
        nen0 nen0Var = (nen0) this.b;
        Object objG = nen0Var.g(obj);
        if (objG == null) {
            return;
        }
        if (!(objG instanceof oen0)) {
            if (objG.equals(obj2)) {
                nen0Var.k(obj);
                return;
            }
            return;
        }
        oen0 oen0Var = (oen0) objG;
        oen0Var.l(obj2);
        if (oen0Var.g()) {
            nen0Var.k(obj);
            return;
        }
        if (oen0Var.d == 1) {
            Object[] objArr = oen0Var.b;
            long[] jArr = oen0Var.a;
            int length = jArr.length - 2;
            if (length >= 0) {
                int i = 0;
                while (true) {
                    long j = jArr[i];
                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                        int i2 = 8 - ((~(i - length)) >>> 31);
                        for (int i3 = 0; i3 < i2; i3++) {
                            if ((255 & j) < 128) {
                                nen0Var.m(obj, objArr[(i << 3) + i3]);
                                return;
                            }
                            j >>= 8;
                        }
                        if (i2 == 8) {
                            if (i != length) {
                                i++;
                            }
                        }
                    } else if (i != length) {
                        i++;
                    }
                }
            }
            bhn0.t("The ScatterSet is empty");
        }
    }

    public void onSuccess(Object obj) {
        ((bsd1) ((y1t0) this.b).b).a.s();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Serializable p(List list, onm onmVar) {
        uni0 uni0Var;
        List list2;
        List<cqi0> list3;
        if (onmVar instanceof uni0) {
            uni0Var = (uni0) onmVar;
            int i = uni0Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                uni0Var.e = i - Integer.MIN_VALUE;
            } else {
                uni0Var = new uni0(this, onmVar);
            }
        } else {
            uni0Var = new uni0(this, onmVar);
        }
        Object obj = uni0Var.c;
        int i2 = uni0Var.e;
        if (i2 == 0) {
            hm5.M(obj);
            ArrayList arrayList = new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            for (Object obj2 : list) {
                if (((cqi0) obj2).b()) {
                    arrayList.add(obj2);
                } else {
                    arrayList2.add(obj2);
                }
            }
            v5n v5nVar = (v5n) this.b;
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                arrayList3.add(((cqi0) it.next()).a());
            }
            uni0Var.a = arrayList;
            uni0Var.b = arrayList2;
            uni0Var.e = 1;
            Object objN = ujo1.n(v5nVar, arrayList3, uni0Var);
            d9n d9nVar = d9n.a;
            if (objN == d9nVar) {
                return d9nVar;
            }
            list2 = arrayList;
            obj = objN;
            list3 = arrayList2;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list3 = uni0Var.b;
            list2 = uni0Var.a;
            hm5.M(obj);
        }
        Map map = (Map) obj;
        xkg0 xkg0Var = new xkg0();
        Iterator it2 = list2.iterator();
        while (it2.hasNext()) {
            xkg0Var.put(((cqi0) it2.next()).a(), mv21.a);
        }
        for (cqi0 cqi0Var : list3) {
            String strA = cqi0Var.a();
            eww0 eww0Var = (eww0) map.get(cqi0Var.a());
            xkg0Var.put(strA, eww0Var == null ? ov21.a : new nv21(eww0Var.b, eww0Var.f));
        }
        return xkg0Var.b();
    }

    public pc51 q(z551 z551Var) {
        m131 m131VarX = z551Var.x();
        int iL = z551Var.l();
        xrt0 xrt0VarS = z551Var.s();
        f951 f951VarB = z551Var.B();
        String strB = z551Var.b();
        gyh gyhVarA = z551Var.t().a();
        return new pc51(f951VarB, iL, strB, gyhVarA != null ? pob.f(gyhVarA) : null, m131VarX, xrt0VarS, z551Var.j(), z551Var.n(), z551Var.k(), z551Var.g(), z551Var.h());
    }

    public void d() {
    }

    public void e() {
    }

    public yrg0(Context context) {
        this.a = (byte) 24;
        jc10 jc10Var = new jc10(context);
        l5n1 l5n1VarA = l5n1.a(new a6n1(jc10Var, l5n1.a(t5n1.a), new avw0((Object) jc10Var, (byte) 21)));
        this.b = l5n1.a(new t8r0(l5n1VarA, l5n1.a(new y1t0((Object) l5n1VarA, (byte) 19))));
    }

    public /* synthetic */ yrg0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public yrg0(qc51 qc51Var, sjb sjbVar, pob pobVar) {
        this.a = (byte) 14;
        this.b = qc51Var;
    }

    @Override // io.reactivex.rxjava3.functions.Function
    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 6:
                hkt0 hkt0Var = (hkt0) obj;
                tvt0 tvt0Var = (tvt0) obj2;
                return tvt0.b(tvt0Var).d(v1p1.g(hkt0Var)).c(new CompletableDefer(new svt0(tvt0Var, hkt0Var))).d(Observable.empty());
            case 7:
            default:
                ha61 ha61Var = (ha61) obj2;
                return ((f6a1) obj).b().filter(new up41(ha61Var, (byte) 7)).observeOn(ha61.c(ha61Var)).doOnNext(new dy40(ha61Var, (byte) 22)).onErrorResumeNext(r3x0.X).subscribeOn(ha61.b(ha61Var));
            case 8:
                o2w0 o2w0Var = (o2w0) obj;
                z2w0 z2w0VarA = o2w0Var.a();
                u2w0 u2w0Var = (u2w0) obj2;
                boolean zJ = u2w0Var.e.j();
                boolean zB = o2w0Var.b();
                abm abmVar = u2w0Var.f;
                return brl.v(z2w0VarA, zJ, zB, abmVar.a(), o2w0Var.c(), u2w0Var.g.d(), abmVar.b());
        }
    }
}
