package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ipc0 implements rpc0 {
    public final int a;

    public ipc0(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ipc0) && this.a == ((ipc0) obj).a;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a);
    }
}
