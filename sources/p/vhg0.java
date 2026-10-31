package p;

import com.spotify.connectivity.httpretrofit.RetrofitMaker;
import com.spotify.core.http.CronetRuntime;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class vhg0 implements f961 {
    public final xf01 a;
    public final CronetRuntime b;
    public final n4f0 c;
    public final n680 d;
    public final yyp0 e;
    public final RetrofitMaker f;

    static {
        new mhc((byte) 15);
    }

    public vhg0(xf01 xf01Var, i8b0 i8b0Var, Scheduler scheduler, kmn0 kmn0Var, CronetRuntime cronetRuntime, n4f0 n4f0Var, kly0 kly0Var) {
        this.a = xf01Var;
        this.b = cronetRuntime;
        this.c = n4f0Var;
        n680 n680Var = new n680();
        this.d = n680Var;
        avw0 avw0Var = new avw0((byte) 16);
        d520 d520Var = kmn0Var.d;
        azp0 azp0Var = null;
        if (d520Var == null) {
            u890.C("accessTokenClient");
            throw null;
        }
        o4c o4cVar = new o4c(avw0Var, d520Var);
        w5b1 w5b1Var = (w5b1) kly0Var.get();
        zyp0 zyp0VarB = w5b1Var.b.b();
        ArrayList arrayList = zyp0VarB.c;
        Iterator it = arrayList.iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            } else if (fkl1.class.isInstance((p090) it.next())) {
                break;
            } else {
                i++;
            }
        }
        if (i >= 0) {
            arrayList.set(i, o4cVar);
            azp0Var = new azp0(zyp0VarB);
        } else {
            bhn0.f(f4i1.f("Expected interceptor ", fkl1.class.getSimpleName(), " not found"));
        }
        w5b1Var.e.a(n680Var);
        w5b1Var.f.a(n680Var);
        yyp0 yyp0VarA = new yyp0(azp0Var).a(n680Var);
        this.e = yyp0VarA;
        this.f = new RetrofitMaker(o0c.J(yyp0VarA.c(), "spclient.wg.spotify.com", i8b0Var, scheduler), (l270) yyp0VarA, (jc31) yz10.Z);
    }

    public final void shutdown() {
        this.d.c();
        Function0 uhg0Var = new uhg0(this, (byte) 0);
        n4f0 n4f0Var = this.c;
        n4f0Var.b(uhg0Var);
        n4f0Var.b(new uhg0(this, (byte) 1));
    }

    public final Object getApi() {
        return this;
    }
}
