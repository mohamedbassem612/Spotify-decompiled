package p;

import android.content.Context;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class a3l1 implements hj71 {
    public static final List b;
    public static final List c;
    public final Context a;

    static {
        w471 w471Var = w471.d;
        s471 s471Var = s471.d;
        f571 f571Var = f571.d;
        n571 n571Var = n571.d;
        p471 p471Var = p471.d;
        m471 m471Var = m471.d;
        b = p7h.M(new o571[]{w471Var, s471Var, f571Var, n571Var, p471Var, m471Var});
        c = p7h.M(new o571[]{m471Var, l571.d, w471Var, u471.d, r471.d, h571.d, q471.d, s471Var, c571.d, n571Var, f571Var, x471.d, p471Var, e571.d, z471.d});
    }

    public a3l1(Context context) {
        this.a = context;
    }

    public final Object n(k371 k371Var, lnm lnmVar) {
        ArrayList arrayList;
        Bundle bundle = k371Var.b;
        wa71 wa71Var = (wa71) jhc1.t(bundle, "vtec.share.share_menu_data", wa71.class);
        if (wa71Var != null) {
            String str = wa71Var.a;
            String str2 = wa71Var.e;
            cqs0 cqs0Var = wa71Var.c;
            String string = bundle.getString("vtec.share.image_url");
            if (string != null) {
                ArrayList<String> stringArrayList = bundle.getStringArrayList("vtec.share.destinations");
                String string2 = bundle.getString("vtec.share.link_preview_url");
                Boolean boolValueOf = bundle.containsKey("vtec.share.allow_audio_attachment") ? Boolean.valueOf(bundle.getBoolean("vtec.share.allow_audio_attachment")) : null;
                String string3 = bundle.getString("vtec.share.audio_preview_entity_uri");
                boolean z = bundle.getBoolean("vtec.share.enable_legacy_sharing", false);
                if (stringArrayList != null) {
                    arrayList = new ArrayList();
                    for (String str3 : stringArrayList) {
                        str3.getClass();
                        o571 o571VarO = myo1.o(str3);
                        if (o571VarO != null) {
                            arrayList.add(o571VarO);
                        }
                    }
                } else {
                    arrayList = null;
                }
                jlw0 jlw0Var = new jlw0(string, this.a.getString(2131956653));
                f0a f0aVar = new f0a();
                f0aVar.b = str;
                f0aVar.h(jlw0Var);
                f0aVar.h = tyo1.p(blc0.Gg, new String[0]);
                ((LinkedHashMap) f0aVar.Z).putAll(cqs0Var);
                if (str2 != null) {
                    f0aVar.c = str2;
                }
                if (string3 != null) {
                    f0aVar.f = string3;
                }
                if (boolValueOf != null) {
                    f0aVar.O0 = boolValueOf;
                }
                f0aVar.X = string2 != null ? new pz9(new uz9(string2), null, null, 62) : null;
                u771 u771VarP = f0aVar.p();
                List list = arrayList;
                if (arrayList == null) {
                    list = z ? c : b;
                }
                return new qj71(Collections.singletonList(u771VarP), 0, new quk(new va71(new cmt(list, 3))));
            }
        }
        return null;
    }
}
