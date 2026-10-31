package p;

import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.ui.platform.ComposeView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewpager2.widget.ViewPager2;
import com.spotify.watchfeed.discovery.pivotinghostpage.NineBySixteenAspectRatioConstraintLayout;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class g4t0 implements l4h1 {
    public final o7r0 a;
    public final lik1 b;
    public final abu c;
    public final dbu d;
    public final dg30 e;
    public final fal1 f;
    public final j4t0 g;
    public final fq10 h;
    public final vi11 i;
    public final i4t0 j;
    public final jxp0 k;
    public final cir0 l;
    public final hcl1 m;
    public final bcl1 n;
    public final q9l1 o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final v7m0 f14p;
    public final hcl1 q;
    public final lxp r;
    public final q9l1 s;

    public g4t0(o7r0 o7r0Var, lik1 lik1Var, abu abuVar, dbu dbuVar, dg30 dg30Var, fal1 fal1Var, j4t0 j4t0Var, fq10 fq10Var, vi11 vi11Var, i4t0 i4t0Var, jxp0 jxp0Var, cir0 cir0Var, hcl1 hcl1Var, bcl1 bcl1Var, q9l1 q9l1Var, v7m0 v7m0Var, hcl1 hcl1Var2, lxp lxpVar, q9l1 q9l1Var2) {
        this.a = o7r0Var;
        this.b = lik1Var;
        this.c = abuVar;
        this.d = dbuVar;
        this.e = dg30Var;
        this.f = fal1Var;
        this.g = j4t0Var;
        this.h = fq10Var;
        this.i = vi11Var;
        this.j = i4t0Var;
        this.k = jxp0Var;
        this.l = cir0Var;
        this.m = hcl1Var;
        this.n = bcl1Var;
        this.o = q9l1Var;
        this.f14p = v7m0Var;
        this.q = hcl1Var2;
        this.r = lxpVar;
        this.s = q9l1Var2;
    }

    public final f4h1 a(Context context, LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle, Object obj) {
        ArrayList arrayList;
        fbr0 fbr0Var;
        List<String> pathSegments;
        s9l1 s9l1Var = (s9l1) obj;
        String str = this.b.a;
        dbu dbuVar = this.d;
        abu abuVar = this.c;
        fbr0 fbr0Var2 = new fbr0(dbuVar, str, abuVar);
        r3t0 r3t0Var = s9l1Var.e;
        jxp0 jxp0Var = this.k;
        if (r3t0Var != null) {
            h290<String> h290Var = r3t0Var.a;
            arrayList = new ArrayList();
            for (String str2 : h290Var) {
                Bundle bundle2 = bundle != null ? bundle.getBundle("pivoting_additional_page_parameters") : null;
                abu abuVar2 = bundle2 != null ? (abu) bundle2.getParcelable(str2) : null;
                zhq0 zhq0Var = (zhq0) jxp0Var.b;
                dbu dbuVar2 = (dbu) zhq0Var.b;
                if (abuVar2 != null) {
                    fbr0Var = new fbr0(dbuVar2, str2, abuVar2);
                } else {
                    Set set = s4b1.f;
                    Uri uri = uic.x(str2).a;
                    if (!u890.j((uri == null || (pathSegments = uri.getPathSegments()) == null) ? null : (String) o7h.s0(pathSegments), "watch-feed")) {
                        hhg1.n("No page provider found for uri: ".concat(str2));
                        return null;
                    }
                    xau xauVarW = ((twa) zhq0Var.c).w(uic.x(str2), (Bundle) null, (tv80) null);
                    fbr0Var = xauVarW != null ? new fbr0(dbuVar2, str2, xauVarW) : null;
                }
                if (fbr0Var != null) {
                    arrayList.add(fbr0Var);
                }
            }
        } else {
            arrayList = z6x.a;
        }
        if (arrayList.isEmpty()) {
            abuVar.g();
        }
        ConstraintLayout constraintLayoutInflate = layoutInflater.inflate(2131625377, viewGroup, false);
        int i = 2131428212;
        if (((NineBySixteenAspectRatioConstraintLayout) m5n1.t(constraintLayoutInflate, 2131428212)) != null) {
            i = 2131430229;
            if (m5n1.t(constraintLayoutInflate, 2131430229) != null) {
                i = 2131430230;
                LinearLayout linearLayout = (LinearLayout) m5n1.t(constraintLayoutInflate, 2131430230);
                if (linearLayout != null) {
                    i = 2131430348;
                    ViewPager2 viewPager2T = m5n1.t(constraintLayoutInflate, 2131430348);
                    if (viewPager2T != null) {
                        ConstraintLayout constraintLayout = constraintLayoutInflate;
                        i = 2131431414;
                        TextView textView = (TextView) m5n1.t(constraintLayoutInflate, 2131431414);
                        if (textView != null) {
                            i = 2131431454;
                            ComposeView composeViewT = m5n1.t(constraintLayoutInflate, 2131431454);
                            if (composeViewT != null) {
                                return new f4t0(new phi0(constraintLayout, linearLayout, viewPager2T, constraintLayout, textView, composeViewT, (byte) 11), bundle, o7h.N0(arrayList, Collections.singletonList(fbr0Var2)), this.a, this.e, s9l1Var, this.f, this.g, this.l, this.h, this.i, abuVar, this.j, jxp0Var, this.m, this.n, this.o, this.f14p, this.q, this.r, this.s);
                            }
                        }
                    }
                }
            }
        }
        bhn0.i("Missing required view with ID: ".concat(constraintLayoutInflate.getResources().getResourceName(i)));
        return null;
    }
}
