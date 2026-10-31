package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hl81 extends il81 {
    public final float a;
    public final float b;
    public final int c;
    public final String d;

    public hl81(int i, float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = i;
        this.d = String.format("● STUTTERY · %d/%dfps · %d jank/10s", Arrays.copyOf(new Object[]{Integer.valueOf((int) f), Integer.valueOf((int) f2), Integer.valueOf(i)}, 3));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.d;
    }

    @Override // p.nl81
    public final String b() {
        return this.d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof hl81)) {
            return false;
        }
        hl81 hl81Var = (hl81) obj;
        return Float.compare(this.a, hl81Var.a) == 0 && Float.compare(this.b, hl81Var.b) == 0 && this.c == hl81Var.c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.c) + x0d.f(Float.hashCode(this.a) * 31, 31, this.b);
    }
}
