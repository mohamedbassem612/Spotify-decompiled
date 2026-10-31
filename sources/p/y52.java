package p;

import com.spotify.core.coreimpl.ApplicationScopeConfiguration;
import com.spotify.mobius.Connection;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Scheduler;
import java.lang.reflect.Type;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final /* synthetic */ class y52 extends tv30 implements Function0 {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public y52(Object obj, byte b) {
        super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
        this.a = b;
        switch (b) {
            case 9:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 14:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            case 18:
                super(0, obj, kly0.class, "get", "get()Ljava/lang/Object;", 0);
                break;
            default:
                break;
        }
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i;
        Type typeL;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return (o62) ((kly0) this.receiver).get();
            case 1:
                return Boolean.valueOf(((haa) this.receiver).i1());
            case 2:
                return ((eub0) this.receiver).b.getValue();
            case 3:
                ((Connection) this.receiver).dispose();
                return rih1Var;
            case 4:
                return (rqd) ((kly0) this.receiver).get();
            case 5:
                return (ApplicationScopeConfiguration) ((kly0) this.receiver).get();
            case 6:
                return (String) ((kly0) this.receiver).get();
            case 7:
                return (y610) ((kly0) this.receiver).get();
            case 8:
                return (Set) ((kly0) this.receiver).get();
            case 9:
                return (a3e) ((kly0) this.receiver).get();
            case 10:
                return (q8n) ((kly0) this.receiver).get();
            case 11:
                return (dlq) ((kly0) this.receiver).get();
            case 12:
                return (luk) ((kly0) this.receiver).get();
            case 13:
                return (np60) ((kly0) this.receiver).get();
            case 14:
                return (Flowable) ((kly0) this.receiver).get();
            case 15:
                return (yqg) ((kly0) this.receiver).get();
            case 16:
                return (Scheduler) ((kly0) this.receiver).get();
            case 17:
                return (Scheduler) ((kly0) this.receiver).get();
            case 18:
                return (vco0) ((kly0) this.receiver).get();
            case 19:
                ((lzn0) this.receiver).e();
                return rih1Var;
            case 20:
                dc11 dc11Var = (dc11) this.receiver;
                List parameters = dc11Var.getParameters();
                int size = (dc11Var.isSuspend() ? 1 : 0) + parameters.size();
                List<hc11> list = parameters;
                if ((list instanceof Collection) && list.isEmpty()) {
                    i = 0;
                } else {
                    i = 0;
                    for (hc11 hc11Var : list) {
                        if (hc11Var.s() == 4 || hc11Var.s() == 2) {
                            i++;
                            if (i < 0) {
                                p7h.S();
                                throw null;
                            }
                        }
                    }
                }
                int i2 = (i + 31) / 32;
                Object[] objArr = new Object[size + i2 + 1];
                for (hc11 hc11Var2 : list) {
                    if (hc11Var2.w() && !bpi1.h(hc11Var2.t())) {
                        int iN = hc11Var2.n();
                        b7 b7VarT = hc11Var2.t();
                        if (!(b7VarT instanceof b7) || (typeL = b7VarT.l()) == null) {
                            typeL = j2h1.l(b7VarT, false);
                        }
                        objArr[iN] = bpi1.e(typeL);
                    } else if (hc11Var2.x()) {
                        objArr[hc11Var2.n()] = fc11.w(hc11Var2.t());
                    }
                }
                for (int i3 = 0; i3 < i2; i3++) {
                    objArr[size + i3] = 0;
                }
                return objArr;
            case 21:
                en31 en31Var = (en31) this.receiver;
                llm llmVar = en31Var.a;
                if (llmVar == null) {
                    u890.C("coroutineScope");
                    throw null;
                }
                smo1.q(llmVar);
                en31Var.h();
                vgr vgrVar = en31Var.e;
                if (vgrVar != null) {
                    vgrVar.i();
                    return rih1Var;
                }
                u890.C("connectionManager");
                throw null;
            default:
                ((y3u) this.receiver).b();
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y52(int i, Object obj, Class cls, String str, String str2, int i2, byte b) {
        super(i, obj, cls, str, str2, i2);
        this.a = b;
    }
}
