package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class itk0 implements t9h1, v8h1 {
    public static final u8h1 d = new u8h1(new v9r0("author"));
    public final r6h1 a;
    public final y6h1 b;
    public final List c;

    public itk0(String str, String str2) {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.B();
        this.a = dlg1VarS.f();
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-author-page";
        x6h1VarI.f = "2.1.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.d = str2;
        this.b = x6h1VarI.a();
        this.c = k4p1.x("author");
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        dlg1 dlg1VarS = b3o1.s();
        dlg1VarS.s(this.b);
        dlg1VarS.C(this.a);
        return dlg1VarS.f();
    }
}
