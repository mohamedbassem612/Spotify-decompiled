package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class w4f implements xpw {
    public final ueq a;
    public final ljm0 b = h7w.B(new qka(1, this, w4f.class, "buildInternalState", "buildInternalState(Lcom/spotify/campfire/chatdetailspage/elements/headeractions/api/ChatHeaderActionsRowElement$Props;)Lcom/spotify/campfire/chatdetailspage/elements/headeractions/impl/ChatHeaderActionsRowElementImpl$InternalState;", 0, (byte) 22), (o8n) null, (iu30) null, new v08(this, (byte) 7), 6);
    public final eih1 c = new eih1();
    public final psw d;

    public w4f(ueq ueqVar) {
        this.a = ueqVar;
        j2i j2iVar = new j2i(-1323571255, new gtd(this, (byte) 13), true);
        ien0 ien0Var = qsw.a;
        this.d = new psw(j2iVar, (byte) 0);
    }

    public static v4f e(u4f u4fVar) {
        String strA = u4fVar.a();
        smc0 smc0VarN = k4p1.n();
        if (u4fVar instanceof s4f) {
            s4f s4fVar = (s4f) u4fVar;
            jwm jwmVar = s4fVar.e;
            r4f r4fVar = s4fVar.d;
            String str = s4fVar.a;
            smc0VarN.add(r4fVar.a ? new l4f(true, str, r4fVar.c) : new k4f(true, str, r4fVar.b));
            if (!u890.j(jwmVar.c, ewm.a)) {
                smc0VarN.add(new h4f(s4fVar.c, jwmVar));
            }
            smc0VarN.add(new i4f(jwmVar.a.a));
        } else {
            if (!(u4fVar instanceof t4f)) {
                eg.o();
                return null;
            }
            t4f t4fVar = (t4f) u4fVar;
            zks0 zks0Var = t4fVar.e;
            if (!zks0Var.b() && !zks0Var.g()) {
                r4f r4fVar2 = t4fVar.d;
                String str2 = t4fVar.a;
                smc0VarN.add(r4fVar2.a ? new l4f(false, str2, r4fVar2.c) : new k4f(false, str2, r4fVar2.b));
            }
            smc0VarN.add(new j4f(zks0Var, t4fVar.c));
        }
        return new v4f(strA, mqo1.A(k4p1.k(smc0VarN)));
    }

    public final rqw a() {
        return this.c;
    }

    public final jsw c() {
        return this.d;
    }

    public final mqw getBehavior() {
        return this.b;
    }
}
