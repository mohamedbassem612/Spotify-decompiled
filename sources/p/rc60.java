package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class rc60 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ v3d b;
    public final /* synthetic */ ur80 c;
    public final /* synthetic */ int d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public rc60(v3d v3dVar, ur80 ur80Var, int i, byte b) {
        super(2);
        this.a = b;
        switch (b) {
            case 1:
                this.b = v3dVar;
                this.c = ur80Var;
                this.d = i;
                super(2);
                break;
            case 2:
                this.b = v3dVar;
                this.c = ur80Var;
                this.d = i;
                super(2);
                break;
            default:
                this.b = v3dVar;
                this.c = ur80Var;
                this.d = i;
                break;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.d;
        nim0 nim0Var = nim0.a;
        ur80 ur80Var = this.c;
        v3d v3dVar = this.b;
        b0k b0kVar = (b0k) obj;
        ((Number) obj2).intValue();
        switch (b) {
            case 0:
                vno1.a(v3dVar, ur80Var, nim0Var, b0kVar, czo1.p(i | 1));
                break;
            case 1:
                vno1.a(v3dVar, ur80Var, nim0Var, b0kVar, czo1.p(i | 1));
                break;
            default:
                vno1.a(v3dVar, ur80Var, nim0Var, b0kVar, czo1.p(i | 1));
                break;
        }
        return rih1Var;
    }
}
