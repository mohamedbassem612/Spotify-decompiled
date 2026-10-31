package p;

import com.spotify.base.java.logging.Logger;
import com.spotify.remoteconfig.fetcherimpl.network.ResolveRequestFailedException;
import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class jkt0 implements Consumer {
    public final /* synthetic */ byte a;

    public jkt0(String str, vi11 vi11Var) {
        this.a = (byte) 16;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.spotify.remoteconfig.fetcherimpl.network.ResolveRequestFailedException */
    public final void accept(Object obj) throws ResolveRequestFailedException {
        switch (this.a) {
            case 0:
                throw td6.k(obj);
            case 1:
                Logger.e((Throwable) obj, "Cosmos request failed - not displaying dialog", new Object[0]);
                return;
            case 2:
                if (((m3x0) obj).k1 == 4) {
                    throw new RuntimeException() { // from class: com.spotify.profile.profile.entity.ProfileEntityPage$FailLoadingProfileEntityException
                    };
                }
                return;
            case 3:
                throw td6.k(obj);
            case 4:
                yto.k((String) ((Map) obj).get("filter-age-restricted-content"), false);
                return;
            case 5:
            case 6:
                return;
            case 7:
                throw td6.k(obj);
            case 8:
                return;
            case 9:
                return;
            case 10:
                Throwable th = (Throwable) obj;
                if (th instanceof c9h1) {
                    th.getMessage();
                    return;
                } else {
                    n57.g("UBI dwell time error.", th);
                    return;
                }
            case 11:
                Throwable th2 = (Throwable) obj;
                if (th2 instanceof c9h1) {
                    th2.getMessage();
                    return;
                } else {
                    n57.g("UBI dwell time error.", th2);
                    return;
                }
            case 12:
                Throwable th3 = (Throwable) obj;
                if (th3 instanceof c9h1) {
                    th3.getMessage();
                    return;
                } else {
                    n57.g("UBI dwell time error.", th3);
                    return;
                }
            case 13:
                sy21 sy21Var = (sy21) obj;
                ry21 ry21Var = sy21Var.a;
                int i = ry21Var.d;
                if (i != 200 && i != 404 && i != 429) {
                    throw new ResolveRequestFailedException(gvg.e(ry21Var.d, "Unauth Resolve request failed: ", "!"), sy21Var);
                }
                return;
            case 14:
                throw td6.k(obj);
            case 15:
                throw td6.k(obj);
            case 16:
                return;
            default:
                Objects.toString((flb1) obj);
                return;
        }
    }

    private final void a(Object obj) {
    }

    private final void c(Object obj) {
    }
}
