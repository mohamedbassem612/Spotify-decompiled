package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class vmc1 implements dbr0 {
    public final String a;

    public vmc1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vmc1) && this.a.equals(((vmc1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
