package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fl81 extends il81 {
    public final float a;
    public final float b;
    public final int c;
    public final String d;

    public fl81(int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = String.format("● CHOPPY · %d/%dfps · %d jank/10s", Arrays.copyOf(new Object[]{Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf(i)}, 3));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.c;
    }

    @Override // p.nl81
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof fl81)) {
            return false;
        }
        fl81 fl81Var = (fl81) obj;
        return Float.compare(this.a, fl81Var.a) == 0 && Float.compare(this.b, fl81Var.b) == 0 && this.c == fl81Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
