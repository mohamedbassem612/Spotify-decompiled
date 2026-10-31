package p;

import android.util.Log;
import java.util.concurrent.Callable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class hhn implements Callable {
    public final /* synthetic */ long a;
    public final /* synthetic */ Throwable b;
    public final /* synthetic */ Thread c;
    public final /* synthetic */ s880 d;
    public final /* synthetic */ jhn e;

    public hhn(jhn jhnVar, long j, Throwable th, Thread thread, s880 s880Var) {
        this.e = jhnVar;
        this.a = j;
        this.b = th;
        this.c = thread;
        this.d = s880Var;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() {
        long j = this.a;
        long j2 = j / 1000;
        jhn jhnVar = this.e;
        String strE = jhnVar.e();
        if (strE == null) {
            return o0c.z((Object) null);
        }
        jhnVar.c.j();
        bh61 bh61Var = jhnVar.m;
        Log.isLoggable("FirebaseCrashlytics", 2);
        bh61Var.j(this.b, this.c, strE, "crash", j2, true);
        jhnVar.c(j);
        s880 s880Var = this.d;
        jhnVar.a(false, s880Var, false);
        jhnVar.b(new fic().a, Boolean.FALSE);
        return !jhnVar.b.f() ? o0c.z((Object) null) : s880Var.k().k((djn) jhnVar.e.b, new a0m(this, strE));
    }
}
