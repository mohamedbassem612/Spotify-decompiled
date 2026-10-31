package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class r34 implements pdy0 {
    public final boolean a;
    public final boolean b;
    public final luk c;
    public final idd1 d;

    public r34(boolean z, boolean z2, luk lukVar) {
        this.a = z;
        this.b = z2;
        this.c = lukVar;
        this.d = new idd1(new g82(this, (byte) 18));
    }

    public final boolean a() {
        r34 r34Var = (r34) this.d.getValue();
        return r34Var != null ? r34Var.a() : this.b;
    }

    public final boolean b() {
        r34 r34Var = (r34) this.d.getValue();
        return r34Var != null ? r34Var.b() : this.a;
    }

    public final List models() {
        return p7h.M(new fpb[]{new fpb("is_consumption_tracker_top_up_entry_point_enabled", "android-abp", b()), new fpb("use_get_quota_v1_endpoint", "android-abp", a())});
    }

    public r34(luk lukVar) {
        this(false, false, lukVar);
    }
}
