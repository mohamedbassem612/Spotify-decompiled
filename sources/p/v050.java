package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class v050 implements z050 {
    public final String a;

    public v050(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v050) && this.a.equals(((v050) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
