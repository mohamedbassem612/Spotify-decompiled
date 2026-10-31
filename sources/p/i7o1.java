package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class i7o1 extends san1 {
    public final IBinder g;
    public final /* synthetic */ xaa h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i7o1(xaa xaaVar, int i, IBinder iBinder, Bundle bundle) {
        super(xaaVar, i, bundle);
        this.h = xaaVar;
        this.g = iBinder;
    }

    @Override // p.san1
    public final boolean a() {
        IBinder iBinder = this.g;
        try {
            zod.s(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            xaa xaaVar = this.h;
            if (!xaaVar.o().equals(interfaceDescriptor)) {
                new StringBuilder(xaaVar.o().length() + 34 + String.valueOf(interfaceDescriptor).length());
                return false;
            }
            IInterface iInterfaceB = xaaVar.b(iBinder);
            if (iInterfaceB != null && (xaaVar.I(2, 4, iInterfaceB) || xaaVar.I(3, 4, iInterfaceB))) {
                xaaVar.Q((lal) null);
                y1t0 y1t0VarN = xaaVar.N();
                xaaVar.g();
                if (y1t0VarN == null) {
                    return true;
                }
                ((nz40) xaaVar.N().b).onConnected();
                return true;
            }
            return false;
        } catch (RemoteException unused) {
        }
    }

    @Override // p.san1
    public final void b(lal lalVar) {
        xaa xaaVar = this.h;
        if (xaaVar.O() != null) {
            xaaVar.O().e(lalVar);
        }
        xaaVar.w(lalVar);
    }
}
