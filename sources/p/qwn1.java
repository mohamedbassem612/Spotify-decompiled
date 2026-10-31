package p;

import com.google.android.recaptcha.internal.zzhm;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qwn1 extends a8d1 implements vu30 {
    public boolean a;
    public /* synthetic */ Object b;
    public final /* synthetic */ tmc0 c;
    public final /* synthetic */ String d;
    public final /* synthetic */ zwo1 e;
    public final /* synthetic */ sln1 f;
    public final /* synthetic */ long g;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qwn1(tmc0 tmc0Var, String str, zwo1 zwo1Var, sln1 sln1Var, long j, lnm lnmVar) {
        super(2, lnmVar);
        this.c = tmc0Var;
        this.d = str;
        this.e = zwo1Var;
        this.f = sln1Var;
        this.g = j;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        qwn1 qwn1Var = new qwn1(this.c, this.d, this.e, this.f, this.g, lnmVar);
        qwn1Var.b = obj;
        return qwn1Var;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1.a);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.recaptcha.internal.zzhm */
    public final Object invokeSuspend(Object obj) throws zzhm {
        boolean z = this.a;
        hm5.M(obj);
        if (!z) {
            c9n c9nVar = (c9n) this.b;
            List list = this.c.a;
            ArrayList arrayList = new ArrayList();
            for (Object obj2 : list) {
                if (((cwn1) obj2).a) {
                    arrayList.add(obj2);
                }
            }
            if (arrayList.isEmpty()) {
                throw new zzhm(tgo1.c, ij81.U0, (String) null, (Exception) null);
            }
            ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                arrayList2.add(c921.q(c9nVar, (o8n) null, 0, new lwn1(this.e, (cwn1) it.next(), this.d, this.f, this.g, null, (byte) 0), 3));
            }
            this.a = true;
            obj = o1p1.u(arrayList2, this);
            d9n d9nVar = d9n.a;
            if (obj == d9nVar) {
                return d9nVar;
            }
        }
        kmn1 kmn1VarX = pmn1.x();
        kmn1VarX.h(this.d);
        Iterator it2 = ((List) obj).iterator();
        while (it2.hasNext()) {
            Object obj3 = ((e331) it2.next()).a;
            if (!(obj3 instanceof m231)) {
                kmn1VarX.g((pmn1) obj3);
            }
        }
        return kmn1VarX.e();
    }
}
