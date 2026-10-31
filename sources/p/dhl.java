package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class dhl {
    public static final /* synthetic */ mma0[] k;
    public final Object a;
    public final eic b;
    public final xid d;
    public final ube e;
    public final xid f;
    public final ube g;
    public final ihl c = new ihl("parent");
    public final chl h = new chl(this, fmv.c());
    public final chl i = new chl(this, fmv.c());
    public final chl j = new chl(this);

    static {
        een0 een0Var = new een0(dhl.class, "width", "getWidth()Landroidx/constraintlayout/compose/Dimension;", 0);
        jd11 jd11Var = rc11.a;
        k = new mma0[]{jd11Var.f(een0Var), jd11Var.f(new een0(dhl.class, "height", "getHeight()Landroidx/constraintlayout/compose/Dimension;", 0)), jd11Var.f(new een0(dhl.class, "visibility", "getVisibility()Landroidx/constraintlayout/compose/Visibility;", 0)), jd11Var.f(new een0(dhl.class, "scaleX", "getScaleX()F", 0)), jd11Var.f(new een0(dhl.class, "scaleY", "getScaleY()F", 0)), jd11Var.f(new een0(dhl.class, "rotationX", "getRotationX()F", 0)), jd11Var.f(new een0(dhl.class, "rotationY", "getRotationY()F", 0)), jd11Var.f(new een0(dhl.class, "rotationZ", "getRotationZ()F", 0)), jd11Var.f(new een0(dhl.class, "translationX", "getTranslationX-D9Ej5fM()F", 0)), jd11Var.f(new een0(dhl.class, "translationY", "getTranslationY-D9Ej5fM()F", 0)), jd11Var.f(new een0(dhl.class, "translationZ", "getTranslationZ-D9Ej5fM()F", 0)), jd11Var.f(new een0(dhl.class, "pivotX", "getPivotX()F", 0)), jd11Var.f(new een0(dhl.class, "pivotY", "getPivotY()F", 0)), jd11Var.f(new een0(dhl.class, "horizontalChainWeight", "getHorizontalChainWeight()F", 0)), jd11Var.f(new een0(dhl.class, "verticalChainWeight", "getVerticalChainWeight()F", 0))};
    }

    public dhl(Object obj, eic eicVar) {
        this.a = obj;
        this.b = eicVar;
        this.d = new xid(-2, eicVar);
        this.e = new ube(0, eicVar);
        this.f = new xid(-1, eicVar);
        this.g = new ube(1, eicVar);
    }

    public static void a(dhl dhlVar, ihl ihlVar) {
        d(dhlVar, ihlVar.d, ihlVar.f, 60);
    }

    public static void b(dhl dhlVar, ihl ihlVar) {
        dhlVar.getClass();
        c(dhlVar, ihlVar.e, ihlVar.g, 0.5f, 60);
    }

    public static void c(dhl dhlVar, shl shlVar, shl shlVar2, float f, int i) {
        float f2 = (i & 4) != 0 ? 0.0f : 16.0f;
        if ((i & 64) != 0) {
            f = 0.5f;
        }
        dhlVar.e.o(shlVar, f2, 0.0f);
        dhlVar.g.o(shlVar2, 0.0f, 0.0f);
        dhlVar.b.J("vBias", f);
    }

    public static void d(dhl dhlVar, thl thlVar, thl thlVar2, int i) {
        float f = (i & 4) != 0 ? 0.0f : 16.0f;
        float f2 = (i & 8) != 0 ? 0.0f : 16.0f;
        dhlVar.d.q(thlVar, f);
        dhlVar.f.q(thlVar2, f2);
        dhlVar.b.J("hRtlBias", 0.5f);
    }

    public static void e(dhl dhlVar, thl thlVar, shl shlVar, thl thlVar2, shl shlVar2) {
        dhlVar.d.q(thlVar, 0.0f);
        dhlVar.f.q(thlVar2, 0.0f);
        eic eicVar = dhlVar.b;
        eicVar.J("hRtlBias", 0.5f);
        dhlVar.e.o(shlVar, 0.0f, 0.0f);
        dhlVar.g.o(shlVar2, 0.0f, 0.0f);
        eicVar.J("vBias", 0.5f);
    }

    public final void f(e5u e5uVar) {
        this.i.c(k[1], this, e5uVar);
    }

    public final void g(e5u e5uVar) {
        this.h.c(k[0], this, e5uVar);
    }
}
