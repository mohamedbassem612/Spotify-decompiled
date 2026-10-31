package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bpy0 implements pdy0 {
    public final boolean a;
    public final luk b;
    public final idd1 c = new idd1(new h2y0(this, (byte) 17));

    public bpy0(boolean z, luk lukVar) {
        this.a = z;
        this.b = lukVar;
    }

    public final boolean a() {
        bpy0 bpy0Var = (bpy0) this.c.getValue();
        return bpy0Var != null ? bpy0Var.a() : this.a;
    }

    @Override // p.pdy0
    public final List models() {
        return k4p1.x(new fpb("puffin_client_enabled", "puffin-access", a()));
    }
}
