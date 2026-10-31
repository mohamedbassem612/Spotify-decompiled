package p;

import com.spotify.base.java.logging.Logger;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kpe0 {
    public final lzn0 a;
    public final lre0 b;
    public final i6a1 c;
    public final q8n d;
    public final q8n e;
    public final AtomicBoolean f = new AtomicBoolean(false);

    public kpe0(lzn0 lzn0Var, lre0 lre0Var, i6a1 i6a1Var, q8n q8nVar, q8n q8nVar2) {
        this.a = lzn0Var;
        this.b = lre0Var;
        this.c = i6a1Var;
        this.d = q8nVar;
        this.e = q8nVar2;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Function0 function0, onm onmVar) {
        jpe0 jpe0Var;
        if (onmVar instanceof jpe0) {
            jpe0Var = (jpe0) onmVar;
            int i = jpe0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                jpe0Var.d = i - Integer.MIN_VALUE;
            } else {
                jpe0Var = new jpe0(this, onmVar);
            }
        } else {
            jpe0Var = new jpe0(this, onmVar);
        }
        Object objY = jpe0Var.b;
        int i2 = jpe0Var.d;
        rih1 rih1Var = rih1.a;
        AtomicBoolean atomicBoolean = this.f;
        d9n d9nVar = d9n.a;
        try {
            if (i2 == 0) {
                hm5.M(objY);
                if (!atomicBoolean.compareAndSet(false, true)) {
                    return rih1Var;
                }
                q8n q8nVar = this.d;
                p6d0 p6d0Var = new p6d0(this, (lnm) null, (byte) 11);
                jpe0Var.a = function0;
                jpe0Var.d = 1;
                objY = fn31.Y(q8nVar, p6d0Var, jpe0Var);
                if (objY == d9nVar) {
                }
            }
            if (i2 != 1) {
                if (i2 == 2) {
                    hm5.M(objY);
                    return objY;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            function0 = jpe0Var.a;
            hm5.M(objY);
            az80 az80Var = new az80(function0, this, (dwn0) objY, (lnm) null);
            jpe0Var.a = null;
            jpe0Var.d = 2;
            Object objY2 = fn31.Y(this.e, az80Var, jpe0Var);
            return objY2 == d9nVar ? d9nVar : objY2;
        } catch (CancellationException e) {
            atomicBoolean.set(false);
            throw e;
        } catch (Exception e2) {
            Logger.e(e2, "Failed to resolve the lock state page", new Object[0]);
            atomicBoolean.set(false);
            return rih1Var;
        }
    }
}
