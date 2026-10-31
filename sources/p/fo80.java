package p;

import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class fo80 {
    public final cu71 a;
    public final xk4 b;
    public String c;

    public fo80(cu71 cu71Var, xk4 xk4Var) {
        this.a = cu71Var;
        this.b = xk4Var;
    }

    public final String a() {
        String str = this.c;
        if (str != null) {
            return str;
        }
        String strA = this.b.a();
        cu71 cu71Var = this.a;
        cu71Var.getClass();
        nn61 nn61Var = cu71Var.a;
        String string = nn61Var.c().getString("es_sdk_last_android_id", null);
        String string2 = nn61Var.c().getString("installation_id", null);
        if (string2 == null || string == null || !string.equals(strA)) {
            string2 = UUID.randomUUID().toString();
            nn61Var.c().edit().putString("es_sdk_last_android_id", strA).apply();
            nn61Var.c().edit().putString("installation_id", string2).apply();
        }
        this.c = string2;
        return string2;
    }
}
