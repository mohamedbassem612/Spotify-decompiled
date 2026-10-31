package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nqb0 extends ezq0 {
    public static final /* synthetic */ mma0[] N0 = {new cey0(nqb0.class, "binaryClasses", "getBinaryClasses$descriptors_jvm()Ljava/util/Map;", 0), new cey0(nqb0.class, "partToFacade", "getPartToFacade()Ljava/util/HashMap;", 0)};
    public final mja0 X;
    public final ooe0 Y;
    public final fg5 Z;
    public final wb11 h;
    public final o860 i;
    public final toe0 t;

    /* JADX WARN: Illegal instructions before constructor call */
    public nqb0(o860 o860Var, wb11 wb11Var) {
        uw0 uw0Var = (uw0) o860Var.b;
        super((ajm0) uw0Var.X, wb11Var.a);
        this.h = wb11Var;
        o860 o860VarO = ryn1.o(o860Var, this, (mb11) null, 6);
        this.i = o860VarO;
        ((u321) ((zht) uw0Var.g).c().c).getClass();
        joj0 joj0Var = joj0.g;
        uw0 uw0Var2 = (uw0) o860VarO.b;
        voe0 voe0Var = (voe0) uw0Var2.d;
        this.t = new toe0(voe0Var, new mqb0(this, (byte) 0));
        this.X = new mja0(o860VarO, wb11Var, this);
        this.Y = new ooe0(voe0Var, new mqb0(this, (byte) 1));
        this.Z = ((oi) uw0Var2.N0).b ? rzs0.g : flo1.n(o860VarO, wb11Var);
    }

    @Override // p.dzq0
    public final zpi0 E() {
        return this.X;
    }

    public final fg5 getAnnotations() {
        return this.Z;
    }

    @Override // p.ezq0, p.q9r, p.p9r
    public final mka1 getSource() {
        return new laz(this, (byte) 27);
    }

    @Override // p.ezq0, p.o9r
    public final String toString() {
        return "Lazy Java package fragment: " + this.f + " of module " + ((ajm0) ((uw0) this.i.b).X);
    }
}
