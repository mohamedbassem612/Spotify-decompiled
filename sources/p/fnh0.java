package p;

import android.os.Build;
import android.os.Handler;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class fnh0 {
    public final mw7 a;
    public final Handler b;
    public final jnh0 c;
    public final boolean d;
    public final CopyOnWriteArrayList e;
    public final yfu f;
    public final w2z g;
    public final lw7 h;

    public fnh0(mw7 mw7Var, Handler handler, jnh0 jnh0Var, boolean z) {
        this.a = mw7Var;
        this.b = handler;
        this.c = jnh0Var;
        this.d = z;
        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        this.e = copyOnWriteArrayList;
        yfu yfuVar = new yfu((byte) 13);
        this.f = yfuVar;
        this.g = new w2z((byte) 24);
        ux20 ux20Var = new ux20(yfuVar, handler, copyOnWriteArrayList);
        this.h = Build.VERSION.SDK_INT < 26 ? new sx20(jnh0Var, ux20Var) : ux20Var;
    }
}
