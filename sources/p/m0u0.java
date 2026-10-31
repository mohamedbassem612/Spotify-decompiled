package p;

import java.util.Map;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m0u0 implements hoh0 {
    public final o2u0 a;
    public final String b;
    public final String c;
    public final String d = nhc1.W(UUID.randomUUID().toString(), "-", "");

    public m0u0(o2u0 o2u0Var, String str, String str2) {
        this.a = o2u0Var;
        this.b = str;
        this.c = str2;
    }

    public final String a() {
        return this.a.a;
    }

    public final Map b() {
        return this.a.d;
    }

    public final String c() {
        return this.d;
    }

    public final String d() {
        String str = (String) this.a.d.get("betamax_override_feature_identifier");
        return str == null ? this.c : str;
    }

    public final boolean e() {
        return this.a.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m0u0)) {
            return false;
        }
        m0u0 m0u0Var = (m0u0) obj;
        return this.d.equals(m0u0Var.d) && u890.j(this.a, m0u0Var.a) && u890.j(d(), m0u0Var.d()) && u890.j(this.b, m0u0Var.b);
    }

    public final boolean f() {
        String str = (String) this.a.d.get("endvideo_track_uri");
        boolean z = false;
        if (str != null && ihc1.h0(str, "track", false)) {
            z = true;
        }
        return !z;
    }

    public final boolean g() {
        return this.a.c;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((d().hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
