package p;

import java.util.ArrayList;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class o3b1 {
    public byte a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;

    public static void b(o3b1 o3b1Var, String str, Object obj) {
        HashMap map = (HashMap) o3b1Var.d;
        String string = obj != null ? obj.toString() : null;
        if (string == null) {
            string = "";
        }
        map.put(str, string);
    }

    public t6h1 a() {
        String str = (String) this.b;
        gxo1.o(str, "action name");
        byte b = this.a;
        String str2 = (String) this.c;
        gxo1.o(str2, "interaction type");
        return new t6h1(str, b, str2, (HashMap) this.d, (ArrayList) this.e);
    }
}
