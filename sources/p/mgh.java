package p;

import android.view.View;
import com.spotify.mobius.functions.Consumer;
import com.spotify.userinteractivityservice.usercomments.v1.proto.Comment;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class mgh implements View.OnClickListener {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ogh b;
    public final /* synthetic */ Consumer c;

    public /* synthetic */ mgh(ogh oghVar, Consumer consumer, byte b) {
        this.a = b;
        this.b = oghVar;
        this.c = consumer;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String strR;
        Comment comment;
        byte b = this.a;
        Consumer consumer = this.c;
        b7x b7xVar = b7x.a;
        ogh oghVar = this.b;
        switch (b) {
            case 0:
                jgh jghVar = oghVar.e;
                bpb1 bpb1Var = oghVar.g;
                rph rphVar = (rph) bpb1Var.getValue();
                if (rphVar != null) {
                    rph rphVar2 = (rph) bpb1Var.getValue();
                    Comment comment2 = rphVar2 != null ? rphVar2.f12p : null;
                    cce cceVar = oghVar.f;
                    int i = 4;
                    if (comment2 != null) {
                        if (cceVar != null) {
                            int iC = oghVar.c(rphVar);
                            rph rphVar3 = (rph) bpb1Var.getValue();
                            if (rphVar3 == null || (comment = rphVar3.f12p) == null || (strR = comment.r()) == null) {
                                strR = "";
                            }
                            i8h1 i8h1Var = (i8h1) cceVar.b;
                            x6h1 x6h1VarC = ((gxk0) cceVar.d).a.c();
                            x6h1VarC.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                            x6h1VarC.j = false;
                            y6h1 y6h1VarA = x6h1VarC.a();
                            int iC2 = l1d.C(iC);
                            if (iC2 == 0) {
                                i = 1;
                            } else if (iC2 == 1) {
                                i = 2;
                            } else if (iC2 != 2) {
                                eg.o();
                            }
                            x6h1 x6h1VarC2 = y6h1VarA.c();
                            x6h1VarC2.i.add(new a7h1("post_comment_button", (String) null, (Integer) null, (String) null, ktk0.g(i)));
                            x6h1VarC2.j = false;
                            i8h1Var.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit_comment_reply", 1, Collections.singletonMap("comment_uri", strR)), x6h1VarC2.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                        }
                    } else if (cceVar != null) {
                        int iC3 = oghVar.c(rphVar);
                        i8h1 i8h1Var2 = (i8h1) cceVar.b;
                        x6h1 x6h1VarC3 = ((gxk0) cceVar.d).a.c();
                        x6h1VarC3.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = false;
                        y6h1 y6h1VarA2 = x6h1VarC3.a();
                        int iC4 = l1d.C(iC3);
                        if (iC4 == 0) {
                            i = 1;
                        } else if (iC4 == 1) {
                            i = 2;
                        } else if (iC4 != 2) {
                            eg.o();
                        }
                        x6h1 x6h1VarC4 = y6h1VarA2.c();
                        x6h1VarC4.i.add(new a7h1("post_comment_button", (String) null, (Integer) null, (String) null, ktk0.g(i)));
                        x6h1VarC4.j = false;
                        i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("submit_comment", 1, Collections.singletonMap("entity_id", (String) cceVar.c)), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                    }
                }
                consumer.accept(yoh.a);
                jghVar.d.getText().clear();
                o0c.C(jghVar.d);
                break;
            default:
                cce cceVar2 = oghVar.f;
                if (cceVar2 != null) {
                    i8h1 i8h1Var3 = (i8h1) cceVar2.b;
                    x6h1 x6h1VarC5 = ((gxk0) cceVar2.d).a.c();
                    x6h1VarC5.i.add(new a7h1("comment_input_field", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC5.j = false;
                    x6h1 x6h1VarC6 = x6h1VarC5.a().c();
                    x6h1VarC6.i.add(new a7h1("add_timestamp_button", (String) null, (Integer) null, (String) null, (String) null));
                    x6h1VarC6.j = false;
                    i8h1Var3.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("ui_select", 1, b7xVar), x6h1VarC6.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                }
                consumer.accept(new gph(oghVar.e.d.getSelectionStart()));
                break;
        }
    }
}
