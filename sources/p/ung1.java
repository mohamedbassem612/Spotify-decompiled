package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ung1 implements vng1 {
    public final a9h a;

    public ung1(a9h a9hVar) {
        this.a = a9hVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ung1) && u890.j(this.a, ((ung1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
