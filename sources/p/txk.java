package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class txk implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ txk(byte b) {
        this.a = b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        char c;
        char c2;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new uxk((xxk) parcel.readParcelable(uxk.class.getClassLoader()));
            case 1:
                return new vxk(parcel.readString(), parcel.createStringArrayList(), parcel.readString(), parcel.readString());
            case 2:
                return new wxk(parcel.readString());
            case 3:
                return new yxk(parcel.readString(), parcel.readString());
            case 4:
                int i = 0;
                String string = parcel.readString();
                if (string == null) {
                    bhn0.i("Name is null");
                } else if (string.equals("FORCED_OFFLINE")) {
                    i = 1;
                } else if (string.equals("NO_INTERNET")) {
                    i = 2;
                } else {
                    hhg1.n("No enum constant com.spotify.connectivity.connectiontype.OfflineReason.".concat(string));
                }
                return new pal(i);
            case 5:
                parcel.readInt();
                return ral.a;
            case 6:
                return new ldl(parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new mdl(parcel.readString());
            case 8:
                parcel.readInt();
                return udl.a;
            case 9:
                parcel.readInt();
                return vel.a;
            case 10:
                return new wel(parcel.createStringArrayList());
            case 11:
                return new xel(parcel.createStringArrayList(), parcel.createStringArrayList());
            case 12:
                return new zel((yel) parcel.readParcelable(zel.class.getClassLoader()));
            case 13:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(ldl.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ofl(arrayList);
            case 14:
                return new sll(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 15:
                return new iml(parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                parcel.readInt();
                return jml.a;
            case 17:
                return new kml(parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new lml(parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new xml(parcel.readString(), parcel.readParcelable(xml.class.getClassLoader()), parcel.readInt() != 0);
            case 20:
                return new gnl(parcel.readString());
            case 21:
                char c3 = 2;
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iD2 = 0;
                while (iD2 != i3) {
                    iD2 = dsl0.d(qpl.CREATOR, parcel, arrayList2, iD2, 1);
                }
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                boolean z = true;
                int i4 = parcel.readInt();
                String string4 = parcel.readString();
                if (parcel.readInt() != 0) {
                    c = 0;
                } else {
                    z = false;
                    c = 0;
                }
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                boolean z2 = parcel.readInt() != 0 ? 1 : c;
                int iR = fd21.r(parcel.readString());
                String string7 = parcel.readString();
                if (string7 == null) {
                    bhn0.i("Name is null");
                    c2 = c;
                } else if (string7.equals("NONE")) {
                    c2 = 1;
                } else if (string7.equals("EXPLICIT")) {
                    c2 = c3;
                } else if (string7.equals("OVER_19_ONLY")) {
                    c3 = 3;
                    c2 = c3;
                } else {
                    hhg1.n("No enum constant com.spotify.allboarding.allboardingdomain.model.ContentRestriction.".concat(string7));
                    c2 = c;
                }
                return new qpl(string2, string3, arrayList2, arrayListCreateStringArrayList, i4, string4, z, string5, string6, z2, iR, c2);
            case 22:
                return new uol(parcel.readParcelable(uol.class.getClassLoader()));
            case 23:
                parcel.readInt();
                return iol.a;
            case 24:
                parcel.readInt();
                return jol.a;
            case 25:
                return new kol(parcel.readLong());
            case 26:
                parcel.readInt();
                return lol.a;
            case 27:
                parcel.readInt();
                return mol.a;
            case 28:
                parcel.readInt();
                return nol.a;
            default:
                return new ool(w4i1.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new uxk[i];
            case 1:
                return new vxk[i];
            case 2:
                return new wxk[i];
            case 3:
                return new yxk[i];
            case 4:
                return new pal[i];
            case 5:
                return new ral[i];
            case 6:
                return new ldl[i];
            case 7:
                return new mdl[i];
            case 8:
                return new udl[i];
            case 9:
                return new vel[i];
            case 10:
                return new wel[i];
            case 11:
                return new xel[i];
            case 12:
                return new zel[i];
            case 13:
                return new ofl[i];
            case 14:
                return new sll[i];
            case 15:
                return new iml[i];
            case 16:
                return new jml[i];
            case 17:
                return new kml[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new lml[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new xml[i];
            case 20:
                return new gnl[i];
            case 21:
                return new qpl[i];
            case 22:
                return new uol[i];
            case 23:
                return new iol[i];
            case 24:
                return new jol[i];
            case 25:
                return new kol[i];
            case 26:
                return new lol[i];
            case 27:
                return new mol[i];
            case 28:
                return new nol[i];
            default:
                return new ool[i];
        }
    }
}
