package p;

import android.content.Context;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ot71 {
    public static final vzh b;
    public final Context a;

    static {
        hzh hzhVarA = vzh.a(ot71.class);
        hzhVarA.a(wct.a(qok0.class));
        hzhVarA.a(wct.a(Context.class));
        hzhVarA.f = new adm1();
        b = hzhVarA.b();
    }

    public ot71(Context context) {
        this.a = context;
    }

    public final synchronized String a() {
        String string = this.a.getSharedPreferences("com.google.mlkit.internal", 0).getString("ml_sdk_instance_id", null);
        if (string != null) {
            return string;
        }
        String string2 = UUID.randomUUID().toString();
        this.a.getSharedPreferences("com.google.mlkit.internal", 0).edit().putString("ml_sdk_instance_id", string2).apply();
        return string2;
    }
}
