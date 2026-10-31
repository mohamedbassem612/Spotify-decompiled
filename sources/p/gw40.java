package p;

import android.content.Context;
import android.content.Intent;
import com.spotify.endless.sessionstarter.EndlessActivity;
import java.io.Serializable;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class gw40 implements jrn0 {
    public final dg30 a;

    public irn0 l(Intent intent, th61 th61Var) {
        ou80 serializableExtra = intent.getSerializableExtra("extra_interaction_id");
        ou80 ou80Var = serializableExtra instanceof ou80 ? serializableExtra : null;
        int i = EndlessActivity.m1;
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(intent.getDataString());
        String str = th61Var.a;
        dg30 dg30Var = this.a;
        Intent intent2 = new Intent((Context) dg30Var, (Class<?>) EndlessActivity.class);
        intent2.putExtra("com.spotify.endless.sessionstarter.KEY_EXTRA_DEEPLINK", s4b1VarX.z());
        intent2.putExtra("com.spotify.endless.sessionstarter.KEY_USERNAME", str);
        if (ou80Var != null) {
            intent2.putExtra("com.spotify.endless.sessionstarter.KEY_INTERACTION_ID", (Serializable) ou80Var);
        }
        dg30Var.startActivity(intent2);
        return crn0.a;
    }
}
