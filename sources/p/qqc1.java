package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class qqc1 extends sqc1 {
    public final String a;
    public final String b;

    public qqc1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof qqc1)) {
            return false;
        }
        qqc1 qqc1Var = (qqc1) obj;
        return this.a.equals(qqc1Var.a) && this.b.equals(qqc1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
