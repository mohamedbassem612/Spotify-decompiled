package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.culturalmoments.stories.CulturalMomentsStoryActivity;
import com.spotify.culturalmoments.stories.v1.FeaturedCardStory;
import com.spotify.culturalmoments.stories.v1.FullscreenVideoStory;
import com.spotify.culturalmoments.stories.v1.GetStoriesRequest;
import com.spotify.culturalmoments.stories.v1.GetStoriesResponse;
import com.spotify.culturalmoments.stories.v1.ImageOnImageStory;
import com.spotify.culturalmoments.stories.v1.PlaylistStory;
import com.spotify.culturalmoments.stories.v1.Story;
import com.spotify.referrals.service.v1.GetContextualEntrypointCopyForJamRequest;
import com.spotify.referrals.service.v1.GetContextualEntrypointCopyForJamResponse;
import com.spotify.referrals.service.v1.JamMember;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.internal.operators.completable.CompletableDoFinally;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hgo implements Function0 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;
    public final Object d;
    public final Object e;

    public /* synthetic */ hgo(Object obj, Object obj2, Object obj3, Object obj4, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
        this.d = obj3;
        this.e = obj4;
    }

    public static q0a0 f(GetContextualEntrypointCopyForJamResponse getContextualEntrypointCopyForJamResponse, String str) {
        return getContextualEntrypointCopyForJamResponse.getTitle().length() > 0 ? new p0a0(getContextualEntrypointCopyForJamResponse.getTitle(), getContextualEntrypointCopyForJamResponse.o(), getContextualEntrypointCopyForJamResponse.n(), str) : o0a0.a;
    }

    public Object a(hp90 hp90Var, List list, String str, h64 h64Var) {
        xl40 xl40VarO = GetContextualEntrypointCopyForJamRequest.o();
        xl40VarO.r(hp90Var.c);
        xl40VarO.q(str);
        List<hp90> list2 = list;
        ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
        for (hp90 hp90Var2 : list2) {
            ky90 ky90VarN = JamMember.n();
            ky90VarN.q(hp90Var2.c);
            ky90VarN.n(hp90Var2.b);
            arrayList.add(ky90VarN.build());
        }
        xl40VarO.n(arrayList);
        GetContextualEntrypointCopyForJamRequest getContextualEntrypointCopyForJamRequestBuild = xl40VarO.build();
        m911 m911Var = (m911) this.c;
        getContextualEntrypointCopyForJamRequestBuild.getClass();
        return m911Var.b(getContextualEntrypointCopyForJamRequestBuild, h64Var);
    }

    public mr20 d() {
        if (!((zz4) this.d).a()) {
            return new huz(o0a0.a, (byte) 10);
        }
        return new x010(new qw5(new ipr(new b911((pp90) null, (pp90) null), ((sw90) this.b).a.b.current(), new lok0(3, (lnm) null, (byte) 24), (byte) 16), (byte) 4), ((ov20) this.e).a("referrals-entrypoint-eligible", false), new h64((lnm) null, this), (byte) 1);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public m4c1 e(GetStoriesResponse getStoriesResponse) {
        ccb1 ccb1Var;
        h290 h290VarO = getStoriesResponse.o();
        ArrayList arrayList = new ArrayList();
        byte b = 0;
        int i = 0;
        for (Object obj : h290VarO) {
            int i2 = i + 1;
            e8c1 e8c1Var = null;
            if (i < 0) {
                p7h.T();
                throw null;
            }
            Story story = (Story) obj;
            int iR = story.r();
            int i3 = iR == 0 ? -1 : ggo.a[l1d.C(iR)];
            byte b2 = 1;
            if (i3 == -1) {
                ccb1Var = null;
            } else if (i3 == 1) {
                ImageOnImageStory imageOnImageStoryP = story.p();
                ccb1Var = new ccb1(new s8c1(imageOnImageStoryP, null), imageOnImageStoryP.o(), (byte) 11);
            } else if (i3 == 2) {
                FullscreenVideoStory fullscreenVideoStoryO = story.o();
                ccb1Var = new ccb1(new bu51(fullscreenVideoStoryO, (lnm) null, (byte) 10), fullscreenVideoStoryO.n(), (byte) 11);
            } else if (i3 == 3) {
                FeaturedCardStory featuredCardStoryN = story.n();
                ccb1Var = new ccb1(new u8c1(featuredCardStoryN, e8c1Var, b2), featuredCardStoryN.n(), (byte) 11);
            } else if (i3 != 4) {
                if (i3 != 5) {
                    eg.o();
                    return null;
                }
                ccb1Var = null;
            } else {
                PlaylistStory playlistStoryQ = story.q();
                ccb1Var = new ccb1(new u8c1(playlistStoryQ, e8c1Var, b), playlistStoryQ.o(), (byte) 11);
            }
            if (ccb1Var != null) {
                g1q g1qVar = (g1q) this.e;
                boolean z = i == p7h.L(getStoriesResponse.o()) ? 1 : b;
                p2p p2pVar = g1qVar.a;
                ks6 ks6Var = (ks6) p2pVar.d;
                daq daqVar = (daq) p2pVar.c;
                CulturalMomentsStoryActivity culturalMomentsStoryActivity = (CulturalMomentsStoryActivity) ks6Var.a;
                lzn0 lzn0Var = (lzn0) ((p2p) ks6Var.Q0).get();
                gw70 gw70Var = (gw70) daqVar.d8.get();
                yt91 yt91VarJ = ks6Var.j();
                daq daqVar2 = (daq) ks6Var.b;
                ua91 ua91Var = new ua91((woa) daqVar2.W8.get(), new dzp0("culturalmoments-stories-video-content", (woa) daqVar2.W8.get()), (v290) daqVar2.Kn.get(), (kma) daqVar2.a.s1.get(), (byte) 17);
                ie90 ie90Var = new ie90((Context) daqVar2.x1.a, (pe) daqVar2.p9.get());
                e8c1Var = (e8c1) ccb1Var.invoke(new g8c1(culturalMomentsStoryActivity, lzn0Var, gw70Var, yt91VarJ, z, ua91Var, ie90Var));
            }
            if (e8c1Var != null) {
                arrayList.add(e8c1Var);
            }
            i = i2;
            b = 0;
        }
        return new m4c1(arrayList);
    }

    public final Object invoke() {
        byte b = this.a;
        Uri uri = null;
        Object obj = this.d;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                try {
                    kq40 kq40VarN = GetStoriesRequest.n();
                    kq40VarN.n((String) this.c);
                    GetStoriesResponse getStoriesResponse = (GetStoriesResponse) ((y4c1) obj2).a((GetStoriesRequest) kq40VarN.build()).blockingGet();
                    j7c1 j7c1Var = (j7c1) obj;
                    String strN = getStoriesResponse.n();
                    if (strN != null) {
                        if (strN.length() <= 0) {
                            strN = null;
                        }
                        if (strN != null) {
                            try {
                                uri = Uri.parse(strN);
                                uri.getClass();
                            } catch (Exception unused) {
                                throw new IllegalStateException("Error parsing uri: ".concat(strN).toString());
                            }
                        }
                        break;
                    }
                    j7c1Var.d = uri;
                    return new o4c1(e(getStoriesResponse));
                } catch (Exception unused2) {
                    return n4c1.a;
                }
            case 1:
                return ((dxz0) this.e).e().flatMap(new ouz(this, (byte) 9));
            case 2:
                return d();
            case 3:
                Completable completableIgnoreElements = ((Observable) ((gjp0) obj2).invoke()).map(new l1p0(this, (byte) 3)).ignoreElements();
                wqd0 wqd0Var = new wqd0(this, (byte) 13);
                completableIgnoreElements.getClass();
                return new CompletableDoFinally(completableIgnoreElements, wqd0Var);
            case 4:
                return ((Observable) ((gjp0) obj2).invoke()).switchMapSingle(new hvp0(this, (byte) 3)).onErrorReturn(dj10.U0);
            default:
                return hu20.e(rqt0.u(((dg90) obj).d()), new db3((lnm) null, this));
        }
    }
}
