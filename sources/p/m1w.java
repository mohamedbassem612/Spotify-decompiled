package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class m1w implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;
    public final /* synthetic */ a2w c;

    public /* synthetic */ m1w(Consumer consumer, a2w a2wVar, byte b) {
        this.a = b;
        this.b = consumer;
        this.c = a2wVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        a2w a2wVar = this.c;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(i0w.a);
                r0w r0wVar = a2wVar.e;
                i8h1 i8h1Var = r0wVar.a;
                x6h1 x6h1VarC = r0wVar.b.b.c();
                x6h1VarC.i.add(new a7h1("toolbar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("savebutton", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                String str = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
            default:
                consumer.accept(d0w.a);
                r0w r0wVar2 = a2wVar.e;
                i8h1 i8h1Var2 = r0wVar2.a;
                x6h1 x6h1VarC3 = r0wVar2.b.b.c();
                x6h1VarC3.i.add(new a7h1("user_image", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                String str2 = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_reveal", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a.a;
                break;
        }
    }
}
