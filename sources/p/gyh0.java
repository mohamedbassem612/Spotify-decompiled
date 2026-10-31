package p;

import android.net.Uri;
import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class gyh0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ Uri c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ gyh0(String str, Uri uri, Bundle bundle, byte b) {
        this.a = b;
        this.b = str;
        this.c = uri;
        this.d = bundle;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Bundle bundle = this.d;
        Uri uri = this.c;
        String str = this.b;
        lxh0 lxh0Var = (lxh0) obj;
        switch (b) {
            case 0:
                return lxh0Var.b(str, uri, bundle);
            default:
                return lxh0Var.q(str, uri, bundle);
        }
    }
}
