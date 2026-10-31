package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class rig0 implements tig0 {
    public final int a;

    public rig0(int i) {
        this.a = i;
    }

    public final int a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof rig0) && this.a == ((rig0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
