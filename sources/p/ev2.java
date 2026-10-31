package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ev2 {
    public final String a;
    public final String b;
    public final int c;
    public final boolean d;

    public ev2(int i, String str, String str2, boolean z) {
        this.a = str;
        this.b = str2;
        this.c = i;
        this.d = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev2)) {
            return false;
        }
        ev2 ev2Var = (ev2) obj;
        return this.a.equals(ev2Var.a) && this.b.equals(ev2Var.b) && this.c == ev2Var.c && this.d == ev2Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + ab80.k(this.c, cy30.d(this.a.hashCode() * 31, 31, this.b), 31);
    }
}
