package p;

import com.spotify.boombox.audiosinkesperanto.NoOpTransportException;
import com.spotify.esperanto.esperanto.Transport;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yco0 implements Transport {
    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.boombox.audiosinkesperanto.NoOpTransportException */
    @Override // com.spotify.esperanto.esperanto.Transport
    public final Single callSingle(String str, String str2, byte[] bArr) throws NoOpTransportException {
        throw new NoOpTransportException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.boombox.audiosinkesperanto.NoOpTransportException */
    @Override // com.spotify.esperanto.esperanto.Transport
    public final Observable callStream(String str, String str2, byte[] bArr) throws NoOpTransportException {
        throw new NoOpTransportException();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.boombox.audiosinkesperanto.NoOpTransportException */
    @Override // com.spotify.esperanto.esperanto.Transport
    public final byte[] callSync(String str, String str2, byte[] bArr) throws NoOpTransportException {
        throw new NoOpTransportException();
    }
}
