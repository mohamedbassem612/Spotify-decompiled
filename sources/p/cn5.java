package p;

import com.spotify.music.instrumentation.events.proto.AppFocusStateNonAuth;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class cn5 implements yy20 {
    public final t2j0 a;
    public final yqg b;
    public boolean c;
    public boolean d;

    public cn5(yqg yqgVar, t2j0 t2j0Var, t7h1 t7h1Var) {
        this.a = t2j0Var;
        this.b = yqgVar;
    }

    public final void a() {
        b("foreground");
        this.c = true;
    }

    public final void b(String str) {
        long jB = this.b.b();
        dn5 dn5VarN = AppFocusStateNonAuth.n();
        dn5VarN.n(str);
        dn5VarN.q(jB);
        this.a.a(dn5VarN.build());
    }

    public final void c() {
        b(this.d ? "background-playing" : "suspended");
        this.c = false;
    }
}
