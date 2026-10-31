package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m1f implements p3f {
    public final String a;

    public m1f(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof m1f) && this.a.equals(((m1f) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
