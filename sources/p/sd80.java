package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import java.util.Collections;
import java.util.List;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class sd80 implements jn60 {
    public final String a;
    public final String b;
    public final yz21 c;
    public final kf80 d;

    public sd80(String str, String str2, yz21 yz21Var, kf80 kf80Var) {
        this.a = str;
        this.b = str2;
        this.c = yz21Var;
        this.d = kf80Var;
    }

    public final List d(op80 op80Var) {
        String str = this.d.a;
        return Collections.singletonList(new od80(this.a, op80Var, new ne80("spotify:home:audiobooks:inlinecard", str, new DynamicTagsMetadata(str, (String) null, (String) null, (String) null, 14, (DefaultConstructorMarker) null))));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof sd80)) {
            return false;
        }
        sd80 sd80Var = (sd80) obj;
        return this.a.equals(sd80Var.a) && this.b.equals(sd80Var.b) && this.c.equals(sd80Var.c) && this.d.equals(sd80Var.d);
    }

    public final yz21 f() {
        return this.c;
    }

    public final String getId() {
        return this.a;
    }

    public final int hashCode() {
        return this.d.hashCode() + bb00.g(this.c, cy30.d(this.a.hashCode() * 31, 961, this.b), 31);
    }
}
