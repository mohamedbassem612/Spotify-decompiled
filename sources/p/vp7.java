package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vp7 {
    public final String a;

    public vp7(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vp7) && this.a.equals(((vp7) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
