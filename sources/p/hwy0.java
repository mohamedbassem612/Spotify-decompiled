package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hwy0 extends kwy0 {
    public final String a;

    public hwy0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof hwy0) && this.a.equals(((hwy0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
