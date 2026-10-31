package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class npc0 implements rpc0 {
    public final mpc0 a;

    public npc0(mpc0 mpc0Var) {
        this.a = mpc0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof npc0) && this.a.equals(((npc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
