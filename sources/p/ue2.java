package p;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ue2 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Code duplicated, block: B:129:0x0286  */
    /* JADX WARN: Code duplicated, block: B:130:0x0289  */
    /* JADX WARN: Code duplicated, block: B:50:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:54:0x0106  */
    /* JADX WARN: Code duplicated, block: B:55:0x0109  */
    /* JADX WARN: Code duplicated, block: B:58:0x0111  */
    /* JADX WARN: Code duplicated, block: B:59:0x0114  */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        int i;
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3 = 4;
        int iH = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                parcel.readInt();
                return ve2.b;
            case 1:
                return new gf2(h8b.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
            case 2:
                return new if2(h8b.valueOf(parcel.readString()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.readInt() != 0);
            case 3:
                return new tg2(parcel.readString(), parcel.readInt());
            case 4:
                return new ug2(parcel.readInt());
            case 5:
                parcel.readInt();
                return vg2.a;
            case 6:
                return new wg2(parcel.readParcelable(wg2.class.getClassLoader()));
            case 7:
                parcel.readInt();
                return xg2.a;
            case 8:
                return new zg2(parcel.readString(), (tg2) tg2.CREATOR.createFromParcel(parcel), parcel.readString(), (yg2) parcel.readParcelable(zg2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt());
            case 9:
                return new th2(parcel.readInt(), parcel.readInt(), parcel.readInt(), parcel.readParcelable(th2.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
            case 10:
                return new wh2(parcel.readString(), parcel.readString(), parcel.readInt(), parcel.readInt());
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                parcel.readInt();
                return ki2.a;
            case grn1.d /* 12 */:
                return new uj2(parcel.readParcelable(uj2.class.getClassLoader()));
            case 13:
                parcel.readInt();
                return vj2.a;
            case 14:
                parcel.readInt();
                return wj2.a;
            case 15:
                parcel.readInt();
                return xj2.a;
            case 16:
                return new pk2(parcel.readInt(), parcel.readString());
            case 17:
                String string = parcel.readString();
                if (string != null) {
                    if (string.equals("INITIAL")) {
                        i = 1;
                    } else if (string.equals("LOADED")) {
                        i = 2;
                    } else if (string.equals("FAILED")) {
                        i = 3;
                    } else if (string.equals("RETRYING")) {
                        i = 4;
                    } else {
                        hhg1.n("No enum constant com.spotify.ageverification.dialog.AgeVerificationDialogViewModel.State.".concat(string));
                    }
                    String string2 = parcel.readString();
                    String string3 = parcel.readString();
                    int i4 = parcel.readInt();
                    int i5 = parcel.readInt();
                    int i6 = parcel.readInt();
                    int i7 = parcel.readInt();
                    int i8 = parcel.readInt();
                    String string4 = parcel.readString();
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    return new rk2(i, string2, string3, i4, i5, i6, i7, i8, string4, z);
                }
                bhn0.i("Name is null");
                i = 0;
                String string5 = parcel.readString();
                String string6 = parcel.readString();
                int i9 = parcel.readInt();
                int i10 = parcel.readInt();
                int i11 = parcel.readInt();
                int i12 = parcel.readInt();
                int i13 = parcel.readInt();
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z = true;
                } else {
                    z = false;
                }
                return new rk2(i, string5, string6, i9, i10, i11, i12, i13, string7, z);
            case 18:
                boolean z5 = false;
                int i14 = parcel.readInt();
                int i15 = parcel.readInt();
                int i16 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i16);
                int iH2 = 0;
                while (iH2 != i16) {
                    iH2 = x0d.h(wm2.class, parcel, arrayList, iH2, 1);
                }
                boolean z6 = parcel.readInt() != 0;
                if (parcel.readInt() != 0) {
                    z5 = true;
                }
                return new wm2(i14, i15, arrayList, z6, z5, parcel.readInt(), parcel.readInt() != 0 ? t2j1.valueOf(parcel.readString()) : null);
            case 19:
                int i17 = parcel.readInt();
                int i18 = parcel.readInt();
                int i19 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i19);
                while (iH != i19) {
                    iH = x0d.h(dn2.class, parcel, arrayList2, iH, 1);
                }
                return new dn2(i17, i18, parcel.readInt(), arrayList2);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new xo2(parcel.readString(), parcel.readString(), parcel.readString());
            case 21:
                return new ru2(parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null);
            case 22:
                return new su2(parcel.readLong());
            case 23:
                parcel.readInt();
                return tu2.a;
            case 24:
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i20 = parcel.readInt();
                boolean z7 = false;
                ArrayList arrayList3 = new ArrayList(i20);
                int iH3 = 0;
                while (iH3 != i20) {
                    iH3 = x0d.h(iy2.class, parcel, arrayList3, iH3, 1);
                }
                if (parcel.readInt() != 0) {
                    z7 = true;
                }
                return new iy2(string8, string9, arrayList3, string10, string11, z7);
            case 25:
                String string12 = parcel.readString();
                int i21 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i21);
                while (iH != i21) {
                    iH = dsl0.d(iy2.CREATOR, parcel, arrayList4, iH, 1);
                }
                return new jy2(string12, arrayList4, ou1.Z);
            case 26:
                return new r03(parcel.readString());
            case 27:
                int i22 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i22);
                int iD = 0;
                while (iD != i22) {
                    iD = dsl0.d(ol11.CREATOR, parcel, arrayList5, iD, 1);
                }
                String string13 = parcel.readString();
                if (string13 != null) {
                    if (string13.equals("UNDEFINED")) {
                        i2 = 1;
                    } else if (string13.equals("ALBUM")) {
                        i2 = 2;
                    } else if (string13.equals("SINGLE")) {
                        i2 = 3;
                    } else {
                        if (!string13.equals("COMPILATION")) {
                            if (string13.equals("EP")) {
                                i3 = 5;
                            } else if (string13.equals("AUDIOBOOK")) {
                                i3 = 6;
                            } else if (string13.equals("PODCAST")) {
                                i3 = 7;
                            } else {
                                hhg1.n("No enum constant com.spotify.search.searchview.Album.Type.".concat(string13));
                            }
                        }
                        i2 = i3;
                    }
                    f53 f53Var = (f53) parcel.readValue(i53.class.getClassLoader());
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z3 = true;
                    } else {
                        z3 = false;
                    }
                    if (parcel.readInt() != 0) {
                        z4 = true;
                    } else {
                        z4 = false;
                    }
                    return new i53(arrayList5, i2, f53Var, z2, z3, z4);
                }
                bhn0.i("Name is null");
                i2 = 0;
                f53 f53Var2 = (f53) parcel.readValue(i53.class.getClassLoader());
                if (parcel.readInt() != 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (parcel.readInt() != 0) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (parcel.readInt() != 0) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                return new i53(arrayList5, i2, f53Var2, z2, z3, z4);
            case 28:
                String string14 = parcel.readString();
                String string15 = parcel.readString();
                boolean z8 = false;
                String string16 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z8 = true;
                }
                return new c73(string14, string15, string16, z8, parcel.readString(), parcel.readInt() != 0, fd21.s(parcel.readString()), parcel.readInt() != 0, k4m.valueOf(parcel.readString()), parcel.readString());
            default:
                return new z73(parcel.readString(), parcel.readParcelable(z73.class.getClassLoader()), parcel.readString(), (mb3) mb3.CREATOR.createFromParcel(parcel));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new ve2[i];
            case 1:
                return new gf2[i];
            case 2:
                return new if2[i];
            case 3:
                return new tg2[i];
            case 4:
                return new ug2[i];
            case 5:
                return new vg2[i];
            case 6:
                return new wg2[i];
            case 7:
                return new xg2[i];
            case 8:
                return new zg2[i];
            case 9:
                return new th2[i];
            case 10:
                return new wh2[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new ki2[i];
            case grn1.d /* 12 */:
                return new uj2[i];
            case 13:
                return new vj2[i];
            case 14:
                return new wj2[i];
            case 15:
                return new xj2[i];
            case 16:
                return new pk2[i];
            case 17:
                return new rk2[i];
            case 18:
                return new wm2[i];
            case 19:
                return new dn2[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new xo2[i];
            case 21:
                return new ru2[i];
            case 22:
                return new su2[i];
            case 23:
                return new tu2[i];
            case 24:
                return new iy2[i];
            case 25:
                return new jy2[i];
            case 26:
                return new r03[i];
            case 27:
                return new i53[i];
            case 28:
                return new c73[i];
            default:
                return new z73[i];
        }
    }
}
