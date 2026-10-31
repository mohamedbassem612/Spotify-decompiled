package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class ysc0 extends htc0 {
    public final unl a;

    public ysc0(unl unlVar) {
        this.a = unlVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ysc0) && u890.j(this.a, ((ysc0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
