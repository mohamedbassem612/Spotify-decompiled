package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aqh implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new vjh(this, (byte) 3));

    public aqh(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        aqh aqhVar = (aqh) this.c.getValue();
        return aqhVar != null ? aqhVar.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_comments_deep_linking", "comments-sheet", a()));
    }
}
