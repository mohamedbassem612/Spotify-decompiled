package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.offline.lyricsofflineplugin.proto.TrackLyricsView;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyCommand;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$Metadata;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kn70 implements Function {
    public static final kn70 a = new kn70();

    public final Object apply(Object obj) {
        EsOfflinePlugin$IdentifyCommand.Query query = (EsOfflinePlugin$IdentifyCommand.Query) obj;
        String link = query.getLink();
        phc phcVarA = ckj0.a(query.getMetadataMap());
        String strConcat = phcVarA != null ? "spotify:track:".concat(g9a.a(phcVarA.t())) : query.getLink();
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = (EsOfflinePlugin$Metadata) query.getMetadataMap().get(Integer.valueOf(hz00.Y.getNumber()));
        boolean hasLyrics = false;
        if (esOfflinePlugin$Metadata != null) {
            try {
                hasLyrics = TrackLyricsView.n(esOfflinePlugin$Metadata.o().q()).getHasLyrics();
            } catch (InvalidProtocolBufferException unused) {
            }
        }
        return new rmf1(link, strConcat, hasLyrics);
    }
}
