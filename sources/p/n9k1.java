package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n9k1 implements s9k1 {
    public final String a;

    public n9k1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof n9k1) && this.a.equals(((n9k1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
