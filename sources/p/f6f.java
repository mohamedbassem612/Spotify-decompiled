package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class f6f implements r6f {
    public final String a;

    public f6f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f6f) && u890.j(this.a, ((f6f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
