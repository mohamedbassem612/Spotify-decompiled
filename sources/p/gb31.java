package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class gb31 implements jb31 {
    public final String a;

    public gb31(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gb31) && u890.j(this.a, ((gb31) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
