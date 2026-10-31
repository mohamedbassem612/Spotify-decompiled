package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class mz21 implements rz21 {
    public final String a;
    public final String b;

    public mz21(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    public final String a() {
        return this.a;
    }

    public final String b() {
        return this.b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof mz21)) {
            return false;
        }
        mz21 mz21Var = (mz21) obj;
        return u890.j(this.a, mz21Var.a) && u890.j(this.b, mz21Var.b);
    }

    public final int hashCode() {
        return this.b.hashCode() + (this.a.hashCode() * 31);
    }
}
