package p;

import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class m0o extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m0o(iu30 iu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = iu30Var;
    }

    public final Object invoke(Object obj) {
        wl1 wl1Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        switch (b) {
            case 0:
                String str = ((bxn) obj).a;
                if (str.length() > 0) {
                    iu30Var.invoke(new xzn(str));
                }
                return rih1Var;
            case 1:
                int iOrdinal = ((wez0) obj).ordinal();
                if (iOrdinal == 0) {
                    iu30Var.invoke(wjo.a);
                } else if (iOrdinal == 2) {
                    iu30Var.invoke(wjo.b);
                }
                return rih1Var;
            case 2:
                int iOrdinal2 = ((ok1) obj).b.ordinal();
                if (iOrdinal2 == 0) {
                    wl1Var = wl1.a;
                } else {
                    if (iOrdinal2 != 1) {
                        eg.o();
                        return null;
                    }
                    wl1Var = wl1.b;
                }
                iu30Var.invoke(wl1Var);
                return rih1Var;
            case 3:
                iu30Var.invoke(z53.a);
                return rih1Var;
            case 4:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(z53.e);
                return rih1Var;
            case 5:
                iu30Var.invoke(z53.d);
                return rih1Var;
            case 6:
                int iOrdinal3 = ((a20) obj).ordinal();
                if (iOrdinal3 == 0) {
                    iu30Var.invoke(b73.b);
                } else {
                    if (iOrdinal3 != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(b73.c);
                }
                return rih1Var;
            case 7:
                iu30Var.invoke(new of3(new mf3(((Boolean) obj).booleanValue())));
                return rih1Var;
            case 8:
                int iOrdinal4 = ((a20) obj).ordinal();
                if (iOrdinal4 == 0) {
                    iu30Var.invoke(zf3.b);
                } else if (iOrdinal4 != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 9:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(vl6.b);
                return rih1Var;
            case 10:
                iu30Var.invoke(vl6.d);
                return rih1Var;
            case 11:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(wx6.b);
                return rih1Var;
            case 12:
                iu30Var.invoke((eh7) obj);
                return rih1Var;
            case 13:
                int iOrdinal5 = ((a20) obj).ordinal();
                if (iOrdinal5 == 0) {
                    iu30Var.invoke(c88.b);
                } else {
                    if (iOrdinal5 != 1) {
                        eg.o();
                        return null;
                    }
                    iu30Var.invoke(c88.c);
                }
                return rih1Var;
            case 14:
                int iOrdinal6 = ((a20) obj).ordinal();
                if (iOrdinal6 == 0) {
                    iu30Var.invoke(ic8.b);
                } else if (iOrdinal6 != 1) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            case 15:
                String str2 = (String) obj;
                if (str2.length() == 0) {
                    iu30Var.invoke(qja.a);
                } else {
                    iu30Var.invoke(new rja(str2));
                }
                return rih1Var;
            case 16:
                iu30Var.invoke(y1h.a);
                return rih1Var;
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(y1h.d);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                iu30Var.invoke(y1h.e);
                return rih1Var;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                iu30Var.invoke(y1h.f);
                return rih1Var;
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                ((Boolean) obj).booleanValue();
                iu30Var.invoke(y1h.b);
                return rih1Var;
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                iu30Var.invoke(y1h.c);
                return rih1Var;
            case 22:
                iu30Var.invoke(new uik((String) obj));
                return rih1Var;
            case 23:
                iu30Var.invoke(new qik((String) obj));
                return rih1Var;
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                iu30Var.invoke(nik.a);
                return rih1Var;
            case 25:
                iu30Var.invoke(pfo.b);
                return rih1Var;
            case 26:
                return iu30Var.invoke(obj);
            case 27:
                iu30Var.invoke(e1x.b);
                return rih1Var;
            case 28:
                iu30Var.invoke(e1x.c);
                return rih1Var;
            default:
                iu30Var.invoke(e1x.a);
                return rih1Var;
        }
    }
}
