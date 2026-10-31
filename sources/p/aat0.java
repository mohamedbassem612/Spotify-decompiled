package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class aat0 {
    public final String a;

    public aat0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof aat0) && this.a.equals(((aat0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
