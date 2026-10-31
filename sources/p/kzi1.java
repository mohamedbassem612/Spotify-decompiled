package p;

import com.spotify.base.java.logging.Logger;
import java.io.IOException;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kzi1 {
    public final q8n a;
    public final q8n b;
    public final lzn0 c;
    public final z710 d;
    public final pvm0 e;
    public final kpe0 f;
    public final i6a1 g;
    public final boolean h;

    public kzi1(q8n q8nVar, q8n q8nVar2, lzn0 lzn0Var, z710 z710Var, pvm0 pvm0Var, kpe0 kpe0Var, i6a1 i6a1Var, nt4 nt4Var) {
        this.a = q8nVar;
        this.b = q8nVar2;
        this.c = lzn0Var;
        this.d = z710Var;
        this.e = pvm0Var;
        this.f = kpe0Var;
        this.g = i6a1Var;
        this.h = nt4Var.a();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v9 */
    public final Object a(onm onmVar) {
        jzi1 jzi1Var;
        if (onmVar instanceof jzi1) {
            jzi1Var = (jzi1) onmVar;
            int i = jzi1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                jzi1Var.c = i - Integer.MIN_VALUE;
            } else {
                jzi1Var = new jzi1(this, onmVar);
            }
        } else {
            jzi1Var = new jzi1(this, onmVar);
        }
        Object obj = jzi1Var.a;
        int i2 = jzi1Var.c;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                pvm0 pvm0Var = this.e;
                boolean z = this.h;
                jzi1Var.c = 1;
                Object objC = pvm0Var.c(z, jzi1Var);
                d9n d9nVar = d9n.a;
                this = objC;
                if (objC == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                hm5.M(obj);
                this = this;
            }
        } catch (IOException e) {
            Logger.e(e, "Failed to trigger QR verification notification", new Object[0]);
        } catch (CancellationException e2) {
            throw e2;
        } catch (Exception e3) {
            Logger.e(e3, "Failed to trigger QR verification notification", new Object[0]);
            this.g.a(e3);
        }
        return rih1.a;
    }
}
