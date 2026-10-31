package p;

import com.spotify.home.evopage.mobius.State;
import com.spotify.mobius.functions.Consumer;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class sj00 implements Consumer {
    public final /* synthetic */ tj00 a;
    public final /* synthetic */ PublishSubject b;

    public sj00(tj00 tj00Var, PublishSubject publishSubject) {
        this.a = tj00Var;
        this.b = publishSubject;
    }

    @Override // com.spotify.mobius.functions.Consumer
    public final void accept(Object obj) {
        State state = (State) obj;
        tj00 tj00Var = this.a;
        kdn0 kdn0Var = tj00Var.P0;
        wo60 wo60Var = tj00Var.h;
        tp60 tp60Var = tj00Var.g;
        kdn0Var.j(state);
        if (state instanceof State.Error) {
            tj00Var.h(((State.Error) state).getError());
            tp60Var.p(kq60.i);
            tp60Var.m(2, tj00Var.d);
            wo60Var.d();
            return;
        }
        if (!(state instanceof State.Content)) {
            if (state instanceof State.Loading) {
                return;
            }
            eg.o();
            return;
        }
        dq60 dq60VarH = tp60Var.h();
        if (dq60VarH != null) {
            tj00Var.Z0 = dq60VarH;
        }
        wo60Var.j();
        State.Content content = (State.Content) state;
        this.b.onNext(content.getModel());
        ml00 ml00Var = tj00Var.f;
        if (ml00Var.g) {
            return;
        }
        try {
            Set set = ml00Var.e;
            ArrayList arrayList = new ArrayList();
            Iterator it = set.iterator();
            while (it.hasNext()) {
                r4u r4uVarD = ((hs80) it.next()).d(content.getModel());
                if (r4uVarD != null) {
                    arrayList.add(r4uVarD);
                }
            }
            r4u.b(arrayList).e(content.getModel());
        } catch (IllegalStateException e) {
            n57.t("EvoServiceOrchestrator.onContentChanged IllegalStateException", e);
        }
    }
}
