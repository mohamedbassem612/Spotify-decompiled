package p;

import android.os.Bundle;
import com.google.protobuf.Empty;
import com.spotify.offline.offlineplugin_proto.EsOfflinePlugin$IdentifyResponse;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ln70 implements Supplier {
    public static final ln70 b = new ln70((byte) 0);
    public static final ln70 c = new ln70((byte) 1);
    public static final ln70 d = new ln70((byte) 2);
    public static final ln70 e = new ln70((byte) 3);
    public final /* synthetic */ byte a;

    public ln70(op8 op8Var) {
        this.a = (byte) 4;
    }

    public final Object get() {
        switch (this.a) {
            case 0:
                return EsOfflinePlugin$IdentifyResponse.o();
            case 1:
                return Empty.n();
            case 2:
                return r301.a;
            case 3:
                return o1l1.a;
            default:
                return new eeh(1, (Bundle) null);
        }
    }

    public /* synthetic */ ln70(byte b2) {
        this.a = b2;
    }
}
