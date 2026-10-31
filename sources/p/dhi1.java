package p;

import io.reactivex.rxjava3.functions.Consumer;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class dhi1 implements Consumer {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ehi1 b;

    public /* synthetic */ dhi1(ehi1 ehi1Var, byte b) {
        this.a = b;
        this.b = ehi1Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        ehi1 ehi1Var = this.b;
        switch (b) {
            case 0:
                zgi1 zgi1Var = (zgi1) obj;
                yx6 yx6Var = ehi1Var.d;
                zgi1Var.getClass();
                yx6Var.a(zgi1Var);
                break;
            case 1:
                bhi1 bhi1Var = (bhi1) obj;
                String str = bhi1Var.a;
                ehi1Var.b.b(new dmf1(str, nik1.y4, (String) null, new vsf1(null, null, false, null, false, false, true, false, false, true, null, false, false, false, true, false, null, null, false, null, false, false, false, false, false, false, false, false, null, null, false, false, -42465, 63), (Map) null), bhi1Var.b);
                break;
            default:
                ygi1 ygi1Var = (ygi1) obj;
                yx6 yx6Var2 = ehi1Var.d;
                ygi1Var.getClass();
                yx6Var2.a(ygi1Var);
                break;
        }
    }
}
