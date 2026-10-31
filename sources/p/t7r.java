package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class t7r {
    public final String a;

    public t7r(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t7r) && this.a.equals(((t7r) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
