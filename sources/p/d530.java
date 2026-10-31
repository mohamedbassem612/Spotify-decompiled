package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class d530 implements e530 {
    public final s630 a;

    public d530(s630 s630Var) {
        this.a = s630Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d530) && this.a.equals(((d530) obj).a);
    }

    public final int hashCode() {
        return Boolean.hashCode(this.a.a);
    }
}
