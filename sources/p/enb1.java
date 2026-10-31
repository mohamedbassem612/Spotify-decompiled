package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class enb1 implements job1 {
    public final String a;
    public final String b;

    public enb1(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof enb1)) {
            return false;
        }
        enb1 enb1Var = (enb1) obj;
        return this.a.equals(enb1Var.a) && u890.j(this.b, enb1Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
