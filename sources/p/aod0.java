package p;

import com.spotify.collection_platform.esperanto.proto.CollectionPlatformItemsRequest;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class aod0 implements xpw {
    public final sd41 a;
    public final xe01 b;
    public final ljm0 c;
    public final ia00 d;
    public final f70 e;

    public aod0(q8n q8nVar, sd41 sd41Var) {
        this.a = sd41Var;
        xho xhoVar = new xho(new q0k(this));
        llm llmVarE = smo1.e(q8nVar);
        w4h w4hVar = sd41Var.b;
        u4h u4hVarQ = CollectionPlatformItemsRequest.q();
        u4hVarQ.t(w5h.c);
        zx60 zx60Var = new zx60(yoi1.g(w4hVar.callStream("spotify.collection_platform_esperanto.proto.CollectionPlatformService", "StreamGet", u4hVarQ.build()).map(b6j0.O0).map(wbx0.i)), (byte) 15);
        w7x w7xVar = w7x.a;
        this.b = d5p1.t(zx60Var, llmVarE, ey71.a, new ijo(8, w7xVar, w7xVar));
        this.c = xhoVar.b;
        this.d = xhoVar.c;
        this.e = xhoVar.d;
    }

    public final rqw a() {
        return this.d;
    }

    public final jsw c() {
        return this.e;
    }

    public final mqw getBehavior() {
        return this.c;
    }
}
