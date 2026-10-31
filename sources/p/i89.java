package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class i89 {
    public static final Map e = sqg0.J(new mmr0[]{new mmr0(0, 1), new mmr0(1, 2), new mmr0(2, 4), new mmr0(3, 8), new mmr0(4, 16), new mmr0(5, 32), new mmr0(6, 64), new mmr0(7, 128), new mmr0(8, 256), new mmr0(9, 512), new mmr0(10, 1024), new mmr0(11, 2048), new mmr0(12, 4096), new mmr0(13, 8192), new mmr0(14, 16384), new mmr0(15, 32768), new mmr0(16, 65536), new mmr0(17, 131072), new mmr0(18, 262144), new mmr0(19, 524288), new mmr0(20, 1048576), new mmr0(21, 2097152), new mmr0(22, 4194304), new mmr0(23, 8388608)});
    public final int a;
    public final int b;
    public final char c;
    public final int d;

    public i89(int i, int i2, char c, int i3) {
        this.a = i;
        this.b = i2;
        this.c = c;
        this.d = i3;
    }

    public final Integer a() {
        return (Integer) e.get(Integer.valueOf(this.b));
    }

    public final Integer b() {
        int i = this.d;
        if (i <= 8) {
            return 1;
        }
        return i == 10 ? 2 : null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i89)) {
            return false;
        }
        i89 i89Var = (i89) obj;
        return this.a == i89Var.a && this.b == i89Var.b && this.c == i89Var.c && this.d == i89Var.d;
    }

    public final int hashCode() {
        return Integer.hashCode(this.d) + ((Character.hashCode(this.c) + kaa0.f(this.b, Integer.hashCode(this.a) * 31, 31)) * 31);
    }
}
