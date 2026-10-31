package p;

import android.app.Application;
import android.content.Context;
import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.os.Build;
import android.os.Bundle;
import com.google.android.recaptcha.internal.zzhm;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class x15 implements hj71 {
    public final Context a;

    public x15(Application application) {
        this.a = application;
        new ConcurrentHashMap();
        LinkedHashMap linkedHashMapM = sqg0.M(new mmr0[]{new mmr0(0, rkn1.NET_CAPABILITY_MMS), new mmr0(1, rkn1.NET_CAPABILITY_SUPL), new mmr0(2, rkn1.NET_CAPABILITY_DUN), new mmr0(3, rkn1.NET_CAPABILITY_FOTA), new mmr0(4, rkn1.NET_CAPABILITY_IMS), new mmr0(5, rkn1.NET_CAPABILITY_CBS), new mmr0(6, rkn1.NET_CAPABILITY_WIFI_P2P), new mmr0(7, rkn1.NET_CAPABILITY_IA), new mmr0(8, rkn1.NET_CAPABILITY_RCS), new mmr0(9, rkn1.NET_CAPABILITY_XCAP), new mmr0(10, rkn1.NET_CAPABILITY_EIMS), new mmr0(11, rkn1.NET_CAPABILITY_NOT_METERED), new mmr0(12, rkn1.NET_CAPABILITY_INTERNET), new mmr0(13, rkn1.NET_CAPABILITY_NOT_RESTRICTED), new mmr0(14, rkn1.NET_CAPABILITY_TRUSTED), new mmr0(15, rkn1.NET_CAPABILITY_NOT_VPN)});
        linkedHashMapM.put(17, rkn1.NET_CAPABILITY_CAPTIVE_PORTAL);
        linkedHashMapM.put(16, rkn1.NET_CAPABILITY_VALIDATED);
        int i = Build.VERSION.SDK_INT;
        if (i >= 28) {
            linkedHashMapM.put(18, rkn1.NET_CAPABILITY_NOT_ROAMING);
            linkedHashMapM.put(19, rkn1.NET_CAPABILITY_FOREGROUND);
            linkedHashMapM.put(20, rkn1.NET_CAPABILITY_NOT_CONGESTED);
            linkedHashMapM.put(21, rkn1.NET_CAPABILITY_NOT_SUSPENDED);
        }
        if (i >= 29) {
            linkedHashMapM.put(23, rkn1.NET_CAPABILITY_MCX);
        }
        if (i >= 30) {
            linkedHashMapM.put(25, rkn1.NET_CAPABILITY_TEMPORARILY_NOT_METERED);
        }
        if (i >= 31) {
            linkedHashMapM.put(32, rkn1.NET_CAPABILITY_HEAD_UNIT);
            linkedHashMapM.put(29, rkn1.NET_CAPABILITY_ENTERPRISE);
        }
        if (i >= 33) {
            linkedHashMapM.put(35, rkn1.NET_CAPABILITY_PRIORITIZE_BANDWIDTH);
            linkedHashMapM.put(34, rkn1.NET_CAPABILITY_PRIORITIZE_LATENCY);
            linkedHashMapM.put(33, rkn1.NET_CAPABILITY_MMTEL);
        }
    }

    public zzhm a(Exception exc, zzhm zzhmVar) {
        NetworkCapabilities networkCapabilities;
        try {
            ConnectivityManager connectivityManager = (ConnectivityManager) this.a.getSystemService("connectivity");
            Network activeNetwork = connectivityManager.getActiveNetwork();
            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(16)) {
                return zzhmVar;
            }
        } catch (Exception unused) {
        }
        return new zzhm(tgo1.d, ij81.b1, exc.getMessage(), (Exception) null);
    }

    public Object n(k371 k371Var, lnm lnmVar) {
        u771 u771VarP;
        wa71 wa71Var = k371Var.a;
        Bundle bundle = k371Var.b;
        if (wa71Var == null) {
            return null;
        }
        String string = bundle.getString("music_guesser.share_card_url");
        if (string == null) {
            string = "";
        }
        int i = bundle.getInt("music_guesser.background_color", 0);
        String string2 = bundle.getString("music_guesser.share_preview_title");
        if (string2 == null) {
            string2 = "";
        }
        String string3 = bundle.getString("music_guesser.share_preview_description");
        if (string3 == null) {
            string3 = "";
        }
        if (ihc1.y0(string)) {
            u771VarP = new u771(new t771(wa71Var, tyo1.p(blc0.mg, new String[0])), new pz61(new y171(rc11.a.b(zwy.class)), new exy((String) null, new n1f1(true), 0, false, new rhy((yny) null, 63), (bwe1) null, (cuu0) null), dz61.d, true), new bj71(w7x.a, true, (String) null));
        } else {
            f0a f0aVar = new f0a();
            ((LinkedHashSet) f0aVar.N0).add(j571.d);
            f0aVar.b = wa71Var.a;
            Context context = this.a;
            f0aVar.h(new ilw0(i, i, context.getString(2131956351)));
            f0aVar.i = new jlw0(string, context.getString(2131956653));
            String str = wa71Var.e;
            f0aVar.c = str != null ? str : "";
            if (string2.length() == 0) {
                string2 = null;
            }
            if (string3.length() == 0) {
                string3 = null;
            }
            f0aVar.X = new pz9((vz9) null, string2, string3, 57);
            f0aVar.P0 = az61.d;
            f0aVar.h = tyo1.p(blc0.mg, new String[0]);
            u771VarP = f0aVar.p();
        }
        return new qj71(Collections.singletonList(u771VarP), 0, puk.d);
    }

    public x15(Context context, q8n q8nVar) {
        this.a = context;
    }
}
