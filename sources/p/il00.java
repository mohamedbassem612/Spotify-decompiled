package p;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.sharing.v1.ShareHighlightRequest;
import com.spotify.highlightsstats.data.proto.sharing.v1.ShareStatsRequest;
import com.spotify.kidsgraduation.v1.ValidateGraduationRequest;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.player.model.ContextTrack;
import com.spotify.releases.api.v1.ReleasesResponse;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class il00 implements av30, Function, s2k1, ird1, m0g1, Producer, u9h1, jrn0, qiw {
    public final /* synthetic */ byte a;
    public Object b;

    public il00(byte b) {
        this.a = b;
        switch (b) {
            case 20:
                this.b = new ckb0();
                break;
            default:
                this.b = null;
                break;
        }
    }

    public exs a(Context context) {
        exs exsVar = new exs(context);
        o0g1 o0g1Var = (o0g1) this.b;
        yws ywsVarD = exsVar.d();
        int i = o0g1Var.b;
        short sH = xvj1.h(i);
        short sD = xvj1.d(i);
        ((j0g1) ywsVarD).e = sH;
        ((j0g1) ywsVarD).f = sD;
        ((j0g1) ywsVarD).a = sH;
        ((j0g1) ywsVarD).b = sD;
        ywsVarD.J = true;
        exsVar.p(new zws(ywsVarD));
        return exsVar;
    }

    public Object apply(Object obj) {
        Single singleDoOnError;
        Single singleA;
        byte b = 1;
        byte b2 = 0;
        switch (this.a) {
            case 0:
                ArrayList arrayListB = ((chm0) this.b).b();
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : arrayListB) {
                    if (obj2 instanceof i631) {
                        arrayList.add(obj2);
                    }
                }
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    r7h.W(((i631) it.next()).b(), arrayList2);
                }
                return o7h.p1(arrayList2);
            case 1:
                ContextTrack contextTrack = (ContextTrack) obj;
                String strA0 = l4o1.a0(contextTrack, "context_uri");
                if (strA0 == null) {
                    strA0 = "";
                }
                String strUid = contextTrack.uid();
                String str = strUid != null ? strUid : "";
                return ((strA0.length() <= 0 || str.length() <= 0) ? Flowable.I(new to91((Boolean) null)) : ((ip91) this.b).c(str, strA0).toFlowable(BackpressureStrategy.d)).J(new vs10(contextTrack, (byte) 0));
            case 2:
                return new z400((ContextTrack) this.b, (Throwable) obj);
            case 4:
                Boolean bool = (Boolean) obj;
                if (!bool.booleanValue()) {
                    vk20 vk20Var = (vk20) this.b;
                    bma1 bma1Var = vk20.e;
                    vk20Var.d.observeOn(vk20Var.a).map(o810.c).observeOn(vk20Var.c).subscribe();
                }
                return bool;
            case 8:
                j050 j050Var = (j050) obj;
                r050 r050Var = (r050) this.b;
                usa usaVar = r050Var.b;
                Activity activity = r050Var.a;
                i050 i050Var = j050Var.a;
                pta ptaVar = new pta(activity, i050Var.a, i050Var.e);
                j7m0 j7m0Var = (j7m0) usaVar;
                return j7m0Var.k.doOnSubscribe(new h7m0(j7m0Var, ptaVar, b2)).doOnDispose(new tt60(j7m0Var, ptaVar, (byte) 6)).filter(new dg90(ptaVar, (byte) 28)).map(ua20.O0).firstOrError().doOnSuccess(new h7m0(j7m0Var, ptaVar, b)).toObservable().map(new ro30(r050Var, j050Var, (byte) 7));
            case 9:
                wza0 wza0Var = (wza0) this.b;
                f0b0 f0b0Var = wza0Var.j;
                iri1 iri1VarN = ValidateGraduationRequest.n();
                iri1VarN.n();
                ValidateGraduationRequest validateGraduationRequestBuild = iri1VarN.build();
                g0b0 g0b0Var = f0b0Var.a;
                validateGraduationRequestBuild.getClass();
                return g0b0Var.j(validateGraduationRequestBuild).map(dj10.i).onErrorResumeNext(pza0.a).flatMap(qza0.a).flatMap(new ouz(wza0Var, (byte) 22)).toObservable().map(o810.e).onErrorReturn(yb10.e);
            case 14:
                return new CompletableFromAction(new go91(((n980) this.b).b, (String) obj, (byte) 2));
            case 21:
                String str2 = (String) obj;
                pzb0 pzb0Var = (pzb0) this.b;
                str2.getClass();
                if (pzb0Var.d.b(str2)) {
                    return pzb0Var.b.t(str2);
                }
                MaybeEmpty maybeEmpty = MaybeEmpty.a;
                maybeEmpty.getClass();
                return maybeEmpty;
            case 22:
                q3c0 q3c0Var = (q3c0) this.b;
                return (!q3c0Var.h.b ? rqt0.F(igu.b, new n3c0(q3c0Var, null, (byte) 1)).flatMapCompletable(new hl00(q3c0Var, (byte) 25)) : CompletableEmpty.a).d(Observable.just(x3c0.a));
            case 24:
                svc0 svc0Var = (svc0) obj;
                int i = ((voc0) this.b).a;
                List list = svc0Var.d;
                List list2 = svc0Var.c;
                unl unlVar = svc0Var.b;
                b8e0 b8e0Var = svc0Var.a;
                ArrayList arrayListO = p7h.O(new htc0[]{(b8e0Var.getCount() == 0 && b8e0Var.g().isEmpty()) ? new atc0(i, b8e0Var.getFilters()) : new btc0(i, b8e0Var)});
                if (!u890.j(unlVar, snl.a)) {
                    arrayListO.add(new ysc0(unlVar));
                }
                if (!list2.isEmpty() || !list.isEmpty()) {
                    arrayListO.add(new zsc0(list2, list));
                }
                return Observable.fromIterable(arrayListO);
            case 28:
                zv11 zv11Var = (zv11) obj;
                o3e0 o3e0Var = (o3e0) this.b;
                cxn cxnVar = zv11Var.a;
                if (cxnVar instanceof wwn) {
                    em3 em3Var = (em3) o3e0Var.b;
                    String str3 = ((wwn) cxnVar).a;
                    Set set = zv11Var.b;
                    ReleasesResponse releasesResponse = (ReleasesResponse) em3Var.c;
                    if (releasesResponse != null) {
                        singleA = Single.just(releasesResponse);
                        singleA.getClass();
                    } else {
                        singleA = ((ev6) em3Var.b).a(str3);
                    }
                    singleDoOnError = singleA.map(new g23(em3Var, set, str3, (byte) 24));
                } else if (cxnVar instanceof ywn) {
                    singleDoOnError = rqt0.F(o6x.a, new q4d0(o3e0Var, cxnVar, (lnm) null, (byte) 23));
                } else {
                    if (!(cxnVar instanceof xwn)) {
                        eg.o();
                        return null;
                    }
                    zo8 zo8Var = (zo8) o3e0Var.c;
                    String str4 = ((xwn) cxnVar).a;
                    singleDoOnError = zo8Var.a.b(new oi("author_releases", false, new wk3(str4, (byte) 27))).filter(zp8.t).map(new akp1(zo8Var, str4)).firstOrError().doOnError(nm.Y0);
                }
                return singleDoOnError.map(ud20.X).onErrorReturn(rh20.X);
            default:
                return ((f7k1) this.b).invoke(obj);
        }
    }

    /* JADX WARN: Code duplicated, block: B:11:0x0022 A[PHI: r1
      0x0022: PHI (r1v6 int) = (r1v4 int), (r1v1 int) binds: [B:15:0x002b, B:10:0x0020] A[DONT_GENERATE, DONT_INLINE]] */
    public n8h1 b(zv31 zv31Var, int i, String str) {
        int i2;
        c0a0 c0a0Var = (c0a0) zv31Var.j;
        String str2 = c0a0Var.b;
        String str3 = zv31Var.a;
        boolean z = c0a0Var.a;
        f0u f0uVar = c0a0Var.d;
        int i3 = c0a0Var.e;
        int i4 = 5;
        int iM = c0a0Var.h == 3 ? 5 : yap1.m(f0uVar);
        int i5 = 6;
        if (i3 != 0) {
            if (z && i3 == 4) {
                i4 = i5;
            } else {
                int iC = l1d.C(i3);
                if (iC != 0) {
                    i5 = 1;
                    if (iC == 1) {
                        i4 = i5;
                    } else if (iC == 2) {
                        i4 = 4;
                    } else if (iC != 3) {
                        eg.o();
                        return null;
                    }
                } else {
                    i4 = 3;
                }
            }
            i2 = i4;
        } else {
            i2 = 6;
        }
        return new cyk0(new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, str3, (byte) 1), str2, f4i1.f(ab80.h(iM), ":", ab80.i(i2)));
    }

    public w7h1 c(zv31 zv31Var, int i, String str) {
        String str2 = ((c0a0) zv31Var.j).g.e.a;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-connect-menu";
        x6h1VarI.f = "6.6.0";
        x6h1VarI.g = "22.0.0";
        x6h1 x6h1VarR = kk0.r(x6h1VarI, "connect/devicepicker");
        x6h1VarR.i.add(new a7h1("device_list", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarR.j = false;
        y6h1 y6h1VarA = x6h1VarR.a();
        Integer numValueOf = Integer.valueOf(i);
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("connect_device", (String) null, numValueOf, str2, str));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC2.j = true;
        y6h1 y6h1VarA2 = x6h1VarC2.a();
        b7x b7xVar = b7x.a;
        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis());
    }

    public void d() {
        ((tr60) this.b).m1.a();
    }

    public void e() {
        tr60 tr60Var = (tr60) this.b;
        qr60 qr60Var = tr60Var.i1;
        if (qr60Var.d || qr60Var.e) {
            tr60Var.m1.b(tr60Var.Z0.b0(Flowable.h(tr60Var.W0, tr60Var.V0, ok10.f), fj10.f).W(tr60Var.g1).L(tr60Var.f1).t(Functions.a).subscribe(new od30(tr60Var, (byte) 17)));
        }
    }

    public n8h1 f(zv31 zv31Var, int i, String str) {
        return new cyk0(new byk0(new jpk0(new fyk0()), Integer.valueOf(i), str, ((c0a0) zv31Var.j).g.e.a, (byte) 1), (byte) 0);
    }

    public Object get() {
        return new DispatcherWorker(((ex80) this.b).c);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, String str2, onm onmVar) {
        wd90 wd90Var;
        if (onmVar instanceof wd90) {
            wd90Var = (wd90) onmVar;
            int i = wd90Var.e;
            if ((i & Integer.MIN_VALUE) != 0) {
                wd90Var.e = i - Integer.MIN_VALUE;
            } else {
                wd90Var = new wd90(this, onmVar);
            }
        } else {
            wd90Var = new wd90(this, onmVar);
        }
        Object objI = wd90Var.c;
        int i2 = wd90Var.e;
        if (i2 == 0) {
            hm5.M(objI);
            hl00 hl00Var = (hl00) this.b;
            wd90Var.a = str;
            wd90Var.b = str2;
            wd90Var.e = 1;
            objI = hl00Var.i(str, str2, wd90Var);
            d9n d9nVar = d9n.a;
            if (objI == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = wd90Var.b;
            str = wd90Var.a;
            hm5.M(objI);
        }
        gd90 gd90Var = (gd90) objI;
        if (gd90Var instanceof dd90) {
            return new hrn0(ldg.class, new mdg(str, str2), new c6w0(1, false, (hd5) null, 14));
        }
        if (gd90Var instanceof ed90) {
            return new hrn0(ldg.class, new mdg(str, str2), new c6w0(1, false, (hd5) null, 14));
        }
        if (gd90Var instanceof fd90) {
            Set set = s4b1.f;
            return new ern0(uic.x(str));
        }
        eg.o();
        return null;
    }

    public ckb0 i() {
        return (ckb0) this.b;
    }

    public eey j(boolean z) {
        p85 p85Var = (p85) this.b;
        o85 o85Var = o85.d;
        return new eey(z || p7h.M(new o85[]{o85Var, o85.c}).contains(p85Var.c()), !z && p7h.M(new o85[]{o85Var, o85.b}).contains(p85Var.c()));
    }

    public void k(boolean z) {
        ((ckb0) this.b).c = z;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strJ = uic.x(intent.getDataString()).j();
        if (strJ == null) {
            strJ = "";
        }
        return ((wf2) this.b).e(intent, new uxa0(strJ));
    }

    public void m() {
        this.b = null;
    }

    public void n(boolean z) {
        ((ckb0) this.b).a = z;
    }

    public void o(Exception exc) {
        ((eks0) this.b).a(-1);
    }

    public void onSuccess() {
        ((eks0) this.b).a((Integer) null);
    }

    public Single p(String str, boolean z) {
        pf60 pf60Var = (pf60) this.b;
        wxd1 wxd1Var = z ? wxd1.TEMPLATE_VERSION_V2 : wxd1.TEMPLATE_VERSION_V1;
        qf60 qf60Var = pf60Var.a;
        l871 l871VarN = ShareHighlightRequest.n();
        l871VarN.n(str);
        l871VarN.r(upo1.s());
        l871VarN.q(wxd1Var);
        return qf60Var.b((ShareHighlightRequest) l871VarN.build());
    }

    public Single q(Timestamp timestamp, List list) {
        qf60 qf60Var = ((pf60) this.b).a;
        jn71 jn71VarO = ShareStatsRequest.o();
        jn71VarO.q(timestamp);
        jn71VarO.r(upo1.s());
        jn71VarO.n(list);
        return qf60Var.d((ShareStatsRequest) jn71VarO.build());
    }

    public void v(Object obj) {
        ((kqd0) this.b).X.f(new nnd0(((Boolean) obj).booleanValue()));
    }

    public void g() {
    }

    public /* synthetic */ il00(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
