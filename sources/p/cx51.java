package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class cx51 implements ex51 {
    public final bx51 a;

    public cx51(bx51 bx51Var) {
        this.a = bx51Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cx51) && this.a == ((cx51) obj).a;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
