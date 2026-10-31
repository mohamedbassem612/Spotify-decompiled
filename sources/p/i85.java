package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class i85 implements pdy0 {
    public final boolean a;
    public final int b;
    public final luk c;
    public final idd1 d = new idd1(new f85(this, (byte) 2));

    public i85(int i, luk lukVar, boolean z) {
        this.a = z;
        this.b = i;
        this.c = lukVar;
    }

    public final boolean a() {
        i85 i85Var = (i85) this.d.getValue();
        return i85Var != null ? i85Var.a() : this.a;
    }

    public final int b() {
        i85 i85Var = (i85) this.d.getValue();
        return i85Var != null ? i85Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("enable_native_prompt", "android-widget-widgetpromo", a()), new fpb("native_prompt_frequency_days", "android-widget-widgetpromo", b(), 1, 365));
    }
}
