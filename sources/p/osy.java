package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class osy {
    public final vvy a;

    public osy(vvy vvyVar) {
        this.a = vvyVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof osy) && this.a.equals(((osy) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
