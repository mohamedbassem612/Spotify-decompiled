package p;

import android.os.Bundle;
import com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity;
import java.util.Collections;
import java.util.concurrent.CancellationException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class k4a1 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ SocialListeningInfoDialogActivity b;
    public final /* synthetic */ u3u c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ k4a1(SocialListeningInfoDialogActivity socialListeningInfoDialogActivity, u3u u3uVar, byte b) {
        super(0);
        this.a = b;
        this.b = socialListeningInfoDialogActivity;
        this.c = u3uVar;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.app.Activity, com.spotify.jam.features.dialogs.impl.SocialListeningInfoDialogActivity] */
    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        b7x b7xVar = b7x.a;
        switch (b) {
            case 0:
                ?? r1 = this.b;
                g2z g2zVar = r1.f1;
                if (g2zVar == null) {
                    u890.C("logger");
                    throw null;
                }
                String str = ((q3u) this.c).a;
                i8h1 i8h1Var = (i8h1) g2zVar.a;
                x6h1 x6h1VarC = ((pdl0) g2zVar.f).b.c();
                x6h1VarC.i.add(new a7h1("premium_only_dialog", (String) null, (Integer) null, str, (String) null));
                x6h1VarC.j = true;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("got_it_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                tv80 tv80VarM = i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_hide", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                lzn0 lzn0Var = r1.g1;
                if (lzn0Var == null) {
                    u890.C("navigator");
                    throw null;
                }
                lzn0Var.a(nik1.b2.a, tv80VarM, (Bundle) null);
                r1.finish();
                return rih1Var;
            default:
                SocialListeningInfoDialogActivity socialListeningInfoDialogActivity = this.b;
                g2z g2zVar2 = socialListeningInfoDialogActivity.f1;
                if (g2zVar2 == null) {
                    u890.C("logger");
                    throw null;
                }
                u3u u3uVar = this.c;
                String str2 = ((t3u) u3uVar).a;
                i8h1 i8h1Var2 = (i8h1) g2zVar2.a;
                x6h1 x6h1VarC3 = ((pdl0) g2zVar2.f).b.c();
                x6h1VarC3.i.add(new a7h1("start_jam_dialog", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = true;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("start_jam_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                ou80 ou80Var = i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null).a;
                xab1 xab1Var = socialListeningInfoDialogActivity.i1;
                if (xab1Var != null) {
                    xab1Var.d((CancellationException) null);
                }
                socialListeningInfoDialogActivity.i1 = fn31.T(cto1.q(socialListeningInfoDialogActivity), (o8n) null, 0, new p651(socialListeningInfoDialogActivity, ou80Var, u3uVar, (lnm) null, (byte) 18), 3);
                return rih1Var;
        }
    }
}
