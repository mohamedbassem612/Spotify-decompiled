package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cuf {
    public final String a;

    public cuf(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cuf) && u890.j(this.a, ((cuf) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
