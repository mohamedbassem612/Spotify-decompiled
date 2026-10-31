package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.spotify.wrapped.widget.v1.WrappedWidgetResources;
import java.util.ArrayList;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class u220 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ u220(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:92:0x01fe A[LOOP:3: B:91:0x01fc->B:92:0x01fe, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:95:0x0210 A[LOOP:4: B:94:0x020e->B:95:0x0210, LOOP_END] */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        ArrayList arrayList;
        int iD;
        int i2;
        ArrayList arrayList2;
        int i3 = 2;
        ArrayList arrayList3 = null;
        int iD2 = 0;
        switch (this.a) {
            case 0:
                String string = parcel.readString();
                String string2 = parcel.readString();
                if (string2 != null) {
                    if (string2.equals("BODY_SMALL")) {
                        i3 = 1;
                    } else if (!string2.equals("BODY_MEDIUM")) {
                        if (string2.equals("MARGINAL")) {
                            i3 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.payment.paymentimpl.data.FieldState.Text.Variant.".concat(string2));
                        }
                    }
                    return new v220(string, i3);
                }
                bhn0.i("Name is null");
                i3 = 0;
                return new v220(string, i3);
            case 1:
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                if (parcel.readInt() != 0) {
                    int i4 = parcel.readInt();
                    arrayList3 = new ArrayList(i4);
                    int iD3 = 0;
                    while (iD3 != i4) {
                        iD3 = dsl0.d(i320.CREATOR, parcel, arrayList3, iD3, 1);
                    }
                }
                return new j320(string3, string4, string5, string6, arrayList3, parcel.readInt() != 0, (h320) h320.CREATOR.createFromParcel(parcel));
            case 2:
                return new h320(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 3:
                return new i320(parcel.readString(), parcel.readString());
            case 4:
                int iD4 = 0;
                String string7 = parcel.readString();
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i5);
                while (iD4 != i5) {
                    iD4 = dsl0.d(k320.CREATOR, parcel, arrayList4, iD4, 1);
                }
                return new l320(string7, string8, string9, string10, parcel.readString(), arrayList4);
            case 5:
                return new k320(parcel.readString(), parcel.readString());
            case 6:
                return new m320(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 7:
                int iD5 = 0;
                String string11 = parcel.readString();
                if20 parcelable = parcel.readParcelable(o620.class.getClassLoader());
                String string12 = parcel.readString();
                boolean z = parcel.readInt() != 0;
                String string13 = parcel.readString();
                int i6 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i6);
                while (iD5 != i6) {
                    iD5 = dsl0.d(o620.CREATOR, parcel, arrayList5, iD5, 1);
                }
                return new o620(string11, parcelable, string12, z, string13, arrayList5, parcel.readString());
            case 8:
                return new q620(parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 9:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                String string16 = parcel.readString();
                boolean z2 = parcel.readInt() != 0;
                int i7 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashSet.add(m620.CREATOR.createFromParcel(parcel));
                }
                return new m620(string14, string15, string16, z2, linkedHashSet);
            case 10:
                String string17 = parcel.readString();
                if (string17 != null) {
                    if (string17.equals("SINGLE")) {
                        i3 = 1;
                    } else if (!string17.equals("MULTIPLE")) {
                        hhg1.n("No enum constant com.spotify.filterandsort.api.model.FilterAndSortConfig.SelectType.".concat(string17));
                    }
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    iD = 0;
                    while (iD != i) {
                        iD = dsl0.d(qa20.CREATOR, parcel, arrayList, iD, 1);
                    }
                    i2 = parcel.readInt();
                    arrayList2 = new ArrayList(i2);
                    while (iD2 != i2) {
                        iD2 = dsl0.d(uha1.CREATOR, parcel, arrayList2, iD2, 1);
                    }
                    return new s620(i3, arrayList, arrayList2);
                }
                bhn0.i("Name is null");
                i3 = 0;
                i = parcel.readInt();
                arrayList = new ArrayList(i);
                iD = 0;
                while (iD != i) {
                    iD = dsl0.d(qa20.CREATOR, parcel, arrayList, iD, 1);
                }
                i2 = parcel.readInt();
                arrayList2 = new ArrayList(i2);
                while (iD2 != i2) {
                    iD2 = dsl0.d(uha1.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new s620(i3, arrayList, arrayList2);
            case 11:
                return new e720(s620.CREATOR.createFromParcel(parcel));
            case 12:
                uha1 uha1Var = (uha1) uha1.CREATOR.createFromParcel(parcel);
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                while (iD2 != i9) {
                    iD2 = dsl0.d(qa20.CREATOR, parcel, arrayList6, iD2, 1);
                }
                return new f720(arrayList6, uha1Var);
            case 13:
                int i10 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i10);
                while (iD2 != i10) {
                    iD2 = dsl0.d(db20.CREATOR, parcel, arrayList7, iD2, 1);
                }
                return new f820(arrayList7);
            case 14:
                parcel.readInt();
                return h820.a;
            case 15:
                return new i820(ha20.valueOf(parcel.readString()));
            case 16:
                return new x820(parcel.readString(), parcel.readString(), parcel.readString());
            case 17:
                int i11 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i11);
                while (iD2 != i11) {
                    iD2 = dsl0.d(x820.CREATOR, parcel, arrayList8, iD2, 1);
                }
                return new b920(arrayList8, parcel.readString());
            case 18:
                return new r920((s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() == 0 ? null : s69.CREATOR.createFromParcel(parcel)), (s69) (parcel.readInt() != 0 ? s69.CREATOR.createFromParcel(parcel) : null));
            case 19:
                return new fa20(ha20.valueOf(parcel.readString()));
            case 20:
                fa20 fa20Var = (fa20) fa20.CREATOR.createFromParcel(parcel);
                Parcelable.Creator creator = s69.CREATOR;
                return new ga20(fa20Var, (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel), (s69) creator.createFromParcel(parcel));
            case 21:
                return new qa20(parcel.readString(), parcel.readInt() != 0, (pa20) parcel.readParcelable(qa20.class.getClassLoader()));
            case 22:
                return new ka20(ja20.valueOf(parcel.readString()));
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new la20(ja20.valueOf(parcel.readString()));
            case 24:
                return new ma20(ja20.valueOf(parcel.readString()));
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new na20(ja20.valueOf(parcel.readString()));
            case 26:
                return new oa20(ja20.valueOf(parcel.readString()));
            case 27:
                return new db20(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 28:
                return new cb20(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readString(), parcel.readString());
            default:
                return new yd20(parcel.readString(), (sg51) sg51.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new v220[i];
            case 1:
                return new j320[i];
            case 2:
                return new h320[i];
            case 3:
                return new i320[i];
            case 4:
                return new l320[i];
            case 5:
                return new k320[i];
            case 6:
                return new m320[i];
            case 7:
                return new o620[i];
            case 8:
                return new q620[i];
            case 9:
                return new m620[i];
            case 10:
                return new s620[i];
            case 11:
                return new e720[i];
            case 12:
                return new f720[i];
            case 13:
                return new f820[i];
            case 14:
                return new h820[i];
            case 15:
                return new i820[i];
            case 16:
                return new x820[i];
            case 17:
                return new b920[i];
            case 18:
                return new r920[i];
            case 19:
                return new fa20[i];
            case 20:
                return new ga20[i];
            case 21:
                return new qa20[i];
            case 22:
                return new ka20[i];
            case WrappedWidgetResources.WIDGET_BG_LOSSLESS_URL_FIELD_NUMBER /* 23 */:
                return new la20[i];
            case 24:
                return new ma20[i];
            case WrappedWidgetResources.WIDGET_SM_WIFI_URL_FIELD_NUMBER /* 25 */:
                return new na20[i];
            case 26:
                return new oa20[i];
            case 27:
                return new db20[i];
            case 28:
                return new cb20[i];
            default:
                return new yd20[i];
        }
    }
}
