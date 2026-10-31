package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qzz implements t600 {
    public final String a;

    public qzz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qzz) && u890.j(this.a, ((qzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
