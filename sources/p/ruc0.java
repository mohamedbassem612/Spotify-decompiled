package p;

import android.content.res.Resources;
import android.graphics.Color;
import android.media.browse.MediaBrowser;
import android.os.Bundle;
import android.os.Parcel;
import android.service.media.MediaBrowserService;
import android.widget.TextView;
import com.google.android.gms.cast.MediaInfo;
import com.google.android.gms.tasks.Task;
import com.spotify.kidsaccount.api.v2.proto.CreateChildLoginTokenRequest;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.player.model.Context$Metadata;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Metadata;
import com.spotify.player.model.PlayerState;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function4;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import io.reactivex.rxjava3.internal.operators.completable.CompletableFromAction;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.UUID;
import org.json.JSONObject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ruc0 implements nzc, ya, qiw, Function, k2r, Init, i2q0, oi30, Function4, aiy {
    public final /* synthetic */ byte a;
    public final Object b;

    public ruc0(ov20 ov20Var) {
        this.a = (byte) 29;
        bw20 bw20Var = (bw20) ov20Var;
        this.b = new x010(new any(rqt0.u(new any(bw20Var.c("type", ""), (byte) 19)), (byte) 20), bw20Var.a("offline", false), new irp0(3, (lnm) null, (byte) 1), (byte) 1);
    }

    public static boolean d(wrp0 wrp0Var) {
        if (wrp0Var.b || wrp0Var.d) {
            return false;
        }
        return wrp0Var.a || !wrp0Var.c;
    }

    public static Map g(PlayerState playerState) {
        j380 j380VarMetadata;
        ContextTrack contextTrack = (ContextTrack) playerState.track().h();
        return (contextTrack == null || (j380VarMetadata = contextTrack.metadata()) == null) ? b7x.a : j380VarMetadata;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0068  */
    /* JADX WARN: Code duplicated, block: B:25:0x006e  */
    public Object N(Object obj, Object obj2, Object obj3, Object obj4) {
        PlayerState playerState = (PlayerState) obj;
        Boolean bool = (Boolean) obj2;
        Boolean bool2 = (Boolean) obj3;
        spq0 spq0Var = (spq0) obj4;
        ContextTrack contextTrack = (ContextTrack) playerState.track().b();
        if (spq0Var.c()) {
            blb blbVar = ((rzh) spq0Var.b()).c;
            if (blbVar instanceof blb) {
                return new t9m(blbVar.a, 1);
            }
            if (blbVar instanceof clb) {
                return new t9m(((clb) blbVar).a, 2);
            }
        } else if (((gh4) this.b).j()) {
            contextTrack.getClass();
            if (s3o1.v(contextTrack, false) || o4p1.s(playerState)) {
                if (bool2.booleanValue()) {
                    return z9m.a;
                }
            }
        } else {
            contextTrack.getClass();
            if (s3o1.v(contextTrack, false) && !bool.booleanValue()) {
                if (bool2.booleanValue()) {
                    return z9m.a;
                }
            }
        }
        return u9m.a;
    }

    public rqw a(zhy zhyVar) {
        return n3o1.q(zhyVar).a(new x3o0(this, (byte) 5), n3o0.a1);
    }

    public boolean accept(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 1:
                return ((rp4) obj2).a() && ((ksk) obj).c == le30.T0;
            default:
                return ((ksk) obj).c == le30.W0 && ((m980) obj2).b;
        }
    }

    public Object apply(Object obj) {
        List listL1;
        int i;
        int i2;
        int i3;
        byte b = 2;
        switch (this.a) {
            case 4:
                dxd0 dxd0Var = (dxd0) obj;
                lbu0 lbu0Var = (lbu0) ((hod0) this.b).b;
                return lbu0Var.a.b(new lqd0(dxd0Var.a, dxd0Var.b)).e(Single.defer(new yj1(lbu0Var, (byte) 20))).flatMapCompletable(new rut0(lbu0Var, b)).p(new sks0(lbu0Var, (byte) 5)).e(Single.just(hyd0.a));
            case 6:
                fnh fnhVar = (fnh) this.b;
                return new uoh(fnhVar.a, fnhVar.b, fnhVar.c, (Throwable) obj);
            case 9:
                bza0 bza0Var = (bza0) this.b;
                String str = ((mew) obj).a;
                iza0 iza0Var = bza0Var.a;
                qjn qjnVarO = CreateChildLoginTokenRequest.o();
                qjnVarO.n(str);
                return iza0Var.h(qjnVarO.build()).map(new ye90(str, bza0Var, (byte) 8)).toObservable().map(yi20.X).onErrorReturn(zi20.i);
            case 11:
                tb0 tb0Var = (tb0) obj;
                if (tb0Var instanceof ob0) {
                    return new CompletableFromAction(new tt60((vqb0) this.b, tb0Var, (byte) 2));
                }
                if (tb0Var.equals(pb0.a) || tb0Var.equals(qb0.a) || (tb0Var instanceof sb0)) {
                    return CompletableEmpty.a;
                }
                eg.o();
                return null;
            case 18:
                xbm xbmVar = ((y9m0) obj).e;
                xbmVar.L().h = ((sam0) this.b).a;
                klm klmVarW = xbmVar.W();
                sam0 sam0Var = (sam0) this.b;
                String str2 = sam0Var.d;
                pam0 pam0Var = new pam0(sam0Var, xbmVar, (byte) 0);
                klmVarW.getClass();
                pam0Var.invoke();
                long jC = klmVarW.a.c();
                zlb1 zlb1Var = klmVarW.g;
                if (zlb1Var instanceof zlb1) {
                    zlb1 zlb1Var2 = zlb1Var;
                    long j = zlb1Var2.d.c;
                    long j2 = jC - j;
                    synchronized (zlb1Var2.e) {
                        listL1 = o7h.l1(zlb1Var.e);
                    }
                    List list = listL1;
                    boolean z = list instanceof Collection;
                    if (z && list.isEmpty()) {
                        i = 0;
                    } else {
                        Iterator it = list.iterator();
                        i = 0;
                        while (it.hasNext()) {
                            if (((sfh0) it.next()).b == 1 && (i = i + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    mmr0 mmr0Var = new mmr0("eager_services_count", String.valueOf(i));
                    if (z && list.isEmpty()) {
                        i2 = 0;
                    } else {
                        Iterator it2 = list.iterator();
                        i2 = 0;
                        while (it2.hasNext()) {
                            long j3 = j2;
                            if (((sfh0) it2.next()).b == 2 && (i2 = i2 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                            j2 = j3;
                        }
                    }
                    long j4 = j2;
                    mmr0 mmr0Var2 = new mmr0("startup_operations_count", String.valueOf(i2));
                    if (z && list.isEmpty()) {
                        i3 = 0;
                    } else {
                        Iterator it3 = list.iterator();
                        i3 = 0;
                        while (it3.hasNext()) {
                            if (((sfh0) it3.next()).b == 3 && (i3 = i3 + 1) < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                    klmVarW.a.d(new tfh0(str2, j, j4, o7h.N0(o7h.d1(k4p1.C(list), 50), Collections.singletonList(zlb1Var2.d)), sqg0.O(sqg0.J(new mmr0[]{mmr0Var, mmr0Var2, new mmr0("plugins_count", String.valueOf(i3))}), klmVarW.b)));
                }
                klmVarW.g = xlb1.d;
                sam0 sam0Var2 = (sam0) this.b;
                sam0Var2.f.b(sam0Var2.d);
                sam0 sam0Var3 = (sam0) this.b;
                yue0 yue0Var = sam0Var3.e;
                String str3 = sam0Var3.a;
                synchronized (yue0Var.a) {
                    yue0Var.a.add(str3);
                    Set setP1 = o7h.p1(yue0Var.a);
                    setP1.toString();
                    yue0Var.b.onNext(setP1);
                }
                return new cam0(xbmVar);
            case 21:
                p2o0 p2o0Var = (p2o0) this.b;
                return p2o0Var.D().doOnSuccess(new lrj0(p2o0Var, (byte) 14)).flatMapObservable(new m4e0((Boolean) obj, (byte) 15));
            case 22:
                PlayerState playerState = (PlayerState) obj;
                sbk sbkVar = (sbk) this.b;
                if (((jo91) sbkVar.g).b()) {
                    return ((ip91) sbkVar.e).j();
                }
                Completable completableIgnoreElement = ((w9u0) sbkVar.d).a(new l9u0()).ignoreElement();
                mzr0 mzr0Var = (mzr0) sbkVar.f;
                return completableIgnoreElement.c(j2h1.D((q8n) mzr0Var.d, new p651(mzr0Var, ((ContextTrack) playerState.track().b()).uri(), playerState.contextUri(), ((ContextTrack) playerState.track().b()).uid(), (lnm) null, (byte) 17)));
            case 23:
                String str4 = ((y781) this.b).a;
                Object obj2 = ((sy21) obj).b;
                obj2.getClass();
                return new pmq0(str4, ((Boolean) obj2).booleanValue());
            default:
                return ((Boolean) obj).booleanValue() ? new rg60((chy) ((fkp0) this.b).d.getValue()) : xi10.f;
        }
    }

    public Object attachCompleter(mzc mzcVar) {
        suc0 suc0Var = (suc0) this.b;
        o0c.q("The result can only set once!", suc0Var.f == null);
        suc0Var.f = mzcVar;
        return "ListFuture[" + this + "]";
    }

    public quh0 b() {
        quh0 quh0Var = (quh0) this.b;
        if (quh0Var.a == null) {
            hhg1.n("media cannot be null.");
            return null;
        }
        if (!Double.isNaN(quh0Var.d) && quh0Var.d < 0.0d) {
            hhg1.n("startTime cannot be negative or NaN.");
            return null;
        }
        if (Double.isNaN(quh0Var.e)) {
            hhg1.n("playbackDuration cannot be NaN.");
            return null;
        }
        if (!Double.isNaN(quh0Var.f) && quh0Var.f >= 0.0d) {
            return quh0Var;
        }
        hhg1.n("preloadTime cannot be negative or Nan.");
        return null;
    }

    public jhm c(String str, String str2, String str3, String str4, boolean z) {
        return new jhm("manage_note", gox.c, (fhm) null, Integer.valueOf(z ? 2131954387 : 2131954386), (String) null, false, (tm81) null, new ihm(new ygm(2), new ghm(j2g0.t, j2g0.X), new gdv((byte) 2, str, str3, str4, str2, this, z)), 244);
    }

    public igl0 e(int i) {
        return new igl0(i, (r6h1) this.b);
    }

    public First e0(Object obj) {
        First firstH;
        a6h0 a6h0Var = (a6h0) obj;
        a6h0Var.getClass();
        f6h0 f6h0Var = (f6h0) this.b;
        s6h0 s6h0Var = f6h0Var.b.a;
        d6h0 d6h0Var = new d6h0(f6h0Var, (byte) 3);
        String strR = y2o1.r(s6h0Var);
        if (a6h0Var.z) {
            firstH = u6h0.h(a6h0Var);
        } else if (s6h0Var instanceof m6h0) {
            firstH = First.b(a6h0Var);
        } else if (s6h0Var instanceof q6h0) {
            k680 k680Var = (l680) d6h0Var.invoke();
            boolean z = k680Var instanceof k680;
            c9 c9VarS = fg91.b;
            if (z) {
                k680 k680Var2 = k680Var;
                String str = k680Var2.b;
                if (str == null) {
                    firstH = First.b(a6h0Var);
                } else {
                    boolean z2 = k680Var2.d;
                    if (z2) {
                        String str2 = k680Var2.a;
                        c9VarS = mqo1.s(new g5h0[]{new g5h0(null, String.valueOf(str2.hashCode()), str2)});
                    }
                    firstH = First.c(a6h0.a(a6h0Var, c9VarS, str, true, false, null, false, null, null, false, null, null, false, k680Var2.c, null, null, true, z2, k680Var2.a, null, false, 0L, null, null, null, 1L, null, -1074208776), z2 ? w7x.a : Collections.singleton(new qzg0(str)));
                }
            } else if (k680Var instanceof i680) {
                i680 i680Var = (i680) k680Var;
                a6h0 a6h0VarA = a6h0.a(a6h0Var, c9VarS, i680Var.b, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -8);
                String str3 = i680Var.b;
                qzg0 qzg0Var = new qzg0(str3);
                ls50 ls50Var = i680Var.c;
                firstH = First.c(a6h0VarA, dm61.B0(new k0h0[]{qzg0Var, ls50Var != null ? u6h0.R(str3, ls50Var) : null}));
            } else if (k680Var instanceof j680) {
                String str4 = ((j680) k680Var).a;
                firstH = First.b(a6h0.a(a6h0Var, mqo1.s(new h5h0[]{new g5h0(null, String.valueOf(str4.hashCode()), str4), new b5h0(str4, false)}), null, false, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -6));
            } else {
                if (k680Var != null) {
                    eg.o();
                    return null;
                }
                firstH = u6h0.h(a6h0Var);
            }
        } else if (strR != null) {
            firstH = First.c(a6h0.a(a6h0Var, null, null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, null, 0L, null, -5), Collections.singleton(new qzg0(strR)));
        } else {
            String str5 = a6h0Var.g;
            if (str5 != null) {
                c9 c9VarS2 = mqo1.s(new h5h0[]{new g5h0(null, String.valueOf(str5.hashCode() + a6h0Var.hashCode()), str5)});
                String lowerCase = UUID.randomUUID().toString().toLowerCase(Locale.ROOT);
                long j = a6h0Var.E + 1;
                firstH = First.c(a6h0.a(a6h0Var, c9VarS2, null, true, false, null, false, null, null, false, null, null, false, null, null, null, false, false, null, null, false, 0L, null, null, lowerCase, j, null, -1610612806), Collections.singleton(new e0h0(str5, c9VarS2, null, lowerCase, a6h0Var.i, a6h0Var.j, j)));
            } else {
                firstH = u6h0.h(a6h0Var);
            }
        }
        return First.c(firstH.d(), dm61.x0(uzg0.a, firstH.a()));
    }

    public void f(Object obj) {
        MediaBrowserService.Result result = (MediaBrowserService.Result) this.b;
        if (!(obj instanceof List)) {
            if (!(obj instanceof Parcel)) {
                result.sendResult(null);
                return;
            }
            Parcel parcel = (Parcel) obj;
            parcel.setDataPosition(0);
            result.sendResult(MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel));
            parcel.recycle();
            return;
        }
        List<Parcel> list = (List) obj;
        ArrayList arrayList = new ArrayList(list.size());
        for (Parcel parcel2 : list) {
            parcel2.setDataPosition(0);
            arrayList.add((MediaBrowser.MediaItem) MediaBrowser.MediaItem.CREATOR.createFromParcel(parcel2));
            parcel2.recycle();
        }
        result.sendResult(arrayList);
    }

    public r0e0 h(PlayerState playerState) {
        String strF0;
        String strA0;
        if (((hod0) this.b).h(playerState)) {
            ContextTrack contextTrack = (ContextTrack) playerState.track().h();
            String strUri = contextTrack != null ? contextTrack.uri() : null;
            String str = strUri == null ? "" : strUri;
            String str2 = (String) g(playerState).get("live.deeplink_url");
            String str3 = str2 == null ? "" : str2;
            ArrayList arrayListK = t2p1.k(g(playerState));
            ContextTrack contextTrack2 = (ContextTrack) playerState.track().h();
            strF0 = contextTrack2 != null ? l4o1.f0(contextTrack2) : null;
            String str4 = strF0 == null ? "" : strF0;
            String str5 = (String) g(playerState).get("parent_uri");
            String str6 = str5 == null ? "" : str5;
            int iK = khc.k(playerState);
            String str7 = (String) playerState.contextMetadata().get(Context$Metadata.KEY_CONTEXT_DESCRIPTION);
            return new r0e0(str, str3, arrayListK, str4, str6, iK, str7 == null ? "" : str7, false);
        }
        ContextTrack contextTrack3 = (ContextTrack) playerState.track().h();
        String strUri2 = contextTrack3 != null ? contextTrack3.uri() : null;
        String str8 = strUri2 == null ? "" : strUri2;
        String str9 = (String) g(playerState).get("live.deeplink_url");
        String str10 = str9 == null ? "" : str9;
        ContextTrack contextTrack4 = (ContextTrack) playerState.track().h();
        ArrayList arrayListM = contextTrack4 != null ? l4o1.m(contextTrack4) : null;
        if (arrayListM == null) {
            arrayListM = z6x.a;
        }
        ArrayList arrayList = arrayListM;
        ContextTrack contextTrack5 = (ContextTrack) playerState.track().h();
        strF0 = contextTrack5 != null ? l4o1.f0(contextTrack5) : null;
        String str11 = strF0 == null ? "" : strF0;
        ContextTrack contextTrack6 = (ContextTrack) playerState.track().h();
        String str12 = ((contextTrack6 == null || (strA0 = l4o1.a0(contextTrack6, ContextTrack$Metadata.KEY_ARTIST_URI)) == null) && (strA0 = (String) playerState.contextMetadata().get(Context$Metadata.KEY_CONTEXT_OWNER)) == null) ? "" : strA0;
        int iK2 = khc.k(playerState);
        String str13 = (String) playerState.contextMetadata().get(Context$Metadata.KEY_CONTEXT_DESCRIPTION);
        return new r0e0(str8, str10, arrayList, str11, str12, iK2, str13 == null ? "" : str13, true);
    }

    public o2r j() {
        return new hsl(((nde0) this.b).a);
    }

    public void onComplete(Task task) {
        ((ssw0) this.b).H((Throwable) null);
    }

    public void q(Bundle bundle, String str) {
        g4o0 g4o0Var = (g4o0) bundle.get("bluetooth-permission-flow-fragment-result");
        p1o0 p1o0Var = (p1o0) this.b;
        p1o0Var.g.onNext(g4o0Var);
        nh30 nh30Var = (nh30) p1o0Var.b.n.remove("bluetooth-permission-flow-fragment-request");
        if (nh30Var != null) {
            nh30Var.a.d(nh30Var.c);
        }
        th30.P(2);
        p1o0Var.f = false;
        Iterator it = p1o0Var.d.iterator();
        while (it.hasNext()) {
            ((u1o0) it.next()).h(g4o0Var);
        }
    }

    public void v(Object obj) {
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 3:
                sqd0 sqd0Var = (sqd0) obj;
                kqd0 kqd0Var = (kqd0) obj2;
                TextView textView = kqd0Var.i;
                hqd0 hqd0Var = sqd0Var.c;
                Resources resources = kqd0Var.b;
                textView.setText((CharSequence) hqd0Var.invoke(resources));
                kqd0Var.t.setText((CharSequence) sqd0Var.d.invoke(resources));
                break;
            default:
                String str = (String) obj;
                j2p0 j2p0Var = (j2p0) obj2;
                rah rahVar = j2p0Var.c1;
                if (j2p0Var.a.b == null) {
                    try {
                        rahVar.a(vno1.j(0.5f, Color.parseColor(str)));
                    } catch (Exception unused) {
                        rahVar.a(Color.parseColor("#ff282828"));
                    }
                }
                break;
        }
    }

    public ruc0(MediaInfo mediaInfo) {
        this.a = (byte) 14;
        quh0 quh0Var = new quh0(mediaInfo, 0, true, Double.NaN, Double.POSITIVE_INFINITY, 0.0d, (long[]) null, (String) null);
        if (mediaInfo != null) {
            this.b = quh0Var;
        } else {
            hhg1.n("media cannot be null.");
            throw null;
        }
    }

    public ruc0(JSONObject jSONObject) {
        this.a = (byte) 14;
        this.b = new quh0(jSONObject);
    }

    public /* synthetic */ ruc0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public ruc0(khc khcVar, hod0 hod0Var) {
        this.a = (byte) 15;
        this.b = hod0Var;
    }
}
