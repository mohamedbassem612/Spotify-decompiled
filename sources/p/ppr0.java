package p;

import java.lang.reflect.Method;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ppr0 extends fho1 {
    public final /* synthetic */ byte d;
    public final Method e;
    public final int f;
    public final boolean g;

    public /* synthetic */ ppr0(Method method, int i, boolean z, byte b) {
        this.d = b;
        this.e = method;
        this.f = i;
        this.g = z;
    }

    public final void l(un21 un21Var, Object obj) {
        byte b = this.d;
        boolean z = this.g;
        Method method = this.e;
        int i = this.f;
        switch (b) {
            case 0:
                Map map = (Map) obj;
                if (map == null) {
                    throw m5n1.O(method, i, "Field map was null.", new Object[0]);
                }
                for (Map.Entry entry : map.entrySet()) {
                    String str = (String) entry.getKey();
                    if (str == null) {
                        throw m5n1.O(method, i, "Field map contained null key.", new Object[0]);
                    }
                    Object value = entry.getValue();
                    if (value == null) {
                        throw m5n1.O(method, i, f4i1.f("Field map contained null value for key '", str, "'."), new Object[0]);
                    }
                    String string = value.toString();
                    if (string == null) {
                        throw m5n1.O(method, i, "Field map value '" + value + "' converted to null by " + rbc.class.getName() + " for key '" + str + "'.", new Object[0]);
                    }
                    be30 be30Var = un21Var.j;
                    if (z) {
                        be30Var.b(str, string);
                    } else {
                        be30Var.a(str, string);
                    }
                }
                return;
            case 1:
                Map map2 = (Map) obj;
                if (map2 == null) {
                    throw m5n1.O(method, i, "Header map was null.", new Object[0]);
                }
                for (Map.Entry entry2 : map2.entrySet()) {
                    String str2 = (String) entry2.getKey();
                    if (str2 == null) {
                        throw m5n1.O(method, i, "Header map contained null key.", new Object[0]);
                    }
                    Object value2 = entry2.getValue();
                    if (value2 == null) {
                        throw m5n1.O(method, i, f4i1.f("Header map contained null value for key '", str2, "'."), new Object[0]);
                    }
                    un21Var.a(str2, value2.toString(), z);
                }
                return;
            default:
                Map map3 = (Map) obj;
                if (map3 == null) {
                    throw m5n1.O(method, i, "Query map was null", new Object[0]);
                }
                for (Map.Entry entry3 : map3.entrySet()) {
                    String str3 = (String) entry3.getKey();
                    if (str3 == null) {
                        throw m5n1.O(method, i, "Query map contained null key.", new Object[0]);
                    }
                    Object value3 = entry3.getValue();
                    if (value3 == null) {
                        throw m5n1.O(method, i, f4i1.f("Query map contained null value for key '", str3, "'."), new Object[0]);
                    }
                    String string2 = value3.toString();
                    if (string2 == null) {
                        throw m5n1.O(method, i, "Query map value '" + value3 + "' converted to null by " + rbc.class.getName() + " for key '" + str3 + "'.", new Object[0]);
                    }
                    un21Var.b(str3, string2, z);
                }
                return;
        }
    }
}
