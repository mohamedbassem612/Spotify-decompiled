package p;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public abstract class cap1 {
    public static final pue0 a = new pue0("MediaSessionUtils", (String) null);

    public static ArrayList a(i2o1 i2o1Var) {
        try {
            Parcel parcelB1 = i2o1Var.b1(3, i2o1Var.a1());
            ArrayList arrayListCreateTypedArrayList = parcelB1.createTypedArrayList(qjo0.CREATOR);
            parcelB1.recycle();
            return arrayListCreateTypedArrayList;
        } catch (RemoteException unused) {
            a.c("Unable to call %s on %s.", new Object[]{"getNotificationActions", i2o1.class.getSimpleName()});
            return null;
        }
    }

    public static int[] b(i2o1 i2o1Var) {
        try {
            Parcel parcelB1 = i2o1Var.b1(4, i2o1Var.a1());
            int[] iArrCreateIntArray = parcelB1.createIntArray();
            parcelB1.recycle();
            return iArrCreateIntArray;
        } catch (RemoteException unused) {
            a.c("Unable to call %s on %s.", new Object[]{"getCompactViewActionIndices", i2o1.class.getSimpleName()});
            return null;
        }
    }
}
