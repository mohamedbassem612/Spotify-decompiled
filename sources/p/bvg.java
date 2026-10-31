package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class bvg extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bvg(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                bvg bvgVar = new bvg(2, lnmVar, (byte) 0);
                bvgVar.b = obj;
                return bvgVar;
            case 1:
                bvg bvgVar2 = new bvg(2, lnmVar, (byte) 1);
                bvgVar2.b = obj;
                return bvgVar2;
            case 2:
                bvg bvgVar3 = new bvg(2, lnmVar, (byte) 2);
                bvgVar3.b = obj;
                return bvgVar3;
            default:
                bvg bvgVar4 = new bvg(2, lnmVar, (byte) 3);
                bvgVar4.b = obj;
                return bvgVar4;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                create((xdp0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 1:
                return create((ixb) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 2:
                return create((bp90) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((cy71) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                hm5.M(obj);
                j2p1.v("RateLimiter", "Action triggered: " + ((xdp0) this.b));
                return rih1.a;
            case 1:
                ixb ixbVar = (ixb) this.b;
                hm5.M(obj);
                return yah0.m(ixbVar != ixb.c);
            case 2:
                bp90 bp90Var = (bp90) this.b;
                hm5.M(obj);
                return yah0.m(bp90Var.b || bp90Var.d);
            default:
                cy71 cy71Var = (cy71) this.b;
                hm5.M(obj);
                return yah0.m(cy71Var != cy71.a);
        }
    }
}
