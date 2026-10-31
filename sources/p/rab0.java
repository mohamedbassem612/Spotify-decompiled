package p;

import android.net.Uri;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class rab0 extends hab0 implements iu30 {
    public static final rab0 N0;
    public static final rab0 O0;
    public static final rab0 P0;
    public static final rab0 Q0;
    public static final rab0 R0;
    public static final rab0 S0;
    public static final rab0 T0;
    public static final rab0 U0;
    public static final rab0 V0;
    public static final rab0 W0;
    public static final rab0 X;
    public static final rab0 X0;
    public static final rab0 Y;
    public static final rab0 Y0;
    public static final rab0 Z;
    public static final rab0 Z0;
    public static final rab0 a1;
    public static final rab0 b;
    public static final rab0 b1;
    public static final rab0 c;
    public static final rab0 c1;
    public static final rab0 d;
    public static final rab0 d1;
    public static final rab0 e;
    public static final rab0 e1;
    public static final rab0 f;
    public static final rab0 g;
    public static final rab0 h;
    public static final rab0 i;
    public static final rab0 t;
    public final /* synthetic */ byte a;

    static {
        int i2 = 1;
        b = new rab0(i2, (byte) 0);
        c = new rab0(i2, (byte) 1);
        d = new rab0(i2, (byte) 2);
        e = new rab0(i2, (byte) 3);
        f = new rab0(i2, (byte) 4);
        g = new rab0(i2, (byte) 5);
        h = new rab0(i2, (byte) 6);
        i = new rab0(i2, (byte) 7);
        t = new rab0(i2, (byte) 8);
        X = new rab0(i2, (byte) 9);
        Y = new rab0(i2, (byte) 10);
        Z = new rab0(i2, (byte) 11);
        N0 = new rab0(i2, (byte) 12);
        O0 = new rab0(i2, (byte) 13);
        P0 = new rab0(i2, (byte) 14);
        Q0 = new rab0(i2, (byte) 15);
        R0 = new rab0(i2, (byte) 16);
        S0 = new rab0(i2, (byte) 17);
        T0 = new rab0(i2, (byte) 18);
        U0 = new rab0(i2, (byte) 19);
        V0 = new rab0(i2, (byte) 20);
        W0 = new rab0(i2, (byte) 21);
        X0 = new rab0(i2, (byte) 22);
        Y0 = new rab0(i2, (byte) 23);
        Z0 = new rab0(i2, (byte) 24);
        a1 = new rab0(i2, (byte) 25);
        b1 = new rab0(i2, (byte) 26);
        c1 = new rab0(i2, (byte) 27);
        d1 = new rab0(i2, (byte) 28);
        e1 = new rab0(i2, (byte) 29);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ rab0(int i2, byte b2) {
        super(i2);
        this.a = b2;
    }

    public final Object invoke(Object obj) {
        byte b2 = this.a;
        rih1 rih1Var = rih1.a;
        boolean z = true;
        switch (b2) {
            case 0:
                if (!(obj instanceof l631) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 1:
                if (obj instanceof rih1) {
                    return null;
                }
                return (l631) obj;
            case 2:
                return Boolean.valueOf(obj instanceof iix0);
            case 3:
                if (obj != null) {
                    return (iix0) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.progressstate.state.ProgressState");
                return null;
            case 4:
                return Boolean.valueOf(obj instanceof dd8);
            case 5:
                return (k1r) obj;
            case 6:
                return Boolean.valueOf(obj instanceof ddz);
            case 7:
                if (obj != null) {
                    return (ddz) obj;
                }
                bhn0.i("null cannot be cast to non-null type com.spotify.extendedmetadata.extensions.episodetranscripts.EpisodeTranscripts");
                return null;
            case 8:
                return (String) obj;
            case 9:
                ArrayList arrayList = ((ddz) obj).b;
                ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                int i2 = 0;
                for (Object obj2 : arrayList) {
                    int i3 = i2 + 1;
                    if (i2 < 0) {
                        p7h.T();
                        throw null;
                    }
                    cdz cdzVar = (cdz) obj2;
                    arrayList2.add(new xab0(cdzVar.b, i2 == 0, (String) null, (i2 == 0 || cdzVar.c) ? false : true));
                    i2 = i3;
                }
                return arrayList2;
            case 10:
                return new bcb0();
            case 11:
                return mno1.h(new mmr0[]{new mmr0("LanguagePickerPageElementStateKey", (bcb0) obj)});
            case 12:
                ((xas) obj).a(Z, k9b0.Y);
                return rih1Var;
            case 13:
                return nik1.T0.a;
            case 14:
                return rih1Var;
            case 15:
                return new bfb0(false);
            case 16:
                los0 los0Var = (los0) obj;
                return los0Var.a + ":" + los0Var.b;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return tgb0.b;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                hib0 hib0Var = (hib0) obj;
                Set set = s4b1.f;
                String str = hib0Var.a;
                nyu0 nyu0Var = uic.x(str).d;
                nyu0 nyu0Var2 = nyu0Var instanceof nyu0 ? nyu0Var : null;
                String str2 = nyu0Var2 != null ? nyu0Var2.a : null;
                if (str2 == null) {
                    hhg1.f(l1d.m("Unable to extract playlist ID from ", str));
                    return null;
                }
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().appendQueryParameter("outTrackRowId", hib0Var.b).appendQueryParameter("currentIncomingTrackUri", hib0Var.c);
                String str3 = hib0Var.d;
                if (str3 != null) {
                    builderAppendQueryParameter.appendQueryParameter("currentIncomingRowId", str3);
                }
                return gvg.h("spotify:internal:playlist-mixing-later-in-playlist:", str2, "?", builderAppendQueryParameter.build().getEncodedQuery());
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new pib0((String) obj, null, null);
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return (String) obj;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return (String) obj;
            case 22:
                if (!(obj instanceof jo70) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                if (obj instanceof rih1) {
                    return null;
                }
                return (jo70) obj;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                if (!(obj instanceof xkk1) && !(obj instanceof rih1)) {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 25:
                if (obj instanceof rih1) {
                    return null;
                }
                return (xkk1) obj;
            case 26:
                return new xib0((wib0) obj, (jo70) null, (xkk1) null, (String) null, tlw0.a, false, false);
            case 27:
                return ((wib0) obj).a.a;
            case 28:
                return ((wib0) obj).a.a;
            default:
                return ((wib0) obj).a.a;
        }
    }
}
