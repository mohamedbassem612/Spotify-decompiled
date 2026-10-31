package p;

import android.app.Activity;
import android.net.Uri;
import com.spotify.hubs.model.immutable.HubsImmutableComponentBundle;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ndm implements i570 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final i8h1 c;
    public final Object d;
    public final Object e;

    public ndm(Activity activity, i8h1 i8h1Var, ezh1 ezh1Var, c4n0 c4n0Var) {
        this.a = (byte) 2;
        this.d = activity;
        this.c = i8h1Var;
        this.e = ezh1Var;
        this.b = c4n0Var;
    }

    public final void a(j570 j570Var, u570 u570Var) {
        String strI;
        byte b = this.a;
        Object obj = this.e;
        i8h1 i8h1Var = this.c;
        Object obj2 = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                String strB = ((sc70) j570Var).b.c.B("uri");
                tv80 tv80VarM = i8h1Var.m(((hl00) obj2).h(u570Var).t(), (xj61) null);
                if (strB == null) {
                    n57.e("Could not open context menu with null uri");
                } else {
                    ((vgm) obj3).d(strB, ((jik1) obj).getViewUri().a, tv80VarM, new tgm((String) null, false, false, false, false, false, false, (yh10) null, false, false, 0, false, false, false, false, false, (iu30) null, false, false, (g371) null, (c821) null, false, (String) null, (iu30) null, (p860) null, (mgo0) null, false, false, -1, 1));
                }
                break;
            case 1:
                String strB2 = ((sc70) j570Var).b.c.B("uri");
                if (strB2 == null || strB2.length() == 0) {
                    n57.s("checkout uri is empty");
                } else {
                    i8h1Var.m(((hl00) obj2).h(u570Var).s(strB2), (xj61) null);
                    swv0.c((swv0) obj, (Activity) obj3, new rwv0(gxf.b, (String) null, Uri.parse(strB2)));
                }
                break;
            default:
                HubsImmutableComponentBundle hubsImmutableComponentBundle = ((sc70) j570Var).b.c;
                String strB3 = hubsImmutableComponentBundle.B("title");
                String str = strB3 == null ? "" : strB3;
                String strB4 = hubsImmutableComponentBundle.B("description");
                String str2 = strB4 == null ? "" : strB4;
                String strB5 = hubsImmutableComponentBundle.B("cardTitle");
                String str3 = strB5 == null ? "" : strB5;
                Long lX = hubsImmutableComponentBundle.x("releaseTimestamp");
                if (lX != null) {
                    Date date = new Date(lX.longValue() * 1000);
                    Locale locale = Locale.getDefault();
                    strI = xcg1.i(DateFormat.getDateInstance(2, locale).format(date), " • ", new SimpleDateFormat(android.text.format.DateFormat.is24HourFormat((Activity) obj3) ? "HH:mm" : "ha", locale).format(date));
                } else {
                    strI = null;
                }
                String str4 = strI == null ? "" : strI;
                String strB6 = hubsImmutableComponentBundle.B("ctaTitle");
                String str5 = strB6 == null ? "" : strB6;
                String strB7 = hubsImmutableComponentBundle.B("coverArtUrl");
                String str6 = strB7 == null ? "" : strB7;
                String strB8 = hubsImmutableComponentBundle.B("premiumOnlyText");
                String str7 = strB8 == null ? "" : strB8;
                String strB9 = hubsImmutableComponentBundle.B("uri");
                dzh1 dzh1Var = new dzh1(str, str2, str3, str4, str5, str6, strB9 == null ? "" : strB9, str7);
                x6h1 x6h1VarG = y1a1.G(u570Var.b.r(), ((c4n0) obj2).getViewUri().a);
                x6h1VarG.g = "22.0.0";
                ((ezh1) obj).a(dzh1Var, i8h1Var.m(new x5j1(x6h1VarG.a(), (byte) 12).f().t(), (xj61) null), false);
                break;
        }
    }

    public /* synthetic */ ndm(Object obj, Object obj2, hl00 hl00Var, i8h1 i8h1Var, byte b) {
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = hl00Var;
        this.c = i8h1Var;
    }
}
