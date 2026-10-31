package p;

import android.content.Context;
import io.reactivex.rxjava3.subjects.PublishSubject;
import java.util.concurrent.atomic.AtomicReferenceArray;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class y3u {
    public final Context a;
    public final i8h1 b;
    public final vzl0 c;
    public final t8h1 d;
    public final mwn0 e;
    public final PublishSubject f = new PublishSubject();
    public final bpb1 g;
    public final xe01 h;

    public y3u(Context context, i8h1 i8h1Var, vzl0 vzl0Var, t8h1 t8h1Var, mwn0 mwn0Var) {
        this.a = context;
        this.b = i8h1Var;
        this.c = vzl0Var;
        this.d = t8h1Var;
        this.e = mwn0Var;
        bpb1 bpb1VarB = gio1.b((Object) null);
        this.g = bpb1VarB;
        this.h = d5p1.h(bpb1VarB);
    }

    public final void a(String str) {
        vzl0 vzl0Var = this.c;
        vzl0Var.getClass();
        x6h1 x6h1VarC = vzl0Var.a.c();
        x6h1VarC.i.add(new a7h1("dismiss_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        this.b.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis()));
        AtomicReferenceArray atomicReferenceArray = p6r0.e;
        t8h1.n(this.d, yon1.m5());
        this.f.onNext(new op81(str));
    }

    public final void b() {
        this.g.l((Object) null);
    }
}
