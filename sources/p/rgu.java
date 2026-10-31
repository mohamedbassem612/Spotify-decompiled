package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rgu implements tgu {
    public final Exception a;

    public rgu(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rgu) && u890.j(this.a, ((rgu) obj).a);
    }

    public final int hashCode() {
        Exception exc = this.a;
        if (exc == null) {
            return 0;
        }
        return exc.hashCode();
    }
}
