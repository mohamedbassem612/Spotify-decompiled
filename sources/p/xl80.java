package p;

import android.content.Intent;
import android.content.IntentSender;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;
import java.io.Serializable;
import java.util.LinkedHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class xl80 implements Parcelable.Creator {
    public final /* synthetic */ byte a;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        y6r0 y6r0Var;
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new yl80(zl80.valueOf(parcel.readString()), ul80.CREATOR.createFromParcel(parcel), wl80.CREATOR.createFromParcel(parcel), parcel.readString());
            case 1:
                return new fn80(parcel);
            case 2:
                return new qo80((lby) lby.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
            case 3:
                Parcelable parcelable = parcel.readParcelable(IntentSender.class.getClassLoader());
                parcelable.getClass();
                return new kt80((IntentSender) parcelable, (Intent) parcel.readParcelable(Intent.class.getClassLoader()), parcel.readInt(), parcel.readInt());
            case 4:
                nu80 nu80Var = ou80.Companion;
                String string = parcel.readString();
                if (string == null) {
                    string = "";
                }
                nu80Var.getClass();
                ou80 ou80Var = new ou80(string);
                String string2 = parcel.readString();
                if (string2 != null) {
                    y6r0.Companion.getClass();
                    y6r0Var = new y6r0(string2);
                } else {
                    y6r0Var = null;
                }
                boolean z = parcel.readInt() == 1;
                long j = parcel.readLong();
                long j2 = parcel.readLong();
                Object value = parcel.readValue(Integer.TYPE.getClassLoader());
                Integer num = value instanceof Integer ? (Integer) value : null;
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                Serializable serializable = parcel.readSerializable();
                Object obj = serializable instanceof g6h1 ? (g6h1) serializable : null;
                if (obj == null) {
                    g6h1.Companion.getClass();
                    obj = g6h1.e;
                }
                g6h1 g6h1Var = obj;
                String string6 = parcel.readString();
                return new tv80(ou80Var, y6r0Var, z, j, j2, num, g6h1Var, string3, string4, string5, string6 == null ? "" : string6, parcel.readInt());
            case 5:
                boolean z2 = false;
                String string7 = parcel.readString();
                if (parcel.readInt() != 0) {
                    z2 = true;
                }
                return new o190(string7, z2);
            case 6:
                int iF = 0;
                String string8 = parcel.readString();
                String string9 = parcel.readString();
                String string10 = parcel.readString();
                String string11 = parcel.readString();
                int i = parcel.readInt();
                LinkedHashMap linkedHashMap = new LinkedHashMap(i);
                while (iF != i) {
                    iF = cfm0.f(parcel, linkedHashMap, parcel.readString(), iF, 1);
                }
                return new c490(string8, string9, string10, string11, linkedHashMap, (pn10) (parcel.readInt() != 0 ? pn10.CREATOR.createFromParcel(parcel) : null));
            case 7:
                return new a690(parcel.readParcelable(a690.class.getClassLoader()));
            case 8:
                return new d890(parcel.readString(), parcel.readString(), parcel.readString());
            case 9:
                return new ka90(parcel.readString(), parcel.readString());
            case 10:
                parcel.readInt();
                return tb90.a;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new ub90(parcel.readString());
            case grn1.d /* 12 */:
                return new vb90(parcel.readString());
            case 13:
                parcel.readInt();
                return wb90.a;
            case 14:
                return new xb90(parcel.readString());
            case 15:
                parcel.readInt();
                return yb90.a;
            case 16:
                return new bd90(parcel.readInt() != 0);
            case 17:
                return new pd90(parcel.readParcelable(pd90.class.getClassLoader()));
            case 18:
                parcel.readInt();
                return qd90.a;
            case 19:
                return new vd90(parcel.readParcelable(vd90.class.getClassLoader()));
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new sd90(parcel.readParcelable(sd90.class.getClassLoader()));
            case 21:
                return new td90(parcel.readString(), parcel.readString());
            case 22:
                return new oe90(parcel.readString(), (w4i1) w4i1.CREATOR.createFromParcel(parcel));
            case 23:
                parcel.readInt();
                return kf90.a;
            case 24:
                parcel.readInt();
                return qf90.a;
            case 25:
                parcel.readInt();
                return rf90.a;
            case 26:
                parcel.readInt();
                return eg90.a;
            case 27:
                parcel.readInt();
                return fg90.a;
            case 28:
                return new og90(parcel.readString());
            default:
                parcel.readInt();
                return pg90.a;
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                return new yl80[i];
            case 1:
                return new fn80[i];
            case 2:
                return new qo80[i];
            case 3:
                return new kt80[i];
            case 4:
                return new tv80[i];
            case 5:
                return new o190[i];
            case 6:
                return new c490[i];
            case 7:
                return new a690[i];
            case 8:
                return new d890[i];
            case 9:
                return new ka90[i];
            case 10:
                return new tb90[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                return new ub90[i];
            case grn1.d /* 12 */:
                return new vb90[i];
            case 13:
                return new wb90[i];
            case 14:
                return new xb90[i];
            case 15:
                return new yb90[i];
            case 16:
                return new bd90[i];
            case 17:
                return new pd90[i];
            case 18:
                return new qd90[i];
            case 19:
                return new vd90[i];
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                return new sd90[i];
            case 21:
                return new td90[i];
            case 22:
                return new oe90[i];
            case 23:
                return new kf90[i];
            case 24:
                return new qf90[i];
            case 25:
                return new rf90[i];
            case 26:
                return new eg90[i];
            case 27:
                return new fg90[i];
            case 28:
                return new og90[i];
            default:
                return new pg90[i];
        }
    }
}
