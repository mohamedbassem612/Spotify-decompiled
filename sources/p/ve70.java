package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ve70 {
    public final String a;
    public final String b;

    public ve70(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ve70)) {
            return false;
        }
        ve70 ve70Var = (ve70) obj;
        return this.a.equals(ve70Var.a) && u890.j(this.b, ve70Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
