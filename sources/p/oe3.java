package p;

import android.os.Bundle;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oe3 implements yt11 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    public /* synthetic */ oe3(Object obj, byte b) {
        this.a = b;
        this.b = obj;
    }

    public final Object a(unb1 unb1Var, tv80 tv80Var, onm onmVar) {
        String str;
        String str2;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.b;
        switch (b) {
            case 0:
                jmb1 jmb1Var = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var != null) {
                    String str3 = jmb1Var.a.a;
                    lzn0 lzn0Var = (lzn0) ((ajq0) obj).b;
                    if (tv80Var != null) {
                        lzn0Var.a(str3, tv80Var, (Bundle) null);
                    } else {
                        lzn0Var.h(str3);
                    }
                }
                return rih1Var;
            case 1:
                jmb1 jmb1Var2 = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var2 == null || (str = jmb1Var2.a.a) == null) {
                    return rih1Var;
                }
                yzu yzuVar = (yzu) obj;
                return fn31.Y((q8n) yzuVar.c, new piu(tv80Var, (Object) yzuVar, str, (lnm) null, (byte) 5), onmVar);
            default:
                jmb1 jmb1Var3 = unb1Var instanceof jmb1 ? (jmb1) unb1Var : null;
                if (jmb1Var3 == null || (str2 = jmb1Var3.a.a) == null) {
                    return rih1Var;
                }
                yzu yzuVar2 = (yzu) obj;
                return fn31.Y((q8n) yzuVar2.c, new piu(tv80Var, (Object) yzuVar2, str2, (lnm) null, (byte) 6), onmVar);
        }
    }

    public final s9d1 b() {
        switch (this.a) {
        }
        return null;
    }
}
