package p;

import com.spotify.messages.MediaPlaybackBeacon;
import com.spotify.messages.MediaPlaybackError;
import com.spotify.messages.MediaPlaybackInitializationEnd;
import com.spotify.messages.MediaPlaybackInitializationStart;
import com.spotify.messages.MediaPlaybackPause;
import com.spotify.messages.MediaPlaybackPlay;
import com.spotify.messages.MediaPlaybackProfileChange;
import com.spotify.messages.MediaPlaybackSeekEnd;
import com.spotify.messages.MediaPlaybackSeekStart;
import com.spotify.messages.MediaPlaybackStallEnd;
import com.spotify.messages.MediaPlaybackStallStart;
import java.util.Locale;
import kotlin.NoWhenBranchMatchedException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ubu0 {
    public final t2j0 a;

    public ubu0(t2j0 t2j0Var) {
        this.a = t2j0Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    public final void a(ufp0 ufp0Var) throws NoWhenBranchMatchedException {
        boolean z = ufp0Var instanceof q0u0;
        t2j0 t2j0Var = this.a;
        if (z) {
            q0u0 q0u0Var = (q0u0) ufp0Var;
            uth0 uth0VarN = MediaPlaybackInitializationStart.n();
            uth0VarN.C(q0u0Var.b().d());
            uth0VarN.y(q0u0Var.b().c());
            uth0VarN.H(q0u0Var.b().e());
            uth0VarN.s(q0u0Var.b().a());
            uth0VarN.x(q0u0Var.b().b());
            uth0VarN.F(q0u0Var.e().f());
            uth0VarN.M(q0u0Var.e().j().toLowerCase(Locale.US));
            if (q0u0Var.e().i().length() > 0) {
                uth0VarN.L(q0u0Var.e().i());
            }
            uth0VarN.z(q0u0Var.e().d());
            uth0VarN.B();
            uth0VarN.K(q0u0Var.e().h());
            uth0VarN.u(q0u0Var.e().m());
            uth0VarN.w(q0u0Var.e().c());
            uth0VarN.E(q0u0Var.e().e());
            uth0VarN.I(q0u0Var.e().g());
            uth0VarN.N(q0u0Var.e().k());
            uth0VarN.q(q0u0Var.e().b());
            uth0VarN.t(q0u0Var.e().l());
            uth0VarN.n(q0u0Var.e().a());
            uth0VarN.v(q0u0Var.e().n());
            uth0VarN.G(q0u0Var.a().b());
            uth0VarN.r(q0u0Var.a().a());
            uth0VarN.J(q0u0Var.f());
            uth0VarN.A(q0u0Var.c());
            uth0VarN.D(q0u0Var.d());
            MediaPlaybackInitializationStart mediaPlaybackInitializationStartBuild = uth0VarN.build();
            mediaPlaybackInitializationStartBuild.getClass();
            t2j0Var.a(mediaPlaybackInitializationStartBuild);
            return;
        }
        if (ufp0Var instanceof p0u0) {
            p0u0 p0u0Var = (p0u0) ufp0Var;
            tth0 tth0VarN = MediaPlaybackInitializationEnd.n();
            tth0VarN.w(p0u0Var.b().a());
            tth0VarN.C(p0u0Var.c().d());
            tth0VarN.z(p0u0Var.c().c());
            tth0VarN.G(p0u0Var.c().e());
            tth0VarN.s(p0u0Var.c().a());
            tth0VarN.y(p0u0Var.c().b());
            tth0VarN.E(p0u0Var.d().f());
            tth0VarN.K(p0u0Var.d().j().toLowerCase(Locale.US));
            if (p0u0Var.d().i().length() > 0) {
                tth0VarN.J(p0u0Var.d().i());
            }
            tth0VarN.A(p0u0Var.d().d());
            tth0VarN.B();
            tth0VarN.I(p0u0Var.d().h());
            tth0VarN.u(p0u0Var.d().m());
            tth0VarN.x(p0u0Var.d().c());
            tth0VarN.D(p0u0Var.d().e());
            tth0VarN.H(p0u0Var.d().g());
            tth0VarN.L(p0u0Var.d().k());
            tth0VarN.q(p0u0Var.d().b());
            tth0VarN.t(p0u0Var.d().l());
            tth0VarN.n(p0u0Var.d().a());
            tth0VarN.v(p0u0Var.d().n());
            tth0VarN.F(p0u0Var.a().b());
            tth0VarN.r(p0u0Var.a().a());
            MediaPlaybackInitializationEnd mediaPlaybackInitializationEndBuild = tth0VarN.build();
            mediaPlaybackInitializationEndBuild.getClass();
            t2j0Var.a(mediaPlaybackInitializationEndBuild);
            return;
        }
        if (ufp0Var instanceof pab1) {
            pab1 pab1Var = (pab1) ufp0Var;
            duh0 duh0VarN = MediaPlaybackStallStart.n();
            duh0VarN.C(pab1Var.c().d());
            duh0VarN.z(pab1Var.c().c());
            duh0VarN.G(pab1Var.c().e());
            duh0VarN.t(pab1Var.c().a());
            duh0VarN.y(pab1Var.c().b());
            duh0VarN.E(pab1Var.d().f());
            String strJ = pab1Var.d().j();
            Locale locale = Locale.US;
            duh0VarN.K(strJ.toLowerCase(locale));
            if (pab1Var.d().i().length() > 0) {
                duh0VarN.J(pab1Var.d().i());
            }
            duh0VarN.A(pab1Var.d().d());
            duh0VarN.B();
            duh0VarN.I(pab1Var.d().h());
            duh0VarN.v(pab1Var.d().m());
            duh0VarN.x(pab1Var.d().c());
            duh0VarN.D(pab1Var.d().e());
            duh0VarN.H(pab1Var.d().g());
            duh0VarN.L(pab1Var.d().k());
            duh0VarN.q(pab1Var.d().b());
            duh0VarN.u(pab1Var.d().l());
            duh0VarN.n(pab1Var.d().a());
            duh0VarN.w(pab1Var.d().n());
            duh0VarN.r(z5c.p(pab1Var.a()).toLowerCase(locale));
            duh0VarN.F(pab1Var.b().b());
            duh0VarN.s(pab1Var.b().a());
            MediaPlaybackStallStart mediaPlaybackStallStartBuild = duh0VarN.build();
            mediaPlaybackStallStartBuild.getClass();
            t2j0Var.a(mediaPlaybackStallStartBuild);
            return;
        }
        if (ufp0Var instanceof mab1) {
            mab1 mab1Var = (mab1) ufp0Var;
            cuh0 cuh0VarN = MediaPlaybackStallEnd.n();
            ix21 ix21VarC = mab1Var.c();
            if (ix21VarC != null) {
                cuh0VarN.u(ix21VarC.a());
            }
            int iF = mab1Var.f();
            if (iF != 0) {
                cuh0VarN.J(h4b1.a(iF));
            }
            cuh0VarN.D(mab1Var.d().d());
            cuh0VarN.A(mab1Var.d().c());
            cuh0VarN.H(mab1Var.d().e());
            cuh0VarN.t(mab1Var.d().a());
            cuh0VarN.z(mab1Var.d().b());
            cuh0VarN.F(mab1Var.e().f());
            String strJ2 = mab1Var.e().j();
            Locale locale2 = Locale.US;
            cuh0VarN.M(strJ2.toLowerCase(locale2));
            if (mab1Var.e().i().length() > 0) {
                cuh0VarN.L(mab1Var.e().i());
            }
            cuh0VarN.B(mab1Var.e().d());
            cuh0VarN.C();
            cuh0VarN.K(mab1Var.e().h());
            cuh0VarN.w(mab1Var.e().m());
            cuh0VarN.y(mab1Var.e().c());
            cuh0VarN.E(mab1Var.e().e());
            cuh0VarN.I(mab1Var.e().g());
            cuh0VarN.N(mab1Var.e().k());
            cuh0VarN.q(mab1Var.e().b());
            cuh0VarN.v(mab1Var.e().l());
            cuh0VarN.n(mab1Var.e().a());
            cuh0VarN.x(mab1Var.e().n());
            cuh0VarN.r(z5c.p(mab1Var.a()).toLowerCase(locale2));
            cuh0VarN.G(mab1Var.b().b());
            cuh0VarN.s(mab1Var.b().a());
            MediaPlaybackStallEnd mediaPlaybackStallEndBuild = cuh0VarN.build();
            mediaPlaybackStallEndBuild.getClass();
            t2j0Var.a(mediaPlaybackStallEndBuild);
            return;
        }
        if (ufp0Var instanceof njt0) {
            njt0 njt0Var = (njt0) ufp0Var;
            yth0 yth0VarN = MediaPlaybackPlay.n();
            yth0VarN.B(njt0Var.b().d());
            yth0VarN.y(njt0Var.b().c());
            yth0VarN.F(njt0Var.b().e());
            yth0VarN.s(njt0Var.b().a());
            yth0VarN.x(njt0Var.b().b());
            yth0VarN.D(njt0Var.c().f());
            yth0VarN.J(njt0Var.c().j().toLowerCase(Locale.US));
            if (njt0Var.c().i().length() > 0) {
                yth0VarN.I(njt0Var.c().i());
            }
            yth0VarN.z(njt0Var.c().d());
            yth0VarN.A();
            yth0VarN.H(njt0Var.c().h());
            yth0VarN.u(njt0Var.c().m());
            yth0VarN.w(njt0Var.c().c());
            yth0VarN.C(njt0Var.c().e());
            yth0VarN.G(njt0Var.c().g());
            yth0VarN.K(njt0Var.c().k());
            yth0VarN.q(njt0Var.c().b());
            yth0VarN.t(njt0Var.c().l());
            yth0VarN.n(njt0Var.c().a());
            yth0VarN.v(njt0Var.c().n());
            yth0VarN.E(njt0Var.a().b());
            yth0VarN.r(njt0Var.a().a());
            MediaPlaybackPlay mediaPlaybackPlayBuild = yth0VarN.build();
            mediaPlaybackPlayBuild.getClass();
            t2j0Var.a(mediaPlaybackPlayBuild);
            return;
        }
        if (ufp0Var instanceof y9s0) {
            y9s0 y9s0Var = (y9s0) ufp0Var;
            xth0 xth0VarN = MediaPlaybackPause.n();
            xth0VarN.B(y9s0Var.b().d());
            xth0VarN.y(y9s0Var.b().c());
            xth0VarN.F(y9s0Var.b().e());
            xth0VarN.s(y9s0Var.b().a());
            xth0VarN.x(y9s0Var.b().b());
            xth0VarN.D(y9s0Var.c().f());
            xth0VarN.J(y9s0Var.c().j().toLowerCase(Locale.US));
            if (y9s0Var.c().i().length() > 0) {
                xth0VarN.I(y9s0Var.c().i());
            }
            xth0VarN.z(y9s0Var.c().d());
            xth0VarN.A();
            xth0VarN.H(y9s0Var.c().h());
            xth0VarN.u(y9s0Var.c().m());
            xth0VarN.w(y9s0Var.c().c());
            xth0VarN.C(y9s0Var.c().e());
            xth0VarN.G(y9s0Var.c().g());
            xth0VarN.K(y9s0Var.c().k());
            xth0VarN.q(y9s0Var.c().b());
            xth0VarN.t(y9s0Var.c().l());
            xth0VarN.n(y9s0Var.c().a());
            xth0VarN.v(y9s0Var.c().n());
            xth0VarN.E(y9s0Var.a().b());
            xth0VarN.r(y9s0Var.a().a());
            MediaPlaybackPause mediaPlaybackPauseBuild = xth0VarN.build();
            mediaPlaybackPauseBuild.getClass();
            t2j0Var.a(mediaPlaybackPauseBuild);
            return;
        }
        if (ufp0Var instanceof tn51) {
            tn51 tn51Var = (tn51) ufp0Var;
            buh0 buh0VarN = MediaPlaybackSeekStart.n();
            buh0VarN.B(tn51Var.b().d());
            buh0VarN.y(tn51Var.b().c());
            buh0VarN.H(tn51Var.b().e());
            buh0VarN.s(tn51Var.b().a());
            buh0VarN.x(tn51Var.b().b());
            buh0VarN.D(tn51Var.c().f());
            buh0VarN.L(tn51Var.c().j().toLowerCase(Locale.US));
            if (tn51Var.c().i().length() > 0) {
                buh0VarN.K(tn51Var.c().i());
            }
            buh0VarN.z(tn51Var.c().d());
            buh0VarN.A();
            buh0VarN.J(tn51Var.c().h());
            buh0VarN.u(tn51Var.c().m());
            buh0VarN.w(tn51Var.c().c());
            buh0VarN.C(tn51Var.c().e());
            buh0VarN.I(tn51Var.c().g());
            buh0VarN.M(tn51Var.c().k());
            buh0VarN.q(tn51Var.c().b());
            buh0VarN.t(tn51Var.c().l());
            buh0VarN.n(tn51Var.c().a());
            buh0VarN.v(tn51Var.c().n());
            buh0VarN.G(tn51Var.a().b());
            buh0VarN.r(tn51Var.a().a());
            buh0VarN.F(tn51Var.e());
            buh0VarN.E(tn51Var.d());
            MediaPlaybackSeekStart mediaPlaybackSeekStartBuild = buh0VarN.build();
            mediaPlaybackSeekStartBuild.getClass();
            t2j0Var.a(mediaPlaybackSeekStartBuild);
            return;
        }
        if (ufp0Var instanceof jm51) {
            jm51 jm51Var = (jm51) ufp0Var;
            auh0 auh0VarN = MediaPlaybackSeekEnd.n();
            auh0VarN.B(jm51Var.b().d());
            auh0VarN.y(jm51Var.b().c());
            auh0VarN.H(jm51Var.b().e());
            auh0VarN.s(jm51Var.b().a());
            auh0VarN.x(jm51Var.b().b());
            auh0VarN.D(jm51Var.c().f());
            auh0VarN.L(jm51Var.c().j().toLowerCase(Locale.US));
            if (jm51Var.c().i().length() > 0) {
                auh0VarN.K(jm51Var.c().i());
            }
            auh0VarN.z(jm51Var.c().d());
            auh0VarN.A();
            auh0VarN.J(jm51Var.c().h());
            auh0VarN.u(jm51Var.c().m());
            auh0VarN.w(jm51Var.c().c());
            auh0VarN.C(jm51Var.c().e());
            auh0VarN.I(jm51Var.c().g());
            auh0VarN.M(jm51Var.c().k());
            auh0VarN.q(jm51Var.c().b());
            auh0VarN.t(jm51Var.c().l());
            auh0VarN.n(jm51Var.c().a());
            auh0VarN.v(jm51Var.c().n());
            auh0VarN.G(jm51Var.a().b());
            auh0VarN.r(jm51Var.a().a());
            auh0VarN.F(jm51Var.e());
            auh0VarN.E(jm51Var.d());
            MediaPlaybackSeekEnd mediaPlaybackSeekEndBuild = auh0VarN.build();
            mediaPlaybackSeekEndBuild.getClass();
            t2j0Var.a(mediaPlaybackSeekEndBuild);
            return;
        }
        if (ufp0Var instanceof dia) {
            dia diaVar = (dia) ufp0Var;
            gth0 gth0VarN = MediaPlaybackBeacon.n();
            gth0VarN.E(diaVar.c().d());
            gth0VarN.B(diaVar.c().c());
            gth0VarN.K(diaVar.c().e());
            gth0VarN.v(diaVar.c().a());
            gth0VarN.A(diaVar.c().b());
            gth0VarN.G(diaVar.d().f());
            gth0VarN.O(diaVar.d().j().toLowerCase(Locale.US));
            if (diaVar.d().i().length() > 0) {
                gth0VarN.N(diaVar.d().i());
            }
            gth0VarN.C(diaVar.d().d());
            gth0VarN.D();
            gth0VarN.M(diaVar.d().h());
            gth0VarN.x(diaVar.d().m());
            gth0VarN.z(diaVar.d().c());
            gth0VarN.F(diaVar.d().e());
            gth0VarN.L(diaVar.d().g());
            gth0VarN.R(diaVar.d().k());
            gth0VarN.s(diaVar.d().b());
            gth0VarN.w(diaVar.d().l());
            gth0VarN.q(diaVar.d().a());
            gth0VarN.y(diaVar.d().n());
            gth0VarN.J(diaVar.b().b());
            gth0VarN.t(diaVar.b().a());
            gth0VarN.H(diaVar.a().d());
            gth0VarN.r(diaVar.a().b());
            gth0VarN.I(diaVar.a().e());
            gth0VarN.u(diaVar.a().c());
            gth0VarN.Q(diaVar.a().g());
            gth0VarN.n(diaVar.a().a());
            Long lF = diaVar.a().f();
            if (lF != null) {
                gth0VarN.P(lF.longValue());
            }
            MediaPlaybackBeacon mediaPlaybackBeaconBuild = gth0VarN.build();
            mediaPlaybackBeaconBuild.getClass();
            t2j0Var.a(mediaPlaybackBeaconBuild);
            return;
        }
        if (!(ufp0Var instanceof jww0)) {
            if (!(ufp0Var instanceof ihz)) {
                eg.o();
                return;
            }
            ihz ihzVar = (ihz) ufp0Var;
            sth0 sth0VarN = MediaPlaybackError.n();
            sth0VarN.E(ihzVar.c().d());
            sth0VarN.B(ihzVar.c().c());
            sth0VarN.I(ihzVar.c().e());
            sth0VarN.v(ihzVar.c().a());
            sth0VarN.A(ihzVar.c().b());
            sth0VarN.G(ihzVar.d().f());
            String strJ3 = ihzVar.d().j();
            Locale locale3 = Locale.US;
            sth0VarN.N(strJ3.toLowerCase(locale3));
            if (ihzVar.d().i().length() > 0) {
                sth0VarN.M(ihzVar.d().i());
            }
            sth0VarN.C(ihzVar.d().d());
            sth0VarN.D();
            sth0VarN.L(ihzVar.d().h());
            sth0VarN.x(ihzVar.d().m());
            sth0VarN.z(ihzVar.d().c());
            sth0VarN.F(ihzVar.d().e());
            sth0VarN.K(ihzVar.d().g());
            sth0VarN.O(ihzVar.d().k());
            sth0VarN.q(ihzVar.d().b());
            sth0VarN.w(ihzVar.d().l());
            sth0VarN.n(ihzVar.d().a());
            sth0VarN.y(ihzVar.d().n());
            sth0VarN.H(ihzVar.b().b());
            sth0VarN.r(ihzVar.b().a());
            sth0VarN.u(ihzVar.a().c().toLowerCase(locale3));
            sth0VarN.J(lf51.p(ihzVar.a().d()).toLowerCase(locale3));
            sth0VarN.s(ihzVar.a().a());
            sth0VarN.t(ihzVar.a().b());
            MediaPlaybackError mediaPlaybackErrorBuild = sth0VarN.build();
            mediaPlaybackErrorBuild.getClass();
            t2j0Var.a(mediaPlaybackErrorBuild);
            return;
        }
        jww0 jww0Var = (jww0) ufp0Var;
        zth0 zth0VarN = MediaPlaybackProfileChange.n();
        zth0VarN.K(jww0Var.b().d());
        zth0VarN.H(jww0Var.b().c());
        zth0VarN.O(jww0Var.b().e());
        zth0VarN.y(jww0Var.b().a());
        zth0VarN.G(jww0Var.b().b());
        zth0VarN.M(jww0Var.c().f());
        zth0VarN.S(jww0Var.c().j().toLowerCase(Locale.US));
        if (jww0Var.c().i().length() > 0) {
            zth0VarN.R(jww0Var.c().i());
        }
        zth0VarN.I(jww0Var.c().d());
        zth0VarN.J();
        zth0VarN.Q(jww0Var.c().h());
        zth0VarN.B(jww0Var.c().m());
        zth0VarN.F(jww0Var.c().c());
        zth0VarN.L(jww0Var.c().e());
        zth0VarN.P(jww0Var.c().g());
        zth0VarN.Y(jww0Var.c().k());
        zth0VarN.u(jww0Var.c().b());
        zth0VarN.A(jww0Var.c().l());
        zth0VarN.t(jww0Var.c().a());
        zth0VarN.C(jww0Var.c().n());
        zth0VarN.N(jww0Var.a().b());
        zth0VarN.v(jww0Var.a().a());
        zth0VarN.X(jww0Var.d().n());
        zth0VarN.W(jww0Var.d().m());
        zth0VarN.x(jww0Var.d().f());
        zth0VarN.w(jww0Var.d().e());
        zth0VarN.r(jww0Var.d().c());
        zth0VarN.D(jww0Var.d().h());
        zth0VarN.s(jww0Var.d().d());
        zth0VarN.E(jww0Var.d().i());
        zth0VarN.n(jww0Var.d().a());
        zth0VarN.U(jww0Var.d().k());
        zth0VarN.z(jww0Var.d().g());
        zth0VarN.q(jww0Var.d().b());
        zth0VarN.V(jww0Var.d().l());
        zth0VarN.T(lzu0.h(jww0Var.d().j()).toLowerCase(Locale.ROOT));
        MediaPlaybackProfileChange mediaPlaybackProfileChangeBuild = zth0VarN.build();
        mediaPlaybackProfileChangeBuild.getClass();
        t2j0Var.a(mediaPlaybackProfileChangeBuild);
    }
}
