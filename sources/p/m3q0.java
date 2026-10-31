package p;

import com.spotify.on_demand_set.proto.ResponseStatus;
import io.reactivex.rxjava3.functions.Supplier;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m3q0 implements Supplier {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ResponseStatus b;

    public /* synthetic */ m3q0(n3q0 n3q0Var, ResponseStatus responseStatus, byte b) {
        this.a = b;
        this.b = responseStatus;
    }

    public final Object get() {
        byte b = this.a;
        ResponseStatus responseStatus = this.b;
        switch (b) {
            case 0:
                return new Exception("Failed on-demand-set Set request: ".concat(responseStatus.o()));
            default:
                return new Exception("Failed on-demand-set Temporary request: ".concat(responseStatus.o()));
        }
    }
}
