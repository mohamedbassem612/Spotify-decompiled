package p;

import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class fsj0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gsj0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ fsj0(gsj0 gsj0Var, byte b) {
        super(0);
        this.a = b;
        this.b = gsj0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        z6x z6xVar = z6x.a;
        gsj0 gsj0Var = this.b;
        switch (b) {
            case 0:
                x6h1 x6h1VarC = gsj0Var.N0.b.c();
                x6h1VarC.i.add(new a7h1("track_information", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                r6h1 r6h1Var = r6h1.c;
                ArrayList arrayList = new ArrayList();
                return c13.m(arrayList, z6xVar, y6h1VarA, arrayList, (u8h1) null);
            default:
                x6h1 x6h1VarC2 = gsj0Var.N0.b.c();
                x6h1VarC2.i.add(new a7h1("main_controls", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                return c13.m(arrayList2, z6xVar, y6h1VarA2, arrayList2, (u8h1) null);
        }
    }
}
