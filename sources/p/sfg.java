package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sfg {
    public final boolean a;
    public final int b;
    public final boolean c;

    public sfg(int i, boolean z, boolean z2) {
        this.a = z;
        this.b = i;
        this.c = z2;
    }

    public static sfg a(sfg sfgVar) {
        return new sfg(sfgVar.b, false, sfgVar.c);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sfg)) {
            return false;
        }
        sfg sfgVar = (sfg) obj;
        return this.a == sfgVar.a && this.b == sfgVar.b && this.c == sfgVar.c;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.c) + kaa0.f(this.b, Boolean.hashCode(this.a) * 31, 31);
    }
}
