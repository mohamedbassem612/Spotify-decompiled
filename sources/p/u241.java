package p;

import android.app.Activity;
import android.os.Handler;
import io.reactivex.rxjava3.core.SingleEmitter;
import io.reactivex.rxjava3.functions.Cancellable;
import java.util.ArrayList;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final /* synthetic */ class u241 implements Cancellable {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    public /* synthetic */ u241(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final void cancel() {
        switch (this.a) {
            case 0:
                nt21 nt21Var = (nt21) this.b;
                Activity activity = (Activity) this.c;
                if (((erw0) nt21Var.b) != null) {
                    x74.N(activity).execute(new v241(nt21Var, (byte) 0));
                    return;
                }
                return;
            case 1:
                vrv0 vrv0Var = (vrv0) this.b;
                ((ArrayList) vrv0Var.e).remove((SingleEmitter) this.c);
                return;
            default:
                oh61 oh61Var = (oh61) this.b;
                spq0 spq0Var = (spq0) this.c;
                if (spq0Var.c()) {
                    i090 i090Var = oh61Var.d;
                    h090 h090Var = (h090) spq0Var.b();
                    Handler handler = i090Var.a;
                    Objects.requireNonNull(h090Var);
                    handler.post(new gv40(h090Var, (byte) 4));
                    synchronized (i090Var.c) {
                        i090Var.c.remove(h090Var);
                        break;
                    }
                    return;
                }
                return;
        }
    }
}
