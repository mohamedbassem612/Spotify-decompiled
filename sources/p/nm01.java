package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nm01 extends hab0 implements iu30 {
    public final /* synthetic */ boolean a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ boolean d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nm01(boolean z, boolean z2, boolean z3, boolean z4) {
        super(1);
        this.a = z;
        this.b = z2;
        this.c = z3;
        this.d = z4;
    }

    public final Object invoke(Object obj) {
        um01 um01Var = (um01) obj;
        boolean z = this.a || this.b || this.c;
        String str = um01Var.b;
        blc0[] blc0VarArr = sgy.a;
        if (((str != null ? nik1.N.a(str) : false) && z) || (sgy.f(str) && this.d)) {
            return str;
        }
        return null;
    }
}
