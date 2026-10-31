package p;

import android.content.Context;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class emo1 {
    public static final pue0 j = new pue0("ClientCastAnalytics", null);
    public static boolean k = true;
    public final wf61 a;
    public final ytn1 b;
    public final son1 c;
    public Long e;
    public iog1 g;
    public jvn1 h;
    public int i = 1;
    public final String d = UUID.randomUUID().toString();
    public final ExecutorService f = Executors.unconfigurableExecutorService(Executors.newCachedThreadPool());

    public emo1(Context context, pxo1 pxo1Var, wf61 wf61Var, ytn1 ytn1Var, son1 son1Var) {
        this.a = wf61Var;
        this.b = ytn1Var;
        this.c = son1Var;
    }

    public final void a(t4p1 t4p1Var, int i) {
        this.f.execute(new tbo1(this, t4p1Var, i));
    }
}
