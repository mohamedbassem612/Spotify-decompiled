package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class q021 implements w021 {
    public final String a;
    public final m0u b;

    public q021(String str, m0u m0uVar) {
        this.a = str;
        this.b = m0uVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q021)) {
            return false;
        }
        q021 q021Var = (q021) obj;
        return u890.j(this.a, q021Var.a) && u890.j(this.b, q021Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
