package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class frc extends hab0 implements iu30 {
    public final /* synthetic */ iu30 X;
    public final /* synthetic */ String a;
    public final /* synthetic */ gax b;
    public final /* synthetic */ String c;
    public final /* synthetic */ d8e0 d;
    public final /* synthetic */ int e;
    public final /* synthetic */ List f;
    public final /* synthetic */ int g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ ven0 i;
    public final /* synthetic */ iu30 t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public frc(String str, gax gaxVar, String str2, d8e0 d8e0Var, int i, List list, int i2, iu30 iu30Var, ven0 ven0Var, iu30 iu30Var2, iu30 iu30Var3) {
        super(1);
        this.a = str;
        this.b = gaxVar;
        this.c = str2;
        this.d = d8e0Var;
        this.e = i;
        this.f = list;
        this.g = i2;
        this.h = iu30Var;
        this.i = ven0Var;
        this.t = iu30Var2;
        this.X = iu30Var3;
    }

    public final Object invoke(Object obj) {
        e261 e261Var = (e261) obj;
        b261.n(e261Var, this.a);
        gax gaxVar = this.b;
        if (gaxVar != null) {
            b261.a(e261Var);
            String str = this.c;
            if (str != null) {
                b261.A(e261Var, str);
            }
            b261.g(e261Var, (String) null, new rqa(this.h, gaxVar, (byte) 13));
        } else {
            d8e0 d8e0Var = this.d;
            if (d8e0Var != null) {
                b261.A(e261Var, d8e0Var.e);
                b261.s(e261Var, ((Boolean) this.i.getValue()).booleanValue());
                int i = this.e;
                List list = this.f;
                b261.w(e261Var, new vfx0(i, new jsg(0.0f, p7h.L(list)), this.g));
                b261.v(e261Var, new fu(i, list, this.t, this.X, (byte) 5));
            }
        }
        return rih1.a;
    }
}
