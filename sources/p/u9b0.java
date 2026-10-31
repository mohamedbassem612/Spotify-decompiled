package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class u9b0 {
    public static final String c;
    public static final String d;
    public final String a;
    public final String b;

    static {
        String str = zoi1.a;
        c = Integer.toString(0, 36);
        d = Integer.toString(1, 36);
    }

    public u9b0(String str, String str2) {
        this.a = zoi1.X(str);
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && u9b0.class == obj.getClass()) {
            u9b0 u9b0Var = (u9b0) obj;
            if (Objects.equals(this.a, u9b0Var.a) && Objects.equals(this.b, u9b0Var.b)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.b.hashCode() * 31;
        String str = this.a;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("{ lang=");
        sb.append(this.a);
        sb.append(", '");
        return l1d.n(this.b, "' }", sb);
    }
}
