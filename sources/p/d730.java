package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class d730 {
    public final String a;
    public final String b;

    public d730(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d730)) {
            return false;
        }
        d730 d730Var = (d730) obj;
        return u890.j(this.a, d730Var.a) && u890.j(this.b, d730Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
