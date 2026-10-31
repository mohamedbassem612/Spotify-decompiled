package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jkc extends t3k1 {
    public final Context b;
    public final o6w0 c;
    public final MessageResponseToken d;
    public final DynamicTagsMetadata e;
    public final uy31 f;
    public final klc g;
    public final d3j0 h;
    public final iac0 i;

    public jkc(Context context, o6w0 o6w0Var, MessageResponseToken messageResponseToken, DynamicTagsMetadata dynamicTagsMetadata, uy31 uy31Var, klc klcVar, d3j0 d3j0Var, iac0 iac0Var) {
        this.b = context;
        this.c = o6w0Var;
        this.d = messageResponseToken;
        this.e = dynamicTagsMetadata;
        this.f = uy31Var;
        this.g = klcVar;
        this.h = d3j0Var;
        this.i = iac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof jkc)) {
            return false;
        }
        jkc jkcVar = (jkc) obj;
        return u890.j(this.b, jkcVar.b) && u890.j(this.c, jkcVar.c) && u890.j(this.d, jkcVar.d) && u890.j(this.e, jkcVar.e) && u890.j(this.f, jkcVar.f) && u890.j(this.g, jkcVar.g) && u890.j(this.h, jkcVar.h) && u890.j(this.i, jkcVar.i);
    }

    public final int hashCode() {
        int iHashCode = (this.d.hashCode() + ((this.c.hashCode() + (this.b.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.e;
        int iHashCode2 = (this.g.hashCode() + ((this.f.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31)) * 31;
        d3j0 d3j0Var = this.h;
        int iHashCode3 = (iHashCode2 + (d3j0Var == null ? 0 : d3j0Var.hashCode())) * 31;
        iac0 iac0Var = this.i;
        return iHashCode3 + (iac0Var != null ? iac0Var.hashCode() : 0);
    }
}
