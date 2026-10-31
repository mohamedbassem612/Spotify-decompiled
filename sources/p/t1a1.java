package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class t1a1 implements q2a1 {
    public final String a;

    public t1a1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof t1a1) && u890.j(this.a, ((t1a1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
