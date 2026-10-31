package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.TimeoutException;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class rfh1 implements nfh1 {
    public final m111 a;
    public final hlr b;
    public final mr20 c;
    public final q8n d;
    public final boolean e;

    public rfh1(m111 m111Var, hlr hlrVar, mr20 mr20Var, q8n q8nVar, boolean z) {
        this.a = m111Var;
        this.b = hlrVar;
        this.c = mr20Var;
        this.d = q8nVar;
        this.e = z;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        ofh1 ofh1Var;
        if (onmVar instanceof ofh1) {
            ofh1Var = (ofh1) onmVar;
            int i = ofh1Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                ofh1Var.d = i - Integer.MIN_VALUE;
            } else {
                ofh1Var = new ofh1(this, onmVar);
            }
        } else {
            ofh1Var = new ofh1(this, onmVar);
        }
        Object objN = ofh1Var.b;
        int i2 = ofh1Var.d;
        try {
            if (i2 == 0) {
                hm5.M(objN);
                long jB = tfh1.b();
                b0f1 b0f1Var = new b0f1(this, (lnm) null, (byte) 18);
                ofh1Var.a = str;
                ofh1Var.d = 1;
                objN = rc2.N(jB, b0f1Var, ofh1Var);
                d9n d9nVar = d9n.a;
                if (objN == d9nVar) {
                    return d9nVar;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                str = ofh1Var.a;
                hm5.M(objN);
            }
            return (aap0) objN;
        } catch (TimeoutCancellationException e) {
            Logger.l(e, "Unauthenticated properties timed out, using defaults", new Object[0]);
            this.b.c(str, new TimeoutException(e.getMessage()));
            return tfh1.a();
        }
    }
}
