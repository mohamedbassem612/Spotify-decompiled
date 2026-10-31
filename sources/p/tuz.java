package p;

import com.spotify.player.esperanto.proto.EsAddToQueueRequest;
import com.spotify.player.esperanto.proto.EsGetQueueRequest$GetQueueRequest;
import com.spotify.player.esperanto.proto.EsSetQueueRequest;
import com.spotify.player.model.ContextTrack;
import com.spotify.player.model.command.AddToQueueCommand;
import com.spotify.player.model.command.SetQueueCommand;
import com.spotify.player.model.command.options.CommandOptions;
import io.reactivex.rxjava3.core.BackpressureStrategy;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.flowable.FlowableRefCount;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class tuz {
    public final ujm a;
    public final cve0 b;
    public final FlowableRefCount c;

    public tuz(ujm ujmVar, cve0 cve0Var) {
        this.a = ujmVar;
        this.b = cve0Var;
        this.c = new FlowableRefCount(ujmVar.callStream("spotify.player.esperanto.proto.ContextPlayer", "GetQueue", EsGetQueueRequest$GetQueueRequest.o()).map(v560.S0).map(pbo1.b1).toFlowable(BackpressureStrategy.d).Q());
    }

    public final Single a(ContextTrack contextTrack) {
        AddToQueueCommand addToQueueCommandCreate = AddToQueueCommand.create(contextTrack);
        kkz kkzVarN = EsAddToQueueRequest.AddToQueueRequest.n();
        if (addToQueueCommandCreate.options().c()) {
            kkzVarN.q(l6p1.h((CommandOptions) addToQueueCommandCreate.options().b()));
        }
        kkzVarN.n(tgp1.s(this.b.a(addToQueueCommandCreate.loggingParams())));
        kkzVarN.r(xlm.b(addToQueueCommandCreate.track()));
        return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "AddToQueue", kkzVarN.build()).map(bbn.S0).map(uml1.c1);
    }

    public final Single b(SetQueueCommand setQueueCommand) {
        qrz qrzVarP = EsSetQueueRequest.SetQueueRequest.p();
        if (setQueueCommand.options().c()) {
            qrzVarP.s(l6p1.h((CommandOptions) setQueueCommand.options().b()));
        }
        try {
            qrzVarP.t(Long.parseLong(setQueueCommand.queueRevision()));
            qrzVarP.r(tgp1.s(this.b.a(setQueueCommand.loggingParams())));
            b380 b380VarNextTracks = setQueueCommand.nextTracks();
            ArrayList arrayList = new ArrayList(q7h.U(b380VarNextTracks, 10));
            Iterator it = b380VarNextTracks.iterator();
            while (it.hasNext()) {
                arrayList.add(xlm.c((ContextTrack) it.next()));
            }
            qrzVarP.n(arrayList);
            b380 b380VarPrevTracks = setQueueCommand.prevTracks();
            ArrayList arrayList2 = new ArrayList(q7h.U(b380VarPrevTracks, 10));
            Iterator it2 = b380VarPrevTracks.iterator();
            while (it2.hasNext()) {
                arrayList2.add(xlm.c((ContextTrack) it2.next()));
            }
            qrzVarP.q(arrayList2);
            return this.a.callSingle("spotify.player.esperanto.proto.ContextPlayer", "SetQueue", qrzVarP.build()).map(cxo1.S0).map(een.f1);
        } catch (NumberFormatException unused) {
            return Single.just(feh.b("Invalid revision"));
        }
    }
}
