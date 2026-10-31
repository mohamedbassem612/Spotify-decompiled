package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e5l1 implements g5l1 {
    public final String a;

    public e5l1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5l1) && this.a.equals(((e5l1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
