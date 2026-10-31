package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class so8 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:147:0x02ca  */
    /* JADX WARN: Code duplicated, block: B:148:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:36:0x00ac A[LOOP:0: B:35:0x00aa->B:36:0x00ac, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:84:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:86:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:88:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:90:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:91:0x01be  */
    /* JADX WARN: Code duplicated, block: B:93:0x01c6  */
    /* JADX WARN: Code duplicated, block: B:94:0x01c9  */
    /* JADX WARN: Code duplicated, block: B:95:0x01d3  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        boolean z;
        String string;
        int i;
        ArrayList arrayList;
        int i2 = 3;
        int iD = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new to8(parcel.readString(), parcel.readString());
            case 1:
                return xx8.valueOf(parcel.readString());
            case 2:
                return new v29(parcel.readString(), parcel.createStringArrayList(), (cmc0) (parcel.readInt() != 0 ? cmc0.CREATOR.createFromParcel(parcel) : null));
            case 3:
                return new i39(parcel.readString(), parcel.readParcelable(i39.class.getClassLoader()));
            case 4:
                int i3 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i3);
                while (iD != i3) {
                    iD = dsl0.d(ma51.CREATOR, parcel, arrayList2, iD, 1);
                }
                return new j39(arrayList2, (o5a) (parcel.readInt() != 0 ? o5a.CREATOR.createFromParcel(parcel) : null));
            case 5:
                return new k39(parcel.readString(), (kw91) kw91.CREATOR.createFromParcel(parcel));
            case 6:
                return new q39(parcel.readString(), parcel.readParcelable(q39.class.getClassLoader()));
            case 7:
                int i4 = 2;
                String string2 = parcel.readString();
                int i5 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i5);
                int iD2 = 0;
                while (iD2 != i5) {
                    iD2 = dsl0.d(gp51.CREATOR, parcel, arrayList3, iD2, 1);
                }
                String string3 = parcel.readString();
                if (string3 != null) {
                    if (string3.equals("NEW")) {
                        i4 = 1;
                    } else if (!string3.equals("RECENT")) {
                        hhg1.n("No enum constant com.spotify.search.uiusecases.autocompleterow.AutocompleteRow.Type.".concat(string3));
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new t39(string2, arrayList3, i4, z);
                }
                bhn0.i("Name is null");
                i4 = 0;
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new t39(string2, arrayList3, i4, z);
            case 8:
                int i6 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i6);
                while (iD != i6) {
                    iD = dsl0.d(lby.CREATOR, parcel, arrayList4, iD, 1);
                }
                return new b49(arrayList4, (o5a) (parcel.readInt() != 0 ? o5a.CREATOR.createFromParcel(parcel) : null));
            case 9:
                return new k59(parcel.readInt() != 0);
            case 10:
                return new o69(parcel.readDouble(), parcel.readDouble());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                int i7 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i7);
                while (iD != i7) {
                    iD = dsl0.d(y9v0.CREATOR, parcel, arrayList5, iD, 1);
                }
                return new p69(arrayList5, parcel.readDouble(), parcel.readDouble());
            case grn1.d /* 12 */:
                int i8 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i8);
                while (iD != i8) {
                    iD = dsl0.d(p69.CREATOR, parcel, arrayList6, iD, 1);
                }
                return new s69(arrayList6, parcel.readDouble(), parcel.readDouble());
            case 13:
                parcel.readInt();
                return t69.a;
            case 14:
                return new u69(parcel.readDouble());
            case 15:
                return new v69(parcel.readDouble());
            case 16:
                double d = parcel.readDouble();
                double d2 = parcel.readDouble();
                int i9 = 1;
                double d3 = parcel.readDouble();
                int i10 = 0;
                double d4 = parcel.readDouble();
                String string4 = parcel.readString();
                if (string4 != null) {
                    if (!string4.equals("Linear")) {
                        if (string4.equals("SignedGeometric")) {
                            i9 = 2;
                        } else {
                            hhg1.n("No enum constant com.spotify.playlistmixing.model.AutomationOutputInterpolation.".concat(string4));
                        }
                    }
                    w69 w69Var = (w69) parcel.readParcelable(x69.class.getClassLoader());
                    string = parcel.readString();
                    if (string != null) {
                        bhn0.i("Name is null");
                    } else if (string.equals("Unspecified")) {
                        i10 = 1;
                    } else {
                        if (string.equals("LowPass")) {
                            if (string.equals("HighPass")) {
                                i10 = 3;
                            } else {
                                hhg1.n("No enum constant com.spotify.playlistmixing.model.AutomationValueMode.".concat(string));
                            }
                            return new x69(d, d2, d3, d4, i9, w69Var, i10);
                        }
                        i10 = 2;
                    }
                    return new x69(d, d2, d3, d4, i9, w69Var, i10);
                }
                bhn0.i("Name is null");
                i9 = 0;
                w69 w69Var2 = (w69) parcel.readParcelable(x69.class.getClassLoader());
                string = parcel.readString();
                if (string != null) {
                    bhn0.i("Name is null");
                } else if (string.equals("Unspecified")) {
                    i10 = 1;
                } else {
                    if (string.equals("LowPass")) {
                        if (string.equals("HighPass")) {
                            i10 = 3;
                        } else {
                            hhg1.n("No enum constant com.spotify.playlistmixing.model.AutomationValueMode.".concat(string));
                        }
                        return new x69(d, d2, d3, d4, i9, w69Var2, i10);
                    }
                    i10 = 2;
                }
                return new x69(d, d2, d3, d4, i9, w69Var2, i10);
            case 17:
                int i11 = parcel.readInt();
                ArrayList arrayList7 = new ArrayList(i11);
                while (iD != i11) {
                    iD = dsl0.d(x69.CREATOR, parcel, arrayList7, iD, 1);
                }
                return new y69(arrayList7);
            case 18:
                return new z69((c79) parcel.readParcelable(z69.class.getClassLoader()), (f79) parcel.readParcelable(z69.class.getClassLoader()));
            case 19:
                return new a79(parcel.readDouble());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new b79(parcel.readDouble(), parcel.readDouble());
            case 21:
                return new d79(parcel.readDouble());
            case 22:
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("Bypass")) {
                        i2 = 1;
                    } else if (string5.equals("Off")) {
                        i2 = 2;
                    } else if (!string5.equals("Mute")) {
                        if (string5.equals("Kill")) {
                            i2 = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.playlistmixing.model.AutomationSpecialRole.".concat(string5));
                        }
                    }
                    return new e79(i2);
                }
                bhn0.i("Name is null");
                i2 = 0;
                return new e79(i2);
            case 23:
                g79 g79VarValueOf = g79.valueOf(parcel.readString());
                String string6 = parcel.readString();
                if (string6 != null) {
                    if (string6.equals("Decibels")) {
                        i2 = 1;
                    } else if (string6.equals("Hertz")) {
                        i2 = 2;
                    } else if (!string6.equals("Percent")) {
                        hhg1.n("No enum constant com.spotify.playlistmixing.model.AutomationValueUnit.".concat(string6));
                    }
                    h79 parcelable = parcel.readParcelable(i79.class.getClassLoader());
                    i = parcel.readInt();
                    arrayList = new ArrayList(i);
                    while (iD != i) {
                        iD = dsl0.d(z69.CREATOR, parcel, arrayList, iD, 1);
                    }
                    return new i79(g79VarValueOf, i2, parcelable, arrayList);
                }
                bhn0.i("Name is null");
                i2 = 0;
                h79 parcelable2 = parcel.readParcelable(i79.class.getClassLoader());
                i = parcel.readInt();
                arrayList = new ArrayList(i);
                while (iD != i) {
                    iD = dsl0.d(z69.CREATOR, parcel, arrayList, iD, 1);
                }
                return new i79(g79VarValueOf, i2, parcelable2, arrayList);
            case 24:
                return k89.valueOf(parcel.readString());
            case 25:
                return new ka9(parcel.readInt(), parcel.readInt() != 0);
            case 26:
                return new ou9(parcel);
            case 27:
                return new su9(parcel);
            case 28:
                return new kw9(parcel.readInt(), parcel.readInt());
            default:
                return new ox9(parcel.readParcelable(ox9.class.getClassLoader()), parcel.readString());
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new to8[i];
            case 1:
                return new xx8[i];
            case 2:
                return new v29[i];
            case 3:
                return new i39[i];
            case 4:
                return new j39[i];
            case 5:
                return new k39[i];
            case 6:
                return new q39[i];
            case 7:
                return new t39[i];
            case 8:
                return new b49[i];
            case 9:
                return new k59[i];
            case 10:
                return new o69[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new p69[i];
            case grn1.d /* 12 */:
                return new s69[i];
            case 13:
                return new t69[i];
            case 14:
                return new u69[i];
            case 15:
                return new v69[i];
            case 16:
                return new x69[i];
            case 17:
                return new y69[i];
            case 18:
                return new z69[i];
            case 19:
                return new a79[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new b79[i];
            case 21:
                return new d79[i];
            case 22:
                return new e79[i];
            case 23:
                return new i79[i];
            case 24:
                return new k89[i];
            case 25:
                return new ka9[i];
            case 26:
                return new ou9[i];
            case 27:
                return new su9[i];
            case 28:
                return new kw9[i];
            default:
                return new ox9[i];
        }
    }
}
