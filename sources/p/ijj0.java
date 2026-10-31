package p;

import android.content.Context;
import com.google.android.datatransport.cct.CctBackendFactory;
import java.util.HashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class ijj0 {
    public final j2e0 a;
    public final asn b;
    public final HashMap c;

    public ijj0(Context context, asn asnVar) {
        j2e0 j2e0Var = new j2e0(context);
        this.c = new HashMap();
        this.a = j2e0Var;
        this.b = asnVar;
    }

    public final synchronized fog1 a(String str) {
        if (this.c.containsKey(str)) {
            return (fog1) this.c.get(str);
        }
        CctBackendFactory cctBackendFactoryE = this.a.e(str);
        if (cctBackendFactoryE == null) {
            return null;
        }
        fog1 fog1VarCreate = cctBackendFactoryE.create(this.b.g(str));
        this.c.put(str, fog1VarCreate);
        return fog1VarCreate;
    }
}
