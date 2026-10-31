package p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class qng0 extends LinkedHashMap {
    public static final qng0 b;
    public boolean a = true;

    static {
        qng0 qng0Var = new qng0();
        b = qng0Var;
        qng0Var.a = false;
    }

    public static int a(Map map) {
        int iB = 0;
        for (Map.Entry entry : map.entrySet()) {
            iB += b(entry.getValue()) ^ b(entry.getKey());
        }
        return iB;
    }

    public static int b(Object obj) {
        if (!(obj instanceof byte[])) {
            if (!(obj instanceof v190)) {
                return obj.hashCode();
            }
            k220.c();
            return 0;
        }
        byte[] bArr = (byte[]) obj;
        int length = bArr.length;
        Charset charset = l290.a;
        int i = length;
        for (byte b2 : bArr) {
            i = (i * 31) + b2;
        }
        if (i == 0) {
            return 1;
        }
        return i;
    }

    public static LinkedHashMap d(Map map) {
        LinkedHashMap linkedHashMap = new LinkedHashMap(((map.size() * 4) / 3) + 1);
        for (Map.Entry entry : map.entrySet()) {
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value instanceof byte[]) {
                byte[] bArr = (byte[]) value;
                value = Arrays.copyOf(bArr, bArr.length);
            }
            linkedHashMap.put(key, value);
        }
        return linkedHashMap;
    }

    public static boolean g(Map map, Map map2) {
        if (map == map2) {
            return true;
        }
        if (map.size() != map2.size()) {
            return false;
        }
        for (Map.Entry entry : map.entrySet()) {
            if (!map2.containsKey(entry.getKey())) {
                return false;
            }
            Object value = entry.getValue();
            Object obj = map2.get(entry.getKey());
            if (!(((value instanceof byte[]) && (obj instanceof byte[])) ? Arrays.equals((byte[]) value, (byte[]) obj) : value.equals(obj))) {
                return false;
            }
        }
        return true;
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void clear() {
        e();
        super.clear();
    }

    public final void e() {
        if (this.a) {
            return;
        }
        k220.c();
    }

    @Override // java.util.LinkedHashMap, java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Set entrySet() {
        return isEmpty() ? Collections.EMPTY_SET : super.entrySet();
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final boolean equals(Object obj) {
        return (obj instanceof Map) && g(this, (Map) obj);
    }

    public final qng0 h() {
        if (isEmpty()) {
            return new qng0();
        }
        qng0 qng0Var = new qng0(this);
        qng0Var.a = true;
        return qng0Var;
    }

    @Override // java.util.AbstractMap, java.util.Map
    public final int hashCode() {
        return a(this);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object put(Object obj, Object obj2) {
        e();
        Charset charset = l290.a;
        obj.getClass();
        obj2.getClass();
        return super.put(obj, obj2);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map map) {
        e();
        for (Object obj : map.keySet()) {
            Charset charset = l290.a;
            obj.getClass();
            map.get(obj).getClass();
        }
        super.putAll(map);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final Object remove(Object obj) {
        e();
        return super.remove(obj);
    }
}
