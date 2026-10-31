package p;

import io.reactivex.rxjava3.core.Observable;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class js6 {
    public final b0a0 a;
    public final ov20 b;
    public final xvo c;
    public final ms6 d;
    public final rh11 e;
    public final sb40 f;
    public final zxm1 g;
    public final uu00 h;
    public final c9c0 i;
    public final a4q0 j;
    public final m5q k;
    public final boolean l;
    public final a7a1 m;
    public final gmt n;
    public final o860 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final dh30 f31p;

    public js6(b0a0 b0a0Var, ov20 ov20Var, xvo xvoVar, ms6 ms6Var, rh11 rh11Var, sb40 sb40Var, zxm1 zxm1Var, uu00 uu00Var, c9c0 c9c0Var, a4q0 a4q0Var, m5q m5qVar, boolean z, a7a1 a7a1Var, gmt gmtVar, o860 o860Var, dh30 dh30Var) {
        this.a = b0a0Var;
        this.b = ov20Var;
        this.c = xvoVar;
        this.d = ms6Var;
        this.e = rh11Var;
        this.f = sb40Var;
        this.g = zxm1Var;
        this.h = uu00Var;
        this.i = c9c0Var;
        this.j = a4q0Var;
        this.k = m5qVar;
        this.l = z;
        this.m = a7a1Var;
        this.n = gmtVar;
        this.o = o860Var;
        this.f31p = dh30Var;
    }

    public final Observable a(fm6 fm6Var) {
        return rqt0.F(o6x.a, new k96(this, fm6Var, (lnm) null, (byte) 3)).toObservable();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object b(String str, onm onmVar) {
        is6 is6Var;
        if (onmVar instanceof is6) {
            is6Var = (is6) onmVar;
            int i = is6Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                is6Var.d = i - Integer.MIN_VALUE;
            } else {
                is6Var = new is6(this, onmVar);
            }
        } else {
            is6Var = new is6(this, onmVar);
        }
        Object objJ = is6Var.b;
        int i2 = is6Var.d;
        if (i2 == 0) {
            hm5.M(objJ);
            oi oiVar = new oi("artist_menu_builder", false, new xg6(this, str, (byte) 10));
            if (((ArrayList) oiVar.d).isEmpty()) {
                return new bs6(null);
            }
            ezc ezcVarG = yoi1.g(this.h.b(oiVar));
            s4 s4Var = new s4(2, (lnm) null, (byte) 16);
            is6Var.a = str;
            is6Var.d = 1;
            objJ = b5p1.j(ezcVarG, s4Var, is6Var);
            d9n d9nVar = d9n.a;
            if (objJ == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str = is6Var.a;
            hm5.M(objJ);
        }
        return new bs6(((uv00) objJ).a(qaa1.class, str).b);
    }
}
