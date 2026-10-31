package p;

import java.util.Collections;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class k0x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ r0x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k0x(r0x r0xVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = r0xVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        r0x r0xVar = this.b;
        switch (b) {
            case 0:
                return new k0x(r0xVar, lnmVar, (byte) 0);
            default:
                return new k0x(r0xVar, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create(obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create((px0) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        r0x r0xVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Object objR0 = o7h.r0(((LinkedHashMap) r0xVar.i).values());
                if (objR0 != null) {
                    return Collections.singletonList(objR0);
                }
                hhg1.n("No advertisement has been loaded. Did you remember to call prepare()?");
                return null;
            default:
                hm5.M(obj);
                ji0 ji0Var = (ji0) r0xVar.j;
                if (ji0Var != null) {
                    ((xn0) r0xVar.f).a(new or0(((ay0) r0xVar.d).a.a, ji0Var.t, ji0Var.a));
                }
                return rih1.a;
        }
    }
}
