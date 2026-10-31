package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ykc extends jlc {
    public final gmc a;

    public ykc(gmc gmcVar) {
        this.a = gmcVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ykc) && this.a.equals(((ykc) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
