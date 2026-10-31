package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zwb1 {
    public final String a;
    public final List b;

    public zwb1(String str, smc0 smc0Var) {
        this.a = str;
        this.b = smc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zwb1)) {
            return false;
        }
        zwb1 zwb1Var = (zwb1) obj;
        return this.a.equals(zwb1Var.a) && this.b.equals(zwb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
