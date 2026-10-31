package p;

import android.content.Context;
import android.net.Uri;
import com.android.installreferrer.api.InstallReferrerClient$InstallReferrerResponse;
import com.spotify.fandomcollectibles.protos.BoxRevealStory;
import com.spotify.fandomcollectibles.protos.EntityButtonStory;
import com.spotify.fandomcollectibles.protos.EntityListStory;
import com.spotify.fandomcollectibles.protos.FanStampCardStory;
import com.spotify.fandomcollectibles.protos.FreeAchievementCardStory;
import com.spotify.fandomcollectibles.protos.GlobeStory;
import com.spotify.fandomcollectibles.protos.ImageTitleSubtitleStory;
import com.spotify.fandomcollectibles.protos.IntroStory;
import com.spotify.fandomcollectibles.protos.ListeningPartyCardStory;
import com.spotify.fandomcollectibles.protos.LottieStory;
import com.spotify.fandomcollectibles.protos.MediaAchievementCardStory;
import com.spotify.fandomcollectibles.protos.SingleEntityStory;
import com.spotify.fandomcollectibles.protos.Story;
import com.spotify.fandomcollectibles.protos.TitleStory;
import com.spotify.fandomcollectibles.stories.FandomCollectiblesStoryActivity;
import com.spotify.your_library_esperanto.proto.AlsoAvailableOfflineRequest;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.ObservableSource;
import io.reactivex.rxjava3.core.Single;
import java.io.ByteArrayInputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class gfr implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;

    public gfr(z0t z0tVar, t0t t0tVar) {
        this.a = (byte) 2;
        this.c = z0tVar;
        this.b = t0tVar;
        this.d = new idd1(new dor(this, (byte) 12));
    }

    public mr20 a() {
        return new lt20(hu20.d(new mr20[]{new x010((mr20) ((na) this.c).invoke(), yoi1.g(Observable.defer(new yj1((iov0) this.b, (byte) 27))), new lok0(3, (lnm) null, (byte) 22), (byte) 1), new uop0(yoi1.g((ObservableSource) ((gfr) this.d).invoke()), (byte) 23)}), new w1e0(3, (lnm) null, (byte) 20), (byte) 0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m4c1 d(d4c1 d4c1Var) {
        ccb1 ccb1Var;
        byte b;
        List list = d4c1Var.c;
        String str = d4c1Var.a;
        ArrayList arrayList = new ArrayList();
        byte b2 = 0;
        int i = 0;
        for (Object obj : list) {
            int i2 = i + 1;
            e8c1 e8c1Var = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            Story story = (Story) obj;
            int iZ = story.z();
            switch (iZ == 0 ? -1 : bl10.a[l1d.C(iZ)]) {
                case InstallReferrerClient$InstallReferrerResponse.SERVICE_DISCONNECTED /* -1 */:
                case 14:
                    ccb1Var = null;
                    break;
                case 0:
                default:
                    eg.o();
                    return null;
                case 1:
                    IntroStory introStoryU = story.u();
                    ccb1Var = new ccb1(new r8c1(introStoryU, null, b2), introStoryU.o(), (byte) 10);
                    break;
                case 2:
                    TitleStory titleStoryA = story.A();
                    ccb1Var = new ccb1(new r8c1(titleStoryA, null, (byte) 1), titleStoryA.o(), (byte) 10);
                    break;
                case 3:
                    LottieStory lottieStoryW = story.w();
                    ccb1Var = new ccb1(new o8c1(lottieStoryW, null), lottieStoryW.n(), (byte) 10);
                    break;
                case 4:
                    MediaAchievementCardStory mediaAchievementCardStoryX = story.x();
                    ccb1Var = new ccb1(new x8c1(mediaAchievementCardStoryX, str, null), mediaAchievementCardStoryX.x(), (byte) 10);
                    break;
                case 5:
                    ImageTitleSubtitleStory imageTitleSubtitleStoryT = story.t();
                    ccb1Var = new ccb1(new p8c1(imageTitleSubtitleStoryT, null, b2), imageTitleSubtitleStoryT.o(), (byte) 10);
                    break;
                case 6:
                    BoxRevealStory boxRevealStoryN = story.n();
                    ccb1Var = new ccb1(new q8c1(boxRevealStoryN, null, b2), boxRevealStoryN.o(), (byte) 10);
                    break;
                case 7:
                    GlobeStory globeStoryS = story.s();
                    ccb1Var = new ccb1(new q8c1(globeStoryS, null, (byte) 1), globeStoryS.o(), (byte) 10);
                    break;
                case 8:
                    EntityListStory entityListStoryP = story.p();
                    ccb1Var = new ccb1(new t8c1(entityListStoryP, null), entityListStoryP.o(), (byte) 10);
                    break;
                case 9:
                    ListeningPartyCardStory listeningPartyCardStoryV = story.v();
                    ccb1Var = new ccb1(new v8c1(listeningPartyCardStoryV, str, null), listeningPartyCardStoryV.p(), (byte) 10);
                    break;
                case 10:
                    FanStampCardStory fanStampCardStoryQ = story.q();
                    ccb1Var = new ccb1(new y8c1(fanStampCardStoryQ, str, null), fanStampCardStoryQ.p(), (byte) 10);
                    break;
                case 11:
                    FreeAchievementCardStory freeAchievementCardStoryR = story.r();
                    ccb1Var = new ccb1(new z8c1(freeAchievementCardStoryR, null), freeAchievementCardStoryR.n(), (byte) 10);
                    break;
                case 12:
                    EntityButtonStory entityButtonStoryO = story.o();
                    ccb1Var = new ccb1(new w8c1(entityButtonStoryO, (lnm) null), entityButtonStoryO.o(), (byte) 10);
                    break;
                case 13:
                    SingleEntityStory singleEntityStoryY = story.y();
                    ccb1Var = new ccb1(new p8c1(singleEntityStoryY, null, (byte) 1), singleEntityStoryY.o(), (byte) 10);
                    break;
            }
            if (ccb1Var != null) {
                y2q y2qVar = (y2q) this.d;
                boolean z = i == p7h.L(list) ? 1 : b2;
                s2q s2qVar = y2qVar.a;
                e93 e93Var = (e93) s2qVar.d;
                daq daqVar = s2qVar.b;
                FandomCollectiblesStoryActivity fandomCollectiblesStoryActivity = (FandomCollectiblesStoryActivity) e93Var.b;
                lzn0 lzn0Var = (lzn0) ((s2q) e93Var.R0).get();
                gw70 gw70Var = (gw70) daqVar.d8.get();
                hp91 hp91VarE = e93Var.e();
                daq daqVar2 = (daq) e93Var.c;
                woa woaVar = (woa) daqVar2.W8.get();
                new LinkedHashMap();
                b = 0;
                e8c1Var = (e8c1) ccb1Var.invoke(new f8c1(fandomCollectiblesStoryActivity, lzn0Var, gw70Var, hp91VarE, z, new r2a1(woaVar, (kma) daqVar2.a.t1.get(), (byte) 19), new xid((o241) daqVar2.u4.get(), (bjd) daqVar2.k9.get(), (byte) 0), (op31) daqVar.Z6.get(), new ie90((Context) daqVar2.x1.a, (pe) daqVar2.p9.get()), (mwm1) daqVar.j7.get()));
            } else {
                b = b2;
            }
            if (e8c1Var != null) {
                arrayList.add(e8c1Var);
            }
            b2 = b;
            i = i2;
            str = str;
            list = list;
        }
        return new m4c1(arrayList);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object e(List list, onm onmVar) {
        wrr wrrVar;
        String str;
        ttm1 ttm1Var;
        Integer numC0;
        Integer numC1;
        mq70 mq70Var;
        up70 up70VarA;
        if (onmVar instanceof wrr) {
            wrrVar = (wrr) onmVar;
            int i = wrrVar.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wrrVar.d = i - Integer.MIN_VALUE;
            } else {
                wrrVar = new wrr(this, onmVar);
            }
        } else {
            wrrVar = new wrr(this, onmVar);
        }
        Object objL = wrrVar.b;
        int i2 = wrrVar.d;
        if (i2 == 0) {
            hm5.M(objL);
            List list2 = list;
            ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
            Iterator it = list2.iterator();
            while (it.hasNext()) {
                arrayList.add(((pvc0) it.next()).c);
            }
            Observable observableTimeout = ((uu00) this.d).b(new oi("your_library_curated_artists", false, new ib5(arrayList, (byte) 10))).filter(drm0.U0).timeout(10L, TimeUnit.SECONDS, Observable.error(new TimeoutException()));
            wrrVar.a = list;
            wrrVar.d = 1;
            objL = fc11.l(observableTimeout, 1, (Object) null, wrrVar);
            d9n d9nVar = d9n.a;
            if (objL == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            list = wrrVar.a;
            hm5.M(objL);
        }
        uv00 uv00Var = (uv00) objL;
        ArrayList arrayList2 = new ArrayList();
        for (pvc0 pvc0Var : list) {
            String str2 = pvc0Var.c;
            Map map = pvc0Var.f;
            jo70 jo70Var = uv00Var.a(jo70.class, str2).b;
            if (jo70Var == null) {
                ttm1Var = null;
            } else {
                xkk1 xkk1Var = uv00Var.a(xkk1.class, pvc0Var.c).b;
                if (xkk1Var == null || (mq70Var = xkk1Var.a) == null || (up70VarA = mq70Var.a(vp70.c)) == null || (str = up70VarA.a.a) == null) {
                    str = "";
                }
                String str3 = str;
                String str4 = (String) map.get("track_count");
                int iIntValue = (str4 == null || (numC1 = nhc1.c0(str4)) == null) ? 0 : numC1.intValue();
                String str5 = (String) map.get("num_releases");
                ttm1Var = new ttm1(pvc0Var.c, jo70Var.a, str3, aey.f, new ho6(false, iIntValue, (str5 == null || (numC0 = nhc1.c0(str5)) == null) ? 0 : numC0.intValue()));
            }
            if (ttm1Var != null) {
                arrayList2.add(ttm1Var);
            }
        }
        return new ip3(arrayList2);
    }

    public final Object invoke() {
        byte b = this.a;
        byte b2 = 10;
        Uri uri = null;
        o6x o6xVar = o6x.a;
        Object obj = this.d;
        Object obj2 = this.b;
        Object obj3 = this.c;
        switch (b) {
            case 0:
                return !((evm1) obj2).g() ? Observable.empty() : Observable.combineLatest(((mwm1) obj3).callStream("spotify.your_library_esperanto.proto.YourLibraryService", "StreamAlsoAvailableOffline", AlsoAvailableOfflineRequest.n()).map(o9x0.X0).filter(zhm0.S0).map(drm0.T0).distinctUntilChanged().retryWhen(cq41.U0), yoi1.i(((lut0) obj).c, o6xVar).distinctUntilChanged(), new fza(this, (byte) 6)).distinctUntilChanged();
            case 1:
                if (((evm1) obj2).F()) {
                    return yoi1.i(new qer(rqt0.u(new dkm(((xrc0) obj3).n(new qvc0("spotify:list:curated-artists:top", (c3d0) null, (Set) null, (mqz0) null, 14)), (byte) 27)), this, (byte) 11), o6xVar).retryWhen(zhm0.T0);
                }
                return Observable.empty();
            case 2:
                t0t t0tVar = (t0t) obj2;
                return yoi1.i(new x010(t0tVar.c(fsm1.a), t0tVar.c(gsm1.a), new cq2(this, (lnm) null, (byte) 2), (byte) 1), o6xVar);
            case 3:
                return ((z0t) obj).a.n() ? new huz(Boolean.TRUE, (byte) 10) : rqt0.u(new x010(yoi1.g((Observable) ((idd1) ((iir) obj2).c).getValue()), (mr20) ((d3s) obj3).invoke(), new ew0(this, (lnm) null, (byte) 18), (byte) 1));
            case 4:
                return ((tja0) obj3).a((ByteArrayInputStream) obj2, (vz00) ((ks6) ((fit) obj).b.b).O0);
            case 5:
                try {
                    d4c1 d4c1VarW = ((zsc) obj3).w();
                    i7c1 i7c1Var = (i7c1) obj2;
                    String str = d4c1VarW.b;
                    if (str != null) {
                        if (str.length() <= 0) {
                            str = null;
                        }
                        if (str != null) {
                            try {
                                uri = Uri.parse(str);
                                uri.getClass();
                            } catch (Exception unused) {
                                throw new IllegalStateException("Error parsing uri: ".concat(str).toString());
                            }
                        }
                        break;
                    }
                    i7c1Var.d = uri;
                    return new o4c1(d(d4c1VarW));
                } catch (Exception unused2) {
                    return n4c1.a;
                }
            case 6:
                vbm[] vbmVarArr = q601.a;
                return new evz(new huz(new dy20(new kge((Flowable) obj2), (byte) 1), (byte) 12), this, (byte) 24);
            case 7:
                yqb0 yqb0Var = (yqb0) obj3;
                return new soe0((voe0) ((uw0) yqb0Var.b.b).d, new vqb0(yqb0Var, (sb11) obj2, (p811) obj));
            case 8:
                return ((Single) ((x5u) obj3).invoke()).flatMapCompletable(new hod0(this, b2));
            case 9:
                return ((Observable) ((gfr) obj3).invoke()).flatMap(new qkn0(this, (byte) 6)).doOnNext(zzc0.Q0);
            case 10:
                return Observable.combineLatest((ObservableSource) ((na) obj3).invoke(), ((Observable) ((na) obj).invoke()).flatMap(new dip0((Observable) obj2, (byte) 0)), new jma(this, (byte) 18));
            case 11:
                return a();
            case 12:
                String str2 = (String) obj3;
                mla0 mla0Var = (mla0) obj2;
                bey0 bey0Var = (bey0) obj;
                mbh0 mbh0VarD = mla0.a.d(str2);
                if (mbh0VarD != null) {
                    return mla0Var.x(Integer.parseInt((String) mbh0VarD.a().get(1)), str2);
                }
                if (mla0Var instanceof ema0) {
                    return new q7b0(mla0Var, str2, bey0Var.getBoundReceiver(), mla0Var.A(bey0Var.getName(), str2));
                }
                return new ggt(mla0Var, bey0Var.getName(), str2, bey0Var.getBoundReceiver());
            case 13:
                String str3 = (String) obj3;
                mla0 mla0Var2 = (mla0) obj2;
                den0 den0Var = (den0) obj;
                mbh0 mbh0VarD2 = mla0.a.d(str3);
                if (mbh0VarD2 != null) {
                    return mla0Var2.x(Integer.parseInt((String) mbh0VarD2.a().get(1)), str3);
                }
                if (mla0Var2 instanceof ema0) {
                    return new a7b0(mla0Var2, str3, den0Var.getBoundReceiver(), mla0Var2.A(den0Var.getName(), str3));
                }
                return new pft(mla0Var2, den0Var.getName(), str3, den0Var.getBoundReceiver());
            case 14:
                mla0 mla0Var3 = (mla0) obj3;
                cey0 cey0Var = (cey0) obj2;
                String str4 = (String) obj;
                if (mla0Var3 instanceof ema0) {
                    return new t7b0(mla0Var3, str4, cey0Var.getBoundReceiver(), mla0Var3.A(cey0Var.getName(), str4));
                }
                return new jgt(mla0Var3, cey0Var.getName(), str4, cey0Var.getBoundReceiver());
            case 15:
                mla0 mla0Var4 = (mla0) obj3;
                een0 een0Var = (een0) obj2;
                String str5 = (String) obj;
                if (mla0Var4 instanceof ema0) {
                    return new c7b0(mla0Var4, str5, een0Var.getBoundReceiver(), mla0Var4.A(een0Var.getName(), str5));
                }
                return new rft(mla0Var4, een0Var.getName(), str5, een0Var.getBoundReceiver());
            case 16:
                ((db51) obj3).V0 = ((t551) obj2).a((String) obj);
                return rih1.a;
            default:
                return Observable.combineLatest(yoi1.i((mr20) ((d3s) obj).invoke(), o6xVar), ((xvo) obj3).a(true).map(r5x0.a1), ((kiu0) obj2).a(false), r6x0.Z0).distinctUntilChanged();
        }
    }

    public /* synthetic */ gfr(Object obj, Object obj2, Object obj3, byte b) {
        this.a = b;
        this.c = obj;
        this.b = obj2;
        this.d = obj3;
    }

    public gfr(xrc0 xrc0Var, uu00 uu00Var, evm1 evm1Var) {
        this.a = (byte) 1;
        this.c = xrc0Var;
        this.d = uu00Var;
        this.b = evm1Var;
    }
}
