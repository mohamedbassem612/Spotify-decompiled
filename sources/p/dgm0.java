package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dgm0 implements mhm0 {
    public final String a;

    public dgm0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dgm0) && this.a.equals(((dgm0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
