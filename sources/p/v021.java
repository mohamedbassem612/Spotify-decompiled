package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class v021 implements w021 {
    public final String a;
    public final m0u b;
    public final boolean c;

    public v021(String str, m0u m0uVar, boolean z) {
        this.a = str;
        this.b = m0uVar;
        this.c = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v021)) {
            return false;
        }
        v021 v021Var = (v021) obj;
        return u890.j(this.a, v021Var.a) && u890.j(this.b, v021Var.b) && this.c == v021Var.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
