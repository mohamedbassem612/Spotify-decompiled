package p;

import com.spotify.music.podcastinteractivity.polls.proto.ClientPollResponse;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class nw2 implements rqw {
    public final /* synthetic */ byte a;
    public final /* synthetic */ ia00 b;

    public nw2(byte b) {
        this.a = b;
        switch (b) {
            case 1:
                this.b = new ia00(xw1.class.getName(), mm1.Y, mm1.Z);
                break;
            default:
                this.b = new ia00(nw2.class.getSimpleName(), mm1.b1, mm1.c1);
                break;
        }
    }

    public final op80 a(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.a((pw2) obj, (sw2) obj2, op80Var);
            case 1:
                return ia00Var.a((vw1) obj, (ww1) obj2, op80Var);
            case 2:
                return ia00Var.a((String) obj, (tbv0) obj2, op80Var);
            case 3:
                return ia00Var.a((zm11) obj, (an11) obj2, op80Var);
            case 4:
                return ia00Var.a((ug71) obj, (zg71) obj2, op80Var);
            default:
                return ia00Var.a((atj1) obj, (btj1) obj2, op80Var);
        }
    }

    public final Object b(Object obj, Object obj2, Object obj3, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.b((pw2) obj, (sw2) obj2, (mw2) obj3, op80Var);
            case 1:
                return ia00Var.b((vw1) obj, (ww1) obj2, (bt1) obj3, op80Var);
            case 2:
                return ia00Var.b((String) obj, (tbv0) obj2, (sbv0) obj3, op80Var);
            case 3:
                return ia00Var.b((zm11) obj, (an11) obj2, (xm11) obj3, op80Var);
            case 4:
                return ia00Var.b((ug71) obj, (zg71) obj2, (tg71) obj3, op80Var);
            default:
                return ia00Var.b((atj1) obj, (btj1) obj2, (ktj1) obj3, op80Var);
        }
    }

    public final boolean c(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.c((pw2) obj, (sw2) obj2, op80Var);
            case 1:
                return ia00Var.c((vw1) obj, (ww1) obj2, op80Var);
            case 2:
                return ia00Var.c((String) obj, (tbv0) obj2, op80Var);
            case 3:
                return ia00Var.c((zm11) obj, (an11) obj2, op80Var);
            case 4:
                return ia00Var.c((ug71) obj, (zg71) obj2, op80Var);
            default:
                return ia00Var.c((atj1) obj, (btj1) obj2, op80Var);
        }
    }

    public final Object d(Object obj, Object obj2, op80 op80Var) {
        byte b = this.a;
        ia00 ia00Var = this.b;
        switch (b) {
            case 0:
                return ia00Var.d((pw2) obj, (sw2) obj2, op80Var);
            case 1:
                return ia00Var.d((vw1) obj, (ww1) obj2, op80Var);
            case 2:
                tbv0 tbv0Var = (tbv0) obj2;
                String str = tbv0Var.b;
                n8h1 n8h1VarC = op80Var != null ? mno1.C(op80Var) : null;
                ipl0 ipl0Var = n8h1VarC instanceof ipl0 ? (ipl0) n8h1VarC : null;
                if (ipl0Var == null) {
                    return null;
                }
                r6h1 r6h1Var = ipl0Var.a;
                y6h1 y6h1Var = ipl0Var.b;
                kcv0 kcv0Var = tbv0Var.a;
                if (!(kcv0Var instanceof kcv0)) {
                    if (!(kcv0Var instanceof jcv0)) {
                        return null;
                    }
                    x6h1 x6h1VarC = y6h1Var.c();
                    x6h1VarC.i.add(new a7h1("poll_error_card", (String) null, (Integer) null, str, (String) null));
                    x6h1VarC.j = true;
                    y6h1 y6h1VarA = x6h1VarC.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var.a();
                }
                ClientPollResponse clientPollResponse = kcv0Var.c;
                String strValueOf = String.valueOf(clientPollResponse.o().q());
                zbv0 zbv0VarU = clientPollResponse.o().u();
                zbv0 zbv0Var = zbv0.d;
                acv0 acv0Var = acv0.c;
                if (zbv0VarU == zbv0Var && clientPollResponse.p().isEmpty()) {
                    if (clientPollResponse.o().v() == acv0Var) {
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("single_select_poll_card", strValueOf, (Integer) null, str, (String) null));
                        x6h1VarC2.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        k7h1 k7h1Var2 = new k7h1();
                        ((xjn) k7h1Var2).a = y6h1VarA2;
                        ((xjn) k7h1Var2).b = r6h1Var;
                        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                        return k7h1Var2.a();
                    }
                    x6h1 x6h1VarC3 = y6h1Var.c();
                    x6h1VarC3.i.add(new a7h1("multi_select_poll_card", strValueOf, (Integer) null, str, (String) null));
                    x6h1VarC3.j = true;
                    y6h1 y6h1VarA3 = x6h1VarC3.a();
                    k7h1 k7h1Var3 = new k7h1();
                    ((xjn) k7h1Var3).a = y6h1VarA3;
                    ((xjn) k7h1Var3).b = r6h1Var;
                    ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var3.a();
                }
                if (clientPollResponse.o().v() == acv0Var) {
                    x6h1 x6h1VarC4 = y6h1Var.c();
                    x6h1VarC4.i.add(new a7h1("single_select_poll_results_card", strValueOf, (Integer) null, str, (String) null));
                    x6h1VarC4.j = true;
                    y6h1 y6h1VarA4 = x6h1VarC4.a();
                    k7h1 k7h1Var4 = new k7h1();
                    ((xjn) k7h1Var4).a = y6h1VarA4;
                    ((xjn) k7h1Var4).b = r6h1Var;
                    ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                    return k7h1Var4.a();
                }
                x6h1 x6h1VarC5 = y6h1Var.c();
                x6h1VarC5.i.add(new a7h1("multi_select_poll_results_card", strValueOf, (Integer) null, str, (String) null));
                x6h1VarC5.j = true;
                y6h1 y6h1VarA5 = x6h1VarC5.a();
                k7h1 k7h1Var5 = new k7h1();
                ((xjn) k7h1Var5).a = y6h1VarA5;
                ((xjn) k7h1Var5).b = r6h1Var;
                ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                return k7h1Var5.a();
            case 3:
                return ia00Var.d((zm11) obj, (an11) obj2, op80Var);
            case 4:
                return ia00Var.d((ug71) obj, (zg71) obj2, op80Var);
            default:
                return ia00Var.d((atj1) obj, (btj1) obj2, op80Var);
        }
    }

    public nw2(i8h1 i8h1Var) {
        this.a = (byte) 4;
        this.b = new ia00("ShareSheetUbi", vy61.Q0, new njf0(i8h1Var, (byte) 1));
    }

    public nw2(i8h1 i8h1Var, lik1 lik1Var) {
        this.a = (byte) 5;
        this.b = new ia00("VideoPreviewElementInstrumentation", new vm11(lik1Var, (byte) 3), new njf0(i8h1Var, (byte) 3));
    }

    public nw2(lik1 lik1Var) {
        this.a = (byte) 3;
        this.b = new ia00("RelatedTrackAudioElementInstrumentation", new vm11(lik1Var, (byte) 0), ok11.N0);
    }

    public nw2(ia00 ia00Var) {
        this.a = (byte) 2;
        this.b = ia00Var;
    }
}
