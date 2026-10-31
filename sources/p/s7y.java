package p;

import android.app.Activity;
import android.view.View;
import io.reactivex.rxjava3.core.Single;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class s7y implements xpw {
    public final Activity a;
    public final rmr b;
    public final kt91 c;
    public final zeu d;
    public final ljm0 e = h7w.D(x0y.N0, (bs50) null, (iu30) null, new j2i(-890490296, new sw1(this, (byte) 10), true), 6);
    public final ia00 f = n3o1.q(this).a(c9x.i, c9x.t);
    public final psw g;

    public s7y(Activity activity, rmr rmrVar, kt91 kt91Var, zeu zeuVar) {
        this.a = activity;
        this.b = rmrVar;
        this.c = kt91Var;
        this.d = zeuVar;
        j2i j2iVar = dmi.a;
        ien0 ien0Var = qsw.a;
        this.g = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.f;
    }

    public final jsw c() {
        return this.g;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object e(q7y q7yVar, onm onmVar) {
        r7y r7yVar;
        er91 er91Var;
        if (onmVar instanceof r7y) {
            r7yVar = (r7y) onmVar;
            int i = r7yVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                r7yVar.c = i - Integer.MIN_VALUE;
            } else {
                r7yVar = new r7y(this, onmVar);
            }
        } else {
            r7yVar = new r7y(this, onmVar);
        }
        Object objJ = r7yVar.a;
        int i2 = r7yVar.c;
        er91 er91Var2 = null;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                this.c.b();
                String str = q7yVar.h;
                Set set = s4b1.f;
                String strH = uic.x(str).h();
                Single singleA = ((h8y) this.b.b).a(new d8y(strH, q7yVar.f));
                r7yVar.c = 1;
                objJ = fc11.j(singleA, r7yVar);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objJ);
            }
            String str2 = ((g8y) objJ).a;
            if (str2.length() > 0) {
                er91Var = new er91((fs91) null, str2, (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
                er91Var2 = er91Var;
            }
        } catch (CancellationException e) {
            throw e;
        } catch (Exception unused) {
            er91Var = new er91((fs91) null, this.a.getString(2131956160), (Integer) null, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
        }
        zeu zeuVar = this.d;
        Function0 function0 = (Function0) zeuVar.c;
        if (er91Var2 != null) {
            ((x8c0) zeuVar.a).a(new zh0(zeuVar, er91Var2, (byte) 6));
            function0.invoke();
        } else {
            function0.invoke();
        }
        return rih1.a;
    }

    public final mqw getBehavior() {
        return this.e;
    }
}
