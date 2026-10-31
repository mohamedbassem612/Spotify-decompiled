package p;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import com.google.protobuf.Timestamp;
import com.spotify.contentdelivery.downloadimpl.NullTransportException;
import com.spotify.highlightsstats.Artist;
import com.spotify.highlightsstats.Playlist;
import com.spotify.highlightsstats.Track;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.ArtistsDetailsPage;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.Bubble;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.BubbleGraph;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.GraphPoint;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.GraphSection;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.ListeningTimeGraph;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.MarketComparisonItem;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.MarketComparisonSection;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.PositionChangeLabel;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.StatsDetailsResponse;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.TimeOfTheDaySection;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.TopArtist;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.TopTrack;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.TrackDetailsPage;
import com.spotify.mobius.First;
import com.spotify.mobius.Init;
import com.spotify.mobius.functions.Producer;
import com.spotify.mobius.runners.ImmediateWorkRunner;
import com.spotify.mobius.runners.WorkRunners;
import com.spotify.paragraph.v1.proto.Paragraph;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.SeekToCommand;
import com.spotify.player.model.command.options.CommandOptions;
import com.spotify.player.model.command.options.CommandOptions$Builder;
import com.spotify.puffin_esperanto.proto.PuffinLibraryVersionResponseOuterClass$PuffinLibraryVersionResponse;
import com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.functions.BiFunction;
import io.reactivex.rxjava3.functions.Function;
import io.reactivex.rxjava3.functions.Predicate;
import j$.util.Base64;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.CancellationException;
import spotify.your_library.esperanto.proto.IsCuratedResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class vbx0 implements jrn0, Function, Predicate, Producer, BiFunction, com.spotify.mobius.functions.Function, Init, vq8 {
    public final /* synthetic */ byte a;
    public static final vbx0 b = new vbx0((byte) 0);
    public static final vbx0 c = new vbx0((byte) 1);
    public static final vbx0 d = new vbx0((byte) 2);
    public static final vbx0 e = new vbx0((byte) 3);
    public static final vbx0 f = new vbx0((byte) 4);
    public static final vbx0 g = new vbx0((byte) 5);
    public static final vbx0 h = new vbx0((byte) 6);
    public static final vbx0 i = new vbx0((byte) 7);
    public static final vbx0 t = new vbx0((byte) 8);
    public static final vbx0 X = new vbx0((byte) 9);
    public static final vbx0 Y = new vbx0((byte) 10);
    public static final vbx0 Z = new vbx0((byte) 11);
    public static final vbx0 N0 = new vbx0((byte) 12);
    public static final vbx0 O0 = new vbx0((byte) 13);
    public static final vbx0 P0 = new vbx0((byte) 14);
    public static final vbx0 Q0 = new vbx0((byte) 15);
    public static final vbx0 R0 = new vbx0((byte) 16);
    public static final vbx0 S0 = new vbx0((byte) 17);
    public static final vbx0 T0 = new vbx0((byte) 18);
    public static final vbx0 U0 = new vbx0((byte) 19);
    public static final vbx0 V0 = new vbx0((byte) 21);
    public static final vbx0 W0 = new vbx0((byte) 22);
    public static final vbx0 X0 = new vbx0((byte) 23);
    public static final vbx0 Y0 = new vbx0((byte) 24);
    public static final vbx0 Z0 = new vbx0((byte) 25);
    public static final vbx0 a1 = new vbx0((byte) 26);

    public vbx0(pw0 pw0Var) {
        this.a = (byte) 27;
    }

    public static void b(ArrayList arrayList) {
        Object objA0 = o7h.A0(arrayList);
        emu emuVar = emu.a;
        if (u890.j((dtb1) objA0, emuVar)) {
            objA0 = null;
        }
        if (((dtb1) objA0) != null) {
            arrayList.add(emuVar);
        }
    }

    public static void g(StatsDetailsResponse statsDetailsResponse, ArrayList arrayList) {
        int color;
        int color2;
        String str;
        float fAbs;
        int i2;
        int iP = statsDetailsResponse.p();
        int i3 = iP == 0 ? -1 : rhi1.a[l1d.C(iP)];
        z6x z6xVar = z6x.a;
        int i4 = 0;
        boolean z = true;
        if (i3 == 1) {
            z6x z6xVar2 = z6xVar;
            TrackDetailsPage trackDetailsPageV = statsDetailsResponse.v();
            int color3 = Color.parseColor(statsDetailsResponse.n());
            Timestamp timestampO = Timestamp.o();
            h290 h290VarR = trackDetailsPageV.r();
            ArrayList arrayList2 = new ArrayList(q7h.U(h290VarR, 10));
            Iterator it = h290VarR.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                int i5 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                TopTrack topTrack = (TopTrack) next;
                String name = topTrack.r().getName();
                String uri = topTrack.r().getUri();
                Timestamp timestamp = timestampO;
                String strValueOf = String.valueOf(i5);
                PositionChangeLabel positionChangeLabelP = topTrack.p();
                xxh xxhVarF = pap1.F(positionChangeLabelP.n(), positionChangeLabelP.p());
                Paragraph paragraphO = topTrack.o();
                if (!topTrack.s()) {
                    paragraphO = null;
                }
                d761 d761VarA = paragraphO != null ? b761.a(paragraphO) : null;
                Paragraph paragraphQ = topTrack.q();
                if (paragraphQ.equals(Paragraph.n())) {
                    paragraphQ = null;
                }
                ArrayList arrayList3 = arrayList2;
                z6x z6xVar3 = z6xVar2;
                z6xVar2 = z6xVar3;
                arrayList3.add(new zff1(name, strValueOf, d761VarA, xxhVarF, uri, 2131963624, topTrack.n(), topTrack.r().o(), paragraphQ != null ? b761.a(paragraphQ) : null, topTrack.r().n(), 0, z6xVar3));
                timestampO = timestamp;
                arrayList2 = arrayList3;
                i4 = i5;
                it = it;
                z = true;
            }
            arrayList.add(new agf1(arrayList2, Integer.valueOf(color3), timestampO, 8));
            GraphSection graphSectionO = statsDetailsResponse.v().o();
            if (!statsDetailsResponse.v().s()) {
                graphSectionO = null;
            }
            if (graphSectionO != null) {
                b(arrayList);
                arrayList.add(z8p1.p(graphSectionO, statsDetailsResponse.n(), zl80.a));
            }
            h290 h290VarQ = statsDetailsResponse.v().q();
            h290VarQ.getClass();
            if ((h290VarQ.isEmpty() ? null : h290VarQ) != null) {
                b(arrayList);
                TrackDetailsPage trackDetailsPageV2 = statsDetailsResponse.v();
                String strP = trackDetailsPageV2.p();
                h290<Track> h290VarQ2 = trackDetailsPageV2.q();
                ArrayList arrayList4 = new ArrayList(q7h.U(h290VarQ2, 10));
                for (Track track : h290VarQ2) {
                    arrayList4.add(new nkm0(track.getUri(), track.getName(), track.n(), track.o()));
                }
                arrayList.add(new pkm0(strP, arrayList4, 1, g6m0.TOP_TRACKS));
                return;
            }
            return;
        }
        char c2 = 2;
        if (i3 == 2) {
            ArtistsDetailsPage artistsDetailsPageO = statsDetailsResponse.o();
            int color4 = Color.parseColor(statsDetailsResponse.n());
            Timestamp timestampO2 = Timestamp.o();
            h290 h290VarR2 = artistsDetailsPageO.r();
            ArrayList arrayList5 = new ArrayList(q7h.U(h290VarR2, 10));
            for (Object obj : h290VarR2) {
                int i6 = i4 + 1;
                if (i4 < 0) {
                    p7h.T();
                    throw null;
                }
                TopArtist topArtist = (TopArtist) obj;
                Artist artistO = topArtist.o();
                Timestamp timestamp2 = timestampO2;
                String name2 = artistO.getName();
                String uri2 = artistO.getUri();
                String strValueOf2 = String.valueOf(i6);
                PositionChangeLabel positionChangeLabelP2 = topArtist.p();
                xxh xxhVarF2 = pap1.F(positionChangeLabelP2.n(), positionChangeLabelP2.p());
                Paragraph paragraphQ2 = topArtist.q();
                if (paragraphQ2.equals(Paragraph.n())) {
                    paragraphQ2 = null;
                }
                ArrayList arrayList6 = arrayList5;
                z6x z6xVar4 = z6xVar;
                arrayList6.add(new q8f1(name2, strValueOf2, xxhVarF2, uri2, 2131963599, topArtist.n(), artistO.n(), paragraphQ2 != null ? b761.a(paragraphQ2) : null, 0, z6xVar4));
                arrayList5 = arrayList6;
                timestampO2 = timestamp2;
                i4 = i6;
                c2 = 2;
                z6xVar = z6xVar4;
            }
            arrayList.add(new s8f1(arrayList5, Integer.valueOf(color4), timestampO2, 8));
            GraphSection graphSectionO2 = statsDetailsResponse.o().o();
            if (!statsDetailsResponse.o().s()) {
                graphSectionO2 = null;
            }
            if (graphSectionO2 != null) {
                b(arrayList);
                arrayList.add(z8p1.p(graphSectionO2, statsDetailsResponse.n(), zl80.b));
            }
            h290 h290VarQ3 = statsDetailsResponse.o().q();
            h290VarQ3.getClass();
            if ((h290VarQ3.isEmpty() ? null : h290VarQ3) != null) {
                b(arrayList);
                String strP2 = statsDetailsResponse.o().p();
                h290<Playlist> h290VarQ4 = statsDetailsResponse.o().q();
                ArrayList arrayList7 = new ArrayList(q7h.U(h290VarQ4, 10));
                for (Playlist playlist : h290VarQ4) {
                    arrayList7.add(new mkm0(playlist.getUri(), playlist.getName(), playlist.n()));
                }
                arrayList.add(new pkm0(strP2, arrayList7, 2, g6m0.TOP_ARTISTS));
                return;
            }
            return;
        }
        if (i3 != 3) {
            n57.s("Unknown page type");
            hhg1.n("Invalid page type");
            return;
        }
        ListeningTimeGraph listeningTimeGraphO = statsDetailsResponse.s().o();
        String strN = statsDetailsResponse.n();
        d761 d761VarA2 = b761.a(listeningTimeGraphO.s());
        int color5 = Color.parseColor(strN);
        int iO = listeningTimeGraphO.o();
        h290 h290VarR3 = listeningTimeGraphO.r();
        ArrayList arrayList8 = new ArrayList(q7h.U(h290VarR3, 10));
        for (Object obj2 : h290VarR3) {
            int i7 = i4 + 1;
            if (i4 < 0) {
                p7h.T();
                throw null;
            }
            arrayList8.add(new rzy(i4, ((GraphPoint) obj2).getValue()));
            i4 = i7;
        }
        arrayList.add(new jmd0(d761VarA2, color5, iO, arrayList8, listeningTimeGraphO.q(), listeningTimeGraphO.q() / 2.0f, listeningTimeGraphO.t(), 3, listeningTimeGraphO.n(), "listening-time-graph"));
        if (statsDetailsResponse.s().s().q()) {
            b(arrayList);
            TimeOfTheDaySection timeOfTheDaySectionS = statsDetailsResponse.s().s();
            String strN2 = statsDetailsResponse.n();
            d761 d761VarA3 = b761.a(timeOfTheDaySectionS.p());
            BubbleGraph bubbleGraphN = timeOfTheDaySectionS.n();
            h290<Bubble> h290VarO = bubbleGraphN.o();
            ArrayList arrayList9 = new ArrayList(q7h.U(h290VarO, 10));
            for (Bubble bubble : h290VarO) {
                String strP3 = bubble.p();
                String strN3 = bubble.n();
                int i8 = hac.a[bubble.o().ordinal()];
                if (i8 == 1) {
                    i2 = 4;
                } else if (i8 != 2) {
                    i2 = i8 != 3 ? 1 : 2;
                } else {
                    i2 = 3;
                }
                arrayList9.add(new eac(i2, strP3, strN3, bubbleGraphN.p(), strN2));
            }
            arrayList.add(new bac(d761VarA3, arrayList9, timeOfTheDaySectionS.n().n(), "BubbleGraphComponent"));
        }
        MarketComparisonSection marketComparisonSectionP = statsDetailsResponse.s().p();
        if (marketComparisonSectionP != null) {
            if (marketComparisonSectionP.equals(MarketComparisonSection.o())) {
                marketComparisonSectionP = null;
            }
            if (marketComparisonSectionP != null) {
                b(arrayList);
                if (marketComparisonSectionP.s().r() > marketComparisonSectionP.p().r()) {
                    color = Color.parseColor(marketComparisonSectionP.s().n());
                    color2 = Color.parseColor(marketComparisonSectionP.p().n());
                    str = "user-with-more-listening";
                } else {
                    color = Color.parseColor(marketComparisonSectionP.p().n());
                    color2 = Color.parseColor(marketComparisonSectionP.s().n());
                    str = "user-with-less-listening";
                }
                int i9 = color;
                int i10 = color2;
                if (marketComparisonSectionP.q() > 100) {
                    str = "user-with-overflow-listening";
                    fAbs = 0.1f;
                } else {
                    fAbs = Math.abs(100.0f - Math.abs(marketComparisonSectionP.q())) / 100.0f;
                }
                float f2 = fAbs;
                String str2 = str;
                d761 d761VarA4 = b761.a(marketComparisonSectionP.r());
                MarketComparisonItem marketComparisonItemS = marketComparisonSectionP.s();
                wtg0 wtg0Var = new wtg0(Color.parseColor(marketComparisonItemS.n()), marketComparisonItemS.r(), marketComparisonItemS.getName(), marketComparisonItemS.q(), marketComparisonItemS.o());
                MarketComparisonItem marketComparisonItemP = marketComparisonSectionP.p();
                arrayList.add(new xtg0(d761VarA4, wtg0Var, new wtg0(Color.parseColor(marketComparisonItemP.n()), marketComparisonItemP.r(), marketComparisonItemP.getName(), marketComparisonItemP.q(), marketComparisonItemP.o()), f2, i9, i10, marketComparisonSectionP.n(), str2));
            }
        }
        h290 h290VarR4 = statsDetailsResponse.s().r();
        if (h290VarR4 != null) {
            if ((h290VarR4.equals(Playlist.o()) ? null : h290VarR4) != null) {
                b(arrayList);
                String strQ = statsDetailsResponse.s().q();
                Playlist playlistR = statsDetailsResponse.s().r();
                arrayList.add(new f211(strQ, playlistR.getName(), playlistR.getDescription(), playlistR.n(), playlistR.getUri()));
            }
        }
    }

    public spq0 a(Uri uri, br8 br8Var) {
        return j5.a;
    }

    public Object apply(Object obj) {
        switch (this.a) {
            case 1:
                byte[] bArr = (byte[]) obj;
                try {
                    return PuffinLibraryVersionResponseOuterClass$PuffinLibraryVersionResponse.o(bArr);
                } catch (Exception e2) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.puffin_esperanto.proto.PuffinLibraryVersionResponseOuterClass.PuffinLibraryVersionResponse: '", Base64.getEncoder().encodeToString(bArr), "' (Base64)"), e2);
                    return null;
                }
            case 2:
            case 3:
            case 4:
            case 5:
            case 8:
            case 10:
            case 12:
            case 15:
            case 20:
            case 21:
            default:
                spq0 spq0Var = (spq0) obj;
                SeekToCommand.Builder builder = SeekToCommand.builder(-15000L);
                CommandOptions$Builder commandOptions$BuilderBuilder = CommandOptions.builder();
                if (spq0Var.c()) {
                    commandOptions$BuilderBuilder.onlyForPlaybackId((String) spq0Var.b());
                }
                return new j9u0(builder.options(commandOptions$BuilderBuilder.build()).relative(SeekToCommand.Relative.CURRENT).build());
            case 6:
                return (xo3) obj;
            case 7:
                kc41 kc41Var = (kc41) obj;
                if (kc41Var instanceof jc41) {
                    return Observable.just(new wsx0(true));
                }
                if (kc41Var instanceof ic41) {
                    return Observable.just(new wsx0(false));
                }
                eg.o();
                return null;
            case 9:
                return new xp61((eq61) obj);
            case 11:
                return ((rp81) obj).a;
            case 13:
                return new to91(Boolean.valueOf(((List) obj).contains(new ll81("minus"))));
            case 14:
                return o3a1.a;
            case 16:
                byte[] bArr2 = (byte[]) obj;
                try {
                    return StatusResponseOuterClass.StatusResponse.p(bArr2);
                } catch (Exception e3) {
                    bhn0.o(f4i1.f("Unable to parse data as com.spotify.stream_reporting_esperanto.proto.StatusResponseOuterClass.StatusResponse: '", Base64.getEncoder().encodeToString(bArr2), "' (Base64)"), e3);
                    return null;
                }
            case 17:
                String message = ((Throwable) obj).getMessage();
                if (message == null) {
                    message = "Transport error";
                }
                return new y0f1(message);
            case 18:
                return (Completable) obj;
            case 19:
                return ((Boolean) obj).booleanValue() ? wbg1.a : vbg1.a;
            case 22:
                return ((drk1) obj).a;
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                mmr0 mmr0Var = (mmr0) obj;
                Double d2 = (Double) mmr0Var.a;
                Double d3 = (Double) mmr0Var.b;
                return Boolean.valueOf((d2 == null || d3 == null || d3.doubleValue() <= d2.doubleValue()) ? false : true);
            case 24:
                byte[] bArr3 = (byte[]) obj;
                try {
                    return IsCuratedResponse.r(bArr3);
                } catch (Exception e4) {
                    bhn0.o(f4i1.f("Unable to parse data as spotify.your_library.esperanto.proto.IsCuratedResponse: '", Base64.getEncoder().encodeToString(bArr3), "' (Base64)"), e4);
                    return null;
                }
        }
    }

    public Bundle c(String str, String str2, int i2, String str3) {
        Bundle bundleF = pzm.f("ACCESS_TOKEN", str, "RESPONSE_TYPE", "token");
        bundleF.putInt("EXPIRES_IN", i2);
        bundleF.putString("STATE", str2);
        bundleF.putString("REDIRECT_URI", str3);
        return bundleF;
    }

    public Intent d(nhz nhzVar, String str, String str2) {
        Intent intent = new Intent();
        intent.putExtra("ERROR", nhzVar.a);
        intent.putExtra("STATE", str2);
        if (!jhc1.F(str)) {
            intent.putExtra("ERROR_DESCRIPTION", str);
        }
        return intent;
    }

    public Bundle e(String str, String str2, String str3) {
        Bundle bundleF = pzm.f("AUTHORIZATION_CODE", str, "RESPONSE_TYPE", "code");
        bundleF.putString("STATE", str2);
        bundleF.putString("REDIRECT_URI", str3);
        return bundleF;
    }

    public First e0(Object obj) {
        return First.b((gua1) obj);
    }

    public Intent f(Bundle bundle) {
        Intent intent = new Intent();
        intent.putExtra("REPLY", bundle);
        return intent;
    }

    public Object get() {
        WorkRunners.MyThreadFactory myThreadFactory = WorkRunners.a;
        return new ImmediateWorkRunner();
    }

    public spq0 h(Uri uri, nhz nhzVar, String str) {
        return j5.a;
    }

    public irn0 l(Intent intent, th61 th61Var) {
        Set set = s4b1.f;
        String strZ = uic.x(intent.getDataString()).z();
        strZ.getClass();
        return new hrn0(rbx0.class, new sbx0(strZ, th61Var.a), a6w0.a);
    }

    public boolean test(Object obj) {
        switch (this.a) {
            case 2:
                return !((List) obj).isEmpty();
            case 3:
            case 6:
            case 7:
            default:
                PlayerState playerState = (PlayerState) obj;
                return l4o1.X((ContextTrack) playerState.track().b()) || o4p1.v(playerState);
            case 4:
                return ((Boolean) obj).booleanValue();
            case 5:
                return ((Throwable) obj) instanceof CancellationException;
            case 8:
                return ((Throwable) obj) instanceof NullTransportException;
        }
    }

    public /* synthetic */ vbx0(byte b2) {
        this.a = b2;
    }

    public Object apply(Object obj, Object obj2) {
        who0 who0VarA;
        g781 g781Var = (g781) obj2;
        who0 who0Var = (who0) ((spq0) obj).h();
        if (who0Var != null) {
            who0VarA = who0.a(who0Var, g781Var.b || g781Var.a.i);
        } else {
            who0VarA = null;
        }
        return spq0.a(who0VarA);
    }
}
