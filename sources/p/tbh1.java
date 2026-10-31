package p;

import android.os.ResultReceiver;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class tbh1 {
    public final String a;
    public final lbh1 b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final Integer f;
    public final boolean g;
    public final Function0 h;
    public final Function0 i;
    public final ResultReceiver j;

    public tbh1(String str, lbh1 lbh1Var, boolean z, boolean z2, boolean z3, Integer num, boolean z4, Function0 function0, Function0 function1, ResultReceiver resultReceiver) {
        this.a = str;
        this.b = lbh1Var;
        this.c = z;
        this.d = z2;
        this.e = z3;
        this.f = num;
        this.g = z4;
        this.h = function0;
        this.i = function1;
        this.j = resultReceiver;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof tbh1)) {
            return false;
        }
        tbh1 tbh1Var = (tbh1) obj;
        return u890.j(this.a, tbh1Var.a) && this.b.equals(tbh1Var.b) && this.c == tbh1Var.c && this.d == tbh1Var.d && this.e == tbh1Var.e && u890.j(this.f, tbh1Var.f) && this.g == tbh1Var.g && u890.j(this.h, tbh1Var.h) && u890.j(this.i, tbh1Var.i) && u890.j(this.j, tbh1Var.j);
    }

    public final int hashCode() {
        int iG = xcg1.g(xcg1.g(xcg1.g((this.b.hashCode() + (this.a.hashCode() * 31)) * 31, 31, this.c), 31, this.d), 31, this.e);
        Integer num = this.f;
        int iN = rjx.n(rjx.n(xcg1.g((iG + (num == null ? 0 : num.hashCode())) * 31, 31, this.g), 31, this.h), 31, this.i);
        ResultReceiver resultReceiver = this.j;
        return iN + (resultReceiver != null ? resultReceiver.hashCode() : 0);
    }
}
