package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class rha0 {
    public final kl21 a;
    public final kl21 b;
    public final Map c = b7x.a;
    public final boolean d;

    public rha0(kl21 kl21Var, kl21 kl21Var2) {
        this.a = kl21Var;
        this.b = kl21Var2;
        kl21 kl21Var3 = kl21.a;
        this.d = kl21Var == kl21Var3 && kl21Var2 == kl21Var3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rha0)) {
            return false;
        }
        rha0 rha0Var = (rha0) obj;
        return this.a == rha0Var.a && this.b == rha0Var.b && this.c.equals(rha0Var.c);
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        kl21 kl21Var = this.b;
        return this.c.hashCode() + ((iHashCode + (kl21Var == null ? 0 : kl21Var.hashCode())) * 31);
    }

    public final String toString() {
        return "Jsr305Settings(globalLevel=" + this.a + ", migrationLevel=" + this.b + ", userDefinedLevelForSpecificAnnotation=" + this.c + ')';
    }
}
