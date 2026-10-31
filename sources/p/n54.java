package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class n54 implements pdy0 {
    public final int a;
    public final luk b;
    public final idd1 c;

    public n54(int i, luk lukVar) {
        this.a = i;
        this.b = lukVar;
        this.c = new idd1(new m44(this, (byte) 19));
    }

    public final int a() {
        n54 n54Var = (n54) this.c.getValue();
        return n54Var != null ? n54Var.a() : this.a;
    }

    public final List models() {
        return Collections.singletonList(new fpb("fetch_copy_timeout_millis", "android-audiobook-ccbottomsheet", a(), StoryCard.CLASSIC_CONTENT_FIELD_NUMBER, 60000));
    }

    public n54(luk lukVar) {
        this(5000, lukVar);
    }
}
