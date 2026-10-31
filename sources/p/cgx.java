package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class cgx implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new v7v(this, (byte) 20));

    public cgx(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        cgx cgxVar = (cgx) this.c.getValue();
        return cgxVar != null ? cgxVar.a() : this.a;
    }

    public final List models() {
        return k4p1.x(new fpb("monitoring_plugin_enabled", "encore-consumer-mobile", a()));
    }
}
