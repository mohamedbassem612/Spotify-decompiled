package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class l05 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new uz4(this, (byte) 14));

    public l05(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        l05 l05Var = (l05) this.c.getValue();
        return l05Var != null ? l05Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("enable_remote_downloads_onboarding", "android-remotedownloads-onboarding", a()));
    }
}
