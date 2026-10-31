package p;

import android.content.Context;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.google.android.gms.cast.framework.ModuleUnavailableException;
import com.google.android.gms.dynamite.DynamiteModule$LoadingException;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public abstract class xon1 {
    public static final pue0 a = new pue0("CastDynamiteModule", null);

    /* JADX WARN: Multi-variable type inference failed */
    public static ggn1 a(Context context, p3e p3eVar, fsn1 fsn1Var, HashMap map) throws ModuleUnavailableException {
        ggn1 afn1Var;
        tpn1 tpn1VarB = b(context);
        qfp0 qfp0Var = new qfp0(context.getApplicationContext());
        Parcel parcelA1 = tpn1VarB.a1();
        osn1.c(parcelA1, qfp0Var);
        osn1.b(parcelA1, p3eVar);
        osn1.c(parcelA1, fsn1Var);
        parcelA1.writeMap(map);
        Parcel parcelB1 = tpn1VarB.b1(1, parcelA1);
        IBinder strongBinder = parcelB1.readStrongBinder();
        int i = pfn1.l;
        if (strongBinder == null) {
            afn1Var = null;
        } else {
            IInterface iInterfaceQueryLocalInterface = strongBinder.queryLocalInterface("com.google.android.gms.cast.framework.ICastContext");
            afn1Var = iInterfaceQueryLocalInterface instanceof ggn1 ? (ggn1) iInterfaceQueryLocalInterface : new afn1(strongBinder, "com.google.android.gms.cast.framework.ICastContext", (byte) 1);
        }
        parcelB1.recycle();
        return afn1Var;
    }

    public static tpn1 b(Context context) throws ModuleUnavailableException {
        try {
            IBinder iBinderB = gjv.c(context, gjv.b, "com.google.android.gms.cast.framework.dynamite").b("com.google.android.gms.cast.framework.internal.CastDynamiteModuleImpl");
            if (iBinderB == null) {
                return null;
            }
            Object objQueryLocalInterface = iBinderB.queryLocalInterface("com.google.android.gms.cast.framework.internal.ICastDynamiteModule");
            return objQueryLocalInterface instanceof tpn1 ? (tpn1) objQueryLocalInterface : new tpn1(iBinderB, "com.google.android.gms.cast.framework.internal.ICastDynamiteModule", (byte) 1);
        } catch (DynamiteModule$LoadingException e) {
            throw new ModuleUnavailableException(e);
        }
    }
}
