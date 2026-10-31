package p;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.widget.LinearLayout;
import com.spotify.recents.uiusecases.singleartworkwithbadge.SingleArtworkWithBadgeView;
import com.spotify.scrollsita.v1.Section;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class d781 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ d781(Object obj, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj) {
        byte b = 6;
        switch (this.a) {
            case 0:
                return ((u0i) ((rt01) this.b).c).a((l0i) null);
            case 1:
                if (d881.a[((e881) obj).ordinal()] != 1) {
                    eg.o();
                    return null;
                }
                yvo0 yvo0Var = (yvo0) this.b;
                iir iirVar = (iir) yvo0Var.c;
                i8h1 i8h1Var = (i8h1) iirVar.b;
                wqk0 wqk0Var = (wqk0) iirVar.c;
                x6h1 x6h1VarC = wqk0Var.c.c();
                x6h1VarC.i.add(new a7h1("discover_more", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((lzn0) yvo0Var.b).f(new dwn0("spotify:find", "", false, false, 0, 0, true, (a690) null, (Bundle) null, new bwn0(i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:find")), x6h1VarC.a(), wqk0Var.b, System.currentTimeMillis()), (xj61) null))));
                return rih1.a;
            case 2:
                return new vm61(2131953422, 2131953421, 2131953420, new bu51((vi11) this.b, (lnm) null, (byte) 3), new um61(new sl11(4, (byte) 7), new n601(oa81.b, (byte) 28), fft0.Z0));
            case 3:
                return new vm61(2131953427, 2131953426, 2131953425, new bu51((e821) this.b, (lnm) null, (byte) 4), new um61(new sl11(5, (byte) 7), new n601(oa81.g, (byte) 28), fft0.Z0));
            case 4:
                id81 id81Var = (id81) obj;
                hd81 hd81Var = (hd81) this.b;
                Object value = hd81Var.a.Y.getValue();
                if (value != null) {
                    return jon1.J(id81Var, new t910((ioj0) value, (rc81) null, (ijo) null, (Boolean) null, Boolean.FALSE, (zau0) null, 1, (pjw0) null, (nbw0) null, (hwt) null, false), hd81Var.d, hd81Var.e, hd81Var.Q0);
                }
                hhg1.n("No metadata when initializing ShowcaseElement");
                return null;
            case 5:
                qv00 qv00Var = (qv00) obj;
                String str = ((id81) this.b).i;
                qv00Var.a(str, pjw0.class, false);
                qv00Var.a(str, nbw0.class, false);
                return rih1.a;
            case 6:
                ((tla) ((ajq0) this.b).e).invoke((String) obj);
                return rih1.a;
            case 7:
                re81 re81Var = (re81) this.b;
                List list = re81.e;
                i8h1 i8h1Var2 = (i8h1) re81Var.a.get();
                r6h1 r6h1Var = r6h1.c;
                y6h1 y6h1Var = y6h1.i;
                x6h1 x6h1VarI = i3o1.i();
                x6h1VarI.h = "music";
                x6h1VarI.a = "mobile-settings-shuffle";
                x6h1VarI.f = "0.1.0";
                x6h1VarI.g = "22.0.0";
                x6h1 x6h1VarC2 = x6h1VarI.a().c();
                x6h1VarC2.i.add(new a7h1("algorithm_section", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                x6h1 x6h1VarC3 = x6h1VarC2.a().c();
                x6h1VarC3.i.add(new a7h1("learn_more_link", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("navigate_to_webview_uri", 1, Collections.singletonMap("destination", "https://support.spotify.com/article/shuffle-play/")), x6h1VarC3.a(), r6h1Var, System.currentTimeMillis()), (xj61) null);
                z710.d((z710) re81Var.b.get(), "https://support.spotify.com/article/shuffle-play/", false, 6);
                return rih1.a;
            case 8:
                wwv0 wwv0Var = (wwv0) obj;
                df81 df81Var = (df81) this.b;
                if (wwv0Var.equals(wwv0.b)) {
                    lzn0 lzn0Var = df81Var.d2;
                    if (lzn0Var == null) {
                        u890.C("navigator");
                        throw null;
                    }
                    lzn0Var.h(xgl.a);
                    df81Var.dismiss();
                } else {
                    if (!wwv0Var.equals(wwv0.a)) {
                        eg.o();
                        return null;
                    }
                    iic0 iic0Var = df81Var.c2;
                    if (iic0Var == null) {
                        u890.C("contentViewBinder");
                        throw null;
                    }
                    iic0Var.a();
                    df81Var.dismiss();
                }
                return rih1.a;
            case 9:
                return new xwm0((rzq) this.b, (byte) 27);
            case 10:
                ((Number) obj).intValue();
                return ((mg81) this.b).d.b();
            case 11:
                boolean zC = ((zg81) this.b).g.c();
                boolean zBooleanValue = ((Boolean) ((vg81) obj).b.getValue()).booleanValue();
                z6x z6xVar = z6x.a;
                ho41 ho41Var = new ho41();
                ho41Var.a = 0;
                return new wg81(z6xVar, false, zC, zBooleanValue, ho41Var);
            case 12:
                ((qtr) obj).b(new k8y0((ngs0) this.b, (lnm) null, (byte) 16));
                return rih1.a;
            case 13:
                ((fq81) this.b).N0().setTitle((String) obj);
                return rih1.a;
            case 14:
                return ((egx) ((rt01) this.b).c).a((l0i) null);
            case 15:
                fkt fktVar = (fkt) obj;
                i3h collectionDrawableProvider = ((SingleArtworkWithBadgeView) this.b).getCollectionDrawableProvider();
                if (collectionDrawableProvider != null) {
                    return collectionDrawableProvider.b(fktVar);
                }
                n57.s("CollectionDrawableProvider not set");
                return new ColorDrawable(0);
            case 16:
                uy81 uy81Var = (uy81) this.b;
                uy81Var.c = ((dlg) obj) instanceof elg ? Long.valueOf(uy81Var.a.e()) : null;
                return rih1.a;
            case 17:
                Throwable th = (Throwable) obj;
                if (th != null) {
                    bpb1 bpb1Var = ((h191) this.b).g;
                    zf20 zf20Var = new zf20(th);
                    bpb1Var.getClass();
                    bpb1Var.m((Object) null, zf20Var);
                }
                Object obj2 = h191.k;
                h191 h191Var = (h191) this.b;
                synchronized (obj2) {
                    h191.j.remove(h191Var.b().getAbsolutePath());
                }
                return rih1.a;
            case 18:
                rwq0.z((qtr) obj, new cq61((a4f0) this.b, (byte) 15));
                return rih1.a;
            case 19:
                Resources resources = ((Context) ((smp0) this.b).c).getResources();
                return new nhb1(resources.getString(2131962556), resources.getString(2131962555), resources.getString(2131962554), resources.getString(2131962553), false, (izh1) null, 96);
            case 20:
                rwq0.z((qtr) obj, new cq61((h791) this.b, (byte) 20));
                return rih1.a;
            case 21:
                ((qtr) obj).b(new pnp0((n991) this.b, (lnm) null, (byte) 26));
                return rih1.a;
            case 22:
                rwq0.z((qtr) obj, new cq61((bs0) this.b, (byte) 21));
                return rih1.a;
            case 23:
                ((qtr) obj).b(new pnp0((t991) this.b, (lnm) null, (byte) 27));
                return rih1.a;
            case 24:
                er91 er91Var = (er91) obj;
                aa91 aa91Var = (aa91) this.b;
                los losVar = aa91Var.c;
                if (er91Var != null) {
                    losVar.c(new iv81(aa91Var, er91Var, (byte) 2));
                }
                losVar.a(ixb.c);
                return rih1.a;
            case 25:
                return ((ja91) this.b).b;
            case 26:
                return new rxc0(((ym91) this.b).a);
            case Section.SONG_DNA_FIELD_NUMBER /* 27 */:
                ((z2s) obj).R(kjf1.class, (vyf1) this.b, fe91.O0, fe91.P0, fe91.Q0, false, yd81.W0);
                return rih1.a;
            case 28:
                qo91 qo91Var = (qo91) ((dxy) this.b).e;
                return qo91Var.b.a((String) obj).flatMap(new c681(qo91Var, b)).flatMapMaybe(y6x0.N0);
            default:
                return (LinearLayout) ((r961) ((w0o) this.b).d).b;
        }
    }
}
