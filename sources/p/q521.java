package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class q521 implements s521 {
    public final String a;

    public q521(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof q521) && this.a.equals(((q521) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
