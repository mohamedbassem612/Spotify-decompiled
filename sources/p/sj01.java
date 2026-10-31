package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class sj01 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:69:0x0112 A[LOOP:0: B:68:0x0110->B:69:0x0112, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        ArrayList arrayList;
        int iD = 0;
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                yor0 yor0Var = yor0.c;
                return new tj01(string, yor0Var.d(parcel), yor0Var.d(parcel), yor0Var.d(parcel));
            case 1:
                return new uj01(parcel.readString(), parcel.readInt());
            case 2:
                String string2 = parcel.readString();
                yor0 yor0Var2 = yor0.c;
                return new vj01(string2, yor0Var2.d(parcel), yor0Var2.d(parcel));
            case 3:
                return new gk01(parcel.readString(), parcel.readLong());
            case 4:
                parcel.readInt();
                return hk01.a;
            case 5:
                return new qk01(parcel.readInt());
            case 6:
                return new rk01(ywx0.u(parcel.readString()));
            case 7:
                int iH = 0;
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iH2 = 0;
                while (iH2 != i3) {
                    iH2 = x0d.h(sk01.class, parcel, arrayList2, iH2, 1);
                }
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iH != i4) {
                    iH = x0d.h(sk01.class, parcel, arrayList3, iH, 1);
                }
                return new sk01(string3, string4, arrayList2, arrayList3);
            case 8:
                parcel.readInt();
                return tk01.a;
            case 9:
                return new uk01(parcel.readInt(), parcel.readInt());
            case 10:
                return new vk01(parcel.readInt() != 0);
            case 11:
                parcel.readInt();
                return wk01.a;
            case 12:
                return new el01(parcel.readString(), parcel.readInt(), ywx0.u(parcel.readString()));
            case 13:
                String string5 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                int iH3 = 0;
                while (iH3 != i5) {
                    iH3 = x0d.h(fl01.class, parcel, arrayList4, iH3, 1);
                }
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                int iH4 = 0;
                while (iH4 != i6) {
                    iH4 = x0d.h(fl01.class, parcel, arrayList5, iH4, 1);
                }
                return new fl01(string5, arrayList4, string6, string7, arrayList5, parcel.readInt(), parcel.readInt() != 0, parcel.readInt(), parcel.readInt());
            case 14:
                return new gl01(parcel.readString(), parcel.readInt());
            case 15:
                return new nl01(parcel.readString());
            case 16:
                return new em01(parcel.readString(), parcel.readInt() != 0);
            case 17:
                parcel.readInt();
                return kn01.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ln01(parcel.createStringArrayList());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new yq01(parcel.readString(), parcel.readInt());
            case 20:
                return new ar01(parcel.readString(), parcel.readString());
            case 21:
                return br01.valueOf(parcel.readString());
            case 22:
                return new ft01(parcel.readString(), parcel.readString());
            case 23:
                return new dv01(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 24:
                return new lv01(parcel.readInt(), parcel.createStringArrayList(), parcel.readParcelable(lv01.class.getClassLoader()), (br01) (parcel.readInt() != 0 ? br01.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 25:
                return new ow01(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("RECOMMENDATIONS_TYPE_UNKNOWN")) {
                        i = 1;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_ARTIST")) {
                        i = 2;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_GENRE")) {
                        i = 3;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_PODCASTS_FOR_CATEGORY")) {
                        i = 4;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_PLAYLISTS_WITH_TRACK")) {
                        i = 5;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_TOPICS_WITH_EPISODE")) {
                        i = 6;
                    } else if (string8.equals("RECOMMENDATIONS_TYPE_PERSONALIZED_PODCASTS_FOR_CATEGORY")) {
                        i = 7;
                    } else if (string8.equals("UNRECOGNIZED")) {
                        i = 8;
                    } else {
                        hhg1.n("No enum constant com.spotify.search.searchview.RecommendationsType.".concat(string8));
                    }
                    i2 = parcel.readInt();
                    arrayList = new ArrayList(i2);
                    while (iD != i2) {
                        iD = dsl0.d(lby.CREATOR, parcel, arrayList, iD, 1);
                    }
                    return new xy01(i, arrayList);
                }
                bhn0.i("Name is null");
                i = 0;
                i2 = parcel.readInt();
                arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(lby.CREATOR, parcel, arrayList, iD, 1);
                }
                return new xy01(i, arrayList);
            case 27:
                return new u011(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), (Uri) parcel.readParcelable(u011.class.getClassLoader()));
            case 28:
                return new f111(parcel.readString());
            default:
                return new p111(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.createStringArrayList(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(p111.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new tj01[i];
            case 1:
                return new uj01[i];
            case 2:
                return new vj01[i];
            case 3:
                return new gk01[i];
            case 4:
                return new hk01[i];
            case 5:
                return new qk01[i];
            case 6:
                return new rk01[i];
            case 7:
                return new sk01[i];
            case 8:
                return new tk01[i];
            case 9:
                return new uk01[i];
            case 10:
                return new vk01[i];
            case 11:
                return new wk01[i];
            case 12:
                return new el01[i];
            case 13:
                return new fl01[i];
            case 14:
                return new gl01[i];
            case 15:
                return new nl01[i];
            case 16:
                return new em01[i];
            case 17:
                return new kn01[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new ln01[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new yq01[i];
            case 20:
                return new ar01[i];
            case 21:
                return new br01[i];
            case 22:
                return new ft01[i];
            case 23:
                return new dv01[i];
            case 24:
                return new lv01[i];
            case 25:
                return new ow01[i];
            case 26:
                return new xy01[i];
            case 27:
                return new u011[i];
            case 28:
                return new f111[i];
            default:
                return new p111[i];
        }
    }
}
