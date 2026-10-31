package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ezl0 implements w6h1, p8h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;

    public ezl0(r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 2:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-song-dna-search-error-message";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                this.c = x6h1VarI.a();
                break;
            case 3:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-song-dna-search-no-results-message";
                x6h1VarI2.f = "1.0.0";
                x6h1VarI2.g = "22.0.0";
                this.c = x6h1VarI2.a();
                break;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var3 = y6h1.i;
                x6h1 x6h1VarI3 = i3o1.i();
                x6h1VarI3.h = "music";
                x6h1VarI3.a = "mobile-song-dna-save-as-playlist-snackbar";
                x6h1VarI3.f = "2.0.0";
                x6h1VarI3.g = "22.0.0";
                this.c = x6h1VarI3.a();
                break;
        }
    }

    public final r6h1 b() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                r6h1 r6h1Var2 = r6h1.c;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(r6h1Var.a);
                arrayList.add(y6h1Var);
                return new r6h1(arrayList, r6h1Var.b);
            case 1:
                r6h1 r6h1Var3 = r6h1.c;
                ArrayList arrayList2 = new ArrayList();
                arrayList2.addAll(r6h1Var.a);
                arrayList2.add(y6h1Var);
                return new r6h1(arrayList2, r6h1Var.b);
            case 2:
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var.b);
            case 3:
                r6h1 r6h1Var5 = r6h1.c;
                ArrayList arrayList4 = new ArrayList();
                arrayList4.addAll(r6h1Var.a);
                arrayList4.add(y6h1Var);
                return new r6h1(arrayList4, r6h1Var.b);
            case 4:
                r6h1 r6h1Var6 = r6h1.c;
                ArrayList arrayList5 = new ArrayList();
                arrayList5.addAll(r6h1Var.a);
                arrayList5.add(y6h1Var);
                return new r6h1(arrayList5, r6h1Var.b);
            default:
                r6h1 r6h1Var7 = r6h1.c;
                ArrayList arrayList6 = new ArrayList();
                arrayList6.addAll(r6h1Var.a);
                arrayList6.add(y6h1Var);
                return new r6h1(arrayList6, r6h1Var.b);
        }
    }

    public final l7h1 e() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var.a();
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = r6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var2.a();
            case 2:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).b = r6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var3.a();
            case 3:
                k7h1 k7h1Var4 = new k7h1();
                ((xjn) k7h1Var4).a = y6h1Var;
                ((xjn) k7h1Var4).b = r6h1Var;
                ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var4.a();
            case 4:
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1Var;
                ((xjn) k7h1Var5).b = r6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            default:
                k7h1 k7h1Var6 = new k7h1();
                ((xjn) k7h1Var6).a = y6h1Var;
                ((xjn) k7h1Var6).b = r6h1Var;
                ((xjn) k7h1Var6).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var6.a();
        }
    }

    public ezl0(String str, r6h1 r6h1Var, byte b) {
        this.a = b;
        switch (b) {
            case 5:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-your-library-error-dialog";
                x6h1VarI.f = "1.0.0";
                x6h1VarI.g = "22.0.0";
                x6h1VarI.e = str;
                this.c = x6h1VarI.a();
                break;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-your-highlights";
                x6h1VarI2.f = "3.0.0";
                x6h1VarI2.g = "22.0.0";
                x6h1VarI2.c = 0;
                x6h1VarI2.d = str;
                this.c = x6h1VarI2.a();
                break;
        }
    }

    public ezl0() {
        this.a = (byte) 0;
        this.b = r6h1.c;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-shuffletoggleupsell-sheet";
        x6h1VarI.f = "3.0.0";
        x6h1VarI.g = "22.0.0";
        this.c = x6h1VarI.a();
    }
}
