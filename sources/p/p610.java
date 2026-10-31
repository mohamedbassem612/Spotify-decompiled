package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.clientrestrictions.v1.RestrictedIntegrationsResponse;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p610 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ q610 b;

    public /* synthetic */ p610(q610 q610Var, byte b) {
        this.a = b;
        this.b = q610Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        q610 q610Var = this.b;
        switch (b) {
            case 0:
                RestrictedIntegrationsResponse restrictedIntegrationsResponse = (RestrictedIntegrationsResponse) obj;
                q610Var.d = new m610(restrictedIntegrationsResponse);
                Objects.toString(restrictedIntegrationsResponse.p());
                break;
            default:
                Logger.e((Throwable) obj, "Failed to load restricted clients", new Object[0]);
                q610Var.d = l610.b;
                break;
        }
    }
}
