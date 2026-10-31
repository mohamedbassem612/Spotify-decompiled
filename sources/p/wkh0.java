package p;

import android.os.Looper;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final /* synthetic */ class wkh0 implements Executor {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ wkh0(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        byte b = this.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                zoi1.c0(((xkh0) obj).e, runnable);
                break;
            case 1:
                ((tph0) obj).a(runnable);
                break;
            case 2:
                zoi1.c0(((yqh0) obj).c, runnable);
                break;
            case 3:
                ((fzh0) obj).y(runnable);
                break;
            case 4:
                ((e0i0) obj).i(runnable);
                break;
            case 5:
                zoi1.c0(((f1i0) obj).b.l, runnable);
                break;
            case 6:
                ((h2i0) obj).d1(runnable);
                break;
            default:
                wdd1 wdd1Var = ((vv81) obj).d;
                if (wdd1Var.a.getLooper() != Looper.myLooper()) {
                    wdd1Var.f(runnable);
                } else {
                    runnable.run();
                }
                break;
        }
    }
}
