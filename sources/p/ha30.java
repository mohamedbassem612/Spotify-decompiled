package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ha30 implements ga30 {
    public final String a;
    public final float b;

    public ha30(String str, float f) {
        this.a = str;
        this.b = f;
    }

    @Override // p.ga30
    public final float a() {
        return this.b;
    }

    @Override // p.ga30
    public final String b() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ha30)) {
            return false;
        }
        ha30 ha30Var = (ha30) obj;
        return this.a.equals(ha30Var.a) && this.b == ha30Var.b;
    }

    public final int hashCode() {
        return Float.hashCode(this.b) + (this.a.hashCode() * 31);
    }

    public final String toString() {
        return "FontVariation.Setting(axisName='" + this.a + "', value=" + this.b + ")";
    }
}
