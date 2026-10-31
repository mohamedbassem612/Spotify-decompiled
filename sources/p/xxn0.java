package p;

import java.util.ArrayDeque;
import java.util.Deque;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class xxn0 {
    public final xun0 a;
    public final xun0 b;
    public final ArrayDeque c;
    public final ArrayDeque d;

    public xxn0(xun0 xun0Var, xun0 xun0Var2, ArrayDeque arrayDeque, ArrayDeque arrayDeque2) {
        this.a = xun0Var;
        this.b = xun0Var2;
        this.c = arrayDeque;
        this.d = arrayDeque2;
    }

    public final Deque a() {
        return this.c;
    }

    public final xun0 b() {
        return this.a;
    }

    public final Deque c() {
        return this.d;
    }

    public final xun0 d() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof xxn0)) {
            return false;
        }
        xxn0 xxn0Var = (xxn0) obj;
        return u890.j(this.a, xxn0Var.a) && u890.j(this.b, xxn0Var.b) && this.c.equals(xxn0Var.c) && this.d.equals(xxn0Var.d);
    }

    public final int hashCode() {
        xun0 xun0Var = this.a;
        int iHashCode = (xun0Var == null ? 0 : xun0Var.hashCode()) * 31;
        xun0 xun0Var2 = this.b;
        return this.d.hashCode() + ((this.c.hashCode() + ((iHashCode + (xun0Var2 != null ? xun0Var2.hashCode() : 0)) * 31)) * 31);
    }
}
