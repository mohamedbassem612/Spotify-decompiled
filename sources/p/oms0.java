package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oms0 implements pms0 {
    public final String a;
    public final String b;

    public oms0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oms0)) {
            return false;
        }
        oms0 oms0Var = (oms0) obj;
        return u890.j(this.a, oms0Var.a) && u890.j(this.b, oms0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
