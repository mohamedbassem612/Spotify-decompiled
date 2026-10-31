package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class z09 {
    public final String a;
    public final ArrayList b;

    public z09(String str, ArrayList arrayList) {
        if (str == null) {
            bhn0.i("Null userAgent");
            throw null;
        }
        this.a = str;
        this.b = arrayList;
    }

    public final List a() {
        return this.b;
    }

    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof z09)) {
            return false;
        }
        z09 z09Var = (z09) obj;
        return this.a.equals(z09Var.a) && this.b.equals(z09Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() ^ ((this.a.hashCode() ^ 1000003) * 1000003);
    }

    public final String toString() {
        return "HeartBeatResult{userAgent=" + this.a + ", usedDates=" + this.b + "}";
    }
}
