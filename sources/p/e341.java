package p;

import android.net.Uri;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.functions.Function;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class e341 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ g341 b;
    public final /* synthetic */ Uri c;

    public /* synthetic */ e341(g341 g341Var, Uri uri, byte b) {
        this.a = b;
        this.b = g341Var;
        this.c = uri;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Uri uri = this.c;
        g341 g341Var = this.b;
        Boolean bool = (Boolean) obj;
        switch (b) {
            case 0:
                if (!bool.booleanValue()) {
                    return g341Var.a.b(Uri.encode(uri.toString())).map(new f341((byte) 0)).timeout(3L, TimeUnit.SECONDS, g341Var.b);
                }
                eg.m("Managed accounts cannot log in on Web");
                return null;
            default:
                return bool.booleanValue() ? Single.just(uri) : g341Var.b(uri);
        }
    }
}
