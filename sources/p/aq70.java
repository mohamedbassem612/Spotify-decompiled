package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aq70 {
    public final String a;
    public final String b;

    public aq70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof aq70)) {
            return false;
        }
        aq70 aq70Var = (aq70) obj;
        return this.a.equals(aq70Var.a) && this.b.equals(aq70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
