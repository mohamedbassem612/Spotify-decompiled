package p;

import android.content.Context;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.charset.Charset;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class sja1 {
    public final Context a;
    public final cxc b;
    public final yqg c;
    public final nfa0 d;
    public final q8n e;
    public final xgn0 f = ygn0.a();
    public final znb0 g = dm5.S(1, new qja1(this, 1));
    public final znb0 h = dm5.S(1, new qja1(this, 0));

    public sja1(Context context, cxc cxcVar, yqg yqgVar, nfa0 nfa0Var, q8n q8nVar) {
        this.a = context;
        this.b = cxcVar;
        this.c = yqgVar;
        this.d = nfa0Var;
        this.e = q8nVar;
    }

    public final void a(File file, String str) throws IOException {
        ne neVar = new ne((byte) 9);
        neVar.e0(str);
        ry21 ry21VarE = this.b.a(new ln21(neVar)).e();
        uz21 uz21Var = ry21VarE.g;
        if (!ry21VarE.Q0) {
            try {
                uz21Var.close();
            } catch (Throwable unused) {
            }
            eg.m(f4i1.c(ry21VarE.d, "Download failed: "));
            return;
        }
        InputStream inputStreamA = uz21Var.a();
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                o0c.w(inputStreamA, fileOutputStream);
                fileOutputStream.close();
                inputStreamA.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            try {
                throw th3;
            } catch (Throwable th4) {
                u890.p(inputStreamA, th3);
                throw th4;
            }
        }
    }

    public final void b() {
        znb0 znb0Var;
        Map map = d().a;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        for (Map.Entry entry : map.entrySet()) {
            if (e((iqc) entry.getValue())) {
                linkedHashMap.put(entry.getKey(), entry.getValue());
            }
        }
        Iterator it = o7h.l1(linkedHashMap.keySet()).iterator();
        while (true) {
            boolean zHasNext = it.hasNext();
            znb0Var = this.h;
            if (!zHasNext) {
                break;
            }
            String str = (String) it.next();
            d().a.remove(str);
            new File((File) znb0Var.getValue(), str).delete();
        }
        Iterator it2 = d().a.values().iterator();
        long j = 0;
        while (it2.hasNext()) {
            j += ((iqc) it2.next()).a;
        }
        if (j > 52428800) {
            for (Map.Entry entry2 : o7h.a1(d().a.entrySet(), new be21((byte) 14))) {
                String str2 = (String) entry2.getKey();
                iqc iqcVar = (iqc) entry2.getValue();
                if (j <= 52428800) {
                    return;
                }
                d().a.remove(str2);
                new File((File) znb0Var.getValue(), str2).delete();
                j -= iqcVar.a;
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(String str, onm onmVar) {
        rja1 rja1Var;
        if (onmVar instanceof rja1) {
            rja1Var = (rja1) onmVar;
            int i = rja1Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                rja1Var.c = i - Integer.MIN_VALUE;
            } else {
                rja1Var = new rja1(this, onmVar);
            }
        } else {
            rja1Var = new rja1(this, onmVar);
        }
        Object objY = rja1Var.a;
        int i2 = rja1Var.c;
        if (i2 == 0) {
            hm5.M(objY);
            sh6 sh6Var = new sh6(this, str, (lnm) null, (byte) 10);
            rja1Var.c = 1;
            objY = fn31.Y(this.e, sh6Var, rja1Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objY);
        }
        return ((e331) objY).a;
    }

    public final zrc d() {
        return (zrc) this.g.getValue();
    }

    public final boolean e(iqc iqcVar) {
        return this.c.b() - iqcVar.b > 1728000000;
    }

    public final void f() {
        try {
            File file = new File((File) this.h.getValue(), "metadata.json");
            String strB = this.d.b(zrc.Companion.serializer(), d());
            Charset charset = nne.a;
            FileOutputStream fileOutputStream = new FileOutputStream(file);
            try {
                y520.K(fileOutputStream, strB, charset);
                fileOutputStream.close();
            } catch (Throwable th) {
                try {
                    throw th;
                } catch (Throwable th2) {
                    u890.p(fileOutputStream, th);
                    throw th2;
                }
            }
        } catch (Throwable unused) {
        }
    }
}
