package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ph8 extends qh8 {
    public final ug8 a;

    public ph8(ug8 ug8Var) {
        this.a = ug8Var;
    }

    public final ug8 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ph8) && this.a.equals(((ph8) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
