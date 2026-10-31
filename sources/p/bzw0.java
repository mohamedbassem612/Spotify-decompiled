package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class bzw0 implements kzw0 {
    public final String a;

    public bzw0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bzw0) && this.a.equals(((bzw0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
