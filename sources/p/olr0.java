package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class olr0 extends plr0 {
    public final vov0 a;

    public olr0(vov0 vov0Var) {
        this.a = vov0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof olr0) && this.a.equals(((olr0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
