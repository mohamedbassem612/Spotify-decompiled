package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zcr extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Bundle b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zcr(Bundle bundle, byte b) {
        super(1);
        this.a = b;
        this.b = bundle;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Bundle bundle = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                return str + ": " + bundle.get(str);
            case 1:
                return Boolean.valueOf(!bundle.containsKey((String) obj));
            default:
                return Boolean.valueOf(!bundle.containsKey((String) obj));
        }
    }
}
