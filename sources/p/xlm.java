package p;

import com.spotify.player.esperanto.proto.EsContextTrack;
import com.spotify.player.esperanto.proto.EsProvidedTrack;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.ContextTrack$Builder;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class xlm {
    public static final ContextTrack a(EsProvidedTrack.ProvidedTrack providedTrack) {
        EsContextTrack.ContextTrack contextTrackO = providedTrack.o();
        ContextTrack$Builder contextTrack$BuilderBuilder = ContextTrack.builder(contextTrackO.getUri());
        String uid = contextTrackO.getUid();
        if (uid != null && uid.length() != 0) {
            contextTrack$BuilderBuilder.uid(contextTrackO.getUid());
        }
        if (contextTrackO.getMetadataCount() > 0) {
            contextTrack$BuilderBuilder.metadata(contextTrackO.getMetadataMap());
        }
        ContextTrack$Builder builder = contextTrack$BuilderBuilder.build().toBuilder();
        builder.provider(providedTrack.q());
        return builder.build();
    }

    public static final EsContextTrack.ContextTrack b(ContextTrack contextTrack) {
        smz smzVarQ = EsContextTrack.ContextTrack.q();
        String strUri = contextTrack.uri();
        if (strUri != null && strUri.length() != 0) {
            smzVarQ.r(contextTrack.uri());
        }
        String strUid = contextTrack.uid();
        if (strUid != null && strUid.length() != 0) {
            smzVarQ.q(contextTrack.uid());
        }
        j380 j380VarMetadata = contextTrack.metadata();
        if (j380VarMetadata != null && !j380VarMetadata.isEmpty()) {
            smzVarQ.n(contextTrack.metadata());
        }
        return smzVarQ.build();
    }

    public static final EsProvidedTrack.ProvidedTrack c(ContextTrack contextTrack) {
        oqz oqzVarR = EsProvidedTrack.ProvidedTrack.r();
        oqzVarR.n(b(contextTrack));
        oqzVarR.q(contextTrack.provider());
        return oqzVarR.build();
    }
}
