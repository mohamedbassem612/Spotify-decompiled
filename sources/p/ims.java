package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ims implements kms {
    public final hio a;

    public ims(hio hioVar) {
        this.a = hioVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ims) && this.a.equals(((ims) obj).a);
    }

    public final int hashCode() {
        return this.a.a.hashCode();
    }
}
