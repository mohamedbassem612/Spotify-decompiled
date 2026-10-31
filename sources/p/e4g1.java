package p;

import com.spotify.connectivity.trafficsetupimpl.NativeTrafficSetupImpl;
import com.spotify.esperanto.esperanto.CoroutineTransport;
import com.spotify.esperanto.p000esperantoimpl.DispatchingCoroutineTransport;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class e4g1 implements f961 {
    public final a8n a;
    public NativeTrafficSetupImpl b;
    public final e39 c;

    public e4g1(a8n a8nVar, v4g1 v4g1Var) {
        this.a = a8nVar;
        ((d8n) a8nVar).c.runBlocking(new g54(this, (byte) 17));
        e39 e39Var = null;
        if (v4g1Var != null) {
            NativeTrafficSetupImpl nativeTrafficSetupImpl = this.b;
            if (nativeTrafficSetupImpl == null) {
                u890.C("nativeTrafficSetup");
                throw null;
            }
            CoroutineTransport coroutineTransport = nativeTrafficSetupImpl.getCoroutineTransport();
            q8n q8nVar = v4g1Var.b;
            p8n p8nVar = q8n.b;
            oe30 oe30VarG = q0o1.g(new DispatchingCoroutineTransport(q8nVar.M(1), coroutineTransport));
            q8n q8nVarM = v4g1Var.a.M(1);
            z8n z8nVar = new z8n("TrafficEventBridge");
            q8nVarM.getClass();
            llm llmVarE = smo1.e(ilo1.B(q8nVarM, z8nVar).y(guo1.B()));
            c921.y(llmVarE, (o8n) null, 4, new u4g1(v4g1Var, oe30VarG, (lnm) null), 1);
            c921.y(llmVarE, (o8n) null, 0, new u4g1(oe30VarG, v4g1Var, (lnm) null), 3);
            e39Var = new e39(llmVarE, (byte) 3);
        }
        this.c = e39Var;
    }

    public final void shutdown() {
        e39 e39Var = this.c;
        if (e39Var != null) {
            p3d1.p(e39Var);
        }
        ((d8n) this.a).c.runBlocking(new xfz0(this, (byte) 29));
    }

    public final Object getApi() {
        return this;
    }
}
