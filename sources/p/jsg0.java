package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class jsg0 extends ksg0 {
    public final String a;

    public jsg0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jsg0) && u890.j(this.a, ((jsg0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
