package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class azz implements k700 {
    public final String a;

    public azz(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof azz) && u890.j(this.a, ((azz) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
