package p;

import com.spotify.player.model.Context$Metadata;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class cq80 implements dkl {
    public final /* synthetic */ byte a;
    public final /* synthetic */ dq80 b;

    public /* synthetic */ cq80(dq80 dq80Var, byte b) {
        this.a = b;
        this.b = dq80Var;
    }

    public final void accept(Object obj) {
        byte b = this.a;
        b7x b7xVar = b7x.a;
        dq80 dq80Var = this.b;
        switch (b) {
            case 0:
                dq80Var.a.a(new mhv0("sign_up_email", "next", ew80.c, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                i8h1 i8h1Var = dq80Var.c;
                x6h1 x6h1VarC = dq80Var.l.b.c();
                x6h1VarC.i.add(new a7h1("next_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                y6h1 y6h1VarA = x6h1VarC.a();
                w6b1 w6b1VarA = f7b1.a(blc0.nh);
                String str = w6b1VarA != null ? (String) o7h.s0(w6b1VarA.c) : null;
                if (str == null) {
                    str = "";
                }
                nyn1.Q(dq80Var.d, new lsn0((String) null, i8h1Var.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_navigate", 1, Collections.singletonMap("destination", str)), y6h1VarA, r6h1.c, System.currentTimeMillis())).a));
                break;
            case 1:
                if (!dq80Var.f) {
                    dq80Var.f = true;
                    i8h1 i8h1Var2 = dq80Var.c;
                    x6h1 x6h1VarC2 = dq80Var.l.b.c();
                    x6h1VarC2.i.add(new a7h1("email_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC2.j = false;
                    i8h1Var2.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("focus_input_field", 1, b7xVar), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()));
                }
                break;
            default:
                ew80 ew80Var = ew80.c;
                ohv0 ohv0Var = dq80Var.a;
                hd40 hd40Var = ((zc40) obj).a;
                if (hd40Var.equals(ad40.a)) {
                    ohv0Var.a(new mhv0("sign_up_gender", "female", ew80Var, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                } else if (hd40Var.equals(bd40.a)) {
                    ohv0Var.a(new mhv0("sign_up_gender", "male", ew80Var, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                } else if (hd40Var.equals(cd40.a)) {
                    ohv0Var.a(new mhv0("sign_up_gender", "none_binary", ew80Var, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                } else if (hd40Var.equals(ed40.a)) {
                    ohv0Var.a(new mhv0("sign_up_gender", "other", ew80Var, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                } else if (hd40Var.equals(gd40.a)) {
                    ohv0Var.a(new mhv0("sign_up_gender", "prefer_not_to_say", ew80Var, Context$Metadata.SHUFFLE_ALGORITHM_NONE));
                }
                if (!hd40Var.equals(dd40.a)) {
                    i8h1 i8h1Var3 = dq80Var.c;
                    x6h1 x6h1VarC3 = dq80Var.o.b.c();
                    x6h1VarC3.i.add(new a7h1("gender_option", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC3.j = false;
                    nyn1.Q(dq80Var.d, new lsn0((String) null, i8h1Var3.j(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC3.a(), r6h1.c, System.currentTimeMillis())).a));
                }
                break;
        }
    }
}
