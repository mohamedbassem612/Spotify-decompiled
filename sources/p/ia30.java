package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ia30 implements ga30 {
    public final int a;

    public ia30(int i) {
        this.a = i;
    }

    public final float a() {
        return this.a;
    }

    public final String b() {
        return "wght";
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ia30) && this.a == ((ia30) obj).a;
    }

    public final int hashCode() {
        return 113071012 + this.a;
    }

    public final String toString() {
        return gvg.e(this.a, "FontVariation.Setting(axisName='wght', value=", ")");
    }
}
