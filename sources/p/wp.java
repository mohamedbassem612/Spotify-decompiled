package p;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class wp extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iq b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wp(iq iqVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.b = iqVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new wp(this.b, lnmVar, (byte) 0);
            default:
                return new wp(this.b, lnmVar, (byte) 1);
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
        iq iqVar = this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                List<lw> listC = iqVar.c();
                ArrayList arrayList = new ArrayList(q7h.U(listC, 10));
                for (lw lwVar : listC) {
                    arrayList.add(new ev(lwVar.b().a, lwVar.d(), lwVar.e(), lwVar.c(), lwVar.h(), lwVar.f()));
                }
                return o7h.a1(arrayList, new hq((byte) 0));
            default:
                hm5.M(obj);
                return iqVar.b();
        }
    }
}
