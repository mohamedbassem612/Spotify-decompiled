package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.ApplicationState;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.domain.models.CacheState;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class klc {
    public final ApplicationState a;
    public final int b;
    public final long c;
    public final CacheState d;
    public final Set e;
    public final Map f;
    public final Set g;
    public final Set h;
    public final ml5 i;

    public klc(ApplicationState applicationState, int i, long j, CacheState cacheState, Set set, Map map, Set set2, Set set3, ml5 ml5Var) {
        this.a = applicationState;
        this.b = i;
        this.c = j;
        this.d = cacheState;
        this.e = set;
        this.f = map;
        this.g = set2;
        this.h = set3;
        this.i = ml5Var;
    }

    public static klc a(klc klcVar, ApplicationState applicationState, long j, CacheState cacheState, Set set, Map map, Set set2, Set set3, ml5 ml5Var, int i) {
        if ((i & 1) != 0) {
            applicationState = klcVar.a;
        }
        ApplicationState applicationState2 = applicationState;
        int i2 = klcVar.b;
        if ((i & 4) != 0) {
            j = klcVar.c;
        }
        long j2 = j;
        if ((i & 8) != 0) {
            cacheState = klcVar.d;
        }
        CacheState cacheState2 = cacheState;
        Set set4 = (i & 16) != 0 ? klcVar.e : set;
        Map map2 = (i & 32) != 0 ? klcVar.f : map;
        Set set5 = (i & 64) != 0 ? klcVar.g : set2;
        Set set6 = (i & 128) != 0 ? klcVar.h : set3;
        ml5 ml5Var2 = (i & 256) != 0 ? klcVar.i : ml5Var;
        klcVar.getClass();
        return new klc(applicationState2, i2, j2, cacheState2, set4, map2, set5, set6, ml5Var2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof klc)) {
            return false;
        }
        klc klcVar = (klc) obj;
        return this.a == klcVar.a && this.b == klcVar.b && this.c == klcVar.c && this.d == klcVar.d && u890.j(this.e, klcVar.e) && u890.j(this.f, klcVar.f) && u890.j(this.g, klcVar.g) && u890.j(this.h, klcVar.h) && this.i.equals(klcVar.i);
    }

    public final int hashCode() {
        return this.i.hashCode() + gvg.c(gvg.c(cy30.e(gvg.c((this.d.hashCode() + cy30.f(kaa0.f(this.b, this.a.hashCode() * 31, 31), this.c, 31)) * 31, 31, this.e), 31, this.f), 31, this.g), 31, this.h);
    }
}
