package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.player.model.command.SetShufflingContextCommand;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.completable.CompletableEmpty;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class bkv implements lxh0 {
    public final x610 a;
    public final g510 b;
    public final r8l c;
    public final b791 d;
    public final s24 e;

    public bkv(x610 x610Var, g510 g510Var, r8l r8lVar, b791 b791Var, d8q d8qVar) {
        this.a = x610Var;
        this.b = g510Var;
        this.c = r8lVar;
        this.d = b791Var;
        this.e = d8qVar.a(x610Var);
    }

    public final Completable a(long j, String str) {
        return this.b.l(j, this.c.a(str)).map(yjv.a).flatMap(new o0g(this, j, (byte) 2)).ignoreElement();
    }

    public final Completable b(String str, Uri uri, Bundle bundle) {
        Logger.d("MediaSessionCallback.onPlayFromUri - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public final Completable c(String str) {
        return this.b.o(this.c.a(str)).map(akv.a).flatMapCompletable(new ogr(this, (byte) 20));
    }

    public final Completable d(long j, String str) {
        return this.d.a((int) j, this.c.a(str));
    }

    public final Completable e(String str) {
        return this.b.d(this.c.a(str)).map(wjv.a).flatMapCompletable(new rmr(this, (byte) 19));
    }

    public final boolean f(String str) {
        return false;
    }

    public final Completable g(String str, String str2, Bundle bundle) {
        try {
            return this.e.F(str2, bundle, this.c.a(str));
        } catch (IllegalArgumentException e) {
            Logger.e(e, "Media action %s is not supported", new Object[]{str2});
            return CompletableEmpty.a;
        }
    }

    public final Completable h(int i, String str) {
        Logger.d("MediaSessionCallback.onSetRating - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public final Completable i(String str, String str2, Bundle bundle) {
        Logger.d("MediaSessionCallback.onPlayFromSearch - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public final Single j(Bundle bundle, String str) {
        Logger.d("MediaSessionCallback.onCommand - not implemented for %s!", new Object[]{str});
        return Single.never();
    }

    public final Completable k(String str) {
        return this.b.n(this.c.a(str)).map(zjv.a).flatMapCompletable(new tzo(this, (byte) 22));
    }

    public final Completable l(String str, y0i0 y0i0Var) {
        m210 m210VarA = this.c.a(str);
        int iOrdinal = y0i0Var.ordinal();
        g510 g510Var = this.b;
        x610 x610Var = this.a;
        if (iOrdinal == 0) {
            return x610Var.c().k(1).ignoreElement().q(g510Var.h(m210VarA).ignoreElement());
        }
        if (iOrdinal == 1) {
            return x610Var.c().k(3).ignoreElement().q(g510Var.i(m210VarA).ignoreElement());
        }
        if (iOrdinal == 2) {
            return x610Var.c().k(2).ignoreElement().q(g510Var.g(m210VarA).ignoreElement());
        }
        eg.o();
        return null;
    }

    public final List m() {
        return z6x.a;
    }

    public final Completable n(int i, String str) {
        m210 m210VarA = this.c.a(str);
        int iC = l1d.C(i);
        g510 g510Var = this.b;
        x610 x610Var = this.a;
        if (iC == 0) {
            g710 g710VarC = x610Var.c();
            Completable completableQ = g710VarC.j.d(SetShufflingContextCommand.create(false)).ignoreElement().q(g510Var.m(m210VarA, 2, 1).ignoreElement());
            completableQ.getClass();
            return completableQ;
        }
        if (iC != 1) {
            eg.o();
            return null;
        }
        g710 g710VarC2 = x610Var.c();
        Completable completableQ2 = g710VarC2.j.d(SetShufflingContextCommand.create(true)).ignoreElement().q(g510Var.m(m210VarA, 1, 2).ignoreElement());
        completableQ2.getClass();
        return completableQ2;
    }

    public final Completable o(String str) {
        return this.b.j(this.c.a(str)).map(xjv.a).flatMapCompletable(new efr(this, (byte) 19));
    }

    public final Completable p(String str) {
        return this.a.c().d(j5.a).ignoreElement();
    }

    public final Completable q(String str, Uri uri, Bundle bundle) {
        Logger.d("MediaSessionCallback.onPrepareFromUri - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }

    public final Completable r(int i, Bundle bundle, String str, String str2) {
        Logger.d("MediaSessionCallback.onPlayFromMediaId - not implemented for %s!", new Object[]{str});
        return CompletableEmpty.a;
    }
}
