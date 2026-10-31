package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zxj1 {
    public final fvz a;

    public zxj1(fvz fvzVar) {
        this.a = fvzVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof zxj1) && u890.j(this.a, ((zxj1) obj).a);
    }

    public final int hashCode() {
        fvz fvzVar = this.a;
        if (fvzVar == null) {
            return 0;
        }
        return fvzVar.hashCode();
    }
}
