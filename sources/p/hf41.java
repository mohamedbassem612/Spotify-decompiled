package p;

import com.google.android.recaptcha.internal.zzhm;
import com.spotify.upsells.v1.proto.BottomSheet;
import com.spotify.upsells.v1.proto.GetUpsellResponse;
import com.spotify.upsells.v1.proto.InlineUpsell;
import kotlinx.coroutines.TimeoutCancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class hf41 implements iu30 {
    public static final hf41 b = new hf41(0);
    public static final hf41 c = new hf41(1);
    public static final hf41 d = new hf41(2);
    public static final /* synthetic */ hf41 e = new hf41(4);
    public static final /* synthetic */ hf41 f = new hf41(5);
    public final /* synthetic */ byte a;

    public /* synthetic */ hf41(byte b2) {
        this.a = b2;
    }

    public static ila0 a(GetUpsellResponse getUpsellResponse) {
        if (getUpsellResponse.q()) {
            BottomSheet bottomSheetN = getUpsellResponse.n();
            return new wyh1(bottomSheetN.getTitle(), bottomSheetN.n(), ulo1.h(bottomSheetN.s()), new vyh1(bottomSheetN.q().p(), bottomSheetN.q().o()), bottomSheetN.t() ? new vyh1(bottomSheetN.r().p(), bottomSheetN.r().o()) : null, ulo1.f(bottomSheetN.p()));
        }
        if (!getUpsellResponse.r()) {
            return null;
        }
        InlineUpsell inlineUpsellO = getUpsellResponse.o();
        return new yyh1(inlineUpsellO.getTitle(), inlineUpsellO.n(), ulo1.h(inlineUpsellO.p()), inlineUpsellO.q());
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        switch (b2) {
            case 0:
                if (!u890.j(obj, Boolean.FALSE)) {
                    return new u7h(z4p1.e(((Integer) obj).intValue()));
                }
                int i = u7h.l;
                return new u7h(nfb.p());
            case 1:
                return bpi1.a((oma0) obj);
            case 2:
                return null;
            case 3:
                return a((GetUpsellResponse) obj);
            case 4:
                nln1 nln1Var = (nln1) obj;
                String strJ0 = dm5.j0(nln1Var);
                String str = "REAL";
                switch (nln1Var.ordinal()) {
                    case 1:
                        str = "INTEGER PRIMARY KEY AUTOINCREMENT";
                        break;
                    case 2:
                        str = "BLOB";
                        break;
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                    case 7:
                    case 8:
                    case 11:
                    case 12:
                    case 13:
                    case 14:
                    case 17:
                        str = "INTEGER";
                        break;
                    case 9:
                    case 10:
                    case 15:
                    case 16:
                        break;
                    default:
                        str = "COLUMN_UNSPECIFIED";
                        break;
                }
                return l1d.q(new StringBuilder(str.length() + strJ0.length() + 1), strJ0, " ", str);
            case 5:
                return rih1Var;
            default:
                Exception exc = (Exception) obj;
                if (!(exc instanceof zzhm)) {
                    if (exc instanceof TimeoutCancellationException) {
                        new zzhm(tgo1.k, ij81.P0, (String) null, (Exception) null);
                    } else {
                        new zzhm(tgo1.c, ij81.d, (String) null, exc);
                    }
                }
                return rih1Var;
        }
    }
}
