package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class yo3 extends hr3 {
    public final tv80 a;
    public final String b;

    public yo3(String str, tv80 tv80Var) {
        this.a = tv80Var;
        this.b = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo3)) {
            return false;
        }
        yo3 yo3Var = (yo3) obj;
        return this.a.equals(yo3Var.a) && u890.j(this.b, yo3Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
