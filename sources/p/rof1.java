package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rof1 implements tof1 {
    public final fof1 a;

    public rof1(fof1 fof1Var) {
        this.a = fof1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rof1) && u890.j(this.a, ((rof1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
