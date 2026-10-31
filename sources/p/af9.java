package p;

import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class af9 {
    public final xg9 a;
    public final se9 b;
    public final ni9 c;
    public final yqg d;
    public final Scheduler e;
    public final it8 f;
    public final ConcurrentHashMap g = new ConcurrentHashMap();

    public af9(xg9 xg9Var, se9 se9Var, ni9 ni9Var, yqg yqgVar, Scheduler scheduler, it8 it8Var) {
        this.a = xg9Var;
        this.b = se9Var;
        this.c = ni9Var;
        this.d = yqgVar;
        this.e = scheduler;
        this.f = it8Var;
    }
}
