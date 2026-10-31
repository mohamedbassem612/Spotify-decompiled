package p;

import java.util.concurrent.CancellationException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class nq71 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public tq71 b;
    public boolean c;
    public final /* synthetic */ tq71 d;
    public final /* synthetic */ il71 e;
    public final /* synthetic */ String f;
    public final /* synthetic */ z771 g;
    public final /* synthetic */ exy h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nq71(tq71 tq71Var, il71 il71Var, String str, z771 z771Var, exy exyVar, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.d = tq71Var;
        this.e = il71Var;
        this.f = str;
        this.g = z771Var;
        this.h = exyVar;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        switch (this.a) {
            case 0:
                return new nq71(this.d, this.e, this.f, this.g, this.h, lnmVar, (byte) 0);
            default:
                return new nq71(this.d, this.e, this.f, this.g, this.h, lnmVar, (byte) 1);
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        jl71 jl71Var = (jl71) obj;
        lnm lnmVar = (lnm) obj2;
        switch (b) {
            case 0:
                break;
        }
        return create(jl71Var, lnmVar).invokeSuspend(rih1Var);
    }

    public final Object invokeSuspend(Object obj) throws Throwable {
        jq71 m231Var;
        jq71 m231Var2;
        byte b = this.a;
        il71 il71Var = this.e;
        exy exyVar = this.h;
        tq71 tq71Var = this.d;
        d9n d9nVar = d9n.a;
        switch (b) {
            case 0:
                String strC = null;
                boolean z = this.c;
                try {
                    if (!z) {
                        hm5.M(obj);
                        String str = this.f;
                        z771 z771Var = this.g;
                        r961 r961Var = tq71Var.b;
                        int i = exyVar.c;
                        if (i != 0) {
                            strC = h4b1.c(i);
                        }
                        iq71 iq71Var = new iq71(str, z771Var, strC, null, 8);
                        this.b = tq71Var;
                        this.c = true;
                        obj = r961Var.m(iq71Var, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tq71Var = this.b;
                        hm5.M(obj);
                    }
                    m231Var = (jq71) obj;
                    break;
                } catch (Throwable th) {
                    m231Var = new m231(th);
                }
                jq71 jq71Var = m231Var;
                Throwable thA = e331.a(jq71Var);
                if (thA != null && !(thA instanceof TimeoutCancellationException) && (thA instanceof CancellationException)) {
                    throw thA;
                }
                tq71Var.getClass();
                tq71.e(jq71Var, il71Var, "fetching_playlist_sticker");
                hm5.M(jq71Var);
                return jq71Var;
            default:
                boolean z2 = this.c;
                try {
                    if (!z2) {
                        hm5.M(obj);
                        String str2 = this.f;
                        z771 z771Var2 = this.g;
                        r961 r961Var2 = tq71Var.b;
                        String strC2 = null;
                        int i2 = exyVar.c;
                        if (i2 != 0) {
                            strC2 = h4b1.c(i2);
                        }
                        iq71 iq71Var2 = new iq71(str2, z771Var2, strC2, null, 8);
                        this.b = tq71Var;
                        this.c = true;
                        obj = r961Var2.m(iq71Var2, this);
                        if (obj == d9nVar) {
                            return d9nVar;
                        }
                    } else {
                        if (!z2) {
                            eg.m("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        tq71Var = this.b;
                        hm5.M(obj);
                    }
                    m231Var2 = (jq71) obj;
                    break;
                } catch (Throwable th2) {
                    m231Var2 = new m231(th2);
                }
                jq71 jq71Var2 = m231Var2;
                Throwable thA2 = e331.a(jq71Var2);
                if (thA2 != null && !(thA2 instanceof TimeoutCancellationException) && (thA2 instanceof CancellationException)) {
                    throw thA2;
                }
                tq71Var.getClass();
                tq71.e(jq71Var2, il71Var, "fetching_playlist_sticker");
                hm5.M(jq71Var2);
                return jq71Var2;
        }
    }
}
