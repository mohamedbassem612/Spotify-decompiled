package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class vym1 implements yym1 {
    public final String a;

    public vym1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vym1) && this.a.equals(((vym1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
