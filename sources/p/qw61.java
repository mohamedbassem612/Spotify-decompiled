package p;

import java.util.Arrays;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qw61 implements myl {
    public final String a;
    public final List b;
    public final boolean c;

    public qw61(String str, List list, boolean z) {
        this.a = str;
        this.b = list;
        this.c = z;
    }

    @Override // p.myl
    public final wpl a(cdf0 cdf0Var, fcf0 fcf0Var, hba hbaVar) {
        return new stl(cdf0Var, hbaVar, this, fcf0Var);
    }

    public final String toString() {
        return "ShapeGroup{name='" + this.a + "' Shapes: " + Arrays.toString(this.b.toArray()) + '}';
    }
}
