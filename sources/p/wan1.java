package p;

import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;
import com.spotify.automix.proto.AutomationValueSemanticsOuterClass$AutomationValueSemantics;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class wan1 extends mh70 implements IInterface {
    public wan1() {
        super("com.google.android.gms.wearable.internal.IWearableCallbacks", (byte) 10);
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        switch (i) {
            case 2:
                throw xvj1.l(parcel);
            case 3:
                kko1 kko1Var = (kko1) zsn1.a(parcel, kko1.CREATOR);
                zsn1.d(parcel);
                c1(kko1Var);
                break;
            case 4:
                throw xvj1.l(parcel);
            case 5:
                DataHolder dataHolder = (DataHolder) zsn1.a(parcel, DataHolder.CREATOR);
                zsn1.d(parcel);
                d1(dataHolder);
                break;
            case 6:
                d3o1 d3o1Var = (d3o1) zsn1.a(parcel, d3o1.CREATOR);
                zsn1.d(parcel);
                e1(d3o1Var);
                break;
            case 7:
                throw xvj1.l(parcel);
            case 8:
                throw xvj1.l(parcel);
            case 9:
                throw xvj1.l(parcel);
            case 10:
                i8o1 i8o1Var = (i8o1) zsn1.a(parcel, i8o1.CREATOR);
                zsn1.d(parcel);
                f1(i8o1Var);
                break;
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.PIECEWISE_INTERPOLATION_FIELD_NUMBER /* 11 */:
                Status status = (Status) zsn1.a(parcel, Status.CREATOR);
                zsn1.d(parcel);
                h1(status);
                break;
            case grn1.d /* 12 */:
                throw xvj1.l(parcel);
            case 13:
                throw xvj1.l(parcel);
            case 14:
                throw xvj1.l(parcel);
            case 15:
                throw xvj1.l(parcel);
            case 16:
                throw xvj1.l(parcel);
            case 17:
                throw xvj1.l(parcel);
            case 18:
                throw xvj1.l(parcel);
            case 19:
                throw xvj1.l(parcel);
            case AutomationValueSemanticsOuterClass$AutomationValueSemantics.SPECIAL_CASES_FIELD_NUMBER /* 20 */:
                zsn1.a(parcel, sun1.CREATOR);
                throw xvj1.l(parcel);
            case 21:
            case 24:
            case 25:
            case 31:
            case 32:
            case 33:
            case 44:
            case 45:
            default:
                return false;
            case 22:
                throw xvj1.l(parcel);
            case 23:
                v3o1 v3o1Var = (v3o1) zsn1.a(parcel, v3o1.CREATOR);
                zsn1.d(parcel);
                b1(v3o1Var);
                break;
            case 26:
                throw xvj1.l(parcel);
            case 27:
                throw xvj1.l(parcel);
            case 28:
                throw xvj1.l(parcel);
            case 29:
                throw xvj1.l(parcel);
            case 30:
                throw xvj1.l(parcel);
            case 34:
                throw xvj1.l(parcel);
            case 35:
                throw xvj1.l(parcel);
            case 36:
                throw xvj1.l(parcel);
            case 37:
                p7o1 p7o1Var = (p7o1) zsn1.a(parcel, p7o1.CREATOR);
                zsn1.d(parcel);
                g1(p7o1Var);
                break;
            case 38:
                throw xvj1.l(parcel);
            case 39:
                throw xvj1.l(parcel);
            case 40:
                throw xvj1.l(parcel);
            case 41:
                throw xvj1.l(parcel);
            case 42:
                throw xvj1.l(parcel);
            case 43:
                throw xvj1.l(parcel);
            case 46:
                zsn1.a(parcel, ubp1.CREATOR);
                throw xvj1.l(parcel);
            case 47:
                zsn1.a(parcel, aco1.CREATOR);
                throw xvj1.l(parcel);
            case 48:
                throw xvj1.l(parcel);
            case 49:
                throw xvj1.l(parcel);
            case 50:
                throw xvj1.l(parcel);
            case 51:
                throw xvj1.l(parcel);
            case 52:
                throw xvj1.l(parcel);
        }
        parcel2.writeNoException();
        return true;
    }

    public void b1(v3o1 v3o1Var) {
        throw new UnsupportedOperationException();
    }

    public void c1(kko1 kko1Var) {
        throw new UnsupportedOperationException();
    }

    public void d1(DataHolder dataHolder) {
        throw new UnsupportedOperationException();
    }

    public void e1(d3o1 d3o1Var) {
        throw new UnsupportedOperationException();
    }

    public void f1(i8o1 i8o1Var) {
        throw new UnsupportedOperationException();
    }

    public void g1(p7o1 p7o1Var) {
        throw new UnsupportedOperationException();
    }

    public void h1(Status status) {
        throw new UnsupportedOperationException();
    }
}
