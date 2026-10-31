package p;

import com.google.protobuf.Timestamp;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x5r implements yue1 {
    public final String X;
    public final String a;
    public final String b;
    public final d761 c;
    public final d761 d;
    public final String e;
    public final String f;
    public final Timestamp g;
    public final String h;
    public final int i;
    public final b6r t;

    public x5r(String str, String str2, d761 d761Var, d761 d761Var2, String str3, String str4, Timestamp timestamp, String str5, int i, b6r b6rVar) {
        this.a = str;
        this.b = str2;
        this.c = d761Var;
        this.d = d761Var2;
        this.e = str3;
        this.f = str4;
        this.g = timestamp;
        this.h = str5;
        this.i = i;
        this.t = b6rVar;
        this.X = timestamp.toString();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof x5r)) {
            return false;
        }
        x5r x5rVar = (x5r) obj;
        return this.a.equals(x5rVar.a) && this.b.equals(x5rVar.b) && u890.j(this.c, x5rVar.c) && u890.j(this.d, x5rVar.d) && this.e.equals(x5rVar.e) && u890.j(this.f, x5rVar.f) && this.g.equals(x5rVar.g) && this.h.equals(x5rVar.h) && this.i == x5rVar.i && this.t.equals(x5rVar.t);
    }

    public final String getId() {
        return this.X;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        d761 d761Var = this.c;
        int iHashCode = (iD + (d761Var == null ? 0 : Arrays.hashCode(d761Var.a))) * 31;
        d761 d761Var2 = this.d;
        int iD2 = cy30.d((iHashCode + (d761Var2 == null ? 0 : Arrays.hashCode(d761Var2.a))) * 31, 31, this.e);
        String str = this.f;
        return this.t.hashCode() + kaa0.f(this.i, cy30.d((this.g.hashCode() + ((iD2 + (str != null ? str.hashCode() : 0)) * 31)) * 31, 31, this.h), 31);
    }
}
