package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class mbz extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public boolean b;
    public final /* synthetic */ lgy c;
    public final /* synthetic */ String d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mbz(lgy lgyVar, String str, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = lgyVar;
        this.d = str;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        String str = this.d;
        lgy lgyVar = this.c;
        switch (b) {
            case 0:
                return new mbz(lgyVar, str, lnmVar, (byte) 0);
            default:
                return new mbz(lgyVar, str, lnmVar, (byte) 1);
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
        llg m231Var;
        ccz m231Var2;
        byte b = this.a;
        lgy lgyVar = this.c;
        d9n d9nVar = d9n.a;
        String str = this.d;
        switch (b) {
            case 0:
                boolean z = this.b;
                try {
                    if (z) {
                        if (z) {
                            hm5.M(obj);
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    dc31 dc31Var = (dc31) lgyVar.g;
                    this.b = true;
                    obj = dc31Var.n(str, this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    m231Var = (llg) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                Throwable thA = e331.a(m231Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                if (!(m231Var instanceof m231)) {
                    return m231Var;
                }
                return null;
            default:
                boolean z2 = this.b;
                try {
                    if (z2) {
                        if (z2) {
                            hm5.M(obj);
                        } else {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                        }
                        return null;
                    }
                    hm5.M(obj);
                    yzu yzuVar = (yzu) lgyVar.b;
                    this.b = true;
                    obj = smo1.s(new oov(yzuVar, str, null), this);
                    if (obj == d9nVar) {
                        return d9nVar;
                    }
                    m231Var2 = (ccz) obj;
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                Throwable thA2 = e331.a(m231Var2);
                if (thA2 != null && !(thA2 instanceof TimeoutCancellationException) && (thA2 instanceof CancellationException)) {
                    throw thA2;
                }
                if (m231Var2 instanceof m231) {
                    m231Var2 = null;
                }
                ccz cczVar = m231Var2;
                if (cczVar != null) {
                    return cczVar;
                }
                bhn0.f("Cannot build episode share metadata without episode metadata. Uri: ".concat(str));
                return null;
        }
    }
}
