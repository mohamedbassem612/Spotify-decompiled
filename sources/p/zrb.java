package p;

import java.util.ArrayList;
import java.util.HashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class zrb implements vr20 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ vr20 b;
    public final /* synthetic */ drb c;

    public /* synthetic */ zrb(vr20 vr20Var, drb drbVar, byte b) {
        this.a = b;
        this.b = vr20Var;
        this.c = drbVar;
    }

    /* JADX WARN: Code duplicated, block: B:24:0x005f  */
    /* JADX WARN: Code duplicated, block: B:9:0x0024  */
    public final Object emit(Object obj, lnm lnmVar) {
        yrb yrbVar;
        fsb fsbVar;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        drb drbVar = this.c;
        vr20 vr20Var = this.b;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                if (lnmVar instanceof yrb) {
                    yrbVar = (yrb) lnmVar;
                    int i = yrbVar.b;
                    if ((i & Integer.MIN_VALUE) != 0) {
                        yrbVar.b = i - Integer.MIN_VALUE;
                    } else {
                        yrbVar = new yrb(this, lnmVar);
                    }
                } else {
                    yrbVar = new yrb(this, lnmVar);
                }
                Object obj2 = yrbVar.a;
                int i2 = yrbVar.b;
                if (i2 != 0) {
                    if (i2 == 1) {
                        hm5.M(obj2);
                        return rih1Var;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj2);
                rrb rrbVar = (rrb) obj;
                int i3 = msb.b;
                c380 c380Var = rrbVar.b;
                HashSet hashSet = new HashSet();
                ArrayList arrayList = new ArrayList();
                for (Object obj3 : c380Var) {
                    if (hashSet.add(((crb) obj3).getId())) {
                        arrayList.add(obj3);
                    }
                }
                c380 c380VarA = mqo1.A(arrayList);
                boolean z = rrbVar.a;
                rrb rrbVar2 = new rrb(rrbVar.c, c380VarA, z);
                if (c380VarA.isEmpty() && !z) {
                    rrbVar2 = null;
                }
                ta0 ta0Var = rrbVar2 != null ? new ta0(drbVar.v(), rrbVar2, drbVar) : null;
                yrbVar.b = 1;
                return vr20Var.emit(ta0Var, yrbVar) == d9nVar ? d9nVar : rih1Var;
            default:
                if (lnmVar instanceof fsb) {
                    fsbVar = (fsb) lnmVar;
                    int i4 = fsbVar.b;
                    if ((i4 & Integer.MIN_VALUE) != 0) {
                        fsbVar.b = i4 - Integer.MIN_VALUE;
                    } else {
                        fsbVar = new fsb(this, lnmVar);
                    }
                } else {
                    fsbVar = new fsb(this, lnmVar);
                }
                Object obj4 = fsbVar.a;
                int i5 = fsbVar.b;
                if (i5 == 0) {
                    hm5.M(obj4);
                    mmr0 mmr0Var = new mmr0(drbVar, (vrb) obj);
                    fsbVar.b = 1;
                    return vr20Var.emit(mmr0Var, fsbVar) == d9nVar ? d9nVar : rih1Var;
                }
                if (i5 == 1) {
                    hm5.M(obj4);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
        }
    }
}
