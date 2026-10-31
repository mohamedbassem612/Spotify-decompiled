package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ubl1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vbl1 b;
    public final /* synthetic */ o0i c;
    public final /* synthetic */ ven0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ubl1(vbl1 vbl1Var, o0i o0iVar, ven0 ven0Var, byte b) {
        super(0);
        this.a = b;
        this.b = vbl1Var;
        this.c = o0iVar;
        this.d = ven0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        o0i o0iVar = this.c;
        vbl1 vbl1Var = this.b;
        ven0 ven0Var = this.d;
        switch (b) {
            case 0:
                ven0Var.setValue(Boolean.TRUE);
                bcl1 bcl1Var = vbl1Var.b;
                vbl1Var.c.a(dcl1.a);
                n0i n0iVar = o0iVar.c;
                hp80 hp80Var = o0iVar.e;
                kxt0 kxt0Var = n0iVar.a;
                if (kxt0Var != null && kxt0Var.c) {
                    m0t.a(vbl1Var.f, 7);
                    bcl1Var.e(hp80Var, new hbl1(o0iVar, (byte) 3));
                } else {
                    bcl1Var.getClass();
                    bcl1Var.a.m(new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), bcl1Var.h(hp80Var.b()).a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
            default:
                ven0Var.setValue(Boolean.FALSE);
                bcl1 bcl1Var2 = vbl1Var.b;
                vbl1Var.c.a(ecl1.a);
                n0i n0iVar2 = o0iVar.c;
                hp80 hp80Var2 = o0iVar.e;
                kxt0 kxt0Var2 = n0iVar2.a;
                if (kxt0Var2 != null && kxt0Var2.c) {
                    vbl1Var.f.b();
                    bcl1Var2.e(hp80Var2, new hbl1(o0iVar, (byte) 4));
                } else {
                    bcl1Var2.getClass();
                    bcl1Var2.a.m(new w7h1("", "", new z7h1("long_hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), bcl1Var2.h(hp80Var2.b()).a, r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                break;
        }
        return rih1Var;
    }
}
