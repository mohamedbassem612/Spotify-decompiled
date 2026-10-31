package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ebu0 {
    public static final ebu0 c = new ebu0(false, false);
    public static final String d;
    public static final String e;
    public final boolean a;
    public final boolean b;

    static {
        String str = zoi1.a;
        d = Integer.toString(0, 36);
        e = Integer.toString(1, 36);
    }

    public ebu0(boolean z, boolean z2) {
        this.a = z;
        this.b = z2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ebu0)) {
            return false;
        }
        ebu0 ebu0Var = (ebu0) obj;
        return this.a == ebu0Var.a && this.b == ebu0Var.b;
    }

    public final int hashCode() {
        return Objects.hash(Boolean.valueOf(this.a), Boolean.valueOf(this.b));
    }
}
