package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class zcb0 implements adb0 {
    public final String a;
    public final String b;

    public zcb0(String str, String str2) {
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
        if (!(obj instanceof zcb0)) {
            return false;
        }
        zcb0 zcb0Var = (zcb0) obj;
        return u890.j(this.a, zcb0Var.a) && this.b.equals(zcb0Var.b);
    }

    public final int hashCode() {
        String str = this.a;
        return this.b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }
}
