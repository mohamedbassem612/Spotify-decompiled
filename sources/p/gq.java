package p;

import android.content.SharedPreferences;
import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes15.dex */
public final class gq extends a8d1 implements vu30 {
    public final /* synthetic */ byte a = 1;
    public boolean b;
    public /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(iq iqVar, s2t s2tVar, lnm lnmVar) {
        super(2, lnmVar);
        this.c = iqVar;
        this.d = s2tVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.d;
        switch (b) {
            case 0:
                return new gq((iq) this.c, (s2t) obj2, lnmVar);
            default:
                gq gqVar = new gq((cs) obj2, lnmVar);
                gqVar.c = obj;
                return gqVar;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                return create((List) obj, (lnm) obj2).invokeSuspend(rih1Var);
        }
    }

    public final Object invokeSuspend(Object obj) {
        byte b = this.a;
        Object obj2 = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                iq iqVar = (iq) this.c;
                boolean z = this.b;
                try {
                    if (!z) {
                        hm5.M(obj);
                        long j = iqVar.e;
                        fq fqVar = new fq((s2t) obj2, (lnm) null);
                        this.b = true;
                        obj = rc2.M(j, fqVar, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        hm5.M(obj);
                    }
                    return (SharedPreferences) obj;
                } catch (TimeoutCancellationException unused) {
                    Logger.k("sharedPreferencesThreadSafe timed out after " + iqVar.e + "ms", new Object[0]);
                }
                break;
            default:
                List list = (List) this.c;
                boolean z2 = this.b;
                if (z2) {
                    if (z2) {
                        hm5.M(obj);
                        return obj;
                    }
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                Single singleM = ((cs) obj2).m(list);
                this.c = null;
                this.b = true;
                Object objJ = fc11.j(singleM, this);
                return objJ == d9nVar ? d9nVar : objJ;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public gq(cs csVar, lnm lnmVar) {
        super(2, lnmVar);
        this.d = csVar;
    }
}
