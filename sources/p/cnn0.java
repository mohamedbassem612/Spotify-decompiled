package p;

import android.os.Parcelable;
import java.io.Serializable;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cnn0 {
    public apn0 a;
    public boolean b;
    public Object c;
    public boolean d;
    public boolean e;

    /* JADX WARN: Code duplicated, block: B:43:0x0089  */
    /* JADX WARN: Code duplicated, block: B:45:0x0093  */
    /* JADX WARN: Code duplicated, block: B:47:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:48:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:50:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:53:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:54:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:56:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:57:0x00de  */
    public final dnn0 a() {
        apn0 zon0Var;
        Class<?> componentType;
        apn0 apn0Var = this.a;
        if (apn0Var == null) {
            Object obj = this.c;
            if (obj instanceof Integer) {
                apn0Var = apn0.b;
            } else if (obj instanceof int[]) {
                apn0Var = apn0.d;
            } else if (obj instanceof Long) {
                apn0Var = apn0.f;
            } else if (obj instanceof long[]) {
                apn0Var = apn0.g;
            } else if (obj instanceof Float) {
                apn0Var = apn0.i;
            } else if (obj instanceof float[]) {
                apn0Var = apn0.j;
            } else if (obj instanceof Boolean) {
                apn0Var = apn0.l;
            } else if (obj instanceof boolean[]) {
                apn0Var = apn0.m;
            } else if ((obj instanceof String) || obj == null) {
                apn0Var = apn0.o;
            } else if ((obj instanceof Object[]) && (((Object[]) obj) instanceof String[])) {
                apn0Var = apn0.f12p;
            } else {
                if (obj.getClass().isArray()) {
                    Class<?> componentType2 = obj.getClass().getComponentType();
                    componentType2.getClass();
                    if (Parcelable.class.isAssignableFrom(componentType2)) {
                        zon0Var = new won0(obj.getClass().getComponentType());
                    } else if (obj.getClass().isArray()) {
                        componentType = obj.getClass().getComponentType();
                        componentType.getClass();
                        if (Serializable.class.isAssignableFrom(componentType)) {
                            zon0Var = new yon0(obj.getClass().getComponentType());
                        } else if (obj instanceof Parcelable) {
                            zon0Var = new xon0(obj.getClass());
                        } else if (obj instanceof Enum) {
                            zon0Var = new von0(obj.getClass());
                        } else {
                            if (obj instanceof Serializable) {
                                mna0.e("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                                return null;
                            }
                            zon0Var = new zon0(obj.getClass());
                        }
                    } else if (obj instanceof Parcelable) {
                        zon0Var = new xon0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        zon0Var = new von0(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            mna0.e("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        zon0Var = new zon0(obj.getClass());
                    }
                } else if (obj.getClass().isArray()) {
                    componentType = obj.getClass().getComponentType();
                    componentType.getClass();
                    if (Serializable.class.isAssignableFrom(componentType)) {
                        zon0Var = new yon0(obj.getClass().getComponentType());
                    } else if (obj instanceof Parcelable) {
                        zon0Var = new xon0(obj.getClass());
                    } else if (obj instanceof Enum) {
                        zon0Var = new von0(obj.getClass());
                    } else {
                        if (obj instanceof Serializable) {
                            mna0.e("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                            return null;
                        }
                        zon0Var = new zon0(obj.getClass());
                    }
                } else if (obj instanceof Parcelable) {
                    zon0Var = new xon0(obj.getClass());
                } else if (obj instanceof Enum) {
                    zon0Var = new von0(obj.getClass());
                } else {
                    if (obj instanceof Serializable) {
                        mna0.e("Object of type ", obj.getClass().getName(), " is not supported for navigation arguments.");
                        return null;
                    }
                    zon0Var = new zon0(obj.getClass());
                }
                apn0Var = zon0Var;
            }
        }
        return new dnn0(apn0Var, this.b, this.c, this.d, this.e);
    }
}
