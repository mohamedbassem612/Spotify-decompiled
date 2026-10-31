package p;

import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class zsm extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ btm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zsm(btm btmVar, byte b) {
        super(0);
        this.a = b;
        this.b = btmVar;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        btm btmVar = this.b;
        switch (b) {
            case 0:
                return new te1(d3p1.F(btmVar.d, btmVar.k, new mld(btmVar.c.c)), (byte) 23);
            case 1:
                etm etmVar = btmVar.c;
                String str = etmVar.c;
                String str2 = etmVar.d;
                String str3 = etmVar.e;
                Uri.Builder builderAppendQueryParameter = new Uri.Builder().encodedPath("spotify:internal:contribution-notes-management:edit").appendQueryParameter("context_uri", str).appendQueryParameter("item_uri", str2);
                if (str3 != null) {
                    builderAppendQueryParameter.appendQueryParameter("list_item_id", str3);
                }
                String string = builderAppendQueryParameter.build().toString();
                i8h1 i8h1Var = (i8h1) btmVar.i.get();
                l3l0 l3l0Var = (l3l0) btmVar.j.getValue();
                l3l0Var.getClass();
                x6h1 x6h1VarC = l3l0Var.a.c();
                x6h1VarC.i.add(new a7h1("edit_note_row", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                a1r0.m(btmVar.f, string, i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7x.a), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", string)), x6h1VarC.a(), r6h1.c, System.currentTimeMillis()), (xj61) null), (Bundle) null, 12);
                return rih1Var;
            case 2:
                kt91 kt91Var = btmVar.h;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131954560});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.o(new er91((fs91) null, "", 2131954560, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            default:
                etm etmVar2 = btmVar.c;
                return new l3l0(etmVar2.d, l1d.m("spotify:contribution:", etmVar2.b));
        }
    }
}
