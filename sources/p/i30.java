package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class i30 {
    public final String a;
    public final c380 b;

    public i30(String str, c380 c380Var) {
        this.a = str;
        this.b = c380Var;
    }

    public final String a() {
        return this.a;
    }

    public final c380 b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i30)) {
            return false;
        }
        i30 i30Var = (i30) obj;
        return this.a.equals(i30Var.a) && u890.j(this.b, i30Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
