package p;

import android.content.Context;
import android.os.Handler;
import java.lang.ref.WeakReference;
import java.util.function.IntConsumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class xo00 {
    public final WeakReference a;
    public final vo00 b;
    public final /* synthetic */ yo00 c;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [java.util.function.IntConsumer, p.vo00] */
    public xo00(yo00 yo00Var, Context context) {
        this.c = yo00Var;
        this.a = new WeakReference(context);
        ?? r0 = new IntConsumer() { // from class: p.vo00
            @Override // java.util.function.IntConsumer
            public final void accept(int i) {
                yo00 yo00Var2 = this.a.c;
                if (yo00Var2.m0) {
                    return;
                }
                yo00Var2.B1(1, 19, Integer.valueOf(i));
            }
        };
        this.b = r0;
        context.registerDeviceIdChangeListener(new wo00(yo00Var.v.a(yo00Var.t, (Handler.Callback) null), (byte) 0), r0);
    }

    public final void a() {
        Context context = (Context) this.a.get();
        if (context == null) {
            return;
        }
        context.unregisterDeviceIdChangeListener(this.b);
    }
}
