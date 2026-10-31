package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ev70 implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final y9a e;
    public final boolean f;
    public final EmbeddedAdMetadata g;

    public ev70(String str, String str2, x360 x360Var, yz21 yz21Var, y9a y9aVar, boolean z, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = y9aVar;
        this.f = z;
        this.g = embeddedAdMetadata;
    }

    @Override // p.jn60
    public final List d(op80 op80Var) {
        ArrayList arrayList = this.e.a;
        EmbeddedAdMetadata embeddedAdMetadata = this.g;
        return k4p1.x(new qu70(new hv70(this.b, this.c, arrayList, this.f, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null, 16), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ev70)) {
            return false;
        }
        ev70 ev70Var = (ev70) obj;
        return this.a.equals(ev70Var.a) && this.b.equals(ev70Var.b) && u890.j(this.c, ev70Var.c) && this.d.equals(ev70Var.d) && this.e.equals(ev70Var.e) && this.f == ev70Var.f && u890.j(this.g, ev70Var.g);
    }

    @Override // p.jn60
    public final yz21 f() {
        return this.d;
    }

    @Override // p.jn60
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        int iD = cy30.d(this.a.hashCode() * 31, 31, this.b);
        x360 x360Var = this.c;
        int iG = xcg1.g(p3d1.f(this.e.a, bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31), 31), 31, this.f);
        EmbeddedAdMetadata embeddedAdMetadata = this.g;
        return iG + (embeddedAdMetadata != null ? embeddedAdMetadata.hashCode() : 0);
    }
}
