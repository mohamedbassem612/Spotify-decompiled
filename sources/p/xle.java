package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xle implements wle {
    public final String a;

    public xle(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof xle) && this.a.equals(((xle) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
