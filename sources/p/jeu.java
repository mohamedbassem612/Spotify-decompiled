package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jeu implements vi0 {
    public final String a;

    public jeu(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof jeu) && u890.j(this.a, ((jeu) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
