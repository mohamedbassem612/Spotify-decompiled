package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uvn0 extends wvn0 {
    public final nsn0 a;

    public uvn0(nsn0 nsn0Var) {
        this.a = nsn0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof uvn0) && u890.j(this.a, ((uvn0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public final String toString() {
        return super.toString();
    }
}
