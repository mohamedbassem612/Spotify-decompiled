package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class yo1 implements cq1 {
    public final String a;
    public final boolean b;

    public yo1(String str, boolean z) {
        this.a = str;
        this.b = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo1)) {
            return false;
        }
        yo1 yo1Var = (yo1) obj;
        return u890.j(this.a, yo1Var.a) && this.b == yo1Var.b;
    }

    public final int hashCode() {
        return xcg1.g(this.a.hashCode() * 31, 31, this.b);
    }
}
