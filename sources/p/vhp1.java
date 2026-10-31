package p;

import android.content.Context;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Looper;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.CastDevice;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class vhp1 extends px40 {
    public static final pue0 E = new pue0("CastClientImplCxless", (String) null);
    public final CastDevice B;
    public final Bundle C;
    public final String D;

    public vhp1(Context context, Looper looper, d520 d520Var, CastDevice castDevice, Bundle bundle, String str, h8n1 h8n1Var, h8n1 h8n1Var2) {
        super(context, looper, 10, d520Var, h8n1Var, h8n1Var2);
        this.B = castDevice;
        this.C = bundle;
        this.D = str;
    }

    public final boolean E() {
        return true;
    }

    public final /* synthetic */ IInterface b(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.cast.internal.ICastDeviceController");
        return iInterfaceQueryLocalInterface instanceof cgn1 ? (cgn1) iInterfaceQueryLocalInterface : new cgn1(iBinder);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final void c() {
        try {
            try {
                cgn1 cgn1Var = (cgn1) n();
                hi5 hi5VarA = oho1.A();
                Parcel parcelA1 = cgn1Var.a1();
                osn1.b(parcelA1, hi5VarA);
                cgn1Var.d1(1, parcelA1);
            } catch (RemoteException | IllegalStateException unused) {
                E.b("Error while disconnecting the controller interface", new Object[0]);
            }
        } finally {
            super/*p.xaa*/.c();
        }
    }

    public final pl10[] e() {
        return hm5.j;
    }

    public final Bundle j() {
        Bundle bundle = new Bundle();
        E.a("getRemoteService()", new Object[0]);
        CastDevice castDevice = this.B;
        castDevice.getClass();
        bundle.putParcelable("com.google.android.gms.cast.EXTRA_CAST_DEVICE", castDevice);
        bundle.putLong("com.google.android.gms.cast.EXTRA_CAST_FLAGS", 0L);
        bundle.putString("connectionless_client_record_id", this.D);
        Bundle bundle2 = this.C;
        if (bundle2 != null) {
            bundle.putAll(bundle2);
        }
        return bundle;
    }

    public final int l() {
        return 19390000;
    }

    public final String o() {
        return "com.google.android.gms.cast.internal.ICastDeviceController";
    }

    public final String p() {
        return "com.google.android.gms.cast.service.BIND_CAST_DEVICE_CONTROLLER_SERVICE";
    }
}
