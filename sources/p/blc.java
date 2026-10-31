package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class blc extends jlc {
    public final Context a;
    public final MessageResponseToken b;
    public final o6w0 c;
    public final DynamicTagsMetadata d;
    public final uy31 e;
    public final d3j0 f;
    public final iac0 g;

    public blc(Context context, MessageResponseToken messageResponseToken, o6w0 o6w0Var, DynamicTagsMetadata dynamicTagsMetadata, uy31 uy31Var, d3j0 d3j0Var, iac0 iac0Var) {
        this.a = context;
        this.b = messageResponseToken;
        this.c = o6w0Var;
        this.d = dynamicTagsMetadata;
        this.e = uy31Var;
        this.f = d3j0Var;
        this.g = iac0Var;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof blc)) {
            return false;
        }
        blc blcVar = (blc) obj;
        return u890.j(this.a, blcVar.a) && u890.j(this.b, blcVar.b) && u890.j(this.c, blcVar.c) && u890.j(this.d, blcVar.d) && u890.j(this.e, blcVar.e) && u890.j(this.f, blcVar.f) && u890.j(this.g, blcVar.g);
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31;
        d3j0 d3j0Var = this.f;
        int iHashCode3 = (iHashCode2 + (d3j0Var == null ? 0 : d3j0Var.hashCode())) * 31;
        iac0 iac0Var = this.g;
        return iHashCode3 + (iac0Var != null ? iac0Var.hashCode() : 0);
    }
}
