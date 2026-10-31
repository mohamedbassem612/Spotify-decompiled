package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class c9i1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n9i1 b;
    public final /* synthetic */ w9i1 c;
    public final /* synthetic */ lzn0 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ c9i1(n9i1 n9i1Var, w9i1 w9i1Var, lzn0 lzn0Var, byte b) {
        super(0);
        this.a = b;
        this.b = n9i1Var;
        this.c = w9i1Var;
        this.d = lzn0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        rih1 rih1Var = rih1.a;
        lzn0 lzn0Var = this.d;
        w9i1 w9i1Var = this.c;
        n9i1 n9i1Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = n9i1Var.a;
                x6h1 x6h1VarC = n9i1Var.c.b.c();
                x6h1VarC.i.add(new a7h1("top_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                w9i1Var.W(new xg20(lzn0Var, (byte) 3));
                break;
            case 1:
                n9i1Var.a();
                w9i1Var.W(new xg20(lzn0Var, (byte) 4));
                break;
            case 2:
                i8h1 i8h1Var2 = n9i1Var.a;
                x6h1 x6h1VarC2 = n9i1Var.d.b.c();
                x6h1VarC2.i.add(new a7h1("send_report_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", yon1.j2().a)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                w9i1Var.c0(w9i1Var.s1.d().d.toString(), new xg20(lzn0Var, (byte) 5));
                break;
            default:
                n9i1Var.a();
                w9i1Var.W(new xg20(lzn0Var, (byte) 6));
                break;
        }
        return rih1Var;
    }
}
