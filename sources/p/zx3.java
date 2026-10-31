package p;

import android.os.Bundle;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class zx3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ i8h1 b;
    public final /* synthetic */ rrk0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zx3(i8h1 i8h1Var, rrk0 rrk0Var, byte b) {
        super(1);
        this.a = b;
        this.b = i8h1Var;
        this.c = rrk0Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        rrk0 rrk0Var = this.c;
        i8h1 i8h1Var = this.b;
        switch (b) {
            case 0:
                h8a h8aVar = (h8a) obj;
                String str = nik1.Y5.a;
                x6h1 x6h1VarC = rrk0Var.b.c();
                x6h1VarC.i.add(new a7h1("view_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                ((lzn0) h8aVar.b.get()).a(str, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str == null ? "" : str)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null);
                h8aVar.a.a();
                break;
            default:
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), rrk0Var.b, r6h1.c, System.currentTimeMillis()), (xj61) null);
                ((h8a) obj).a.a();
                break;
        }
        return rih1Var;
    }
}
