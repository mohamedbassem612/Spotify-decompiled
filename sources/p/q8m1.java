package p;

import com.spotify.wrapped.v1.proto.CardShareConfiguration;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q8m1 {
    public final String a;
    public final CardShareConfiguration b;
    public final gec c;
    public final int d;
    public final Function0 e;

    public q8m1(String str, CardShareConfiguration cardShareConfiguration, gec gecVar, int i, int i2) {
        w3l1 w3l1Var = vbh1.h;
        i = (i2 & 16) != 0 ? 0 : i;
        w3l1Var = (i2 & 32) != 0 ? w3l1.b1 : w3l1Var;
        this.a = str;
        this.b = cardShareConfiguration;
        this.c = gecVar;
        this.d = i;
        this.e = w3l1Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q8m1)) {
            return false;
        }
        q8m1 q8m1Var = (q8m1) obj;
        return u890.j(this.a, q8m1Var.a) && u890.j(this.b, q8m1Var.b) && this.c.equals(q8m1Var.c) && this.d == q8m1Var.d && this.e.equals(q8m1Var.e);
    }

    public final int hashCode() {
        return this.e.hashCode() + kaa0.f(this.d, (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 961, 31);
    }
}
