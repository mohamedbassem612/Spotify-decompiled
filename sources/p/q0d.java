package p;

import android.content.Intent;
import com.spotify.login.phonenumbersignup.callingcode.CallingCodePickerActivity;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q0d {
    public final aus0 a;
    public final Scheduler b;
    public final Scheduler c;
    public final i8h1 d;
    public final mwn0 e;
    public final CompositeDisposable f = new CompositeDisposable();
    public final h4l0 g;
    public boolean h;
    public boolean i;
    public CallingCodePickerActivity j;
    public String k;

    public q0d(aus0 aus0Var, Scheduler scheduler, Scheduler scheduler2, i8h1 i8h1Var, mwn0 mwn0Var) {
        this.a = aus0Var;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = i8h1Var;
        this.e = mwn0Var;
        r6h1 r6h1Var = r6h1.c;
        this.g = new h4l0((byte) 8);
    }

    public final void a() {
        x6h1 x6h1VarC = this.g.b.c();
        x6h1VarC.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = false;
        y6h1 y6h1VarA = x6h1VarC.a();
        b7x b7xVar = b7x.a;
        nyn1.Q(this.e, new yrn0(this.d.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
        lir0 lir0Var = this.j;
        if (lir0Var != null) {
            lir0Var.setResult(0, new Intent());
            lir0Var.finish();
        }
    }
}
