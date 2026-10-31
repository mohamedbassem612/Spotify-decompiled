package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class x6j1 implements y6j1 {
    public final String a;

    public x6j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof x6j1) && this.a.equals(((x6j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
