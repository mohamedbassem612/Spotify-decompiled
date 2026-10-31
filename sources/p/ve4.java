package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ve4 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new pe4(this, (byte) 3));

    public ve4(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        ve4 ve4Var = (ve4) this.c.getValue();
        return ve4Var != null ? ve4Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("allow_widget_providers_media_provider_access", "android-external-integration-service", a()));
    }
}
