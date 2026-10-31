package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class gwg1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        boolean z4 = false;
        switch (this.a) {
            case 0:
                return new hwg1(parcel.readString());
            case 1:
                return new wah1(parcel.readString(), (ResultReceiver) parcel.readParcelable(wah1.class.getClassLoader()));
            case 2:
                parcel.readInt();
                return kdh1.a;
            case 3:
                parcel.readInt();
                return ldh1.a;
            case 4:
                parcel.readInt();
                return mdh1.a;
            case 5:
                parcel.readInt();
                return odh1.a;
            case 6:
                return new zgh1(parcel.readInt() != 0);
            case 7:
                return new aih1(parcel.readString(), parcel.readString());
            case 8:
                return new pih1(parcel.readString(), parcel.readString(), (TriggerType) TriggerType.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 9:
                return new kkh1(parcel.readString(), parcel.readBundle(kkh1.class.getClassLoader()));
            case 10:
                return new jlh1(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 11:
                return new mph1(parcel.readString());
            case 12:
                return new ash1(parcel.readString());
            case 13:
                return new evh1(parcel.readParcelable(evh1.class.getClassLoader()), parcel.readParcelable(evh1.class.getClassLoader()), (ResultReceiver) parcel.readParcelable(evh1.class.getClassLoader()));
            case 14:
                parcel.readInt();
                return hvh1.a;
            case 15:
                parcel.readInt();
                return ivh1.a;
            case 16:
                parcel.readInt();
                return jvh1.a;
            case 17:
                return new kvh1(parcel.readInt());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new azh1(parcel.readString(), parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new dzh1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 20:
                boolean z5 = true;
                dzh1 parcelable = parcel.readParcelable(p0i1.class.getClassLoader());
                if (parcel.readInt() == 0) {
                    z5 = false;
                }
                return new p0i1(parcelable, z5);
            case 21:
                return new b1i1(parcel.readString(), parcel.readString());
            case 22:
                Object objCreateFromParcel = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                azh1 azh1Var = (azh1) (parcel.readInt() == 0 ? null : azh1.CREATOR.createFromParcel(parcel));
                Parcelable.Creator creator = b1i1.CREATOR;
                b1i1 b1i1Var = (b1i1) creator.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    objCreateFromParcel = creator.createFromParcel(parcel);
                }
                return new c1i1(string, string2, string3, azh1Var, b1i1Var, (b1i1) objCreateFromParcel);
            case 23:
                return new u1i1(parcel.readParcelable(u1i1.class.getClassLoader()));
            case 24:
                z740 parcelable2 = parcel.readParcelable(v1i1.class.getClassLoader());
                String string4 = parcel.readString();
                return new v1i1(parcelable2, string4 != null ? new fyl(string4) : null);
            case 25:
                return new w4i1(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString());
            case 26:
                boolean z6 = true;
                String string5 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z6 = false;
                }
                return new r6i1(string5, z6);
            case 27:
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                }
                if (parcel.readInt() != 0) {
                    z4 = z3;
                }
                exc0 exc0Var = (exc0) exc0.CREATOR.createFromParcel(parcel);
                rc50 rc50Var = (rc50) rc50.CREATOR.createFromParcel(parcel);
                if (parcel.readInt() != 0) {
                    z = false;
                    z2 = z3;
                } else {
                    z = z4;
                    z2 = z;
                }
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                if (parcel.readInt() != 0) {
                    z = z3;
                }
                return new x7i1(z3, z4, z4, z4, z4, z4, exc0Var, rc50Var, z2, z, z, z, z);
            case 28:
                return new w8i1(parcel.readString());
            default:
                return new a9i1(parcel.readString(), parcel.readParcelable(a9i1.class.getClassLoader()), px10.valueOf(parcel.readString()), e490.valueOf(parcel.readString()), parcel.readParcelable(a9i1.class.getClassLoader()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new hwg1[i];
            case 1:
                return new wah1[i];
            case 2:
                return new kdh1[i];
            case 3:
                return new ldh1[i];
            case 4:
                return new mdh1[i];
            case 5:
                return new odh1[i];
            case 6:
                return new zgh1[i];
            case 7:
                return new aih1[i];
            case 8:
                return new pih1[i];
            case 9:
                return new kkh1[i];
            case 10:
                return new jlh1[i];
            case 11:
                return new mph1[i];
            case 12:
                return new ash1[i];
            case 13:
                return new evh1[i];
            case 14:
                return new hvh1[i];
            case 15:
                return new ivh1[i];
            case 16:
                return new jvh1[i];
            case 17:
                return new kvh1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new azh1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new dzh1[i];
            case 20:
                return new p0i1[i];
            case 21:
                return new b1i1[i];
            case 22:
                return new c1i1[i];
            case 23:
                return new u1i1[i];
            case 24:
                return new v1i1[i];
            case 25:
                return new w4i1[i];
            case 26:
                return new r6i1[i];
            case 27:
                return new x7i1[i];
            case 28:
                return new w8i1[i];
            default:
                return new a9i1[i];
        }
    }
}
