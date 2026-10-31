package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wwu0 implements ywu0 {
    public final le30 a;

    public wwu0(le30 le30Var) {
        this.a = le30Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wwu0) && this.a == ((wwu0) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
