package p;

import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kqh0 implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ oqh0 c;

    public /* synthetic */ kqh0(vr20 vr20Var, oqh0 oqh0Var, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = oqh0Var;
    }

    /* JADX WARN: Code duplicated, block: B:37:0x0098  */
    /* JADX WARN: Code duplicated, block: B:9:0x0025  */
    public final Object emit(Object obj, lnm lnmVar) {
        jqh0 jqh0Var;
        nqh0 nqh0Var;
        jmo imoVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int streamMaxVolume = 0;
        oqh0 oqh0Var = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof jqh0) {
                    jqh0Var = (jqh0) lnmVar;
                    int i = jqh0Var.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        jqh0Var.b = i - Integer.MIN_VALUE;
                    } else {
                        jqh0Var = new jqh0(this, lnmVar);
                    }
                } else {
                    jqh0Var = new jqh0(this, lnmVar);
                }
                Object obj2 = jqh0Var.a;
                int i2 = jqh0Var.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                aqh0 aqh0Var = oqh0Var.g;
                aqh0Var.getClass();
                List<String> list = (List) obj;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                for (String str : list) {
                    tdh tdhVar = new tdh(0);
                    tdhVar.b(new pa61(str, Bundle.EMPTY));
                    tdhVar.f = aqh0Var.a.getString(2131954051);
                    tdhVar.d = 2131231483;
                    arrayList.add(tdhVar.a());
                }
                jqh0Var.b = 1;
                return vr20Var.emit(arrayList, jqh0Var) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof nqh0) {
                    nqh0Var = (nqh0) lnmVar;
                    int i3 = nqh0Var.b;
                    if ((i3 & Integer.MIN_VALUE) != 0) {
                        nqh0Var.b = i3 - Integer.MIN_VALUE;
                    } else {
                        nqh0Var = new nqh0(this, lnmVar);
                    }
                } else {
                    nqh0Var = new nqh0(this, lnmVar);
                }
                Object obj3 = nqh0Var.a;
                int i4 = nqh0Var.b;
                if (i4 == 0) {
                    hm5.M(obj3);
                    nb0 nb0Var = (nb0) obj;
                    if (nb0Var instanceof lb0) {
                        lb0 lb0Var = (lb0) nb0Var;
                        imoVar = new jmo(lb0Var.b, Integer.valueOf(lb0Var.a), lb0Var.c);
                    } else if ((nb0Var instanceof kb0) || (nb0Var instanceof mb0)) {
                        onr onrVar = oqh0Var.j;
                        int iD = onrVar.a.d();
                        try {
                            streamMaxVolume = onrVar.a.a.getStreamMaxVolume(3);
                            break;
                        } catch (NullPointerException unused) {
                        }
                        imoVar = new imo(iD, streamMaxVolume);
                    } else {
                        eg.o();
                    }
                    nqh0Var.b = 1;
                    return vr20Var.emit(imoVar, nqh0Var) == d9nVar ? d9nVar : rih1Var;
                }
                if (i4 == 1) {
                    hm5.M(obj3);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
