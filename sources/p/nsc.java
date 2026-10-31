package p;

import com.spotify.base.java.logging.Logger;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nsc extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 0;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ k9 d;
    public final /* synthetic */ ArrayList e;
    public final /* synthetic */ ksc f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc(ArrayList arrayList, k9 k9Var, ksc kscVar, lnm lnmVar) {
        super(2, lnmVar);
        this.e = arrayList;
        this.d = k9Var;
        this.f = kscVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        ksc kscVar = this.f;
        ArrayList arrayList = this.e;
        k9 k9Var = this.d;
        switch (b) {
            case 0:
                nsc nscVar = new nsc(arrayList, k9Var, kscVar, lnmVar);
                nscVar.c = obj;
                return nscVar;
            default:
                nsc nscVar2 = new nsc(k9Var, arrayList, kscVar, lnmVar);
                nscVar2.c = obj;
                return nscVar2;
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
        Object objU;
        List m231Var;
        Object objM;
        byte b = this.a;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.c;
                boolean z = this.b;
                if (!z) {
                    hm5.M(obj);
                    ArrayList<mmr0> arrayList = this.e;
                    ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                    for (mmr0 mmr0Var : arrayList) {
                        int iIntValue = ((Number) mmr0Var.a).intValue();
                        arrayList2.add(fn31.q(c9nVar, (o8n) null, 0, new fe6(this.d, (vjh0) mmr0Var.b, iIntValue, this.f, (lnm) null, (byte) 3), 3));
                    }
                    this.c = null;
                    this.b = true;
                    objU = o1p1.u(arrayList2, this);
                    if (objU == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (!z) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                    objU = obj;
                }
                return o7h.o0((Iterable) objU);
            default:
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        sxa sxaVar = new sxa(this.d, this.e, this.f, (lnm) null, (byte) 11);
                        this.c = null;
                        this.b = true;
                        objM = rc2.M(50L, sxaVar, this);
                        if (objM == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objM = obj;
                    }
                    m231Var = (List) objM;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null) {
                    Logger.d(i3a.j("Error while checking cached formats: ", thA), new Object[0]);
                }
                if (m231Var instanceof m231) {
                    return null;
                }
                return m231Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nsc(k9 k9Var, ArrayList arrayList, ksc kscVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = k9Var;
        this.e = arrayList;
        this.f = kscVar;
    }
}
