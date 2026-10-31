package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kcn implements tcn {
    public final String a;
    public final int b;

    public kcn(String str, int i) {
        this.a = str;
        this.b = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof kcn)) {
            return false;
        }
        kcn kcnVar = (kcn) obj;
        return u890.j(this.a, kcnVar.a) && this.b == kcnVar.b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.b) + (this.a.hashCode() * 31);
    }
}
