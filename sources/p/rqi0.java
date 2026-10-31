package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class rqi0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i = 1;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new sqi0(parcel.readString(), parcel.readString());
            case 1:
                return new tri0(parcel.readString());
            case 2:
                return new sxi0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 3:
                parcel.readInt();
                return qzi0.a;
            case 4:
                int i2 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(fhy.CREATOR, parcel, arrayList, iD, 1);
                }
                return new rzi0(arrayList);
            case 5:
                parcel.readInt();
                return szi0.a;
            case 6:
                return new d3j0(parcel.readParcelable(d3j0.class.getClassLoader()), parcel.readParcelable(d3j0.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return w2j0.a;
            case 8:
                parcel.readInt();
                return x2j0.a;
            case 9:
                return new z2j0(parcel.readInt() != 0);
            case 10:
                parcel.readInt();
                return a3j0.a;
            case 11:
                return new b3j0(parcel.readInt() != 0);
            case 12:
                return g4j0.valueOf(parcel.readString());
            case 13:
                parcel.readInt();
                return k4j0.a;
            case 14:
                parcel.readInt();
                return l4j0.a;
            case 15:
                parcel.readInt();
                return m4j0.a;
            case 16:
                parcel.readInt();
                return n4j0.a;
            case 17:
                parcel.readInt();
                return o4j0.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return p4j0.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new b7j0(parcel.readParcelable(b7j0.class.getClassLoader()));
            case 20:
                parcel.readInt();
                return c7j0.a;
            case 21:
                parcel.readInt();
                return d7j0.a;
            case 22:
                parcel.readInt();
                return c8j0.a;
            case 23:
                String string = parcel.readString();
                if (string != null) {
                    if (!string.equals("Unspecified")) {
                        if (string.equals("CurrentUserBlockingOtherUser")) {
                            i = 2;
                        } else if (string.equals("OtherUserOptedOut")) {
                            i = 3;
                        } else if (string.equals("AwaitingAcceptance")) {
                            i = 4;
                        } else if (string.equals("AcceptanceRequired")) {
                            i = 5;
                        } else if (string.equals("NotFriends")) {
                            i = 6;
                        } else if (string.equals("HierarchyInactive")) {
                            i = 7;
                        } else if (string.equals("StartRequired")) {
                            i = 8;
                        } else {
                            hhg1.n("No enum constant com.spotify.campfire.models.MessagingAvailability.UnavailableReason.".concat(string));
                        }
                    }
                    return new d8j0(i);
                }
                bhn0.i("Name is null");
                i = 0;
                return new d8j0(i);
            case 24:
                parcel.readInt();
                return e8j0.a;
            case 25:
                return new xcj0(parcel.readString());
            case 26:
                return new bdj0(parcel.readString(), parcel.readString());
            case 27:
                parcel.readInt();
                return vej0.a;
            case 28:
                parcel.readInt();
                return mhj0.a;
            default:
                parcel.readInt();
                return nhj0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new sqi0[i];
            case 1:
                return new tri0[i];
            case 2:
                return new sxi0[i];
            case 3:
                return new qzi0[i];
            case 4:
                return new rzi0[i];
            case 5:
                return new szi0[i];
            case 6:
                return new d3j0[i];
            case 7:
                return new w2j0[i];
            case 8:
                return new x2j0[i];
            case 9:
                return new z2j0[i];
            case 10:
                return new a3j0[i];
            case 11:
                return new b3j0[i];
            case 12:
                return new g4j0[i];
            case 13:
                return new k4j0[i];
            case 14:
                return new l4j0[i];
            case 15:
                return new m4j0[i];
            case 16:
                return new n4j0[i];
            case 17:
                return new o4j0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new p4j0[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new b7j0[i];
            case 20:
                return new c7j0[i];
            case 21:
                return new d7j0[i];
            case 22:
                return new c8j0[i];
            case 23:
                return new d8j0[i];
            case 24:
                return new e8j0[i];
            case 25:
                return new xcj0[i];
            case 26:
                return new bdj0[i];
            case 27:
                return new vej0[i];
            case 28:
                return new mhj0[i];
            default:
                return new nhj0[i];
        }
    }
}
