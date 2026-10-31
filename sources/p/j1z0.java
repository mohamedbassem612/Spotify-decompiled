package p;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class j1z0 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ j1z0(byte b) {
        this.a = b;
    }

    /* JADX WARN: Code duplicated, block: B:155:0x0336  */
    /* JADX WARN: Code duplicated, block: B:156:0x0338  */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2 = 2;
        ArrayList arrayList = null;
        int iD = 0;
        switch (this.a) {
            case 0:
                return new k1z0(parcel.readString(), parcel.readString(), (x3z0) parcel.readParcelable(k1z0.class.getClassLoader()), (hh5) parcel.readParcelable(k1z0.class.getClassLoader()), parcel.readLong(), parcel.readString(), eh5.CREATOR.createFromParcel(parcel), parcel.readString());
            case 1:
                return new t3z0(parcel.readString(), parcel.readString());
            case 2:
                return new u3z0(parcel.readInt(), parcel.readString(), parcel.readInt(), parcel.readString());
            case 3:
                return new v3z0(parcel.readString());
            case 4:
                return new w3z0(parcel.readString());
            case 5:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (string4.equals("UNSPECIFIED")) {
                        i = 1;
                    } else {
                        if (!string4.equals("PRESET")) {
                            if (string4.equals("USER_PROFILE")) {
                                i2 = 3;
                            } else if (string4.equals("USER")) {
                                i2 = 4;
                            } else {
                                hhg1.n("No enum constant com.spotify.bluejay.onboarding.customization.steps.questionnaire.QuestionnaireAnswerSource.".concat(string4));
                            }
                        }
                        i = i2;
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new b4z0(i, string, string2, z, string3);
                }
                bhn0.i("Name is null");
                i = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new b4z0(i, string, string2, z, string3);
            case 6:
                return new f4z0(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 7:
                return new g4z0(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 8:
                int i3 = 0;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                String string7 = parcel.readString();
                Integer numValueOf = parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null;
                boolean z2 = parcel.readInt() != 0 ? 1 : i3;
                int i4 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i4);
                int iD2 = i3;
                while (iD2 != i4) {
                    iD2 = dsl0.d(b4z0.CREATOR, parcel, arrayList2, iD2, 1);
                }
                return new m4z0(string5, string6, string7, numValueOf, z2, arrayList2, parcel.readString(), parcel.createStringArrayList(), parcel.readInt(), parcel.readInt());
            case 9:
                String string8 = parcel.readString();
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                while (iD != i5) {
                    iD = dsl0.d(r6i1.CREATOR, parcel, arrayList3, iD, 1);
                }
                return new n4z0(string8, arrayListCreateStringArrayList, arrayList3);
            case 10:
                int i6 = parcel.readInt();
                int i7 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i7);
                int iH = 0;
                while (iH != i7) {
                    iH = x0d.h(o4z0.class, parcel, arrayList4, iH, 1);
                }
                return new o4z0(i6, parcel.readString(), arrayList4, parcel.readInt() != 0);
            case 11:
                String string9 = parcel.readString();
                if (string9 != null) {
                    if (string9.equals("STANDARD")) {
                        i2 = 1;
                    } else if (!string9.equals("ADD_CONFIRMATION_PEEK")) {
                        hhg1.n("No enum constant com.spotify.nowplayingqueue.bottomsheet.page.QueuePresentationIntent.".concat(string9));
                    }
                    return new qaz0(i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new qaz0(i2);
            case 12:
                return new vcz0(parcel.readString());
            case 13:
                return new hhz0(parcel.readString());
            case 14:
                parcel.readInt();
                return ihz0.a;
            case 15:
                parcel.readInt();
                return jhz0.a;
            case 16:
                parcel.readInt();
                return khz0.a;
            case 17:
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                String string12 = parcel.readString();
                String string13 = parcel.readString();
                int i8 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i8);
                int iH2 = 0;
                while (iH2 != i8) {
                    iH2 = x0d.h(fiz0.class, parcel, arrayList5, iH2, 1);
                }
                pbf0 pbf0Var = (pbf0) parcel.readParcelable(fiz0.class.getClassLoader());
                int i9 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i9);
                int iH3 = 0;
                while (iH3 != i9) {
                    iH3 = x0d.h(fiz0.class, parcel, arrayList6, iH3, 1);
                }
                int i10 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i10);
                int iH4 = 0;
                while (iH4 != i10) {
                    iH4 = x0d.h(fiz0.class, parcel, arrayList7, iH4, 1);
                }
                return new fiz0(string10, string11, string12, string13, arrayList5, pbf0Var, arrayList6, arrayList7, parcel.readInt(), parcel.readInt(), (j340) j340.CREATOR.createFromParcel(parcel), (ybe0) parcel.readParcelable(fiz0.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0);
            case 18:
                return new niz0(parcel.readString(), parcel.readString(), parcel.readString());
            case 19:
                int i11 = parcel.readInt();
                ArrayList arrayList8 = new ArrayList(i11);
                int iD3 = 0;
                while (iD3 != i11) {
                    iD3 = dsl0.d(xp31.CREATOR, parcel, arrayList8, iD3, 1);
                }
                return new ljz0(arrayList8, pbf0.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            case 20:
                return new sjz0(parcel.readString());
            case 21:
                return new tjz0(parcel.readString());
            case 22:
                return new ujz0(parcel.readString(), parcel.readString());
            case 23:
                int i12 = parcel.readInt();
                ArrayList arrayList9 = new ArrayList(i12);
                while (iD != i12) {
                    iD = x0d.h(ykz0.class, parcel, arrayList9, iD, 1);
                }
                return new ykz0(arrayList9, parcel.readString());
            case 24:
                int i13 = parcel.readInt();
                ArrayList arrayList10 = new ArrayList(i13);
                while (iD != i13) {
                    iD = dsl0.d(khc0.CREATOR, parcel, arrayList10, iD, 1);
                }
                return new amz0(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, arrayList10);
            case 25:
                Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
                if (parcel.readInt() != 0) {
                    int i14 = parcel.readInt();
                    arrayList = new ArrayList(i14);
                    for (int i15 = 0; i15 != i14; i15++) {
                        int i16 = parcel.readInt();
                        LinkedHashMap linkedHashMap = new LinkedHashMap(i16);
                        int iF = 0;
                        while (iF != i16) {
                            iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                        }
                        arrayList.add(linkedHashMap);
                    }
                }
                return new zoz0(numValueOf2, arrayList);
            case 26:
                parcel.readInt();
                return hqz0.a;
            case 27:
                return new oqz0(new tr80(parcel.readInt(), parcel.readInt(), 1), new tr80(parcel.readInt(), parcel.readInt(), 1), parcel.readInt());
            case 28:
                return new iqz0(parcel.readInt(), parcel.readInt());
            default:
                parcel.readInt();
                return jqz0.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case 0:
                return new k1z0[i];
            case 1:
                return new t3z0[i];
            case 2:
                return new u3z0[i];
            case 3:
                return new v3z0[i];
            case 4:
                return new w3z0[i];
            case 5:
                return new b4z0[i];
            case 6:
                return new f4z0[i];
            case 7:
                return new g4z0[i];
            case 8:
                return new m4z0[i];
            case 9:
                return new n4z0[i];
            case 10:
                return new o4z0[i];
            case 11:
                return new qaz0[i];
            case 12:
                return new vcz0[i];
            case 13:
                return new hhz0[i];
            case 14:
                return new ihz0[i];
            case 15:
                return new jhz0[i];
            case 16:
                return new khz0[i];
            case 17:
                return new fiz0[i];
            case 18:
                return new niz0[i];
            case 19:
                return new ljz0[i];
            case 20:
                return new sjz0[i];
            case 21:
                return new tjz0[i];
            case 22:
                return new ujz0[i];
            case 23:
                return new ykz0[i];
            case 24:
                return new amz0[i];
            case 25:
                return new zoz0[i];
            case 26:
                return new hqz0[i];
            case 27:
                return new oqz0[i];
            case 28:
                return new iqz0[i];
            default:
                return new jqz0[i];
        }
    }
}
