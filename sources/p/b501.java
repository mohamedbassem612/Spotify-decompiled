package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class b501 implements f501 {
    public final String a;

    public b501(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof b501) && this.a.equals(((b501) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
