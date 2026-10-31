package p;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.ResultReceiver;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class s5v implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.a) {
            case 0:
                parcel.readInt();
                return t5v.a;
            case 1:
                return new x8v(parcel);
            case 2:
                return new w8v(parcel);
            case 3:
                return new z9v(parcel.readString(), parcel.readString());
            case 4:
                int iD = 0;
                cns cnsVarCreateFromParcel = cns.CREATOR.createFromParcel(parcel);
                int i = parcel.readInt();
                ArrayList arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(qdv.CREATOR, parcel, arrayList, iD, 1);
                }
                return new ddv(cnsVarCreateFromParcel, arrayList);
            case 5:
                return new qdv(parcel.readString(), parcel.readString());
            case 6:
                return new vdv(ak3.valueOf(parcel.readString()), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                return new kfv(parcel.readLong());
            case 8:
                parcel.readInt();
                return nlv.a;
            case 9:
                return new plv(parcel.readInt(), parcel.readString());
            case 10:
                return new vnv(parcel.readString());
            case 11:
                return new bpv(parcel.readString(), parcel.readString(), parcel.readString());
            case 12:
                return new zpv(parcel.readString(), parcel.readString());
            case 13:
                int iD2 = 0;
                int i2 = parcel.readInt();
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                int iH = 0;
                while (iH != i3) {
                    iH = x0d.h(etv.class, parcel, arrayList2, iH, 1);
                }
                int i4 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i4);
                while (iD2 != i4) {
                    iD2 = dsl0.d(ftv.CREATOR, parcel, arrayList3, iD2, 1);
                }
                return new etv(i2, arrayList2, mqo1.F(arrayList3));
            case 14:
                int iF = 0;
                String string = parcel.readString();
                String string2 = parcel.readString();
                int i5 = parcel.readInt();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                boolean z2 = parcel.readInt() != 0;
                String string5 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i6 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i6);
                while (iF != i6) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new ftv(string, string2, i5, string3, string4, z, z2, string5, arrayListCreateStringArrayList, linkedHashMap);
            case 15:
                int iH2 = 0;
                int i7 = parcel.readInt();
                int i8 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i8);
                int iG = 0;
                while (iG != i8) {
                    iG = k4s0.g(parcel, linkedHashSet, iG, 1);
                }
                int i9 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i9);
                while (iH2 != i9) {
                    iH2 = x0d.h(itv.class, parcel, arrayList4, iH2, 1);
                }
                return new itv(i7, arrayList4, linkedHashSet);
            case 16:
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                int i10 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i10);
                for (int i11 = 0; i11 != i10; i11++) {
                    linkedHashSet2.add(parcel.readParcelable(ptv.class.getClassLoader()));
                }
                return new ptv(string6, string7, linkedHashSet2, parcel.readParcelable(ptv.class.getClassLoader()), parcel.readParcelable(ptv.class.getClassLoader()));
            case 17:
                int i12 = 0;
                boolean z3 = true;
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                boolean z4 = parcel.readInt() != 0;
                if (parcel.readInt() == 0) {
                    z3 = false;
                }
                boolean z5 = parcel.readInt() != 0;
                boolean z6 = parcel.readInt() != 0 ? z3 : false;
                boolean z7 = parcel.readInt() != 0 ? z3 : false;
                boolean z8 = parcel.readInt() != 0 ? z3 : false;
                String string10 = parcel.readString();
                boolean z9 = parcel.readInt() != 0 ? z3 : false;
                boolean z10 = parcel.readInt() != 0 ? z3 : false;
                String string11 = parcel.readString();
                boolean z11 = parcel.readInt() != 0 ? z3 : false;
                boolean z12 = parcel.readInt() != 0 ? z3 : false;
                boolean z13 = parcel.readInt() != 0 ? z3 : false;
                boolean z14 = parcel.readInt() != 0 ? z3 : false;
                boolean z15 = parcel.readInt() != 0 ? z3 : false;
                boolean z16 = parcel.readInt() != 0 ? z3 : false;
                boolean z17 = parcel.readInt() != 0 ? z3 : false;
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (i12 != i13) {
                    linkedHashMap2.put(parcel.readSerializable(), parcel.readParcelable(kvv.class.getClassLoader()));
                    i12++;
                    i13 = i13;
                }
                return new kvv(string8, string9, z4, z3, z5, z6, z7, z8, string10, z9, z10, string11, z11, z12, z13, z14, z15, z16, z17, linkedHashMap2, parcel.readParcelable(kvv.class.getClassLoader()), parcel.readParcelable(kvv.class.getClassLoader()), parcel.readParcelable(kvv.class.getClassLoader()));
            case 18:
                return new nvv(parcel.readString(), parcel.readString());
            case 19:
                int iG2 = 0;
                int i14 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i14);
                while (iG2 != i14) {
                    iG2 = k4s0.g(parcel, linkedHashSet3, iG2, 1);
                }
                return new rwv(linkedHashSet3);
            case 20:
                return new xwv(parcel.readString());
            case 21:
                int iG3 = 0;
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet4 = new LinkedHashSet(i15);
                while (iG3 != i15) {
                    iG3 = k4s0.g(parcel, linkedHashSet4, iG3, 1);
                }
                return new fyv(linkedHashSet4);
            case 22:
                return new lyv(parcel.readString());
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new w0w(parcel.readString());
            case 24:
                return new n3w(parcel.readString(), parcel.readString(), new lrz0(parcel.readInt(), parcel.readInt(), parcel.readInt()));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new b4w(parcel.readString(), (ResultReceiver) parcel.readParcelable(b4w.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 26:
                return new g4w(parcel.readString());
            case 27:
                return new h4w(parcel.readString());
            case 28:
                return new i4w(parcel.readInt() != 0);
            default:
                return new v7w(parcel.readString(), parcel.createStringArrayList());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new t5v[i];
            case 1:
                return new x8v[i];
            case 2:
                return new w8v[i];
            case 3:
                return new z9v[i];
            case 4:
                return new ddv[i];
            case 5:
                return new qdv[i];
            case 6:
                return new vdv[i];
            case 7:
                return new kfv[i];
            case 8:
                return new nlv[i];
            case 9:
                return new plv[i];
            case 10:
                return new vnv[i];
            case 11:
                return new bpv[i];
            case 12:
                return new zpv[i];
            case 13:
                return new etv[i];
            case 14:
                return new ftv[i];
            case 15:
                return new itv[i];
            case 16:
                return new ptv[i];
            case 17:
                return new kvv[i];
            case 18:
                return new nvv[i];
            case 19:
                return new rwv[i];
            case 20:
                return new xwv[i];
            case 21:
                return new fyv[i];
            case 22:
                return new lyv[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new w0w[i];
            case 24:
                return new n3w[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new b4w[i];
            case 26:
                return new g4w[i];
            case 27:
                return new h4w[i];
            case 28:
                return new i4w[i];
            default:
                return new v7w[i];
        }
    }
}
