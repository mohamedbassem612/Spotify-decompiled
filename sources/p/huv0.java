package p;

import com.spotify.premiumdestination.destination.mobius.domain.JsonException;
import com.spotify.premiumdestination.destination.mobius.domain.MappingException;
import com.spotify.premiumdestination.destination.mobius.domain.TransformerException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class huv0 {
    public static juv0 a(Throwable th) {
        if (th instanceof JsonException) {
            return new juv0(5);
        }
        if (th instanceof MappingException) {
            return new juv0(6);
        }
        return th instanceof TransformerException ? new juv0(7) : new juv0(2);
    }
}
