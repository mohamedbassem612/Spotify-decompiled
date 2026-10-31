package p;

import android.content.Context;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ohn {
    public final Context a;
    public final p68 b;
    public final rok0 c;
    public final long d;
    public ham e;
    public ham f;
    public boolean g;
    public jhn h;
    public final dm70 i;
    public final d520 j;
    public final pz3 k;
    public final pz3 l;
    public final ghn m;
    public final vhn n;
    public final tz01 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final uo5 f84p;

    public ohn(wi20 wi20Var, dm70 dm70Var, vhn vhnVar, p68 p68Var, pz3 pz3Var, pz3 pz3Var2, d520 d520Var, ghn ghnVar, tz01 tz01Var, uo5 uo5Var) {
        this.b = p68Var;
        wi20Var.a();
        this.a = wi20Var.a;
        this.i = dm70Var;
        this.n = vhnVar;
        this.k = pz3Var;
        this.l = pz3Var2;
        this.j = d520Var;
        this.m = ghnVar;
        this.o = tz01Var;
        this.f84p = uo5Var;
        this.d = System.currentTimeMillis();
        this.c = new rok0((byte) 23);
    }

    public final void a(s880 s880Var) {
        uo5.t();
        uo5.t();
        this.e.j();
        ws10 ws10Var = ws10.Z;
        ws10Var.g();
        try {
            try {
                this.k.c(new nhn(this));
                this.h.h();
                if (!s880Var.l().b.a) {
                    ws10Var.c();
                    throw new RuntimeException("Collection of crash reports disabled in Crashlytics settings.");
                }
                if (!this.h.d(s880Var)) {
                    ws10Var.j();
                }
                this.h.i(s880Var.k());
                c();
            } catch (Exception unused) {
                ws10Var.d();
                c();
            }
        } catch (Throwable th) {
            c();
            throw th;
        }
    }

    public final void b(s880 s880Var) {
        Future<?> futureSubmit = ((djn) this.f84p.b).a.submit((Runnable) new khn(this, s880Var, (byte) 1));
        ws10 ws10Var = ws10.Z;
        ws10Var.c();
        try {
            futureSubmit.get(3L, TimeUnit.SECONDS);
        } catch (InterruptedException unused) {
            ws10Var.d();
            Thread.currentThread().interrupt();
        } catch (ExecutionException unused2) {
            ws10Var.d();
        } catch (TimeoutException unused3) {
            ws10Var.d();
        }
    }

    public final void c() {
        ws10 ws10Var = ws10.Z;
        uo5.t();
        try {
            if (this.e.p()) {
                return;
            }
            ws10Var.j();
        } catch (Exception unused) {
            ws10Var.d();
        }
    }

    public final void d(String str, String str2) {
        ((djn) this.f84p.b).a(new c45(this, str, str2, (byte) 7));
    }
}
