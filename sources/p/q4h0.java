package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class q4h0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ kmy b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q4h0(kmy kmyVar, byte b) {
        super(1);
        this.a = b;
        this.b = kmyVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        kmy kmyVar = this.b;
        switch (b) {
            case 0:
                bwc1 bwc1Var = (bwc1) obj;
                tv80 tv80Var = bwc1Var.b;
                iys0 iys0Var = bwc1Var.a;
                String str = iys0Var.f;
                if (u890.j(str, "spotify:playlist:37i9dQZF1EYkqdzj48dyYq")) {
                    kmyVar.invoke(new s2h0(tv80Var));
                } else if (str != null) {
                    kmyVar.invoke(new g3h0(str));
                } else {
                    kmyVar.invoke(new u3h0(iys0Var.e, tv80Var));
                }
                return rih1Var;
            case 1:
                nc31 nc31Var = (nc31) obj;
                if (nc31Var.b) {
                    kmyVar.invoke(n3h0.a);
                } else {
                    kmyVar.invoke(new o3h0(nc31Var.a));
                }
                return rih1Var;
            case 2:
                b5h b5hVar = (b5h) obj;
                if (b5hVar instanceof x4h) {
                    kmyVar.invoke(new g3h0(((x4h) b5hVar).a));
                } else if (b5hVar instanceof z4h) {
                    kmyVar.invoke(new j2h0(((z4h) b5hVar).a));
                } else if (b5hVar instanceof y4h) {
                    kmyVar.invoke(new x3h0(((y4h) b5hVar).a));
                } else {
                    if (!(b5hVar instanceof a5h)) {
                        eg.o();
                        return null;
                    }
                    a5h a5hVar = (a5h) b5hVar;
                    kmyVar.invoke(new w3h0(a5hVar.a, a5hVar.b, a5hVar.c, a5hVar.d));
                }
                return rih1Var;
            case 3:
                kmyVar.invoke(new g3h0((String) obj));
                return rih1Var;
            case 4:
                rrf1 rrf1Var = (srf1) obj;
                if (rrf1Var instanceof prf1) {
                    kmyVar.invoke(new j2h0(((prf1) rrf1Var).a));
                } else if (rrf1Var instanceof orf1) {
                    kmyVar.invoke(new x3h0(((orf1) rrf1Var).a));
                } else if (rrf1Var instanceof qrf1) {
                    qrf1 qrf1Var = (qrf1) rrf1Var;
                    kmyVar.invoke(new w3h0(qrf1Var.a, qrf1Var.b, qrf1Var.c, qrf1Var.d));
                } else if (rrf1Var instanceof nrf1) {
                    kmyVar.invoke(new p2h0(((nrf1) rrf1Var).a));
                } else {
                    if (!(rrf1Var instanceof rrf1)) {
                        eg.o();
                        return null;
                    }
                    kmyVar.invoke(new g3h0(rrf1Var.a));
                }
                return rih1Var;
            case 5:
                joy joyVar = (joy) obj;
                if (joyVar instanceof hoy) {
                    kmyVar.invoke(new g3h0(((hoy) joyVar).a));
                }
                return rih1Var;
            case 6:
                kmyVar.invoke(new g3h0(((qpd1) obj).a));
                return rih1Var;
            default:
                gth1 gth1Var = (gth1) obj;
                if (gth1Var instanceof fth1) {
                    String str2 = ((fth1) gth1Var).a;
                    if (str2 != null) {
                        kmyVar.invoke(new g3h0(str2));
                    }
                } else if (!(gth1Var instanceof bth1) && !(gth1Var instanceof ath1) && !(gth1Var instanceof cth1) && !gth1Var.equals(eth1.a) && !gth1Var.equals(dth1.a)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
        }
    }
}
