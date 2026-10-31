package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n33 implements r33 {
    public final String a;

    public n33(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n33) && this.a.equals(((n33) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
