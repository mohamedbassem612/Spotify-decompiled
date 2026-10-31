package p;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.google.protobuf.Any;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class ev1 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    public /* synthetic */ ev1(byte b) {
        this.a = b;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        byte[] bArrCreateByteArray;
        ivq0 ivq0VarS = null;
        int iG = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                parcel.readInt();
                return fv1.a;
            case 1:
                String string = parcel.readString();
                int i = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i);
                for (int i2 = 0; i2 != i; i2++) {
                    linkedHashSet.add(hmg.CREATOR.createFromParcel(parcel));
                }
                return new zx1(string, linkedHashSet);
            case 2:
                parcel.readInt();
                return ay1.a;
            case 3:
                return new by1(ak3.valueOf(parcel.readString()));
            case 4:
                int i3 = parcel.readInt();
                LinkedHashSet linkedHashSet2 = new LinkedHashSet(i3);
                int iG2 = 0;
                while (iG2 != i3) {
                    iG2 = k4s0.g(parcel, linkedHashSet2, iG2, 1);
                }
                int i4 = parcel.readInt();
                LinkedHashSet linkedHashSet3 = new LinkedHashSet(i4);
                while (iG != i4) {
                    iG = k4s0.g(parcel, linkedHashSet3, iG, 1);
                }
                return new cy1(linkedHashSet2, linkedHashSet3);
            case 5:
                return new dy1(parcel.readParcelable(dy1.class.getClassLoader()));
            case 6:
                return new ey1(parcel.createStringArrayList());
            case 7:
                return new fy1((ajg1) (parcel.readInt() != 0 ? ajg1.CREATOR.createFromParcel(parcel) : null));
            case 8:
                return new iy1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new ez1(parcel.readInt(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 10:
                return new uz1(parcel.readParcelable(uz1.class.getClassLoader()));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new vz1((goe) goe.CREATOR.createFromParcel(parcel));
            case grn1.d /* 12 */:
                int iD = kk0.D(parcel.readString());
                int iC = kk0.C(parcel.readString());
                v12 v12VarCreateFromParcel = parcel.readInt() == 0 ? null : v12.CREATOR.createFromParcel(parcel);
                return new l12(iD, iC, v12VarCreateFromParcel != null ? v12VarCreateFromParcel.a : null, parcel.readString(), parcel.readString());
            case 13:
                int iD2 = kk0.D(parcel.readString());
                int iC2 = kk0.C(parcel.readString());
                v12 v12VarCreateFromParcel2 = parcel.readInt() == 0 ? null : v12.CREATOR.createFromParcel(parcel);
                String str = v12VarCreateFromParcel2 != null ? v12VarCreateFromParcel2.a : null;
                if (parcel.readByte() != 0 && (bArrCreateByteArray = parcel.createByteArray()) != null) {
                    try {
                        ivq0VarS = Any.s(bArrCreateByteArray);
                        break;
                    } catch (Exception unused) {
                    }
                }
                return new m12(iD2, iC2, str, ivq0VarS);
            case 14:
                return new v12(parcel.readString());
            case 15:
                return new o52(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 16:
                return new x52(parcel.readString(), parcel.readString());
            case 17:
                y62 y62Var = new y62(parcel);
                y62Var.a = ivq0.b;
                int i5 = parcel.readInt();
                y62Var.a = i5 != -1 ? ((Enum[]) ivq0.class.getEnumConstants())[i5] : null;
                y62Var.b = parcel.readInt() != 0;
                return y62Var;
            case 18:
                return new sa2(parcel.readString(), parcel.readBundle(sa2.class.getClassLoader()));
            case 19:
                parcel.readInt();
                return bb2.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new cb2(parcel.readInt());
            case 21:
                return new db2(parcel.readInt());
            case 22:
                return new kb2((we2) parcel.readParcelable(kb2.class.getClassLoader()), (Intent) parcel.readParcelable(kb2.class.getClassLoader()));
            case 23:
                return new ac2((we2) parcel.readParcelable(ac2.class.getClassLoader()), (Intent) parcel.readParcelable(ac2.class.getClassLoader()));
            case 24:
                return new ge2(parcel.readInt() != 0);
            case 25:
                parcel.readInt();
                return ie2.a;
            case 26:
                return new je2(parcel.readInt());
            case 27:
                parcel.readInt();
                return pe2.a;
            case 28:
                return new qe2(parcel.readString(), parcel.readBundle(qe2.class.getClassLoader()));
            default:
                return new te2((eb2) parcel.readParcelable(te2.class.getClassLoader()));
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new fv1[i];
            case 1:
                return new zx1[i];
            case 2:
                return new ay1[i];
            case 3:
                return new by1[i];
            case 4:
                return new cy1[i];
            case 5:
                return new dy1[i];
            case 6:
                return new ey1[i];
            case 7:
                return new fy1[i];
            case 8:
                return new iy1[i];
            case 9:
                return new ez1[i];
            case 10:
                return new uz1[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new vz1[i];
            case grn1.d /* 12 */:
                return new l12[i];
            case 13:
                return new m12[i];
            case 14:
                return new v12[i];
            case 15:
                return new o52[i];
            case 16:
                return new x52[i];
            case 17:
                return new y62[i];
            case 18:
                return new sa2[i];
            case 19:
                return new bb2[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new cb2[i];
            case 21:
                return new db2[i];
            case 22:
                return new kb2[i];
            case 23:
                return new ac2[i];
            case 24:
                return new ge2[i];
            case 25:
                return new ie2[i];
            case 26:
                return new je2[i];
            case 27:
                return new pe2[i];
            case 28:
                return new qe2[i];
            default:
                return new te2[i];
        }
    }
}
