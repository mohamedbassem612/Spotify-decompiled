package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uxz0 {
    public final String a;

    public uxz0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uxz0) && this.a.equals(((uxz0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
