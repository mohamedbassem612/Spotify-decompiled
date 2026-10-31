package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class feb1 implements geb1 {
    public final String a;

    public feb1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof feb1) && u890.j(this.a, ((feb1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
