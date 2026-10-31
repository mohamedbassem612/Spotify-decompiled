package p;

import android.view.View;
import android.widget.EditText;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class fmi0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ spk b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ fmi0(spk spkVar, Consumer consumer, byte b) {
        this.a = b;
        this.b = spkVar;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        Consumer consumer = this.c;
        b7x b7xVar = b7x.a;
        spk spkVar = this.b;
        switch (b) {
            case 0:
                yge0 yge0Var = (yge0) spkVar.c;
                String str = ((lik1) spkVar.d).a;
                i8h1 i8h1Var = (i8h1) yge0Var.b;
                ksk0 ksk0Var = (ksk0) yge0Var.c;
                x6h1 x6h1VarC = ksk0Var.c.c();
                x6h1VarC.i.add(new a7h1("save_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), x6h1VarC.a(), ksk0Var.b, System.currentTimeMillis()), (xj61) null);
                consumer.accept(new wli0(((EditText) ((wmy) spkVar.g).b).getText().toString()));
                break;
            default:
                yge0 yge0Var2 = (yge0) spkVar.c;
                i8h1 i8h1Var2 = (i8h1) yge0Var2.b;
                ksk0 ksk0Var2 = (ksk0) yge0Var2.c;
                x6h1 x6h1VarC2 = ksk0Var2.c.c();
                x6h1VarC2.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC2.a(), ksk0Var2.b, System.currentTimeMillis()), (xj61) null);
                consumer.accept(sli0.a);
                break;
        }
    }
}
