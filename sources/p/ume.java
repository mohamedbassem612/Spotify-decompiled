package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class ume extends xme {
    public final xme a;

    public ume(xme xmeVar) {
        this.a = xmeVar;
    }

    public final boolean apply(Object obj) {
        return d(((Character) obj).charValue());
    }

    public final boolean d(char c) {
        return !this.a.d(c);
    }

    public final xme e() {
        return this.a;
    }

    public final String toString() {
        return this.a + ".negate()";
    }
}
