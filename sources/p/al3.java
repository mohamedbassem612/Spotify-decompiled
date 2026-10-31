package p;

import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class al3 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ List b;
    public /* synthetic */ List c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public al3() {
        super(3, (lnm) null);
        this.a = (byte) 0;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = 3;
        List list = (List) obj;
        List list2 = (List) obj2;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                al3 al3Var = new al3(b2, lnmVar, (byte) 0);
                al3Var.b = list;
                al3Var.c = list2;
                return al3Var.invokeSuspend(rih1Var);
            case 1:
                al3 al3Var2 = new al3(b2, lnmVar, (byte) 1);
                al3Var2.b = list;
                al3Var2.c = list2;
                return al3Var2.invokeSuspend(rih1Var);
            case 2:
                al3 al3Var3 = new al3(b2, lnmVar, (byte) 2);
                al3Var3.b = list;
                al3Var3.c = list2;
                return al3Var3.invokeSuspend(rih1Var);
            case 3:
                al3 al3Var4 = new al3(b2, lnmVar, b2);
                al3Var4.b = list;
                al3Var4.c = list2;
                return al3Var4.invokeSuspend(rih1Var);
            case 4:
                al3 al3Var5 = new al3(b2, lnmVar, (byte) 4);
                al3Var5.b = list;
                al3Var5.c = list2;
                return al3Var5.invokeSuspend(rih1Var);
            default:
                al3 al3Var6 = new al3(b2, lnmVar, (byte) 5);
                al3Var6.b = list;
                al3Var6.c = list2;
                return al3Var6.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                List list = this.b;
                List list2 = this.c;
                hm5.M(obj);
                return list2 == null ? list : list2;
            case 1:
                List list3 = this.b;
                List list4 = this.c;
                hm5.M(obj);
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : list4) {
                    if (hqq0.Y((l0l) obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return new mmr0(arrayList, list3);
            case 2:
                List list5 = this.b;
                List list6 = this.c;
                hm5.M(obj);
                return o7h.N0(list6, list5);
            case 3:
                List list7 = this.b;
                List list8 = this.c;
                hm5.M(obj);
                return o7h.N0(list8, list7);
            case 4:
                List list9 = this.b;
                List list10 = this.c;
                hm5.M(obj);
                return o7h.N0(list10, list9);
            default:
                List list11 = this.b;
                List list12 = this.c;
                hm5.M(obj);
                return new e8e0(list11, list12);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ al3(int i, lnm lnmVar, byte b) {
        super(i, lnmVar);
        this.a = b;
    }
}
