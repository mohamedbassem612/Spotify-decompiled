package p;

import com.spotify.cosmos.callbackrouter.CallbackRouter;
import com.spotify.esperanto.esperantocosmos.CosmosCoroutineTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sag {
    public final csj1 a;
    public final msm0 b;
    public final CallbackRouter c;
    public final oj3 d;
    public final sd41 e;
    public final s4w0 f;
    public final xrc0 g;
    public final kag h;
    public final boolean i;
    public final kk4 j;
    public final h5q k;
    public final e7p0 l;
    public final kt91 m;
    public final uu00 n;
    public final uvy o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final jn7 f74p;
    public final jn7 q;

    public sag(csj1 csj1Var, msm0 msm0Var, CallbackRouter callbackRouter, oj3 oj3Var, sd41 sd41Var, s4w0 s4w0Var, xrc0 xrc0Var, kag kagVar, boolean z, kk4 kk4Var, h5q h5qVar, e7p0 e7p0Var, kt91 kt91Var, uu00 uu00Var, uvy uvyVar) {
        this.a = csj1Var;
        this.b = msm0Var;
        this.c = callbackRouter;
        this.d = oj3Var;
        this.e = sd41Var;
        this.f = s4w0Var;
        this.g = xrc0Var;
        this.h = kagVar;
        this.i = z;
        this.j = kk4Var;
        this.k = h5qVar;
        this.l = e7p0Var;
        this.m = kt91Var;
        this.n = uu00Var;
        this.o = uvyVar;
        this.f74p = new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 4)));
        this.q = new jn7(new CosmosCoroutineTransport(new ny5(callbackRouter, (byte) 3)));
    }
}
