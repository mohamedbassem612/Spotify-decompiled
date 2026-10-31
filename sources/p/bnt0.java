package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class bnt0 implements jn60, szg, rfu, h030 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final dnt0 e;

    public bnt0(String str, String str2, x360 x360Var, yz21 yz21Var, dnt0 dnt0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = dnt0Var;
    }

    public final Set a() {
        return Collections.singleton(this.e.a);
    }

    @Override // p.rfu
    public final String c() {
        return this.e.a;
    }

    public final List d(op80 op80Var) {
        dnt0 dnt0Var = this.e;
        String str = dnt0Var.a;
        EmbeddedAdMetadata embeddedAdMetadata = dnt0Var.b;
        n1x n1xVarU = embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null;
        String str2 = this.b;
        return Collections.singletonList(new dmt0(this.a, op80Var, new lnt0(str, str2, (String) null, n1xVarU), this.c, str2));
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bnt0)) {
            return false;
        }
        bnt0 bnt0Var = (bnt0) obj;
        return this.a.equals(bnt0Var.a) && this.b.equals(bnt0Var.b) && u890.j(this.c, bnt0Var.c) && this.d.equals(bnt0Var.d) && this.e.equals(bnt0Var.e);
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
