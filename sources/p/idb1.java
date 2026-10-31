package p;

import android.content.Context;
import android.net.Uri;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class idb1 implements mgm {
    public final Context a;
    public final o3r b;
    public final o3r c;
    public final o3r d;
    public final o3r e;

    public idb1(Context context) {
        this.a = context;
        jd11 jd11Var = rc11.a;
        this.b = w3p1.o(new l4r(new xv00(jd11Var.b(iow0.class)), 2, xcb1.N0, new j4r(xcb1.t), xcb1.O0), xcb1.X);
        pwc0 pwc0Var = pwc0.c;
        this.c = w3p1.o(new l4r(pwc0Var, 2, xcb1.P0, new j4r(xcb1.f), xcb1.Q0), xcb1.g);
        this.d = w3p1.o(new l4r(new xv00(jd11Var.b(iow0.class)), 1, xcb1.R0, new j4r(xcb1.Y), xcb1.S0), xcb1.Z);
        this.e = w3p1.o(new l4r(pwc0Var, 1, xcb1.T0, new j4r(xcb1.h), xcb1.U0), xcb1.i);
    }

    @Override // p.mgm
    public final Object a(hti0 hti0Var, d0r d0rVar, lnm lnmVar) {
        qxc0 qxc0Var = hti0Var.d;
        if (qxc0Var == null) {
            return null;
        }
        return smo1.s(new zvy(this, qxc0Var, d0rVar, hti0Var, (lnm) null), lnmVar);
    }

    @Override // p.mgm
    public final mr20 b(hti0 hti0Var, d0r d0rVar) {
        String str = hti0Var.a;
        qxc0 qxc0Var = hti0Var.d;
        return qxc0Var == null ? new huz((Object) null, (byte) 10) : new x010(d3p1.F(d0rVar, this.b, str), d3p1.F(d0rVar, this.c, str), new t83(this, qxc0Var, (lnm) null, (byte) 12), (byte) 1);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x000b  */
    public final igm c(qxc0 qxc0Var, iow0 iow0Var, Integer num) {
        boolean z;
        String string;
        String quantityString;
        String str;
        String str2 = qxc0Var.a;
        if (iow0Var != null) {
            z = iow0Var.a;
        }
        int iIntValue = num != null ? num.intValue() : 0;
        pxc0 pxc0Var = qxc0Var.c;
        String string2 = "";
        Context context = this.a;
        if (pxc0Var == null || (str = pxc0Var.b) == null || (string = context.getString(2131960156, str)) == null) {
            string = "";
        }
        if (iIntValue == 0) {
            quantityString = "";
        } else {
            quantityString = context.getResources().getQuantityString(2131820697, iIntValue, new DecimalFormat("#,###", new DecimalFormatSymbols(Locale.getDefault())).format(iIntValue));
            quantityString.getClass();
        }
        String str3 = qxc0Var.e;
        if ((str3 == null || str3.length() == 0) && !z) {
            string2 = qxc0Var.i == wls0.c ? context.getString(2131959922) : context.getString(2131959923);
        }
        string2.getClass();
        List listM = p7h.M(new String[]{string, quantityString, string2});
        ArrayList arrayList = new ArrayList();
        for (Object obj : listM) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        return new igm(str2, new wfm(Uri.parse(qxc0Var.b.a(2))), o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62));
    }
}
