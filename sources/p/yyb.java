package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.listplatform.filteringimpl.ListFilteringProto$StoredFilter;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class yyb implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ yyb(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return zyb.a;
            case 1:
                return new j0c(parcel.readParcelable(j0c.class.getClassLoader()));
            case 2:
                return new a4c(parcel);
            case 3:
                return new p4c((ka61) ka61.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 4:
                return new j7c(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 5:
                return new s8c(parcel.readString(), parcel.readString());
            case 6:
                d761 parcelable = parcel.readParcelable(bac.class.getClassLoader());
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(eac.CREATOR, parcel, arrayList, iD, 1);
                }
                return new bac(parcelable, arrayList, parcel.readString(), parcel.readString());
            case 7:
                int i2 = 1;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 == null) {
                    bhn0.i("Name is null");
                } else if (string3.equals("Small")) {
                    iD = i2;
                } else {
                    if (string3.equals("Medium")) {
                        i2 = 2;
                    } else if (string3.equals("Large")) {
                        i2 = 3;
                    } else if (string3.equals("XLarge")) {
                        i2 = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.bubblegraph.BubbleGraphViewGroup.BubbleSize.".concat(string3));
                    }
                    iD = i2;
                }
                return new eac(iD, string, string2, parcel.readString(), parcel.readString());
            case 8:
                parcel.readInt();
                return src.a;
            case 9:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                for (int i4 = 0; i4 != i3; i4++) {
                    arrayList2.add(Double.valueOf(parcel.readDouble()));
                }
                return new trc(parcel.readInt(), arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                parcel.readInt();
                return urc.a;
            case 11:
                return new ztc((mia1) mia1.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.createStringArrayList(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 12:
                return new vwc(parcel.readParcelable(tjm0.class.getClassLoader()), parcel.readParcelable(tjm0.class.getClassLoader()), (f7r) parcel.readParcelable(f7r.class.getClassLoader()), parcel.readParcelable(tjm0.class.getClassLoader()));
            case 13:
                return new oxc(parcel.readString(), parcel.readString());
            case 14:
                String str = ((bd31) bd31.CREATOR.createFromParcel(parcel)).a;
                String str2 = ((vcs0) vcs0.CREATOR.createFromParcel(parcel)).a;
                String str3 = ((acs0) acs0.CREATOR.createFromParcel(parcel)).a;
                int i5 = parcel.readInt();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                while (iD != i6) {
                    iD = cfm0.f(parcel, linkedHashMap, parcel.readString(), iD, 1);
                }
                return new izc(str, str2, str3, i5, linkedHashMap);
            case 15:
                parcel.readInt();
                return jzc.a;
            case 16:
                return new m0d(parcel.readString(), parcel.readString(), parcel.readString());
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new mfd(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return nfd.a;
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                Parcelable.Creator<ve10> creator = ve10.CREATOR;
                return new ngd(creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), parcel.readParcelable(ngd.class.getClassLoader()), parcel.readString());
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new pgd(ngd.CREATOR.createFromParcel(parcel));
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new zhd(hg50.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt());
            case 22:
                return new qmd(parcel.readLong());
            case 23:
                return new ksd((ax70) ax70.CREATOR.createFromParcel(parcel));
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new lsd((d9h) d9h.CREATOR.createFromParcel(parcel));
            case 25:
                return new vsd(parcel.readParcelable(vsd.class.getClassLoader()));
            case 26:
                return new wsd(parcel.readParcelable(wsd.class.getClassLoader()));
            case 27:
                return new xsd(parcel.readParcelable(xsd.class.getClassLoader()));
            case 28:
                parcel.readInt();
                return ysd.a;
            default:
                yor0 yor0Var = yor0.c;
                return new sud(yor0Var.d(parcel), yor0Var.d(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zyb[i];
            case 1:
                return new j0c[i];
            case 2:
                return new a4c[i];
            case 3:
                return new p4c[i];
            case 4:
                return new j7c[i];
            case 5:
                return new s8c[i];
            case 6:
                return new bac[i];
            case 7:
                return new eac[i];
            case 8:
                return new src[i];
            case 9:
                return new trc[i];
            case 10:
                return new urc[i];
            case 11:
                return new ztc[i];
            case 12:
                return new vwc[i];
            case 13:
                return new oxc[i];
            case 14:
                return new izc[i];
            case 15:
                return new jzc[i];
            case 16:
                return new m0d[i];
            case ListFilteringProto$StoredFilter.ONLY_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 17 */:
                return new mfd[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_ITEMS_WITH_BANNED_ARTIST_FIELD_NUMBER /* 18 */:
                return new nfd[i];
            case ListFilteringProto$StoredFilter.EXCLUDE_INJECTED_RECOMMENDATIONS_FIELD_NUMBER /* 19 */:
                return new ngd[i];
            case ListFilteringProto$StoredFilter.FORMAT_LIST_ATTRIBUTE_KEYS_FIELD_NUMBER /* 20 */:
                return new pgd[i];
            case ListFilteringProto$StoredFilter.TAG_IDS_FIELD_NUMBER /* 21 */:
                return new zhd[i];
            case 22:
                return new qmd[i];
            case 23:
                return new ksd[i];
            case ListFilteringProto$StoredFilter.VIDEO_NOT_AVAILABLE_OFFLINE_ONLY_FIELD_NUMBER /* 24 */:
                return new lsd[i];
            case 25:
                return new vsd[i];
            case 26:
                return new wsd[i];
            case 27:
                return new xsd[i];
            case 28:
                return new ysd[i];
            default:
                return new sud[i];
        }
    }
}
