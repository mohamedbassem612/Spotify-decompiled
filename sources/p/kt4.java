package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class kt4 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public kt4(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new rq4(this, (byte) 23));
    }

    public final boolean a() {
        kt4 kt4Var = (kt4) this.d.getValue();
        return kt4Var != null ? kt4Var.a() : this.a;
    }

    public final boolean b() {
        kt4 kt4Var = (kt4) this.d.getValue();
        return kt4Var != null ? kt4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_page_monitor_plugin", "android-metric-keeper", a()), new fpb("enable_touch_qualified_scroll_windows", "android-metric-keeper", b()));
    }

    public kt4(luk lukVar) {
        this(false, false, lukVar);
    }
}
