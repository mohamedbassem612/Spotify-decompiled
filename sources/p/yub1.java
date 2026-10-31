package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yub1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ yub1(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:54:0x010a  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        boolean z2;
        int i = 3;
        int i2 = 2;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new zub1(parcel.readString(), parcel.createStringArrayList(), parcel.createStringArrayList());
            case 1:
                return new evb1(jvb1.CREATOR.createFromParcel(parcel).a, (kvb1) parcel.readParcelable(evb1.class.getClassLoader()), (mvb1) parcel.readParcelable(evb1.class.getClassLoader()), parcel.createStringArrayList());
            case 2:
                return new jvb1(parcel.readString());
            case 3:
                return new cwb1(parcel.readString(), parcel.readString(), parcel.readString());
            case 4:
                Object objCreateFromParcel = null;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                boolean z3 = true;
                String string4 = parcel.readString();
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    objCreateFromParcel = cwb1.CREATOR.createFromParcel(parcel);
                }
                cwb1 cwb1Var = (cwb1) objCreateFromParcel;
                iwb1 parcelable = parcel.readParcelable(ewb1.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z = true;
                    z2 = true;
                } else {
                    z = z3;
                    z2 = false;
                }
                if (parcel.readInt() == 0) {
                    z = false;
                }
                return new ewb1(string, string2, string3, string4, z3, cwb1Var, parcelable, z2, z);
            case 5:
                parcel.readInt();
                return fwb1.a;
            case 6:
                return new gwb1(parcel.readString(), parcel.readString());
            case 7:
                parcel.readInt();
                return hwb1.a;
            case 8:
                int i3 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(nxb1.CREATOR, parcel, arrayList, iD, 1);
                }
                return new mxb1(arrayList);
            case 9:
                return new nxb1(parcel.readString(), parcel.readString());
            case 10:
                kzb1 kzb1Var = new kzb1();
                kzb1Var.a = parcel.readParcelable(kzb1.class.getClassLoader());
                kzb1Var.b = parcel.readInt();
                kzb1Var.c = parcel.readInt();
                return kzb1Var;
            case 11:
                return new o0c1(parcel.readLong(), parcel.readLong(), parcel.readLong(), parcel.readLong());
            case 12:
                return new x0c1(parcel.readString());
            case 13:
                return new y0c1(parcel.readString());
            case 14:
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                while (iD != i4) {
                    iD = dsl0.d(k1c1.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new i1c1(arrayList2, parcel.readString(), parcel.readParcelable(i1c1.class.getClassLoader()), parcel.readString());
            case 15:
                Long lValueOf = null;
                boolean z4 = false;
                String string5 = parcel.readString();
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0;
                Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                Long lValueOf3 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
                if (parcel.readInt() != 0) {
                    lValueOf = Long.valueOf(parcel.readLong());
                }
                return new k1c1(string5, z5, z6, lValueOf2, z4, lValueOf3, lValueOf, parcel.readParcelable(k1c1.class.getClassLoader()));
            case 16:
                int i5 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i5);
                while (iD != i5) {
                    iD = k4s0.g(parcel, linkedHashSet, iD, 1);
                }
                return new v1c1(linkedHashSet);
            case 17:
                return new w1c1(parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                parcel.readInt();
                return q4c1.a;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                parcel.readInt();
                return r4c1.a;
            case 20:
                parcel.readInt();
                return s4c1.a;
            case 21:
                return new t4c1(parcel.readInt(), parcel.readInt());
            case 22:
                return new m5c1(parcel.readString());
            case 23:
                return new n5c1(li31.c.d(parcel));
            case 24:
                return new o5c1((jxc1) parcel.readParcelable(o5c1.class.getClassLoader()), parcel.readInt());
            case 25:
                return new x5c1(yor0.c.d(parcel), parcel.readString(), parcel.readInt());
            case 26:
                String string6 = parcel.readString();
                yor0 yor0Var = yor0.c;
                Paragraph paragraphD = yor0Var.d(parcel);
                Paragraph paragraphD2 = yor0Var.d(parcel);
                String string7 = parcel.readString();
                if (string7 != null) {
                    if (string7.equals("NONE")) {
                        i = 1;
                    } else if (string7.equals("PARTIAL")) {
                        i = 2;
                    } else if (!string7.equals("COMPLETE")) {
                        hhg1.n("No enum constant com.spotify.campaigns.wrapped.retrieval.mobius.Story.Viewed.".concat(string7));
                    }
                    return new z5c1(string6, paragraphD, paragraphD2, i, (p5c1) parcel.readParcelable(z5c1.class.getClassLoader()), (p5c1) parcel.readParcelable(z5c1.class.getClassLoader()), parcel.readInt() != 0 ? ff.CREATOR.createFromParcel(parcel) : null, parcel.readString(), x5c1.CREATOR.createFromParcel(parcel));
                }
                bhn0.i("Name is null");
                i = 0;
                return new z5c1(string6, paragraphD, paragraphD2, i, (p5c1) parcel.readParcelable(z5c1.class.getClassLoader()), (p5c1) parcel.readParcelable(z5c1.class.getClassLoader()), parcel.readInt() != 0 ? ff.CREATOR.createFromParcel(parcel) : null, parcel.readString(), x5c1.CREATOR.createFromParcel(parcel));
            case 27:
                String string8 = parcel.readString();
                if (string8 != null) {
                    if (string8.equals("MUTED")) {
                        i2 = 1;
                    } else if (!string8.equals("UNMUTED")) {
                        hhg1.n("No enum constant com.spotify.campaigns.storytelling.api.StoryContainerState.MuteState.".concat(string8));
                    }
                    return new u6c1(i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new u6c1(i2);
            case 28:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                c9 c9VarF = mqo1.F(parcel.createStringArrayList());
                int i6 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i6);
                int iD2 = 0;
                while (iD2 != i6) {
                    iD2 = dsl0.d(dka1.CREATOR, parcel, arrayList3, iD2, 1);
                }
                c9 c9VarF2 = mqo1.F(arrayList3);
                String string11 = parcel.readString();
                if (string11 == null) {
                    bhn0.i("Name is null");
                } else if (string11.equals("UNSPECIFIED")) {
                    iD = 1;
                } else if (string11.equals("EVERGREEN")) {
                    iD = 2;
                } else if (string11.equals("TIMELY")) {
                    iD = 3;
                } else {
                    hhg1.n("No enum constant com.spotify.martini.martinidata.model.StoryType.".concat(string11));
                }
                return new l7c1(string9, string10, c9VarF, c9VarF2, iD);
            default:
                parcel.readInt();
                return x7c1.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zub1[i];
            case 1:
                return new evb1[i];
            case 2:
                return new jvb1[i];
            case 3:
                return new cwb1[i];
            case 4:
                return new ewb1[i];
            case 5:
                return new fwb1[i];
            case 6:
                return new gwb1[i];
            case 7:
                return new hwb1[i];
            case 8:
                return new mxb1[i];
            case 9:
                return new nxb1[i];
            case 10:
                return new kzb1[i];
            case 11:
                return new o0c1[i];
            case 12:
                return new x0c1[i];
            case 13:
                return new y0c1[i];
            case 14:
                return new i1c1[i];
            case 15:
                return new k1c1[i];
            case 16:
                return new v1c1[i];
            case 17:
                return new w1c1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new q4c1[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new r4c1[i];
            case 20:
                return new s4c1[i];
            case 21:
                return new t4c1[i];
            case 22:
                return new m5c1[i];
            case 23:
                return new n5c1[i];
            case 24:
                return new o5c1[i];
            case 25:
                return new x5c1[i];
            case 26:
                return new z5c1[i];
            case 27:
                return new u6c1[i];
            case 28:
                return new l7c1[i];
            default:
                return new x7c1[i];
        }
    }
}
