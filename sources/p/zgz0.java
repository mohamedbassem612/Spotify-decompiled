package p;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import com.spotify.assistedcuration.endpointsimpl.assistedcurationsearch.v1.SearchProto$MainViewUriResponse;
import com.spotify.base.java.logging.Logger;
import com.spotify.common.uri.SpotifyUriParserException;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.nowplaying.scroll.ScrollCardType;
import com.spotify.recentlyplayed.recentlyplayed.RecentlyPlayedResponse;
import com.spotify.time.esperanto.proto.EsServerTime;
import com.spotify.transcript.commons.views.ElementContainer;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.autodownload.esperanto.proto.DisableAllEnabledShowsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class zgz0 implements xfp0, qiw, Predicate, Function, Producer {
    public final /* synthetic */ byte a;
    public Object b;

    public zgz0(r9c r9cVar, dp01 dp01Var) {
        this.a = (byte) 2;
        this.b = r9cVar;
    }

    public Observable a(Context context) {
        if (!((spq0) this.b).c()) {
            return Observable.create(new h341(this, context, (byte) 3));
        }
        jah.g("bind can only be called once!");
        return null;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 4:
                sjj0 sjj0Var = ((o411) this.b).b;
                List list = ((v411) obj).a;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                Iterator it = list.iterator();
                while (it.hasNext()) {
                    arrayList.add(((y411) it.next()).a);
                }
                return sjj0Var.a(arrayList);
            case 5:
                return new zyd0(((gxd0) this.b).a);
            case 6:
            case 10:
            case 11:
            case 13:
            case 14:
            case 15:
            case 16:
            case 18:
            case 19:
            case 21:
            default:
                return ((nt8) this.b).a.callSingle("spotify.autodownload_esperanto.proto.AutoDownloadService", "DisableAllEnabledShows", DisableAllEnabledShowsRequest.n()).map(mpi1.X).ignoreElement();
            case 7:
                p021 p021Var = (p021) this.b;
                return p021Var.e.d(p021Var.d).map(new uxy0(p021Var, (Integer) obj, (byte) 22));
            case 8:
                c301 c301Var = (c301) this.b;
                return new v301(c301Var.a, c301Var.b, c301Var.c, (Throwable) obj);
            case 9:
                g2x0 g2x0Var = (g2x0) this.b;
                if (((l651) g2x0Var.b) == l651.b) {
                    return Observable.empty();
                }
                z211 z211Var = (z211) g2x0Var.c;
                return z211Var.d.a(true).flatMapCompletable(new rpv0(z211Var, (byte) 15)).d(Observable.empty());
            case 12:
                bo31 bo31Var = (bo31) this.b;
                return rqt0.F(bo31Var.l, new elu0((vo3) obj, bo31Var, (lnm) null));
            case 17:
                SearchProto$MainViewUriResponse searchProto$MainViewUriResponse = (SearchProto$MainViewUriResponse) obj;
                return ((py41) this.b).a.a(searchProto$MainViewUriResponse.getUrisList()).map(new s6z0(searchProto$MainViewUriResponse, (byte) 19));
            case 20:
                return new CompletableFromAction(new sr51((zr51) this.b, (byte) 2)).w();
            case 22:
                mi91 mi91Var = (mi91) obj;
                return new CompletableFromAction(new afe((il91) this.b, mi91Var.e, mi91Var.f, (byte) 5)).x(new yi91(true, mi91Var)).onErrorReturnItem(new yi91(false, mi91Var)).toObservable();
            case 23:
                EsServerTime.ServerTime serverTime = (EsServerTime.ServerTime) obj;
                return new c961(serverTime.q() ? Long.valueOf(serverTime.o()) : null, (t8r0) this.b, serverTime.p());
            case 24:
                return ((Single) this.b).map(new ps6((List) obj, (byte) 2));
        }
    }

    public jgb1 b() {
        c0g.x.getClass();
        return new jgb1("showFollowersFollowing", 2131961997, (String) null, 2131961996, (sp00) null, (Integer) null, (a2i) null, (mr20) null, cxo1.P0, ((pcl) this.b).a(), new ibd1(new xad1(44, false), new abd1(rc11.a.b(h581.class))), (Map) null, 73658);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:57:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:60:0x0101  */
    /* JADX WARN: Code duplicated, block: B:63:0x0112  */
    /* JADX WARN: Code duplicated, block: B:66:0x011b  */
    /* JADX WARN: Code duplicated, block: B:69:0x011f  */
    /* JADX WARN: Code duplicated, block: B:71:0x012d  */
    /* JADX WARN: Code duplicated, block: B:74:0x0134  */
    /* JADX WARN: Code duplicated, block: B:7:0x001b  */
    /* JADX WARN: Code duplicated, block: B:82:0x0149  */
    /* JADX WARN: Code duplicated, block: B:85:0x014d  */
    /* JADX WARN: Code duplicated, block: B:88:0x0156  */
    public Object c(String str, onm onmVar) {
        nm11 nm11Var;
        zgz0 zgz0Var;
        String str2;
        ArrayList arrayList;
        qxc0 qxc0Var;
        String str3;
        String str4;
        String str5;
        String str6 = str;
        if (onmVar instanceof nm11) {
            nm11Var = (nm11) onmVar;
            int i = nm11Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                nm11Var.d = i - Integer.MIN_VALUE;
                zgz0Var = this;
            } else {
                zgz0Var = this;
                nm11Var = new nm11(zgz0Var, onmVar);
            }
        } else {
            zgz0Var = this;
            nm11Var = new nm11(zgz0Var, onmVar);
        }
        Object objS = nm11Var.b;
        int i2 = nm11Var.d;
        om11 om11Var = null;
        try {
            if (i2 == 0) {
                hm5.M(objS);
                try {
                    str2 = new y6b1(str6, false).e;
                    if (str2 == null) {
                        str2 = "";
                    }
                    if (str2.length() <= 0) {
                        str2 = null;
                    }
                } catch (SpotifyUriParserException unused) {
                }
                if (str2 != null) {
                    String strF = f4i1.f("spotify:list:mvcdp-related-items-related-releases:", str2, "");
                    xd1 xd1Var = new xd1(zgz0Var, new qvc0(strF, (c3d0) null, (Set) null, (mqz0) null, 14), new rxc0(strF), (lnm) null, (byte) 23);
                    nm11Var.a = str6;
                    nm11Var.d = 1;
                    objS = smo1.s(xd1Var, nm11Var);
                    d9n d9nVar = d9n.a;
                    if (objS == d9nVar) {
                        return d9nVar;
                    }
                }
                return null;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str6 = nm11Var.a;
            hm5.M(objS);
            mmr0 mmr0Var = (mmr0) objS;
            oy21 oy21Var = (py21) mmr0Var.a;
            oy21 oy21Var2 = (py21) mmr0Var.b;
            if (oy21Var instanceof oy21) {
                Iterable iterable = (Iterable) oy21Var.a;
                ArrayList arrayList2 = new ArrayList(q7h.U(iterable, 10));
                Iterator it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList2.add(((pvc0) it.next()).c);
                }
                arrayList = new ArrayList();
                for (Object obj : arrayList2) {
                    if (((String) obj).length() > 0) {
                        arrayList.add(obj);
                    }
                }
                if (arrayList.isEmpty()) {
                }
                if (arrayList != null) {
                    if (oy21Var2 instanceof oy21) {
                        qxc0Var = (qxc0) oy21Var2.a;
                    } else {
                        if (oy21Var2 instanceof ly21) {
                            eg.o();
                            return null;
                        }
                        Logger.d("RelatedReleasesDataSource: failed to fetch metadata for %s: %s", new Object[]{str6, ((ly21) oy21Var2).a});
                        qxc0Var = null;
                    }
                    if (qxc0Var != null) {
                        str3 = qxc0Var.a;
                        if (str3.length() <= 0) {
                            str3 = null;
                        }
                        if (str3 != null) {
                            Map map = qxc0Var.X;
                            str4 = (String) map.get("mvcdp.navigation_uri");
                            if (str4 != null) {
                                if (str4.length() <= 0) {
                                    str4 = null;
                                }
                                if (str4 != null && (str5 = (String) map.get("mvcdp.navigation_text")) != null) {
                                    if (str5.length() <= 0) {
                                        str5 = null;
                                    }
                                    if (str5 != null) {
                                        om11Var = new om11(str5, str4);
                                    }
                                }
                            }
                            return new pm11(str3, arrayList, om11Var);
                        }
                    }
                }
                return null;
            }
            if (!(oy21Var instanceof ly21)) {
                eg.o();
                return null;
            }
            Logger.d("RelatedReleasesDataSource: failed to fetch items for %s: %s", new Object[]{str6, ((ly21) oy21Var).a});
            arrayList = null;
            if (arrayList != null) {
                if (oy21Var2 instanceof oy21) {
                    qxc0Var = (qxc0) oy21Var2.a;
                } else {
                    if (oy21Var2 instanceof ly21) {
                        eg.o();
                        return null;
                    }
                    Logger.d("RelatedReleasesDataSource: failed to fetch metadata for %s: %s", new Object[]{str6, ((ly21) oy21Var2).a});
                    qxc0Var = null;
                }
                if (qxc0Var != null) {
                    str3 = qxc0Var.a;
                    if (str3.length() <= 0) {
                        str3 = null;
                    }
                    if (str3 != null) {
                        Map map2 = qxc0Var.X;
                        str4 = (String) map2.get("mvcdp.navigation_uri");
                        if (str4 != null) {
                            if (str4.length() <= 0) {
                                str4 = null;
                            }
                            if (str4 != null) {
                                if (str5.length() <= 0) {
                                    str5 = null;
                                }
                                if (str5 != null) {
                                    om11Var = new om11(str5, str4);
                                }
                            }
                        }
                        return new pm11(str3, arrayList, om11Var);
                    }
                }
            }
            return null;
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "RelatedReleasesDataSource: failed to fetch list for %s", new Object[]{str6});
            return null;
        }
    }

    public void d(Object obj) {
        ((dkl) this.b).accept(obj);
    }

    public ArrayList e(xy01 xy01Var, lby lbyVar, d8r0 d8r0Var, String str) {
        int i;
        ArrayList arrayList = new ArrayList();
        if (xy01Var != null) {
            ArrayList arrayList2 = xy01Var.b;
            if (!arrayList2.isEmpty() && (i = xy01Var.a) != 8) {
                char c = 1;
                if (i != 1) {
                    tb51 tb51Var = (tb51) this.b;
                    String string = lbyVar.b;
                    Activity activity = tb51Var.a;
                    int iC = l1d.C(i);
                    if (iC == 1) {
                        string = activity.getResources().getString(2131960979, string);
                    } else if (iC == 2) {
                        string = activity.getResources().getString(2131960980, string);
                    } else if (iC == 4) {
                        string = activity.getResources().getString(2131960982);
                    } else if (iC == 6) {
                        string = activity.getResources().getString(2131960981);
                    }
                    String str2 = string;
                    String str3 = lbyVar.a;
                    ArrayList arrayList3 = new ArrayList();
                    for (Object obj : arrayList2) {
                        jd11 jd11Var = rc11.a;
                        tka0 tka0VarB = jd11Var.b(i53.class);
                        tka0 tka0VarB2 = jd11Var.b(jb6.class);
                        tka0 tka0VarB3 = jd11Var.b(k48.class);
                        char c2 = c;
                        tka0 tka0VarB4 = jd11Var.b(tfu0.class);
                        tka0[] tka0VarArr = new tka0[4];
                        tka0VarArr[0] = tka0VarB;
                        tka0VarArr[c2] = tka0VarB2;
                        tka0VarArr[2] = tka0VarB3;
                        tka0VarArr[3] = tka0VarB4;
                        if (p7h.M(tka0VarArr).contains(jd11Var.b(((lby) obj).e.getClass()))) {
                            arrayList3.add(obj);
                        }
                        c = c2;
                    }
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    int i2 = 0;
                    for (Object obj2 : arrayList3) {
                        int i3 = i2 + 1;
                        if (i2 < 0) {
                            p7h.T();
                            throw null;
                        }
                        lby lbyVar2 = (lby) obj2;
                        arrayList4.add(new qw01(gxo1.i(lbyVar2.e), i2, 1, lbyVar2.a, lbyVar2.b, lbyVar2.c, str, lbyVar.a, d8r0Var, h4o1.p(lbyVar2)));
                        i2 = i3;
                    }
                    arrayList.add(new pul(new tw01(1, str3, str, str2, arrayList4, d8r0Var)));
                }
            }
        }
        return arrayList;
    }

    public Observable f() {
        return yoi1.i(((dma1) this.b).q(lu71.a), o6x.a).filter(ytw0.f).map(i2x0.t).startWith(Observable.fromCallable(new sra(this, (byte) 22))).distinctUntilChanged();
    }

    public void g(iua iuaVar) {
        int i = iuaVar.a;
        ((SingleEmitter) this.b).onSuccess(i == 0 ? new h231(9, new IllegalStateException("null config.countryCode")) : new b231(9, i, iuaVar.c));
    }

    public Object get() {
        return new DispatcherWorker(((t551) this.b).f);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object h(String str, String str2, onm onmVar) {
        xc31 xc31Var;
        if (onmVar instanceof xc31) {
            xc31Var = (xc31) onmVar;
            int i = xc31Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                xc31Var.c = i - Integer.MIN_VALUE;
            } else {
                xc31Var = new xc31(this, onmVar);
            }
        } else {
            xc31Var = new xc31(this, onmVar);
        }
        Object objF = xc31Var.a;
        int i2 = xc31Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objF);
                bfd bfdVar = (bfd) this.b;
                xc31Var.c = 1;
                objF = bfdVar.F(str, str2, xc31Var);
                d9n d9nVar = d9n.a;
                if (objF == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objF);
            }
            return (goe) objF;
        } catch (Throwable th) {
            return new m231(th);
        }
    }

    public void i(String str, String str2, String str3, int i, String str4, String str5, String str6, int i2, tv80 tv80Var) {
        vm71 vm71Var;
        wa71 wa71Var = new wa71(str, (String) null, (cqs0) null, (dqi1) null, str2, (String) null, (Bundle) null, 110);
        xh71 xh71Var = (xh71) this.b;
        Bundle bundleH = mno1.h(new mmr0[]{new mmr0("music_guesser.game_id", str4), new mmr0("music_guesser.share_card_url", str3), new mmr0("music_guesser.background_color", Integer.valueOf(i)), new mmr0("music_guesser.share_preview_title", str5), new mmr0("music_guesser.share_preview_description", str6)});
        int iC = l1d.C(i2);
        if (iC == 0) {
            vm71Var = wm71.b;
        } else {
            if (iC != 1) {
                eg.o();
                return;
            }
            vm71Var = new vm71("inline_action");
        }
        xh71.b(xh71Var, wa71Var, bundleH, vm71Var, tv80Var, (List) null, 16);
    }

    public void onError(Throwable th) {
        j2h1.q("ObserverToConsumerAdapter");
    }

    public boolean test(Object obj) {
        return ((r9c) this.b).p || dp01.e((RecentlyPlayedResponse) obj);
    }

    public void v(Object obj) {
        switch (this.a) {
            case 1:
                mmr0 mmr0Var = (mmr0) obj;
                a901 a901Var = (a901) this.b;
                String str = (String) mmr0Var.a;
                String str2 = (String) mmr0Var.b;
                u060 u060VarA = a901Var.c.a(a901Var);
                boolean z = a901Var.e.b;
                l060 l060Var = new l060(str, str2, z ? 1 : 2, z ? 2 : 3);
                ElementContainer elementContainer = a901Var.f;
                qtw qtwVarA = f6o1.A(u060VarA, a901Var.a.getLayoutParams(), (ScrollCardType) null, 2);
                elementContainer.removeAllViews();
                tka0 tka0Var = dtw.C;
                elementContainer.addView(mhc.b(elementContainer.getContext(), elementContainer, qtwVarA, l060Var, (ipb1) null, 112).w);
                break;
            default:
                b851 b851Var = (b851) obj;
                wmy wmyVar = (wmy) ((g931) ((q450) this.b).i).d;
                if (wmyVar != null) {
                    ((rw41) wmyVar.e).i = b851Var;
                }
                break;
        }
    }

    public /* synthetic */ zgz0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }
}
