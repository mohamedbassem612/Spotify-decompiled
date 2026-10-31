package p;

import android.view.View;
import android.view.ViewGroup;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.util.EnumSet;
import java.util.Iterator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class xnf1 implements q570, o570, aac0 {
    public final kly0 a;
    public final i160 b;
    public final rsn0 c;
    public final yzu d;
    public final vku e = new vku();
    public final idd1 f = new idd1(new j4f1(this, (byte) 8));
    public final int g = 2131428628;

    public xnf1(kly0 kly0Var, i160 i160Var, rsn0 rsn0Var, yzu yzuVar) {
        this.a = kly0Var;
        this.b = i160Var;
        this.c = rsn0Var;
        this.d = yzuVar;
    }

    public final int a() {
        return this.g;
    }

    public final View b(ViewGroup viewGroup, l670 l670Var) {
        return ((qzh) this.f.getValue()).getView();
    }

    public final EnumSet c() {
        return EnumSet.of(ix40.c);
    }

    public final void d(View view, y570 y570Var, l670 l670Var, yfu yfuVar) {
        Object next;
        String strB;
        vnf1 vnf1Var;
        String str;
        String str2;
        String str3;
        String strB2;
        String string = view.getResources().getString(2131963339);
        boolean zJ = this.c.j();
        cet0 cet0Var = new cet0(y570Var.g().b("isPlaying", false), new zft0(true, false), null, 4);
        String str4 = y570Var.n().a.a;
        if (str4 == null) {
            str4 = "";
        }
        Iterator it = y570Var.s().iterator();
        do {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
        } while (!u890.j(((y570) next).h().a(), "consumerMobile:entityExplorerButton"));
        y570 y570Var2 = (y570) next;
        HubsImmutableComponentBundle hubsImmutableComponentBundleG = y570Var.g().g("track_info");
        if (hubsImmutableComponentBundleG == null || (strB = hubsImmutableComponentBundleG.B("artist_name")) == null) {
            eg.m("No artist for track header model");
            return;
        }
        String strB3 = hubsImmutableComponentBundleG.B("artist_uri");
        if (strB3 == null) {
            strB3 = "";
        }
        String strB4 = hubsImmutableComponentBundleG.B("album_name");
        if (strB4 == null) {
            strB4 = "";
        }
        ld70 ld70Var = y570Var.k().a.c;
        String str5 = ld70Var != null ? ld70Var.a.c : null;
        boolean zB = y570Var.g().b("isCurated", false);
        boolean zB2 = y570Var.g().b("isBanned", false);
        boolean zB3 = hubsImmutableComponentBundleG.b("show_padlock", false);
        String str6 = str4;
        boolean zB4 = hubsImmutableComponentBundleG.b("is19Plus", false);
        if (y570Var2 != null) {
            String strB5 = y570Var2.b().B("accessibilityText");
            String str7 = strB5 == null ? "" : strB5;
            sc70 sc70Var = (j570) y570Var2.j().get("click");
            String str8 = (sc70Var == null || (strB2 = sc70Var.b.c.B("uri")) == null) ? "" : strB2;
            String strB6 = y570Var2.b().B("videoUrl");
            if (strB6 == null && (strB6 = y570Var2.b().B("manifestId")) == null) {
                strB6 = "";
                str = strB6;
            } else {
                str = "";
            }
            unf1 unf1Var = new unf1(strB6, y570Var2.b().B("manifestId") != null ? 2 : 1);
            ld70 ld70Var2 = y570Var2.k().a.c;
            if (ld70Var2 == null || (str2 = ld70Var2.a.c) == null) {
                str2 = str;
            }
            ld70 ld70Var3 = y570Var2.k().a.c;
            if (ld70Var3 == null || (str3 = ld70Var3.a.d) == null) {
                str3 = str;
            }
            vnf1Var = new vnf1(str7, str8, unf1Var, new tnf1(str2, str3), this.d);
        } else {
            vnf1Var = null;
        }
        snf1 snf1Var = new snf1(str6, strB, string, strB3, strB4, str5, cet0Var, zB, zJ, zB2, zB3, zB4, vnf1Var);
        idd1 idd1Var = this.f;
        ((qzh) idd1Var.getValue()).f(snf1Var);
        ((qzh) idd1Var.getValue()).n(new rsc1(this, snf1Var, y570Var, (byte) 18));
    }

    public final void q(iac0 iac0Var, k8c0 k8c0Var) {
        if (wnf1.a[k8c0Var.ordinal()] == 1) {
            this.e.c();
        }
    }

    public final void e(View view, y570 y570Var, int... iArr) {
    }
}
