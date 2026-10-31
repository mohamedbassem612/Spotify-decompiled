package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class inu0 implements knu0 {
    public final boolean a;
    public final String b;

    public inu0(boolean z, String str) {
        this.a = z;
        this.b = str;
    }

    public final boolean a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof inu0)) {
            return false;
        }
        inu0 inu0Var = (inu0) obj;
        return this.a == inu0Var.a && u890.j(this.b, inu0Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (Boolean.hashCode(this.a) * 31);
    }
}
