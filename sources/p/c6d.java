package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c6d implements jn60 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final y9a e;
    public final EmbeddedAdMetadata f;

    public c6d(String str, String str2, x360 x360Var, yz21 yz21Var, y9a y9aVar, EmbeddedAdMetadata embeddedAdMetadata) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = y9aVar;
        this.f = embeddedAdMetadata;
    }

    public final List d(op80 op80Var) {
        ArrayList arrayList = this.e.a;
        EmbeddedAdMetadata embeddedAdMetadata = this.f;
        return Collections.singletonList(new y5d(new d6d(this.b, this.c, arrayList, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null), this.a, op80Var));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c6d)) {
            return false;
        }
        c6d c6dVar = (c6d) obj;
        return this.a.equals(c6dVar.a) && this.b.equals(c6dVar.b) && u890.j(this.c, c6dVar.c) && this.d.equals(c6dVar.d) && this.e.equals(c6dVar.e) && u890.j(this.f, c6dVar.f);
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
        int iF = p3d1.f(this.e.a, bb00.g(this.d, (iD + (x360Var == null ? 0 : x360Var.hashCode())) * 31, 31), 31);
        EmbeddedAdMetadata embeddedAdMetadata = this.f;
        return iF + (embeddedAdMetadata != null ? embeddedAdMetadata.hashCode() : 0);
    }
}
