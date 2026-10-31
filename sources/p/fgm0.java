package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.address.endpoint.model.v1.proto.AddressCollection;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.checkout.proto.model.v1.proto.SpotifyCheckoutNative;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class fgm0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        ArrayList arrayList = null;
        int i = 1;
        int iD = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                parcel.readInt();
                return ggm0.a;
            case 1:
                parcel.readInt();
                return hgm0.a;
            case 2:
                return new rgm0(SpotifyCheckoutNative.G(parcel.createByteArray()), qgm0.valueOf(parcel.readString()), (igm0) igm0.CREATOR.createFromParcel(parcel));
            case 3:
                return new sgm0(AddressCollection.v(parcel.createByteArray()), (pgm0) parcel.readParcelable(sgm0.class.getClassLoader()), parcel.readInt() != 0);
            case 4:
                int i2 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i2);
                for (int i3 = 0; i3 != i2; i3++) {
                    linkedHashMap.put(parcel.readParcelable(igm0.class.getClassLoader()), Boolean.valueOf(parcel.readInt() != 0));
                }
                return new igm0(linkedHashMap, parcel.readInt() != 0);
            case 5:
                return new jgm0(parcel.readString(), parcel.readString());
            case 6:
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
                while (iD != i4) {
                    linkedHashMap2.put(parcel.readString(), kgm0.CREATOR.createFromParcel(parcel));
                    iD++;
                }
                return new lgm0(parcel.readString(), linkedHashMap2);
            case 7:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i5 = parcel.readInt();
                    ArrayList arrayList2 = new ArrayList(i5);
                    while (iD != i5) {
                        iD = dsl0.d(jgm0.CREATOR, parcel, arrayList2, iD, 1);
                    }
                    arrayList = arrayList2;
                }
                return new kgm0(string, arrayList, string2);
            case 8:
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i6);
                while (iD != i6) {
                    iD = cfm0.f(parcel, linkedHashMap3, parcel.readString(), iD, 1);
                }
                return new mgm0(linkedHashMap3);
            case 9:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i7);
                while (iD != i7) {
                    iD = cfm0.f(parcel, linkedHashMap4, parcel.readString(), iD, 1);
                }
                return new ngm0(linkedHashMap4);
            case 10:
                parcel.readInt();
                return ogm0.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                parcel.readInt();
                return tgm0.a;
            case grn1.d /* 12 */:
                parcel.readInt();
                return ugm0.a;
            case 13:
                parcel.readInt();
                return xgm0.a;
            case 14:
                return tjm0.b(parcel.readInt(), parcel.readInt());
            case 15:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(qpl.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new ckm0(string3, string4, arrayList3, parcel.createStringArrayList(), parcel.readInt(), parcel.readString(), parcel.readString(), fd21.r(parcel.readString()));
            case 16:
                return new mkm0(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                return new nkm0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 18:
                String string5 = parcel.readString();
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                int iH = 0;
                while (iH != i9) {
                    iH = x0d.h(pkm0.class, parcel, arrayList4, iH, 1);
                }
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (!string6.equals("Tracks")) {
                        if (string6.equals("Artists")) {
                            i = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.highlightsstats.statsdetails.uiusecases.morelike.MoreLikeElement.MoreLikeType.".concat(string6));
                        }
                    }
                    return new pkm0(string5, arrayList4, i, g6m0.valueOf(parcel.readString()));
                }
                bhn0.i("Name is null");
                i = 0;
                return new pkm0(string5, arrayList4, i, g6m0.valueOf(parcel.readString()));
            case 19:
                return new qkm0(parcel.readParcelable(qkm0.class.getClassLoader()), (pkm0) pkm0.CREATOR.createFromParcel(parcel));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                int i10 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i10);
                while (iD != i10) {
                    iD = k4s0.g(parcel, linkedHashSet, iD, 1);
                }
                return new aom0(parcel.readString(), linkedHashSet);
            case 21:
                return new lom0(parcel.createStringArrayList(), parcel.readString());
            case 22:
                return new rqm0(parcel.readString(), parcel.createStringArrayList(), parcel.readString());
            case 23:
                return new xum0(parcel.readString(), parcel.readString());
            case 24:
                return new j2n0(parcel.readString(), parcel.readInt(), parcel.readInt(), parcel.readInt() != 0);
            case 25:
                return new d7n0(parcel.readParcelable(d7n0.class.getClassLoader()), parcel.readParcelable(d7n0.class.getClassLoader()), lf51.r(parcel.readString()));
            case 26:
                return new e7n0(parcel.readParcelable(e7n0.class.getClassLoader()), parcel.readParcelable(e7n0.class.getClassLoader()), lf51.r(parcel.readString()), (wkt) null, parcel.readString(), (Throwable) parcel.readSerializable());
            case 27:
                return new f7n0(parcel.readParcelable(f7n0.class.getClassLoader()), lf51.r(parcel.readString()), parcel.readParcelable(f7n0.class.getClassLoader()), (wkt) null, parcel.readParcelable(f7n0.class.getClassLoader()), parcel.readParcelable(f7n0.class.getClassLoader()));
            case 28:
                return new g7n0(parcel.readParcelable(g7n0.class.getClassLoader()), parcel.readParcelable(g7n0.class.getClassLoader()), lf51.r(parcel.readString()), (wkt) null);
            default:
                return new k7n0(parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ggm0[i];
            case 1:
                return new hgm0[i];
            case 2:
                return new rgm0[i];
            case 3:
                return new sgm0[i];
            case 4:
                return new igm0[i];
            case 5:
                return new jgm0[i];
            case 6:
                return new lgm0[i];
            case 7:
                return new kgm0[i];
            case 8:
                return new mgm0[i];
            case 9:
                return new ngm0[i];
            case 10:
                return new ogm0[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new tgm0[i];
            case grn1.d /* 12 */:
                return new ugm0[i];
            case 13:
                return new xgm0[i];
            case 14:
                return new tjm0[i];
            case 15:
                return new ckm0[i];
            case 16:
                return new mkm0[i];
            case 17:
                return new nkm0[i];
            case 18:
                return new pkm0[i];
            case 19:
                return new qkm0[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new aom0[i];
            case 21:
                return new lom0[i];
            case 22:
                return new rqm0[i];
            case 23:
                return new xum0[i];
            case 24:
                return new j2n0[i];
            case 25:
                return new d7n0[i];
            case 26:
                return new e7n0[i];
            case 27:
                return new f7n0[i];
            case 28:
                return new g7n0[i];
            default:
                return new k7n0[i];
        }
    }
}
