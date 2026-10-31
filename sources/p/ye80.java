package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ye80 extends hab0 implements vu30 {
    public final /* synthetic */ MessageTemplate a;
    public final /* synthetic */ gbj0 b;
    public final /* synthetic */ HeaderContent c;
    public final /* synthetic */ Signifier d;
    public final /* synthetic */ MessageText e;
    public final /* synthetic */ MessageText f;
    public final /* synthetic */ af80 g;
    public final /* synthetic */ iu30 h;
    public final /* synthetic */ lbj0 i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ye80(MessageTemplate messageTemplate, gbj0 gbj0Var, HeaderContent headerContent, Signifier signifier, MessageText messageText, MessageText messageText2, af80 af80Var, iu30 iu30Var, lbj0 lbj0Var) {
        super(2);
        this.a = messageTemplate;
        this.b = gbj0Var;
        this.c = headerContent;
        this.d = signifier;
        this.e = messageText;
        this.f = messageText2;
        this.g = af80Var;
        this.h = iu30Var;
        this.i = lbj0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        vu30 vu30Var;
        llj lljVar;
        Function0 function0;
        g36 g36Var;
        gbj0 gbj0Var;
        int i;
        String text;
        Function0 function1;
        fra fraVar;
        Function0 function2;
        boolean z;
        float f;
        String text2;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            gbj0 gbj0Var2 = this.b;
            BackgroundColor backgroundColor = gbj0Var2.d;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarR = y9j0.r(qim0VarF, this.a, backgroundColor, 16.0f);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX = uyn1.x(qim0VarR, 16.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z2 = x340Var2.S;
            Function0 function3 = hmb0.t1;
            if (z2) {
                x340Var2.l(function3);
            } else {
                x340Var2.v0();
            }
            llj lljVar2 = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar2);
            llj lljVar3 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar3);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar4 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar4);
            nko1.F(x340Var2);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var2);
            era eraVar = een.P0;
            g36 g36Var2 = h36.c;
            mbh mbhVarA = jbh.a(g36Var2, eraVar, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, nim0Var);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function3);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar2);
            nko1.H(xos0VarM2, x340Var2, lljVar3);
            x0d.q(iHashCode2, x340Var2, lljVar4, x340Var2);
            nko1.H(qim0VarE2, x340Var2, vu30Var2);
            HeaderContent headerContent = this.c;
            MessageTemplate messageTemplate = this.a;
            if (headerContent != null) {
                x340Var2.i0(998126941);
                qim0 qim0VarN = anm1.N("messaging_inlinecard_header_content", nim0Var);
                float f2 = cbx.b(x340Var2).b.b;
                cvx cvxVar2 = cbx.b(x340Var2).b;
                function0 = function3;
                g36Var = g36Var2;
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                y9j0.h(headerContent, messageTemplate, uyn1.B(qim0VarN, 0.0f, 0.0f, f2, 12.0f, 3), 5, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                x340Var2 = x340Var2;
                i = 0;
                x340Var2.r(false);
                gbj0Var = gbj0Var2;
            } else {
                vu30Var = vu30Var2;
                lljVar = lljVar4;
                function0 = function3;
                g36Var = g36Var2;
                Signifier signifier = this.d;
                if (signifier == null || (text = signifier.getText()) == null || !(!ihc1.y0(text))) {
                    gbj0Var = gbj0Var2;
                    i = 0;
                    x340Var2.i0(999518252);
                    x340Var2.r(false);
                } else {
                    x340Var2.i0(998754722);
                    zov0 zov0Var = cbx.b(x340Var2).g;
                    zic0 zic0Var = new zic0(1);
                    long jP = v9p1.P(v9p1.G(messageTemplate, x340Var2), signifier.getTextColor());
                    lee1 lee1Var = cbx.d(x340Var2).k;
                    qim0 qim0VarN2 = anm1.N("messaging_inlinecard_signifier", nim0Var);
                    float f3 = cbx.b(x340Var2).b.b;
                    cvx cvxVar3 = cbx.b(x340Var2).b;
                    gbj0Var = gbj0Var2;
                    y9j0.o(signifier, messageTemplate, uyn1.B(qim0VarN2, 0.0f, 0.0f, f3, 12.0f, 3), 5, 16.0f, jP, zic0Var, lee1Var, x340Var2, Signifier.$stable, 0);
                    x340Var2 = x340Var2;
                    i = 0;
                    x340Var2.r(false);
                }
            }
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            fra fraVar2 = een.Z;
            jw31 jw31VarA = ew31.a(h36.a, fraVar2, x340Var2, i);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                function1 = function0;
                x340Var2.l(function1);
            } else {
                function1 = function0;
                x340Var2.v0();
            }
            nko1.H(jw31VarA, x340Var2, lljVar2);
            nko1.H(xos0VarM3, x340Var2, lljVar3);
            x0d.q(iHashCode3, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE3, x340Var2, vu30Var);
            AccessoryContent accessoryContent = gbj0Var.f;
            if (accessoryContent == null) {
                x340Var2.i0(-547863437);
                x340Var2.r(false);
                fraVar = fraVar2;
                function2 = function1;
            } else {
                x340Var2.i0(-547863436);
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                zov0 zov0Var3 = cbx.b(x340Var2).g;
                cua cuaVar2 = cbx.b(x340Var2).f;
                qim0 qim0VarN3 = anm1.N("messaging_inlinecard_accessory_content", nim0Var);
                cvx cvxVar4 = cbx.b(x340Var2).b;
                x340 x340Var3 = x340Var2;
                fraVar = fraVar2;
                function2 = function1;
                y9j0.a(accessoryContent, messageTemplate, uyn1.B(qim0VarN3, 0.0f, 0.0f, 16.0f, 0.0f, 11), null, 64.0f, 64.0f, null, 4.0f, x340Var3, AccessoryContent.$stable, 72);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            qim0 qim0VarB = uyn1.B(kx40.h(1.0f, u291.f(nim0Var, 1.0f), true), 0.0f, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 11);
            mbh mbhVarA2 = jbh.a(g36Var, eraVar, x340Var2, 0);
            int iHashCode4 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM4 = x340Var2.m();
            qim0 qim0VarE4 = zr7.E(x340Var2, qim0VarB);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA2, x340Var2, lljVar2);
            nko1.H(xos0VarM4, x340Var2, lljVar3);
            x0d.q(iHashCode4, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE4, x340Var2, vu30Var);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            cvx cvxVar5 = cbx.b(x340Var2).b;
            mbh mbhVarA3 = jbh.a(new d36(6.0f, true, new um5(false)), eraVar, x340Var2, 0);
            int iHashCode5 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM5 = x340Var2.m();
            qim0 qim0VarE5 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(function2);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA3, x340Var2, lljVar2);
            nko1.H(xos0VarM5, x340Var2, lljVar3);
            x0d.q(iHashCode5, x340Var2, lljVar, x340Var2);
            nko1.H(qim0VarE5, x340Var2, vu30Var);
            MessageText messageText = this.e;
            int length = messageText.getText().length();
            bjc0 bjc0Var = bjc0.a;
            if (length > 0) {
                x340Var2.i0(-1928744073);
                y9j0.i(0, 5, 12582912 | MessageText.$stable, 288, messageTemplate, messageText, "messaging_inlinecard_headline", x340Var2, null, bjc0Var, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).h);
                messageTemplate = messageTemplate;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1928286916);
                x340Var2.r(false);
            }
            MessageText messageText2 = this.f;
            if (messageText2 == null || (text2 = messageText2.getText()) == null || text2.length() <= 0) {
                z = false;
                x340Var2.i0(-1927750244);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1928191064);
                MessageTemplate messageTemplate2 = messageTemplate;
                y9j0.b(0, 5, MessageText.$stable | 100663296, 160, messageTemplate2, messageText2, "messaging_inlinecard_body", x340Var2, null, bjc0Var, u291.f(nim0Var, 1.0f), cbx.d(x340Var2).j);
                messageTemplate = messageTemplate2;
                z = false;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            gbj0 gbj0Var3 = gbj0Var;
            if (gbj0Var3.g == null && gbj0Var3.h == null) {
                x340Var2.i0(1947491174);
                x340Var2.r(z);
                f = 16.0f;
            } else {
                x340Var2.i0(1947386425);
                cvx cvxVar6 = cbx.b(x340Var2).b;
                f = 16.0f;
                x0d.s(nim0Var, 16.0f, x340Var2, z);
            }
            cvx cvxVar7 = cbx.b(x340Var2).b;
            d36 d36Var = new d36(8.0f, true, new g21(eraVar, (byte) 29));
            cvx cvxVar8 = cbx.b(x340Var2).b;
            d36 d36Var2 = new d36(2.0f, false, new g21(fraVar, (byte) 28));
            af80 af80Var = this.g;
            iu30 iu30Var = this.h;
            MessageTemplate messageTemplate3 = messageTemplate;
            k5p1.d((qim0) null, d36Var, d36Var2, (pl3) null, 0, 0, apo.r(-1130931753, new c9y(gbj0Var3, af80Var, messageTemplate3, iu30Var, (byte) 8), x340Var2), x340Var2, 1572864, 57);
            us71.m(x340Var2, true, true, true);
            Button button = gbj0Var3.j;
            if (button == null) {
                x340Var2.i0(-1432466819);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-1432466818);
                fux fuxVar = fux.c;
                Icon icon = button.getStyle().getIcon();
                long jP2 = v9p1.P(v9p1.E(this.i.a.getMessageData().getFormat().getTemplate(), x340Var2), icon != null ? icon.getColor() : null);
                qim0 qim0VarA = h2c.a.a(anm1.N("messaging_inlinecard_close_button", nim0Var), een.f);
                yla.s(x340Var2);
                yla.s(x340Var2);
                qim0 qim0VarC = eqr0.C(qim0VarA, f, -16.0f);
                jsl jslVar = new jsl(cwl1.o0(x340Var2, 2131953955));
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(button);
                Object objT = x340Var2.T();
                if (zG || objT == fkj0.X) {
                    objT = new u5a(iu30Var, button, (byte) 16);
                    x340Var2.s0(objT);
                }
                x340 x340Var4 = x340Var2;
                y9j0.l(fuxVar, messageTemplate3, jslVar, qim0VarC, jP2, 0.0f, (Function0) objT, x340Var4, fux.d, 32);
                x340Var2 = x340Var4;
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }
}
