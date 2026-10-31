package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class h861 implements i861 {
    public final String a;

    public h861(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof h861) && this.a.equals(((h861) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
