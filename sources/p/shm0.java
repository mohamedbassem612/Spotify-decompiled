package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class shm0 {
    public final int a;
    public final int b;
    public final boolean c;
    public final boolean d;

    public shm0(int i, int i2, boolean z, boolean z2) {
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = z2;
    }

    public static shm0 a(shm0 shm0Var, boolean z, boolean z2, int i) {
        int i2 = shm0Var.a;
        int i3 = shm0Var.b;
        if ((i & 4) != 0) {
            z = shm0Var.c;
        }
        if ((i & 8) != 0) {
            z2 = shm0Var.d;
        }
        return new shm0(i2, i3, z, z2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof shm0)) {
            return false;
        }
        shm0 shm0Var = (shm0) obj;
        return this.a == shm0Var.a && this.b == shm0Var.b && this.c == shm0Var.c && this.d == shm0Var.d;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.d) + xcg1.g(kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
    }
}
