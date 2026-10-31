package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class f0m1 implements g0m1 {
    public final String a;

    public f0m1(String str) {
        this.a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof f0m1) && u890.j(this.a, ((f0m1) obj).a);
    }

    public final int hashCode() {
        return this.a.hashCode();
    }
}
