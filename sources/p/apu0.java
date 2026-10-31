package p;

import com.spotify.playlist.policy.proto.CollaboratingUsersDecorationPolicy;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class apu0 extends a8d1 implements xu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public /* synthetic */ vr20 c;
    public /* synthetic */ Object d;
    public final /* synthetic */ bpu0 e;
    public final /* synthetic */ String f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ apu0(lnm lnmVar, bpu0 bpu0Var, String str, byte b) {
        super(3, lnmVar);
        this.a = b;
        this.e = bpu0Var;
        this.f = str;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.f;
        bpu0 bpu0Var = this.e;
        vr20 vr20Var = (vr20) obj;
        lnm lnmVar = (lnm) obj3;
        switch (b) {
            case 0:
                apu0 apu0Var = new apu0(lnmVar, bpu0Var, str, (byte) 0);
                apu0Var.c = vr20Var;
                apu0Var.d = obj2;
                return apu0Var.invokeSuspend(rih1Var);
            default:
                apu0 apu0Var2 = new apu0(lnmVar, bpu0Var, str, (byte) 1);
                apu0Var2.c = vr20Var;
                apu0Var2.d = obj2;
                return apu0Var2.invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        boolean z;
        huz z4t0Var;
        jge huzVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        byte b2 = 0;
        lnm lnmVar = null;
        switch (b) {
            case 0:
                vr20 vr20Var = this.c;
                Object obj2 = this.d;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                oqc0 oqc0Var = (oqc0) obj2;
                List list = oqc0Var.c;
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : list) {
                    if (!((nqc0) obj3).b) {
                        arrayList.add(obj3);
                    }
                }
                int iS = zno1.s(q7h.U(arrayList, 10));
                if (iS < 16) {
                    iS = 16;
                }
                LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    x4i1 x4i1Var = ((nqc0) it.next()).a;
                    linkedHashMap.put(x4i1Var.b, x4i1Var.a);
                }
                boolean zIsEmpty = linkedHashMap.isEmpty();
                bpu0 bpu0Var = this.e;
                lnm lnmVar2 = null;
                if (zIsEmpty) {
                    z4t0Var = new huz(b7x.a, (byte) 10);
                    z = true;
                } else {
                    ArrayList arrayList2 = new ArrayList(linkedHashMap.size());
                    for (Map.Entry entry : linkedHashMap.entrySet()) {
                        String str = (String) entry.getKey();
                        String str2 = (String) entry.getValue();
                        arrayList2.add(new lt20(new ht20(hu20.c(yoi1.g(bpu0Var.b.b().map(new njp1(str, (byte) 9))), new lm9(str2, (lnm) null, (byte) 5)), new ts4(str2, null, (byte) 2)), new rd0(str2, (lnm) null, (byte) 3), (byte) 0));
                    }
                    z = true;
                    z4t0Var = new z4t0((mr20[]) o7h.l1(arrayList2).toArray(new mr20[0]), (byte) 1);
                }
                jge jgeVarC = hu20.c(z4t0Var, new c6h0((Object) bpu0Var, (Object) this.f, (Object) oqc0Var, lnmVar2, (byte) 11));
                this.c = null;
                this.d = null;
                this.b = z;
                return l4p1.s(vr20Var, jgeVarC, this) == d9nVar ? d9nVar : rih1Var;
            default:
                vr20 vr20Var2 = this.c;
                Object obj4 = this.d;
                boolean z3 = this.b;
                if (z3) {
                    if (z3) {
                        hm5.M(obj);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                iqi0 iqi0Var = (iqi0) obj4;
                if (iqi0Var.e == wls0.f) {
                    bpu0 bpu0Var2 = this.e;
                    rsc0 rsc0Var = bpu0Var2.a;
                    CollaboratingUsersDecorationPolicy collaboratingUsersDecorationPolicy = bpu0Var2.c;
                    String str3 = this.f;
                    huzVar = hu20.e(rqt0.u(hu20.c(rsc0Var.l(str3, collaboratingUsersDecorationPolicy), new zio0(2, (lnm) null, (byte) 11))), new apu0(lnmVar, bpu0Var2, str3, b2));
                } else {
                    huzVar = new huz(iqi0Var, (byte) 10);
                }
                this.c = null;
                this.d = null;
                this.b = true;
                return l4p1.s(vr20Var2, huzVar, this) == d9nVar ? d9nVar : rih1Var;
        }
    }
}
