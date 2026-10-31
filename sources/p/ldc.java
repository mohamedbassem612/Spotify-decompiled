package p;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcelable;
import android.util.ArrayMap;
import android.util.Log;
import androidx.car.app.serialization.BundlerException;
import androidx.core.graphics.drawable.IconCompat;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.AbstractCollection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class ldc {
    public static final ArrayMap a;
    public static final ArrayMap b;
    public static final HashMap c;

    static {
        ArrayMap arrayMap = new ArrayMap();
        arrayMap.put(Boolean.class, "bool");
        arrayMap.put(Byte.class, "byte");
        arrayMap.put(Short.class, "short");
        arrayMap.put(Integer.class, "int");
        arrayMap.put(Long.class, "long");
        arrayMap.put(Double.class, "double");
        arrayMap.put(Float.class, "float");
        arrayMap.put(String.class, "string");
        arrayMap.put(Parcelable.class, "parcelable");
        arrayMap.put(Map.class, "map");
        arrayMap.put(List.class, "list");
        arrayMap.put(IconCompat.class, "image");
        a = arrayMap;
        ArrayMap arrayMap2 = new ArrayMap();
        arrayMap2.put(0, "primitive");
        arrayMap2.put(1, "iInterface");
        arrayMap2.put(9, "iBinder");
        arrayMap2.put(2, "map");
        arrayMap2.put(3, "set");
        arrayMap2.put(4, "list");
        arrayMap2.put(5, "object");
        arrayMap2.put(6, "image");
        b = arrayMap2;
        c = new HashMap();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static void a(Bundle bundle, AbstractCollection abstractCollection, jdc jdcVar) throws BundlerException {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new kdc("Bundle is missing the collection", jdcVar);
        }
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            abstractCollection.add(f((Bundle) ((Parcelable) it.next()), jdcVar));
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Object b(Bundle bundle, jdc jdcVar) throws BundlerException {
        String string = bundle.getString("tag_value");
        if (string == null) {
            throw new kdc(f4i1.f("Missing enum name [", string, "]"), jdcVar);
        }
        String string2 = bundle.getString("tag_class_name");
        if (string2 == null) {
            throw new kdc(f4i1.f("Missing enum className [", string2, "]"), jdcVar);
        }
        try {
            Class clsJ = j(string2);
            if (clsJ.isEnum()) {
                return g(clsJ, "valueOf", jdcVar).invoke(null, string);
            }
            throw new kdc("Class " + string2 + " is not an enum", jdcVar);
        } catch (ClassNotFoundException e) {
            throw new kdc(f4i1.f("Enum class [", string2, "] not found"), jdcVar, e);
        } catch (IllegalArgumentException e2) {
            throw new kdc(cy30.p("Enum value [", string, "] does not exist in enum class [", string2, "]"), jdcVar, e2);
        } catch (ReflectiveOperationException e3) {
            throw new kdc(f4i1.f("Enum of class [", string2, "] missing valueOf method"), jdcVar, e3);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Object c(Bundle bundle, jdc jdcVar) throws BundlerException {
        IBinder binder = bundle.getBinder("tag_value");
        if (binder == null) {
            throw new kdc("Bundle is missing the binder", jdcVar);
        }
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new kdc("Bundle is missing IInterface class name", jdcVar);
        }
        try {
            Class clsJ = j(string);
            if (IInterface.class.isAssignableFrom(clsJ)) {
                Object objInvoke = g(clsJ, "asInterface", jdcVar).invoke(null, binder);
                if (objInvoke != null) {
                    return objInvoke;
                }
                throw new kdc("Failed to get interface from binder", jdcVar);
            }
            throw new kdc("Interface class " + string + " does not implement IInterface", jdcVar);
        } catch (ClassNotFoundException e) {
            throw new kdc("Binder for unknown IInterface: ".concat(string), jdcVar, e);
        } catch (ReflectiveOperationException e2) {
            throw new kdc("Method to create IInterface from a Binder is not accessible for interface: ".concat(string), jdcVar, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static HashMap d(Bundle bundle, jdc jdcVar) throws BundlerException {
        ArrayList parcelableArrayList = bundle.getParcelableArrayList("tag_value");
        if (parcelableArrayList == null) {
            throw new kdc("Bundle is missing the map", jdcVar);
        }
        HashMap map = new HashMap();
        Iterator it = parcelableArrayList.iterator();
        while (it.hasNext()) {
            Bundle bundle2 = (Bundle) ((Parcelable) it.next());
            Bundle bundle3 = bundle2.getBundle("tag_1");
            Bundle bundle4 = bundle2.getBundle("tag_2");
            if (bundle3 == null) {
                throw new kdc("Bundle is missing key", jdcVar);
            }
            map.put(f(bundle3, jdcVar), bundle4 == null ? null : f(bundle4, jdcVar));
        }
        return map;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Object e(Bundle bundle, jdc jdcVar) throws BundlerException {
        String string = bundle.getString("tag_class_name");
        if (string == null) {
            throw new kdc("Bundle is missing the class name", jdcVar);
        }
        try {
            Class clsJ = j(string);
            if (!clsJ.isAnnotationPresent(qrd.class)) {
                throw new kdc("Invalid class not marked as CarProtocol: ".concat(string), jdcVar);
            }
            Constructor declaredConstructor = clsJ.getDeclaredConstructor(null);
            declaredConstructor.setAccessible(true);
            Object objNewInstance = declaredConstructor.newInstance(null);
            for (Field field : h(clsJ)) {
                field.setAccessible(true);
                String str = field.getDeclaringClass().getName() + field.getName();
                Object obj = bundle.get(str);
                if (obj == null) {
                    obj = bundle.get(str.replaceAll("androidx.core.graphics.drawable.IconCompat", "android.support.v4.graphics.drawable.IconCompat"));
                }
                if (obj instanceof Bundle) {
                    field.set(objNewInstance, f((Bundle) obj, jdcVar));
                } else if (obj == null && Log.isLoggable("CarApp.Bun", 3)) {
                    field.toString();
                }
            }
            return objNewInstance;
        } catch (ClassNotFoundException e) {
            throw new kdc("Object for unknown class: ".concat(string), jdcVar, e);
        } catch (IllegalArgumentException e2) {
            throw new kdc("Failed to deserialize class: ".concat(string), jdcVar, e2);
        } catch (NoSuchMethodException e3) {
            throw new kdc("Object missing no args constructor: ".concat(string), jdcVar, e3);
        } catch (ReflectiveOperationException e4) {
            throw new kdc("Constructor or field is not accessible: ".concat(string), jdcVar, e4);
        }
    }

    public static Object f(Bundle bundle, jdc jdcVar) {
        ClassLoader classLoader = ldc.class.getClassLoader();
        Objects.requireNonNull(classLoader);
        bundle.setClassLoader(classLoader);
        int i = bundle.getInt("tag_class_type");
        String str = (String) b.get(Integer.valueOf(bundle.getInt("tag_class_type")));
        if (str == null) {
            str = "unknown";
        }
        jdc jdcVar2 = new jdc(bundle, str, (ArrayDeque) jdcVar.c);
        try {
            try {
                switch (i) {
                    case 0:
                        Object obj = bundle.get("tag_value");
                        if (obj == null) {
                            throw new kdc("Bundle is missing the primitive value", jdcVar2);
                        }
                        jdcVar2.close();
                        return obj;
                    case 1:
                        Object objC = c(bundle, jdcVar2);
                        jdcVar2.close();
                        return objC;
                    case 2:
                        HashMap mapD = d(bundle, jdcVar2);
                        jdcVar2.close();
                        return mapD;
                    case 3:
                        HashSet hashSet = new HashSet();
                        a(bundle, hashSet, jdcVar2);
                        jdcVar2.close();
                        return hashSet;
                    case 4:
                        ArrayList arrayList = new ArrayList();
                        a(bundle, arrayList, jdcVar2);
                        jdcVar2.close();
                        return arrayList;
                    case 5:
                        Object objE = e(bundle, jdcVar2);
                        jdcVar2.close();
                        return objE;
                    case 6:
                        Bundle bundle2 = bundle.getBundle("tag_value");
                        if (bundle2 == null) {
                            throw new kdc("IconCompat bundle is null", jdcVar2);
                        }
                        IconCompat iconCompatA = IconCompat.a(bundle2);
                        if (iconCompatA == null) {
                            throw new kdc("Failed to create IconCompat from bundle", jdcVar2);
                        }
                        jdcVar2.close();
                        return iconCompatA;
                    case 7:
                        Object objB = b(bundle, jdcVar2);
                        jdcVar2.close();
                        return objB;
                    case 8:
                        String string = bundle.getString("tag_value");
                        if (string == null) {
                            throw new kdc("Class is missing the class name", jdcVar2);
                        }
                        try {
                            Class clsJ = j(string);
                            jdcVar2.close();
                            return clsJ;
                        } catch (ClassNotFoundException e) {
                            throw new kdc("Class name is unknown: ".concat(string), jdcVar2, e);
                        }
                    case 9:
                        IBinder binder = bundle.getBinder("tag_value");
                        if (binder == null) {
                            throw new kdc("Bundle is missing the binder", jdcVar2);
                        }
                        jdcVar2.close();
                        return binder;
                    case 10:
                        mrs0 mrs0VarA = mrs0.a(bundle);
                        jdcVar2.close();
                        return mrs0VarA;
                    default:
                        throw new kdc("Unsupported class type in bundle: " + i, jdcVar2);
                }
            } catch (Throwable th) {
                jdcVar2.close();
                throw th;
            }
            jdcVar2.close();
        } catch (Throwable th2) {
            th.addSuppressed(th2);
        }
        throw th;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Method g(Class cls, String str, jdc jdcVar) throws BundlerException {
        if (cls == null || cls == Object.class) {
            throw new kdc("No method " + str + " in class " + cls, jdcVar);
        }
        for (Method method : cls.getDeclaredMethods()) {
            if (method.getName().equals(str)) {
                method.setAccessible(true);
                return method;
            }
        }
        return g(cls.getSuperclass(), str, jdcVar);
    }

    public static ArrayList h(Class cls) {
        ArrayList arrayList = new ArrayList();
        if (cls != null && cls != Object.class) {
            for (Field field : cls.getDeclaredFields()) {
                if (!Modifier.isStatic(field.getModifiers())) {
                    arrayList.add(field);
                }
            }
            arrayList.addAll(h(cls.getSuperclass()));
        }
        return arrayList;
    }

    public static String i(Class cls) {
        String str = (String) a.get(cls);
        if (str == null) {
            if (List.class.isAssignableFrom(cls)) {
                return "<List>";
            }
            if (Map.class.isAssignableFrom(cls)) {
                return "<Map>";
            }
            if (Set.class.isAssignableFrom(cls)) {
                return "<Set>";
            }
        }
        return str == null ? cls.getSimpleName() : str;
    }

    public static Class j(String str) {
        Class<?> cls;
        HashMap map = c;
        synchronized (map) {
            try {
                cls = (Class) map.get(str);
                if (cls == null) {
                    cls = Class.forName(str, false, ldc.class.getClassLoader());
                    map.put(str, cls);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return cls;
    }

    public static Bundle k(Collection collection, jdc jdcVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        Iterator it = collection.iterator();
        int i = 0;
        while (it.hasNext()) {
            arrayList.add(p(it.next(), "<item " + i + ">", jdcVar));
            i++;
        }
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Bundle l(Object obj, jdc jdcVar) throws BundlerException {
        Bundle bundle = new Bundle(3);
        bundle.putInt("tag_class_type", 7);
        try {
            bundle.putString("tag_value", (String) g(obj.getClass(), "name", jdcVar).invoke(obj, null));
            bundle.putString("tag_class_name", obj.getClass().getName());
            return bundle;
        } catch (ReflectiveOperationException e) {
            throw new kdc("Enum missing name method", jdcVar, e);
        }
    }

    public static Bundle m(Map map, jdc jdcVar) {
        Bundle bundle = new Bundle(2);
        ArrayList<? extends Parcelable> arrayList = new ArrayList<>();
        int i = 0;
        for (Map.Entry entry : map.entrySet()) {
            Bundle bundle2 = new Bundle(2);
            bundle2.putBundle("tag_1", p(entry.getKey(), "<key " + i + ">", jdcVar));
            if (entry.getValue() != null) {
                bundle2.putBundle("tag_2", p(entry.getValue(), "<value " + i + ">", jdcVar));
            }
            i++;
            arrayList.add(bundle2);
        }
        bundle.putInt("tag_class_type", 2);
        bundle.putParcelableArrayList("tag_value", arrayList);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Bundle n(Object obj, jdc jdcVar) throws BundlerException {
        String name = obj.getClass().getName();
        if (!obj.getClass().isAnnotationPresent(qrd.class)) {
            throw new kdc("Invalid class not marked as CarProtocol: ".concat(name), jdcVar);
        }
        try {
            obj.getClass().getDeclaredConstructor(null);
            ArrayList<Field> arrayListH = h(obj.getClass());
            Bundle bundle = new Bundle(arrayListH.size() + 2);
            bundle.putInt("tag_class_type", 5);
            bundle.putString("tag_class_name", name);
            for (Field field : arrayListH) {
                field.setAccessible(true);
                String strM = l1d.m(field.getDeclaringClass().getName(), field.getName());
                try {
                    Object obj2 = field.get(obj);
                    if (obj2 != null) {
                        bundle.putParcelable(strM, p(obj2, field.getName(), jdcVar));
                    }
                } catch (IllegalAccessException e) {
                    throw new kdc("Field is not accessible: ".concat(strM), jdcVar, e);
                }
            }
            return bundle;
        } catch (NoSuchMethodException e2) {
            throw new kdc("Class to deserialize is missing a no args constructor: ".concat(name), jdcVar, e2);
        }
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Bundle o(Object obj, jdc jdcVar) throws BundlerException {
        Bundle bundle = new Bundle(2);
        bundle.putInt("tag_class_type", 0);
        if (obj instanceof Boolean) {
            bundle.putBoolean("tag_value", ((Boolean) obj).booleanValue());
            return bundle;
        }
        if (obj instanceof Byte) {
            bundle.putByte("tag_value", ((Byte) obj).byteValue());
            return bundle;
        }
        if (obj instanceof Character) {
            bundle.putChar("tag_value", ((Character) obj).charValue());
            return bundle;
        }
        if (obj instanceof Short) {
            bundle.putShort("tag_value", ((Short) obj).shortValue());
            return bundle;
        }
        if (obj instanceof Integer) {
            bundle.putInt("tag_value", ((Integer) obj).intValue());
            return bundle;
        }
        if (obj instanceof Long) {
            bundle.putLong("tag_value", ((Long) obj).longValue());
            return bundle;
        }
        if (obj instanceof Double) {
            bundle.putDouble("tag_value", ((Double) obj).doubleValue());
            return bundle;
        }
        if (obj instanceof Float) {
            bundle.putFloat("tag_value", ((Float) obj).floatValue());
            return bundle;
        }
        if (obj instanceof String) {
            bundle.putString("tag_value", (String) obj);
            return bundle;
        }
        if (!(obj instanceof Parcelable)) {
            throw new kdc("Unsupported primitive type: ".concat(obj.getClass().getName()), jdcVar);
        }
        bundle.putParcelable("tag_value", (Parcelable) obj);
        return bundle;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.car.app.serialization.BundlerException */
    public static Bundle p(Object obj, String str, jdc jdcVar) throws BundlerException {
        ArrayDeque arrayDeque = (ArrayDeque) jdcVar.c;
        if (obj != null) {
            Iterator it = arrayDeque.iterator();
            while (it.hasNext()) {
                if (((idc) it.next()).a == obj) {
                    throw new hdc("Found cycle while bundling type ".concat(obj.getClass().getSimpleName()), jdcVar);
                }
            }
        }
        jdc jdcVar2 = new jdc(obj, str, arrayDeque);
        try {
            if (obj == null) {
                throw new kdc("Bundling of null object is not supported", jdcVar2);
            }
            if (obj instanceof IconCompat) {
                Bundle bundle = new Bundle(2);
                bundle.putInt("tag_class_type", 6);
                bundle.putBundle("tag_value", ((IconCompat) obj).m());
                jdcVar2.close();
                return bundle;
            }
            if (!(obj instanceof Boolean) && !(obj instanceof Byte) && !(obj instanceof Character) && !(obj instanceof Short) && !(obj instanceof Integer) && !(obj instanceof Long) && !(obj instanceof Double) && !(obj instanceof Float) && !(obj instanceof String) && !(obj instanceof Parcelable)) {
                if (obj instanceof IInterface) {
                    IInterface iInterface = (IInterface) obj;
                    Bundle bundle2 = new Bundle(3);
                    String name = iInterface.getClass().getName();
                    bundle2.putInt("tag_class_type", 1);
                    bundle2.putBinder("tag_value", iInterface.asBinder());
                    bundle2.putString("tag_class_name", name);
                    jdcVar2.close();
                    return bundle2;
                }
                if (obj instanceof IBinder) {
                    Bundle bundle3 = new Bundle(2);
                    bundle3.putInt("tag_class_type", 9);
                    bundle3.putBinder("tag_value", (IBinder) obj);
                    jdcVar2.close();
                    return bundle3;
                }
                if (obj instanceof Map) {
                    Bundle bundleM = m((Map) obj, jdcVar2);
                    jdcVar2.close();
                    return bundleM;
                }
                if (obj instanceof List) {
                    Bundle bundleK = k((List) obj, jdcVar2);
                    bundleK.putInt("tag_class_type", 4);
                    jdcVar2.close();
                    return bundleK;
                }
                if (obj instanceof Set) {
                    Bundle bundleK2 = k((Set) obj, jdcVar2);
                    bundleK2.putInt("tag_class_type", 3);
                    jdcVar2.close();
                    return bundleK2;
                }
                if (obj.getClass().isEnum()) {
                    Bundle bundleL = l(obj, jdcVar2);
                    jdcVar2.close();
                    return bundleL;
                }
                if (obj instanceof Class) {
                    Bundle bundle4 = new Bundle(2);
                    bundle4.putInt("tag_class_type", 8);
                    bundle4.putString("tag_value", ((Class) obj).getName());
                    jdcVar2.close();
                    return bundle4;
                }
                if (obj.getClass().isArray()) {
                    throw new kdc("Object serializing contains an array, use a list or a set instead", jdcVar2);
                }
                if (!(obj instanceof mrs0)) {
                    Bundle bundleN = n(obj, jdcVar2);
                    jdcVar2.close();
                    return bundleN;
                }
                Bundle bundleI = ((mrs0) obj).i();
                bundleI.putInt("tag_class_type", 10);
                jdcVar2.close();
                return bundleI;
            }
            Bundle bundleO = o(obj, jdcVar2);
            jdcVar2.close();
            return bundleO;
        } catch (Throwable th) {
            try {
                jdcVar2.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
