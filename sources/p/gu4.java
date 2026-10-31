package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class gu4 implements pdy0 {
    public final int a;
    public final boolean b;
    public final luk c;
    public final idd1 d = new idd1(new st4(this, (byte) 11));

    public gu4(int i, luk lukVar, boolean z) {
        this.a = i;
        this.b = z;
        this.c = lukVar;
    }

    public final int a() {
        gu4 gu4Var = (gu4) this.d.getValue();
        return gu4Var != null ? gu4Var.a() : this.a;
    }

    public final boolean b() {
        gu4 gu4Var = (gu4) this.d.getValue();
        return gu4Var != null ? gu4Var.b() : this.b;
    }

    @Override // p.pdy0
    public final List models() {
        return p7h.M(new fpb("recurring_ping_interval", "android-musicapp-ubi", a(), 0, 1500), new fpb("send_page_error_reports", "android-musicapp-ubi", b()));
    }
}
