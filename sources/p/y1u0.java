package p;

import com.spotify.mobius.Connectable;
import com.spotify.mobius.Connection;
import com.spotify.mobius.functions.Consumer;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.PlayerQueue;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class y1u0 implements Connectable {
    public final /* synthetic */ byte a = 0;
    public final q8n b;
    public final kge c;

    public y1u0(tuz tuzVar, q8n q8nVar) {
        this.b = q8nVar;
        FlowableRefCount flowableRefCount = tuzVar.c;
        vbm[] vbmVarArr = q601.a;
        this.c = new kge(flowableRefCount);
    }

    public static boolean a(String str, PlayerQueue playerQueue) {
        b380<ContextTrack> b380VarNextTracks = playerQueue.nextTracks();
        if (b380VarNextTracks.isEmpty()) {
            return false;
        }
        for (ContextTrack contextTrack : b380VarNextTracks) {
            contextTrack.getClass();
            if (l4o1.S(contextTrack) && u890.j(contextTrack.uri(), str)) {
                return true;
            }
        }
        return false;
    }

    public final Connection L(Consumer consumer) {
        byte b = this.a;
        q8n q8nVar = this.b;
        switch (b) {
            case 0:
                bpb1 bpb1VarB = gio1.b("");
                llm llmVarE = smo1.e(flo1.l(guo1.B(), q8nVar));
                fn31.T(llmVarE, (o8n) null, 0, new dvq0(bpb1VarB, this, consumer, (lnm) null, (byte) 21), 3);
                fn31.T(llmVarE, (o8n) null, 0, new f3t0(this, consumer, (lnm) null, (byte) 13), 3);
                return new wr20(bpb1VarB, llmVarE, (byte) 1);
            default:
                bpb1 bpb1VarB2 = gio1.b(new mmr0("", Boolean.FALSE));
                llm llmVarE2 = smo1.e(flo1.l(guo1.B(), q8nVar));
                fn31.T(llmVarE2, (o8n) null, 0, new glu0(bpb1VarB2, this, consumer, (lnm) null, (byte) 20), 3);
                return new wr20(bpb1VarB2, this, llmVarE2);
        }
    }

    public y1u0(Flowable flowable, q8n q8nVar) {
        this.b = q8nVar;
        vbm[] vbmVarArr = q601.a;
        this.c = new kge(flowable);
    }
}
