package p;

import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class i941 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Object b;
    public final /* synthetic */ ArrayList c;
    public final /* synthetic */ ek1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i941(ArrayList arrayList, ek1 ek1Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = arrayList;
        this.d = ek1Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ek1 ek1Var = this.d;
        ArrayList arrayList = this.c;
        switch (b) {
            case 0:
                i941 i941Var = new i941(arrayList, ek1Var, lnmVar, (byte) 0);
                i941Var.b = obj;
                return i941Var;
            default:
                i941 i941Var2 = new i941(arrayList, ek1Var, lnmVar, (byte) 1);
                i941Var2.b = obj;
                return i941Var2;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        c9n c9nVar = (c9n) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
            default:
                create(c9nVar, lnmVar).invokeSuspend(rih1Var);
                break;
        }
        return rih1Var;
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ek1 ek1Var = this.d;
        ArrayList arrayList = this.c;
        lnm lnmVar = null;
        c9n c9nVar = (c9n) this.b;
        switch (b) {
            case 0:
                hm5.M(obj);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new d821((Object) ek1Var, it.next(), lnmVar, (byte) 27), 3);
                }
                break;
            default:
                hm5.M(obj);
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    fn31.T(c9nVar, (o8n) null, 0, new d821((Object) ek1Var, it2.next(), lnmVar, (byte) 28), 3);
                }
                break;
        }
        return rih1Var;
    }
}
