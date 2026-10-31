package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class m15 implements pdy0 {
    public final int a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new uz4(this, (byte) 20));

    public m15(int i, int i2, luk lukVar) {
        this.a = i;
        this.b = i2;
        this.c = lukVar;
    }

    public final int a() {
        m15 m15Var = (m15) this.d.getValue();
        return m15Var != null ? m15Var.a() : this.a;
    }

    public final int b() {
        m15 m15Var = (m15) this.d.getValue();
        return m15Var != null ? m15Var.b() : this.b;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("promoted_destinations", "android-share", a(), 0, Integer.MAX_VALUE), new fpb("video_clip_sharing_destinations", "android-share", b(), 0, Integer.MAX_VALUE)});
    }
}
