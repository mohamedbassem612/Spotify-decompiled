package p;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class o8n1 {
    public final /* synthetic */ kz50 a;

    public o8n1(kz50 kz50Var) {
        this.a = kz50Var;
    }

    public final void a() {
        zrj1 zrj1Var = (zrj1) this.a.a;
        ViewGroup viewGroup = (ViewGroup) zrj1Var.b;
        qso1 qso1Var = (qso1) zrj1Var.c;
        try {
            Bundle bundle = new Bundle();
            Parcel parcelA1 = qso1Var.a1();
            tsn1.a(parcelA1, bundle);
            qso1Var.c1(2, parcelA1);
            ltn1.G(bundle, null);
            Parcel parcelY0 = qso1Var.Y0(8, qso1Var.a1());
            vh70 vh70VarB1 = qfp0.b1(parcelY0.readStrongBinder());
            parcelY0.recycle();
            zrj1Var.d = (View) qfp0.c1(vh70VarB1);
            viewGroup.removeAllViews();
            viewGroup.addView((View) zrj1Var.d);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException((Throwable) e);
        }
    }
}
