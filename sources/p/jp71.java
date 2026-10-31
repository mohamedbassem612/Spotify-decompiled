package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class jp71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp71 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ jp71(kp71 kp71Var, byte b) {
        super(1);
        this.a = b;
        this.b = kp71Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        kp71 kp71Var = this.b;
        byte b2 = 0;
        switch (b) {
            case 0:
                Bundle bundle = (Bundle) obj;
                return new ep71(jhc1.u(bundle, "share_with_page_destinations", j6q0.class), bundle.getBoolean("share_with_page_suggested_contacts_disabled", false), kp71Var.b.d());
            default:
                cas casVar = (a7m0) obj;
                casVar.a = hp71.a;
                casVar.d = new ip71(kp71Var, (byte) 0);
                casVar.e = new ip71(kp71Var, (byte) 1);
                casVar.a(qi71.R0, new jp71(kp71Var, b2));
                return rih1.a;
        }
    }
}
