package p;

import com.google.protobuf.Duration;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class yo60 implements ez00 {
    public final String a;
    public final String b;
    public final String c;
    public final myp0 d;
    public final String e;
    public final Duration f;
    public final Duration g;
    public final String h;
    public final int i;

    public yo60(String str, String str2, String str3, myp0 myp0Var, String str4, Duration duration, Duration duration2, String str5, int i) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = myp0Var;
        this.e = str4;
        this.f = duration;
        this.g = duration2;
        this.h = str5;
        this.i = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof yo60)) {
            return false;
        }
        yo60 yo60Var = (yo60) obj;
        return this.a.equals(yo60Var.a) && u890.j(this.b, yo60Var.b) && this.c.equals(yo60Var.c) && this.d.equals(yo60Var.d) && u890.j(this.e, yo60Var.e) && this.f.equals(yo60Var.f) && this.g.equals(yo60Var.g) && this.h.equals(yo60Var.h) && this.i == yo60Var.i;
    }

    public final int hashCode() {
        int iHashCode = this.a.hashCode() * 31;
        String str = this.b;
        int iHashCode2 = (this.d.hashCode() + cy30.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.c)) * 31;
        String str2 = this.e;
        return l1d.C(this.i) + cy30.d((this.g.hashCode() + ((this.f.hashCode() + ((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31)) * 31)) * 31, 31, this.h);
    }

    public final String toString() {
        return f4i1.f(this.a, ", ", this.b);
    }
}
