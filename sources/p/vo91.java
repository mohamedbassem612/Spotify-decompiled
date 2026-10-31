package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class vo91 extends yo91 {
    public final zo91 a;

    public vo91(zo91 zo91Var) {
        this.a = zo91Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vo91) && this.a.equals(((vo91) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
