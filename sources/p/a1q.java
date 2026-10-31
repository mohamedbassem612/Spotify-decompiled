package p;

import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.util.Base64;
import com.google.android.gms.internal.wearable.zzdv;
import com.google.android.gms.wearable.Asset;
import com.spotify.checkout.premiumcheckout.PremiumCheckoutActivity;
import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;
import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.subjects.BehaviorSubject;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class a1q implements dwh, dl4, Function, jl3, Function3 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public a1q(fzq fzqVar) {
        vzq vzqVar;
        this.a = (byte) 23;
        this.b = fzqVar.getUri();
        fzq fzqVar2 = (fzq) fzqVar.freeze();
        byte[] data = fzqVar2.getData();
        if (data == null && !fzqVar2.h().isEmpty()) {
            hhg1.n("Cannot create DataMapItem from a DataItem  that wasn't made with DataMapItem.");
            throw null;
        }
        if (data == null) {
            vzqVar = new vzq();
        } else {
            try {
                ArrayList arrayList = new ArrayList();
                int size = fzqVar2.h().size();
                for (int i = 0; i < size; i++) {
                    gzq gzqVar = (gzq) fzqVar2.h().get(Integer.toString(i));
                    if (gzqVar == null) {
                        String string = fzqVar2.toString();
                        StringBuilder sb = new StringBuilder(String.valueOf(i).length() + 53 + string.length());
                        sb.append("Cannot find DataItemAsset referenced in data at ");
                        sb.append(i);
                        sb.append(" for ");
                        sb.append(string);
                        throw new IllegalStateException(sb.toString());
                    }
                    String id = gzqVar.getId();
                    id.getClass();
                    arrayList.add(new Asset((byte[]) null, id, (ParcelFileDescriptor) null, (Uri) null));
                }
                iwn1 iwn1Var = iwn1.b;
                int i2 = asn1.a;
                len1 len1VarO = len1.o(data, iwn1.b);
                vzq vzqVar2 = new vzq();
                for (kdn1 kdn1Var : len1VarO.n()) {
                    j2h1.P(arrayList, vzqVar2, kdn1Var.n(), kdn1Var.o());
                }
                vzqVar = vzqVar2;
            } catch (NullPointerException e) {
                e = e;
                new StringBuilder(String.valueOf(fzqVar2.getUri()).length() + 50 + String.valueOf(Base64.encodeToString(data, 0)).length());
                k220.p("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(fzqVar2.getUri())), e);
                throw null;
            } catch (zzdv e2) {
                e = e2;
                new StringBuilder(String.valueOf(fzqVar2.getUri()).length() + 50 + String.valueOf(Base64.encodeToString(data, 0)).length());
                k220.p("Unable to parse datamap from dataItem.  uri=".concat(String.valueOf(fzqVar2.getUri())), e);
                throw null;
            }
        }
        this.c = vzqVar;
    }

    public static a1q a(fzq fzqVar) {
        if (fzqVar != null) {
            return new a1q(fzqVar);
        }
        hhg1.n("dataItem must not be null");
        return null;
    }

    public Object apply(Object obj) {
        Single singleJust;
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 25:
                hcr hcrVar = (hcr) obj;
                kcr kcrVar = (kcr) obj3;
                sj sjVar = (sj) obj2;
                if (Build.VERSION.SDK_INT >= 31) {
                    singleJust = kcrVar.d.h().flatMap(new k2q((Object) sjVar, (Object) kcrVar, (byte) 26));
                    singleJust.getClass();
                } else {
                    singleJust = Single.just(g4o0.a);
                    singleJust.getClass();
                }
                return singleJust.subscribeOn(kcrVar.e).toObservable().map(new lbq((Object) kcrVar, (Object) hcrVar, (byte) 20)).onErrorReturn(bbn.U0);
            default:
                if (((Boolean) obj).booleanValue()) {
                    return ((wh80) obj3).getContextUri();
                }
                ((agc0) ((wj3) obj2).g).getClass();
                return "spotify:playlist:37i9dQZF1F5p3rmiWPIYgZ";
        }
    }

    public vzq b() {
        return (vzq) this.c;
    }

    public Observable c() {
        return ((w4h) this.b).c((CollectionPlatformItemsRequest) this.c).map(fmv.V0).onErrorReturnItem(Boolean.FALSE);
    }

    public nix0 d() {
        dcq dcqVar = (dcq) ((jly0) this.c).get();
        p68 p68Var = (p68) this.b;
        mr20 mr20Var = (mr20) p68Var.d;
        n6r0 n6r0Var = (n6r0) p68Var.e;
        c8o.l(n6r0Var);
        q8n q8nVar = (q8n) p68Var.f;
        c8o.l(q8nVar);
        q8n q8nVar2 = (q8n) p68Var.g;
        c8o.l(q8nVar2);
        return new nix0(dcqVar, mr20Var, n6r0Var, q8nVar, q8nVar2);
    }

    public bs0 element() {
        return new bs0((iac0) this.b, (lwh) ((v5q) this.c).wa.get(), new yq41(new nfb((byte) 9, false)));
    }

    public Flowable getState() {
        return (Flowable) ((idd1) this.c).getValue();
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        g281 g281Var = (g281) obj;
        f7h f7hVar = (f7h) obj2;
        Set set = (Set) obj3;
        ghr ghrVar = (ghr) this.b;
        bma1 bma1Var = ghr.k;
        return (!g281Var.x || f7hVar.a || g281Var.s < ghrVar.g.b() || set.contains(g281Var.a)) ? ea8.a : new fa8(((dhr) ((ehr) this.c)).a);
    }

    public void w(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 2:
                t0s0 t0s0Var = (t0s0) obj;
                daq daqVar = (daq) obj2;
                t0s0Var.F1 = new tzr0(new lvc((t2j0) daqVar.f2.get()), (xov0) daqVar.D6.get(), (i8h1) daqVar.A5.get(), new pdl0((byte) 5), (byte) 1);
                t0s0Var.G1 = (v0s0) ((jly0) ((h72) obj3).X).get();
                break;
            case 3:
                PremiumCheckoutActivity premiumCheckoutActivity = (PremiumCheckoutActivity) obj;
                daq daqVar2 = (daq) obj3;
                ((mzo) premiumCheckoutActivity).a1 = (jgu) daqVar2.a.g0.get();
                bih1 bih1VarC = svf.C((z5p) daqVar2.dk.get());
                PremiumCheckoutActivity premiumCheckoutActivity2 = (PremiumCheckoutActivity) obj2;
                mqv0 mqv0Var = (mqv0) premiumCheckoutActivity2.m1.getValue();
                c8o.m(mqv0Var);
                zxf zxfVar = mqv0Var.b;
                c8o.m(zxfVar);
                premiumCheckoutActivity.e1 = bih1VarC.e(zxfVar, premiumCheckoutActivity2);
                premiumCheckoutActivity.d1 = daqVar2.g0();
                mqv0 mqv0Var2 = (mqv0) premiumCheckoutActivity2.m1.getValue();
                c8o.m(mqv0Var2);
                premiumCheckoutActivity.b1 = new lrv0(new wqv0(mqv0Var2, (xqv0) ((RetrofitMaker) daqVar2.Y3.get()).createWebgateService(xqv0.class, "android-checkout-premium-checkout"), daqVar2.S1(), new t2b((byte) 20), daqVar2.g0(), (x8g) daqVar2.fk.get(), new l7m0(((z5p) daqVar2.dk.get()).a.e())), (Scheduler) daqVar2.r3.get(), (Scheduler) daqVar2.z1.get());
                premiumCheckoutActivity.c1 = daqVar2.S1();
                premiumCheckoutActivity.f1 = (zhh1) daqVar2.jk.get();
                break;
            case 4:
                k7c1 k7c1Var = (k7c1) obj;
                wj3 wj3Var = (wj3) obj3;
                ((hip) k7c1Var).F1 = (jgu) ((p2q) wj3Var.f).get();
                w4c1 w4c1Var = (w4c1) ((jly0) wj3Var.h).get();
                BehaviorSubject behaviorSubject = ((las0) ((jly0) wj3Var.i).get()).a;
                BehaviorSubject behaviorSubject2 = ((v6c1) ((jly0) wj3Var.t).get()).a;
                i8h1 i8h1Var = (i8h1) ((daq) wj3Var.c).A5.get();
                String strC = vwn.c();
                String str = ((CulturalMomentsStoryActivity) ((ks6) wj3Var.d).a).getViewUri().a;
                c8o.m(str);
                r6h1 r6h1Var = r6h1.c;
                daq daqVar3 = (daq) obj2;
                k7c1Var.K1 = new t7c1(w4c1Var, behaviorSubject, behaviorSubject2, new r2a1(i8h1Var, new h4l0(strC, str), (byte) 20), (q8n) daqVar3.r2.get(), (q8n) daqVar3.E1.get(), vwn.c());
                k7c1Var.I1 = new q881((fgi1) ((jly0) wj3Var.O0).get(), (byte) 27);
                k7c1Var.J1 = new rmr((qy7) ((jly0) wj3Var.N0).get(), (byte) 12);
                k7c1Var.H1 = new l5b1((k9c1) ((jly0) wj3Var.X).get(), (byte) 22);
                k7c1Var.G1 = new k7b1(1, (w4c1) ((jly0) wj3Var.h).get(), w4c1.class, "storyState", "storyState(I)Lcom/spotify/campaigns/storytelling/common/StoryState;", 0, (byte) 5);
                break;
            default:
                df81 df81Var = (df81) obj;
                df81Var.e2 = j380.l(zwv0.a, (szp) obj3);
                df81Var.d2 = (lzn0) ((teq) obj2).i.get();
                break;
        }
    }

    public /* synthetic */ a1q(dl4 dl4Var, iac0 iac0Var, byte b) {
        this.a = b;
        this.c = dl4Var;
        this.b = iac0Var;
    }

    public /* synthetic */ a1q(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public a1q(h72 h72Var, Flowable flowable) {
        this.a = (byte) 28;
        this.b = h72Var;
        this.c = new idd1(new sqm(flowable, this, (byte) 22));
    }

    public a1q(w4h w4hVar, String str) {
        this.a = (byte) 26;
        this.b = w4hVar;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.r(str);
        u4hVarQ.t(w5h.d);
        this.c = u4hVarQ.build();
    }

    public a1q(i8h1 i8h1Var, r6h1 r6h1Var) {
        this.a = (byte) 24;
        this.b = i8h1Var;
        this.c = new fjl0(r6h1Var, (byte) 6);
    }

    public a1q(p68 p68Var) {
        this.a = (byte) 6;
        this.b = p68Var;
        this.c = iy81.a(new uyp(this, (byte) 2));
    }

    public a1q(mzr0 mzr0Var) {
        this.a = (byte) 11;
        this.b = mzr0Var;
        this.c = iy81.a(new bpq(this, (byte) 6));
    }

    public a1q(lvc1 lvc1Var) {
        this.a = (byte) 16;
        this.b = lvc1Var;
        this.c = iy81.a(new hsq(this, (byte) 4));
    }

    public a1q(izp izpVar) {
        this.a = (byte) 13;
        this.b = izpVar;
        this.c = iy81.a(new bpq(this, (byte) 13));
    }

    public a1q(j4m1 j4m1Var, k4m1 k4m1Var) {
        this.a = (byte) 22;
        this.b = j4m1Var;
        this.c = xqu.b(new hsq(this, (byte) 26));
    }

    public a1q(zzp zzpVar, qop qopVar, obt obtVar) {
        this.a = (byte) 14;
        this.b = zzpVar;
        this.c = iy81.a(new bpq(this, (byte) 18));
    }

    public a1q(k3q k3qVar, qop qopVar) {
        this.a = (byte) 7;
        this.b = k3qVar;
        this.c = iy81.a(new uyp(this, (byte) 8));
    }

    public a1q(lwd1 lwd1Var, mwd1 mwd1Var, q7r0 q7r0Var) {
        this.a = (byte) 15;
        this.b = q7r0Var;
        this.c = new hsq(this, (byte) 1);
    }

    public a1q(hct hctVar, evh1 evh1Var) {
        this.a = (byte) 18;
        this.b = hctVar;
        this.c = xqu.b(new hsq(this, (byte) 13));
    }

    public a1q(ba91 ba91Var, ca91 ca91Var) {
        this.a = (byte) 12;
        this.b = ba91Var;
        this.c = xqu.b(new bpq(this, (byte) 9));
    }

    public a1q(v8i1 v8i1Var, w8i1 w8i1Var) {
        this.a = (byte) 19;
        this.b = v8i1Var;
        this.c = xqu.b(new hsq(this, (byte) 16));
    }

    public a1q(ac21 ac21Var, cc21 cc21Var, q7r0 q7r0Var) {
        this.a = (byte) 9;
        this.b = q7r0Var;
        this.c = new uyp(this, (byte) 25);
    }

    public a1q(vjj1 vjj1Var, ryj ryjVar, xjj1 xjj1Var) {
        this.a = (byte) 20;
        this.b = vjj1Var;
        this.c = xqu.b(new hsq(this, (byte) 20));
    }

    public a1q(r501 r501Var, ryj ryjVar, s501 s501Var) {
        this.a = (byte) 8;
        this.b = r501Var;
        this.c = xqu.b(new uyp(this, (byte) 21));
    }

    public a1q(klg1 klg1Var, cmg1 cmg1Var, q7r0 q7r0Var) {
        this.a = (byte) 17;
        this.b = q7r0Var;
        this.c = new hsq(this, (byte) 8);
    }

    public a1q(hvk1 hvk1Var, hwk1 hwk1Var, q7r0 q7r0Var) {
        this.a = (byte) 21;
        this.b = q7r0Var;
        this.c = new hsq(this, (byte) 23);
    }

    public a1q(wwk1 wwk1Var, zuj zujVar, v531 v531Var) {
        this.a = (byte) 10;
        this.b = wwk1Var;
        this.c = new uyp(this, (byte) 28);
    }

    public a1q(daq daqVar, teq teqVar) {
        this.a = (byte) 5;
        this.b = teqVar;
        this.c = new szp(daqVar, (byte) 12);
    }
}
