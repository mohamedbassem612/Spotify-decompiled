package p;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import com.spotify.legacyglue.gluelib.components.trackcloud.a;
import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.Objects;
import java.util.Random;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class w870 extends f770 {
    public final /* synthetic */ byte d = 0;
    public final Object e;

    public w870() {
        super(EnumSet.of(ix40.h), a.class, (byte) 0);
        this.e = new Random();
    }

    @Override // p.f770
    public final void f(nx40 nx40Var, y570 y570Var, l670 l670Var, yfu yfuVar) {
        byte b = this.d;
        Object obj = this.e;
        String str = "";
        switch (b) {
            case 0:
                a aVar = (a) nx40Var;
                HubsImmutableComponentBundle[] hubsImmutableComponentBundleArrH = y570Var.g().h("tracks");
                String str2 = ((id70) y570Var.n()).a.a;
                boolean zB = y570Var.g().b("showArtists", true);
                int iN = y570Var.g().n(10, "maxTracksToShow");
                boolean zB2 = y570Var.g().b("showHearts", false);
                boolean zB3 = y570Var.g().b("showNumbers", false);
                boolean zB4 = y570Var.g().b("shuffle", false);
                int iN2 = y570Var.g().n(3, "maxLines");
                String strF = y570Var.g().F("ellipsis", "");
                boolean zB5 = y570Var.g().b("leftAligned", false);
                if (hubsImmutableComponentBundleArrH != null) {
                    int length = hubsImmutableComponentBundleArrH.length;
                    n3p1.j(length, "initialArraySize");
                    ArrayList arrayList = new ArrayList(length);
                    int length2 = hubsImmutableComponentBundleArrH.length;
                    int i = 0;
                    while (i < length2) {
                        int i2 = length2;
                        HubsImmutableComponentBundle hubsImmutableComponentBundle = hubsImmutableComponentBundleArrH[i];
                        arrayList.add(new ykf1(hubsImmutableComponentBundle.F("trackName", str), hubsImmutableComponentBundle.b("isHearted", false), hubsImmutableComponentBundle.F("artistName", str), hubsImmutableComponentBundle.b("isEnabled", true)));
                        i++;
                        length2 = i2;
                        str = str;
                        aVar = aVar;
                        strF = strF;
                    }
                    a aVar2 = aVar;
                    String str3 = strF;
                    if (zB4) {
                        v870 v870Var = (v870) yfuVar.e(y570Var);
                        if (v870Var == null) {
                            v870Var = new v870(((Random) obj).nextInt());
                            yfuVar.r(y570Var, v870Var);
                        }
                        Collections.shuffle(arrayList, new Random(v870Var.a));
                    }
                    uwd uwdVarA = uwd.a();
                    Objects.requireNonNull(str2);
                    uwdVarA.g = str2;
                    uwdVarA.i = arrayList;
                    uwdVarA.b = zB;
                    uwdVarA.e = iN;
                    uwdVarA.c = zB2;
                    uwdVarA.d = zB3;
                    uwdVarA.a = iN2;
                    uwdVarA.f = zB5;
                    uwdVarA.h = str3;
                    aVar2.a(uwdVarA);
                    ViewGroup viewGroup = aVar2.c;
                    ywo1.i(viewGroup);
                    two1.r(l670Var, viewGroup, y570Var);
                    if (y570Var.j().containsKey("longClick")) {
                        o670 o670Var = new o670(l670Var.c);
                        o670Var.c("longClick");
                        o670Var.g(y570Var);
                        o670Var.f(viewGroup);
                        o670Var.e();
                    }
                }
                break;
            default:
                wx31 wx31Var = (wx31) nx40Var;
                String str4 = ((id70) y570Var.n()).a.a;
                String str5 = ((id70) y570Var.n()).a.b;
                String str6 = ((id70) y570Var.n()).a.c;
                ld70 ld70Var = ((dd70) y570Var.k()).a.c;
                n57.j(!jhc1.F(str4), "title not set");
                n57.j(!jhc1.F(str5), "subtitle not set");
                n57.j(!jhc1.F(str6), "accesory not set");
                n57.j(ld70Var != null, "main image not set");
                wx31Var.setTitle(str4);
                View view = wx31Var.a;
                String str7 = ((id70) y570Var.n()).a.b;
                if (jhc1.F(str7)) {
                    wx31Var.setSubtitle(null);
                } else if (y570Var.g().F("subtitleStyle", "").equals("metadata")) {
                    wx31Var.m(str7);
                } else {
                    wx31Var.setSubtitle(str7);
                }
                wx31Var.f.setText(str6);
                ImageView imageView = wx31Var.e;
                fe70 fe70Var = (fe70) obj;
                if (ld70Var == null) {
                    fe70Var.a(imageView);
                    imageView.setImageDrawable(null);
                } else {
                    kd70 kd70Var = ld70Var.a;
                    Drawable drawableB = fe70Var.b(kd70Var.d);
                    String str8 = kd70Var.c;
                    hl00 hl00Var = fe70Var.c;
                    hl00Var.b(imageView);
                    gw70 gw70Var = (gw70) hl00Var.b;
                    if (TextUtils.isEmpty(str8)) {
                        str8 = null;
                    }
                    ixg ixgVarF = gw70Var.f(str8);
                    ixgVarF.m(drawableB);
                    ixgVarF.f(drawableB);
                    ixgVarF.k(imageView, (ird1) null);
                }
                wx31Var.setActive(y570Var.g().b("active", false));
                ywo1.i(view);
                two1.r(l670Var, view, y570Var);
                if (y570Var.j().containsKey("longClick")) {
                    o670 o670Var2 = new o670(l670Var.c);
                    o670Var2.c("longClick");
                    o670Var2.g(y570Var);
                    o670Var2.f(view);
                    o670Var2.e();
                }
                axo1.f(wx31Var, y570Var, l670Var);
                break;
        }
    }

    @Override // p.f770
    public final nx40 g(Context context, ViewGroup viewGroup, l670 l670Var) {
        switch (this.d) {
            case 0:
                a aVar = new a(context, viewGroup);
                aVar.c.setTag(2131429011, aVar);
                return aVar;
            default:
                s7s0 s7s0VarR = t890.r(context, viewGroup, 2131625041);
                wx31 wx31Var = new wx31(s7s0VarR);
                s7s0VarR.setTag(2131429011, wx31Var);
                return wx31Var;
        }
    }

    public w870(fe70 fe70Var) {
        super(EnumSet.of(ix40.h), wx31.class, (byte) 0);
        fe70Var.getClass();
        this.e = fe70Var;
    }
}
