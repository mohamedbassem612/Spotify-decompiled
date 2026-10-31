package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class eff0 implements gff0 {
    public final String a;

    public eff0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof eff0) && u890.j(this.a, ((eff0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
