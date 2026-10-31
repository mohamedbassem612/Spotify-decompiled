package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.allboarding.allboardingdomain.model.SearchConfiguration;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ezl implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ezl(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 2;
        switch (this.a) {
            case 0:
                return new fzl(parcel.readString());
            case 1:
                return new gzl(parcel.readString(), (SearchConfiguration) parcel.readParcelable(gzl.class.getClassLoader()));
            case 2:
                return new hzl(parcel.readString(), parcel.readInt(), parcel.readString());
            case 3:
                return new izl(parcel.readString(), p791.valueOf(parcel.readString()));
            case 4:
                return new jzl(parcel.readString());
            case 5:
                return new k1m(parcel.readString(), parcel.readString());
            case 6:
                return new n1m(parcel.readString(), parcel.readString());
            case 7:
                return new d2m(parcel.readString());
            case 8:
                return new e2m(parcel.readString());
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("CIRCLE")) {
                        i = 1;
                    } else if (!string2.equals("SQUARE")) {
                        hhg1.n("No enum constant com.spotify.allboarding.uiusecases.contentstack.ContentStackElement.Shape.".concat(string2));
                    }
                    return new p6m(string, i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new p6m(string, i);
            case 10:
                parcel.readInt();
                return bim.a;
            case 11:
                parcel.readInt();
                return cim.a;
            case 12:
                return new mim(parcel.readString(), parcel.readParcelable(mim.class.getClassLoader()), parcel.readParcelable(mim.class.getClassLoader()));
            case 13:
                String string3 = parcel.readString();
                int i2 = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                int iH = 0;
                while (iH != i3) {
                    iH = x0d.h(nim.class, parcel, arrayList, iH, 1);
                }
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iH2 = 0;
                while (iH2 != i4) {
                    iH2 = x0d.h(nim.class, parcel, arrayList2, iH2, 1);
                }
                return new nim(i2, string3, string4, string5, arrayList, arrayList2, parcel.readInt() != 0, parcel.readInt() != 0);
            case 14:
                return new bjm(parcel.readString(), parcel.readString(), parcel.readString());
            case 15:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                w4i1 w4i1VarCreateFromParcel = w4i1.CREATOR.createFromParcel(parcel);
                boolean z = false;
                long j = parcel.readLong();
                if (parcel.readInt() != 0) {
                    z = true;
                }
                upl parcelable = parcel.readParcelable(tom.class.getClassLoader());
                rom parcelable2 = parcel.readParcelable(tom.class.getClassLoader());
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iD = 0;
                while (iD != i5) {
                    iD = dsl0.d(gxz0.CREATOR, parcel, arrayList3, iD, 1);
                }
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                int iD2 = 0;
                while (iD2 != i6) {
                    iD2 = dsl0.d(pj01.CREATOR, parcel, arrayList4, iD2, 1);
                }
                return new tom(string6, string7, w4i1VarCreateFromParcel, j, z, parcelable, parcelable2, arrayList3, arrayList4, parcel.readParcelable(tom.class.getClassLoader()), parcel.readInt() != 0, (xo2) (parcel.readInt() == 0 ? null : xo2.CREATOR.createFromParcel(parcel)));
            case 16:
                parcel.readInt();
                return hom.a;
            case 17:
                parcel.readInt();
                return iom.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("UNSPECIFIED")) {
                        i = 1;
                    } else if (!string8.equals("PAIRING_NEEDED")) {
                        if (string8.equals("RE_PAIRING_NEEDED")) {
                            i = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.models.Contribution.ModerationStatus.HiddenReason.".concat(string8));
                        }
                    }
                    return new jom(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new jom(i);
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                parcel.readInt();
                return kom.a;
            case 20:
                return new lom(parcel.readLong());
            case 21:
                return new mom(parcel.readLong());
            case 22:
                return new oom(parcel.readInt() != 0, parcel.readInt() != 0);
            case 23:
                return new pom(parcel.readInt() != 0);
            case 24:
                parcel.readInt();
                return qom.a;
            case 25:
                return new esm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 26:
                return new xsm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 27:
                return new etm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 28:
                return new htm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            default:
                return new qtm(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new fzl[i];
            case 1:
                return new gzl[i];
            case 2:
                return new hzl[i];
            case 3:
                return new izl[i];
            case 4:
                return new jzl[i];
            case 5:
                return new k1m[i];
            case 6:
                return new n1m[i];
            case 7:
                return new d2m[i];
            case 8:
                return new e2m[i];
            case 9:
                return new p6m[i];
            case 10:
                return new bim[i];
            case 11:
                return new cim[i];
            case 12:
                return new mim[i];
            case 13:
                return new nim[i];
            case 14:
                return new bjm[i];
            case 15:
                return new tom[i];
            case 16:
                return new hom[i];
            case 17:
                return new iom[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new jom[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new kom[i];
            case 20:
                return new lom[i];
            case 21:
                return new mom[i];
            case 22:
                return new oom[i];
            case 23:
                return new pom[i];
            case 24:
                return new qom[i];
            case 25:
                return new esm[i];
            case 26:
                return new xsm[i];
            case 27:
                return new etm[i];
            case 28:
                return new htm[i];
            default:
                return new qtm[i];
        }
    }
}
