package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xud implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        Boolean boolValueOf;
        Boolean boolValueOf2 = null;
        int iH = 0;
        switch (this.a) {
            case 0:
                int iD = 0;
                yor0 yor0Var = yor0.c;
                Paragraph paragraphD = yor0Var.d(parcel);
                Paragraph paragraphD2 = yor0Var.d(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(sud.CREATOR, parcel, arrayList, iD, 1);
                }
                return new zud(paragraphD, paragraphD2, arrayList);
            case 1:
                int i2 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i2);
                while (iH != i2) {
                    iH = x0d.h(ivd.class, parcel, arrayList2, iH, 1);
                }
                boolean z = parcel.readInt() != 0;
                el51 el51Var = (el51) (parcel.readInt() != 0 ? el51.CREATOR.createFromParcel(parcel) : null);
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i3);
                int iG = 0;
                while (iG != i3) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                return new ivd(arrayList2, z, el51Var, linkedHashSet, r87.CREATOR.createFromParcel(parcel));
            case 2:
                return new cxd(x0d.z(parcel.readString()));
            case 3:
                return new dxd(parcel.readString());
            case 4:
                return new exd(parcel.readString());
            case 5:
                return new fxd(parcel.readString());
            case 6:
                return new gxd(parcel.readString(), parcel.readInt());
            case 7:
                return new hxd(parcel.readString(), parcel.readInt(), parcel.readInt());
            case 8:
                return new ixd(parcel.readString(), parcel.readInt(), parcel.readString());
            case 9:
                return new jxd(parcel.readString(), parcel.readInt(), parcel.readString());
            case 10:
                return new kxd(parcel.readString());
            case 11:
                return new lxd(parcel.readString(), p791.valueOf(parcel.readString()));
            case 12:
                return new mxd(parcel.readString());
            case 13:
                int iF = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i4);
                while (iF != i4) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new b0e(string, string2, string3, linkedHashMap);
            case 14:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                boolean z2 = false;
                String string8 = parcel.readString();
                boolean z3 = false;
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                boolean z4 = false;
                if (parcel.readInt() != 0) {
                    z3 = true;
                }
                boolean z5 = false;
                if (parcel.readInt() != 0) {
                    z4 = true;
                }
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new c3e(string4, string5, string6, string7, string8, z2, z3, z4, z5);
            case 15:
                return new i8e(parcel.readParcelable(i8e.class.getClassLoader()), parcel.readString());
            case 16:
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iH != i5) {
                    iH = dsl0.d(x8e.CREATOR, parcel, arrayList3, iH, 1);
                }
                return new y8e(parcel.readInt(), string9, string10, arrayList3);
            case 17:
                return new x8e(parcel.readString(), parcel.readString());
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new b9e(parcel.readString(), parcel.readString(), parcel.readParcelable(b9e.class.getClassLoader()));
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                String string11 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                while (iH != i6) {
                    iH = dsl0.d(p9e.CREATOR, parcel, arrayList4, iH, 1);
                }
                return new q9e(string11, arrayList4, parcel.readInt());
            case 20:
                return new p9e(parcel.readInt(), parcel.readString(), parcel.readString());
            case 21:
                return new jae(parcel.readInt());
            case 22:
                return new sce(parcel.readString(), parcel.readString(), (van) van.CREATOR.createFromParcel(parcel));
            case 23:
                return new rde(parcel.readString(), parcel.readParcelable(rde.class.getClassLoader()));
            case 24:
                parcel.readInt();
                return xde.a;
            case 25:
                parcel.readInt();
                return yde.a;
            case 26:
                parcel.readInt();
                return zde.a;
            case 27:
                parcel.readInt();
                return aee.a;
            case 28:
                return new nee(parcel.readString());
            default:
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                if (parcel.readInt() != 0) {
                    boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
                }
                yge ygeVar = new yge();
                ygeVar.a = boolValueOf;
                ygeVar.b = boolValueOf2;
                return ygeVar;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new zud[i];
            case 1:
                return new ivd[i];
            case 2:
                return new cxd[i];
            case 3:
                return new dxd[i];
            case 4:
                return new exd[i];
            case 5:
                return new fxd[i];
            case 6:
                return new gxd[i];
            case 7:
                return new hxd[i];
            case 8:
                return new ixd[i];
            case 9:
                return new jxd[i];
            case 10:
                return new kxd[i];
            case 11:
                return new lxd[i];
            case 12:
                return new mxd[i];
            case 13:
                return new b0e[i];
            case 14:
                return new c3e[i];
            case 15:
                return new i8e[i];
            case 16:
                return new y8e[i];
            case 17:
                return new x8e[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                return new b9e[i];
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                return new q9e[i];
            case 20:
                return new p9e[i];
            case 21:
                return new jae[i];
            case 22:
                return new sce[i];
            case 23:
                return new rde[i];
            case 24:
                return new xde[i];
            case 25:
                return new yde[i];
            case 26:
                return new zde[i];
            case 27:
                return new aee[i];
            case 28:
                return new nee[i];
            default:
                return new yge[i];
        }
    }
}
