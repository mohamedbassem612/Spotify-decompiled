package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bnc0 implements poa0 {
    public final String a;

    public bnc0(String str) {
        this.a = str;
    }

    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof bnc0) && this.a.equals(((bnc0) obj).a) && Float.compare(0.7f, 0.7f) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(0.7f) + kaa0.f(15, this.a.hashCode() * 31, 31);
    }
}
