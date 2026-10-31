package p;

import com.spotify.betamax.player.exception.BetamaxException;
import java.util.Collections;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fu0 implements c0u0 {
    public final LinkedHashSet a = new LinkedHashSet();
    public final /* synthetic */ gu0 b;

    public fu0(gu0 gu0Var) {
        this.b = gu0Var;
    }

    public final void K(long j, long j2) {
        gu0 gu0Var = this.b;
        zt0 zt0Var = (zt0) gu0Var.i;
        a(at0.h);
        if (j == 0) {
            String str = (String) gu0Var.d;
            t45 t45Var = zt0Var.b;
            if (t45Var != null) {
                t45Var.b("video_source_type", str);
            }
            zt0Var.a(5);
        }
    }

    public final void R(r4t r4tVar, int i, long j, long j2) {
        gu0 gu0Var = this.b;
        ((gt0) gu0Var.f).invoke();
        ((zt0) gu0Var.i).b(5);
    }

    public final void a(at0 at0Var) {
        LinkedHashSet linkedHashSet = this.a;
        if (linkedHashSet.contains(at0Var)) {
            return;
        }
        linkedHashSet.add(at0Var);
        gu0 gu0Var = this.b;
        bt0.a((bt0) gu0Var.h, at0Var, (String) gu0Var.c, Collections.singletonList((String) gu0Var.b), (String) null, 52);
    }

    public final void i(BetamaxException betamaxException, long j, long j2) {
        gu0 gu0Var = this.b;
        ((gt0) gu0Var.g).invoke();
        ((zt0) gu0Var.i).c(5, 4);
    }

    public final void m(long j, long j2) {
        gu0 gu0Var = this.b;
        gu0Var.e.invoke();
        a(at0.i);
        t45 t45Var = ((zt0) gu0Var.i).b;
        if (t45Var != null) {
            t45Var.g(kk0.b(5));
        }
    }
}
