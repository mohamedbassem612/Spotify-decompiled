package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class vwb0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ List b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb0(String str, List list, int i) {
        super(2);
        this.c = str;
        this.b = list;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        List list = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                yoo1.a(czo1.p(1), str, list, b0kVar);
                break;
            default:
                sto1.d(czo1.p(1), str, list, b0kVar);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public vwb0(List list, String str, int i) {
        super(2);
        this.b = list;
        this.c = str;
    }
}
