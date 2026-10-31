package p;

import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x7h1 implements eri1 {
    public static final /* synthetic */ int e = 0;
    public final String a;
    public final byte b;
    public final Map c;
    public final List d;

    static {
        new x7h1("", 0, b7x.a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public x7h1(String str, int i, Map map, List list) {
        this.a = str;
        this.b = i;
        this.c = sqg0.U(map);
        this.d = o7h.l1(list);
    }

    public final List a() {
        String str = this.a;
        int length = str.length();
        List list = this.d;
        byte b = this.b;
        if (length > 0 && b > 0 && list.isEmpty()) {
            return z6x.a;
        }
        smc0 smc0VarN = k4p1.n();
        if (str.length() == 0) {
            smc0VarN.add("Empty action id");
        }
        if (b <= 0) {
            smc0VarN.add("Non-positive version");
        }
        smc0VarN.addAll(list);
        return k4p1.k(smc0VarN);
    }

    public final String b() {
        return this.a;
    }

    public final Map c() {
        return this.c;
    }

    public final int d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x7h1)) {
            return false;
        }
        x7h1 x7h1Var = (x7h1) obj;
        return u890.j(this.a, x7h1Var.a) && this.b == x7h1Var.b && u890.j(this.c, x7h1Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + (((this.a.hashCode() * 31) + this.b) * 31);
    }

    public final String toString() {
        return "UbiInteractionEventAction(name=" + this.a + ", version=" + ((int) this.b) + ", parameters=" + this.c + ')';
    }

    public x7h1(String str, int i, Map map) {
        this(str, i, map, z6x.a);
    }
}
