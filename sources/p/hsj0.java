package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class hsj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ jsj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hsj0(jsj0 jsj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = jsj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        jsj0 jsj0Var = this.b;
        switch (b) {
            case 0:
                k691 k691Var = jsj0Var.t;
                qzh qzhVarR = voo1.r(jsj0Var.a);
                ((gcs) qzhVarR).a.setPadding(0, 0, 0, 0);
                return k691Var.a(qzhVarR);
            case 1:
                return new jpg0(jsj0Var.Z, kmj0.R0);
            case 2:
                s691 s691Var = jsj0Var.h;
                qzh qzhVarS = voo1.s(jsj0Var.a);
                ((whs) qzhVarS).a.setPadding(0, 0, 0, 0);
                return s691Var.a(qzhVarS);
            case 3:
                return jsj0Var.Y;
            case 4:
                x6h1 x6h1VarC = jsj0Var.Q0.b.c();
                x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            default:
                x6h1 x6h1VarC2 = jsj0Var.Q0.b.c();
                x6h1VarC2.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        }
    }
}
