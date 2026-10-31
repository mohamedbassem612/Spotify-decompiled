package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class swh {
    public final String a;

    public swh(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof swh) && u890.j(this.a, ((swh) obj).a);
    }

    public final int hashCode() {
        return Integer.hashCode(16) + kaa0.f(5, kaa0.f(3, this.a.hashCode() * 31, 31), 31);
    }
}
