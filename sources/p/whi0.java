package p;

import com.spotify.casita.v1.resolved.EmbeddedAdMetadata;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class whi0 implements jn60, szg, rfu, h030, i631 {
    public final String a;
    public final String b;
    public final x360 c;
    public final yz21 d;
    public final xfi0 e;

    public whi0(String str, String str2, x360 x360Var, yz21 yz21Var, xfi0 xfi0Var) {
        this.a = str;
        this.b = str2;
        this.c = x360Var;
        this.d = yz21Var;
        this.e = xfi0Var;
    }

    public final Set a() {
        String str = this.e.c;
        if (str == null) {
            str = "";
        }
        return Collections.singleton(str);
    }

    public final Set b() {
        return Collections.singleton(this.e.a);
    }

    @Override // p.rfu
    public final String c() {
        String str = this.e.c;
        return str == null ? "" : str;
    }

    public final List d(op80 op80Var) {
        lhi0 khi0Var;
        xfi0 xfi0Var = this.e;
        EmbeddedAdMetadata embeddedAdMetadata = xfi0Var.d;
        String str = xfi0Var.b;
        String str2 = xfi0Var.a;
        x360 x360Var = this.c;
        String str3 = this.a;
        String str4 = this.b;
        if (x360Var != null) {
            khi0Var = new lhi0(str3, op80Var, new mey0(str3, str4, str2, str, x360Var, xfi0Var.c, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null, (String) null, (String) null, 384));
        } else {
            khi0Var = new khi0(str3, op80Var, new mey0(str3, str4, str2, str, x360Var, xfi0Var.c, embeddedAdMetadata != null ? zgo1.u(embeddedAdMetadata) : null, (String) null, (String) null, 384));
        }
        return Collections.singletonList(khi0Var);
    }

    public final String e() {
        return this.a;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof whi0)) {
            return false;
        }
        whi0 whi0Var = (whi0) obj;
        return this.a.equals(whi0Var.a) && this.b.equals(whi0Var.b) && u890.j(this.c, whi0Var.c) && this.d.equals(whi0Var.d) && this.e.equals(whi0Var.e);
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
