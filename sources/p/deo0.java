package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class deo0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ List b;
    public final /* synthetic */ qim0 c;
    public final /* synthetic */ j2i d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public deo0(List list, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 0;
        this.b = list;
        this.d = j2iVar;
        this.c = qim0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        j2i j2iVar = this.d;
        qim0 qim0Var = this.c;
        List list = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                lgo1.j(czo1.p(49), list, j2iVar, b0kVar, qim0Var);
                break;
            case 1:
                i9p1.p(czo1.p(385), list, j2iVar, b0kVar, qim0Var);
                break;
            case 2:
                n9p1.i(czo1.p(385), list, j2iVar, b0kVar, qim0Var);
                break;
            default:
                rje1.j(czo1.p(385), list, j2iVar, b0kVar, qim0Var);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ deo0(List list, qim0 qim0Var, j2i j2iVar, int i, byte b) {
        super(2);
        this.a = b;
        this.b = list;
        this.c = qim0Var;
        this.d = j2iVar;
    }
}
