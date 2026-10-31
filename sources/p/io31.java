package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class io31 implements z67 {
    public final kly0 a;
    public final co31 b;

    public io31(tsq tsqVar, co31 co31Var) {
        this.a = tsqVar;
        this.b = co31Var;
    }

    @Override // p.z67
    public final tv80 a(String str, String str2) {
        this.b.getClass();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-page";
        x6h1VarI.f = "9.3.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = null;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("yourlibrary");
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("content_deprecated", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("assistant", str, -1, (String) null, (String) null));
        x6h1VarC2.j = true;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("action_button", str, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        return ((i8h1) this.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
    }

    @Override // p.z67
    public final void b(String str) {
        this.b.getClass();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-your-library-page";
        x6h1VarI.f = "9.3.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = null;
        y6h1 y6h1VarA = x6h1VarI.a();
        Collections.singletonList("yourlibrary");
        x6h1 x6h1VarC = y6h1VarA.c();
        x6h1VarC.i.add(new a7h1("content_deprecated", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("assistant", str, -1, (String) null, (String) null));
        x6h1VarC2.j = true;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("close_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        y6h1 y6h1VarA2 = x6h1VarC3.a();
        b7x b7xVar = b7x.a;
        ((i8h1) this.a.get()).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
    }
}
