package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class lzu {
    public final String a;

    public lzu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lzu) && u890.j(this.a, ((lzu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
