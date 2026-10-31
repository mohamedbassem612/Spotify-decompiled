package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class sme extends qme {
    public final char a;
    public final char b;

    public sme(char c, char c2) {
        this.a = c;
        this.b = c2;
    }

    public final boolean d(char c) {
        return c == this.a || c == this.b;
    }

    public final String toString() {
        return "CharMatcher.anyOf(\"" + xme.g(this.a) + xme.g(this.b) + "\")";
    }
}
