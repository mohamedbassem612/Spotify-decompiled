package p;

import java.util.Collections;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class w3u extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ y3u b;
    public final /* synthetic */ String c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w3u(y3u y3uVar, String str, byte b) {
        super(0);
        this.a = b;
        this.b = y3uVar;
        this.c = str;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        String str = this.c;
        y3u y3uVar = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = y3uVar.b;
                vzl0 vzl0Var = y3uVar.c;
                vzl0Var.getClass();
                x6h1 x6h1VarC = vzl0Var.a.c();
                x6h1VarC.i.add(new a7h1("login_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.va);
                String str2 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                if (str2 == null) {
                    str2 = "";
                }
                nyn1.Q(y3uVar.e, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                t8h1 t8h1Var = y3uVar.d;
                AtomicReferenceArray atomicReferenceArray = p6r0.e;
                t8h1.n(t8h1Var, yon1.m5());
                y3uVar.f.onNext(new aq81(str));
                break;
            case 1:
                y3uVar.a(str);
                break;
            default:
                y3uVar.a(str);
                break;
        }
        return rih1Var;
    }
}
