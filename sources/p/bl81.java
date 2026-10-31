package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bl81 extends nl81 {
    public final float a;
    public final String b;

    public bl81(float f) {
        this.a = f;
        this.b = String.format("main %d%% of budget", Arrays.copyOf(new Object[]{Integer.valueOf((int) (f * 100.0f))}, 1));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.c;
    }

    @Override // p.nl81
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bl81) && Float.compare(this.a, ((bl81) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
