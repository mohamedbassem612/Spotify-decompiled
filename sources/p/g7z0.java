package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class g7z0 extends z8z0 {
    public final String a;

    public g7z0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g7z0) && u890.j(this.a, ((g7z0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
