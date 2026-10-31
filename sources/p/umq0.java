package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class umq0 extends m87 {
    public final String d;

    public umq0(String str) {
        this.d = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof umq0) && u890.j(this.d, ((umq0) obj).d);
    }

    public final int hashCode() {
        return this.d.hashCode();
    }
}
