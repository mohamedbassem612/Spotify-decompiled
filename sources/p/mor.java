package p;

import java.util.LinkedHashMap;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class mor extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public xgn0 b;
    public qor c;
    public zg91 d;
    public boolean e;
    public final /* synthetic */ qor f;
    public final /* synthetic */ zg91 g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mor(qor qorVar, zg91 zg91Var, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.f = qorVar;
        this.g = zg91Var;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        zg91 zg91Var = this.g;
        qor qorVar = this.f;
        switch (b) {
            case 0:
                return new mor(qorVar, zg91Var, lnmVar, (byte) 0);
            default:
                return new mor(qorVar, zg91Var, lnmVar, (byte) 1);
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
        xgn0 xgn0Var;
        xgn0 xgn0Var2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zg91 zg91Var = this.g;
        qor qorVar = this.f;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                boolean z = this.e;
                if (!z) {
                    hm5.M(obj);
                    xgn0 xgn0Var3 = qorVar.k;
                    this.b = xgn0Var3;
                    this.c = qorVar;
                    this.d = zg91Var;
                    this.e = true;
                    if (xgn0Var3.a(this) == d9nVar) {
                        return d9nVar;
                    }
                    xgn0Var = xgn0Var3;
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zg91Var = this.d;
                    qorVar = this.c;
                    xgn0Var = this.b;
                    hm5.M(obj);
                }
                try {
                    LinkedHashMap linkedHashMap = qorVar.j;
                    Integer num = (Integer) linkedHashMap.get(zg91Var);
                    linkedHashMap.put(zg91Var, new Integer((num != null ? num.intValue() : 0) + 1));
                    bpb1 bpb1Var = qorVar.i;
                    Boolean boolValueOf = Boolean.valueOf(!linkedHashMap.isEmpty());
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, boolValueOf);
                    Objects.toString(zg91Var);
                    Objects.toString(linkedHashMap);
                    return rih1Var;
                } finally {
                    xgn0Var.c((Object) null);
                }
            default:
                boolean z2 = this.e;
                if (!z2) {
                    hm5.M(obj);
                    xgn0 xgn0Var4 = qorVar.k;
                    this.b = xgn0Var4;
                    this.c = qorVar;
                    this.d = zg91Var;
                    this.e = true;
                    if (xgn0Var4.a(this) == d9nVar) {
                        return d9nVar;
                    }
                    xgn0Var2 = xgn0Var4;
                } else {
                    if (!z2) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    zg91Var = this.d;
                    qorVar = this.c;
                    xgn0Var2 = this.b;
                    hm5.M(obj);
                }
                try {
                    LinkedHashMap linkedHashMap2 = qorVar.j;
                    Integer num2 = (Integer) linkedHashMap2.get(zg91Var);
                    int iIntValue = num2 != null ? num2.intValue() : 0;
                    if (iIntValue <= 1) {
                        snb1 snb1Var = (snb1) qorVar.g.getValue();
                        if (snb1Var != null) {
                            qorVar.a(snb1Var.e, kub1.Z);
                        }
                        linkedHashMap2.remove(zg91Var);
                    } else {
                        linkedHashMap2.put(zg91Var, new Integer(iIntValue - 1));
                    }
                    bpb1 bpb1Var2 = qorVar.i;
                    Boolean boolValueOf2 = Boolean.valueOf(!linkedHashMap2.isEmpty());
                    bpb1Var2.getClass();
                    bpb1Var2.m((Object) null, boolValueOf2);
                    Objects.toString(zg91Var);
                    Objects.toString(linkedHashMap2);
                    return rih1Var;
                } finally {
                    xgn0Var2.c((Object) null);
                }
        }
    }
}
