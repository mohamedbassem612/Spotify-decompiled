package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sw4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new fv4(this, (byte) 21));

    public sw4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        sw4 sw4Var = (sw4) this.c.getValue();
        return sw4Var != null ? sw4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("google_assistant_nudge_use_cmp", "android-partner-account-linking-google-assistant-nudges", a()));
    }
}
