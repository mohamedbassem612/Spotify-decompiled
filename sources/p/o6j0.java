package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class o6j0 {
    public final Context a;
    public final MessageResponseToken b;
    public final o6w0 c;
    public final DynamicTagsMetadata d;
    public final uy31 e;
    public final d3j0 f;
    public final iac0 g;

    public o6j0(Context context, MessageResponseToken messageResponseToken, o6w0 o6w0Var, DynamicTagsMetadata dynamicTagsMetadata, uy31 uy31Var, d3j0 d3j0Var, iac0 iac0Var) {
        this.a = context;
        this.b = messageResponseToken;
        this.c = o6w0Var;
        this.d = dynamicTagsMetadata;
        this.e = uy31Var;
        this.f = d3j0Var;
        this.g = iac0Var;
    }

    public final Context a() {
        return this.a;
    }

    public final uy31 b() {
        return this.e;
    }

    public final DynamicTagsMetadata c() {
        return this.d;
    }

    public final iac0 d() {
        return this.g;
    }

    public final d3j0 e() {
        return this.f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o6j0)) {
            return false;
        }
        o6j0 o6j0Var = (o6j0) obj;
        return this.a.equals(o6j0Var.a) && this.b.equals(o6j0Var.b) && this.c.equals(o6j0Var.c) && u890.j(this.d, o6j0Var.d) && this.e.equals(o6j0Var.e) && u890.j(this.f, o6j0Var.f) && this.g.equals(o6j0Var.g);
    }

    public final o6w0 f() {
        return this.c;
    }

    public final MessageResponseToken g() {
        return this.b;
    }

    public final int hashCode() {
        int iHashCode = (this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31)) * 31;
        DynamicTagsMetadata dynamicTagsMetadata = this.d;
        int iHashCode2 = (this.e.hashCode() + ((iHashCode + (dynamicTagsMetadata == null ? 0 : dynamicTagsMetadata.hashCode())) * 31)) * 31;
        d3j0 d3j0Var = this.f;
        return this.g.hashCode() + ((iHashCode2 + (d3j0Var != null ? d3j0Var.hashCode() : 0)) * 31);
    }
}
