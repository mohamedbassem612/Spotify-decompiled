package p;

import android.content.Context;
import android.content.res.Resources;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ry3 extends bey {
    public final /* synthetic */ byte b;
    public final Object c;
    public final zwm1 d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry3(Context context, zwm1 zwm1Var, byte b) {
        super(aey.N0);
        this.b = b;
        switch (b) {
            case 1:
                super(aey.f);
                this.c = context;
                this.d = zwm1Var;
                break;
            default:
                this.c = context;
                this.d = zwm1Var;
                break;
        }
    }

    /* JADX WARN: Code duplicated, block: B:74:0x0171  */
    /* JADX WARN: Code duplicated, block: B:90:0x01f4  */
    @Override // p.bey
    public final String b(ttm1 ttm1Var, pey peyVar) {
        sy3 sy3Var;
        String quantityString;
        String strA;
        ho6 ho6Var;
        bbk bbkVar;
        byte b = this.b;
        Object obj = this.c;
        zwm1 zwm1Var = this.d;
        switch (b) {
            case 0:
                Context context = (Context) obj;
                if (u890.j(ttm1.i.get(ttm1Var.e), sy3.class)) {
                    nb10 nb10Var = ttm1Var.g;
                    if (nb10Var == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.AlsoAvailableOfflineExtraInfo");
                        return null;
                    }
                    sy3Var = (sy3) nb10Var;
                } else {
                    sy3Var = null;
                }
                if (sy3Var == null) {
                    return null;
                }
                int i = sy3Var.b;
                int i2 = sy3Var.c;
                aey aeyVar = sy3Var.a;
                int iOrdinal = aeyVar.ordinal();
                if (iOrdinal == 2) {
                    quantityString = context.getResources().getQuantityString(2131820953, i2, Integer.valueOf(i), Integer.valueOf(i2));
                } else if (iOrdinal == 5) {
                    quantityString = context.getResources().getQuantityString(2131820952, i, Integer.valueOf(i));
                } else if (iOrdinal != 9) {
                    quantityString = null;
                } else if (i2 == 0) {
                    int i3 = sy3Var.d;
                    if (i3 <= 0) {
                        quantityString = null;
                    } else {
                        int iMax = Math.max(i3 / 60, 1);
                        int i4 = iMax / 60;
                        int i5 = iMax % 60;
                        quantityString = i4 > 0 ? context.getString(2131964009, Integer.valueOf(i4), Integer.valueOf(i5)) : context.getString(2131964010, Integer.valueOf(i5));
                    }
                } else {
                    quantityString = context.getResources().getQuantityString(2131820953, i2, Integer.valueOf(i), Integer.valueOf(i2));
                }
                Set set = peyVar.e;
                int iOrdinal2 = aeyVar.ordinal();
                if (iOrdinal2 != 2) {
                    if (iOrdinal2 != 5) {
                        if (iOrdinal2 != 9 || set.contains("playlists") || set.contains("downloaded_playlists")) {
                            strA = null;
                        } else {
                            strA = zwm1Var.e((String) null, true, "", false);
                        }
                    } else if (set.contains("artists") || set.contains("downloaded_artists")) {
                        strA = null;
                    } else {
                        strA = zwm1Var.b.getString(2131956835);
                    }
                } else if (set.contains("albums") || set.contains("downloaded_albums")) {
                    strA = null;
                } else {
                    strA = zwm1Var.a((String) null, true);
                }
                List listI0 = f46.i0(new String[]{strA, quantityString});
                List list = !listI0.isEmpty() ? listI0 : null;
                if (list != null) {
                    return o7h.y0(list, " • ", (String) null, (String) null, (iu30) null, 62);
                }
                return null;
            case 1:
                Set set2 = peyVar.e;
                if (u890.j(ttm1.i.get(ttm1Var.e), ho6.class)) {
                    nb10 nb10Var2 = ttm1Var.g;
                    if (nb10Var2 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ArtistExtraInfo");
                        return null;
                    }
                    ho6Var = (ho6) nb10Var2;
                } else {
                    ho6Var = null;
                }
                int i6 = ho6Var != null ? ho6Var.b : 0;
                int i7 = ho6Var != null ? ho6Var.c : 0;
                if (i6 <= 0 && i7 <= 0) {
                    if (set2.contains("artists") || set2.contains("downloaded_artists")) {
                        return null;
                    }
                    return zwm1Var.b.getString(2131956835);
                }
                Context context2 = (Context) obj;
                ArrayList arrayList = new ArrayList();
                if (i6 > 0) {
                    arrayList.add(context2.getResources().getQuantityString(2131820955, i6, Integer.valueOf(i6)));
                }
                if (i7 > 0) {
                    arrayList.add(context2.getResources().getQuantityString(2131820954, i7, Integer.valueOf(i7)));
                }
                return o7h.y0(arrayList, " • ", (String) null, (String) null, (iu30) null, 62);
            default:
                Resources resources = zwm1Var.b;
                if (u890.j(ttm1.i.get(ttm1Var.e), bbk.class)) {
                    nb10 nb10Var3 = ttm1Var.g;
                    if (nb10Var3 == null) {
                        bhn0.i("null cannot be cast to non-null type com.spotify.yourlibrary.yourlibraryx.shared.domain.ConcertCampaignExtraInfo");
                        return null;
                    }
                    bbkVar = (bbk) nb10Var3;
                } else {
                    bbkVar = null;
                }
                if (bbkVar == null) {
                    return resources.getString(2131956841);
                }
                switch (l1d.C(bbkVar.a)) {
                    case 0:
                    case 5:
                        return resources.getString(2131956841);
                    case 1:
                    case 2:
                        Long l = bbkVar.b;
                        if (l == null || l.longValue() == 0) {
                            return resources.getString(2131956843);
                        }
                        return TimeUnit.SECONDS.toMillis(l.longValue()) <= ((yqg) obj).b() ? resources.getString(2131956843) : resources.getString(2131956844);
                    case 3:
                        return resources.getString(2131956847);
                    case 4:
                        return resources.getString(2131956845);
                    case 6:
                    case 8:
                        return resources.getString(2131956846);
                    case 7:
                        return resources.getString(2131956842);
                    default:
                        eg.o();
                        return null;
                }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ry3(yqg yqgVar, zwm1 zwm1Var) {
        super(aey.Z);
        this.b = (byte) 2;
        this.c = yqgVar;
        this.d = zwm1Var;
    }
}
