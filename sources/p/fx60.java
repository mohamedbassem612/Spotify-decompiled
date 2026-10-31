package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fx60 {
    public final jo70 a;

    public fx60(jo70 jo70Var) {
        this.a = jo70Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof fx60) && this.a.equals(((fx60) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
