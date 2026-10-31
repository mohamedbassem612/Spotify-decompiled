package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class yxj1 {
    public final fvz a;

    public yxj1(fvz fvzVar) {
        this.a = fvzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof yxj1) && u890.j(this.a, ((yxj1) obj).a);
    }

    public final int hashCode() {
        fvz fvzVar = this.a;
        if (fvzVar == null) {
            return 0;
        }
        return fvzVar.hashCode();
    }
}
