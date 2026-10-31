package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gl81 extends il81 {
    public final float a;
    public final float b;
    public final String c;

    public gl81(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = String.format("● SMOOTH · %d/%dfps · 0 jank", Arrays.copyOf(new Object[]{Integer.valueOf((int) f), Integer.valueOf((int) f2)}, 2));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.a;
    }

    @Override // p.nl81
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gl81)) {
            return false;
        }
        gl81 gl81Var = (gl81) obj;
        return Float.compare(this.a, gl81Var.a) == 0 && Float.compare(this.b, gl81Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
