package p;

import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class v2k extends a8d1 implements zu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ Set b;
    public /* synthetic */ Set c;
    public /* synthetic */ Set d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public v2k() {
        super(4, (lnm) null);
        this.a = (byte) 0;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = 4;
        Set set = (Set) obj;
        Set set2 = (Set) obj2;
        Set set3 = (Set) obj3;
        lnm lnmVar = (lnm) obj4;
        switch (b) {
            case 0:
                v2k v2kVar = new v2k(i, lnmVar, (byte) 0);
                v2kVar.b = set;
                v2kVar.c = set2;
                v2kVar.d = set3;
                return v2kVar.invokeSuspend(rih1Var);
            default:
                v2k v2kVar2 = new v2k(i, lnmVar, (byte) 1);
                v2kVar2.b = set;
                v2kVar2.c = set2;
                v2kVar2.d = set3;
                return v2kVar2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case 0:
                Set set = this.b;
                Set set2 = this.c;
                Set set3 = this.d;
                hm5.M(obj);
                return dm61.y0(dm61.y0(set, set2), set3);
            default:
                Set set4 = this.b;
                Set set5 = this.c;
                Set set6 = this.d;
                hm5.M(obj);
                return dm61.y0(dm61.y0(set4, set5), set6);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ v2k(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
