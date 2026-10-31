package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class p891 implements r891 {
    public final float a = 1.4705882f;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof p891) {
            return Float.compare(0.68f, 0.68f) == 0 && Float.compare(this.a, ((p891) obj).a) == 0 && Float.compare(0.75f, 0.75f) == 0;
        }
        return false;
    }

    public final int hashCode() {
        return Float.hashCode(0.75f) + x0d.f(Float.hashCode(0.68f) * 31, 31, this.a);
    }
}
