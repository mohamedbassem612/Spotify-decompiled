package p;

import com.spotify.messages.AddToPlaylist;
import com.spotify.messages.CreatePlaylist;
import com.spotify.share.formats.common.clippingdialog.events.proto.VideoTranscodingResult;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class dmr {
    public final t2j0 a;

    public void a(String str, String str2, boolean z, String str3, List list) {
        for (List list2 : list.isEmpty() ? Collections.singletonList(z6x.a) : o7h.s1(list, 100, 100)) {
            rn1 rn1VarO = AddToPlaylist.o();
            rn1VarO.n(list2);
            rn1VarO.q(z);
            rn1VarO.t(str2);
            rn1VarO.s(str3);
            if (str != null && str.length() != 0) {
                rn1VarO.r(str);
            }
            this.a.a(rn1VarO.build());
        }
    }

    public void b(String str, String str2, String str3) {
        ton tonVarN = CreatePlaylist.n();
        tonVarN.r(str2);
        tonVarN.q(str3);
        if (str != null && str.length() != 0) {
            tonVarN.n(str);
        }
        this.a.a(tonVarN.build());
    }

    public void c(String str, String str2, int i, int i2, boolean z, int i3, String str3, long j) {
        String str4;
        y5k1 y5k1VarN = VideoTranscodingResult.n();
        y5k1VarN.n(str);
        y5k1VarN.w(str2);
        y5k1VarN.s(i);
        y5k1VarN.t(i2);
        y5k1VarN.r(z);
        if (i3 != 0) {
            if (i3 == 1) {
                str4 = "FAILURE";
            } else if (i3 == 2) {
                str4 = "USER_CANCELLED";
            } else if (i3 == 3) {
                str4 = "USER_SHARED_LINK";
            } else {
                if (i3 != 4) {
                    throw null;
                }
                str4 = "AUTO_CANCELLED";
            }
            y5k1VarN.q(str4);
        }
        if (str3 != null) {
            y5k1VarN.u(str3);
        }
        y5k1VarN.v((int) j);
        this.a.a(y5k1VarN.build());
    }
}
