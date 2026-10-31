package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class b52 implements c52 {
    public final String a;

    public b52(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b52) && this.a.equals(((b52) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
