package p;

import com.spotify.upsells.v1.proto.GetUpsellResponse;
import java.text.Normalizer;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public abstract class v0i1 {
    public static final se11 a = new se11("[\\s\\u00A0\\u2007\\u202F]+");

    public static final String a(String str) {
        return ihc1.e1(a.g(" ", Normalizer.normalize(str, Normalizer.Form.NFC))).toString().toLowerCase(Locale.ROOT);
    }

    /* JADX WARN: Code duplicated, block: B:35:0x007b A[RETURN] */
    /* JADX WARN: Code duplicated, block: B:36:0x007c A[RETURN] */
    public static final int b(GetUpsellResponse getUpsellResponse, e2i1 e2i1Var) {
        int iP = getUpsellResponse.p();
        int i = iP == 0 ? -1 : u0i1.a[l1d.C(iP)];
        if (i != -1) {
            if (i == 1) {
                return 5;
            }
            if (i == 2) {
                if (e2i1Var == e2i1.b) {
                    if (ihc1.y0(getUpsellResponse.n().getTitle()) || ihc1.y0(getUpsellResponse.n().n()) || ihc1.y0(getUpsellResponse.n().q().p())) {
                        return 2;
                    }
                    return 1;
                }
                return 4;
            }
            if (i == 3) {
                if (e2i1Var == e2i1.a) {
                    if (ihc1.y0(getUpsellResponse.o().getTitle()) || ihc1.y0(getUpsellResponse.o().n())) {
                        return 2;
                    }
                    return 1;
                }
                return 4;
            }
            if (i != 4) {
                eg.o();
                return 0;
            }
        }
        return 3;
    }
}
