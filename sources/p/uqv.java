package p;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class uqv extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 0;
    public final /* synthetic */ vqv b;
    public final /* synthetic */ iu30 c;
    public final /* synthetic */ u380 d;
    public final /* synthetic */ htv e;
    public final /* synthetic */ Function0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqv(vqv vqvVar, iu30 iu30Var, u380 u380Var, htv htvVar, Function0 function0) {
        super(0);
        this.b = vqvVar;
        this.c = iu30Var;
        this.d = u380Var;
        this.e = htvVar;
        this.f = function0;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Function0 function0 = this.f;
        htv htvVar = this.e;
        u380 u380Var = this.d;
        iu30 iu30Var = this.c;
        b7x b7xVar = b7x.a;
        vqv vqvVar = this.b;
        switch (b) {
            case 0:
                c380 c380Var = htvVar.l;
                ArrayList arrayList = new ArrayList();
                for (Object obj : c380Var) {
                    if (u380Var.contains(((ftv) obj).a)) {
                        arrayList.add(obj);
                    }
                }
                Set setP1 = o7h.p1(arrayList);
                jut jutVar = vqvVar.c;
                ftv ftvVar = (ftv) o7h.r0(setP1);
                String str = ftvVar != null ? ftvVar.b : null;
                i8h1 i8h1Var = (i8h1) jutVar.c;
                x6h1 x6h1VarC = ((txk0) jutVar.b).b.c();
                x6h1VarC.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC.j = false;
                x6h1 x6h1VarC2 = x6h1VarC.a().c();
                x6h1VarC2.i.add(new a7h1("remove_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC2.j = false;
                y6h1 y6h1VarA = x6h1VarC2.a();
                z7h1 z7h1Var = new z7h1("hit", 1, b7xVar);
                if (str == null) {
                    str = "";
                }
                i8h1Var.m(new w7h1("", "", z7h1Var, new x7h1("remove_entity_in_list", 1, Collections.singletonMap("entity_to_be_removed", str)), y6h1VarA, r6h1.c, System.currentTimeMillis()), (xj61) null);
                iu30Var.invoke(new zrv(setP1));
                function0.invoke();
                break;
            default:
                jut jutVar2 = vqvVar.c;
                i8h1 i8h1Var2 = (i8h1) jutVar2.c;
                x6h1 x6h1VarC3 = ((txk0) jutVar2.b).b.c();
                x6h1VarC3.i.add(new a7h1("bottom_bar", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC3.j = false;
                x6h1 x6h1VarC4 = x6h1VarC3.a().c();
                x6h1VarC4.i.add(new a7h1("move_to_top_button", (String) null, (Integer) null, (String) null, (String) null));
                x6h1VarC4.j = false;
                i8h1Var2.m(new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("sort", 1, b7xVar), x6h1VarC4.a(), r6h1.c, System.currentTimeMillis()), (xj61) null);
                ftv ftvVar2 = (ftv) o7h.s0(htvVar.l);
                iu30Var.invoke(new nsv(ftvVar2 != null ? ftvVar2.a : null, u380Var));
                function0.invoke();
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public uqv(htv htvVar, vqv vqvVar, iu30 iu30Var, Function0 function0, u380 u380Var) {
        super(0);
        this.e = htvVar;
        this.b = vqvVar;
        this.c = iu30Var;
        this.f = function0;
        this.d = u380Var;
    }
}
