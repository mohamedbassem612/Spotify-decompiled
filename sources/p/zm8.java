package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zm8 implements an8 {
    public final String a;
    public final String b;

    public zm8(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof zm8)) {
            return false;
        }
        zm8 zm8Var = (zm8) obj;
        return u890.j(this.a, zm8Var.a) && this.b.equals(zm8Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
