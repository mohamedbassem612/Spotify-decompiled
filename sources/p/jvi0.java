package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class jvi0 implements myl {
    public final int a;
    public final boolean b;

    public jvi0(String str, int i, boolean z) {
        this.a = i;
        this.b = z;
    }

    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        if (cdf0Var.Y) {
            return new kvi0(this);
        }
        nue0.c("Animation contains merge paths but they are disabled.");
        return null;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder("MergePaths{mode=");
        int i = this.a;
        if (i == 1) {
            str = "MERGE";
        } else if (i == 2) {
            str = "ADD";
        } else if (i == 3) {
            str = "SUBTRACT";
        } else if (i != 4) {
            str = i != 5 ? "null" : "EXCLUDE_INTERSECTIONS";
        } else {
            str = "INTERSECT";
        }
        sb.append(str);
        sb.append('}');
        return sb.toString();
    }
}
