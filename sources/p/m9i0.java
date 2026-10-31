package p;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class m9i0 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public final /* synthetic */ String c;
    public final /* synthetic */ long d;
    public final /* synthetic */ long e;
    public /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9i0(long j, long j2, String str, String str2, String str3, lnm lnmVar, zrj1 zrj1Var) {
        super(2, lnmVar);
        this.f = zrj1Var;
        this.c = str;
        this.d = j;
        this.e = j2;
        this.g = str2;
        this.h = str3;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        switch (b) {
            case 0:
                m9i0 m9i0Var = new m9i0((List) obj3, (q9i0) obj2, this.d, this.e, this.c, lnmVar);
                m9i0Var.f = obj;
                return m9i0Var;
            default:
                zrj1 zrj1Var = (zrj1) this.f;
                return new m9i0(this.d, this.e, this.c, (String) obj3, (String) obj2, lnmVar, zrj1Var);
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

    public final Object invokeSuspend(Object obj) throws Throwable {
        Boolean m231Var;
        Object objJ;
        byte b = this.a;
        Object obj2 = this.h;
        Object obj3 = this.g;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                c9n c9nVar = (c9n) this.f;
                boolean z = this.b;
                if (z) {
                    if (z) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                List list = (List) obj3;
                q9i0 q9i0Var = (q9i0) obj2;
                ArrayList arrayList = new ArrayList(q7h.U(list, 10));
                int i = 0;
                for (Object obj4 : list) {
                    int i2 = i + 1;
                    if (i < 0) {
                        p7h.T();
                        throw null;
                    }
                    arrayList.add(fn31.q(c9nVar, (q8n) q9i0Var.h.getValue(), 0, new l9i0(i, this.d, this.e, q9i0Var, this.c, (String) obj4, null), 2));
                    i = i2;
                }
                this.f = null;
                this.b = true;
                Object objU = o1p1.u(arrayList, this);
                return objU == d9nVar ? d9nVar : objU;
            default:
                zrj1 zrj1Var = (zrj1) this.f;
                boolean z2 = this.b;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        String str = this.c;
                        long j = this.d;
                        long j2 = this.e;
                        fna fnaVar = (fna) zrj1Var.c;
                        this.b = true;
                        objJ = fnaVar.j(str, j, j2, this);
                        if (objJ == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                        objJ = obj;
                    }
                    m231Var = (Boolean) objJ;
                    m231Var.getClass();
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                String str2 = (String) obj3;
                String str3 = (String) obj2;
                Throwable thA2 = e331.a(m231Var);
                if (thA2 != null) {
                    ((ltf1) zrj1Var.d).g(this.c, str2, 104, "VideoSharingPolicy error checking clip shareable for: ".concat(str3), thA2);
                }
                return m231Var instanceof m231 ? Boolean.FALSE : m231Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9i0(List list, q9i0 q9i0Var, long j, long j2, String str, lnm lnmVar) {
        super(2, lnmVar);
        this.g = list;
        this.h = q9i0Var;
        this.d = j;
        this.e = j2;
        this.c = str;
    }
}
