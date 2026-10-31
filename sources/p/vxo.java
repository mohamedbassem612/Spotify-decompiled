package p;

import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.subjects.PublishSubject;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class vxo {
    public final /* synthetic */ fwo a;

    public vxo(fwo fwoVar) {
        this.a = fwoVar;
    }

    public final vzx a(boolean z, PublishSubject publishSubject, PublishSubject publishSubject2) {
        wxo wxoVar = (wxo) this.a.c;
        Observable observable = (Observable) wxoVar.z.get();
        t2j0 t2j0VarD1 = ((f62) wxoVar.b).d1();
        c8o.l(t2j0VarD1);
        am30 am30VarF0 = ((f62) wxoVar.b).F0();
        c8o.l(am30VarF0);
        j62 j62Var = (j62) wxoVar.Q.get();
        up0 up0VarU0 = ((f62) wxoVar.b).U0();
        zm4 zm4Var = (zm4) wxoVar.e.get();
        kt91 kt91VarJ = ((f62) wxoVar.b).j();
        c8o.l(kt91VarJ);
        mw7 mw7VarG0 = ((f62) wxoVar.b).G0();
        c8o.l(mw7VarG0);
        return new vzx(observable, t2j0VarD1, am30VarF0, j62Var, up0VarU0, zm4Var, kt91VarJ, mw7VarG0, (Flowable) wxoVar.E.get(), (Scheduler) wxoVar.d.get(), z, publishSubject, publishSubject2);
    }
}
