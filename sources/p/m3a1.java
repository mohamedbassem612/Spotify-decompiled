package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class m3a1 implements h4a1 {
    public final tpt a;

    public m3a1(tpt tptVar) {
        this.a = tptVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m3a1) && u890.j(this.a, ((m3a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
