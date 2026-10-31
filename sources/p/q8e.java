package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class q8e extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ lzn0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q8e(lzn0 lzn0Var, byte b) {
        super(3);
        this.a = b;
        this.b = lzn0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        lzn0 lzn0Var = this.b;
        switch (b) {
            case 0:
                o8e o8eVar = (o8e) obj;
                tqw tqwVar = (tqw) obj3;
                if (p8e.a[((n8e) obj2).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                if (tqwVar == null) {
                    return rih1Var;
                }
                lzn0Var.a(o8eVar.a, n3o1.y(tqwVar), (Bundle) null);
                return rih1Var;
            case 1:
                trk trkVar = (trk) obj;
                srk srkVar = (srk) obj2;
                tqw tqwVar2 = (tqw) obj3;
                if (!srkVar.equals(srk.a) && !srkVar.equals(srk.b)) {
                    eg.o();
                    return null;
                }
                String str2 = trkVar.e;
                if (tqwVar2 == null) {
                    return rih1Var;
                }
                lzn0Var.a(str2, n3o1.y(tqwVar2), (Bundle) null);
                return rih1Var;
            case 2:
                y8x y8xVar = (y8x) obj;
                tqw tqwVar3 = (tqw) obj3;
                if (tqwVar3 != null && (str = y8xVar.d) != null) {
                    lzn0Var.a(str, n3o1.y(tqwVar3), (Bundle) null);
                }
                return rih1Var;
            default:
                lzn0Var.f(new dwn0(((uwk1) obj).c, "", false, false, 0, 0, false, (a690) null, (Bundle) null, (cwn0) null));
                return rih1Var;
        }
    }
}
