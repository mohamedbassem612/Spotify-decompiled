package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vdj0 extends ydj0 {
    public final String a;

    public vdj0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vdj0) && this.a.equals(((vdj0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
