package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wyh {
    public final String a;

    public wyh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wyh) && this.a.equals(((wyh) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
