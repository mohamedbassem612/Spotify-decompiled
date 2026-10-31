package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w401 implements f501 {
    public final c380 a;

    public w401(c380 c380Var) {
        this.a = c380Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof w401) && u890.j(this.a, ((w401) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
