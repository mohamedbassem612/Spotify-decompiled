package p;

import android.view.View;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lpv implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ mpv b;

    public /* synthetic */ lpv(mpv mpvVar, byte b) {
        this.a = b;
        this.b = mpvVar;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        mpv mpvVar = this.b;
        switch (b) {
            case 0:
                opv opvVar = (opv) mpvVar.c2.getValue();
                String str = (String) mpvVar.Y1.getValue();
                String str2 = (String) mpvVar.Z1.getValue();
                x6h1 x6h1VarC = opvVar.b.b.c();
                x6h1VarC.i.add(new a7h1("save_options_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("replace_current_playlist_button", str, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str2 == null) {
                    str2 = "";
                }
                mpvVar.N0().e0().i0(mno1.h(new mmr0[]{oqn1.n("edit_option_selected_key", new hpv(opvVar.a.m(new w7h1("", "", z7h1Var, new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str2)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null)))}), "req_edit_option_fragment_key");
                mpvVar.dismiss();
                break;
            default:
                opv opvVar2 = (opv) mpvVar.c2.getValue();
                String str3 = (String) mpvVar.Y1.getValue();
                x6h1 x6h1VarC3 = opvVar2.b.b.c();
                x6h1VarC3.i.add(new a7h1("save_options_group", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("save_as_new_playlist_button", str3, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                mpvVar.N0().e0().i0(mno1.h(new mmr0[]{oqn1.n("edit_option_selected_key", new ipv(opvVar2.a.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("create_playlist", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null)))}), "req_edit_option_fragment_key");
                mpvVar.dismiss();
                break;
        }
    }
}
