package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y3c1 {
    public final int a;

    public y3c1(int i) {
        this.a = i;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof y3c1) {
            return p3v.c(16.0f, 16.0f) && Float.compare(61.5f, 61.5f) == 0 && this.a == ((y3c1) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.a) + x0d.f(x0d.f(Integer.hashCode(2) * 31, 31, 16.0f), 31, 61.5f);
    }
}
