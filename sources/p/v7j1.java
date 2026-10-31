package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v7j1 implements z7j1 {
    public final lzt0 a;

    public v7j1(lzt0 lzt0Var) {
        this.a = lzt0Var;
    }

    public final lzt0 a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof v7j1) && u890.j(this.a, ((v7j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
