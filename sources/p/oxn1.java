package p;

import android.content.Context;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.AsyncTask;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.cast.framework.ModuleUnavailableException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class oxn1 extends AsyncTask {
    public static final pue0 c = new pue0("FetchBitmapTask", (String) null);
    public final obo1 a;
    public final vi11 b;

    public oxn1(Context context, int i, int i2, vi11 vi11Var) {
        obo1 obo1VarK1;
        this.b = vi11Var;
        Context applicationContext = context.getApplicationContext();
        cjn1 cjn1Var = new cjn1(this);
        pue0 pue0Var = xon1.a;
        try {
            tpn1 tpn1VarB = xon1.b(applicationContext.getApplicationContext());
            qfp0 qfp0Var = new qfp0(applicationContext.getApplicationContext());
            Parcel parcelB1 = tpn1VarB.b1(8, tpn1VarB.a1());
            int i3 = parcelB1.readInt();
            parcelB1.recycle();
            obo1VarK1 = i3 >= 233700000 ? tpn1VarB.k1(qfp0Var, new qfp0(this), cjn1Var, i, i2) : tpn1VarB.j1(new qfp0(this), cjn1Var, i, i2);
        } catch (RemoteException | ModuleUnavailableException unused) {
            xon1.a.b("Unable to call %s on %s.", new Object[]{"newFetchBitmapTaskImpl", tpn1.class.getSimpleName()});
            obo1VarK1 = null;
        }
        this.a = obo1VarK1;
    }

    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        Uri uri;
        obo1 obo1Var;
        Uri[] uriArr = (Uri[]) objArr;
        if (uriArr.length == 1 && (uri = uriArr[0]) != null && (obo1Var = this.a) != null) {
            try {
                j2o1 j2o1Var = (j2o1) obo1Var;
                Parcel parcelA1 = j2o1Var.a1();
                osn1.b(parcelA1, uri);
                Parcel parcelB1 = j2o1Var.b1(1, parcelA1);
                Bitmap bitmap = (Bitmap) osn1.a(parcelB1, Bitmap.CREATOR);
                parcelB1.recycle();
                return bitmap;
            } catch (RemoteException unused) {
                c.b("Unable to call %s on %s.", new Object[]{"doFetch", obo1.class.getSimpleName()});
            }
        }
        return null;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        vi11 vi11Var = this.b;
        if (vi11Var != null) {
            ebn1 ebn1Var = (ebn1) vi11Var.f;
            if (ebn1Var != null) {
                ebn1Var.d(bitmap);
            }
            vi11Var.e = null;
        }
    }
}
