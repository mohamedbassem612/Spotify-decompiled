package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zmq0 implements dnq0 {
    public final Exception a;

    public zmq0(Exception exc) {
        this.a = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zmq0) && this.a.equals(((zmq0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
