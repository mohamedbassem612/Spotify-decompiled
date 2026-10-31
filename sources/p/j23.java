package p;

import com.spotify.aiplaylistcoverart.proto.AiPlaylistCoverArtProto;
import com.spotify.metadata.cosmos.proto.MetadataCosmos;
import com.spotify.metadata.cosmos.proto.MetadataCosmos$MultiRequest;
import com.spotify.metadata.proto.Metadata;
import com.spotify.playlist.ai.creation.v2.Action;
import com.spotify.playlist.ai.creation.v2.ChatMessagePreferences;
import com.spotify.playlist.ai.creation.v2.CreateSessionRequest;
import com.spotify.playlist.ai.creation.v2.GetMessageRequest;
import com.spotify.playlist.ai.creation.v2.GetSessionRequest;
import com.spotify.playlist.ai.creation.v2.Item;
import com.spotify.playlist.ai.creation.v2.Playlist;
import com.spotify.playlist.ai.creation.v2.SubmitMessageRequest;
import com.spotify.playlist.ai.creation.v2.UpdateChatMessagePreferencesRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class j23 implements c23 {
    public final r23 a;
    public final x13 b;
    public final ueg c;
    public final lmy0 d;
    public final Scheduler e;

    public j23(r23 r23Var, x13 x13Var, ueg uegVar, sjb sjbVar, ejb ejbVar, lmy0 lmy0Var, Scheduler scheduler) {
        this.a = r23Var;
        this.b = x13Var;
        this.c = uegVar;
        this.d = lmy0Var;
        this.e = scheduler;
    }

    public final Single a() {
        CreateSessionRequest.Builder builderNewBuilder = CreateSessionRequest.newBuilder();
        builderNewBuilder.setUnused(true);
        return this.a.e((CreateSessionRequest) builderNewBuilder.build()).map(bya0.f);
    }

    public final Single b(ArrayList arrayList) {
        kjj0 kjj0VarO = MetadataCosmos$MultiRequest.o();
        kjj0VarO.n(arrayList);
        return this.c.callSingle("spotify.metadata_esperanto.proto.ClassicMetadataService", "MultigetEntity", (MetadataCosmos$MultiRequest) kjj0VarO.build()).map(p9w.Q0).map(new a42(this, (byte) 10));
    }

    public final Single c(String str, String str2) {
        y13 y13VarN = AiPlaylistCoverArtProto.GetPlaylistImageBackgroundRequest.n();
        y13VarN.q(str);
        if (str2 != null) {
            ArrayList<String> arrayListE0 = ihc1.e0(str2);
            ArrayList arrayList = new ArrayList(q7h.U(arrayListE0, 10));
            for (String str3 : arrayListE0) {
                eth.h(16);
                arrayList.add(Byte.valueOf((byte) Integer.parseInt(str3, 16)));
            }
            byte[] bArrG1 = o7h.g1(arrayList);
            y13VarN.n(phc.e(0, bArrG1, bArrG1.length));
        }
        return this.b.a(y13VarN.build()).map(olj0.f);
    }

    public final Single d(String str) {
        GetSessionRequest.Builder builderNewBuilder = GetSessionRequest.newBuilder();
        builderNewBuilder.setSessionId(str);
        return this.a.h((GetSessionRequest) builderNewBuilder.build()).flatMap(new ymm0(this, (byte) 11));
    }

    public final awi0 e(MetadataCosmos.MetadataItem metadataItem) {
        String str;
        phc phcVarN;
        phc phcVarN2;
        phc phcVarN3;
        int iR = metadataItem.r();
        int i = iR == 0 ? -1 : f23.b[l1d.C(iR)];
        String strZ = null;
        if (i != 1) {
            if (i == 2) {
                Metadata.Show showS = metadataItem.s();
                Set set = s4b1.f;
                String strZ2 = uic.z(f9a.a(showS.o().t())).z();
                if (strZ2 != null) {
                    return new zvi0(strZ2);
                }
                eg.m("Failed to get show link");
                return null;
            }
            if (i == 3) {
                Metadata.Artist artistO = metadataItem.o();
                Set set2 = s4b1.f;
                String strZ3 = uic.c(f9a.a(artistO.r().t())).z();
                if (strZ3 != null) {
                    return new zvi0(strZ3);
                }
                eg.m("Failed to get artist link");
                return null;
            }
            if (i == 4) {
                Metadata.Album albumN = metadataItem.n();
                Set set3 = s4b1.f;
                String strZ4 = uic.b(f9a.a(albumN.q().t())).z();
                if (strZ4 != null) {
                    return new zvi0(strZ4);
                }
                eg.m("Failed to get album link");
                return null;
            }
            if (i != 5) {
                eg.m("Unexpected item!");
                return null;
            }
            Metadata.Episode episodeQ = metadataItem.q();
            Set set4 = s4b1.f;
            String strZ5 = uic.p(f9a.a(episodeQ.o().t())).z();
            if (strZ5 != null) {
                return new zvi0(strZ5);
            }
            eg.m("Failed to get episode link");
            return null;
        }
        Metadata.Track trackT = metadataItem.t();
        Set set5 = s4b1.f;
        String strZ6 = uic.B(f9a.a(trackT.r().t())).z();
        if (strZ6 == null) {
            eg.m("Failed to get track link");
            return null;
        }
        String name = metadataItem.t().getName();
        List artistList = metadataItem.t().getArtistList();
        ArrayList arrayList = new ArrayList(q7h.U(artistList, 10));
        Iterator it = artistList.iterator();
        while (it.hasNext()) {
            arrayList.add(((Metadata.Artist) it.next()).getName());
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj : arrayList) {
            if (!ihc1.y0((String) obj)) {
                arrayList2.add(obj);
            }
        }
        Metadata.Image image = (Metadata.Image) o7h.s0(metadataItem.t().n().n().getImageList());
        String strConcat = (image == null || (phcVarN3 = image.n()) == null) ? "" : "https://i.scdn.co/image/".concat(zno1.z(phcVarN3.t()));
        Metadata.Track trackT2 = metadataItem.t();
        Metadata.AudioFile audioFile = (Metadata.AudioFile) o7h.s0(trackT2.s());
        String strZ7 = (audioFile == null || (phcVarN2 = audioFile.n()) == null) ? null : zno1.z(phcVarN2.t());
        if (strZ7 == null) {
            h290 h290VarO = trackT2.o();
            ArrayList arrayList3 = new ArrayList();
            Iterator it2 = h290VarO.iterator();
            while (it2.hasNext()) {
                r7h.W(((Metadata.Track) it2.next()).s(), arrayList3);
            }
            Metadata.AudioFile audioFile2 = (Metadata.AudioFile) o7h.s0(arrayList3);
            if (audioFile2 != null && (phcVarN = audioFile2.n()) != null) {
                strZ = zno1.z(phcVarN.t());
            }
            str = strZ == null ? "" : strZ;
        } else {
            str = strZ7;
        }
        return new yvi0(strZ6, name, strConcat, str, (String) null, arrayList2);
    }

    public final Observable f(h7w h7wVar, Observable observable) {
        List<Item> tracksList;
        Action action = h7wVar.t().getAction();
        switch (action == null ? -1 : f23.a[action.ordinal()]) {
            case -1:
            case 6:
            case 7:
                return Observable.error(new RuntimeException("An error occurred while trying get messages"));
            case 0:
            default:
                eg.o();
                return null;
            case 1:
            case 2:
                return observable.startWithItem(new dwi0(h7wVar.q(), h7wVar.t().getMessage(), h7wVar.u(), h7wVar.v(), h7wVar.r()));
            case 3:
                Playlist playlistS = h7wVar.s();
                List<Item> list = z6x.a;
                if (playlistS == null || (tracksList = playlistS.getTracksList()) == null) {
                    tracksList = list;
                }
                List<Item> list2 = tracksList;
                int iS = zno1.s(q7h.U(list2, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                for (Item item : list2) {
                    linkedHashMap.put(item.getUri(), item.getNote());
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                for (Map.Entry entry : linkedHashMap.entrySet()) {
                    String str = (String) entry.getValue();
                    str.getClass();
                    if (!ihc1.y0(str)) {
                        linkedHashMap2.put(entry.getKey(), entry.getValue());
                    }
                }
                ArrayList arrayList = new ArrayList(q7h.U(list2, 10));
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(((Item) it.next()).getUri());
                }
                Observable map = b(arrayList).toObservable().onErrorReturnItem(list).map(new g23(h7wVar, this, linkedHashMap2, (byte) 0));
                map.getClass();
                return map;
            case 4:
            case 5:
                return Observable.just(new xvi0(h7wVar.q(), h7wVar.t().getMessage(), h7wVar.u(), h7wVar.v(), h7wVar.r()));
        }
    }

    public final Observable g(long j, String str, String str2) {
        GetMessageRequest.Builder builderNewBuilder = GetMessageRequest.newBuilder();
        builderNewBuilder.setSessionId(str);
        builderNewBuilder.setMessageId(str2);
        return this.a.j((GetMessageRequest) builderNewBuilder.build()).toObservable().delaySubscription(j, TimeUnit.MILLISECONDS, this.e).map(new njp1(str2, (byte) 1)).concatMap(new g23(this, str, str2));
    }

    public final Single h(String str, String str2, svi0 svi0Var) {
        SubmitMessageRequest.Builder builderNewBuilder = SubmitMessageRequest.newBuilder();
        builderNewBuilder.setMessagePrompt(str2);
        builderNewBuilder.setSessionId(str);
        ChatMessagePreferences.Builder builderNewBuilder2 = ChatMessagePreferences.newBuilder();
        builderNewBuilder2.addAllExcludedUris(svi0Var.a);
        builderNewBuilder2.addAllIncludedUris(svi0Var.b);
        builderNewBuilder.setMessagePreferences((ChatMessagePreferences) builderNewBuilder2.build());
        return this.a.f((SubmitMessageRequest) builderNewBuilder.build()).flatMapObservable(new oj80(this, svi0Var, (byte) 22)).ofType(dwi0.class).singleOrError();
    }

    public final Completable i(String str, String str2, Set set, Set set2) {
        UpdateChatMessagePreferencesRequest.Builder builderNewBuilder = UpdateChatMessagePreferencesRequest.newBuilder();
        builderNewBuilder.setSessionId(str);
        builderNewBuilder.setMessageId(str2);
        ChatMessagePreferences.Builder builderNewBuilder2 = ChatMessagePreferences.newBuilder();
        builderNewBuilder2.addAllExcludedUris(set);
        builderNewBuilder2.addAllIncludedUris(set2);
        builderNewBuilder.setMessagePreferences((ChatMessagePreferences) builderNewBuilder2.build());
        return this.a.i((UpdateChatMessagePreferencesRequest) builderNewBuilder.build()).ignoreElement();
    }
}
