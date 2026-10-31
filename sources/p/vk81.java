package p;

import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vk81 extends nl81 {
    public final float a;
    public final String b;

    public vk81(float f) {
        this.a = f;
        this.b = String.format("elevated alloc %.1f MB/s", Arrays.copyOf(new Object[]{Float.valueOf(f)}, 1));
    }

    @Override // p.nl81
    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof vk81) && Float.compare(this.a, ((vk81) obj).a) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.a);
    }
}
