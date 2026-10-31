package p;

import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class n4s {
    public final mr20 a;
    public volatile wv90 b = vv90.a;

    public n4s(mr20 mr20Var) {
        this.a = mr20Var;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(onm onmVar) {
        m4s m4sVar;
        vv90 vv90Var = vv90.a;
        if (onmVar instanceof m4s) {
            m4sVar = (m4s) onmVar;
            int i = m4sVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                m4sVar.c = i - Integer.MIN_VALUE;
            } else {
                m4sVar = new m4s(this, onmVar);
            }
        } else {
            m4sVar = new m4s(this, onmVar);
        }
        Object obj = m4sVar.a;
        d9n d9nVar = d9n.a;
        int i2 = m4sVar.c;
        try {
            try {
                if (i2 == 0) {
                    hm5.M(obj);
                    this.b = vv90Var;
                    mr20 mr20Var = this.a;
                    skr skrVar = new skr(this, (byte) 9);
                    m4sVar.c = 1;
                    if (mr20Var.collect(skrVar, m4sVar) == d9nVar) {
                        return d9nVar;
                    }
                } else {
                    if (i2 != 1) {
                        eg.m("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    hm5.M(obj);
                }
            } catch (CancellationException e) {
                throw e;
            } catch (Exception unused) {
                this.b = vv90Var;
            }
            this.b = vv90Var;
            return rih1.a;
        } catch (Throwable th) {
            this.b = vv90Var;
            throw th;
        }
    }
}
