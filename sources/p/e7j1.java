package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e7j1 implements o7j1 {
    public final String a;

    public e7j1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e7j1) && this.a.equals(((e7j1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
