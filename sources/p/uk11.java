package p;

import android.os.Bundle;
import android.os.Parcelable;
import com.spotify.player.model.Context;
import com.spotify.player.model.command.PlayCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Scheduler;
import io.reactivex.rxjava3.disposables.CompositeDisposable;
import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class uk11 implements sk11, rw31, tu31, s1z {
    public final t1z a;
    public final Scheduler b;
    public final Scheduler c;
    public final jl11 d;
    public final lzn0 e;
    public final r1z f;
    public final kly0 g;
    public final muz h;
    public final tfq i;
    public final yh2 j;
    public final zr00 k;
    public final wr00 l;
    public ffe1 n;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public boolean f45p;
    public boolean q;
    public final CompositeDisposable m = new CompositeDisposable();
    public final LinkedHashSet o = new LinkedHashSet();

    public uk11(t1z t1zVar, Scheduler scheduler, Scheduler scheduler2, jl11 jl11Var, lzn0 lzn0Var, r1z r1zVar, lbp lbpVar, muz muzVar, tfq tfqVar, yh2 yh2Var, zr00 zr00Var, wr00 wr00Var) {
        this.a = t1zVar;
        this.b = scheduler;
        this.c = scheduler2;
        this.d = jl11Var;
        this.e = lzn0Var;
        this.f = r1zVar;
        this.g = lbpVar;
        this.h = muzVar;
        this.i = tfqVar;
        this.j = yh2Var;
        this.k = zr00Var;
        this.l = wr00Var;
    }

    public final void a(iby ibyVar) {
        String str = ibyVar.b;
        dem1 dem1Var = ibyVar.e;
        azy azyVar = dem1Var instanceof azy ? (azy) dem1Var : null;
        if (!(azyVar != null ? azyVar.f : false)) {
            boolean z = dem1Var instanceof vyy;
            ffe1 ffe1Var = this.n;
            lzn0 lzn0Var = this.e;
            if (!z) {
                if (ffe1Var != null) {
                    lzn0Var.a(str, ffe1Var.n(ibyVar, str), (Bundle) null);
                    return;
                } else {
                    u890.C("logger");
                    throw null;
                }
            }
            String str2 = ((vyy) dem1Var).c;
            if (ffe1Var != null) {
                lzn0Var.a(str2, ffe1Var.n(ibyVar, str2), (Bundle) null);
                return;
            } else {
                u890.C("logger");
                throw null;
            }
        }
        ffe1 ffe1Var2 = this.n;
        if (ffe1Var2 == null) {
            u890.C("logger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) ffe1Var2.b;
        g5l0 g5l0Var = (g5l0) ffe1Var2.c;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("row", (String) null, (Integer) null, str, (String) null));
        x6h1VarC2.j = true;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("play", 1, Collections.singletonMap("item_to_be_played", str)), x6h1VarC2.a(), g5l0Var.b, System.currentTimeMillis()), (xj61) null);
        String str3 = ibyVar.d;
        azy azyVar2 = (azy) dem1Var;
        if (this.f45p && azyVar2.d) {
            this.j.b(str, str3);
            return;
        }
        if (this.q && azyVar2.c) {
            this.l.a(str);
            return;
        }
        Context contextFromUri = Context.fromUri(str);
        LoggingParams.Builder builderInteractionId = LoggingParams.builder().interactionId(tv80VarM.a.a);
        y6r0 y6r0Var = tv80VarM.b;
        String str4 = y6r0Var != null ? y6r0Var.a : null;
        if (str4 == null) {
            str4 = "";
        }
        LoggingParams loggingParamsBuild = builderInteractionId.pageInstanceId(str4).build();
        tgt0 tgt0Var = (tgt0) this.g.get();
        contextFromUri.getClass();
        this.m.b(this.h.a(PlayCommand.builder(contextFromUri, tgt0Var.a).loggingParams(loggingParamsBuild).build()).subscribe());
    }

    @Override // p.tu31
    public final void b(iby ibyVar) {
        String str = ibyVar.b;
        if (this.o.add(str)) {
            ffe1 ffe1Var = this.n;
            if (ffe1Var == null) {
                u890.C("logger");
                throw null;
            }
            i8h1 i8h1Var = (i8h1) ffe1Var.b;
            g5l0 g5l0Var = (g5l0) ffe1Var.c;
            x6h1 x6h1VarC = g5l0Var.c.c();
            x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
            x6h1VarC.j = true;
            x6h1 x6h1VarC2 = x6h1VarC.a().c();
            x6h1VarC2.i.add(new a7h1("row", (String) null, (Integer) null, str, (String) null));
            x6h1VarC2.j = true;
            y6h1 y6h1VarA = x6h1VarC2.a();
            k7h1 k7h1Var = new k7h1();
            ((xjn) k7h1Var).a = y6h1VarA;
            ((xjn) k7h1Var).b = g5l0Var.b;
            ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
            i8h1Var.f(k7h1Var.a(), (Set) null);
        }
    }

    public final void c(iby ibyVar) {
        String str = ibyVar.b;
        ffe1 ffe1Var = this.n;
        if (ffe1Var == null) {
            u890.C("logger");
            throw null;
        }
        i8h1 i8h1Var = (i8h1) ffe1Var.b;
        g5l0 g5l0Var = (g5l0) ffe1Var.c;
        x6h1 x6h1VarC = g5l0Var.c.c();
        x6h1VarC.i.add(new a7h1("related_content", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC.j = true;
        x6h1 x6h1VarC2 = x6h1VarC.a().c();
        x6h1VarC2.i.add(new a7h1("row", (String) null, (Integer) null, str, (String) null));
        x6h1VarC2.j = true;
        x6h1 x6h1VarC3 = x6h1VarC2.a().c();
        x6h1VarC3.i.add(new a7h1("context_menu_button", (String) null, (Integer) null, (String) null, (String) null));
        x6h1VarC3.j = false;
        y6h1 y6h1VarA = x6h1VarC3.a();
        b7x b7xVar = b7x.a;
        tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), y6h1VarA, g5l0Var.b, System.currentTimeMillis()), (xj61) null);
        Parcelable.Creator creator = lik1.CREATOR;
        String str2 = ibyVar.a;
        this.f.a(str, str2, new lik1(str2), tv80VarM);
    }
}
