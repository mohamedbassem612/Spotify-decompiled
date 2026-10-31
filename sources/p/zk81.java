package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zk81 extends nl81 {
    public final float a;
    public final float b;
    public final String c;

    public zk81(float f, float f2) {
        this.a = f;
        this.b = f2;
        this.c = String.format("jitter ±%.1fms (%d%% of mean)", Arrays.copyOf(new Object[]{Float.valueOf(f), Integer.valueOf(f2 > 0.0f ? (int) ((f / f2) * 100.0f) : 0)}, 2));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.c;
    }

    @Override // p.nl81
    public final String b() {
        return this.c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zk81)) {
            return false;
        }
        zk81 zk81Var = (zk81) obj;
        return Float.compare(this.a, zk81Var.a) == 0 && Float.compare(this.b, zk81Var.b) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (Float.hashCode(this.a) * 31);
    }
}
