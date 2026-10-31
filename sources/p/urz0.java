package p;

import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class urz0 {
    public final int a;
    public final int b;
    public final LinkedHashMap c = new LinkedHashMap();

    public urz0(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof urz0)) {
            return false;
        }
        urz0 urz0Var = (urz0) obj;
        return this.a == urz0Var.a && this.b == urz0Var.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
    }
}
