package p;

import io.reactivex.rxjava3.core.Observable;
import io.reactivex.rxjava3.core.Scheduler;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class fal1 {
    public final bpb1 a;
    public boolean b;
    public final Observable c;
    public final bpb1 d;

    public fal1(Scheduler scheduler) {
        bpb1 bpb1VarB = gio1.b(Boolean.FALSE);
        this.a = bpb1VarB;
        this.c = yoi1.i(bpb1VarB, o6x.a).distinctUntilChanged().throttleLast(500L, TimeUnit.MILLISECONDS).observeOn(scheduler);
        this.d = bpb1VarB;
    }

    public final void a(boolean z) {
        this.b = true;
        this.a.m((Object) null, Boolean.valueOf(z));
    }
}
