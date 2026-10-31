package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c071 extends j071 {
    public final String a;

    public c071(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c071) && this.a.equals(((c071) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
