package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import java.io.Serializable;
import java.util.Collections;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j371 implements g50 {
    public final /* synthetic */ byte a;
    public final ab71 b;

    public /* synthetic */ j371(ab71 ab71Var, byte b) {
        this.a = b;
        this.b = ab71Var;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        byte b = this.a;
        vej0 vej0Var = vej0.a;
        ab71 ab71Var = this.b;
        switch (b) {
            case 0:
                Serializable serializable = bundle.getSerializable("CLICK_ACTION_METADATA");
                Map map = serializable instanceof Map ? (Map) serializable : null;
                String str3 = map != null ? (String) map.get("shareImageUrl") : null;
                tv80 tv80VarV = jhc1.v(bundle, "UBI_INTERACTION_LOGGING_RESULT", tv80.class);
                if (str3 != null) {
                    w1q0Var.invoke(Boolean.TRUE);
                    ab71Var.a.a(new wa71(str2, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), mno1.h(new mmr0[]{new mmr0("messaging.share.image_url", str3)}), new vm71("android-libs-inappmessaging"), tv80VarV, Collections.singletonList(vej0Var));
                } else {
                    Logger.d("ShareContentActionHandler", new Object[]{"Missing shareImageUrl in click action metadata for ".concat(str)});
                    w1q0Var.invoke(Boolean.FALSE);
                }
                break;
            default:
                w1q0Var.invoke(Boolean.TRUE);
                xh71.b(ab71Var.a, new wa71(str2, (String) null, (cqs0) null, (dqi1) null, (String) null, (String) null, (Bundle) null, 126), (Bundle) null, new vm71("android-libs-inappmessaging"), jhc1.v(bundle, "UBI_INTERACTION_LOGGING_RESULT", tv80.class), Collections.singletonList(vej0Var), 2);
                break;
        }
    }
}
