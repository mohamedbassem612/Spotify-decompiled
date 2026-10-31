package p;

import java.util.Collections;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class e5f extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ f5f b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ e5f(f5f f5fVar, byte b) {
        super(4);
        this.a = b;
        this.b = f5fVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        w7h1 w7h1Var;
        byte b = this.a;
        f5f f5fVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                return new uvk0(f5fVar.c);
            default:
                d5f d5fVar = (d5f) obj2;
                z4f z4fVar = (z4f) obj4;
                y6h1 y6h1Var = ((uvk0) obj).a;
                boolean z = d5fVar instanceof b5f;
                x4f x4fVar = x4f.a;
                b7x b7xVar = b7x.a;
                if (z) {
                    if (!(z4fVar instanceof y4f)) {
                        if (z4fVar.equals(x4fVar)) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC.j = false;
                    x6h1 x6h1VarC2 = x6h1VarC.a().c();
                    x6h1VarC2.i.add(new a7h1("go_to_profile_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    y6h1 y6h1VarA = x6h1VarC2.a();
                    String str = ((b5f) d5fVar).a.e;
                    z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                    if (str == null) {
                        str = "";
                    }
                    w7h1Var = new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis());
                } else {
                    if (!(d5fVar instanceof c5f)) {
                        if (d5fVar instanceof a5f) {
                            return null;
                        }
                        eg.o();
                        return null;
                    }
                    if (z4fVar instanceof y4f) {
                        return null;
                    }
                    if (!z4fVar.equals(x4fVar)) {
                        eg.o();
                        return null;
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("header", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                    x6h1VarC4.i.add(new a7h1("faces_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    y6h1 y6h1VarA2 = x6h1VarC4.a();
                    String str2 = f5fVar.b;
                    Set set = pcf.a;
                    w7h1Var = new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", "spotify:chat-details:".concat(str2))), y6h1VarA2, r6h1.c, System.currentTimeMillis());
                }
                return w7h1Var;
        }
    }
}
