package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cvf0 extends w361 {
    public final tv80 c;

    public cvf0(tv80 tv80Var) {
        this.c = tv80Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof cvf0) && u890.j(this.c, ((cvf0) obj).c);
    }

    public final int hashCode() {
        return this.c.hashCode();
    }
}
