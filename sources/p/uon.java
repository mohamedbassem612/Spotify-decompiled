package p;

import android.app.Activity;
import android.net.Uri;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class uon implements g50 {
    public final /* synthetic */ byte a;
    public final Object b;
    public final Object c;

    public uon(Activity activity, swv0 swv0Var) {
        this.a = (byte) 2;
        this.c = activity;
        this.b = swv0Var;
    }

    @Override // p.g50
    public final void a(String str, String str2, Bundle bundle, w1q0 w1q0Var) {
        String string;
        byte b = this.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                w1q0Var.invoke(Boolean.TRUE);
                ((Activity) obj).runOnUiThread(new uu1(bundle, this, str2, false, (byte) 7));
                break;
            case 1:
                w1q0Var.invoke(Boolean.TRUE);
                List<String> listM = p7h.M(new String[]{"triggerPattern", "imageUri"});
                String string2 = "";
                if (listM.isEmpty()) {
                    string = str2;
                } else {
                    StringBuilder sb = new StringBuilder(str2);
                    String str3 = ihc1.h0(str2, "?", false) ? "" : "?";
                    ArrayList arrayList = new ArrayList();
                    for (String str4 : listM) {
                        String strI = bundle.containsKey(str4) ? xcg1.i(str4, "=", bundle.getString(str4)) : null;
                        if (strI != null) {
                            arrayList.add(strI);
                        }
                    }
                    ArrayList arrayList2 = !arrayList.isEmpty() ? arrayList : null;
                    if (arrayList2 != null) {
                        sb.append(o7h.y0(arrayList2, "&", str3, (String) null, (iu30) null, 60));
                    }
                    string = sb.toString();
                }
                String strW = nhc1.W(string, "triggerPattern", "displayReason");
                try {
                    String strY0 = o7h.y0(ihc1.Q0(ihc1.T0(strW, '?', strW), new String[]{"&"}, 0, 6), "&", (String) null, (String) null, wvr0.d1, 30);
                    int iV0 = ihc1.v0(strW, '?', 0, 6);
                    if (iV0 != -1) {
                        string2 = ihc1.M0(strW, iV0 + 1, strW.length(), strY0).toString();
                        strW = string2;
                    }
                } catch (Exception unused) {
                }
                tv80 serializable = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                fn31.T(cto1.q((dg30) obj2), (o8n) null, 0, new dvq0(this, strW, serializable instanceof tv80 ? serializable : null, (lnm) null, (byte) 9), 3);
                break;
            default:
                tv80 serializable2 = bundle.getSerializable("UBI_INTERACTION_LOGGING_RESULT");
                tv80 tv80Var = serializable2 instanceof tv80 ? serializable2 : null;
                w1q0Var.invoke(Boolean.TRUE);
                swv0 swv0Var = (swv0) obj2;
                Activity activity = (Activity) obj;
                rwv0 rwv0Var = new rwv0(txf.b, null, str2.length() == 0 ? null : Uri.parse(str2));
                swv0Var.getClass();
                activity.startActivity(swv0Var.a(activity, rwv0Var, tv80Var));
                break;
        }
    }

    public /* synthetic */ uon(Object obj, Object obj2, byte b) {
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }
}
