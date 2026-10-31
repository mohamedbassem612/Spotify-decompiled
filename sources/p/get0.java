package p;

import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.player.model.Context;
import com.spotify.player.model.PlayerState;
import com.spotify.player.model.command.options.PlayerOptionOverrides;
import com.spotify.player.model.command.options.PreparePlayOptions;
import io.reactivex.rxjava3.core.Flowable;
import io.reactivex.rxjava3.core.Maybe;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatten;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeToSingle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class get0 implements i570 {
    public final uzd a;
    public final iyc0 b;
    public final Flowable c;
    public final ham d;
    public final e7p0 e;
    public final zr00 f;
    public final gqb0 g;
    public final vku h = new vku();
    public PlayerState i = PlayerState.EMPTY;
    public boolean t;

    public get0(iac0 iac0Var, uzd uzdVar, iyc0 iyc0Var, Flowable flowable, ham hamVar, e7p0 e7p0Var, zr00 zr00Var, gqb0 gqb0Var) {
        this.a = uzdVar;
        this.b = iyc0Var;
        this.c = flowable;
        this.d = hamVar;
        this.e = e7p0Var;
        this.f = zr00Var;
        this.g = gqb0Var;
        iac0Var.getLifecycle().a(new eet0(this, iac0Var, (byte) 0));
    }

    public final void a(j570 j570Var, u570 u570Var) {
        spq0 spq0VarPlayerOptionsOverride;
        PlayerOptionOverrides playerOptionOverrides;
        spq0 spq0VarShufflingContext;
        c710 c710Var = c710.W0;
        e710 e710Var = e710.Y0;
        y570 y570Var = u570Var.b;
        j380 j380Var = u570Var.c;
        sc70 sc70Var = (sc70) j570Var;
        String strB = sc70Var.a().B("uri");
        boolean zB = sc70Var.a().b("openNPV", false);
        if (strB == null || strB.length() == 0) {
            return;
        }
        Context contextM = gyo1.M(sc70Var.a());
        String strUri = contextM != null ? contextM.uri() : null;
        Object obj = j380Var.get("shouldPlay");
        Boolean bool = obj instanceof Boolean ? (Boolean) obj : null;
        Boolean bool2 = Boolean.TRUE;
        boolean zJ = u890.j(bool, bool2);
        Object obj2 = j380Var.get("navigateToNpv");
        boolean zJ2 = u890.j(obj2 instanceof Boolean ? (Boolean) obj2 : null, bool2);
        Object obj3 = j380Var.get("refreshPlaylist");
        boolean zJ3 = u890.j(obj3 instanceof Boolean ? (Boolean) obj3 : null, bool2);
        String strB2 = y570Var.g().B("restriction");
        boolean z = (strB2 != null ? qqn1.o(strB2) : 0) != 0;
        HubsImmutableComponentBundle hubsImmutableComponentBundleR = y570Var.r();
        tjm tjmVarN = this.d.n(strB);
        boolean zEquals = strB.equals(o4p1.o(this.i));
        uzd uzdVar = this.a;
        vku vkuVar = this.h;
        if (zEquals && u890.j(this.i.contextUri(), strUri)) {
            if (!zJ) {
                vkuVar.a(tjmVarN.a().subscribe());
                uzdVar.a(hubsImmutableComponentBundleR, strB);
                return;
            }
            Single singleC = c(tjmVarN, strUri, zJ3);
            ou80 ou80Var = uzdVar.c(hubsImmutableComponentBundleR, strB).a;
            if (zB) {
                vkuVar.a(singleC.flatMap(e710Var).filter(d710.Y0).subscribe(new fet0(this, ou80Var, z, (byte) 1)));
                return;
            }
            if (!zJ2) {
                vkuVar.a(singleC.flatMap(e710Var).subscribe());
                return;
            }
            Maybe maybeFilter = singleC.flatMap(e710Var).filter(c710Var);
            zhq0 zhq0Var = new zhq0(this, strB, (byte) 23);
            maybeFilter.getClass();
            vkuVar.a(new MaybeFlatten(maybeFilter, zhq0Var).subscribe(new fet0(this, ou80Var, z, (byte) 0)));
            return;
        }
        if (contextM != null) {
            if (!zJ) {
                vkuVar.a(tjmVarN.a().subscribe());
                uzdVar.a(hubsImmutableComponentBundleR, strB);
                return;
            }
            PreparePlayOptions preparePlayOptionsN = gyo1.N(sc70Var.a());
            tv80 tv80VarD = (preparePlayOptionsN == null || (spq0VarPlayerOptionsOverride = preparePlayOptionsN.playerOptionsOverride()) == null || (playerOptionOverrides = (PlayerOptionOverrides) spq0VarPlayerOptionsOverride.h()) == null || (spq0VarShufflingContext = playerOptionOverrides.shufflingContext()) == null) ? false : u890.j(spq0VarShufflingContext.h(), bool2) ? uzdVar.d(hubsImmutableComponentBundleR, strB) : uzdVar.b(hubsImmutableComponentBundleR, strB);
            ou80 ou80Var2 = tv80VarD.a;
            sjm sjmVar = new sjm(strB, contextM, preparePlayOptionsN, tv80VarD);
            Single singleC2 = c(tjmVarN, contextM.uri(), zJ3);
            if (zB) {
                vkuVar.a(singleC2.flatMap(new qkn0(sjmVar, (byte) 17)).filter(o810.X0).subscribe(new fet0(this, ou80Var2, z, (byte) 2)));
                return;
            }
            if (!zJ2) {
                vkuVar.a(singleC2.flatMap(new qkn0(sjmVar, (byte) 17)).subscribe());
                return;
            }
            Maybe maybeFilter2 = singleC2.flatMap(new qkn0(sjmVar, (byte) 17)).filter(c710Var);
            zhq0 zhq0Var2 = new zhq0(this, strB, (byte) 23);
            maybeFilter2.getClass();
            vkuVar.a(new MaybeFlatten(maybeFilter2, zhq0Var2).subscribe(new fet0(this, ou80Var2, z, (byte) 0)));
        }
    }

    public final void b(ou80 ou80Var, boolean z) {
        if (z && this.t) {
            return;
        }
        e7p0.d(this.e, ou80Var);
    }

    public final Single c(tjm tjmVar, String str, boolean z) {
        if (!z || str == null) {
            Single singleFromSupplier = Single.fromSupplier(new yj1(tjmVar, (byte) 19));
            singleFromSupplier.getClass();
            return singleFromSupplier;
        }
        Maybe maybeFilter = rqt0.F(igu.b, new f3t0(this, str, (lnm) null, (byte) 5)).filter(yb10.Y0);
        maybeFilter.getClass();
        Single map = new MaybeToSingle(maybeFilter, (Object) null).map(new ewn0(tjmVar, (byte) 21));
        map.getClass();
        return map;
    }
}
