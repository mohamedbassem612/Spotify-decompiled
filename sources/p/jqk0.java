package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class jqk0 implements w6h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;

    public jqk0(Integer num, String str, r6h1 r6h1Var) {
        this.a = (byte) 2;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-watch-feed-carousel-entrypoint";
        x6h1VarI.f = "4.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        this.c = x6h1VarI.a();
    }

    @Override // p.n8h1
    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                dlg1 dlg1VarS = b3o1.s();
                dlg1VarS.s(y6h1Var);
                dlg1VarS.C(r6h1Var);
                return dlg1VarS.f();
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                dlg1 dlg1VarS2 = b3o1.s();
                dlg1VarS2.s(y6h1Var);
                dlg1VarS2.C(r6h1Var);
                return dlg1VarS2.f();
            default:
                r6h1 r6h1Var4 = r6h1.c;
                dlg1 dlg1VarS3 = b3o1.s();
                dlg1VarS3.s(y6h1Var);
                dlg1VarS3.C(r6h1Var);
                return dlg1VarS3.f();
        }
    }

    public jqk0(r6h1 r6h1Var) {
        this.a = (byte) 0;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-agents-row";
        x6h1VarI.f = "1.0.0";
        x6h1VarI.g = "22.0.0";
        this.c = x6h1VarI.a();
    }

    public jqk0() {
        this.a = (byte) 1;
        this.b = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-lingo";
        x6h1VarI.f = "1.1.0";
        x6h1VarI.g = "22.0.0";
        this.c = x6h1VarI.a();
    }
}
