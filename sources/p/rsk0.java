package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class rsk0 implements w6h1, o8h1 {
    public final /* synthetic */ byte a;
    public final r6h1 b;
    public final y6h1 c;

    public rsk0(int i, Integer num, String str, r6h1 r6h1Var, byte b) {
        this.a = b;
        String str2 = "audiobrowse_v2";
        switch (b) {
            case 2:
                this.b = r6h1Var;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-video-preview-card";
                x6h1VarI.f = "3.3.0";
                x6h1VarI.g = "22.0.0";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "medium_density";
                    } else if (i == 3) {
                        str2 = "medium_density_carousel_promo";
                    } else {
                        if (i != 4) {
                            throw null;
                        }
                        str2 = "medium_density_promo";
                    }
                }
                x6h1VarI.b = str2;
                x6h1VarI.c = num;
                x6h1VarI.d = str;
                this.c = x6h1VarI.a();
                return;
            default:
                this.b = r6h1Var;
                y6h1 y6h1Var2 = y6h1.i;
                x6h1 x6h1VarI2 = i3o1.i();
                x6h1VarI2.h = "music";
                x6h1VarI2.a = "mobile-audio-preview-card";
                x6h1VarI2.f = "4.5.0";
                x6h1VarI2.g = "22.0.0";
                if (i != 1) {
                    if (i == 2) {
                        str2 = "medium_density";
                    } else if (i == 3) {
                        str2 = "medium_density_promo";
                    } else if (i == 4) {
                        str2 = "medium_density_promo_with_prerelease";
                    } else {
                        if (i != 5) {
                            throw null;
                        }
                        str2 = "medium_density_with_prerelease";
                    }
                }
                x6h1VarI2.b = str2;
                x6h1VarI2.c = num;
                x6h1VarI2.d = str;
                this.c = x6h1VarI2.a();
                return;
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
            default:
                r6h1 r6h1Var4 = r6h1.c;
                ArrayList arrayList3 = new ArrayList();
                arrayList3.addAll(r6h1Var.a);
                arrayList3.add(y6h1Var);
                return new r6h1(arrayList3, r6h1Var.b);
        }
    }

    public final k6h1 e() {
        byte b = this.a;
        r6h1 r6h1Var = this.b;
        y6h1 y6h1Var = this.c;
        switch (b) {
            case 0:
                k7h1 k7h1Var = new k7h1();
                ((xjn) k7h1Var).a = y6h1Var;
                ((xjn) k7h1Var).b = r6h1Var;
                ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                return new k6h1(k7h1Var.a());
            case 1:
                k7h1 k7h1Var2 = new k7h1();
                ((xjn) k7h1Var2).a = y6h1Var;
                ((xjn) k7h1Var2).b = r6h1Var;
                ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                return new k6h1(k7h1Var2.a());
            default:
                k7h1 k7h1Var3 = new k7h1();
                ((xjn) k7h1Var3).a = y6h1Var;
                ((xjn) k7h1Var3).b = r6h1Var;
                ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                return new k6h1(k7h1Var3.a());
        }
    }

    public rsk0(Integer num, String str, String str2, r6h1 r6h1Var) {
        this.a = (byte) 1;
        this.b = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-dj-entrypoint-section";
        x6h1VarI.f = "2.0.0";
        x6h1VarI.g = "22.0.0";
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        x6h1VarI.d = str2;
        this.c = x6h1VarI.a();
    }
}
