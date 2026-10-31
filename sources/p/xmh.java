package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.rx3.RxConnectables;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class xmh implements xpw {
    public final boolean N0;
    public final vjh O0;
    public final kp5 P0;
    public ogh R0;
    public final Connectable S0;
    public final psw W0;
    public final s6p X;
    public final String Y;
    public final lik1 Z;
    public final yqg a;
    public final hwe1 b;
    public final cwe1 c;
    public final xjh d;
    public final f4q e;
    public final x6p f;
    public final tjh g;
    public final jqh h;
    public final bqh i;
    public final fo4 t;
    public final bbc Q0 = mno1.a(-2, 0, 6);
    public final vmh T0 = new vmh(this, (byte) 1);
    public final idd1 U0 = new idd1(new vjh(this, (byte) 1));
    public final ia00 V0 = n3o1.q(this).a(a8h.d, new zee(this, (byte) 19));

    public xmh(yqg yqgVar, hwe1 hwe1Var, cwe1 cwe1Var, xjh xjhVar, f4q f4qVar, tnh tnhVar, o6p o6pVar, x6p x6pVar, tjh tjhVar, jqh jqhVar, bqh bqhVar, fo4 fo4Var, s6p s6pVar, String str, lik1 lik1Var, boolean z, vjh vjhVar) {
        this.a = yqgVar;
        this.b = hwe1Var;
        this.c = cwe1Var;
        this.d = xjhVar;
        this.e = f4qVar;
        this.f = x6pVar;
        this.g = tjhVar;
        this.h = jqhVar;
        this.i = bqhVar;
        this.t = fo4Var;
        this.X = s6pVar;
        this.Y = str;
        this.Z = lik1Var;
        this.N0 = z;
        this.O0 = vjhVar;
        this.P0 = o6pVar.a(new PublishSubject());
        this.S0 = RxConnectables.a(tnhVar.a(new dg8(this, (byte) 26), lik1Var, str));
        j2i j2iVar = new j2i(1632144931, new rxg(this, (byte) 7), true);
        ien0 ien0Var = qsw.a;
        this.W0 = new psw(j2iVar, (byte) 0);
    }

    public final rqw a() {
        return this.V0;
    }

    public final jsw c() {
        return this.W0;
    }

    public final mqw getBehavior() {
        return (mqw) this.U0.getValue();
    }
}
