package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dr10 implements er10 {
    public final String a;

    public dr10(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof dr10) && u890.j(this.a, ((dr10) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
