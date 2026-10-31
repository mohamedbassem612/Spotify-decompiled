package p;

import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class zu41 {
    public static final zu41 g = new xaz0((byte) 19).b();
    public final t380 a;
    public final boolean b = true;
    public final boolean c = true;
    public final boolean f = true;
    public final boolean d = true;
    public final boolean e = true;

    public zu41(xaz0 xaz0Var) {
        this.a = xaz0.a(xaz0Var);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof zu41)) {
            return false;
        }
        zu41 zu41Var = (zu41) obj;
        return this.a.equals(zu41Var.a) && this.c == zu41Var.c && this.f == zu41Var.f && this.b == zu41Var.b && this.d == zu41Var.d && this.e == zu41Var.e;
    }

    public final int hashCode() {
        return Objects.hash(this.a, null, null, Boolean.valueOf(this.b), Boolean.valueOf(this.c), Boolean.valueOf(this.f), Boolean.valueOf(this.d), Boolean.valueOf(this.e));
    }
}
