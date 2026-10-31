package p;

import com.spotify.browsita.v1.resolved.EmbeddedAdMetadata;
import com.spotify.browsita.v1.resolved.EmbeddedAdTrackingUrls;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class acj1 implements s7c, sfu {
    public final String a;
    public final String b;
    public final vcj1 c;

    public acj1(String str, String str2, vcj1 vcj1Var) {
        this.a = str;
        this.b = str2;
        this.c = vcj1Var;
    }

    @Override // p.sfu
    public final String c() {
        return this.c.b.getId();
    }

    @Override // p.s7c
    public final List d(int i, int i2) {
        k3h1 k3h1Var = new k3h1(i);
        vcj1 vcj1Var = this.c;
        ji0 ji0Var = vcj1Var.a;
        EmbeddedAdMetadata embeddedAdMetadata = vcj1Var.b;
        String id = embeddedAdMetadata.getId();
        String strN = embeddedAdMetadata.n();
        String strQ = embeddedAdMetadata.q();
        String strR = embeddedAdMetadata.r();
        String strP = embeddedAdMetadata.p();
        String strS = embeddedAdMetadata.s();
        Map mapT = embeddedAdMetadata.t();
        LinkedHashMap linkedHashMap = new LinkedHashMap(zno1.s(mapT.size()));
        for (Map.Entry entry : mapT.entrySet()) {
            linkedHashMap.put(entry.getKey(), new g2x(((EmbeddedAdTrackingUrls) entry.getValue()).o()));
        }
        n1x n1xVar = new n1x(id, strN, strQ, strR, strP, strS, linkedHashMap);
        String str = ji0Var.i;
        String value = ji0Var.Z.getValue();
        String str2 = ji0Var.W0;
        String str3 = ji0Var.Y0.a;
        String str4 = this.a;
        return Collections.singletonList(new c7j1(str4, k3h1Var, new y8j1(str4, n1xVar, ji0Var, str, value, str2, str3)));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof acj1)) {
            return false;
        }
        acj1 acj1Var = (acj1) obj;
        return this.a.equals(acj1Var.a) && this.b.equals(acj1Var.b) && this.c.equals(acj1Var.c);
    }

    @Override // p.s7c
    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 961, this.b);
    }
}
