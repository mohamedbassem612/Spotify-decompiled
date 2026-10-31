package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class ta51 {
    public final String a;
    public final c380 b;
    public final String c;
    public final boolean d;

    public ta51(String str, c380 c380Var, String str2, boolean z) {
        this.a = str;
        this.b = c380Var;
        this.c = str2;
        this.d = z;
    }

    public static ta51 a(ta51 ta51Var, String str, c380 c380Var, int i) {
        if ((i & 2) != 0) {
            c380Var = ta51Var.b;
        }
        return new ta51(str, c380Var, ta51Var.c, (i & 8) != 0 ? ta51Var.d : true);
    }

    public final c380 b() {
        return this.b;
    }

    public final String c() {
        return this.c;
    }

    public final String d() {
        return this.a;
    }

    public final boolean e() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ta51)) {
            return false;
        }
        ta51 ta51Var = (ta51) obj;
        return u890.j(this.a, ta51Var.a) && u890.j(this.b, ta51Var.b) && u890.j(this.c, ta51Var.c) && this.d == ta51Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + cy30.d(kk0.f(this.b, this.a.hashCode() * 31, 31), 31, this.c);
    }

    public /* synthetic */ ta51(String str, c380 c380Var) {
        this(str, c380Var, "", false);
    }
}
