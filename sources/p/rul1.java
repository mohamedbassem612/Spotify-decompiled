package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class rul1 implements Comparable {
    public final l560 a;
    public final String b;
    public final boolean c;

    public rul1(l560 l560Var, String str, boolean z) {
        this.a = l560Var;
        this.b = str;
        this.c = z;
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        return this.b.compareTo(((rul1) obj).b);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof rul1)) {
            return false;
        }
        rul1 rul1Var = (rul1) obj;
        return this.a.equals(rul1Var.a) && this.b.equals(rul1Var.b) && this.c == rul1Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + cy30.d(this.a.a.hashCode() * 31, 31, this.b);
    }
}
