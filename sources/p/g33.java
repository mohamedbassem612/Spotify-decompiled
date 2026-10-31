package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g33 implements k33 {
    public final String a;

    public g33(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g33) && this.a.equals(((g33) obj).a);
    }

    public final String getSessionId() {
        return this.a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
