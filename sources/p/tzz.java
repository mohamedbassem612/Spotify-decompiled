package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class tzz implements q600 {
    public final String a;

    public tzz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof tzz) && u890.j(this.a, ((tzz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
