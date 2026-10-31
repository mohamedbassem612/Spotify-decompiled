package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class og1 implements qg1 {
    public final String a;

    public og1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof og1) && this.a.equals(((og1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
