package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.util.Log;
import com.google.android.play.core.splitinstall.model.SplitInstallErrorCode;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class qxn1 extends a2o1 {
    public final /* synthetic */ byte b = 1;
    public final /* synthetic */ bsd1 c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn1(gzo1 gzo1Var, bsd1 bsd1Var, bsd1 bsd1Var2, qxn1 qxn1Var) {
        super(bsd1Var);
        this.c = bsd1Var2;
        this.d = qxn1Var;
        Objects.requireNonNull(gzo1Var);
        this.e = gzo1Var;
    }

    @Override // p.a2o1
    public final void a() {
        switch (this.b) {
            case SplitInstallErrorCode.NO_ERROR /* 0 */:
                bsd1 bsd1Var = this.c;
                nbo1 nbo1Var = (nbo1) this.e;
                String str = nbo1Var.b;
                try {
                    mg70 mg70Var = nbo1Var.a.m;
                    if (mg70Var != null) {
                        Bundle bundle = (Bundle) this.d;
                        mh70 e7o1Var = new e7o1(nbo1Var, bsd1Var);
                        kg70 kg70Var = (kg70) mg70Var;
                        Parcel parcelObtain = Parcel.obtain();
                        parcelObtain.writeInterfaceToken("com.google.android.play.core.crossdeviceprompt.protocol.ICrossDevicePromptService");
                        parcelObtain.writeString(str);
                        int i = wsn1.a;
                        parcelObtain.writeInt(1);
                        bundle.writeToParcel(parcelObtain, 0);
                        parcelObtain.writeStrongBinder(e7o1Var);
                        try {
                            kg70Var.a.transact(2, parcelObtain, null, 1);
                            return;
                        } finally {
                            parcelObtain.recycle();
                        }
                    }
                    return;
                } catch (RemoteException e) {
                    mcn1 mcn1Var = nbo1.c;
                    Object[] objArr = {str};
                    mcn1Var.getClass();
                    if (Log.isLoggable("PlayCore", 6)) {
                        mcn1.d(mcn1Var.b, "error requesting in-prompt prompt for %s", objArr);
                    }
                    bsd1Var.c(new RuntimeException(e));
                    return;
                }
            default:
                gzo1 gzo1Var = (gzo1) this.e;
                synchronized (gzo1Var.f) {
                    try {
                        bsd1 bsd1Var2 = this.c;
                        gzo1Var.e.add(bsd1Var2);
                        bsd1Var2.a.b(new zxl1(gzo1Var, bsd1Var2, (byte) 19));
                        if (gzo1Var.k.getAndIncrement() > 0) {
                            gzo1Var.b.b("Already connected to the service.", new Object[0]);
                        }
                        gzo1.b(gzo1Var, (qxn1) this.d);
                    } catch (Throwable th) {
                        throw th;
                    }
                    break;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public qxn1(nbo1 nbo1Var, bsd1 bsd1Var, Bundle bundle, bsd1 bsd1Var2) {
        super(bsd1Var);
        this.d = bundle;
        this.c = bsd1Var2;
        this.e = nbo1Var;
    }
}
