package p;

import java.util.ArrayList;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class o9b {
    public final /* synthetic */ byte a;
    public final Object b;

    public /* synthetic */ o9b(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:33:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:9:0x0022  */
    public final Object a(onm onmVar) throws HttpException {
        n9b n9bVar;
        mgu0 mgu0Var;
        byte b = this.a;
        Object obj = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (onmVar instanceof n9b) {
                    n9bVar = (n9b) onmVar;
                    int i = n9bVar.c;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        n9bVar.c = i - Integer.MIN_VALUE;
                    } else {
                        n9bVar = new n9b(this, onmVar);
                    }
                } else {
                    n9bVar = new n9b(this, onmVar);
                }
                Object objA = n9bVar.a;
                int i2 = n9bVar.c;
                if (i2 == 0) {
                    hm5.M(objA);
                    n9bVar.c = 1;
                    objA = ((exc1) obj).a(n9bVar);
                    if (objA == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objA);
                }
                ArrayList<rpx0> arrayList = ((vsc1) objA).a;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                for (rpx0 rpx0Var : arrayList) {
                    String str = rpx0Var.b;
                    ArrayList<kpx0> arrayList3 = rpx0Var.c;
                    ArrayList arrayList4 = new ArrayList(q7h.U(arrayList3, 10));
                    for (kpx0 kpx0Var : arrayList3) {
                        arrayList4.add(new x67(kpx0Var.b, kpx0Var.c));
                    }
                    arrayList2.add(new w67(str, arrayList4));
                }
                return new y67(arrayList2);
            default:
                if (onmVar instanceof mgu0) {
                    mgu0Var = (mgu0) onmVar;
                    int i3 = mgu0Var.c;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        mgu0Var.c = i3 - Integer.MIN_VALUE;
                    } else {
                        mgu0Var = new mgu0(this, onmVar);
                    }
                } else {
                    mgu0Var = new mgu0(this, onmVar);
                }
                Object objD = mgu0Var.a;
                int i4 = mgu0Var.c;
                if (i4 == 0) {
                    hm5.M(objD);
                    mgu0Var.c = 1;
                    objD = ((h3y0) obj).d(mgu0Var);
                    if (objD == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i4 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(objD);
                }
                List<fwc1> list = ((gwc1) objD).a;
                ArrayList arrayList5 = new ArrayList(q7h.U(list, 10));
                for (fwc1 fwc1Var : list) {
                    String str2 = fwc1Var.a;
                    ArrayList<String> arrayList6 = fwc1Var.b;
                    ArrayList arrayList7 = new ArrayList(q7h.U(arrayList6, 10));
                    for (String str3 : arrayList6) {
                        arrayList7.add(new x67(str3, str3));
                    }
                    arrayList5.add(new w67(str2, arrayList7));
                }
                return new y67(arrayList5);
        }
    }
}
