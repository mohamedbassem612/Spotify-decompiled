package p;

import androidx.datastore.core.CorruptionException;
import com.google.protobuf.InvalidProtocolBufferException;
import com.spotify.musicvideos.listvideofirstimpl.VideoFirstProto$State;
import java.io.FileInputStream;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dnj1 implements e761 {
    public static final dnj1 a = new dnj1();
    public static final VideoFirstProto$State b = VideoFirstProto$State.n();

    public final Object a() {
        return b;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.datastore.core.CorruptionException */
    public final Object b(FileInputStream fileInputStream) throws CorruptionException {
        try {
            VideoFirstProto$State videoFirstProto$StateQ = VideoFirstProto$State.q(fileInputStream);
            videoFirstProto$StateQ.getClass();
            return videoFirstProto$StateQ;
        } catch (InvalidProtocolBufferException e) {
            throw new CorruptionException("Cannot read stored video-first state", e);
        }
    }

    public final void c(Object obj, v091 v091Var) {
        ((VideoFirstProto$State) obj).writeTo(v091Var);
    }
}
