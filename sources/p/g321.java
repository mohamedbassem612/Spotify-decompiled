package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import com.spotify.martini.martinidata.model.Mode;
import java.util.ArrayList;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class g321 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX INFO: Thrown type has an unknown type hierarchy: com.google.android.gms.common.internal.safeparcel.SafeParcelReader$ParseException */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) throws SafeParcelReader.ParseException {
        int i = 2;
        int iF = 0;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                Bundle bundleO = null;
                int iX = i541.X(parcel);
                while (parcel.dataPosition() < iX) {
                    int i2 = parcel.readInt();
                    if (((char) i2) != 2) {
                        i541.U(i2, parcel);
                    } else {
                        bundleO = i541.o(i2, parcel);
                    }
                }
                i541.A(iX, parcel);
                return new f321(bundleO);
            case 1:
                return new cc21(parcel.readString());
            case 2:
                return new yi21(parcel.readString(), parcel.readString(), parcel.readParcelable(yi21.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readParcelable(yi21.class.getClassLoader()), parcel.readString(), parcel.readParcelable(yi21.class.getClassLoader()), parcel.readInt() != 0);
            case 3:
                return new fj21(parcel.readString(), parcel.readString(), parcel.readParcelable(fj21.class.getClassLoader()), Mode.valueOf(parcel.readString()));
            case 4:
                return new gj21(parcel.readString(), parcel.readString());
            case 5:
                return new ck21(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            case 6:
                return new dk21(parcel.readString());
            case 7:
                parcel.readInt();
                return ek21.a;
            case 8:
                return new fk21(parcel.createStringArrayList());
            case 9:
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i3 = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i3);
                while (iF != i3) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new yl21(string, string2, string3, linkedHashMap);
            case 10:
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                if (string5 != null) {
                    if (string5.equals("UNSPECIFIED")) {
                        i = 1;
                    } else if (!string5.equals("CORRECT")) {
                        if (string5.equals("WRONG")) {
                            i = 3;
                        } else if (string5.equals("TIME_RAN_OUT")) {
                            i = 4;
                        } else {
                            hhg1.n("No enum constant com.spotify.musicquiz.model.AnswerState.".concat(string5));
                        }
                    }
                    return new om21(parcel.readLong(), i, string4);
                }
                bhn0.i("Name is null");
                i = 0;
                return new om21(parcel.readLong(), i, string4);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return xm21.valueOf(parcel.readString());
            case grn1.d /* 12 */:
                return new an21(((fic0) fic0.CREATOR.createFromParcel(parcel)).a);
            case 13:
                int i4 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i4);
                while (iF != i4) {
                    linkedHashMap2.put(vhc0.CREATOR.createFromParcel(parcel), fic0.CREATOR.createFromParcel(parcel));
                    iF++;
                }
                return new bn21(linkedHashMap2);
            case 14:
                ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
                int i5 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i5);
                for (int i6 = 0; i6 != i5; i6++) {
                    arrayList.add(Integer.valueOf(parcel.readInt()));
                }
                return new dn21(arrayListCreateStringArrayList, arrayList, parcel.createStringArrayList(), parcel.readInt() != 0, parcel.createStringArrayList());
            case 15:
                return new bp21(parcel.readString());
            case 16:
                return new cq21(parcel.readInt());
            case 17:
                return new rr21(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null, parcel.createStringArrayList(), parcel.createStringArrayList(), parcel.readString(), parcel.readString(), parcel.readLong());
            case 18:
                parcel.readInt();
                return ns21.a;
            case 19:
                parcel.readInt();
                return os21.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new ps21(parcel.readInt());
            case 21:
                parcel.readInt();
                return qs21.a;
            case 22:
                return new xu21(parcel.readString(), parcel.readInt() != 0);
            case 23:
                int i7 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i7);
                for (int i8 = 0; i8 != i7; i8++) {
                    linkedHashMap3.put(m7f0.valueOf(parcel.readString()), l7f0.CREATOR.createFromParcel(parcel));
                }
                int i9 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i9);
                while (iF != i9) {
                    linkedHashMap4.put(vaa0.valueOf(parcel.readString()), uaa0.CREATOR.createFromParcel(parcel));
                    iF++;
                }
                return new cw21(linkedHashMap3, linkedHashMap4);
            case 24:
                return new i031(ot1.CREATOR.createFromParcel(parcel));
            case 25:
                return new j031(parcel.readParcelable(j031.class.getClassLoader()));
            case 26:
                return new m131(parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0);
            case 27:
                return new w131(parcel.readString());
            case 28:
                parcel.readInt();
                return x131.a;
            default:
                parcel.readInt();
                return l231.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new f321[i];
            case 1:
                return new cc21[i];
            case 2:
                return new yi21[i];
            case 3:
                return new fj21[i];
            case 4:
                return new gj21[i];
            case 5:
                return new ck21[i];
            case 6:
                return new dk21[i];
            case 7:
                return new ek21[i];
            case 8:
                return new fk21[i];
            case 9:
                return new yl21[i];
            case 10:
                return new om21[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new xm21[i];
            case grn1.d /* 12 */:
                return new an21[i];
            case 13:
                return new bn21[i];
            case 14:
                return new dn21[i];
            case 15:
                return new bp21[i];
            case 16:
                return new cq21[i];
            case 17:
                return new rr21[i];
            case 18:
                return new ns21[i];
            case 19:
                return new os21[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new ps21[i];
            case 21:
                return new qs21[i];
            case 22:
                return new xu21[i];
            case 23:
                return new cw21[i];
            case 24:
                return new i031[i];
            case 25:
                return new j031[i];
            case 26:
                return new m131[i];
            case 27:
                return new w131[i];
            case 28:
                return new x131[i];
            default:
                return new l231[i];
        }
    }
}
