package p;

import android.net.Uri;
import android.util.Base64;
import java.nio.ByteBuffer;
import java.util.Map;
import java.util.Set;
import java.util.UUID;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class g971 {
    public g971(l7c l7cVar, twb twbVar) {
    }

    public final mmr0 a(String str, String str2, cqi1 cqi1Var, Map map) {
        mmr0 mmr0VarB = b(str, str2, cqi1Var, map);
        String str3 = (String) mmr0VarB.a;
        String str4 = (String) mmr0VarB.b;
        String string = Uri.parse(str3).buildUpon().authority("open.spotify.com").build().toString();
        Set set = s4b1.f;
        String strD = uic.x(string).D();
        if (strD != null) {
            return new mmr0(strD, str4);
        }
        hhg1.f("Failed to create Spotify uri for ".concat(str));
        return null;
    }

    public final mmr0 b(String str, String str2, cqi1 cqi1Var, Map map) {
        Uri.Builder builderBuildUpon;
        Uri.Builder builderAuthority;
        Uri uriBuild;
        UUID uuidRandomUUID = UUID.randomUUID();
        ByteBuffer byteBufferWrap = ByteBuffer.wrap(new byte[16]);
        byteBufferWrap.putLong(uuidRandomUUID.getMostSignificantBits());
        byteBufferWrap.putLong(uuidRandomUUID.getLeastSignificantBits());
        String strEncodeToString = Base64.encodeToString(byteBufferWrap.array(), 11);
        Set set = s4b1.f;
        s4b1 s4b1VarX = uic.x(str);
        String strY = s4b1VarX.y();
        blc0 blc0Var = s4b1VarX.c;
        if (blc0Var == blc0.Rj || blc0Var == blc0.aa) {
            strY = (strY == null || (builderBuildUpon = Uri.parse(strY).buildUpon()) == null || (builderAuthority = builderBuildUpon.authority("spotify.com")) == null || (uriBuild = builderAuthority.build()) == null) ? null : uriBuild.toString();
        }
        if (strY == null) {
            hhg1.f("Invalid uri ".concat(str));
            return null;
        }
        xkg0 xkg0Var = new xkg0();
        xkg0Var.put("si", strEncodeToString);
        twb.l(xkg0Var, "context", str2);
        if (cqi1Var != null) {
            twb.l(xkg0Var, "utm_source", cqi1Var.b);
            twb.l(xkg0Var, "utm_medium", cqi1Var.c);
            twb.l(xkg0Var, "utm_campaign", cqi1Var.a);
            twb.l(xkg0Var, "utm_content", cqi1Var.e);
            twb.l(xkg0Var, "utm_term", cqi1Var.d);
        }
        if (map != null) {
            for (Map.Entry entry : map.entrySet()) {
                String str3 = (String) entry.getKey();
                String str4 = (String) entry.getValue();
                if (str3.length() > 0 && str4.length() > 0 && !xkg0Var.containsKey(str3)) {
                    xkg0Var.put(str3, str4);
                }
            }
        }
        xkg0 xkg0VarB = xkg0Var.b();
        Uri.Builder builderBuildUpon2 = Uri.parse(strY).buildUpon();
        for (Map.Entry entry2 : xkg0VarB.entrySet()) {
            builderBuildUpon2.appendQueryParameter((String) entry2.getKey(), (String) entry2.getValue());
        }
        return new mmr0(builderBuildUpon2.build().toString(), strEncodeToString);
    }
}
