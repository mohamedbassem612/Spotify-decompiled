package p;

import java.io.Serializable;
import java.util.Map;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public class i380 implements Serializable {
    public final Object[] a;
    public final Object[] b;

    public i380(j380 j380Var) {
        Object[] objArr = new Object[j380Var.size()];
        Object[] objArr2 = new Object[j380Var.size()];
        mjh1 mjh1VarK = j380Var.g().k();
        int i = 0;
        while (mjh1VarK.hasNext()) {
            Map.Entry entry = (Map.Entry) mjh1VarK.next();
            objArr[i] = entry.getKey();
            objArr2[i] = entry.getValue();
            i++;
        }
        this.a = objArr;
        this.b = objArr2;
    }

    public h380 a(int i) {
        return new h380(i);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object readResolve() {
        Object[] objArr = this.a;
        boolean z = objArr instanceof t380;
        Object[] objArr2 = this.b;
        if (!z) {
            h380 h380VarA = a(objArr.length);
            for (int i = 0; i < objArr.length; i++) {
                h380VarA.e(objArr[i], objArr2[i]);
            }
            return h380VarA.d();
        }
        t380 t380Var = (t380) objArr;
        h380 h380VarA2 = a(t380Var.size());
        mjh1 mjh1VarK = t380Var.k();
        mjh1 mjh1VarK2 = ((q280) objArr2).k();
        while (mjh1VarK.hasNext()) {
            h380VarA2.e(mjh1VarK.next(), mjh1VarK2.next());
        }
        return h380VarA2.d();
    }
}
