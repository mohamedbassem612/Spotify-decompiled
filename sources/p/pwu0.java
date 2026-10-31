package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class pwu0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pwu0(ArrayList arrayList, int i, byte b) {
        super(2);
        this.a = b;
        this.b = arrayList;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ArrayList arrayList = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                m6p1.l(arrayList, b0kVar, czo1.p(1));
                break;
            default:
                a8o.f(arrayList, b0kVar, czo1.p(1));
                break;
        }
        return rih1Var;
    }
}
