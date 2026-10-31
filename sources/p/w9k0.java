package p;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutItemUnavailable;
import com.spotify.checkout.proto.model.v1.proto.CheckoutStatus;
import com.spotify.checkout.proto.model.v1.proto.Error;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w9k0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        switch (this.a) {
            case 0:
                parcel.readInt();
                return x9k0.a;
            case 1:
                boolean z = parcel.readInt() != 0;
                dbk0 dbk0VarCreateFromParcel = dbk0.CREATOR.createFromParcel(parcel);
                boolean z2 = parcel.readInt() != 0;
                boolean z3 = parcel.readInt() != 0;
                Class<kak0> cls = kak0.class;
                pdm0 parcelable = parcel.readParcelable(cls.getClassLoader());
                Boolean boolValueOf = parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0);
                ycu0 parcelable2 = parcel.readParcelable(cls.getClassLoader());
                lhg1 parcelable3 = parcel.readParcelable(cls.getClassLoader());
                lhg1 parcelable4 = parcel.readParcelable(cls.getClassLoader());
                lhg1 parcelable5 = parcel.readParcelable(cls.getClassLoader());
                xx8 xx8Var = (xx8) xx8.CREATOR.createFromParcel(parcel);
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                int iD = 0;
                while (true) {
                    Class<kak0> cls2 = cls;
                    if (iD == i2) {
                        Boolean bool = boolValueOf;
                        int i3 = parcel.readInt();
                        ArrayList arrayList2 = new ArrayList(i3);
                        int iD2 = 0;
                        while (iD2 != i3) {
                            iD2 = dsl0.d(sr10.CREATOR, parcel, arrayList2, iD2, 1);
                            i3 = i3;
                        }
                        return new kak0(z, dbk0VarCreateFromParcel, z2, z3, parcelable, bool, parcelable2, parcelable3, parcelable4, parcelable5, xx8Var, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readParcelable(cls2.getClassLoader()), parcel.readParcelable(cls2.getClassLoader()), parcel.readParcelable(cls2.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readParcelable(cls2.getClassLoader()), parcel.readParcelable(cls2.getClassLoader()), parcel.readInt() != 0, parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readFloat(), parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt() == 0 ? null : Float.valueOf(parcel.readFloat()), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readParcelable(cls2.getClassLoader()), parcel.readInt() == 0 ? null : Boolean.valueOf(parcel.readInt() != 0), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (lyj0) lyj0.CREATOR.createFromParcel(parcel), parcel.readLong(), parcel.readInt() != 0, 0, 786463);
                    }
                    iD = dsl0.d(sr10.CREATOR, parcel, arrayList, iD, 1);
                    cls = cls2;
                    boolValueOf = boolValueOf;
                }
                break;
            case 2:
                return dbk0.valueOf(parcel.readString());
            case 3:
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                int iD3 = 0;
                while (iD3 != i4) {
                    iD3 = dsl0.d(di90.CREATOR, parcel, arrayList3, iD3, 1);
                }
                return new zgk0(arrayList3, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readParcelable(zgk0.class.getClassLoader()), parcel.readInt() != 0);
            case 4:
                String string = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList4.add(parcel.createStringArrayList());
                }
                return new bhk0(string, arrayListCreateStringArrayList, arrayList4, parcel.createStringArrayList());
            case 5:
                return new ihk0(parcel.readString(), parcel.readString());
            case 6:
                return new tam0(parcel.readString(), parcel.readParcelable(tam0.class.getClassLoader()));
            case 7:
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                for (int i9 = 0; i9 != i8; i9++) {
                    arrayList5.add(Integer.valueOf(parcel.readInt()));
                }
                return new kdm0(i7, arrayList5);
            case 8:
                return new ldm0(parcel.readParcelable(ldm0.class.getClassLoader()));
            case 9:
                parcel.readInt();
                return mdm0.a;
            case 10:
                parcel.readInt();
                return ndm0.a;
            case 11:
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i10 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i10);
                int iD4 = 0;
                while (iD4 != i10) {
                    iD4 = dsl0.d(sr10.CREATOR, parcel, arrayList6, iD4, 1);
                }
                return new odm0(parcel.readInt(), parcel.readInt(), string2, string3, arrayList6, parcel.readInt() != 0);
            case 12:
                return new wem0((MessageResponseToken) parcel.readParcelable(wem0.class.getClassLoader()));
            case 13:
                return ofm0.valueOf(parcel.readString());
            case 14:
                return new gfm0(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readString());
            case 15:
                return new hfm0(parcel.readString());
            case 16:
                parcel.readInt();
                return ifm0.a;
            case 17:
                return new jfm0(p061.CREATOR.createFromParcel(parcel), xm21.CREATOR.createFromParcel(parcel));
            case 18:
                return new kfm0(p061.CREATOR.createFromParcel(parcel), parcel.readInt());
            case 19:
                return new lfm0((by81) parcel.readParcelable(lfm0.class.getClassLoader()));
            case 20:
                return new xfm0(Error.u(parcel.createByteArray()));
            case 21:
                return new zfm0(CheckoutStatus.r(parcel.createByteArray()));
            case 22:
                return new thm0(parcel.readString());
            case 23:
                return new uhm0(parcel.readParcelable(uhm0.class.getClassLoader()));
            case 24:
                return new zgm0(parcel.readString(), parcel.readInt() != 0);
            case 25:
                return new ahm0(parcel.readParcelable(ahm0.class.getClassLoader()), parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0);
            case 26:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                boolean z5 = parcel.readInt() != 0;
                String string6 = parcel.readString();
                boolean z6 = parcel.readInt() != 0;
                boolean z7 = parcel.readInt() != 0;
                boolean z8 = parcel.readInt() != 0;
                int i11 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i11);
                int iG = 0;
                while (iG != i11) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                int i12 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i12);
                int iG2 = 0;
                while (iG2 != i12) {
                    iG2 = k4s0.g(parcel, linkedHashSet2, iG2, 1);
                }
                boolean z9 = parcel.readInt() != 0;
                boolean z10 = parcel.readInt() != 0;
                int i13 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i13);
                int iG3 = 0;
                while (iG3 != i13) {
                    iG3 = k4s0.g(parcel, linkedHashSet3, iG3, 1);
                }
                boolean z11 = parcel.readInt() != 0;
                xbe0 parcelable6 = parcel.readParcelable(dhm0.class.getClassLoader());
                boolean z12 = parcel.readInt() != 0;
                boolean z13 = parcel.readInt() != 0;
                int i14 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i14);
                int iH = 0;
                while (iH != i14) {
                    iH = x0d.h(dhm0.class, parcel, arrayList7, iH, 1);
                }
                return new dhm0(string4, string5, z4, z5, string6, z6, z7, z8, linkedHashSet, linkedHashSet2, z9, z10, linkedHashSet3, z11, parcelable6, z12, z13, arrayList7, parcel.readString(), parcel.readInt(), 524288);
            case 27:
                String string7 = parcel.readString();
                int i15 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i15);
                int iD5 = 0;
                while (iD5 != i15) {
                    iD5 = dsl0.d(ow01.CREATOR, parcel, arrayList8, iD5, 1);
                }
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (!string8.equals("Error")) {
                        if (string8.equals("Loaded")) {
                            i = 2;
                        } else if (string8.equals("Loading")) {
                            i = 3;
                        } else if (string8.equals("PendingLoad")) {
                            i = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.listuxplatformconsumers.standard.sections.morelikethis.mobius.domain.LoadingState.".concat(string8));
                        }
                    }
                    return new ehm0(string7, arrayList8, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new ehm0(string7, arrayList8, i);
            case 28:
                int iG4 = 0;
                String string9 = parcel.readString();
                boolean z14 = parcel.readInt() != 0;
                Uri uri = (Uri) parcel.readParcelable(hhm0.class.getClassLoader());
                boolean z15 = parcel.readInt() != 0;
                String string10 = parcel.readString();
                boolean z16 = parcel.readInt() != 0;
                int i16 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i16);
                while (iG4 != i16) {
                    iG4 = k4s0.g(parcel, linkedHashSet4, iG4, 1);
                }
                return new hhm0(string9, z14, uri, z15, string10, z16, linkedHashSet4);
            default:
                return new egm0(CheckoutItemUnavailable.r(parcel.createByteArray()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new x9k0[i];
            case 1:
                return new kak0[i];
            case 2:
                return new dbk0[i];
            case 3:
                return new zgk0[i];
            case 4:
                return new bhk0[i];
            case 5:
                return new ihk0[i];
            case 6:
                return new tam0[i];
            case 7:
                return new kdm0[i];
            case 8:
                return new ldm0[i];
            case 9:
                return new mdm0[i];
            case 10:
                return new ndm0[i];
            case 11:
                return new odm0[i];
            case 12:
                return new wem0[i];
            case 13:
                return new ofm0[i];
            case 14:
                return new gfm0[i];
            case 15:
                return new hfm0[i];
            case 16:
                return new ifm0[i];
            case 17:
                return new jfm0[i];
            case 18:
                return new kfm0[i];
            case 19:
                return new lfm0[i];
            case 20:
                return new xfm0[i];
            case 21:
                return new zfm0[i];
            case 22:
                return new thm0[i];
            case 23:
                return new uhm0[i];
            case 24:
                return new zgm0[i];
            case 25:
                return new ahm0[i];
            case 26:
                return new dhm0[i];
            case 27:
                return new ehm0[i];
            case 28:
                return new hhm0[i];
            default:
                return new egm0[i];
        }
    }
}
