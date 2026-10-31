package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tgz implements usr0 {
    public final /* synthetic */ byte a;
    public final usr0 b;

    public /* synthetic */ tgz(usr0 usr0Var, byte b) {
        this.a = b;
        this.b = usr0Var;
    }

    @Override // p.usr0
    public final r6h1 a() {
        byte b = this.a;
        usr0 usr0Var = this.b;
        switch (b) {
            case 0:
                ((co31) usr0Var).getClass();
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-page";
                x6h1VarI.f = "9.3.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.b = null;
                x6h1 x6h1VarR = kk0.r(x6h1VarI, "yourlibrary");
                x6h1VarR.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR.j = false;
                y6h1 y6h1VarA = x6h1VarR.a();
                r6h1 r6h1Var = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA), (u8h1) null);
            default:
                ((zvm1) usr0Var).getClass();
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-your-library-search-page";
                x6h1VarI2.f = "4.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1 x6h1VarR2 = kk0.r(x6h1VarI2, "yourlibrary/search");
                x6h1VarR2.i.add(new a7h1("error_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarR2.j = false;
                y6h1 y6h1VarA2 = x6h1VarR2.a();
                r6h1 r6h1Var2 = r6h1.c;
                return new r6h1(kk0.l(y6h1VarA2), (u8h1) null);
        }
    }
}
