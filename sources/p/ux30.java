package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ux30 extends wx30 {
    public final String a;

    public ux30(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ux30) && this.a.equals(((ux30) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
