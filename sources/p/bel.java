package p;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import retrofit2.HttpException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class bel {
    public final qfl a;

    public bel(qfl qflVar) {
        this.a = qflVar;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: retrofit2.HttpException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Serializable a(onm onmVar) throws HttpException {
        ael aelVar;
        String str;
        if (onmVar instanceof ael) {
            aelVar = (ael) onmVar;
            int i = aelVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                aelVar.c = i - Integer.MIN_VALUE;
            } else {
                aelVar = new ael(this, onmVar);
            }
        } else {
            aelVar = new ael(this, onmVar);
        }
        Object objA = aelVar.a;
        int i2 = aelVar.c;
        if (i2 == 0) {
            hm5.M(objA);
            aelVar.c = 1;
            objA = this.a.a("personal_podcasts", aelVar);
            d9n d9nVar = d9n.a;
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
        sy21 sy21Var = (sy21) objA;
        if (!sy21Var.a.Q0) {
            throw new HttpException(sy21Var);
        }
        Object obj = sy21Var.b;
        if (obj == null) {
            hhg1.n("Response body is null for successful get connector apps response");
            return null;
        }
        List<ycl> list = ((mfl) obj).a;
        ArrayList arrayList = new ArrayList(q7h.U(list, 10));
        for (ycl yclVar : list) {
            String str2 = yclVar.a;
            String str3 = yclVar.b;
            String str4 = yclVar.c;
            if (str4 == null) {
                str4 = "";
                str = str4;
            } else {
                str = "";
            }
            String str5 = yclVar.d;
            boolean z = yclVar.e;
            String str6 = yclVar.f;
            if (str6 != null) {
                str = str6;
            }
            arrayList.add(new vcl(str2, str3, str4, str5, str, yclVar.g, z, yclVar.h));
        }
        return arrayList;
    }
}
