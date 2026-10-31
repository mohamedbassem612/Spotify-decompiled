package p;

import android.os.RemoteException;
import com.android.installreferrer.api.InstallReferrerClient;
import com.android.installreferrer.api.InstallReferrerStateListener;
import com.spotify.base.java.logging.Logger;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import com.spotify.payment.endpoint.proto.PaymentSdkNativeServiceProto;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.ObservableTransformer;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableNever;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableSingleSingle;
import io.reactivex.rxjava3.processors.BehaviorProcessor;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sjq0 implements efg, Function, mh0, xq61, InstallReferrerStateListener {
    public final /* synthetic */ byte a;
    public final Object b;
    public Object c;

    public sjq0(l1s0 l1s0Var) {
        this.a = (byte) 11;
        this.b = l1s0Var;
        this.c = new BehaviorProcessor();
    }

    public /* bridge */ int A(wod wodVar) {
        return d0p1.u(wodVar);
    }

    public lp90 A0(td61 td61Var) {
        String str;
        Object next;
        Object next2;
        if (td61Var == null || (str = td61Var.a) == null || td61Var.d == null) {
            return q0o1.a;
        }
        List listI = ((g0l) this.b).i();
        Iterator it = listI.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((l0l) next).d(), str));
        l0l l0lVar = (l0l) next;
        if (l0lVar == null) {
            if (!((no4) ((b0a0) this.c).a.get()).f0()) {
                listI = null;
            }
            if (listI != null) {
                Iterator it2 = listI.iterator();
                loop1: while (true) {
                    if (!it2.hasNext()) {
                        next2 = null;
                        break;
                    }
                    next2 = it2.next();
                    List listH = ((l0l) next2).h();
                    if (!(listH instanceof Collection) || !listH.isEmpty()) {
                        Iterator it3 = listH.iterator();
                        while (it3.hasNext()) {
                            if (u890.j(((t880) it3.next()).e, str)) {
                                break loop1;
                            }
                        }
                    }
                }
                l0lVar = (l0l) next2;
            } else {
                l0lVar = null;
            }
        }
        return q0o1.n(td61Var, l0lVar != null ? l0lVar.j() : null);
    }

    public int B(c0h1 c0h1Var) {
        if (c0h1Var instanceof qh31) {
            return d0p1.m((e8b0) c0h1Var);
        }
        if (c0h1Var instanceof x26) {
            return ((x26) c0h1Var).size();
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return 0;
    }

    public void B0() {
        Flowable flowable = ((l1s0) this.b).a().flatMapObservable(xi10.W0).filter(dj10.V0).map(fj10.V0).take(1L).single(yz40.b).onErrorReturn(ok10.U0).toFlowable();
        int i = Flowable.a;
        Flowable.k(flowable, FlowableNever.b).subscribe((BehaviorProcessor) this.c);
    }

    public /* bridge */ qx81 C(a8b0 a8b0Var) {
        return d0p1.r(a8b0Var);
    }

    public void C0(sve0 sve0Var) {
        ad2 ad2Var = new ad2(b7x.a);
        cd2 cd2Var = new cd2(this);
        zc2 zc2Var = (zc2) this.c;
        sve0Var.a(ad2.class, wc2.class, rc2.class, ad2Var, cd2Var);
        sve0Var.b(ad2.class, new fe2(zc2Var, (byte) 4));
        sve0Var.b(jc91.class, new ed2((byte) 12));
    }

    public /* bridge */ boolean D(i0h1 i0h1Var) {
        return d0p1.J(i0h1Var);
    }

    public e8b0 E(e8b0 e8b0Var) {
        return d0p1.b0(e8b0Var);
    }

    public boolean F(e8b0 e8b0Var) {
        return !u890.j(d0p1.n0(X(e8b0Var)), d0p1.n0(O(e8b0Var)));
    }

    public i0h1 G(e8b0 e8b0Var) {
        qh31 qh31VarR = d0p1.r(e8b0Var);
        if (qh31VarR == null) {
            qh31VarR = X(e8b0Var);
        }
        return d0p1.n0(qh31VarR);
    }

    public /* bridge */ c0h1 H(qh31 qh31Var) {
        return d0p1.n(qh31Var);
    }

    public boolean I(e8b0 e8b0Var) {
        qx81 qx81VarR = d0p1.r(e8b0Var);
        return (qx81VarR != null ? d0p1.p(qx81VarR) : null) != null;
    }

    public /* bridge */ boolean J(d0h1 d0h1Var) {
        return d0p1.V(d0h1Var);
    }

    public boolean K(qh31 qh31Var) {
        return d0p1.p(qh31Var) != null;
    }

    public /* bridge */ gq20 L(e8b0 e8b0Var) {
        return d0p1.q(e8b0Var);
    }

    public /* bridge */ vod M(wod wodVar) {
        return d0p1.m0(wodVar);
    }

    public qh31 O(e8b0 e8b0Var) {
        qx81 qx81VarO0;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ != null && (qx81VarO0 = d0p1.o0(dq20VarQ)) != null) {
            return qx81VarO0;
        }
        qx81 qx81VarR = d0p1.r(e8b0Var);
        qx81VarR.getClass();
        return qx81VarR;
    }

    public boolean P(e8b0 e8b0Var) {
        return d0p1.Q(X(e8b0Var)) != d0p1.Q(O(e8b0Var));
    }

    public /* bridge */ boolean Q(wod wodVar) {
        return d0p1.U(wodVar);
    }

    public /* bridge */ int R(i0h1 i0h1Var) {
        return d0p1.d0(i0h1Var);
    }

    public /* bridge */ wod S(sx81 sx81Var) {
        return d0p1.o(this, sx81Var);
    }

    public void T(e8b0 e8b0Var) {
        d0p1.q(e8b0Var);
    }

    public /* bridge */ qh31 U(qh31 qh31Var, boolean z) {
        return d0p1.q0(qh31Var, false);
    }

    public /* bridge */ int V(d0h1 d0h1Var) {
        return d0p1.E(d0h1Var);
    }

    public boolean W(i0h1 i0h1Var, i0h1 i0h1Var2) {
        if (!(i0h1Var instanceof h0h1)) {
            hhg1.n("Failed requirement.");
            return false;
        }
        if (!(i0h1Var2 instanceof h0h1)) {
            hhg1.n("Failed requirement.");
            return false;
        }
        if (d0p1.l(i0h1Var, i0h1Var2)) {
            return true;
        }
        h0h1 h0h1Var = (h0h1) i0h1Var;
        h0h1 h0h1Var2 = (h0h1) i0h1Var2;
        Map map = (Map) this.b;
        if (((b8b0) this.c).f(h0h1Var, h0h1Var2)) {
            return true;
        }
        if (map != null) {
            h0h1 h0h1Var3 = (h0h1) map.get(h0h1Var);
            h0h1 h0h1Var4 = (h0h1) map.get(h0h1Var2);
            if (h0h1Var3 != null && h0h1Var3.equals(h0h1Var2)) {
                return true;
            }
            if (h0h1Var4 != null && h0h1Var4.equals(h0h1Var)) {
                return true;
            }
        }
        return false;
    }

    public qh31 X(e8b0 e8b0Var) {
        qx81 qx81VarZ;
        dq20 dq20VarQ = d0p1.q(e8b0Var);
        if (dq20VarQ != null && (qx81VarZ = d0p1.Z(dq20VarQ)) != null) {
            return qx81VarZ;
        }
        qx81 qx81VarR = d0p1.r(e8b0Var);
        qx81VarR.getClass();
        return qx81VarR;
    }

    public /* bridge */ boolean Y(i0h1 i0h1Var) {
        return d0p1.L(i0h1Var);
    }

    public /* bridge */ qh31 Z(qh31 qh31Var) {
        return d0p1.t(qh31Var);
    }

    public wod a(qh31 qh31Var) {
        qx81 qx81Var;
        g4t g4tVarP = d0p1.p(qh31Var);
        if (g4tVarP == null || (qx81Var = g4tVarP.b) == null) {
            qx81Var = (sx81) qh31Var;
        }
        return d0p1.o(this, qx81Var);
    }

    public boolean a0(e8b0 e8b0Var) {
        return e8b0Var instanceof zgo0;
    }

    public Object apply(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                u310 u310Var = (u310) obj;
                nyq0 nyq0Var = (nyq0) obj2;
                return ((w310) nyq0Var.d.getValue()).b(r9c.a((r9c) this.c, (String) null, u310Var.a, false, false, (String) null, nyq0Var.c.c(), 229373)).map(new vgq0(nyq0Var, u310Var, (byte) 1)).map(yz10.T0).flattenAsObservable(zz10.U0);
            case 12:
                PaymentSdkNativeServiceProto.PreparePaymentResponse preparePaymentResponse = (PaymentSdkNativeServiceProto.PreparePaymentResponse) obj;
                return new j300((String) obj2, gbs0.b(preparePaymentResponse.n()), preparePaymentResponse.o(), ((vfw) this.c).i);
            case 13:
                String str = ((h39) obj2).b;
                mx41 mx41Var = (mx41) this.c;
                return new w051(str, mx41Var.c, new x851((i39) obj), mx41Var.d);
            case 14:
                o39 o39Var = (o39) obj2;
                return new y051(o39Var.b, ((nx41) this.c).c, new p851(o39Var.a));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                PlayerQueue playerQueue = (PlayerQueue) obj;
                tuz tuzVar = (tuz) obj2;
                List list = (List) this.c;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(l4o1.c0((ContextTrack) it.next()));
                }
                ArrayList arrayList2 = new ArrayList((Collection) playerQueue.nextTracks());
                r7h.a0(arrayList2, new ib5(arrayList, (byte) 25));
                return tuzVar.b(dcu0.d(playerQueue.toBuilder().nextTracks(b380.p(arrayList2)).build()));
            case 26:
                return Flowable.h((Flowable) obj2, (Flowable) this.c, ud20.Z0);
            default:
                return ((hmu0) obj2).b((dmu0) this.c, (bmu0) obj);
        }
    }

    public /* bridge */ int b(a1h1 a1h1Var) {
        return d0p1.F(a1h1Var);
    }

    public /* bridge */ boolean b0(i0h1 i0h1Var) {
        return d0p1.O(i0h1Var);
    }

    public /* bridge */ d0h1 c(vod vodVar) {
        return d0p1.f0(vodVar);
    }

    public /* bridge */ e8b0 c0(e8b0 e8b0Var) {
        return d0p1.p0(this, e8b0Var);
    }

    public boolean d(wod wodVar) {
        return wodVar instanceof qod;
    }

    public /* bridge */ boolean d0(qh31 qh31Var, qh31 qh31Var2) {
        return d0p1.H(qh31Var, qh31Var2);
    }

    public g6b0 e() {
        throw new UnsupportedOperationException("Not supported");
    }

    /* JADX WARN: Code duplicated, block: B:28:0x0079  */
    /* JADX WARN: Code duplicated, block: B:8:0x0014  */
    public Object e0(r0k0 r0k0Var, onm onmVar) {
        ost0 ost0Var;
        r0k0 r0k0Var2;
        if (onmVar instanceof ost0) {
            ost0Var = (ost0) onmVar;
            int i = ost0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ost0Var.d = i - Integer.MIN_VALUE;
            } else {
                ost0Var = new ost0(this, onmVar);
            }
        } else {
            ost0Var = new ost0(this, onmVar);
        }
        ost0 ost0Var2 = ost0Var;
        Object objD = ost0Var2.b;
        int i2 = ost0Var2.d;
        d9n d9nVar = d9n.a;
        if (i2 == 0) {
            hm5.M(objD);
            long j = r0k0Var.d;
            if (j > 0) {
                ost0Var2.a = r0k0Var;
                ost0Var2.d = 1;
                if (hap1.i(j, ost0Var2) != d9nVar) {
                }
            }
            return d9nVar;
        }
        if (i2 == 1) {
            r0k0Var = ost0Var2.a;
            hm5.M(objD);
        } else {
            if (i2 != 2) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            r0k0Var2 = ost0Var2.a;
            hm5.M(objD);
        }
        Boolean bool = (Boolean) objD;
        bool.getClass();
        return new k3k0(r0k0Var2.c ? bool : null);
        ldk0 ldk0Var = (cdk0) this.b;
        lhg1 lhg1Var = r0k0Var.a;
        String str = r0k0Var.b;
        String str2 = ((c0k0) this.c).a;
        String str3 = r0k0Var.e;
        ost0Var2.a = r0k0Var;
        ost0Var2.d = 2;
        objD = ldk0Var.d(lhg1Var, str, str2, str3, ost0Var2);
        if (objD != d9nVar) {
            r0k0Var2 = r0k0Var;
            Boolean bool2 = (Boolean) objD;
            bool2.getClass();
            return new k3k0(r0k0Var2.c ? bool2 : null);
        }
        return d9nVar;
    }

    public /* bridge */ qh31 f(gq20 gq20Var) {
        return d0p1.Z(gq20Var);
    }

    public /* bridge */ int f0(e8b0 e8b0Var) {
        return d0p1.m(e8b0Var);
    }

    public /* bridge */ qh31 g(gq20 gq20Var) {
        return d0p1.o0(gq20Var);
    }

    public /* bridge */ void g0(qh31 qh31Var) {
        d0p1.W(qh31Var);
    }

    public /* bridge */ Collection h(qh31 qh31Var) {
        return d0p1.e0(this, qh31Var);
    }

    public /* bridge */ a1h1 h0(i0h1 i0h1Var, int i) {
        return d0p1.z(i0h1Var, i);
    }

    public fg0 i(o1p1 o1p1Var, iu30 iu30Var, iu30 iu30Var2) {
        ((LinkedHashSet) this.c).add(new f1r0(iu30Var, new ozp0(iu30Var2, o1p1Var, (byte) 15)));
        return new myq0(this, o1p1Var, (byte) 1);
    }

    public /* bridge */ gmh1 i0(sx81 sx81Var, sx81 sx81Var2) {
        return d0p1.v(this, sx81Var, sx81Var2);
    }

    public /* bridge */ ltn1 j(qh31 qh31Var) {
        return d0p1.j0(this, qh31Var);
    }

    public /* bridge */ qh31 j0(e8b0 e8b0Var) {
        return d0p1.r(e8b0Var);
    }

    public /* bridge */ boolean k(qh31 qh31Var) {
        return d0p1.M(qh31Var);
    }

    public boolean k0(qh31 qh31Var) {
        return d0p1.R(G(qh31Var)) && !d0p1.S(qh31Var);
    }

    public boolean l(qh31 qh31Var) {
        return d0p1.O(d0p1.n0(qh31Var));
    }

    public boolean l0(qh31 qh31Var) {
        return d0p1.J(d0p1.n0(qh31Var));
    }

    public /* bridge */ d0h1 m(e8b0 e8b0Var) {
        return d0p1.s(e8b0Var);
    }

    public /* bridge */ d0h1 m0(e8b0 e8b0Var, int i) {
        return d0p1.x(e8b0Var, i);
    }

    public /* bridge */ e8b0 n(d0h1 d0h1Var) {
        return d0p1.C(this, d0h1Var);
    }

    public /* bridge */ boolean n0(a1h1 a1h1Var, i0h1 i0h1Var) {
        return d0p1.G(a1h1Var, i0h1Var);
    }

    public boolean o(qh31 qh31Var) {
        qx81 qx81VarR = d0p1.r(qh31Var);
        return (qx81VarR != null ? a(qx81VarR) : null) != null;
    }

    public /* bridge */ boolean o0(i0h1 i0h1Var) {
        return d0p1.I(i0h1Var);
    }

    public void onInstallReferrerServiceDisconnected() {
        Logger.k("Install referrer disconnected", new Object[0]);
        qlr0 qlr0Var = (qlr0) this.b;
        qib.b(qlr0Var.c, 1);
        ((SingleEmitter) this.c).onSuccess(tov0.a);
        qlr0Var.b.endConnection();
    }

    public void onInstallReferrerSetupFinished(int i) {
        qlr0 qlr0Var = (qlr0) this.b;
        SingleEmitter singleEmitter = (SingleEmitter) this.c;
        HashSet hashSet = qlr0.e;
        InstallReferrerClient installReferrerClient = qlr0Var.b;
        qib qibVar = qlr0Var.c;
        uov0 uov0Var = tov0.a;
        if (i != 0) {
            Logger.k(f4i1.c(i, "Install referrer response code not is OK: "), new Object[0]);
            qibVar.a(4, "Response code: " + i);
            singleEmitter.onSuccess(uov0Var);
        } else if (installReferrerClient.isReady()) {
            try {
                String installReferrer = installReferrerClient.getInstallReferrer().getInstallReferrer();
                Map map = et50.a;
                String str = map.containsKey(installReferrer) ? (String) map.get(installReferrer) : null;
                uov0 uov0Var2 = (str == null || str.length() == 0) ? uov0Var : new uov0(str, str, false);
                rlr0 rlr0Var = qlr0Var.a;
                String str2 = uov0Var2 instanceof uov0 ? uov0Var2.a : "";
                hma1 hma1VarEdit = rlr0Var.a.edit();
                hma1VarEdit.d(rlr0.b, str2);
                hma1VarEdit.g();
                singleEmitter.onSuccess(uov0Var2);
            } catch (RemoteException e) {
                Logger.l(e, "Exception when fetching install referrer", new Object[0]);
                qibVar.a(3, "Error message: " + e.getMessage());
                singleEmitter.onSuccess(uov0Var);
            }
        } else {
            Logger.k("Install referrer is not ready", new Object[0]);
            qib.b(qibVar, 2);
            singleEmitter.onSuccess(uov0Var);
        }
        installReferrerClient.endConnection();
    }

    public /* bridge */ Collection p(i0h1 i0h1Var) {
        return d0p1.k0(i0h1Var);
    }

    public /* bridge */ void p0(qh31 qh31Var) {
        d0p1.X(qh31Var);
    }

    public /* bridge */ i0h1 q(qh31 qh31Var) {
        return d0p1.n0(qh31Var);
    }

    public d0h1 q0(c0h1 c0h1Var, int i) {
        if (c0h1Var instanceof sx81) {
            return d0p1.x((e8b0) c0h1Var, i);
        }
        if (c0h1Var instanceof x26) {
            return (d0h1) ((x26) c0h1Var).get(i);
        }
        StringBuilder sb = new StringBuilder("unknown type argument list type: ");
        sb.append(c0h1Var);
        nkx0.r(rc11.a.b(c0h1Var.getClass()), sb);
        return null;
    }

    public d0h1 r(qh31 qh31Var, int i) {
        if (i < 0 || i >= d0p1.m(qh31Var)) {
            return null;
        }
        return d0p1.x(qh31Var, i);
    }

    public eyr0 r0(d0r d0rVar, j2i j2iVar) {
        return new eyr0(d0rVar, (mr20) this.b, (ynb0) this.c, j2iVar);
    }

    public /* bridge */ qx81 s(qh31 qh31Var) {
        return d0p1.q0(qh31Var, true);
    }

    public jgb1 s0() {
        huz huzVar = new huz(Boolean.valueOf(((z0t) this.c).a.k()), (byte) 10);
        c0g.x.getClass();
        return new jgb1("pinsSectionToggle", 2131962123, (String) null, 2131962122, (sp00) null, (Integer) null, (a2i) null, huzVar, pbo1.N0, (mr20) null, new ibd1(new xad1(27, false), new gbd1(((g3t0) this.b).a(), new n1r0(this, (byte) 23))), (Map) null, 85946);
    }

    public /* bridge */ boolean t(e8b0 e8b0Var) {
        return d0p1.Q(e8b0Var);
    }

    public Set t0(y2r0 y2r0Var) {
        List list = y2r0Var.b;
        ArrayList<v2r0> arrayList = new ArrayList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            r7h.W(((x2r0) it.next()).b, arrayList);
        }
        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
        for (v2r0 v2r0Var : arrayList) {
            xfr0 xfr0Var = (xfr0) ((zl5) this.c).r().get(v2r0Var.a);
            if (xfr0Var == null) {
                eg.m(l1d.m("Missing SectionRegistration for section ", v2r0Var.a.name()));
                return null;
            }
            arrayList2.add(xfr0Var.a);
        }
        return o7h.p1(q7h.V(arrayList2));
    }

    public /* bridge */ boolean u(i0h1 i0h1Var) {
        return d0p1.K(i0h1Var);
    }

    public Single u0() {
        Flowable flowable = (Flowable) this.b;
        return new FlowableSingleSingle(ydh.f(flowable, flowable).J(zj20.W0)).doOnError(xfs0.i);
    }

    public e8b0 v(ArrayList arrayList) {
        return sok.w(arrayList);
    }

    public FlowableSingleSingle v0() {
        Flowable flowable = (Flowable) this.b;
        return new FlowableSingleSingle(ydh.f(flowable, flowable).J(new hvp0(this, (byte) 13)));
    }

    public /* bridge */ boolean w(i0h1 i0h1Var) {
        return d0p1.P(i0h1Var);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object w0(onm onmVar) {
        cus0 cus0Var;
        if (onmVar instanceof cus0) {
            cus0Var = (cus0) onmVar;
            int i = cus0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                cus0Var.c = i - Integer.MIN_VALUE;
            } else {
                cus0Var = new cus0(this, onmVar);
            }
        } else {
            cus0Var = new cus0(this, onmVar);
        }
        Object objO = cus0Var.a;
        int i2 = cus0Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objO);
                q59 q59Var = (q59) this.c;
                cus0Var.c = 1;
                objO = q59Var.o(cus0Var);
                d9n d9nVar = d9n.a;
                if (objO == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objO);
            }
            return (bus0) objO;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00be, code lost:
    
        if (r15 == r10) goto L34;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.io.Serializable x(long r12, p.iu30 r14, p.onm r15) {
        /*
            Method dump skipped, instruction units count: 261
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sjq0.x(long, p.iu30, p.onm):java.io.Serializable");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x007e, code lost:
    
        if (r8 == r5) goto L36;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.lang.Object x0(p.onm r8) {
        /*
            r7 = this;
            boolean r0 = r8 instanceof p.dus0
            if (r0 == 0) goto L13
            r0 = r8
            p.dus0 r0 = (p.dus0) r0
            int r1 = r0.c
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.c = r1
            goto L18
        L13:
            p.dus0 r0 = new p.dus0
            r0.<init>(r7, r8)
        L18:
            java.lang.Object r8 = r0.a
            int r1 = r0.c
            r2 = 3
            r3 = 2
            r4 = 1
            p.d9n r5 = p.d9n.a
            if (r1 == 0) goto L3c
            if (r1 == r4) goto L38
            if (r1 == r3) goto L34
            if (r1 != r2) goto L2d
            p.hm5.M(r8)
            goto L81
        L2d:
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r7)
            r7 = 0
            return r7
        L34:
            p.hm5.M(r8)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            goto L69
        L38:
            p.hm5.M(r8)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            goto L52
        L3c:
            p.hm5.M(r8)
            java.lang.Object r8 = r7.b     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            p.br81 r8 = (p.br81) r8     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.String r1 = p.kn81.a     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            io.reactivex.rxjava3.core.Single r8 = r8.c(r1)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r0.c = r4     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.Object r8 = p.fc11.j(r8, r0)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r8 != r5) goto L52
            goto L80
        L52:
            com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse r8 = (com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse) r8     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            p.nma0 r1 = p.aus0.d     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.util.ArrayList r1 = p.zts0.a(r8)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            boolean r6 = r1.isEmpty()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r6 == 0) goto L6c
            r0.c = r3     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.Object r8 = r7.w0(r0)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            if (r8 != r5) goto L69
            goto L80
        L69:
            p.bus0 r8 = (p.bus0) r8     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            return r8
        L6c:
            p.bus0 r3 = new p.bus0     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            java.lang.String r8 = r8.p()     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            r3.<init>(r1, r8, r4)     // Catch: java.util.concurrent.CancellationException -> L76 java.lang.Exception -> L78
            return r3
        L76:
            r7 = move-exception
            goto L84
        L78:
            r0.c = r2
            java.lang.Object r8 = r7.w0(r0)
            if (r8 != r5) goto L81
        L80:
            return r5
        L81:
            p.bus0 r8 = (p.bus0) r8
            return r8
        L84:
            throw r7
        */
        throw new UnsupportedOperationException("Method not decompiled: p.sjq0.x0(p.onm):java.lang.Object");
    }

    public /* bridge */ boolean y(i0h1 i0h1Var) {
        return d0p1.R(i0h1Var);
    }

    public bsu0 y0(lby lbyVar, tfu0 tfu0Var, d8r0 d8r0Var, String str, List list) {
        boolean zB = ((fza1) this.c).b(lbyVar.a);
        return new bsu0(lbyVar.a, lbyVar.b, ((tb51) this.b).h(lbyVar, false, zB), lbyVar.c, str, d8r0Var, list, tfu0Var.b, zB, lbyVar.g);
    }

    public /* bridge */ e8b0 z(wod wodVar) {
        return d0p1.a0(wodVar);
    }

    public teb z0() {
        return new teb(true, true, true, this, f8b0.b, g8b0.b);
    }

    /* JADX INFO: renamed from: f, reason: collision with other method in class */
    public /* bridge */ qx81 m666f(gq20 gq20Var) {
        return d0p1.Z(gq20Var);
    }

    /* JADX INFO: renamed from: g, reason: collision with other method in class */
    public /* bridge */ qx81 m667g(gq20 gq20Var) {
        return d0p1.o0(gq20Var);
    }

    public /* synthetic */ sjq0(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public sjq0(String str, gbs0 gbs0Var, vfw vfwVar) {
        this.a = (byte) 12;
        this.b = str;
        this.c = vfwVar;
    }

    public sjq0(cir0 cir0Var) {
        this.a = (byte) 4;
        this.b = cir0Var;
        this.c = new LinkedHashSet();
    }

    public sjq0(bpb1 bpb1Var) {
        this.a = (byte) 18;
        this.b = new LinkedHashMap();
    }

    public /* synthetic */ sjq0(ObservableTransformer observableTransformer, Object obj, xyn1 xyn1Var, byte b) {
        this.a = b;
        this.b = obj;
        this.c = xyn1Var;
    }

    public sjq0(rzo0 rzo0Var, ArrayList arrayList) {
        this.a = (byte) 6;
        this.c = rzo0Var;
        this.b = arrayList;
    }
}
