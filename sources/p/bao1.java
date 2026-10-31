package p;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class bao1 extends mh70 implements IInterface {
    public final /* synthetic */ bsd1 l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bao1(pxo1 pxo1Var, bsd1 bsd1Var) {
        super("com.google.android.gms.usagereporting.internal.IUsageReportingCallbacks", (byte) 3);
        this.l = bsd1Var;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                Status statusA = osn1.a(parcel, Status.CREATOR);
                fco1 fco1Var = (fco1) osn1.a(parcel, fco1.CREATOR);
                osn1.d(parcel);
                yco1 yco1Var = new yco1(fco1Var);
                pao1 pao1Var = new pao1();
                pao1Var.a = yco1Var;
                u0p1.u(statusA, pao1Var, this.l);
                return true;
            case 3:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 4:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 5:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                throw new IllegalStateException("Not implemented.");
            case 6:
                osn1.a(parcel, Status.CREATOR);
                parcel.createStringArrayList();
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 7:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 8:
                osn1.a(parcel, Status.CREATOR);
                parcel.readInt();
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 9:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented");
                return false;
            case 10:
                osn1.d(parcel);
                eg.m("Not implemented");
                return false;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case grn1.d /* 12 */:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 13:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 14:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            case 15:
                osn1.a(parcel, Status.CREATOR);
                osn1.d(parcel);
                eg.m("Not implemented.");
                return false;
            default:
                return false;
        }
    }
}
