package p;

import java.util.Arrays;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ewq {
    public static final ewq b;
    public final HashMap a;

    static {
        ewq ewqVar = new ewq(new LinkedHashMap());
        o0c.N(ewqVar);
        b = ewqVar;
    }

    public ewq(ewq ewqVar) {
        this.a = new HashMap(ewqVar.a);
    }

    public final boolean a(String str) {
        Object obj = Boolean.FALSE;
        Object obj2 = this.a.get(str);
        if (obj2 instanceof Boolean) {
            obj = obj2;
        }
        return ((Boolean) obj).booleanValue();
    }

    public final long b(String str, long j) {
        Object objValueOf = Long.valueOf(j);
        Object obj = this.a.get(str);
        if (obj instanceof Long) {
            objValueOf = obj;
        }
        return ((Number) objValueOf).longValue();
    }

    public final String c(String str) {
        Object obj = this.a.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final String[] d(String str) {
        Object obj = this.a.get(str);
        if (!(obj instanceof Object[])) {
            return null;
        }
        int length = ((Object[]) obj).length;
        p5 p5Var = new p5(obj);
        String[] strArr = new String[length];
        for (int i = 0; i < length; i++) {
            strArr[i] = p5Var.invoke(Integer.valueOf(i));
        }
        return strArr;
    }

    public final boolean e(String str) {
        Object obj = this.a.get(str);
        return obj != null && String.class.isAssignableFrom(obj.getClass());
    }

    /* JADX WARN: Code duplicated, block: B:25:0x0059  */
    public final boolean equals(Object obj) {
        boolean zEquals;
        if (this != obj) {
            if (obj != null && ewq.class.equals(obj.getClass())) {
                HashMap map = ((ewq) obj).a;
                HashMap map2 = this.a;
                Set<String> setKeySet = map2.keySet();
                if (u890.j(setKeySet, map.keySet())) {
                    for (String str : setKeySet) {
                        Object obj2 = map2.get(str);
                        Object obj3 = map.get(str);
                        if (obj2 == null || obj3 == null) {
                            zEquals = obj2 == obj3;
                        } else if (obj2 instanceof Object[]) {
                            Object[] objArr = (Object[]) obj2;
                            if (obj3 instanceof Object[]) {
                                zEquals = f46.N(objArr, (Object[]) obj3);
                            } else {
                                zEquals = obj2.equals(obj3);
                            }
                        } else {
                            zEquals = obj2.equals(obj3);
                        }
                        if (!zEquals) {
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int iHashCode = 0;
        for (Map.Entry entry : this.a.entrySet()) {
            Object value = entry.getValue();
            iHashCode += value instanceof Object[] ? Objects.hashCode(entry.getKey()) ^ Arrays.deepHashCode((Object[]) value) : entry.hashCode();
        }
        return iHashCode * 31;
    }

    public final String toString() {
        return l1d.n(o7h.y0(this.a.entrySet(), (CharSequence) null, (String) null, (String) null, new u1c((byte) 14), 31), "}", new StringBuilder("Data {"));
    }

    public ewq(LinkedHashMap linkedHashMap) {
        this.a = new HashMap(linkedHashMap);
    }
}
