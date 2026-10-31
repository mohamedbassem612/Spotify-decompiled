package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class oi61 implements pi61 {
    public final String a;

    public oi61(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof oi61) && this.a.equals(((oi61) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
