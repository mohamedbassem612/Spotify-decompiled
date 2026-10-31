package p;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.security.GeneralSecurityException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final /* synthetic */ class oen1 implements ufp1, vy11 {
    public static final /* synthetic */ oen1 b = new oen1(0);
    public static final /* synthetic */ oen1 c = new oen1(1);
    public static final /* synthetic */ oen1 d = new oen1(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ oen1(byte b2) {
        this.a = b2;
    }

    public void accept(Object obj, Object obj2) {
        pl10 pl10Var;
        pl10 pl10Var2;
        bsd1 bsd1Var = (bsd1) obj2;
        px40 px40Var = (o1o1) obj;
        ofb0 ofb0Var = new ofb0(Long.MAX_VALUE, 0, false, null);
        pl10[] pl10VarArrF = px40Var.f();
        if (pl10VarArrF != null) {
            int i = 0;
            while (true) {
                if (i >= pl10VarArrF.length) {
                    pl10Var2 = null;
                    break;
                }
                pl10Var2 = pl10VarArrF[i];
                if ("location_updates_with_callback".equals(pl10Var2.a)) {
                    break;
                } else {
                    i++;
                }
            }
            if (pl10Var2 != null && pl10Var2.j() >= 1) {
                ybp1 ybp1Var = (ybp1) px40Var.n();
                kzn1 kzn1Var = new kzn1(bsd1Var);
                Parcel parcelObtain = Parcel.obtain();
                parcelObtain.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i2 = ssn1.a;
                parcelObtain.writeInt(1);
                ofb0Var.writeToParcel(parcelObtain, 0);
                parcelObtain.writeInt(1);
                int iL = j541.L(20293, parcelObtain);
                j541.K(parcelObtain, 1, 4);
                parcelObtain.writeInt(4);
                j541.y(parcelObtain, 3, kzn1Var);
                j541.M(iL, parcelObtain);
                ybp1Var.s(90, parcelObtain);
                return;
            }
        }
        pl10[] pl10VarArrF2 = px40Var.f();
        if (pl10VarArrF2 != null) {
            int i3 = 0;
            while (true) {
                if (i3 >= pl10VarArrF2.length) {
                    pl10Var = null;
                    break;
                }
                pl10Var = pl10VarArrF2[i3];
                if ("get_last_location_with_request".equals(pl10Var.a)) {
                    break;
                } else {
                    i3++;
                }
            }
            if (pl10Var != null && pl10Var.j() >= 1) {
                ybp1 ybp1Var2 = (ybp1) px40Var.n();
                kzn1 kzn1Var2 = new kzn1(bsd1Var);
                Parcel parcelObtain2 = Parcel.obtain();
                parcelObtain2.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
                int i4 = ssn1.a;
                parcelObtain2.writeInt(1);
                ofb0Var.writeToParcel(parcelObtain2, 0);
                parcelObtain2.writeStrongBinder(kzn1Var2);
                ybp1Var2.s(82, parcelObtain2);
                return;
            }
        }
        ybp1 ybp1Var3 = (ybp1) px40Var.n();
        Parcel parcelObtain3 = Parcel.obtain();
        parcelObtain3.writeInterfaceToken("com.google.android.gms.location.internal.IGoogleLocationManagerService");
        Parcel parcelObtain4 = Parcel.obtain();
        try {
            try {
                ybp1Var3.a.transact(7, parcelObtain3, parcelObtain4, 0);
                parcelObtain4.readException();
                parcelObtain3.recycle();
                Parcelable.Creator creator = Location.CREATOR;
                int i5 = ssn1.a;
                Parcelable parcelable = parcelObtain4.readInt() != 0 ? (Parcelable) creator.createFromParcel(parcelObtain4) : null;
                parcelObtain4.recycle();
                bsd1Var.b((Location) parcelable);
            } catch (RuntimeException e) {
                parcelObtain4.recycle();
                throw e;
            }
        } catch (Throwable th) {
            parcelObtain3.recycle();
            throw th;
        }
    }

    @Override // p.ufp1
    public Object b(pno1 pno1Var) throws GeneralSecurityException {
        switch (this.a) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                vjp1 vjp1Var = (vjp1) pno1Var;
                if (ila0.L() == null) {
                    k220.r("Obtaining Conscrypt provider failed");
                    return null;
                }
                if (!boo1.D(1)) {
                    throw new GeneralSecurityException("Can not use Composite ML-DSA in FIPS-mode, as it is not yet certified in Conscrypt.");
                }
                vjp1Var.getClass();
                throw null;
            default:
                return jhn1.a((xdn1) pno1Var);
        }
    }
}
