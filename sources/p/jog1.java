package p;

import android.content.Context;
import java.nio.charset.Charset;
import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class jog1 {
    public static volatile jtq e;
    public final xqg a;
    public final xqg b;
    public final gns c;
    public final ywv0 d;

    public jog1(xqg xqgVar, xqg xqgVar2, gns gnsVar, ywv0 ywv0Var, cik1 cik1Var) {
        this.a = xqgVar;
        this.b = xqgVar2;
        this.c = gnsVar;
        this.d = ywv0Var;
        cik1Var.d();
    }

    public static jog1 a() {
        jtq jtqVar = e;
        if (jtqVar != null) {
            return (jog1) jtqVar.f.get();
        }
        eg.m("Not initialized!");
        return null;
    }

    public static void b(Context context) {
        if (e == null) {
            synchronized (jog1.class) {
                try {
                    if (e == null) {
                        dn3 dn3VarI = z1p1.i();
                        dn3VarI.k(context);
                        e = dn3VarI.b();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public final hog1 c(xhc xhcVar) {
        byte[] bytes;
        Set setUnmodifiableSet = xhcVar instanceof xhc ? Collections.unmodifiableSet(xhc.d) : Collections.singleton(new bbx("proto"));
        ix7 ix7VarA = s29.a();
        xhcVar.getClass();
        ix7VarA.s("cct");
        String str = xhcVar.a;
        String str2 = xhcVar.b;
        if (str2 == null && str == null) {
            bytes = null;
        } else {
            if (str2 == null) {
                str2 = "";
            }
            bytes = gvg.h("1$", str, "\\", str2).getBytes(Charset.forName("UTF-8"));
        }
        ix7VarA.u(bytes);
        return new hog1(setUnmodifiableSet, ix7VarA.j(), this);
    }
}
