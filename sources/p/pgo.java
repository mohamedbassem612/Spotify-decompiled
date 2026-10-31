package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class pgo extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ w0d b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ pgo(w0d w0dVar, byte b) {
        super(1);
        this.a = b;
        this.b = w0dVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        w0d w0dVar = this.b;
        switch (b) {
            case 0:
                v2l0 v2l0Var = (v2l0) obj;
                boolean z = w0dVar.a;
                String str = (String) w0dVar.f;
                if (z) {
                    return v2l0Var.e(str);
                }
                z7h1 z7h1Var = new z7h1("hit", 1, b7x.a);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), v2l0Var.a, r6h1.c, System.currentTimeMillis());
            default:
                fn31.T(cto1.q((dg30) w0dVar.c), (o8n) null, 0, new hff(w0dVar, (tv80) obj, (lnm) null, (byte) 29), 3);
                return rih1.a;
        }
    }
}
