package p;

import android.net.Uri;
import android.os.Bundle;
import com.spotify.player.model.PlayOrigin;
import io.reactivex.rxjava3.core.Completable;
import io.reactivex.rxjava3.core.Single;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class pyq0 implements lxh0 {
    public final x610 a;
    public final v7s b;
    public final iyq0 c;

    public pyq0(x610 x610Var, PlayOrigin playOrigin, fjq fjqVar, g8q g8qVar) {
        iyq0 iyq0Var;
        v7s v7sVarB = g8qVar.b(x610Var, playOrigin, 1);
        this.a = x610Var;
        this.b = v7sVarB;
        switch (fjqVar.a) {
            case 0:
                ojq ojqVar = (ojq) ((obq) fjqVar.b).d;
                iyq0Var = new iyq0(x610Var, (op8) ojqVar.W0.get(), new abt(ojqVar.b()), new jz11(), (gjq) ojqVar.X0.get(), (hjq) ojqVar.Y0.get());
                break;
            default:
                ojq ojqVar2 = (ojq) ((obq) fjqVar.b).d;
                iyq0Var = new iyq0(x610Var, (op8) ojqVar2.W0.get(), new abt(ojqVar2.b()), new jz11(), (gjq) ojqVar2.X0.get(), (hjq) ojqVar2.Y0.get());
                break;
        }
        this.c = iyq0Var;
    }

    public final Completable a(long j, String str) {
        return this.b.a(j, str);
    }

    public final Completable b(String str, Uri uri, Bundle bundle) {
        return this.b.b(str, uri, bundle);
    }

    public final Completable c(String str) {
        return this.b.c(str);
    }

    public final Completable d(long j, String str) {
        return this.b.d(j, str);
    }

    public final Completable e(String str) {
        return this.b.e(str);
    }

    public final boolean f(String str) {
        Set set = this.c.b;
        if ((set instanceof Collection) && set.isEmpty()) {
            return false;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            if (((vdh) it.next()).a(str)) {
                return true;
            }
        }
        return false;
    }

    public final Completable g(String str, String str2, Bundle bundle) {
        return this.b.g(str, str2, bundle);
    }

    public final Completable h(int i, String str) {
        return this.b.h(i, str);
    }

    public final Completable i(String str, String str2, Bundle bundle) {
        return this.b.i(str, str2, bundle);
    }

    public final Single j(Bundle bundle, String str) {
        Object next;
        Single singleB;
        Iterator it = this.c.b.iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!((vdh) next).a(str));
        vdh vdhVar = (vdh) next;
        if (vdhVar != null && (singleB = vdhVar.b(bundle)) != null) {
            return singleB;
        }
        eg.m("No command handler exist to deal with command");
        return null;
    }

    public final Completable k(String str) {
        return this.b.k(str);
    }

    public final Completable l(String str, y0i0 y0i0Var) {
        return this.b.l(str, y0i0Var);
    }

    public final List m() {
        Set set = this.c.b;
        ArrayList arrayList = new ArrayList(q7h.U(set, 10));
        Iterator it = set.iterator();
        while (it.hasNext()) {
            arrayList.add(((vdh) it.next()).c());
        }
        return arrayList;
    }

    public final Completable n(int i, String str) {
        return this.b.n(i, str);
    }

    public final Completable o(String str) {
        return this.b.o(str);
    }

    public final Completable p(String str) {
        return this.a.c().k.a(new p9u0()).ignoreElement();
    }

    public final Completable q(String str, Uri uri, Bundle bundle) {
        return this.b.q(str, uri, bundle);
    }

    public final Completable r(int i, Bundle bundle, String str, String str2) {
        if ((bundle != null ? bundle.getString("com.spotify.music.extra.CONTEXT_URI") : null) != null) {
            bundle.putBoolean("com.spotify.music.extra.ALWAYS_PLAY_SOMETHING", true);
        }
        return this.b.r(i, bundle, str, str2);
    }
}
