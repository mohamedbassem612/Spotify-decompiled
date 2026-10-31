package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class w8g1 {
    public final boolean a;
    public final boolean b;
    public final Function0 c;

    public w8g1(boolean z, boolean z2, Function0 function0) {
        this.a = z;
        this.b = z2;
        this.c = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!w8g1.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        w8g1 w8g1Var = (w8g1) obj;
        return this.a == w8g1Var.a && this.b == w8g1Var.b && ((Number) this.c.invoke()).longValue() == ((Number) w8g1Var.c.invoke()).longValue();
    }

    public final int hashCode() {
        return Long.hashCode(((Number) this.c.invoke()).longValue()) + xcg1.g(Boolean.hashCode(this.a) * 31, 31, this.b);
    }

    public /* synthetic */ w8g1() {
        this(false, false, q9f1.Q0);
    }
}
