package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class znu extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ iu30 b;
    public final /* synthetic */ zeu c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ znu(iu30 iu30Var, zeu zeuVar, byte b) {
        super(0);
        this.a = b;
        this.b = iu30Var;
        this.c = zeuVar;
    }

    public final Object invoke() {
        String str;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.b;
        b7x b7xVar = b7x.a;
        zeu zeuVar = this.c;
        switch (b) {
            case 0:
                w6b1 w6b1VarA = f7b1.a(blc0.d1);
                String str2 = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                str = str2 != null ? str2 : "";
                x6h1 x6h1VarC = ((rrk0) zeuVar.c).b.c();
                x6h1VarC.i.add(new a7h1("jump_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                iu30Var.invoke(new bt81(((i8h1) zeuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a));
                break;
            default:
                w6b1 w6b1VarA2 = f7b1.a(blc0.d1);
                String str3 = w6b1VarA2 != null ? (String) o7h.s0(w6b1VarA2.c) : null;
                str = str3 != null ? str3 : "";
                x6h1 x6h1VarC2 = ((rrk0) zeuVar.c).b.c();
                x6h1VarC2.i.add(new a7h1("mic_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                ((i8h1) zeuVar.b).m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(ct81.a);
                break;
        }
        return rih1Var;
    }
}
