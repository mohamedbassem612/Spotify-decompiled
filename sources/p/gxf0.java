package p;

import android.view.View;
import android.widget.ViewAnimator;
import com.spotify.mobius.functions.Consumer;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class gxf0 implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ hxf0 b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ gxf0(hxf0 hxf0Var, Consumer consumer, byte b) {
        this.a = b;
        this.b = hxf0Var;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        tv80 tv80VarJ;
        byte b = this.a;
        Consumer consumer = this.c;
        hxf0 hxf0Var = this.b;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                hxf0Var.b.a(new tp80(2, 3, 2));
                qhe0 qhe0Var = hxf0Var.e;
                ydl0 ydl0Var = hxf0Var.f;
                ydl0Var.getClass();
                x6h1 x6h1VarC = ydl0Var.a.c();
                x6h1VarC.i.add(new a7h1("magiclink_send_request_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.wa);
                String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                nyn1.Q(hxf0Var.h, new lsn0((String) null, qhe0Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str != null ? str : "")), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                consumer.accept(vn21.a);
                break;
            case 1:
                hxf0Var.b.a(new tp80(3, 2, 2));
                qhe0 qhe0Var2 = hxf0Var.e;
                udl0 udl0Var = hxf0Var.g;
                udl0Var.getClass();
                x6h1 x6h1VarC2 = udl0Var.a.c();
                x6h1VarC2.i.add(new a7h1("open_email_app_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                nyn1.Q(hxf0Var.h, new lsn0((String) null, qhe0Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("navigate_to_external_uri", 1, Collections.singletonMap("destination", "")), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis())).a));
                consumer.accept(ty40.a);
                break;
            default:
                nxf0 nxf0Var = hxf0Var.b;
                ViewAnimator viewAnimator = hxf0Var.t;
                nxf0Var.a(new tp80(viewAnimator.getDisplayedChild() == 0 ? 2 : 3, 1, 2));
                int displayedChild = viewAnimator.getDisplayedChild();
                qhe0 qhe0Var3 = hxf0Var.e;
                if (displayedChild == 0) {
                    ydl0 ydl0Var2 = hxf0Var.f;
                    ydl0Var2.getClass();
                    x6h1 x6h1VarC3 = ydl0Var2.a.c();
                    x6h1VarC3.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    tv80VarJ = qhe0Var3.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis()));
                } else {
                    udl0 udl0Var2 = hxf0Var.g;
                    udl0Var2.getClass();
                    x6h1 x6h1VarC4 = udl0Var2.a.c();
                    x6h1VarC4.i.add(new a7h1("back_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC4.j = false;
                    tv80VarJ = qhe0Var3.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate_back", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()));
                }
                nyn1.Q(hxf0Var.h, new yrn0(tv80VarJ.a));
                consumer.accept(fu9.a);
                break;
        }
    }
}
