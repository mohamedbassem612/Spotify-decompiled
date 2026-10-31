package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class of9 implements pf9 {
    public final String a;

    public of9(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof of9) && this.a.equals(((of9) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
