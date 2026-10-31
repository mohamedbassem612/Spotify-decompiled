package p;

import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class ez10 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ mkr c;
    public final /* synthetic */ ArrayList d;
    public final /* synthetic */ ptl e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ez10(mkr mkrVar, ArrayList arrayList, ptl ptlVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = mkrVar;
        this.d = arrayList;
        this.e = ptlVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new ez10(this.c, this.d, this.e, lnmVar, (byte) 0);
            default:
                return new ez10(this.c, this.d, this.e, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(c9nVar, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                yfu yfuVar = (yfu) this.c.e;
                this.b = true;
                Object objH = c921.H((q8n) yfuVar.c, new sr1(yfuVar, this.d, this.e, (lnm) null, (byte) 20), this);
                return objH == d9nVar ? d9nVar : objH;
            default:
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                mkr mkrVar = this.c;
                q8n q8nVar = (q8n) mkrVar.d;
                ez10 ez10Var = new ez10(mkrVar, this.d, this.e, null, (byte) 0);
                this.b = true;
                Object objY = fn31.Y(q8nVar, ez10Var, this);
                return objY == d9nVar ? d9nVar : objY;
        }
    }
}
