package p;

import android.content.Context;
import android.content.res.Resources;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import com.spotify.base.java.logging.Logger;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import com.spotify.offline.playbacktimeout.AutomaticDataSaverEvent;
import com.spotify.player.model.PlayerState;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class zti extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zti(zie1 zie1Var, iu30 iu30Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 3;
        this.c = zie1Var;
        this.b = iu30Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new zti((iu30) this.b, (q0a0) obj2, lnmVar, (byte) 0);
            case 1:
                return new zti((rb51) this.b, (y7e1) obj2, lnmVar, (byte) 1);
            case 2:
                zti ztiVar = new zti(obj2, lnmVar, (byte) 2);
                ztiVar.b = obj;
                return ztiVar;
            case 3:
                return new zti((zie1) obj2, (iu30) this.b, lnmVar);
            case 4:
                return new zti((f5k) this.b, (ArrayList) obj2, lnmVar, (byte) 4);
            case 5:
                return new zti((ven0) this.b, (vu30) obj2, lnmVar, (byte) 5);
            case 6:
                return new zti((g341) this.b, (ero) obj2, lnmVar, (byte) 6);
            case 7:
                return new zti((kt91) this.b, (String) obj2, lnmVar, (byte) 7);
            case 8:
                return new zti((qfk) this.b, (lzn0) obj2, lnmVar, (byte) 8);
            case 9:
                return new zti((agk) this.b, (wmy) obj2, lnmVar, (byte) 9);
            case 10:
                return new zti((i7d) this.b, (pjk) obj2, lnmVar, (byte) 10);
            case 11:
                return new zti((cnk) this.b, (lmk) obj2, lnmVar, (byte) 11);
            case 12:
                return new zti((cnk) this.b, (nmk) obj2, lnmVar, (byte) 12);
            case 13:
                return new zti((cnk) this.b, (mmk) obj2, lnmVar, (byte) 13);
            case 14:
                return new zti((cnk) this.b, (kmk) obj2, lnmVar, (byte) 14);
            case 15:
                return new zti((cnk) this.b, (fmk) obj2, lnmVar, (byte) 15);
            case 16:
                zti ztiVar2 = new zti(obj2, lnmVar, (byte) 16);
                ztiVar2.b = obj;
                return ztiVar2;
            case 17:
                zti ztiVar3 = new zti(obj2, lnmVar, (byte) 17);
                ztiVar3.b = obj;
                return ztiVar3;
            case 18:
                return new zti((lsk) this.b, (tck) obj2, lnmVar, (byte) 18);
            case 19:
                return new zti((yyk) this.b, (String) obj2, lnmVar, (byte) 19);
            case 20:
                return new zti((ArrayList) this.b, (f7l) obj2, lnmVar, (byte) 20);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                zti ztiVar4 = new zti(obj2, lnmVar, (byte) 21);
                ztiVar4.b = obj;
                return ztiVar4;
            case 22:
                zti ztiVar5 = new zti(obj2, lnmVar, (byte) 22);
                ztiVar5.b = obj;
                return ztiVar5;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new zti((bpb1) this.b, (vzj) obj2, lnmVar, (byte) 23);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new zti((xwb) this.b, (m0m) obj2, lnmVar, (byte) 24);
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new zti((xwb) this.b, (b2m) obj2, lnmVar, (byte) 25);
            case 26:
                zti ztiVar6 = new zti(obj2, lnmVar, (byte) 26);
                ztiVar6.b = obj;
                return ztiVar6;
            case 27:
                zti ztiVar7 = new zti(obj2, lnmVar, (byte) 27);
                ztiVar7.b = obj;
                return ztiVar7;
            case 28:
                return new zti((kho0) this.b, (vsm) obj2, lnmVar, (byte) 28);
            default:
                return new zti((wm00) this.b, (y7e1) obj2, lnmVar, (byte) 29);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException, IOException {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 6:
                create((c9n) obj, (lnm) obj2);
                hm5.M(rih1Var);
                throw null;
            case 7:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 13:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 14:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 15:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 16:
                create((k1r) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 17:
                return create((String) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 18:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 19:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 20:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                create((ial) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 22:
                create((lzh) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 26:
                create((PlayerState) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 27:
                create((mmr0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                throw null;
            case 28:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            default:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:152:0x058f  */
    public final Object invokeSuspend(Object obj) throws NoWhenBranchMatchedException, IOException {
        c8c0 c8c0Var;
        String str;
        byte b = this.a;
        boolean z = false;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                ((iu30) this.b).invoke(new k0a0(((q0a0) obj2).d));
                return rih1Var;
            case 1:
                y7e1 y7e1Var = (y7e1) obj2;
                hm5.M(obj);
                if (((rb51) this.b).a.length() == 0 && y7e1Var.d().d.length() > 0) {
                    h4e1 h4e1VarH = y7e1Var.h();
                    try {
                        h4e1VarH.k(0, h4e1VarH.c.length(), "");
                        y7e1Var.a(h4e1VarH);
                    } finally {
                        y7e1Var.c();
                    }
                }
                return rih1Var;
            case 2:
                String str2 = (String) this.b;
                hm5.M(obj);
                ((rb51) obj2).b.invoke(str2);
                return rih1Var;
            case 3:
                hm5.M(obj);
                if (((zie1) obj2).f) {
                    ((iu30) this.b).invoke(yie1.c);
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                Context context = ((f5k) this.b).a;
                String str3 = ((x7g1) ((ArrayList) obj2).get(0)).a;
                if (Build.VERSION.SDK_INT >= 31) {
                    MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
                    try {
                        try {
                            mediaMetadataRetriever.setDataSource(context, Uri.parse(str3));
                            String strExtractMetadata = mediaMetadataRetriever.extractMetadata(36);
                            Integer numC0 = strExtractMetadata != null ? nhc1.c0(strExtractMetadata) : null;
                            if (numC0 != null && numC0.intValue() == 6) {
                                z = true;
                            } else if (numC0 != null && numC0.intValue() == 7) {
                                z = true;
                            }
                        } catch (Exception e) {
                            Logger.l(e, "Failed to extract color transfer for uri: ".concat(str3), new Object[0]);
                            break;
                        }
                    } finally {
                        mediaMetadataRetriever.release();
                    }
                }
                return Boolean.valueOf(z);
            case 5:
                hm5.M(obj);
                ven0 ven0Var = (ven0) this.b;
                float f = w6k.b;
                mmr0 mmr0Var = (mmr0) ven0Var.getValue();
                if (mmr0Var != null) {
                    ((vu30) obj2).invoke((String) mmr0Var.a, (tv80) mmr0Var.b);
                    ven0Var.setValue((Object) null);
                }
                return rih1Var;
            case 6:
                hm5.M(obj);
                throw null;
            case 7:
                hm5.M(obj);
                ((kt91) this.b).k(new er91((fs91) null, (String) obj2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 8:
                hm5.M(obj);
                qfk qfkVar = (qfk) this.b;
                lzn0 lzn0Var = (lzn0) obj2;
                tv80 tv80Var = qfkVar.f;
                String str4 = qfkVar.e;
                if (tv80Var != null) {
                    lzn0Var.a(str4, tv80Var, (Bundle) null);
                } else {
                    lzn0Var.h(str4);
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                agk agkVar = (agk) this.b;
                ArrayList<pf3> arrayList = agkVar.e;
                qjk qjkVar = agkVar.f;
                String str5 = agkVar.g;
                wmy wmyVar = (wmy) obj2;
                r800 r800Var = new r800(arrayList, agkVar.h, str5, qjkVar);
                if (((xrk) wmyVar.d).s) {
                    Bundle bundleG = cy30.g("event_bottom_sheet_title", str5);
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (pf3 pf3Var : arrayList) {
                        arrayList2.add(new q700(pf3Var.a, pf3Var.b, pf3Var.c.a, pf3Var.d, pf3Var.e));
                    }
                    bundleG.putParcelableArrayList("event_bottom_sheet_albums", new ArrayList<>(arrayList2));
                    ((lzn0) wmyVar.c).i(new dwn0("spotify:concerts:playlists-bottomsheet", "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null), bundleG);
                    ((AtomicBoolean) wmyVar.f).set(true);
                } else {
                    s700 s700VarA = ((t700) wmyVar.b).a();
                    wmyVar.e = s700VarA;
                    th30 th30Var = (th30) wmyVar.a;
                    s700VarA.Z1 = r800Var;
                    s700VarA.g1(th30Var, "find-tickets-bottom-sheet-fragment");
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                bjx bjxVar = (bjx) ((i7d) this.b).Y;
                h290 h290Var = ((pjk) obj2).a;
                lpd0 lpd0Var = (lpd0) bjxVar.d;
                if (!h290Var.isEmpty() && !u890.j(lpd0Var.h, h290Var)) {
                    lpd0Var.h = h290Var;
                    lpd0Var.f.m((Object) null, z6x.a);
                    xab1 xab1Var = lpd0Var.i;
                    if (xab1Var != null) {
                        xab1Var.d((CancellationException) null);
                    }
                    lpd0Var.i = null;
                    lpd0Var.i = l4p1.u(zso1.H(lpd0Var.a.getLifecycle()), new fu20(o4p1.r(new qsc0(yoi1.g(lpd0Var.b.b(new oi("medium-preview-carousel-concert-entity", false, new l6d0(h290Var, (byte) 14))).takeUntil(b610.t)), lpd0Var, h290Var, (byte) 3), lpd0Var.c), new az80(lpd0Var, h290Var, (lnm) null, (byte) 10), (byte) 1));
                }
                return rih1Var;
            case 11:
                hm5.M(obj);
                a1r0 a1r0Var = ((cnk) this.b).e;
                Bundle bundle = new Bundle();
                bundle.putString("artist_uri", ((lmk) obj2).a);
                a1r0.j(a1r0Var, "spotify:internal:concert-friends-sheet", (String) null, bundle, false, 10);
                return rih1Var;
            case 12:
                hm5.M(obj);
                v1k v1kVar = ((cnk) this.b).g;
                nmk nmkVar = (nmk) obj2;
                String str6 = nmkVar.a;
                String str7 = nmkVar.b;
                kt91 kt91Var = (kt91) v1kVar.b;
                Resources resources = (Resources) v1kVar.c;
                kt91Var.k(new er91((fs91) null, resources.getString(2131961178, str7), (Integer) null, resources.getString(2131961179), (Integer) null, new cg1(v1kVar, str6, (byte) 23), (cvr) null, (xq91) null, false));
                return rih1Var;
            case 13:
                hm5.M(obj);
                v1k v1kVar2 = ((cnk) this.b).g;
                ((kt91) v1kVar2.b).k(new er91((fs91) null, ((Resources) v1kVar2.c).getString(2131961177, ((mmk) obj2).a), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 14:
                hm5.M(obj);
                v1k v1kVar3 = ((cnk) this.b).d;
                fbh0 fbh0Var = ((kmk) obj2).a;
                String str8 = fbh0Var.b;
                Set set = s4b1.f;
                String str9 = fbh0Var.a;
                String strS = uic.x(str9).s();
                if (strS != null) {
                    mfm.c(((i4q) v1kVar3.b).a(new lik1(str9)), new kjm(new igm(str8, new ufm(mqo1.s(new phx[]{new phx(10, 0L, fbh0Var.c, (String) null, str8)})), (String) null, 4), p7h.M(new jhm[]{((xy40) v1kVar3.c).a(strS), new jhm("concert_friend_remove_suggestion", fux.c, (fhm) null, 2131954426, (String) null, false, (tm81) null, new ihm(new ygm(3), hhm.c, new ghm(ma21.i, new q4z0(str9, (byte) 29)), new v721((bb01) v1kVar3.d, str9, str8, (byte) 5)), 244)}), 4), (p6r0) null, (bjm) null, (tv80) null, 22);
                }
                return rih1Var;
            case 15:
                hm5.M(obj);
                ((cnk) this.b).f.f(new dwn0(((fmk) obj2).a, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
            case 16:
                h1r h1rVar = (k1r) this.b;
                hm5.M(obj);
                if (h1rVar instanceof h1r) {
                    Logger.k("ConcertRow: Failed to load %s: %s", new Object[]{((vqk) obj2).a, h1rVar.a});
                }
                return rih1Var;
            case 17:
                String str10 = (String) this.b;
                hm5.M(obj);
                return new m441(new us0((cfd) obj2, str10, (lnm) null, (byte) 21));
            case 18:
                tck tckVar = (tck) obj2;
                hm5.M(obj);
                lsk lskVar = (lsk) this.b;
                ksk kskVar = lskVar.b;
                boolean z2 = lskVar.d;
                c8c0 c8c0Var2 = lskVar.c;
                if (kskVar != null) {
                    ksk kskVar2 = (ksk) tckVar.j;
                    if (kskVar2 == null || (kskVar2.equals(kskVar) && (((c8c0Var = (c8c0) tckVar.k) == null || c8c0Var == c8c0Var2) && tckVar.b == z2))) {
                        tckVar.j = kskVar;
                        tckVar.k = c8c0Var2;
                        tckVar.b = z2;
                    } else {
                        ((lzn0) tckVar.c).f(new dwn0(kskVar.a, "", false, false, 0, 0, true, (a690) null, (Bundle) null, (cwn0) null));
                    }
                }
                return rih1Var;
            case 19:
                hm5.M(obj);
                yyk yykVar = (yyk) this.b;
                yykVar.g.c();
                yykVar.i.d((String) obj2, (tv80) null, (Bundle) null);
                return rih1Var;
            case 20:
                hm5.M(obj);
                ArrayList arrayList3 = (ArrayList) this.b;
                f7l f7lVar = (f7l) obj2;
                g0l g0lVar = f7lVar.a;
                ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                Iterator it = arrayList3.iterator();
                while (it.hasNext()) {
                    arrayList4.add(new ewt((zv31) it.next(), g0lVar));
                }
                List listA1 = o7h.a1(arrayList4, new xvd(f7lVar.c.c(), (mur) f7lVar.b.a.a.j.get()));
                ArrayList arrayList5 = new ArrayList(q7h.U(listA1, 10));
                Iterator it2 = listA1.iterator();
                while (it2.hasNext()) {
                    arrayList5.add(((ewt) it2.next()).b());
                }
                return arrayList5;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                fal falVar = (fal) obj2;
                ial ialVar = (ial) this.b;
                hm5.M(obj);
                z = ialVar.b == cal.c;
                dal dalVar = (dal) falVar.c.get();
                cal calVar = ialVar.b;
                if (dalVar.b.b()) {
                    n69 n69VarN = AutomaticDataSaverEvent.n();
                    n69VarN.q(z);
                    int iOrdinal = calVar.ordinal();
                    if (iOrdinal == 0) {
                        str = "UNKNOWN";
                    } else if (iOrdinal == 1) {
                        str = "GOOD";
                    } else if (iOrdinal == 2) {
                        str = "POOR";
                    } else {
                        if (iOrdinal != 3) {
                            eg.o();
                            return null;
                        }
                        str = "ABSENT";
                    }
                    n69VarN.n(str);
                    AutomaticDataSaverEvent automaticDataSaverEventBuild = n69VarN.build();
                    t2j0 t2j0Var = dalVar.a;
                    automaticDataSaverEventBuild.getClass();
                    t2j0Var.a(automaticDataSaverEventBuild);
                }
                bpb1 bpb1Var = falVar.e;
                Boolean boolValueOf = Boolean.valueOf(z);
                bpb1Var.getClass();
                bpb1Var.m((Object) null, boolValueOf);
                return rih1Var;
            case 22:
                lzh lzhVar = (lzh) this.b;
                hm5.M(obj);
                nnl nnlVar = (nnl) obj2;
                nnlVar.h = lzhVar;
                nnlVar.i();
                return rih1Var;
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                hm5.M(obj);
                ((bpb1) this.b).m((Object) null, new kam((vzj) obj2));
                return rih1Var;
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                hm5.M(obj);
                ((xwb) this.b).invoke(((m0m) obj2).a);
                return rih1Var;
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                hm5.M(obj);
                ((xwb) this.b).invoke(((b2m) obj2).a.a);
                return rih1Var;
            case 26:
                PlayerState playerState = (PlayerState) this.b;
                hm5.M(obj);
                String strContextUri = playerState.contextUri();
                i5m i5mVar = (i5m) obj2;
                if (!u890.j(i5mVar.l, strContextUri)) {
                    i5mVar.l = strContextUri;
                    i5mVar.k = null;
                }
                return rih1Var;
            case 27:
                mmr0 mmr0Var2 = (mmr0) this.b;
                hm5.M(obj);
                if (mmr0Var2.a != null) {
                    throw new ClassCastException();
                }
                if (mmr0Var2.b == null) {
                    throw new NoWhenBranchMatchedException();
                }
                throw new ClassCastException();
            case 28:
                hm5.M(obj);
                r6h1 r6h1Var = r6h1.c;
                String str11 = ((kho0) this.b).a.a;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-contribution-note-element";
                x6h1VarI.f = "1.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.d = str11;
                y6h1 y6h1VarA = x6h1VarI.a();
                i8h1 i8h1Var = (i8h1) ((vsm) obj2).h.get();
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1VarA;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                i8h1Var.f(k7h1Var.a(), (Set) null);
                return rih1Var;
            default:
                y7e1 y7e1Var2 = (y7e1) obj2;
                hm5.M(obj);
                wm00 wm00Var = (wm00) this.b;
                if (wm00Var != null && y7e1Var2.d().d.length() == 0) {
                    c4p1.E(wm00Var.a, y7e1Var2);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zti(Object obj, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zti(Object obj, Object obj2, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
