package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class jki0 extends hso1 {
    public final String b;

    public jki0(String str) {
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jki0) && u890.j(this.b, ((jki0) obj).b);
    }

    public final int hashCode() {
        return this.b.hashCode();
    }
}
