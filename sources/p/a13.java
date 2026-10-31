package p;

import android.os.Bundle;
import com.spotify.aipartner.aipartnerapi.proto.ResolveIntentRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import java.util.UUID;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a13 implements vih0 {
    public final nba a;
    public final kdy0 b;
    public final uxy0 c;
    public final myy d;
    public final g510 e;
    public final r8l f;
    public final mct0 g;
    public final q8n h;

    public a13(ruk rukVar, x610 x610Var, lxh0 lxh0Var, mct0 mct0Var, kdy0 kdy0Var, uxy0 uxy0Var, kjq kjqVar, myy myyVar, g510 g510Var, r8l r8lVar, q8n q8nVar) {
        this.a = kjqVar.b(rukVar, x610Var, lxh0Var);
        this.b = kdy0Var;
        this.c = uxy0Var;
        this.d = myyVar;
        this.e = g510Var;
        this.f = r8lVar;
        this.g = mct0Var;
        this.h = q8nVar;
    }

    public final Set a() {
        return this.a.a();
    }

    public final void b(vsr0 vsr0Var) {
        this.a.b(vsr0Var);
    }

    public final void c(vsr0 vsr0Var, Bundle bundle, iu30 iu30Var) {
        this.a.c(vsr0Var, bundle, iu30Var);
    }

    public final void d(String str, Bundle bundle, String str2, q1m q1mVar, iu30 iu30Var, vu30 vu30Var, Function0 function0) {
        String str3;
        if (str.length() == 0) {
            str3 = str2;
        } else {
            str3 = str2;
            m210 m210VarA = this.f.a(str3);
            g510 g510Var = this.e;
            g510Var.r(m210VarA, g510Var.h.u(), (w7h1) null);
        }
        Bundle bundleK = oto1.k(bundle, p7h.M(new String[]{"com.spotify.music.extras.TARGET_DEVICE", "com.spotify.music.extras.QUERY_TYPE"}), vu30Var);
        if (bundleK == null) {
            return;
        }
        String string = bundleK.getString("com.spotify.music.extras.QUERY_LANGUAGE");
        String strA = string != null ? w45.a("_", Locale.forLanguageTag(string)) : upn1.m();
        Integer numT = oto1.t(bundleK, "com.spotify.music.extras.QUERY_TYPE");
        ArrayList<Integer> integerArrayList = bundleK.getIntegerArrayList("com.spotify.music.extras.QUERY_RESTRICTIONS");
        List listL1 = integerArrayList != null ? o7h.l1(integerArrayList) : z6x.a;
        Integer numT2 = oto1.t(bundleK, "com.spotify.music.extras.LIMIT");
        Integer numT3 = oto1.t(bundleK, "com.spotify.music.extras.MEDIA_TYPE");
        String string2 = bundleK.getString("com.spotify.music.extras.AI_SEARCH_REQUEST_ID");
        if (string2 == null) {
            string2 = UUID.randomUUID().toString();
        }
        ResolveIntentRequest resolveIntentRequestB = this.c.b(str, numT, strA, listL1, numT2, this.g, numT3, string2, bundleK.getInt("com.spotify.music.extras.TARGET_DEVICE", Integer.MIN_VALUE));
        resolveIntentRequestB.toString();
        fn31.T(smo1.e(this.h), (o8n) null, 0, new zn0(this, resolveIntentRequestB, str3, q1mVar, function0, iu30Var, vu30Var, (lnm) null, (byte) 3), 3);
    }

    public final void destroy() {
        this.a.destroy();
    }

    public final vsr0 e() {
        return this.a.a.c();
    }

    public final lxh0 f() {
        return this.a.c;
    }

    public final long g() {
        return this.a.n;
    }

    public final boolean h() {
        return this.a.h();
    }

    public final void i(vsr0 vsr0Var) {
        this.a.i(vsr0Var);
    }

    public final void j(vsr0 vsr0Var) {
        this.a.j(vsr0Var);
    }

    public final boolean k() {
        return this.a.k();
    }

    public final String l() {
        return this.a.a.b();
    }
}
