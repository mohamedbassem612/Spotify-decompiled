package p;

import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class ogo0 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ pgo0 b;
    public final /* synthetic */ tbr0 c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ogo0(pgo0 pgo0Var, tbr0 tbr0Var, byte b) {
        super(0);
        this.a = b;
        this.b = pgo0Var;
        this.c = tbr0Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        tbr0 tbr0Var = this.c;
        b7x b7xVar = b7x.a;
        pgo0 pgo0Var = this.b;
        switch (b) {
            case 0:
                i8h1 i8h1Var = pgo0Var.e;
                x6h1 x6h1VarC = pgo0Var.g.b.c();
                x6h1VarC.i.add(new a7h1("show_less_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                rgo0 rgo0Var = pgo0Var.b;
                String str = rgo0Var.b;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("dislike", 1, Collections.singletonMap("item_to_be_disliked", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                pgo0Var.c.a(rgo0Var.e, str, (String) null);
                kt91 kt91Var = pgo0Var.f;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956591});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131956591});
                kt91Var.o(new er91((fs91) null, "", 2131956591, (String) null, 2131959154, new hid0(pgo0Var, (byte) 7), (cvr) null, (xq91) null, false));
                tbr0Var.a(new y231(new wqr0(true)));
                break;
            default:
                i8h1 i8h1Var2 = pgo0Var.e;
                x6h1 x6h1VarC2 = pgo0Var.g.b.c();
                x6h1VarC2.i.add(new a7h1("undo_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA2 = x6h1VarC2.a();
                rgo0 rgo0Var2 = pgo0Var.b;
                String str2 = rgo0Var2.a;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_dislike", 1, Collections.singletonMap("item_no_longer_disliked", str2 != null ? str2 : "")), y6h1VarA2, r6h1.c, System.currentTimeMillis()), (xj61) null);
                pgo0Var.c.e(rgo0Var2.e, str2, rgo0Var2.g);
                tbr0Var.a(new y231(new wqr0(false)));
                break;
        }
        return rih1Var;
    }
}
