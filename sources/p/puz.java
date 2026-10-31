package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class puz implements yu30 {
    public final ruz a;

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public Object a(onm onmVar) {
        q631 q631Var;
        if (onmVar instanceof q631) {
            q631Var = (q631) onmVar;
            int i = q631Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                q631Var.c = i - Integer.MIN_VALUE;
            } else {
                q631Var = new q631(this, onmVar);
            }
        } else {
            q631Var = new q631(this, onmVar);
        }
        Object objJ = q631Var.a;
        int i2 = q631Var.c;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleA = this.a.a(new g9u0("listening-activity", false));
                q631Var.c = 1;
                objJ = fc11.j(singleA, q631Var);
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
            objJ.getClass();
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.d("ResumeHandler", new Object[]{l1d.m("Resume failed: ", th.getMessage())});
        }
        return rih1.a;
    }

    public Object apply(Object obj) {
        return this.a.f(((m9u0) obj).a);
    }
}
