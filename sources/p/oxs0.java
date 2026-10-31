package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oxs0 {
    public final String a;

    public oxs0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oxs0) && this.a.equals(((oxs0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
