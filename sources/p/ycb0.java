package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ycb0 implements adb0 {
    public final String a;
    public final String b;

    public ycb0(String str, String str2) {
        this.a = str;
        this.b = str2;
    }

    @Override // p.adb0
    public final String a() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ycb0)) {
            return false;
        }
        ycb0 ycb0Var = (ycb0) obj;
        return u890.j(this.a, ycb0Var.a) && this.b.equals(ycb0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
