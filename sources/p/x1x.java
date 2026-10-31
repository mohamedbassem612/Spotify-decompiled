package p;

import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class x1x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ z1x c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ x1x(z1x z1xVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = z1xVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                x1x x1xVar = new x1x(this.c, lnmVar, (byte) 0);
                x1xVar.b = obj;
                return x1xVar;
            case 1:
                x1x x1xVar2 = new x1x(this.c, lnmVar, (byte) 1);
                x1xVar2.b = obj;
                return x1xVar2;
            default:
                x1x x1xVar3 = new x1x(this.c, lnmVar, (byte) 2);
                x1xVar3.b = obj;
                return x1xVar3;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        mmr0 mmr0Var = (mmr0) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
                break;
            case 1:
                create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(mmr0Var, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        z1x z1xVar = this.c;
        mmr0 mmr0Var = (mmr0) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                ju0 ju0Var = (ju0) mmr0Var.b;
                if (ju0Var == ju0.AFTER_TRACK || ju0Var == ju0.AFTER_AD) {
                    bpb1 bpb1Var = z1xVar.j;
                    Boolean bool = Boolean.FALSE;
                    bpb1 bpb1Var2 = bpb1Var;
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, bool);
                }
                xab1 xab1Var = z1xVar.o;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                break;
            case 1:
                hm5.M(obj);
                if (((ju0) mmr0Var.b) == ju0.NPV_PAUSE) {
                    d1x.b(z1xVar.f, 6, (fq0) null, (Map) null, (String) null, 12);
                }
                break;
            default:
                hm5.M(obj);
                anf1 anf1Var = (anf1) mmr0Var.a;
                ju0 ju0Var2 = (ju0) mmr0Var.b;
                ji0 ji0Var = anf1Var.a;
                z1xVar.f181p = ji0Var != null ? new q1x(anf1Var, ju0Var2) : null;
                if (ji0Var != null) {
                    bpb1 bpb1Var3 = z1xVar.j;
                    Boolean bool2 = Boolean.TRUE;
                    bpb1 bpb1Var4 = bpb1Var3;
                    bpb1Var4.getClass();
                    bpb1Var4.m((Object) null, bool2);
                    d1x.b(z1xVar.f, 7, anf1Var.a, (Map) null, (String) null, 12);
                    z1xVar.e.a(iwo0.a);
                }
                break;
        }
        return rih1Var;
    }
}
