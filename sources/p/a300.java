package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class a300 implements y600 {
    public final String a;

    public a300(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a300) && u890.j(this.a, ((a300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
