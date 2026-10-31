package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class utv extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kp5 b;
    public final /* synthetic */ iu30 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ utv(kp5 kp5Var, iu30 iu30Var, byte b) {
        super(0);
        this.a = b;
        this.b = kp5Var;
        this.c = iu30Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        kp5 kp5Var = this.b;
        switch (b) {
            case 0:
                zeu zeuVar = (zeu) kp5Var.b;
                i8h1 i8h1Var = (i8h1) zeuVar.a;
                x6h1 x6h1VarC = ((txk0) zeuVar.c).b.c();
                x6h1VarC.i.add(new a7h1("privacy_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("make_playlist_public", 1, Collections.singletonMap("playlist_to_be_made_public", (String) zeuVar.b)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(uuv.a);
                break;
            case 1:
                zeu zeuVar2 = (zeu) kp5Var.b;
                i8h1 i8h1Var2 = (i8h1) zeuVar2.a;
                x6h1 x6h1VarC2 = ((txk0) zeuVar2.c).b.c();
                x6h1VarC2.i.add(new a7h1("privacy_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(tuv.a);
                break;
            case 2:
                zeu zeuVar3 = (zeu) kp5Var.b;
                i8h1 i8h1Var3 = (i8h1) zeuVar3.a;
                x6h1 x6h1VarC3 = ((txk0) zeuVar3.c).b.c();
                x6h1VarC3.i.add(new a7h1("delete_playlist_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(puv.a);
                break;
            default:
                zeu zeuVar4 = (zeu) kp5Var.b;
                i8h1 i8h1Var4 = (i8h1) zeuVar4.a;
                x6h1 x6h1VarC4 = ((txk0) zeuVar4.c).b.c();
                x6h1VarC4.i.add(new a7h1("navigation_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                x6h1 x6h1VarC5 = x6h1VarC4.a().c();
                x6h1VarC5.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC5.j = false;
                i8h1Var4.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC5.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(avv.a);
                break;
        }
        return rih1Var;
    }
}
