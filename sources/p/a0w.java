package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a0w extends l0w {
    public final String a;

    public a0w(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a0w) && this.a.equals(((a0w) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
