package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vuj1 implements wuj1 {
    public final String a;

    public vuj1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vuj1) && this.a.equals(((vuj1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
