package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.cosmos.util.proto.EpisodeMetadata;
import com.spotify.cosmos.util.proto.EpisodePlayState;
import com.spotify.cosmos.util.proto.Extension;
import com.spotify.cosmos.util.proto.ImageGroup;
import com.spotify.cosmos.util.proto.PlayabilityRestriction;
import com.spotify.mobius.coroutines.DispatcherWorker;
import com.spotify.mobius.functions.Producer;
import com.spotify.puffin.core.data.headphonefilterstate.database.HeadphoneFilterStateDatabase;
import com.spotify.show_esperanto.proto.GetUnfinishedEpisodesResponse;
import io.reactivex.rxjava3.core.CompletableSource;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.core.SingleOnSubscribe;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Function3;
import io.reactivex.rxjava3.internal.functions.Functions;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.serialization.json.JsonDecodingException;
import spotify.show_cosmos.proto.ShowEpisodeState;
import spotify.show_cosmos.unfinished_episodes_request.proto.UnfinishedEpisodesRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class zb91 implements Producer, h8q0, Function, SingleOnSubscribe, ya, z341, j60, sh, aiy, xi7, qiw, Function3 {
    public final /* synthetic */ byte a;
    public final Object b;

    public zb91(iac0 iac0Var, zde1 zde1Var) {
        this.a = (byte) 13;
        this.b = d5p1.t(new x010(zde1Var.b, zde1Var.d, new a801(3, (lnm) null, (byte) 2), (byte) 1), cto1.q(iac0Var), new alb1(5000L, Long.MAX_VALUE), new kne(0, 0));
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    public static hbh1 g(uga0 uga0Var) {
        Set setEntrySet;
        Map.Entry entry;
        Boolean boolF;
        lValueOf = null;
        Long lValueOf = null;
        if (uga0Var != null && (setEntrySet = uga0Var.a.entrySet()) != null && (entry = (Map.Entry) o7h.r0(setEntrySet)) != null) {
            String str = (String) entry.getKey();
            uga0 uga0Var2 = (ega0) entry.getValue();
            uga0 uga0Var3 = uga0Var2 instanceof uga0 ? uga0Var2 : null;
            if (uga0Var3 == null) {
                uga0Var3 = new uga0(b7x.a);
            }
            switch (str.hashCode()) {
                case -1625724613:
                    if (str.equals("rate_limited")) {
                        return gbh1.a;
                    }
                    break;
                case -1194777649:
                    if (str.equals("aborted")) {
                        ega0 ega0Var = (ega0) uga0Var3.get("reason");
                        return new abh1(ega0Var != null ? fga0.g(fga0.m(ega0Var)) : null);
                    }
                    break;
                case 17818629:
                    if (str.equals("invalid_argument")) {
                        return dbh1.a;
                    }
                    break;
                case 109156347:
                    if (str.equals("no_content")) {
                        return ebh1.a;
                    }
                    break;
                case 778975750:
                    if (str.equals("internal_error")) {
                        return cbh1.a;
                    }
                    break;
                case 1286290681:
                    if (str.equals("prompt_rejected")) {
                        ega0 ega0Var2 = (ega0) uga0Var3.get("support_resources_required");
                        return new fbh1((ega0Var2 == null || (boolF = fga0.f(fga0.m(ega0Var2))) == null) ? false : boolF.booleanValue());
                    }
                    break;
                case 1500211438:
                    if (str.equals("capping_exceeded")) {
                        ega0 ega0Var3 = (ega0) uga0Var3.get("reset_timestamp");
                        String strG = ega0Var3 != null ? fga0.g(fga0.m(ega0Var3)) : null;
                        ega0 ega0Var4 = (ega0) uga0Var3.get("total_allowance");
                        if (ega0Var4 != null) {
                            try {
                                lValueOf = Long.valueOf(fga0.o(fga0.m(ega0Var4)));
                                break;
                            } catch (JsonDecodingException unused) {
                            }
                        }
                        return new bbh1(lValueOf, strG);
                    }
                    break;
            }
        }
        return null;
    }

    public rqw a(zhy zhyVar) {
        return new hy00((j4f1) this.b, rre1.i, vrf1.W0);
    }

    public boolean accept(Object obj) {
        le30 le30Var;
        byte b = this.a;
        Object obj2 = this.b;
        switch (b) {
            case 8:
                ksk kskVar = (ksk) obj;
                Set set = s4b1.f;
                String str = kskVar.a;
                return (!uic.k(str, new b3i1[]{wyu0.f, nyu0.e}) || ((fza1) obj2).b(str) || kskVar.b || (le30Var = kskVar.c) == le30.S0 || le30Var == le30.b) ? false : true;
            default:
                return ((ksk) obj).c == le30.n1 && ((lq4) obj2).a();
        }
    }

    public Object apply(Object obj) {
        Set<Map.Entry> setEntrySet;
        rd70 rd70VarF;
        d1z d1zVar;
        g1z g1zVar;
        int i;
        int i2;
        byte b = this.a;
        int i3 = 1;
        ImageGroup imageGroup = null;
        Object obj2 = this.b;
        switch (b) {
            case 4:
                String str = (String) obj;
                q7b1 q7b1Var = (q7b1) obj2;
                return u890.j(q7b1Var.e, str) ? CompletableEmpty.a : z2n.a(q7b1Var.a, "sp_accept_language", Uri.encode(str)).g(new tt60(q7b1Var, str, (byte) 29)).h(iqa1.d).o(Functions.h);
            case 5:
                oob1 oob1Var = (oob1) obj;
                return oob1Var instanceof nlb1 ? ((bkb1) obj2).N0.z().map(new ep31(oob1Var, (byte) 22)).onErrorReturn(rdx0.P0) : Single.just(new yvg1(Boolean.FALSE, (Object) null, (Object) null));
            case 6:
                return Boolean.valueOf(((Integer) obj).intValue() >= ((Integer) obj2).intValue());
            case 10:
                oy01 oy01Var = (oy01) obj;
                t45 t45Var = oy01Var.b;
                if (t45Var != null && (setEntrySet = t45Var.h().entrySet()) != null) {
                    ysc1 ysc1Var = (ysc1) obj2;
                    for (Map.Entry entry : setEntrySet) {
                        Long l = (Long) ((di40) entry.getValue()).c;
                        Long l2 = ((di40) entry.getValue()).d;
                        if (l != null && l2 != null) {
                            ysc1Var.d.a(l.longValue(), l2.longValue(), ((di40) entry.getValue()).a, ysc1Var.i.a);
                        }
                    }
                }
                return oy01Var.a;
            case 15:
                re70 re70Var = (re70) obj;
                ArrayList arrayListD = new jma((uic) ((cp81) obj2).b, (byte) 13).d(re70Var.k());
                return (arrayListD == null || (rd70VarF = re70Var.toBuilder().o(arrayListD).f()) == null) ? re70Var : rd70VarF;
            case 16:
                return (CompletableSource) ((cmd1) obj2).invoke((tv80) obj);
            case 21:
                GetUnfinishedEpisodesResponse getUnfinishedEpisodesResponse = (GetUnfinishedEpisodesResponse) obj;
                shh1 shh1Var = (shh1) obj2;
                shh1Var.getClass();
                h290 h290VarP = getUnfinishedEpisodesResponse.n().p();
                ArrayList arrayList = new ArrayList(q7h.U(h290VarP, 10));
                Iterator it = h290VarP.iterator();
                while (it.hasNext()) {
                    UnfinishedEpisodesRequest.Episode episode = (UnfinishedEpisodesRequest.Episode) it.next();
                    EpisodeMetadata episodeMetadataO = episode.o();
                    ShowEpisodeState.EpisodeOfflineState episodeOfflineStateP = episode.p();
                    EpisodePlayState episodePlayStateQ = episode.q();
                    ShowEpisodeState.EpisodeCollectionState episodeCollectionStateN = episode.n();
                    cen cenVarA = episodeMetadataO.hasCovers() ? shh1.a(episodeMetadataO.getCovers()) : shh1.a(imageGroup);
                    cen cenVarA2 = episodeMetadataO.hasFreezeFrames() ? shh1.a(episodeMetadataO.getFreezeFrames()) : shh1.a(imageGroup);
                    g281 g281VarB = episodeMetadataO.hasShow() ? shh1.b(episodeMetadataO.getShow()) : shh1.b(imageGroup);
                    if (episodeMetadataO.hasMediaTypeEnum()) {
                        int i4 = rhh1.c[episodeMetadataO.getMediaTypeEnum().ordinal()];
                        if (i4 == i3) {
                            d1zVar = d1z.a;
                        } else if (i4 == 2) {
                            d1zVar = d1z.b;
                        } else {
                            if (i4 != 3) {
                                eg.o();
                                return imageGroup;
                            }
                            d1zVar = d1z.c;
                        }
                    } else {
                        d1zVar = d1z.d;
                    }
                    if (episodeMetadataO.hasEpisodeType()) {
                        int i5 = rhh1.b[episodeMetadataO.getEpisodeType().ordinal()];
                        if (i5 == i3) {
                            g1zVar = g1z.c;
                        } else if (i5 != 2) {
                            g1zVar = i5 != 3 ? g1z.d : g1z.a;
                        } else {
                            g1zVar = g1z.b;
                        }
                    } else {
                        g1zVar = g1z.d;
                    }
                    lv00 lv00Var = shh1Var.b;
                    List extensionList = episodeMetadataO.getExtensionList();
                    ArrayList arrayList2 = new ArrayList(extensionList.size());
                    for (Iterator it2 = extensionList.iterator(); it2.hasNext(); it2 = it2) {
                        Extension extension = (Extension) it2.next();
                        arrayList2.add(new jz00(extension.getData().t(), extension.getExtensionKind().getNumber()));
                        shh1Var = shh1Var;
                        it = it;
                    }
                    shh1 shh1Var2 = shh1Var;
                    Iterator it3 = it;
                    jv00 jv00VarA = lv00Var.a(arrayList2);
                    c1z c1zVarL = nmn1.l();
                    c1zVarL.e = g281VarB;
                    c1zVarL.l = cenVarA;
                    c1zVarL.k = g1zVar;
                    c1zVarL.c = episodeMetadataO.getLink();
                    c1zVarL.d = episodeMetadataO.getName();
                    c1zVarL.A = d1zVar;
                    c1zVarL.t = cenVarA2;
                    c1zVarL.a = episodeMetadataO.getLength();
                    c1zVarL.n = episodeMetadataO.getPreviewId();
                    c1zVarL.p = episodeMetadataO.getIsExplicit();
                    c1zVarL.q = episodeMetadataO.getIs19PlusOnly();
                    c1zVarL.r = episodeMetadataO.getIsBookChapter();
                    c1zVarL.b = (int) episodeMetadataO.getPublishDate();
                    c1zVarL.w = episodeMetadataO.getBackgroundable();
                    c1zVarL.B = episodeMetadataO.getAvailable();
                    String manifestId = episodeMetadataO.getManifestId();
                    if (manifestId == null) {
                        manifestId = "";
                    }
                    c1zVarL.i = manifestId;
                    String description = episodeMetadataO.getDescription();
                    if (description == null) {
                        description = "";
                    }
                    c1zVarL.j = description;
                    c1zVarL.m = episodePlayStateQ != null && episodePlayStateQ.getIsPlayed();
                    c1zVarL.y = episodeCollectionStateN != null && episodeCollectionStateN.getIsInListenLater();
                    String previewManifestId = episodeMetadataO.getPreviewManifestId();
                    c1zVarL.s = previewManifestId != null ? previewManifestId : "";
                    c1zVarL.h = episodeCollectionStateN != null && episodeCollectionStateN.getIsNew();
                    c1zVarL.u = episodeCollectionStateN != null && episodeCollectionStateN.getIsFollowingShow();
                    c1zVarL.v = episodeMetadataO.getIsMusicAndTalk();
                    c1zVarL.x = episodePlayStateQ != null && episodePlayStateQ.getIsPlayable();
                    if (episodePlayStateQ == null) {
                        i = 1;
                        i2 = 1;
                    } else {
                        PlayabilityRestriction playabilityRestriction = episodePlayStateQ.getPlayabilityRestriction();
                        int i6 = playabilityRestriction == null ? -1 : rhh1.a[playabilityRestriction.ordinal()];
                        i = 4;
                        i2 = 1;
                        if (i6 != 1) {
                            if (i6 == 2) {
                                i = 3;
                            } else if (i6 != 3) {
                                i = i6 != 4 ? 1 : 5;
                            } else {
                                i = 2;
                            }
                        }
                    }
                    c1zVarL.E = i;
                    c1zVarL.o = episodePlayStateQ != null ? Long.valueOf(episodePlayStateQ.getLastPlayedAt()) : null;
                    c1zVarL.f = (episodePlayStateQ == null || !episodePlayStateQ.hasTimeLeft() || episodePlayStateQ.getTimeLeft() < 0) ? null : Integer.valueOf(episodePlayStateQ.getTimeLeft());
                    c1zVarL.C = dm5.O(episodeOfflineStateP.getSyncProgress(), episodeOfflineStateP.getOfflineState());
                    c1zVarL.D = jv00VarA;
                    arrayList.add(c1zVarL.c());
                    i3 = i2;
                    shh1Var = shh1Var2;
                    it = it3;
                    imageGroup = null;
                }
                return new uo30(arrayList, getUnfinishedEpisodesResponse);
            case 22:
                return ((nmh1) obj2).b.a(new i9u0(0L)).map(e4x0.U0).onErrorReturn(f4x0.T0).toObservable();
            default:
                hce1 hce1Var = (hce1) obj2;
                return m5n1.o(((HeadphoneFilterStateDatabase) hce1Var.b).v().a, new String[]{"WiredHeadphoneFilterStateEntity"}, new bek1((String) obj, (byte) 8)).subscribeOn((Scheduler) hce1Var.e).firstOrError().map(new f2g1(hce1Var, (byte) 5));
        }
    }

    public y341 b(String str) {
        h1d1 h1d1Var = (h1d1) this.b;
        String databaseName = h1d1Var.getDatabaseName();
        if (databaseName == null) {
            if (!str.equals(":memory:")) {
                hhg1.f(f4i1.f("This driver is configured to open an in-memory database but a file-based named '", str, "' was requested."));
                return null;
            }
        } else if (!databaseName.equals(str) && !ihc1.V0(databaseName, '/', databaseName).equals(ihc1.V0(str, '/', str))) {
            hhg1.f(cy30.p("This driver is configured to open a database named '", h1d1Var.getDatabaseName(), "' but '", str, "' was requested."));
            return null;
        }
        return new f1d1(h1d1Var.G0());
    }

    public boolean c() {
        return true;
    }

    public void d() {
        zoj1 zoj1Var = (zoj1) this.b;
        fn31.T(zoj1Var.l, (o8n) null, 0, new fkj1(zoj1Var, (lnm) null, (byte) 3), 3);
    }

    public List e(Map map) {
        ArrayList m231Var;
        zah1 m231Var2;
        nfa0 nfa0Var = (nfa0) this.b;
        String str = (String) map.get("error_list");
        ArrayList arrayList = z6x.a;
        if (str != null) {
            try {
                pfa0 pfa0VarC = nfa0Var.c(str);
                pfa0 pfa0Var = pfa0VarC instanceof pfa0 ? pfa0VarC : null;
                if (pfa0Var != null) {
                    m231Var = new ArrayList();
                    Iterator it = pfa0Var.a.iterator();
                    while (it.hasNext()) {
                        try {
                            och1 och1Var = (och1) hon1.z(nfa0Var, (ega0) it.next(), och1.Companion.serializer());
                            m231Var2 = new zah1(och1Var.a, och1Var.b, och1Var.c, g(och1Var.d));
                        } catch (Throwable th) {
                            m231Var2 = new m231(th);
                        }
                        if (m231Var2 instanceof m231) {
                            m231Var2 = null;
                        }
                        zah1 zah1Var = m231Var2;
                        if (zah1Var != null) {
                            m231Var.add(zah1Var);
                        }
                    }
                    if (!(m231Var instanceof m231)) {
                        arrayList = m231Var;
                    }
                    return arrayList;
                }
            } catch (Throwable th2) {
                m231Var = new m231(th2);
            }
        }
        return arrayList;
    }

    public List f(Map map) {
        ArrayList m231Var;
        pfa0<ega0> pfa0Var;
        lbh1 m231Var2;
        nfa0 nfa0Var = (nfa0) this.b;
        String str = (String) map.get("prompts");
        ArrayList arrayList = z6x.a;
        if (str == null) {
            return arrayList;
        }
        try {
            pfa0 pfa0VarC = nfa0Var.c(str);
            if (pfa0VarC instanceof pfa0) {
                pfa0Var = pfa0VarC;
            } else {
                if (!(pfa0VarC instanceof uga0)) {
                    return arrayList;
                }
                Object obj = ((uga0) pfa0VarC).get("prompts");
                pfa0Var = obj instanceof pfa0 ? (pfa0) obj : null;
                if (pfa0Var == null) {
                    return arrayList;
                }
            }
            m231Var = new ArrayList();
            for (ega0 ega0Var : pfa0Var) {
                try {
                    nma0 nma0VarSerializer = lbh1.Companion.serializer();
                    nfa0Var.getClass();
                    m231Var2 = (lbh1) hon1.z(nfa0Var, ega0Var, nma0VarSerializer);
                } catch (Throwable th) {
                    m231Var2 = new m231(th);
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                lbh1 lbh1Var = m231Var2;
                if (lbh1Var != null) {
                    m231Var.add(lbh1Var);
                }
            }
        } catch (Throwable th2) {
            m231Var = new m231(th2);
        }
        if (!(m231Var instanceof m231)) {
            arrayList = m231Var;
        }
        return arrayList;
    }

    public Object get() {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                return new DispatcherWorker(((ac91) obj).c);
            default:
                return new DispatcherWorker(((jhd1) obj).e);
        }
    }

    public Single l(Intent intent, th61 th61Var) {
        return ((uii1) this.b).b(intent);
    }

    public Object n(Object obj, Object obj2, Object obj3) {
        Boolean bool = (Boolean) obj3;
        boolean zBooleanValue = ((Boolean) obj).booleanValue();
        cd6 cd6Var = (cd6) this.b;
        dp5 dp5Var = (dp5) cd6Var.h;
        List list = ((pqc1) cd6Var.f).f;
        pqc1 pqc1Var = (pqc1) dp5Var.b;
        return new n2k1(dp5Var.j((Context) cd6Var.d), zBooleanValue, !pqc1Var.e ? list.isEmpty() : pqc1Var.f.isEmpty(), bool.booleanValue());
    }

    public void onSuccess(Object obj) {
        Integer num = (Integer) obj;
        pya1 pya1Var = (pya1) this.b;
        num.getClass();
        pya1Var.d = num.intValue();
    }

    public boolean r(View view) {
        ((qvs) this.b).invoke(fzf1.f);
        return true;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public void subscribe(SingleEmitter singleEmitter) throws NoWhenBranchMatchedException {
        w4c1 w4c1Var = (w4c1) this.b;
        List list = w4c1Var.b.a;
        if (!list.isEmpty()) {
            singleEmitter.onSuccess(new ec31(list.size()));
            return;
        }
        try {
            o4c1 o4c1Var = (p4c1) w4c1Var.a.invoke();
            if (o4c1Var instanceof n4c1) {
                IllegalStateException illegalStateException = new IllegalStateException("Can't load stories");
                if (singleEmitter.isDisposed()) {
                    return;
                }
                singleEmitter.onError(illegalStateException);
                return;
            }
            if (!(o4c1Var instanceof o4c1)) {
                throw new NoWhenBranchMatchedException();
            }
            m4c1 m4c1Var = o4c1Var.a;
            int size = m4c1Var.a.size();
            w4c1Var.b = m4c1Var;
            ArrayList arrayList = new ArrayList(size);
            for (int i = 0; i < size; i++) {
                arrayList.add(m9c1.a);
            }
            w4c1Var.c = arrayList;
            singleEmitter.onSuccess(new ec31(size));
        } catch (InterruptedException e) {
            if (singleEmitter.isDisposed()) {
                return;
            }
            singleEmitter.onError(e);
        } catch (RuntimeException e2) {
            if (singleEmitter.isDisposed()) {
                return;
            }
            singleEmitter.onError(e2);
        }
    }

    public void v(Object obj) {
        ((ConstraintLayout) ((mfj1) this.b).h.i).setAlpha(((Boolean) obj).booleanValue() ? 0.4f : 1.0f);
    }

    public zb91(pya1 pya1Var, String str) {
        this.a = (byte) 2;
        this.b = pya1Var;
    }

    public /* synthetic */ zb91(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public zb91(d6b1 d6b1Var) {
        this.a = (byte) 3;
        this.b = new m441(new sb91(d6b1Var, null, (byte) 16));
    }
}
