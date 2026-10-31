package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class r9n extends Throwable {
    public final String a;

    public r9n(String str) {
        super("Could not resume player after onboarding: ".concat(str));
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof r9n) && u890.j(this.a, ((r9n) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
