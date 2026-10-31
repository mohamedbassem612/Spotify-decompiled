package p;

import android.net.Uri;
import androidx.media3.common.PriorityTaskManager$PriorityTooLowException;
import java.io.IOException;
import java.util.Collections;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class pjx0 implements l3v {
    public final Executor a;
    public final n3r b;
    public final xpc c;
    public final usc d;
    public vxu e;
    public volatile ojx0 f;
    public volatile boolean g;

    public pjx0(yoh0 yoh0Var, wpc wpcVar, Executor executor, long j, long j2) {
        executor.getClass();
        this.a = executor;
        soh0 soh0Var = yoh0Var.b;
        soh0Var.getClass();
        Map map = Collections.EMPTY_MAP;
        Uri uri = soh0Var.a;
        String str = soh0Var.f;
        dm5.s(uri, "The uri must be set.");
        n3r n3rVar = new n3r(uri, 0L, 1, null, map, j, j2, str, 4, null);
        this.b = n3rVar;
        k2r k2rVar = wpcVar.e;
        xpc xpcVarA = wpcVar.a(k2rVar != null ? k2rVar.j() : null, 1);
        this.c = xpcVarA;
        this.d = new usc(xpcVarA, n3rVar, null, new pjq0(this, (byte) 26));
    }

    @Override // p.l3v
    public final void cancel() {
        this.g = true;
        ojx0 ojx0Var = this.f;
        if (ojx0Var != null) {
            ojx0Var.cancel(true);
        }
    }

    @Override // p.l3v
    public final void d(vxu vxuVar) {
        this.e = vxuVar;
        boolean z = false;
        while (!z) {
            try {
                if (this.g) {
                    break;
                }
                this.f = new ojx0(this);
                this.a.execute(this.f);
                try {
                    this.f.get();
                    z = true;
                } catch (ExecutionException e) {
                    Throwable cause = e.getCause();
                    cause.getClass();
                    if (!(cause instanceof PriorityTaskManager$PriorityTooLowException)) {
                        if (cause instanceof IOException) {
                            throw ((IOException) cause);
                        }
                        String str = zoi1.a;
                        throw cause;
                    }
                }
            } catch (Throwable th) {
                ojx0 ojx0Var = this.f;
                ojx0Var.getClass();
                ojx0Var.a();
                throw th;
            }
        }
        ojx0 ojx0Var2 = this.f;
        ojx0Var2.getClass();
        ojx0Var2.a();
    }

    @Override // p.l3v
    public final void remove() {
        xpc xpcVar = this.c;
        xpcVar.a.k(xpcVar.e.a(this.b));
    }
}
