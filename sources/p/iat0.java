package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class iat0 implements ebt0 {
    public final String a;

    public iat0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof iat0) && this.a.equals(((iat0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
