package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class nme extends xme {
    public final xme a;
    public final xme b;

    public nme(xme xmeVar, xme xmeVar2) {
        this.a = xmeVar;
        xmeVar2.getClass();
        this.b = xmeVar2;
    }

    public final boolean apply(Object obj) {
        return d(((Character) obj).charValue());
    }

    public final boolean d(char c) {
        return this.a.d(c) && this.b.d(c);
    }

    public final String toString() {
        return "CharMatcher.and(" + this.a + ", " + this.b + ")";
    }
}
