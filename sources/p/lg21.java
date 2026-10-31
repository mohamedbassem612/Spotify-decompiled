package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class lg21 implements pg21 {
    public final apl a;

    public lg21(apl aplVar) {
        this.a = aplVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof lg21) && u890.j(this.a, ((lg21) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
