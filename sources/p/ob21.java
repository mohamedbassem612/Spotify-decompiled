package p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ob21 {
    public final n2b0 a;
    public final lzn0 b;
    public final z710 c;
    public final kt91 d;
    public final Resources e;
    public final q8n f;
    public final q8n g;

    public ob21(n2b0 n2b0Var, lzn0 lzn0Var, z710 z710Var, kt91 kt91Var, Resources resources, q8n q8nVar, q8n q8nVar2) {
        this.a = n2b0Var;
        this.b = lzn0Var;
        this.c = z710Var;
        this.d = kt91Var;
        this.e = resources;
        this.f = q8nVar;
        this.g = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) {
        nb21 nb21Var;
        if (onmVar instanceof nb21) {
            nb21Var = (nb21) onmVar;
            int i = nb21Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                nb21Var.c = i - Integer.MIN_VALUE;
            } else {
                nb21Var = new nb21(this, onmVar);
            }
        } else {
            nb21Var = new nb21(this, onmVar);
        }
        Object obj = nb21Var.a;
        int i2 = nb21Var.c;
        rih1 m231Var = rih1.a;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                n2b0 n2b0Var = this.a;
                nb21Var.c = 1;
                Object objB = n2b0Var.a.b(str, nb21Var);
                d9n d9nVar = d9n.a;
                if (objB != d9nVar) {
                    objB = m231Var;
                }
                if (objB == d9nVar) {
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
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        return e331.a(m231Var) == null ? tb21.a : sb21.a;
    }
}
