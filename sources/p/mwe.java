package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class mwe extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ nwe b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mwe(nwe nweVar, byte b) {
        super(1);
        this.a = b;
        this.b = nweVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        nwe nweVar = this.b;
        switch (b) {
            case 0:
                String str = (String) obj;
                i8h1 i8h1VarP1 = nweVar.p1();
                dsk0 dsk0Var = nweVar.Z1;
                dsk0Var.getClass();
                x6h1 x6h1VarC = dsk0Var.b.c();
                x6h1VarC.i.add(new a7h1("terms_of_use_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1VarP1.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                nweVar.q1(str);
                break;
            default:
                String str2 = (String) obj;
                i8h1 i8h1VarP2 = nweVar.p1();
                dsk0 dsk0Var2 = nweVar.Z1;
                dsk0Var2.getClass();
                x6h1 x6h1VarC2 = dsk0Var2.b.c();
                x6h1VarC2.i.add(new a7h1("platform_rules_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1VarP2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", str2)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                nweVar.q1(str2);
                break;
        }
        return rih1Var;
    }
}
