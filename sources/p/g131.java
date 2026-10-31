package p;

import android.os.Bundle;
import io.reactivex.rxjava3.core.Single;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g131 implements vdh {
    public final zx4 a;
    public final r8l b;
    public final x610 c;

    public g131(zx4 zx4Var, r8l r8lVar, x610 x610Var) {
        this.a = zx4Var;
        this.b = r8lVar;
        this.c = x610Var;
    }

    @Override // p.vdh
    public final boolean a(String str) {
        return "check_restrictions".equals(str);
    }

    @Override // p.vdh
    public final Single b(Bundle bundle) {
        eeh eehVar;
        eeh eehVarZ;
        if (bundle == null) {
            return Single.just(fq7.z("Extras are null"));
        }
        String string = bundle.getString("com.spotify.music.extra.PACKAGE_NAME");
        if (string == null) {
            return Single.just(fq7.z("package name required"));
        }
        if (this.a.d()) {
            qro1 qro1VarA = this.c.a.l.a(this.b.a(string));
            if (qro1VarA instanceof k610) {
                eehVarZ = fq7.z("Restriction id is not available");
            } else {
                String strP = qro1VarA.p();
                eehVar = new eeh(1, pzm.g("com.spotify.music.extra.IS_RESTRICTED", !(strP == null || ihc1.y0(strP))));
            }
            return Single.just(eehVarZ).onErrorReturn(a4x0.h);
        }
        eehVar = new eeh(1, pzm.g("com.spotify.music.extra.IS_RESTRICTED", false));
        eehVarZ = eehVar;
        return Single.just(eehVarZ).onErrorReturn(a4x0.h);
    }

    @Override // p.vdh
    public final String c() {
        return "check_restrictions";
    }
}
