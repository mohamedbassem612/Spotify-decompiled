package p;

import android.net.Uri;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v4j1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vbe1 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v4j1(vbe1 vbe1Var, byte b) {
        super(0);
        this.a = b;
        this.b = vbe1Var;
    }

    public final Object invoke() {
        byte b = this.a;
        vbe1 vbe1Var = this.b;
        switch (b) {
            case 0:
                Uri uriB = ((ajg) ((jly0) vbe1Var.d).get()).b();
                return uriB == null ? Uri.parse((String) ((idd1) vbe1Var.f).getValue()) : uriB;
            default:
                return "https://play.google.com/store/apps/details?id=".concat(((ajg) ((jly0) vbe1Var.d).get()).a);
        }
    }
}
