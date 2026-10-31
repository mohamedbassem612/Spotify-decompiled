package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class wyg0 {
    public final String a;

    public wyg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyg0) && this.a.equals(((wyg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
