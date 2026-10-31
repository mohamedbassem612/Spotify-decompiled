package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class f1x extends h1x {
    public final Exception a;

    public f1x(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f1x) && u890.j(this.a, ((f1x) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }
}
