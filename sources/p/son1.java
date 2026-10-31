package p;

import android.os.Looper;
import android.os.Parcel;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class son1 extends mh70 {
    public static final pue0 n = new pue0("AppVisibilityProxy", null);
    public static final boolean o = true;
    public final Set l;
    public byte m;

    public son1() {
        super("com.google.android.gms.cast.framework.IAppVisibilityListener", (byte) 3);
        this.l = Collections.synchronizedSet(new HashSet());
        this.m = o ? (byte) 1 : (byte) 0;
    }

    public final boolean Y0(int i, Parcel parcel, Parcel parcel2) {
        if (i == 1) {
            qfp0 qfp0Var = new qfp0(this);
            parcel2.writeNoException();
            osn1.c(parcel2, qfp0Var);
            return true;
        }
        Set set = this.l;
        pue0 pue0Var = n;
        if (i == 2) {
            pue0Var.c("onAppEnteredForeground", new Object[0]);
            this.m = (byte) 1;
            Iterator it = set.iterator();
            while (it.hasNext()) {
                ((frn1) it.next()).a.m();
            }
            parcel2.writeNoException();
            return true;
        }
        if (i != 3) {
            if (i != 4) {
                return false;
            }
            parcel2.writeNoException();
            parcel2.writeInt(12451000);
            return true;
        }
        pue0Var.c("onAppEnteredBackground", new Object[0]);
        this.m = (byte) 2;
        Iterator it2 = set.iterator();
        while (it2.hasNext()) {
            krn1 krn1Var = ((frn1) it2.next()).a;
            krn1.f.a("Stopping RouteDiscovery.", new Object[0]);
            krn1Var.c.clear();
            if (Looper.myLooper() == Looper.getMainLooper()) {
                krn1Var.e.p(krn1Var);
            } else {
                new jim0(Looper.getMainLooper(), (byte) 5).post(new hrn1(krn1Var, (byte) 1));
            }
        }
        parcel2.writeNoException();
        return true;
    }
}
