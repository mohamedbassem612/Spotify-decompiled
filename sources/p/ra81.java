package p;

import com.spotify.base.java.logging.Logger;
import io.reactivex.rxjava3.core.Single;
import java.util.concurrent.CancellationException;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class ra81 {
    public final /* synthetic */ uu00 a;

    public ra81(uu00 uu00Var) {
        this.a = uu00Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        qa81 qa81Var;
        io70 io70Var;
        if (onmVar instanceof qa81) {
            qa81Var = (qa81) onmVar;
            int i = qa81Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                qa81Var.d = i - Integer.MIN_VALUE;
            } else {
                qa81Var = new qa81(this, onmVar);
            }
        } else {
            qa81Var = new qa81(this, onmVar);
        }
        Object objJ = qa81Var.b;
        int i2 = qa81Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objJ);
                Single singleFirstOrError = this.a.b(new oi("cn-context-player", new pg61(str, (byte) 18))).timeout(3L, TimeUnit.SECONDS).firstOrError();
                qa81Var.a = str;
                qa81Var.d = 1;
                objJ = fc11.j(singleFirstOrError, qa81Var);
                d9n d9nVar = d9n.a;
                if (objJ == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = qa81Var.a;
                hm5.M(objJ);
            }
            jo70 jo70Var = ((uv00) objJ).a(jo70.class, str).b;
            if (jo70Var == null || (io70Var = jo70Var.e) == null) {
                return null;
            }
            return io70Var.b;
        } catch (CancellationException e) {
            throw e;
        } catch (Throwable th) {
            Logger.d("ShowUriResolver", new Object[]{th, l1d.m("Failed to resolve show URI for episode=", str)});
            return null;
        }
    }
}
