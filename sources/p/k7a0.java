package p;

import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class k7a0 implements igv0 {
    public static final /* synthetic */ mma0[] e = {new cey0(k7a0.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0)};
    public final kf30 a;
    public final mka1 b;
    public final toe0 c;
    public final db11 d;

    public k7a0(o860 o860Var, cb11 cb11Var, kf30 kf30Var) {
        uw0 uw0Var = (uw0) o860Var.b;
        this.a = kf30Var;
        this.b = cb11Var != null ? wdx0.b(cb11Var) : mka1.m0;
        this.c = new toe0((voe0) uw0Var.d, new na((Object) o860Var, (Object) this, (byte) 21));
        this.d = cb11Var != null ? (db11) o7h.r0(cb11Var.b()) : null;
    }

    @Override // p.pf5
    public Map a() {
        return b7x.a;
    }

    @Override // p.pf5
    public final kf30 b() {
        return this.a;
    }

    @Override // p.pf5
    public final mka1 getSource() {
        return this.b;
    }

    @Override // p.pf5
    public final a8b0 getType() {
        mma0 mma0Var = e[0];
        return (qx81) this.c.invoke();
    }
}
