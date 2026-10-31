package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class gm81 implements fm81 {
    public final zah1 a;

    public gm81(zah1 zah1Var) {
        this.a = zah1Var;
    }

    @Override // p.fm81
    public final zah1 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof gm81) && u890.j(this.a, ((gm81) obj).a);
    }

    public final int hashCode() {
        zah1 zah1Var = this.a;
        if (zah1Var == null) {
            return 0;
        }
        return zah1Var.hashCode();
    }
}
