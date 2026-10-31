package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class e5u0 implements f5u0 {
    public final String a;

    public e5u0(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof e5u0) && u890.j(this.a, ((e5u0) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
