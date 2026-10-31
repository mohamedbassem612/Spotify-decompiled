package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a371 {
    public final String a;

    public a371(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a371) && u890.j(this.a, ((a371) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
