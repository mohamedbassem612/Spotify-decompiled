package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ew81 implements jn60 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final cyc d;

    public ew81(String str, String str2, yz21 yz21Var, cyc cycVar) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = cycVar;
    }

    public final List d(op80 op80Var) {
        cyc cycVar = this.d;
        int iC = l1d.C(cycVar.a);
        int i = 1;
        if (iC != 1) {
            i = 2;
            if (iC != 2) {
                i = 3;
                if (iC != 3) {
                    i = 0;
                }
            }
        }
        int i2 = i;
        if (i2 == 0) {
            return z6x.a;
        }
        String str = cycVar.b;
        String str2 = cycVar.c;
        String str3 = this.b;
        String str4 = this.a;
        return Collections.singletonList(new bw81(new fw81(i2, str4, str, str2, str3), str4));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ew81)) {
            return false;
        }
        ew81 ew81Var = (ew81) obj;
        return this.a.equals(ew81Var.a) && this.b.equals(ew81Var.b) && this.c.equals(ew81Var.c) && this.d.equals(ew81Var.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
