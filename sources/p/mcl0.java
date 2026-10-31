package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class mcl0 implements w6h1, p8h1 {
    public final r6h1 a;
    public final y6h1 b;

    public mcl0(int i, Integer num, r6h1 r6h1Var) {
        String str;
        this.a = r6h1Var;
        y6h1 y6h1Var = y6h1.i;
        x6h1 x6h1VarI = i3o1.i();
        x6h1VarI.h = "music";
        x6h1VarI.a = "mobile-listening-activity-carousel-your-activity";
        x6h1VarI.f = "0.2.0";
        x6h1VarI.g = "22.0.0";
        switch (i) {
            case 1:
                str = "activity_off";
                break;
            case 2:
                str = "activity_on";
                break;
            case 3:
                str = "loading";
                break;
            case 4:
                str = "played";
                break;
            case 5:
                str = "playing";
                break;
            case 6:
                str = "private_session";
                break;
            default:
                throw null;
        }
        x6h1VarI.b = str;
        x6h1VarI.c = num;
        this.b = x6h1VarI.a();
    }

    public final r6h1 b() {
        r6h1 r6h1Var = r6h1.c;
        ArrayList arrayList = new ArrayList();
        r6h1 r6h1Var2 = this.a;
        arrayList.addAll(r6h1Var2.a);
        arrayList.add(this.b);
        return new r6h1(arrayList, r6h1Var2.b);
    }

    public final l7h1 e() {
        k7h1 k7h1Var = new k7h1();
        ((xjn) k7h1Var).a = this.b;
        ((xjn) k7h1Var).b = this.a;
        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
        return k7h1Var.a();
    }
}
