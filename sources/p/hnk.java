package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class hnk implements snk {
    public final String a;

    public hnk(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hnk) && this.a.equals(((hnk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
