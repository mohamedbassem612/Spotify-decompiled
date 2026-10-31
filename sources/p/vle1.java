package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class vle1 implements yle1 {
    public final String a;

    public vle1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vle1) && this.a.equals(((vle1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
