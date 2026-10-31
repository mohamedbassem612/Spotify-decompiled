package p;

import java.io.File;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vy8 {
    public final uy8 a;
    public final String b;
    public final File c;

    public vy8(uy8 uy8Var, String str, File file) {
        this.a = uy8Var;
        if (str == null) {
            bhn0.i("Null sessionId");
            throw null;
        }
        this.b = str;
        this.c = file;
    }

    public final vin a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof vy8)) {
            return false;
        }
        vy8 vy8Var = (vy8) obj;
        return this.a.equals(vy8Var.a) && this.b.equals(vy8Var.b) && this.c.equals(vy8Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b.hashCode()) * 1000003);
    }

    public final String toString() {
        return "CrashlyticsReportWithSessionId{report=" + this.a + ", sessionId=" + this.b + ", reportFile=" + this.c + "}";
    }
}
