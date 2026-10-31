package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class e460 implements jn60 {
    public final String a;
    public final String b;
    public final hvl1 c;
    public final yz21 d;

    public e460(String str, String str2, hvl1 hvl1Var, yz21 yz21Var) {
        this.a = str;
        this.b = str2;
        this.c = hvl1Var;
        this.d = yz21Var;
    }

    public final List d(op80 op80Var) {
        String strX = nho1.x(this.c);
        if (strX == null) {
            strX = "";
        }
        return Collections.singletonList(new m460(this.a, new s460(0, 990, strX, (String) null, (String) null, (String) null, false), op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e460)) {
            return false;
        }
        e460 e460Var = (e460) obj;
        return this.a.equals(e460Var.a) && this.b.equals(e460Var.b) && this.c.equals(e460Var.c) && this.d.equals(e460Var.d);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + ((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31);
    }
}
