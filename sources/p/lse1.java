package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.protobuf.Timestamp;
import com.spotify.highlightsstats.data.proto.timeline.view.v1.UserTimeline;
import com.spotify.wrapped.v1.proto.Bespoke2026Content;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class lse1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ lse1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int iD = 0;
        switch (this.a) {
            case 0:
                return new mse1(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 1:
                return new nse1(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 2:
                return new cte1(UserTimeline.t(parcel.createByteArray()), parcel.readInt());
            case 3:
                return new tve1(parcel.readLong());
            case 4:
                return new wve1(parcel.readLong());
            case 5:
                return new uve1(parcel.readLong());
            case 6:
                return new vve1(parcel.readLong());
            case 7:
                return new zve1(parcel.readLong());
            case 8:
                return new bwe1(parcel.readLong());
            case 9:
                return new ywe1(parcel.readLong(), parcel.readInt(), parcel.readString());
            case 10:
                return new bxe1(parcel.readString());
            case 11:
                return new exe1(parcel.readString());
            case 12:
                return new hxe1(parcel.readInt(), parcel.readString());
            case 13:
                parcel.readInt();
                return ixe1.INSTANCE;
            case 14:
                return new lxe1(parcel.readInt(), parcel.readString(), parcel.readString());
            case 15:
                return new rxe1(parcel.readInt(), parcel.readInt(), parcel.readInt());
            case 16:
                return new kye1(parcel.readInt(), parcel.readString());
            case 17:
                return new lye1(parcel.readString(), parcel.readString());
            case 18:
                parcel.readInt();
                return m1f1.a;
            case 19:
                return new n1f1(parcel.readInt() != 0);
            case 20:
                parcel.readInt();
                return p1f1.a;
            case 21:
                return new q1f1(parcel.readParcelable(q1f1.class.getClassLoader()));
            case 22:
                parcel.readInt();
                return r1f1.a;
            case 23:
                parcel.readInt();
                return m2f1.a;
            case 24:
                f371 parcelable = parcel.readParcelable(n2f1.class.getClassLoader());
                sve1 sve1VarR = Timestamp.r();
                sve1VarR.q(parcel.readLong());
                sve1VarR.n(parcel.readInt());
                return new n2f1(parcelable, sve1VarR.build(), parcel.readString(), kn71.valueOf(parcel.readString()));
            case 25:
                return new q2f1(parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 26:
                tcx0 tcx0VarCreateFromParcel = tcx0.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(o620.CREATOR, parcel, arrayList, iD, 1);
                }
                return new h3f1(tcx0VarCreateFromParcel, arrayList);
            case 27:
                return new m8f1(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iD != i2) {
                    iD = dsl0.d(q8f1.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new o8f1(parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), arrayList2);
            default:
                String string = parcel.readString();
                String string2 = parcel.readString();
                xxh parcelable2 = parcel.readParcelable(q8f1.class.getClassLoader());
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                d761 parcelable3 = parcel.readParcelable(q8f1.class.getClassLoader());
                int iS = parcel.readInt() == 0 ? 0 : us71.s(parcel.readString());
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(m8f1.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new q8f1(string, string2, parcelable2, string3, i3, string4, string5, parcelable3, iS, arrayList3);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new mse1[i];
            case 1:
                return new nse1[i];
            case 2:
                return new cte1[i];
            case 3:
                return new tve1[i];
            case 4:
                return new wve1[i];
            case 5:
                return new uve1[i];
            case 6:
                return new vve1[i];
            case 7:
                return new zve1[i];
            case 8:
                return new bwe1[i];
            case 9:
                return new ywe1[i];
            case 10:
                return new bxe1[i];
            case 11:
                return new exe1[i];
            case 12:
                return new hxe1[i];
            case 13:
                return new ixe1[i];
            case 14:
                return new lxe1[i];
            case 15:
                return new rxe1[i];
            case 16:
                return new kye1[i];
            case 17:
                return new lye1[i];
            case 18:
                return new m1f1[i];
            case 19:
                return new n1f1[i];
            case 20:
                return new p1f1[i];
            case 21:
                return new q1f1[i];
            case 22:
                return new r1f1[i];
            case 23:
                return new m2f1[i];
            case 24:
                return new n2f1[i];
            case 25:
                return new q2f1[i];
            case 26:
                return new h3f1[i];
            case 27:
                return new m8f1[i];
            case Bespoke2026Content.RELATIONSHIP_STATUS_REVEAL_FIELD_NUMBER /* 28 */:
                return new o8f1[i];
            default:
                return new q8f1[i];
        }
    }
}
