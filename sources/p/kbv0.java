package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class kbv0 {
    public final String a;

    public kbv0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof kbv0) && this.a.equals(((kbv0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
