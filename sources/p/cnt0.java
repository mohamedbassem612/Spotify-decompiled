package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class cnt0 implements s7c, sfu {
    public final String a;
    public final String b;
    public final x360 c;
    public final String d;
    public final n1x e;

    public cnt0(String str, String str2, x360 x360Var, String str3, n1x n1xVar) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = str3;
        this.e = n1xVar;
    }

    @Override // p.sfu
    public final String c() {
        return this.d;
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        n1x n1xVar = this.e;
        String str = this.d;
        String str2 = this.b;
        return Collections.singletonList(new emt0(this.a, k3h1Var, new lnt0(str, null, str2, n1xVar), str2, this.c));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof cnt0)) {
            return false;
        }
        cnt0 cnt0Var = (cnt0) obj;
        return this.a.equals(cnt0Var.a) && this.b.equals(cnt0Var.b) && u890.j(this.c, cnt0Var.c) && this.d.equals(cnt0Var.d) && u890.j(this.e, cnt0Var.e);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        int iD2 = cy30.d((iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31, this.d);
        n1x n1xVar = this.e;
        return iD2 + (n1xVar != null ? n1xVar.hashCode() : 0);
    }
}
