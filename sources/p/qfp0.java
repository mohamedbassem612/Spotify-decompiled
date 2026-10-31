package p;

import android.os.IBinder;
import android.os.IInterface;
import java.lang.reflect.Field;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qfp0 extends mh70 implements vh70 {
    public final Object l;

    public qfp0(Object obj) {
        super("com.google.android.gms.dynamic.IObjectWrapper", (byte) 4);
        this.l = obj;
    }

    public static vh70 b1(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface iInterfaceQueryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.dynamic.IObjectWrapper");
        return iInterfaceQueryLocalInterface instanceof vh70 ? (vh70) iInterfaceQueryLocalInterface : new dpn1(iBinder, "com.google.android.gms.dynamic.IObjectWrapper", (byte) 2);
    }

    public static Object c1(vh70 vh70Var) {
        if (vh70Var instanceof qfp0) {
            return ((qfp0) vh70Var).l;
        }
        IBinder iBinderAsBinder = vh70Var.asBinder();
        Field[] declaredFields = iBinderAsBinder.getClass().getDeclaredFields();
        Field field = null;
        int i = 0;
        for (Field field2 : declaredFields) {
            if (!field2.isSynthetic()) {
                i++;
                field = field2;
            }
        }
        if (i != 1) {
            int length = declaredFields.length;
            hhg1.n(gvg.l(new StringBuilder(String.valueOf(length).length() + 53), "Unexpected number of IObjectWrapper declared fields: ", length));
            return null;
        }
        zod.s(field);
        if (field.isAccessible()) {
            hhg1.n("IObjectWrapper declared field not private!");
            return null;
        }
        field.setAccessible(true);
        try {
            return field.get(iBinderAsBinder);
        } catch (IllegalAccessException e) {
            throw new IllegalArgumentException("Could not access the field in remoteBinder.", e);
        } catch (NullPointerException e2) {
            throw new IllegalArgumentException("Binder object is null.", e2);
        }
    }
}
