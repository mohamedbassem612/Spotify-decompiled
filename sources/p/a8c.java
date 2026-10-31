package p;

import com.spotify.browse.clientnative.mobius.BrowseEvent;
import com.spotify.browse.clientnative.mobius.BrowseState;
import com.spotify.browse.clientnative.mobius.b;
import com.spotify.mobius.MobiusLoop;
import com.spotify.mobius.disposables.Disposable;
import java.util.Iterator;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class a8c extends x7e0 {
    public boolean N0;
    public xab1 O0;
    public final bpb1 X;
    public MobiusLoop Y;
    public Disposable Z;
    public final b d;
    public final d520 e;
    public final zr6 f;
    public final iac0 g;
    public final v4r0 h;
    public final kf4 i;
    public final bpb1 t;

    public a8c(b bVar, d520 d520Var, zr6 zr6Var, iac0 iac0Var, v4r0 v4r0Var, kf4 kf4Var) {
        this.d = bVar;
        this.e = d520Var;
        this.f = zr6Var;
        this.g = iac0Var;
        this.h = v4r0Var;
        this.i = kf4Var;
        bpb1 bpb1VarB = gio1.b(BrowseState.Loading.INSTANCE);
        this.t = bpb1VarB;
        this.X = bpb1VarB;
    }

    public final void e() {
        Set set = this.f.a;
        Iterator it = set.iterator();
        while (it.hasNext()) {
            ((is80) it.next()).start();
        }
        hs00 hs00Var = this.h.a;
        iac0 iac0Var = this.g;
        Set set2 = set;
        ajq0 ajq0Var = new ajq0(((mko) o7h.q0(o7h.n0(set2, mko.class))).b(), (klv0) o7h.q0(o7h.n0(set2, glv0.class)), ((r731) o7h.q0(o7h.n0(set2, r731.class))).a(), new rzo0(hs00Var, iac0Var), new tla(this, (byte) 23));
        q01 q01Var = new q01(0, this, a8c.class, "startLoop", "startLoop()Lkotlinx/coroutines/flow/Flow;", 0, (byte) 23);
        j3r j3rVar = rzq.y;
        d520 d520Var = this.e;
        dnc0 dnc0Var = new dnc0(l2p1.f((dv00) d520Var.c), (Function0) null, (Function0) null, new cc9(100, 0, 2), (guh0) null, 94);
        dnc0Var.b(new gj50(new tla(q01Var, (byte) 22), true), new ztb(d520Var, ajq0Var, (byte) 5));
        cnc0 cnc0VarA = dnc0Var.a();
        d520Var.e = (snc0) cnc0VarA.a.invoke();
        d520Var.f = cnc0VarA.c;
        d520Var.g = cnc0VarA.d;
        d520Var.h = cnc0VarA.b;
        this.O0 = fn31.T(cto1.q(iac0Var), (o8n) null, 0, new vk6(this, (lnm) null, (byte) 17), 3);
    }

    public final void f() {
        this.N0 = true;
        Iterator it = this.f.a.iterator();
        while (it.hasNext()) {
            ((is80) it.next()).dispose();
        }
        xab1 xab1Var = this.O0;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        this.O0 = null;
        MobiusLoop mobiusLoop = this.Y;
        if (mobiusLoop == null) {
            u890.C("loop");
            throw null;
        }
        mobiusLoop.dispose();
        Disposable disposable = this.Z;
        if (disposable != null) {
            disposable.dispose();
        } else {
            u890.C("disposable");
            throw null;
        }
    }

    public final void k(BrowseEvent browseEvent) {
        rih1 m231Var;
        MobiusLoop mobiusLoop = this.Y;
        if (mobiusLoop == null || this.N0) {
            return;
        }
        try {
            mobiusLoop.a(browseEvent);
            m231Var = rih1.a;
        } catch (Throwable th) {
            m231Var = new m231(th);
        }
        Throwable thA = e331.a(m231Var);
        if (thA != null) {
            n57.t("Failed to dispatch event to loop: " + browseEvent, thA);
        }
    }
}
