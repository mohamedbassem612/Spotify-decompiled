package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class k000 implements b600 {
    public final String a;

    public k000(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof k000) && this.a.equals(((k000) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
