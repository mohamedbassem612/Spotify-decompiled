package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class bme extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ eme b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bme(eme emeVar) {
        super(2);
        this.b = emeVar;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        eme emeVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                emeVar.d((b0k) obj, czo1.p(1));
                break;
            default:
                a1r0.m(emeVar.e, (String) obj, (tv80) obj2, (Bundle) null, 12);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bme(eme emeVar, int i) {
        super(2);
        this.b = emeVar;
    }
}
