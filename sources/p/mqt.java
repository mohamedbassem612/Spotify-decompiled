package p;

import android.os.Binder;
import android.os.IBinder;
import android.os.Parcel;
import com.ravelin.core.repository.services.DeviceIdService;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class mqt extends Binder implements z6n1 {
    public static final /* synthetic */ int l = 0;
    public final /* synthetic */ DeviceIdService a;

    /* JADX WARN: Multi-variable type inference failed */
    public mqt(DeviceIdService deviceIdService) {
        this.a = deviceIdService;
        attachInterface(this, "com.ravelin.core.IDeviceIdInterface");
    }

    public final void m0(nqt nqtVar) {
        DeviceIdService deviceIdService = this.a;
        try {
            s6n1 s6n1VarA = deviceIdService.a().u().a();
            String str = nqtVar != null ? nqtVar.b : null;
            if (str != null && !ihc1.y0(str)) {
                String str2 = nqtVar != null ? nqtVar.a : null;
                if (str2 != null && !ihc1.y0(str2)) {
                    Long lValueOf = nqtVar != null ? Long.valueOf(nqtVar.c) : null;
                    if ((lValueOf != null ? lValueOf.longValue() : 0L) != 0) {
                        String str3 = nqtVar != null ? nqtVar.b : null;
                        String str4 = s6n1VarA != null ? s6n1VarA.c : null;
                        String str5 = s6n1VarA != null ? s6n1VarA.d : null;
                        String str6 = s6n1VarA != null ? s6n1VarA.e : null;
                        String str7 = s6n1VarA != null ? s6n1VarA.f : null;
                        String str8 = s6n1VarA != null ? s6n1VarA.g : null;
                        String str9 = s6n1VarA != null ? s6n1VarA.h : null;
                        String str10 = nqtVar != null ? nqtVar.a : null;
                        Long lValueOf2 = nqtVar != null ? Long.valueOf(nqtVar.c) : null;
                        s6n1 s6n1Var = new s6n1(str3, str4, str5, str6, str7, str8, str9, str10, Long.valueOf(lValueOf2 != null ? lValueOf2.longValue() : 0L), 1);
                        String str11 = DeviceIdService.d;
                        String str12 = nqtVar != null ? nqtVar.b : null;
                        String str13 = nqtVar != null ? nqtVar.a : null;
                        Long lValueOf3 = nqtVar != null ? Long.valueOf(nqtVar.c) : null;
                        String str14 = "***Debug DeviceIdService updateDeviceId: " + str12 + " from " + str13 + " at " + (lValueOf3 != null ? lValueOf3.longValue() : 0L);
                        utw0 utw0Var = ike1.a;
                        utw0Var.y(str11);
                        utw0Var.o(str14, new Object[0]);
                        f7n1 f7n1VarU = deviceIdService.a().u();
                        qyo1.x(f7n1VarU.a, false, true, new vae1(f7n1VarU, s6n1Var, (byte) 18));
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    @Override // android.os.Binder
    public final boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
        if (i >= 1 && i <= 16777215) {
            parcel.enforceInterface("com.ravelin.core.IDeviceIdInterface");
        }
        if (i == 1598968902) {
            parcel2.writeString("com.ravelin.core.IDeviceIdInterface");
            return true;
        }
        vug nugVar = null;
        if (i == 1) {
            IBinder strongBinder = parcel.readStrongBinder();
            if (strongBinder != null) {
                vug vugVarQueryLocalInterface = strongBinder.queryLocalInterface("com.ravelin.core.IDeviceIdRequestListener");
                if (vugVarQueryLocalInterface == null || !(vugVarQueryLocalInterface instanceof vug)) {
                    nugVar = new nug();
                    ((nug) nugVar).a = strongBinder;
                } else {
                    nugVar = vugVarQueryLocalInterface;
                }
            }
            v0(nugVar);
            parcel2.writeNoException();
        } else {
            if (i != 2) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            m0((nqt) (parcel.readInt() != 0 ? nqt.CREATOR.createFromParcel(parcel) : null));
            parcel2.writeNoException();
        }
        return true;
    }

    public final void v0(vug vugVar) {
        DeviceIdService deviceIdService = this.a;
        try {
            String str = DeviceIdService.d;
            String str2 = "***Debug deviceIds db = " + deviceIdService.a();
            utw0 utw0Var = ike1.a;
            utw0Var.y(str);
            utw0Var.o(str2, new Object[0]);
            s6n1 s6n1VarA = ((f7n1) deviceIdService.b.getValue()).a();
            kqt kqtVar = new kqt();
            kqtVar.b = s6n1VarA != null ? s6n1VarA.b : null;
            kqtVar.a = s6n1VarA != null ? s6n1VarA.i : null;
            Long l2 = s6n1VarA != null ? s6n1VarA.j : null;
            long jLongValue = l2 != null ? l2.longValue() : 0L;
            kqtVar.c = jLongValue;
            String str3 = "***Debug deviceId from: " + kqtVar.a + " at " + jLongValue + " with value " + kqtVar.b;
            utw0Var.y(str);
            utw0Var.o(str3, new Object[0]);
            if (vugVar != null) {
                vugVar.h0(kqtVar);
            }
        } catch (Exception e) {
            String str4 = DeviceIdService.d;
            String strM = l1d.m("***Debug DeviceIdService requestDeviceId error: ", e.getMessage());
            utw0 utw0Var2 = ike1.a;
            utw0Var2.y(str4);
            utw0Var2.o(strM, new Object[0]);
            if (vugVar != null) {
                vugVar.t(401, e.getMessage(), (String) deviceIdService.c.getValue());
            }
        }
    }

    public final IBinder asBinder() {
        return this;
    }
}
