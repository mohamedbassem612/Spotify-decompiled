package p;

import com.spotify.campaigns.wrapped.content.impl.events.proto.WrappedLiveCounterShown;
import com.spotify.wrapped.v1.proto.StoryCard;
import java.util.Collections;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z990 extends hab0 implements Function0 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;
    public final /* synthetic */ Object i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z990(boolean z, qam1 qam1Var, c08 c08Var, Function0 function0, String str, d08 d08Var, boolean z2, hp80 hp80Var) {
        super(0);
        this.b = z;
        this.d = qam1Var;
        this.e = c08Var;
        this.f = function0;
        this.g = str;
        this.h = d08Var;
        this.c = z2;
        this.i = hp80Var;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.f;
        boolean z = true;
        Object obj2 = this.i;
        boolean z2 = this.c;
        Object obj3 = this.h;
        Object obj4 = this.g;
        Object obj5 = this.e;
        Object obj6 = this.d;
        boolean z3 = this.b;
        switch (b) {
            case 0:
                hrr0 hrr0Var = (hrr0) obj6;
                if (!z3 || (z2 && !((Boolean) hrr0Var.getValue()).booleanValue())) {
                    z = false;
                }
                cpr cprVar = (cpr) ((oe6) obj).h;
                String id = ((StoryCard) obj4).getId();
                qan qanVar = (qan) obj3;
                long j = qanVar != null ? qanVar.a : 0L;
                long j2 = qanVar != null ? qanVar.b : 0L;
                int i = qanVar != null ? qanVar.c : 0;
                long jS = z ? ((frr0) obj2).s() : 0L;
                t2j0 t2j0Var = cprVar.a;
                ybm1 ybm1VarN = WrappedLiveCounterShown.n();
                ybm1VarN.n(id);
                ybm1VarN.q(z3);
                ybm1VarN.r(z);
                ybm1VarN.v(j);
                ybm1VarN.u(j2);
                ybm1VarN.t(i);
                ybm1VarN.s(jS);
                t2j0Var.a(ybm1VarN.build());
                Boolean bool = Boolean.FALSE;
                hrr0Var.setValue(bool);
                ((hrr0) obj5).setValue(bool);
                break;
            default:
                if (z3) {
                    ((qam1) obj6).a(2);
                }
                c08 c08Var = (c08) obj5;
                a08 a08Var = c08Var instanceof a08 ? (a08) c08Var : null;
                if (a08Var != null) {
                    String str = a08Var.a;
                    String str2 = (String) obj4;
                    d08 d08Var = (d08) obj3;
                    hp80 hp80Var = (hp80) obj2;
                    if (str != null && str2 != null && d08Var != null) {
                        opl0 opl0VarA = d08Var.a(str2, hp80Var);
                        r6h1 r6h1Var = opl0VarA.b;
                        int iY = yto1.y(a08Var.b);
                        String str3 = a08Var.a;
                        x6h1 x6h1VarC = opl0VarA.c.c();
                        x6h1VarC.i.add(new a7h1("entity_card", (String) null, (Integer) null, str3, z3m0.j(iY)));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        i8h1 i8h1Var = d08Var.c;
                        b7x b7xVar = b7x.a;
                        i8h1Var.m(z2 ? new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("remove_like", 1, Collections.singletonMap("item_no_longer_liked", str)), y6h1VarA, r6h1Var, System.currentTimeMillis()) : new w7h1("", "", new z7h1("hit", 1, b7xVar), new x7h1("like", 1, Collections.singletonMap("item_to_be_liked", str)), y6h1VarA, r6h1Var, System.currentTimeMillis()), (xj61) null);
                    }
                }
                ((Function0) obj).invoke();
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public z990(boolean z, boolean z2, hrr0 hrr0Var, oe6 oe6Var, StoryCard storyCard, qan qanVar, frr0 frr0Var, hrr0 hrr0Var2) {
        super(0);
        this.b = z;
        this.c = z2;
        this.d = hrr0Var;
        this.f = oe6Var;
        this.g = storyCard;
        this.h = qanVar;
        this.i = frr0Var;
        this.e = hrr0Var2;
    }
}
