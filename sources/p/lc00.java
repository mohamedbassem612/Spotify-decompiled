package p;

import android.content.Context;
import com.spotify.eventsender.eventsender.EventSenderDatabase;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class lc00 implements xb00 {
    public volatile adn0 N;
    public volatile boolean O;
    public final i5w0 a;
    public final i5w0 b;
    public final q8n c;
    public final nfa0 d;
    public final Context e;
    public final idd1 f;
    public final idd1 g;
    public final idd1 h;
    public final idd1 i = new idd1(new gc00(this, (byte) 22));
    public final idd1 j = new idd1(new gc00(this, (byte) 1));
    public final idd1 k = new idd1(new gc00(this, (byte) 8));
    public final idd1 l = new idd1(new gc00(this, (byte) 21));
    public final idd1 m = new idd1(new gc00(this, (byte) 15));
    public final idd1 n = new idd1(new gc00(this, (byte) 10));
    public final idd1 o = new idd1(new gc00(this, (byte) 3));

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final idd1 f67p = new idd1(new gc00(this, (byte) 0));
    public final idd1 q = new idd1(new gc00(this, (byte) 16));
    public final idd1 r = new idd1(new gc00(this, (byte) 19));
    public final idd1 s = new idd1(new gc00(this, (byte) 25));
    public final idd1 t = new idd1(new gc00(this, (byte) 26));
    public final idd1 u = new idd1(new gc00(this, (byte) 6));
    public final idd1 v = new idd1(new gc00(this, (byte) 13));
    public final idd1 w = new idd1(new gc00(this, (byte) 9));
    public final idd1 x = new idd1(new gc00(this, (byte) 7));
    public final idd1 y = new idd1(new gc00(this, (byte) 23));
    public final idd1 z = new idd1(new gc00(this, (byte) 24));
    public final idd1 A = new idd1(oxx.W0);
    public final idd1 B = new idd1(new gc00(this, (byte) 27));
    public final idd1 C = new idd1(new gc00(this, (byte) 4));
    public final idd1 D = new idd1(new gc00(this, (byte) 17));
    public final idd1 E = new idd1(new gc00(this, (byte) 5));
    public final idd1 F = new idd1(new gc00(this, (byte) 20));
    public final idd1 G = new idd1(oxx.V0);
    public final vob0 H = new vob0(new idd1(new gc00(this, (byte) 11)));
    public final idd1 I = new idd1(new gc00(this, (byte) 2));
    public final idd1 J = new idd1(new gc00(this, (byte) 14));
    public final ic00 K = new ic00(this, (byte) 1);
    public final idd1 L = new idd1(new gc00(this, (byte) 12));
    public final idd1 M = new idd1(new gc00(this, (byte) 18));

    public lc00(Context context, lbp lbpVar, lbp lbpVar2, kly0 kly0Var, i5w0 i5w0Var, i5w0 i5w0Var2, i5w0 i5w0Var3, q8n q8nVar, nfa0 nfa0Var) {
        this.a = i5w0Var;
        this.b = i5w0Var2;
        this.c = q8nVar;
        this.d = nfa0Var;
        this.e = context.getApplicationContext();
        this.f = new idd1(new pd3(lbpVar, (byte) 5));
        this.g = new idd1(new pd3(lbpVar2, (byte) 4));
        this.h = new idd1(new pd3(kly0Var, (byte) 3));
        ((uc00) i5w0Var3.a).getClass();
    }

    public final EventSenderDatabase a() {
        return (EventSenderDatabase) this.o.getValue();
    }

    public final tks0 b() {
        return (tks0) this.L.getValue();
    }

    public final adn0 c() {
        adn0 adn0Var = this.N;
        return adn0Var == null ? (adn0) this.M.getValue() : adn0Var;
    }

    public final rc00 d() {
        return (rc00) this.A.getValue();
    }

    public final zq4 e() {
        return (zq4) this.i.getValue();
    }

    public final cv41 f() {
        return (cv41) this.g.getValue();
    }
}
