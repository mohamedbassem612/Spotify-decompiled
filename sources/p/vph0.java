package p;

import android.net.Uri;
import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class vph0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Uri b;
    public final /* synthetic */ Bundle c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ vph0(Uri uri, Bundle bundle, byte b) {
        super(2);
        this.a = b;
        this.b = uri;
        this.c = bundle;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        Bundle bundle = this.c;
        Uri uri = this.b;
        switch (b) {
            case 0:
                return ((lxh0) obj).b((String) obj2, uri, bundle);
            default:
                return ((lxh0) obj).q((String) obj2, uri, bundle);
        }
    }
}
