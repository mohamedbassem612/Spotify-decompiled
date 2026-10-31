package p;

import com.spotify.betamax.contextplayercoordinatorimpl.model.VideoPlayerCommand;
import com.spotify.player.model.command.options.LoggingParams;
import io.reactivex.rxjava3.core.Scheduler;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class apa implements d0u0 {
    public final utg0 N0;
    public boolean O0;
    public tvj1 P0;
    public boolean Q0;
    public boolean R0 = true;
    public hpc1 S0;
    public Long T0;
    public hdu0 U0;
    public o2u0 V0;
    public final boolean X;
    public final boolean Y;
    public final fpa Z;
    public final it8 a;
    public final it8 b;
    public final soa c;
    public final soa d;
    public final m9n e;
    public final Scheduler f;
    public final phi0 g;
    public final ynb0 h;
    public final boolean i;
    public final boolean t;

    public apa(it8 it8Var, it8 it8Var2, soa soaVar, soa soaVar2, m9n m9nVar, Scheduler scheduler, phi0 phi0Var, ynb0 ynb0Var, boolean z, boolean z2, boolean z3, boolean z4, fpa fpaVar, utg0 utg0Var) {
        this.a = it8Var;
        this.b = it8Var2;
        this.c = soaVar;
        this.d = soaVar2;
        this.e = m9nVar;
        this.f = scheduler;
        this.g = phi0Var;
        this.h = ynb0Var;
        this.i = z;
        this.t = z2;
        this.X = z3;
        this.Y = z4;
        this.Z = fpaVar;
        this.N0 = utg0Var;
    }

    @Override // p.d0u0
    public final c0u0 a(m0u0 m0u0Var, oot0 oot0Var, np00 np00Var, String str) {
        hdu0 hdu0Var = this.U0;
        if (hdu0Var != null) {
            hdu0Var.U();
        }
        hdu0 hdu0Var2 = new hdu0(m0u0Var, oot0Var, this.e, this.g, np00Var, this.T0, this.f, this.N0.e.filter(new d4e0(m0u0Var, (byte) 8)).map(aj20.N0), this.X);
        this.U0 = hdu0Var2;
        return hdu0Var2;
    }

    public final void b(it8 it8Var) {
        if (it8Var.l()) {
            if (it8Var == this.a && this.t) {
                it8Var.B();
            } else {
                it8Var.p();
                it8Var.z(true);
            }
        }
    }

    public final it8 c(VideoPlayerCommand videoPlayerCommand) {
        String strP = x1p1.p(videoPlayerCommand);
        it8 it8Var = this.a;
        if (strP.equals(it8Var.k())) {
            return it8Var;
        }
        it8 it8Var2 = this.b;
        if (strP.equals(it8Var2.k())) {
            return it8Var2;
        }
        return null;
    }

    public final uoa d(boolean z) {
        uoa uoaVarA = z ? this.c.a() : this.d.a();
        hpc1 hpc1Var = this.S0;
        uoaVarA.n = hpc1Var;
        p3u0 p3u0Var = uoaVarA.f;
        if (p3u0Var != null) {
            p3u0Var.R0(hpc1Var);
        }
        uoaVarA.t(this.Q0);
        uoaVarA.r(this.R0);
        tvj1 tvj1Var = this.P0;
        if (tvj1Var != null) {
            fap1.d(tvj1Var, uoaVarA);
        }
        return uoaVarA;
    }

    public final void e(o2u0 o2u0Var, oot0 oot0Var) {
        boolean z = this.O0;
        it8 it8Var = this.a;
        it8 it8Var2 = this.b;
        if (z && c2p1.u(o2u0Var)) {
            b(it8Var2);
            it8Var.z(this.Q0);
            it8Var.r(o2u0Var, oot0Var);
        } else {
            b(it8Var);
            it8Var2.z(this.Q0);
            it8Var2.r(o2u0Var, oot0Var);
        }
        this.V0 = o2u0Var;
    }

    public final void f(VideoPlayerCommand videoPlayerCommand, boolean z) {
        long seekToInMs = videoPlayerCommand.getSeekToInMs();
        phi0 phi0Var = this.g;
        Long lK = phi0Var.k();
        if (lK != null && seekToInMs >= lK.longValue()) {
            phi0Var.B();
        }
        it8 it8VarC = c(videoPlayerCommand);
        if (it8VarC != null) {
            it8VarC.u(seekToInMs, z);
        }
    }

    public final void g(VideoPlayerCommand videoPlayerCommand) {
        LoggingParams loggingParameters;
        spq0 spq0VarCommandInitiatedTime;
        if (videoPlayerCommand.getInitiallyPaused() && this.Y) {
            return;
        }
        it8 it8VarC = c(videoPlayerCommand);
        Long l = null;
        Long l2 = (videoPlayerCommand.getInitiallyPaused() || (loggingParameters = videoPlayerCommand.getLoggingParameters()) == null || (spq0VarCommandInitiatedTime = loggingParameters.commandInitiatedTime()) == null) ? null : (Long) spq0VarCommandInitiatedTime.h();
        Long systemInitiatedTimeMs = videoPlayerCommand.getSystemInitiatedTimeMs();
        if (l2 != null) {
            l = l2;
        } else if (systemInitiatedTimeMs != null) {
            l = systemInitiatedTimeMs;
        }
        if (l != null) {
            long jLongValue = l.longValue();
            if (it8VarC != null) {
                it8VarC.v(jLongValue, this.Z);
            }
        }
    }
}
