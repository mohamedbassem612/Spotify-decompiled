package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class z7h1 implements eri1 {
    public final String a;
    public final boolean b;
    public final Map c;

    static {
        new z7h1("", 0, b7x.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z7h1(String str, int i, Map map) {
        this.a = str;
        this.b = i;
        this.c = sqg0.U(map);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [boolean] */
    public final List a() {
        String str = this.a;
        int length = str.length();
        ?? r2 = this.b;
        if (length > 0 && r2 > 0) {
            return z6x.a;
        }
        smc0 smc0VarN = k4p1.n();
        if (str.length() == 0) {
            smc0VarN.add("Empty interaction type");
        }
        if (r2 <= 0) {
            smc0VarN.add("Non-positive version");
        }
        return k4p1.k(smc0VarN);
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.c;
    }

    public final int d() {
        return this.b ? 1 : 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z7h1)) {
            return false;
        }
        z7h1 z7h1Var = (z7h1) obj;
        return u890.j(this.a, z7h1Var.a) && this.b == z7h1Var.b && this.c.equals(z7h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + (this.b ? 1 : 0)) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventType(name=" + this.a + ", version=" + (this.b ? 1 : 0) + ", parameters=" + this.c + ')';
    }
}
