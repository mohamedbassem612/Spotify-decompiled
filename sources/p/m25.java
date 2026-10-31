package p;

import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class m25 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public m25(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
        this.d = new idd1(new k25(this, (byte) 1));
    }

    public final int a() {
        m25 m25Var = (m25) this.d.getValue();
        return m25Var != null ? m25Var.a() : this.a;
    }

    public final boolean b() {
        m25 m25Var = (m25) this.d.getValue();
        return m25Var != null ? m25Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("behavior_trampoline_delay_ms", "android-system-element", a(), 0, StoryCard.CLASSIC_CONTENT_FIELD_NUMBER), new fpb("behavior_trampoline_enabled", "android-system-element", b())});
    }

    public m25(luk lukVar) {
        this(100, lukVar, false);
    }
}
