package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jif1 {
    public final String a;

    public jif1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jif1) && u890.j(this.a, ((jif1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
