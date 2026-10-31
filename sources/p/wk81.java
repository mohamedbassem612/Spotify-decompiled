package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wk81 extends nl81 {
    public final float a;
    public final String b;

    public wk81(float f) {
        this.a = f;
        this.b = String.format("alloc %.1f MB/s — per-frame object creation?", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    @Override // p.nl81
    public final zyi1 a() {
        return zyi1.d;
    }

    @Override // p.nl81
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof wk81) && Float.compare(this.a, ((wk81) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
