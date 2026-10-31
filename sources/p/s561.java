package p;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.concurrent.ConcurrentHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class s561 {
    public static final Charset e = Charset.forName("UTF-8");
    public final xk4 a;
    public final fo80 b;
    public final jmq c;
    public final ConcurrentHashMap d = new ConcurrentHashMap();

    public s561(xk4 xk4Var, fo80 fo80Var, jmq jmqVar) {
        this.a = xk4Var;
        this.b = fo80Var;
        this.c = jmqVar;
    }

    public final byte[] a(String str, String str2, String str3, String str4) {
        String strU = str != null ? b3o1.u(str) : null;
        int i = hu50.a;
        bmq0 bmq0VarM = fu50.a.M();
        String string = str2.toString();
        Charset charset = e;
        bmq0VarM.T(string.getBytes(charset));
        bmq0VarM.T(str3.toString().getBytes(charset));
        bmq0VarM.T(str4.toString().getBytes(charset));
        if (strU == null) {
            strU = "";
        }
        bmq0VarM.T(strU.toString().getBytes(charset));
        byte[] bArrA = bmq0VarM.C().a();
        String str5 = str == null ? "" : str;
        ConcurrentHashMap concurrentHashMap = this.d;
        if (!Arrays.equals(bArrA, (byte[]) concurrentHashMap.get(str5))) {
            if (str == null) {
                str = "";
            }
            concurrentHashMap.put(str, bArrA);
        }
        return bArrA;
    }
}
