package p;

import android.net.Uri;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class dmm0 {
    public final ydf0 a = new ydf0(500);

    public final bmm0 a(String str) {
        String strR;
        bmm0 bmm0Var = null;
        if (str == null || ihc1.y0(str)) {
            return null;
        }
        ydf0 ydf0Var = this.a;
        cmm0 cmm0Var = (cmm0) ydf0Var.c(str);
        if (cmm0Var != null) {
            return cmm0Var.a;
        }
        if (!nhc1.Y(str, "spotify:mosaic:", false)) {
            rhc rhcVarU = u890.u(Uri.decode(str));
            strR = rhcVarU != null ? rhcVarU.r() : null;
            if (strR != null) {
                if (!nhc1.Y(strR, "spotify:mosaic:", false)) {
                    strR = null;
                }
                if (strR != null) {
                }
            }
            ydf0Var.d(str, new cmm0(bmm0Var));
            return bmm0Var;
        }
        strR = str;
        List listP0 = ihc1.P0(strR.substring(15), new char[]{':'}, 6);
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP0) {
            if (((String) obj).length() > 0) {
                arrayList.add(obj);
            }
        }
        List listD1 = o7h.d1(arrayList, 4);
        if (!listD1.isEmpty()) {
            List<String> list = listD1;
            ArrayList<String> arrayList2 = new ArrayList(q7h.U(list, 10));
            for (String str2 : list) {
                rhc rhcVarU2 = u890.u(Uri.decode(str2));
                String strR2 = rhcVarU2 != null ? rhcVarU2.r() : null;
                if (strR2 == null) {
                    strR2 = str2;
                }
                if (nhc1.Y(str2, "localfileimage", false)) {
                    strR2 = l1d.m("spotify:", Uri.decode(str2));
                } else if (!nhc1.Y(strR2, "http://", false) && !nhc1.Y(strR2, "https://", false) && !nhc1.Y(strR2, "spotify:image:", false)) {
                    strR2 = "spotify:image:".concat(str2);
                }
                arrayList2.add(strR2);
            }
            ArrayList arrayList3 = new ArrayList(q7h.U(arrayList2, 10));
            for (String str3 : arrayList2) {
                rhc rhcVar = new rhc(str3.getBytes(nne.a));
                rhcVar.c = str3;
                arrayList3.add(rhcVar.b());
            }
            bmm0Var = new bmm0(str, arrayList2, arrayList3);
        }
        ydf0Var.d(str, new cmm0(bmm0Var));
        return bmm0Var;
    }
}
