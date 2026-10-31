package p;

import android.os.Bundle;
import android.view.ViewGroup;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class cgr0 implements o5s {
    public final n431 N0;
    public final s331 O0;
    public final fkk1 P0;
    public final m25 Q0;
    public final kly0 R0;
    public em0 S0;
    public ViewGroup T0;
    public final LinkedHashMap U0 = new LinkedHashMap();
    public wkc1 V0;
    public Bundle W0;
    public final lzn0 X;
    public final wen0 Y;
    public final c690 Z;
    public final q7r0 a;
    public final yt91 b;
    public final tp60 c;
    public final wo60 d;
    public final aks0 e;
    public final nip f;
    public final rsm0 g;
    public final wl7 h;
    public final hun0 i;
    public final ew5 t;

    public cgr0(q7r0 q7r0Var, yt91 yt91Var, tp60 tp60Var, wo60 wo60Var, aks0 aks0Var, nip nipVar, rsm0 rsm0Var, wl7 wl7Var, hun0 hun0Var, ew5 ew5Var, lzn0 lzn0Var, wen0 wen0Var, c690 c690Var, n431 n431Var, s331 s331Var, fkk1 fkk1Var, m25 m25Var, chp chpVar) {
        this.a = q7r0Var;
        this.b = yt91Var;
        this.c = tp60Var;
        this.d = wo60Var;
        this.e = aks0Var;
        this.f = nipVar;
        this.g = rsm0Var;
        this.h = wl7Var;
        this.i = hun0Var;
        this.t = ew5Var;
        this.X = lzn0Var;
        this.Y = wen0Var;
        this.Z = c690Var;
        this.N0 = n431Var;
        this.O0 = s331Var;
        this.P0 = fkk1Var;
        this.Q0 = m25Var;
        this.R0 = chpVar;
    }

    public final void onDestroy(iac0 iac0Var) {
        this.V0 = null;
        em0 em0Var = this.S0;
        if (em0Var != null) {
            em0Var.stop();
            em0 em0Var2 = this.S0;
            if (em0Var2 != null) {
                em0Var2.L();
            } else {
                u890.C("pageSwapper");
                throw null;
            }
        }
    }
}
