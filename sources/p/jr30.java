package p;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CancellationException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class jr30 {
    public final ku71 a;
    public final p731 b;
    public final yqg c;
    public fr30 d;
    public xab1 e;
    public xab1 f;

    public jr30(ku71 ku71Var, p731 p731Var, yqg yqgVar) {
        this.a = ku71Var;
        this.b = p731Var;
        this.c = yqgVar;
    }

    public static void f(ku71 ku71Var, String str, long j, long j2) {
        bpb1 bpb1Var = ku71Var.c;
        LinkedHashMap linkedHashMap = new LinkedHashMap((Map) bpb1Var.getValue());
        linkedHashMap.put(str, new gu71(j, j2));
        bpb1Var.m((Object) null, linkedHashMap);
        ku71Var.b();
    }

    public final Long a(String str) {
        p731 p731Var = this.b;
        Long lValueOf = p731Var != null ? Long.valueOf(p731Var.d(str)) : null;
        return (lValueOf == null || lValueOf.longValue() <= 0) ? this.a.a(str) : lValueOf;
    }

    public final boolean b(String str) {
        bpb1 bpb1VarA;
        o731 o731Var;
        Map map;
        p731 p731Var = this.b;
        return (p731Var == null || (bpb1VarA = p731Var.a()) == null || (o731Var = (o731) bpb1VarA.getValue()) == null || (map = o731Var.d) == null || !((Boolean) map.getOrDefault(str, Boolean.FALSE)).booleanValue()) ? false : true;
    }

    public final void c(String str, r091 r091Var, c9n c9nVar) {
        if (this.f == null && ebp1.r(r091Var) && smo1.u(c9nVar)) {
            this.f = fn31.T(c9nVar, (o8n) null, 0, new f530(r091Var, this, str, (lnm) null, (byte) 4), 3);
        }
    }

    public final void d() {
        xab1 xab1Var = this.f;
        if (xab1Var != null) {
            xab1Var.d((CancellationException) null);
        }
        xab1 xab1Var2 = this.e;
        if (xab1Var2 != null) {
            xab1Var2.d((CancellationException) null);
        }
        this.f = null;
        this.e = null;
    }

    public final void e() {
        d();
        fr30 fr30Var = this.d;
        boolean z = fr30Var instanceof er30;
        yqg yqgVar = this.c;
        if (z) {
            er30 er30Var = (er30) fr30Var;
            String str = er30Var.a;
            if (b(str)) {
                return;
            }
            long jB = yqgVar.b();
            long j = jB - er30Var.c;
            if (j < 0) {
                j = 0;
            }
            f(this.a, str, er30Var.b + j, jB);
            return;
        }
        if (fr30Var instanceof dr30) {
            dr30 dr30Var = (dr30) fr30Var;
            String str2 = dr30Var.a;
            if (b(str2)) {
                return;
            }
            f(this.a, str2, dr30Var.b, yqgVar.b());
            return;
        }
        if (fr30Var instanceof cr30) {
            String str3 = ((cr30) fr30Var).a;
            ku71 ku71Var = this.a;
            bpb1 bpb1Var = ku71Var.c;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) bpb1Var.getValue());
            linkedHashMap.remove(str3);
            bpb1Var.m((Object) null, linkedHashMap);
            ku71Var.b();
        }
    }
}
