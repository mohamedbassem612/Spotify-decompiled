package p;

import com.spotify.offline_esperanto.proto.EsOffline$ContextInfoPolicy;
import com.spotify.offline_esperanto.proto.EsOffline$GetContextsRequest;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class bxp0 implements dwo {
    public static final bma1 f;
    public static final bma1 g;
    public final ywp a;
    public final ywp b;
    public final ywp c;
    public final ywp d;
    public final rku e;

    static {
        nbc nbcVar = bma1.b;
        f = nbcVar.u("offline_state_saver_needs_restore");
        g = nbcVar.u("offline_state_saver_uris");
    }

    public bxp0(fw4 fw4Var, ywp ywpVar, ywp ywpVar2, ywp ywpVar3, ywp ywpVar4, ywp ywpVar5) {
        this.a = ywpVar2;
        this.b = ywpVar3;
        this.c = ywpVar4;
        this.d = ywpVar5;
        rku rkuVar = new rku();
        this.e = rkuVar;
        if (fw4Var.a()) {
            rkuVar.b(((o241) ywpVar.get()).a.subscribeOn((Scheduler) ywpVar5.get()).distinctUntilChanged().switchMap(new e5l0(this, (byte) 16)).subscribe(zzc0.U0, zzc0.V0));
        }
    }

    public static boolean a(Map map) {
        return yto.j((String) map.get("employee")) && u890.j(map.get("type"), "premium") && u890.j(map.get("employee-free-opt-in"), "0");
    }

    public final Observable b() {
        vpp0 vpp0Var = ((byp0) this.b.get()).a;
        com.spotify.offline_esperanto.proto.c cVarQ = EsOffline$GetContextsRequest.q();
        qoz qozVarN = EsOffline$ContextInfoPolicy.n();
        qozVarN.n(false);
        cVarQ.t(qozVarN);
        return vpp0Var.c((EsOffline$GetContextsRequest) cVarQ.build()).map(zi20.R0).flatMap(new mre0(this, (byte) 23)).subscribeOn((Scheduler) this.d.get()).doOnSubscribe(zzc0.W0).distinctUntilChanged().map(new m4e0(this, (byte) 24));
    }

    public final void c(boolean z) {
        hma1 hma1VarEdit = ((dma1) this.c.get()).edit();
        hma1VarEdit.a(f, z);
        hma1VarEdit.g();
    }

    @Override // p.dwo
    public final void shutdown() {
        this.e.a();
    }
}
