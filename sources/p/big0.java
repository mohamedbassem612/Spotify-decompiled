package p;

import android.net.Uri;
import java.io.ByteArrayInputStream;
import java.io.IOException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class big0 {
    public final vrv0 a;
    public final a8o0 b;
    public final rma c;

    public big0(vrv0 vrv0Var, a8o0 a8o0Var, rma rmaVar) {
        this.a = vrv0Var;
        this.b = a8o0Var;
        this.c = rmaVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(String str, onm onmVar) throws IOException {
        aig0 aig0Var;
        String str2;
        if (onmVar instanceof aig0) {
            aig0Var = (aig0) onmVar;
            int i = aig0Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                aig0Var.d = i - Integer.MIN_VALUE;
            } else {
                aig0Var = new aig0(this, onmVar);
            }
        } else {
            aig0Var = new aig0(this, onmVar);
        }
        Object obj = aig0Var.b;
        int i2 = aig0Var.d;
        if (i2 == 0) {
            hm5.M(obj);
            String strW = nhc1.W(nhc1.W(this.c.a().a.b, "{type}", "json"), "{source_id}", str);
            aig0Var.a = strW;
            aig0Var.d = 1;
            a8o0 a8o0Var = this.b;
            Object objY = fn31.Y(a8o0Var.a, new hyg0(a8o0Var, str, (lnm) null, (byte) 22), aig0Var);
            d9n d9nVar = d9n.a;
            if (objY == d9nVar) {
                return d9nVar;
            }
            obj = objY;
            str2 = strW;
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            str2 = aig0Var.a;
            hm5.M(obj);
        }
        byte[] bArr = (byte[]) obj;
        if (bArr == null) {
            return null;
        }
        ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
        try {
            vrv0 vrv0Var = this.a;
            Uri.parse(str2);
            d5b1 d5b1VarI = vrv0Var.i(byteArrayInputStream);
            byteArrayInputStream.close();
            return d5b1VarI;
        } catch (Throwable th) {
            try {
                throw th;
            } catch (Throwable th2) {
                u890.p(byteArrayInputStream, th);
                throw th2;
            }
        }
    }
}
