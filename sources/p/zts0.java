package p;

import com.spotify.signup.signup.v2.proto.GetSignupFlagsResponse;
import java.util.ArrayList;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public abstract class zts0 {
    public static ArrayList a(GetSignupFlagsResponse getSignupFlagsResponse) {
        h290<GetSignupFlagsResponse.AllowedCallingCodes> h290VarN = getSignupFlagsResponse.n();
        ArrayList arrayList = new ArrayList(h290VarN.size());
        for (GetSignupFlagsResponse.AllowedCallingCodes allowedCallingCodes : h290VarN) {
            String strO = allowedCallingCodes.o();
            String strC = f4i1.c(allowedCallingCodes.n(), "+");
            m0d.Companion.getClass();
            arrayList.add(new m0d(strO, strC, new Locale("", strO).getDisplayCountry()));
        }
        return arrayList;
    }
}
