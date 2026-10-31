package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class lwk implements fxk {
    public final dyh1 a;

    public lwk(dyh1 dyh1Var) {
        this.a = dyh1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lwk) && u890.j(this.a, ((lwk) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
