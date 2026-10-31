package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import com.spotify.voiceassistants.playermodels.CommandPlayRequest;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.List;
import java.util.Objects;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class b13 implements lxh0 {
    public final v7s a;
    public final qna1 b;
    public final j2e0 c;
    public final r8l d;
    public final s610 e;
    public final Function0 f;

    public b13(g8q g8qVar, qna1 qna1Var, j2e0 j2e0Var, r8l r8lVar, g0l g0lVar, x610 x610Var, PlayOrigin playOrigin) {
        this(g8qVar.b(x610Var, playOrigin, 1), qna1Var, j2e0Var, r8lVar, (s610) x610Var.a.b.get(), new g82(g0lVar, (byte) 5));
    }

    public final Completable a(long j, String str) {
        return this.a.a(j, str);
    }

    public final Completable b(String str, Uri uri, Bundle bundle) {
        Objects.toString(uri);
        if (uri == null) {
            hhg1.n("Uri must not be null");
            return null;
        }
        m210 m210VarA = this.d.a(str);
        return this.b.a(new CommandPlayRequest(uri.toString(), (String) this.f.invoke(), true)).map(mm10.X).flatMapCompletable(new gid(this, m210VarA, (byte) 24));
    }

    public final Completable c(String str) {
        return this.a.c(str);
    }

    public final Completable d(long j, String str) {
        return this.a.d(j, str);
    }

    public final Completable e(String str) {
        return this.a.e(str);
    }

    public final boolean f(String str) {
        this.a.getClass();
        return false;
    }

    public final Completable g(String str, String str2, Bundle bundle) {
        return this.a.g(str, str2, bundle);
    }

    public final Completable h(int i, String str) {
        return this.a.h(i, str);
    }

    public final Completable i(String str, String str2, Bundle bundle) {
        return this.a.i(str, str2, bundle);
    }

    public final Single j(Bundle bundle, String str) {
        return this.a.j(bundle, str);
    }

    public final Completable k(String str) {
        return this.a.k(str);
    }

    public final Completable l(String str, y0i0 y0i0Var) {
        return this.a.l(str, y0i0Var);
    }

    public final List m() {
        return this.a.m();
    }

    public final Completable n(int i, String str) {
        return this.a.n(i, str);
    }

    public final Completable o(String str) {
        return this.a.o(str);
    }

    public final Completable p(String str) {
        return this.a.p(str);
    }

    public final Completable q(String str, Uri uri, Bundle bundle) {
        return this.a.q(str, uri, bundle);
    }

    public final Completable r(int i, Bundle bundle, String str, String str2) {
        return this.a.r(i, bundle, str, str2);
    }

    public b13(v7s v7sVar, qna1 qna1Var, j2e0 j2e0Var, r8l r8lVar, s610 s610Var, Function0 function0) {
        this.a = v7sVar;
        this.b = qna1Var;
        this.c = j2e0Var;
        this.d = r8lVar;
        this.e = s610Var;
        this.f = function0;
    }
}
