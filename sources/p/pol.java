package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import com.spotify.concertpageview.v1.Row;
import com.spotify.cosmos.util.libs.proto.EpisodeDecorationPolicy;
import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class pol implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:87:0x0249  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        int i2;
        int i3;
        int i4 = 1;
        int iH = 0;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return qol.a;
            case 1:
                parcel.readInt();
                return rol.a;
            case 2:
                return new sol((w4i1) w4i1.CREATOR.createFromParcel(parcel));
            case 3:
                return new vol(parcel.readString(), parcel.readString());
            case 4:
                return new wol(parcel.readString(), (lg31) (parcel.readInt() != 0 ? lg31.CREATOR.createFromParcel(parcel) : null), parcel.readInt() != 0);
            case 5:
                return new lpl(parcel.readString(), (bc71) parcel.readParcelable(lpl.class.getClassLoader()), parcel.readString(), (kpl) parcel.readParcelable(lpl.class.getClassLoader()), parcel.readInt() != 0 ? hmp0.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString());
            case 6:
                return new bpl(parcel.readString(), parcel.readString());
            case 7:
                return new cpl(parcel.readString());
            case 8:
                return new dpl(parcel.readString());
            case 9:
                return new fpl(parcel.readString(), parcel.readLong(), parcel.readLong(), (epl) parcel.readParcelable(fpl.class.getClassLoader()));
            case 10:
                return new gpl(parcel.readString());
            case 11:
                return new hpl(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new ipl(parcel.readString());
            case 13:
                return new jpl(parcel.readString(), parcel.readString(), parcel.readString());
            case 14:
                return new mpl(parcel.readString(), parcel.readInt() != 0);
            case 15:
                return new npl(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 16:
                String string = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                int iD = 0;
                while (iD != i5) {
                    iD = dsl0.d(opl.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ppl(string, arrayList, parcel.readInt() != 0);
            case 17:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (!string3.equals("IMAGE")) {
                        if (string3.equals("VIDEO")) {
                            i4 = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.models.Content.UserGeneratedContent.MediaItem.MediaType.".concat(string3));
                        }
                    }
                    return new opl(string2, i4, (mg31) (parcel.readInt() != 0 ? mg31.CREATOR.createFromParcel(parcel) : null));
                }
                bhn0.i("Name is null");
                i4 = 0;
                return new opl(string2, i4, (mg31) (parcel.readInt() != 0 ? mg31.CREATOR.createFromParcel(parcel) : null));
            case 18:
                parcel.readInt();
                return xpl.a;
            case 19:
                parcel.readInt();
                return ypl.a;
            case 20:
                parcel.readInt();
                return zpl.a;
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                gyl gylVar = new gyl();
                String string4 = parcel.readString();
                if (TextUtils.isEmpty(string4)) {
                    i = 0;
                } else {
                    int[] iArrH = l1d.H(24);
                    int length = iArrH.length;
                    int i6 = 0;
                    while (true) {
                        if (i6 < length) {
                            i = iArrH[i6];
                            if (!i3a.s(i).equalsIgnoreCase(string4)) {
                                i6++;
                            }
                        } else {
                            i = 0;
                        }
                    }
                }
                gylVar.a = i;
                gylVar.b = (Double) parcel.readSerializable();
                gylVar.c = (Double) parcel.readSerializable();
                String string5 = parcel.readString();
                if (TextUtils.isEmpty(string5)) {
                    i2 = 0;
                } else {
                    int[] iArrH2 = l1d.H(178);
                    int length2 = iArrH2.length;
                    int i7 = 0;
                    while (true) {
                        if (i7 < length2) {
                            i2 = iArrH2[i7];
                            if (!pzm.a(i2).equals(string5)) {
                                i7++;
                            }
                        } else {
                            i2 = 0;
                        }
                    }
                }
                gylVar.d = i2;
                gylVar.e = parcel.readString();
                gylVar.f = parcel.readString();
                gylVar.g = parcel.readString();
                String string6 = parcel.readString();
                if (TextUtils.isEmpty(string6)) {
                    i3 = 0;
                } else {
                    int[] iArrH3 = l1d.H(21);
                    int length3 = iArrH3.length;
                    int i8 = 0;
                    while (true) {
                        if (i8 < length3) {
                            i3 = iArrH3[i8];
                            if (!lzu0.c(i3).equalsIgnoreCase(string6)) {
                                i8++;
                            }
                        } else {
                            i3 = 0;
                        }
                    }
                }
                gylVar.h = i3;
                String string7 = parcel.readString();
                if (!TextUtils.isEmpty(string7)) {
                    for (int i9 : l1d.H(8)) {
                        if (ydh.p(i9).equalsIgnoreCase(string7)) {
                            iH = i9;
                        }
                    }
                }
                gylVar.i = iH;
                gylVar.t = parcel.readString();
                gylVar.X = (Double) parcel.readSerializable();
                gylVar.Y = (Double) parcel.readSerializable();
                gylVar.Z = (Integer) parcel.readSerializable();
                gylVar.N0 = (Double) parcel.readSerializable();
                gylVar.O0 = parcel.readString();
                gylVar.P0 = parcel.readString();
                gylVar.Q0 = parcel.readString();
                gylVar.R0 = parcel.readString();
                gylVar.S0 = parcel.readString();
                gylVar.T0 = (Double) parcel.readSerializable();
                gylVar.U0 = (Double) parcel.readSerializable();
                gylVar.V0.addAll((ArrayList) parcel.readSerializable());
                gylVar.W0.putAll((HashMap) parcel.readSerializable());
                return gylVar;
            case 22:
                return new wyl(parcel.readInt(), parcel.readInt());
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                int iZ = x0d.z(parcel.readString());
                int i10 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i10);
                while (iH != i10) {
                    iH = x0d.h(xyl.class, parcel, arrayList2, iH, 1);
                }
                return new xyl(iZ, arrayList2);
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new yyl(parcel.readString(), parcel.readParcelable(yyl.class.getClassLoader()), parcel.readInt(), parcel.readParcelable(yyl.class.getClassLoader()));
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new zyl(parcel.readParcelable(zyl.class.getClassLoader()));
            case 26:
                xl81 parcelable = parcel.readParcelable(azl.class.getClassLoader());
                boolean z = parcel.readInt() != 0;
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i11 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i11);
                while (iH != i11) {
                    iH = x0d.h(azl.class, parcel, arrayList3, iH, 1);
                }
                return new azl(parcelable, z, string8, arrayListCreateStringArrayList, arrayList3, parcel.readString());
            case 27:
                return new bzl(parcel.readString());
            case 28:
                return new czl(parcel.readString(), parcel.readParcelable(czl.class.getClassLoader()), parcel.readInt());
            default:
                return new dzl(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new qol[i];
            case 1:
                return new rol[i];
            case 2:
                return new sol[i];
            case 3:
                return new vol[i];
            case 4:
                return new wol[i];
            case 5:
                return new lpl[i];
            case 6:
                return new bpl[i];
            case 7:
                return new cpl[i];
            case 8:
                return new dpl[i];
            case 9:
                return new fpl[i];
            case 10:
                return new gpl[i];
            case 11:
                return new hpl[i];
            case 12:
                return new ipl[i];
            case 13:
                return new jpl[i];
            case 14:
                return new mpl[i];
            case 15:
                return new npl[i];
            case 16:
                return new ppl[i];
            case 17:
                return new opl[i];
            case 18:
                return new xpl[i];
            case 19:
                return new ypl[i];
            case 20:
                return new zpl[i];
            case Row.TICKETING_TIMELINE_PLACEHOLDER_ROW_FIELD_NUMBER /* 21 */:
                return new gyl[i];
            case 22:
                return new wyl[i];
            case EpisodeDecorationPolicy.IS_BOOK_CHAPTER_FIELD_NUMBER /* 23 */:
                return new xyl[i];
            case EpisodeDecorationPolicy.IS_PODCAST_SHORT_FIELD_NUMBER /* 24 */:
                return new yyl[i];
            case EpisodeDecorationPolicy.IS_CURATED_FIELD_NUMBER /* 25 */:
                return new zyl[i];
            case 26:
                return new azl[i];
            case 27:
                return new bzl[i];
            case 28:
                return new czl[i];
            default:
                return new dzl[i];
        }
    }
}
