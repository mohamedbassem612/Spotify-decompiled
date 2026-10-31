package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class s8l1 extends u8l1 {
    public final r160 a;

    public s8l1(r160 r160Var) {
        this.a = r160Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof s8l1) && u890.j(this.a, ((s8l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
