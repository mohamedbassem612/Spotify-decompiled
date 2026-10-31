package p;

import android.content.Intent;
import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ddr implements ss80 {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ ddr(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final smc0 a(Intent intent) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                smc0 smc0VarN = k4p1.n();
                if (((poj0) obj).v((String) null, intent) && !intent.hasExtra("extra_deeplink_navigation_reference") && !intent.hasExtra("extra_navigation_action") && !intent.hasExtra("extra_interaction_id")) {
                    Bundle bundle = new Bundle();
                    bundle.putString("extra_deeplink_navigation_reference", UUID.randomUUID().toString());
                    smc0VarN.add(new vs80(bundle));
                }
                return k4p1.k(smc0VarN);
            default:
                smc0 smc0VarN2 = k4p1.n();
                smc0VarN2.add(new vs80(mno1.h(new mmr0[]{new mmr0("is_ui_fragments_loaded", Boolean.valueOf(((adh1) obj).D()))})));
                return k4p1.k(smc0VarN2);
        }
    }
}
