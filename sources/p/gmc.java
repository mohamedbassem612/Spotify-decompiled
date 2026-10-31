package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gmc {
    public final String a;
    public final String b;
    public final TriggerType c;
    public final String d;
    public final List e;
    public final tv80 f;
    public final uy31 g;
    public final DynamicTagsMetadata h;
    public final ConflictResolutionStrategy i;
    public final d3j0 j;

    public /* synthetic */ gmc(String str, String str2, TriggerType triggerType, String str3, tv80 tv80Var, uy31 uy31Var, DynamicTagsMetadata dynamicTagsMetadata, d3j0 d3j0Var, int i) {
        this(str, str2, triggerType, str3, z6x.a, (i & 32) != 0 ? null : tv80Var, (i & 64) != 0 ? vks.a : uy31Var, (i & 128) != 0 ? null : dynamicTagsMetadata, ConflictResolutionStrategy.DISCARD_SELF, d3j0Var);
    }

    public static gmc a(gmc gmcVar, String str, d3j0 d3j0Var, int i) {
        String str2 = gmcVar.a;
        String str3 = gmcVar.b;
        TriggerType triggerType = gmcVar.c;
        if ((i & 8) != 0) {
            str = gmcVar.d;
        }
        String str4 = str;
        List list = gmcVar.e;
        tv80 tv80Var = gmcVar.f;
        uy31 uy31Var = gmcVar.g;
        DynamicTagsMetadata dynamicTagsMetadata = gmcVar.h;
        ConflictResolutionStrategy conflictResolutionStrategy = gmcVar.i;
        if ((i & 512) != 0) {
            d3j0Var = gmcVar.j;
        }
        return new gmc(str2, str3, triggerType, str4, list, tv80Var, uy31Var, dynamicTagsMetadata, conflictResolutionStrategy, d3j0Var);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof gmc)) {
            return false;
        }
        gmc gmcVar = (gmc) obj;
        return u890.j(this.a, gmcVar.a) && u890.j(this.b, gmcVar.b) && this.c == gmcVar.c && u890.j(this.d, gmcVar.d) && u890.j(this.e, gmcVar.e) && u890.j(this.f, gmcVar.f) && u890.j(this.g, gmcVar.g) && u890.j(this.h, gmcVar.h) && this.i == gmcVar.i && u890.j(this.j, gmcVar.j);
    }

    public final int hashCode() {
        int iB = f4i1.b(cy30.d((this.c.hashCode() + cy30.d(this.a.hashCode() * 31, 31, this.b)) * 31, 31, this.d), 31, this.e);
        tv80 tv80Var = this.f;
        int iHashCode = (this.g.hashCode() + ((iB + (tv80Var == null ? 0 : tv80Var.hashCode())) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.h;
        int iHashCode2 = dynamicTagsMetadata != null ? dynamicTagsMetadata.hashCode() : 0;
        return this.j.hashCode() + ((this.i.hashCode() + ((iHashCode + iHashCode2) * 31)) * 31);
    }

    public gmc(String str, String str2, TriggerType triggerType, String str3, List list, tv80 tv80Var, uy31 uy31Var, DynamicTagsMetadata dynamicTagsMetadata, ConflictResolutionStrategy conflictResolutionStrategy, d3j0 d3j0Var) {
        this.a = str;
        this.b = str2;
        this.c = triggerType;
        this.d = str3;
        this.e = list;
        this.f = tv80Var;
        this.g = uy31Var;
        this.h = dynamicTagsMetadata;
        this.i = conflictResolutionStrategy;
        this.j = d3j0Var;
    }
}
