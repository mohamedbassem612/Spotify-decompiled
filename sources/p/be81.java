package p;

import com.spotify.showcase.v2.CreativeAdMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class be81 implements jn60, szg, h030, miv0 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final ce81 d;

    public be81(String str, String str2, yz21 yz21Var, ce81 ce81Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = ce81Var;
    }

    @Override // p.szg
    public final Set a() {
        String strD;
        xj61 xj61Var = new xj61();
        ce81 ce81Var = this.d;
        xj61Var.add(ce81Var.c());
        CreativeAdMetadata creativeAdMetadataA = ce81Var.a();
        if (creativeAdMetadataA != null && (strD = mqo1.D(creativeAdMetadataA)) != null) {
            xj61Var.add(strD);
        }
        return cwl1.j(xj61Var);
    }

    @Override // p.miv0
    public final Set b() {
        String strC = this.d.c();
        if (!bbp1.k(strC)) {
            strC = null;
        }
        return strC != null ? Collections.singleton(strC) : w7x.a;
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        ce81 ce81Var = this.d;
        n1x n1xVarU = zgo1.u(ce81Var.b());
        String strC = ce81Var.c();
        String strB = ce81Var.d().b();
        String strA = ce81Var.d().a();
        CreativeAdMetadata creativeAdMetadataA = ce81Var.a();
        ud81 ud81Var = new ud81(creativeAdMetadataA != null ? jhc1.H(creativeAdMetadataA.q()) : 2, strB, strA);
        CreativeAdMetadata creativeAdMetadataA2 = ce81Var.a();
        mxh mxhVarZ = creativeAdMetadataA2 != null ? mqo1.z(creativeAdMetadataA2) : null;
        CreativeAdMetadata creativeAdMetadataA3 = ce81Var.a();
        int iH = creativeAdMetadataA3 != null ? jhc1.H(creativeAdMetadataA3.q()) : 2;
        CreativeAdMetadata creativeAdMetadataA4 = ce81Var.a();
        String strD = creativeAdMetadataA4 != null ? mqo1.D(creativeAdMetadataA4) : null;
        String str = this.a;
        return k4p1.x(new hc81(str, op80Var, new id81(ud81Var, str, this.b, strC, n1xVarU, mxhVarZ, 1, iH, strD)));
    }

    @Override // p.h030
    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof be81)) {
            return false;
        }
        be81 be81Var = (be81) obj;
        return this.a.equals(be81Var.a) && this.b.equals(be81Var.b) && this.c.equals(be81Var.c) && this.d.equals(be81Var.d);
    }

    @Override // p.jn60
    public final yz21 f() {
        return this.c;
    }

    @Override // p.jn60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
