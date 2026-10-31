package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hqd implements Connectable {
    public static final hqd b = new hqd(0);
    public static final hqd c = new hqd(1);
    public static final hqd d = new hqd(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ hqd(byte b2) {
        this.a = b2;
    }

    public final Connection L(Consumer consumer) {
        switch (this.a) {
            case 0:
                return new gqd((byte) 0);
            case 1:
                return new gqd((byte) 1);
            case 2:
                return new gqd((byte) 3);
            default:
                return new gqd((byte) 2);
        }
    }
}
