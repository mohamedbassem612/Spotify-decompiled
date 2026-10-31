package p;

import java.util.concurrent.ThreadPoolExecutor;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class d4x extends who1 {
    public final /* synthetic */ who1 c;
    public final /* synthetic */ ThreadPoolExecutor d;

    public d4x(who1 who1Var, ThreadPoolExecutor threadPoolExecutor) {
        this.c = who1Var;
        this.d = threadPoolExecutor;
    }

    public final void v(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.c.v(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    public final void w(zsc zscVar) {
        ThreadPoolExecutor threadPoolExecutor = this.d;
        try {
            this.c.w(zscVar);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
