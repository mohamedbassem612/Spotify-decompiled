package p;

import android.os.Bundle;
import io.reactivex.rxjava3.functions.Function;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final /* synthetic */ class fyh0 implements Function {
    public final /* synthetic */ byte a;
    public final /* synthetic */ String b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Bundle d;

    public /* synthetic */ fyh0(String str, String str2, Bundle bundle, byte b) {
        this.a = b;
        this.b = str;
        this.c = str2;
        this.d = bundle;
    }

    public final Object apply(Object obj) {
        byte b = this.a;
        Bundle bundle = this.d;
        String str = this.c;
        String str2 = this.b;
        lxh0 lxh0Var = (lxh0) obj;
        switch (b) {
            case 0:
                return lxh0Var.i(str2, str, bundle);
            default:
                return lxh0Var.g(str2, str, bundle);
        }
    }
}
