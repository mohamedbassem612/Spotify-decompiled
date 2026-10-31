package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class cyc1 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ArrayList b;
    public final /* synthetic */ vi11 c;
    public final /* synthetic */ vzq0 d;
    public final /* synthetic */ int e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cyc1(ArrayList arrayList, vi11 vi11Var, vzq0 vzq0Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = arrayList;
                this.c = vi11Var;
                this.d = vzq0Var;
                this.e = i;
                super(2);
                break;
            default:
                this.b = arrayList;
                this.c = vi11Var;
                this.d = vzq0Var;
                this.e = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.e;
        vzq0 vzq0Var = this.d;
        vi11 vi11Var = this.c;
        ArrayList arrayList = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                gto1.j(arrayList, vi11Var, vzq0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                xto1.v(arrayList, vi11Var, vzq0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
