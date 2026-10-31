package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class e300 implements a700 {
    public final String a;

    public e300(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e300) && u890.j(this.a, ((e300) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
