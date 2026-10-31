package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class qww extends vww {
    public final String a;

    public qww(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof qww) && u890.j(this.a, ((qww) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
