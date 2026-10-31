package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ihj0 extends lhj0 {
    public final String a;

    public ihj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ihj0) && this.a.equals(((ihj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
