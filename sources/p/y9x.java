package p;

import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes6.dex */
public final class y9x extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ z9x b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ y9x(z9x z9xVar, byte b) {
        super(4);
        this.a = b;
        this.b = z9xVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        z9x z9xVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new lvk0(new uvk0(z9xVar.d));
            default:
                v9x v9xVar = (v9x) obj4;
                y6h1 y6h1Var = ((lvk0) obj).a;
                boolean zEquals = v9xVar.equals(t9x.a);
                b7x b7xVar = b7x.a;
                if (!zEquals) {
                    if (v9xVar.equals(u9x.a)) {
                        return new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), y6h1Var, r6h1.c, System.currentTimeMillis());
                    }
                    eg.o();
                    return null;
                }
                String str = (String) z9xVar.t.getValue();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                return new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1Var, r6h1.c, System.currentTimeMillis());
        }
    }
}
