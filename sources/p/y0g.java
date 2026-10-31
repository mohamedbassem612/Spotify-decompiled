package p;

import android.content.Context;
import android.net.Uri;
import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class y0g {
    public final Context a;
    public final iwe0 b;
    public final kg0 c;
    public final pbk1 d;
    public final w0g e;
    public final a1g f;
    public final dwr0 g;
    public final llm h;

    public y0g(Context context, iwe0 iwe0Var, kg0 kg0Var, pbk1 pbk1Var, w0g w0gVar, a1g a1gVar, dwr0 dwr0Var, q8n q8nVar) {
        this.a = context;
        this.b = iwe0Var;
        this.c = kg0Var;
        this.d = pbk1Var;
        this.e = w0gVar;
        this.f = a1gVar;
        this.g = dwr0Var;
        this.h = cy30.t(q8nVar);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, onm onmVar) {
        x0g x0gVar;
        Context context = this.a;
        if (onmVar instanceof x0g) {
            x0gVar = (x0g) onmVar;
            int i = x0gVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                x0gVar.c = i - Integer.MIN_VALUE;
            } else {
                x0gVar = new x0g(this, onmVar);
            }
        } else {
            x0gVar = new x0g(this, onmVar);
        }
        Object objA = x0gVar.a;
        int i2 = x0gVar.c;
        try {
            if (i2 == 0) {
                hm5.M(objA);
                this.f.a();
                w0g w0gVar = this.e;
                x0gVar.c = 1;
                objA = w0gVar.a(str, x0gVar);
                d9n d9nVar = d9n.a;
                if (objA == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(objA);
            }
            jv8 jv8Var = (jv8) objA;
            dwr0 dwr0Var = this.g;
            String strB = jv8Var.b();
            String strA = jv8Var.a();
            dwr0Var.getClass();
            Uri uri = Uri.parse("https://accounts.spotify.com/login/ott/music#username=" + strB + "&token=" + strA + "&flow=parental_consent");
            iwe0 iwe0Var = this.b;
            i2i1 i2i1VarA = this.d.a(context, "spotify:home");
            i2i1VarA.c();
            context.startActivity(iwe0.c(iwe0Var, context, i2i1VarA.b(), uri, 116));
        } catch (CancellationException e) {
            throw e;
        } catch (Exception e2) {
            Logger.d(l1d.m("Failed to login transitioned account: ", e2.getMessage()), new Object[0]);
            this.c.d(new ckt(3), true);
        }
        return rih1.a;
    }
}
