package p;

import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.base.java.logging.Logger;
import com.spotify.metadata.proto.Metadata$Track;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$Metadata;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public abstract class ckj0 {
    public static final phc a(Map map) {
        Metadata$Track metadata$TrackT;
        phc phcVarR;
        EsOfflinePlugin$Metadata esOfflinePlugin$Metadata = (EsOfflinePlugin$Metadata) map.get(Integer.valueOf(hz00.Y.getNumber()));
        if (esOfflinePlugin$Metadata == null) {
            metadata$TrackT = null;
        } else {
            try {
                metadata$TrackT = Metadata$Track.t(esOfflinePlugin$Metadata.o().q());
            } catch (InvalidProtocolBufferException e) {
                Logger.d("Failed to parse track metadata", new Object[]{e});
                metadata$TrackT = null;
            }
        }
        if (metadata$TrackT == null || (phcVarR = metadata$TrackT.r()) == null || phcVarR.size() != 16) {
            return null;
        }
        return phcVarR;
    }
}
