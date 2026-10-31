package p;

import android.os.Bundle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class igj0 extends pgj0 {
    public final String a;
    public final DismissType b;
    public final Bundle c;

    public igj0(String str, DismissType dismissType, Bundle bundle) {
        this.a = str;
        this.b = dismissType;
        this.c = bundle;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof igj0)) {
            return false;
        }
        igj0 igj0Var = (igj0) obj;
        return this.a.equals(igj0Var.a) && u890.j(this.b, igj0Var.b) && this.c.equals(igj0Var.c);
    }

    public final int hashCode() {
        return this.c.hashCode() + ((this.b.hashCode() + (this.a.hashCode() * 31)) * 31);
    }
}
