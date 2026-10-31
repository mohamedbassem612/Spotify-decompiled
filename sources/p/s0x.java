package p;

import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class s0x extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vgr b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ s0x(vgr vgrVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = vgrVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        vgr vgrVar = this.b;
        switch (b) {
            case 0:
                return new s0x(vgrVar, lnmVar, (byte) 0);
            default:
                return new s0x(vgrVar, lnmVar, (byte) 1);
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
        vgr vgrVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Object objR0 = o7h.r0(((LinkedHashMap) vgrVar.h).values());
                if (objR0 != null) {
                    return objR0;
                }
                hhg1.n("No advertisement has been loaded. Did you remember to call prepare()?");
                return null;
            default:
                hm5.M(obj);
                List list = (List) o7h.r0(((LinkedHashMap) vgrVar.h).values());
                ji0 ji0Var = list != null ? (ji0) o7h.s0(list) : null;
                if (ji0Var != null) {
                    ((xn0) vgrVar.f).a(new or0(((ay0) vgrVar.d).a.a, ji0Var.t, ji0Var.a));
                }
                return rih1.a;
        }
    }
}
