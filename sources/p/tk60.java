package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class tk60 {
    public final String a;
    public final byte b;
    public final double c;
    public final String d;

    /* JADX WARN: Multi-variable type inference failed */
    public tk60(int i, String str, String str2) {
        boolean z = true;
        if (i == 1 && !str2.startsWith("0x") && !str2.startsWith("0X")) {
            z = false;
        }
        dm5.y(z);
        this.a = str;
        this.b = i;
        this.d = str2;
        this.c = 0.0d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tk60)) {
            return false;
        }
        tk60 tk60Var = (tk60) obj;
        return this.b == tk60Var.b && Double.compare(this.c, tk60Var.c) == 0 && this.a.equals(tk60Var.a) && Objects.equals(this.d, tk60Var.d);
    }

    public final int hashCode() {
        return Objects.hash(this.a, Integer.valueOf(this.b), Double.valueOf(this.c), this.d);
    }

    public tk60(String str, double d) {
        this.a = str;
        this.b = (byte) 2;
        this.c = d;
        this.d = null;
    }
}
