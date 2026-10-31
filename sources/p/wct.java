package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class wct {
    public final lzy0 a;
    public final byte b;
    public final byte c;

    /* JADX WARN: Multi-variable type inference failed */
    public wct(lzy0 lzy0Var, int i, int i2) {
        hm5.m(lzy0Var, "Null dependency anInterface.");
        this.a = lzy0Var;
        this.b = i;
        this.c = i2;
    }

    public static wct a(Class cls) {
        return new wct(cls, 1, 0);
    }

    public static wct b(lzy0 lzy0Var) {
        return new wct(lzy0Var, 1, 0);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof wct)) {
            return false;
        }
        wct wctVar = (wct) obj;
        return this.a.equals(wctVar.a) && this.b == wctVar.b && this.c == wctVar.c;
    }

    public final int hashCode() {
        return this.c ^ ((((this.a.hashCode() ^ 1000003) * 1000003) ^ this.b) * 1000003);
    }

    public final String toString() {
        String str;
        String str2;
        StringBuilder sb = new StringBuilder("Dependency{anInterface=");
        sb.append(this.a);
        sb.append(", type=");
        byte b = this.b;
        if (b == 1) {
            str = "required";
        } else {
            str = b == 0 ? "optional" : "set";
        }
        sb.append(str);
        sb.append(", injection=");
        byte b2 = this.c;
        if (b2 == 0) {
            str2 = "direct";
        } else if (b2 == 1) {
            str2 = "provider";
        } else {
            if (b2 != 2) {
                eg.f(f4i1.c(b2, "Unsupported injection: "));
                return null;
            }
            str2 = "deferred";
        }
        return l1d.n(str2, "}", sb);
    }

    public wct(Class cls, int i, int i2) {
        this(lzy0.a(cls), i, i2);
    }
}
