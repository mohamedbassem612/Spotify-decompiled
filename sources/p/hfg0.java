package p;

import android.content.res.Resources;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class hfg0 {
    public final n2b0 a;
    public final lzn0 b;
    public final kt91 c;
    public final Resources d;
    public final q8n e;
    public final q8n f;

    public hfg0(Resources resources, q8n q8nVar, q8n q8nVar2, n2b0 n2b0Var, lzn0 lzn0Var, kt91 kt91Var) {
        this.a = n2b0Var;
        this.b = lzn0Var;
        this.c = kt91Var;
        this.d = resources;
        this.e = q8nVar;
        this.f = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object a(String str, ibg0 ibg0Var, w5k1 w5k1Var, Function0 function0, onm onmVar) {
        gfg0 gfg0Var;
        w5k1 w5k1Var2;
        w5k1 w5k1Var3;
        if (onmVar instanceof gfg0) {
            gfg0Var = (gfg0) onmVar;
            int i = gfg0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                gfg0Var.d = i - Integer.MIN_VALUE;
            } else {
                gfg0Var = new gfg0(this, onmVar);
            }
        } else {
            gfg0Var = new gfg0(this, onmVar);
        }
        Object obj = gfg0Var.b;
        int i2 = gfg0Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                try {
                    n2b0 n2b0Var = this.a;
                    tk tkVar = new tk((Boolean) null, (Boolean) null, (gjj1) function0.invoke(), (Boolean) null, (Boolean) null, (Boolean) null, (Boolean) null, 123);
                    w5k1Var2 = w5k1Var;
                    try {
                        gfg0Var.a = w5k1Var2;
                        gfg0Var.d = 1;
                        Object objB = n2b0Var.b(str, ibg0Var, tkVar, gfg0Var);
                        d9n d9nVar = d9n.a;
                        if (objB == d9nVar) {
                            return d9nVar;
                        }
                        w5k1Var3 = w5k1Var2;
                    } catch (Exception unused) {
                        return new jfg0(w5k1Var2, false);
                    }
                } catch (Exception unused2) {
                    w5k1Var2 = w5k1Var;
                }
            } else {
                if (i2 != 1) {
                    eg.m("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                w5k1Var3 = gfg0Var.a;
                try {
                    hm5.M(obj);
                } catch (Exception unused3) {
                    w5k1Var2 = w5k1Var3;
                    return new jfg0(w5k1Var2, false);
                }
            }
            return new jfg0(w5k1Var3, true);
        } catch (CancellationException e) {
            throw e;
        }
    }
}
