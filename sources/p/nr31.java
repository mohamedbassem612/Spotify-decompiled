package p;

import android.content.res.Resources;
import android.text.TextUtils;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class nr31 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pr31 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nr31(pr31 pr31Var, byte b) {
        super(0);
        this.a = b;
        this.b = pr31Var;
    }

    public final Object invoke() {
        byte b = this.a;
        pr31 pr31Var = this.b;
        boolean z = false;
        switch (b) {
            case 0:
                lwh0 lwh0Var = pr31Var.l;
                return Boolean.valueOf(lwh0Var != null ? lwh0Var.d() : false);
            default:
                lwh0 lwh0Var2 = pr31Var.l;
                if (lwh0Var2 != null) {
                    int identifier = Resources.getSystem().getIdentifier("default_audio_route_name", "string", "android");
                    owh0.b();
                    lwh0 lwh0Var3 = owh0.c().v;
                    if (lwh0Var3 == null) {
                        eg.m("There is no default route.  The media router has not yet been fully initialized.");
                        return null;
                    }
                    if (lwh0Var3 == lwh0Var2 && TextUtils.equals(Resources.getSystem().getText(identifier), lwh0Var2.d)) {
                        z = true;
                    }
                }
                return Boolean.valueOf(z);
        }
    }
}
