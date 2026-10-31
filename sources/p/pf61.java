package p;

import android.os.Bundle;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pf61 {
    public static final bma1 e = bma1.b.q("checkout_source");
    public final dma1 a;
    public String b;
    public int c;
    public String d;

    public pf61(dma1 dma1Var) {
        this.a = dma1Var;
    }

    public final String a() {
        String str = this.d;
        if (str != null) {
            return str;
        }
        String string = UUID.randomUUID().toString();
        this.d = string;
        return string;
    }

    public final UUID b() {
        return UUID.fromString(a());
    }

    public final String c() {
        String str = this.b;
        if (str != null) {
            return str;
        }
        String str2 = null;
        String strE = this.a.e(e, (String) null);
        if (strE != null) {
            this.b = strE;
            str2 = strE;
        }
        if (str2 != null) {
            return str2;
        }
        n57.e("sessionIdProvider.source was null");
        return "unknown";
    }

    public final boolean d(x8c0 x8c0Var, oe41 oe41Var) {
        boolean z = false;
        if (this.c == 0) {
            Bundle bundleA = oe41Var.a("session_id_provider_state");
            String string = bundleA != null ? bundleA.getString("session_id") : null;
            if (string == null) {
                string = UUID.randomUUID().toString();
                z = true;
            }
            this.d = string;
        }
        oe41Var.e("session_id_provider_state");
        oe41Var.c("session_id_provider_state", new uk(this, (byte) 19));
        this.c++;
        x8c0Var.a(new i83(this, (byte) 21));
        return z;
    }
}
