package p;

import android.content.DialogInterface;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class fu8 implements DialogInterface.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ gu8 b;
    public final /* synthetic */ String c;
    public final /* synthetic */ Function0 d;

    public /* synthetic */ fu8(gu8 gu8Var, String str, Function0 function0, byte b) {
        this.a = b;
        this.b = gu8Var;
        this.c = str;
        this.d = function0;
    }

    @Override // android.content.DialogInterface.OnClickListener
    public final void onClick(DialogInterface dialogInterface, int i) {
        byte b = this.a;
        Function0 function0 = this.d;
        b7x b7xVar = b7x.a;
        gu8 gu8Var = this.b;
        switch (b) {
            case 0:
                whh1 whh1Var = gu8Var.b;
                jtk0 jtk0Var = whh1Var.b;
                jtk0Var.getClass();
                x6h1 x6h1VarC = jtk0Var.b.c();
                String str = this.c;
                x6h1VarC.i.add(new a7h1("unfollow_dialog", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("unfollow_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                whh1Var.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("unfollow", 1, Collections.singletonMap("item_to_be_unfollowed", str)), x6h1VarC2.a(), jtk0Var.a, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
            default:
                whh1 whh1Var2 = gu8Var.b;
                jtk0 jtk0Var2 = whh1Var2.b;
                jtk0Var2.getClass();
                x6h1 x6h1VarC3 = jtk0Var2.b.c();
                x6h1VarC3.i.add(new a7h1("unfollow_dialog", (String) null, (Integer) null, this.c, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("cancel_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                whh1Var2.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC4.a(), jtk0Var2.a, System.currentTimeMillis()), (xj61) null);
                function0.invoke();
                break;
        }
    }
}
