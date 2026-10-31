package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class gbi0 implements jn60, szg, rfu, h030, miv0 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final qbi0 e;

    public gbi0(String str, String str2, x360 x360Var, yz21 yz21Var, qbi0 qbi0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = qbi0Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.b);
    }

    public final Set b() {
        String str = this.e.b;
        if (!bbp1.k(str)) {
            str = null;
        }
        return str != null ? Collections.singleton(str) : w7x.a;
    }

    @Override // p.rfu
    public final String c() {
        return this.e.b;
    }

    public final List d(op80 op80Var) {
        qbi0 qbi0Var = this.e;
        String str = qbi0Var.b;
        String str2 = qbi0Var.a;
        EmbeddedAdMetadata embeddedAdMetadata = qbi0Var.d;
        n1x n1xVarU = embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null;
        String str3 = qbi0Var.e;
        String str4 = this.a;
        return Collections.singletonList(new cbi0(str4, op80Var, new mey0(str4, this.b, str, str2, this.c, (String) null, n1xVarU, str3, (String) null, 288)));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gbi0)) {
            return false;
        }
        gbi0 gbi0Var = (gbi0) obj;
        return this.a.equals(gbi0Var.a) && this.b.equals(gbi0Var.b) && u890.j(this.c, gbi0Var.c) && this.d.equals(gbi0Var.d) && this.e.equals(gbi0Var.e);
    }

    public final yz21 f() {
        return this.d;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        return this.e.hashCode() + bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31);
    }
}
