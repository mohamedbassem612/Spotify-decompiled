package p;

import android.content.Context;
import android.view.View;
import androidx.compose.ui.graphics.Shadow;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.style.TextDecoration;
import androidx.compose.ui.text.style.TextGeometricTransform;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.BackgroundColor;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.HeaderContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Signifier;
import com.spotify.player.model.ContextTrack;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class ta5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;
    public final /* synthetic */ Object g;
    public final /* synthetic */ Object h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ta5(bou bouVar, iu30 iu30Var, zeu zeuVar, ngs0 ngs0Var, tm tmVar, j2i j2iVar, qim0 qim0Var, int i) {
        super(2);
        this.a = (byte) 16;
        this.b = bouVar;
        this.e = iu30Var;
        this.c = zeuVar;
        this.d = ngs0Var;
        this.f = tmVar;
        this.g = j2iVar;
        this.h = qim0Var;
    }

    private final Object a(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        pxd0.e((bou) this.b, (iu30) this.e, (zeu) this.c, (ngs0) this.d, (tm) this.f, (j2i) this.g, (qim0) this.h, (b0k) obj, czo1.p(196609));
        return rih1.a;
    }

    private final Object d(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((xgc) this.b).f((String) this.c, (List) this.d, (Integer) this.e, (Function0) this.f, (Function0) this.g, (j2i) this.h, (b0k) obj, czo1.p(196609));
        return rih1.a;
    }

    private final Object e(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.e;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            qim0 qim0Var = (qim0) this.b;
            xtb0 xtb0Var = (xtb0) this.c;
            vzq0 vzq0Var = (vzq0) this.d;
            c36 c36Var = (c36) this.f;
            pl3 pl3Var = (pl3) this.g;
            iq20 iq20Var = (iq20) this.h;
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new hws(iu30Var, (byte) 22);
                x340Var2.s0(objT);
            }
            ujo1.e(qim0Var, xtb0Var, vzq0Var, c36Var, pl3Var, iq20Var, false, (hxq0) null, (iu30) objT, x340Var2, 0, 384);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object f(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        af5 af5Var = (af5) this.e;
        String str = (String) this.d;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            qim0 qim0Var = (qim0) this.b;
            float f = o8h0.e;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarQ = i1p1.q(qim0Var, er31.b(8.0f));
            long j = o8h0.a;
            qim0 qim0VarX = bin.x(dug.f(qim0VarQ, j, d4o1.a), false, (String) null, (pm31) null, (idn0) null, (Function0) this.c, 15);
            boolean zG = x340Var2.g(str) | x340Var2.g(af5Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new w3w(str, af5Var, (byte) 20);
                x340Var2.s0(objT);
            }
            qim0 qim0VarB = s161.b(qim0VarX, true, (iu30) objT);
            Function0 function0 = (Function0) this.f;
            yk80 yk80Var = (yk80) this.g;
            String str2 = (String) this.h;
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarB);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(gfh0VarC, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            llj lljVar4 = y580.Y;
            nko1.H(qim0VarE, x340Var2, lljVar4);
            long j2 = o8h0.c;
            long j3 = o8h0.d;
            h2c h2cVar = h2c.a;
            nim0 nim0Var = nim0.a;
            n8h0.a(j, j2, j3, "+", h2cVar.b(nim0Var), x340Var2, 3510);
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object objT2 = x340Var2.T();
            if (objT2 == m4cVar) {
                objT2 = vay.d1;
                x340Var2.s0(objT2);
            }
            qim0 qim0VarA = s161.a(qim0VarF, (iu30) objT2);
            o8h0.c(x340Var2);
            o8h0.c(x340Var2);
            o8h0.c(x340Var2);
            o8h0.c(x340Var2);
            uwr uwrVar = cbx.a;
            mta mtaVar = cbx.b(x340Var2).d;
            qim0 qim0VarA2 = uyn1.A(qim0VarA, 8.0f, 8.0f, 8.0f, 56.0f);
            mbh mbhVarA = jbh.a(h36.c, een.P0, x340Var2, 0);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarA2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE2, x340Var2, lljVar4);
            o8h0.b(str, x340Var2, 0);
            qim0 qim0VarF2 = u291.f(nim0Var, 1.0f);
            float f2 = o8h0.e;
            float f3 = o8h0.f;
            ply.a(yk80Var, str2, uyn1.B(qim0VarF2, f2, f3, f2, 0.0f, 8), x340Var2, 384);
            o8h0.a(af5Var, uyn1.B(nim0Var, 0.0f, f3, 0.0f, 0.0f, 13), x340Var2, 48);
            x340Var2.r(true);
            o8h0.c(x340Var2);
            s8p1.b(function0, o8h0.b, h2cVar.a(nim0Var, een.Y), x340Var2, 384);
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object g(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        Function0 function0 = (Function0) this.h;
        String str = (String) this.g;
        String str2 = (String) this.f;
        iu30 iu30Var = (iu30) this.e;
        m4c m4cVar = fkj0.X;
        String str3 = (String) this.b;
        String str4 = (String) this.c;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zG = x340Var2.g(str3) | x340Var2.g(str4) | x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new djx((Object) str3, (Object) str4, (Object) iu30Var, (byte) 16);
                x340Var2.s0(objT);
            }
            iu30 iu30Var2 = (iu30) objT;
            qim0 qim0VarN = anm1.N("fan_event_redemption_code_input", vby0.p(nim0.a, (lz20) this.d));
            boolean zG2 = x340Var2.g(str2) | x340Var2.g(str) | x340Var2.g(str4);
            Object objT2 = x340Var2.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new ck10(str2, str, str4, (byte) 0);
                x340Var2.s0(objT2);
            }
            qim0 qim0VarB = s161.b(qim0VarN, false, (iu30) objT2);
            uwr uwrVar = cbx.a;
            lee1 lee1Var = cbx.d(x340Var2).e;
            long j = u7h.j;
            lee1 lee1VarA = lee1.a(lee1Var, j, 0L, (FontWeight) null, (FontStyle) null, (FontSynthesis) null, (FontFamily) null, (String) null, 0L, (TextGeometricTransform) null, 0L, (TextDecoration) null, (Shadow) null, (phc1) null, 0, 0, 0L, (u8e1) null, (wdt0) null, (shc0) null, 0, 16777214);
            kua0 kua0Var = new kua0(0, (Boolean) null, 3, 7, 115);
            boolean zG3 = x340Var2.g(str3) | x340Var2.g(function0);
            Object objT3 = x340Var2.T();
            if (zG3 || objT3 == m4cVar) {
                objT3 = new f0n(str3, function0, (byte) 1);
                x340Var2.s0(objT3);
            }
            xea.a(str3, iu30Var2, qim0VarB, false, false, lee1VarA, kua0Var, new bua0((iu30) objT3, (iu30) null, (iu30) null, 62), true, 0, 0, (elk1) null, (iu30) null, (idn0) null, new n6a1(j), apo.r(-163278521, new xo6(str4, str3, (byte) 5), x340Var2), x340Var2, 100663296, 196608, 15896);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object h(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        aq8.h((llw0) this.b, (String) this.c, (String) this.d, (String) this.e, (String) this.f, (List) this.g, (qim0) this.h, (b0k) obj, czo1.p(1572865));
        return rih1.a;
    }

    private final Object i(Object obj, Object obj2) {
        MessageTemplate messageTemplate;
        vu30 vu30Var;
        Button button;
        String text;
        boolean z;
        String text2;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        iu30 iu30Var = (iu30) this.e;
        gbj0 gbj0Var = (gbj0) this.c;
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        j06 j06Var = x340Var2.a;
        if (zY) {
            nim0 nim0Var = nim0.a;
            qim0 qim0VarF = u291.f(nim0Var, 1.0f);
            Object obj3 = this.b;
            BackgroundColor backgroundColor = gbj0Var.d;
            Button button2 = gbj0Var.i;
            uwr uwrVar = cbx.a;
            cua cuaVar = cbx.b(x340Var2).f;
            qim0 qim0VarR = y9j0.r(qim0VarF, (MessageTemplate) obj3, backgroundColor, 16.0f);
            boolean z2 = button2 != null;
            boolean zI = x340Var2.i(gbj0Var) | x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zI || objT == m4cVar) {
                objT = new te80(gbj0Var, iu30Var, (byte) 0);
                x340Var2.s0(objT);
            }
            qim0 qim0VarX = bin.x(qim0VarR, z2, (String) null, (pm31) null, (idn0) null, (Function0) objT, 14);
            cvx cvxVar = cbx.b(x340Var2).b;
            qim0 qim0VarX2 = uyn1.x(qim0VarX, 16.0f);
            fra fraVar = een.N0;
            MessageTemplate messageTemplate2 = (MessageTemplate) obj3;
            HeaderContent headerContent = (HeaderContent) this.d;
            Signifier signifier = (Signifier) this.f;
            MessageText messageText = (MessageText) this.g;
            MessageText messageText2 = (MessageText) this.h;
            jw31 jw31VarA = ew31.a(h36.a, fraVar, x340Var2, 0);
            int iHashCode = Long.hashCode(x340Var2.T);
            xos0 xos0VarM = x340Var2.m();
            qim0 qim0VarE = zr7.E(x340Var2, qim0VarX2);
            hzj.A.getClass();
            if (j06Var == null) {
                tgp1.p();
                throw null;
            }
            x340Var2.m0();
            boolean z3 = x340Var2.S;
            n4k n4kVar = hmb0.t1;
            if (z3) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            llj lljVar = y580.O0;
            nko1.H(jw31VarA, x340Var2, lljVar);
            llj lljVar2 = y580.N0;
            nko1.H(xos0VarM, x340Var2, lljVar2);
            Integer numValueOf = Integer.valueOf(iHashCode);
            llj lljVar3 = y580.R0;
            nko1.H(numValueOf, x340Var2, lljVar3);
            nko1.F(x340Var2);
            vu30 vu30Var2 = y580.Y;
            nko1.H(qim0VarE, x340Var2, vu30Var2);
            AccessoryContent accessoryContent = gbj0Var.f;
            if (accessoryContent == null) {
                x340Var2.i0(-1268180237);
                x340Var2.r(false);
                vu30Var = vu30Var2;
                button = button2;
                messageTemplate = messageTemplate2;
            } else {
                x340Var2.i0(-1268180236);
                zov0 zov0Var = cbx.b(x340Var2).g;
                zov0 zov0Var2 = cbx.b(x340Var2).g;
                cua cuaVar2 = cbx.b(x340Var2).f;
                qim0 qim0VarN = anm1.N("messaging_inlinecard_accessory_content", nim0Var);
                cvx cvxVar2 = cbx.b(x340Var2).b;
                messageTemplate = messageTemplate2;
                vu30Var = vu30Var2;
                button = button2;
                y9j0.a(accessoryContent, messageTemplate, uyn1.B(qim0VarN, 0.0f, 0.0f, 16.0f, 0.0f, 11), (qim0) null, 64.0f, 64.0f, (ecx) null, 4.0f, x340Var2, AccessoryContent.$stable, 72);
                x340Var2 = x340Var2;
                x340Var2.r(false);
            }
            qim0 qim0VarF2 = u291.f(new wnb0(1.0f, true), 1.0f);
            gfh0 gfh0VarC = t1c.c(een.d, false);
            int iHashCode2 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM2 = x340Var2.m();
            qim0 qim0VarE2 = zr7.E(x340Var2, qim0VarF2);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(gfh0VarC, x340Var2, lljVar);
            nko1.H(xos0VarM2, x340Var2, lljVar2);
            x0d.q(iHashCode2, x340Var2, lljVar3, x340Var2);
            vu30 vu30Var3 = vu30Var;
            nko1.H(qim0VarE2, x340Var2, vu30Var3);
            qim0 qim0VarF3 = u291.f(nim0Var, 1.0f);
            mbh mbhVarA = jbh.a(h36.e, een.P0, x340Var2, 0);
            int iHashCode3 = Long.hashCode(x340Var2.T);
            xos0 xos0VarM3 = x340Var2.m();
            qim0 qim0VarE3 = zr7.E(x340Var2, qim0VarF3);
            x340Var2.m0();
            if (x340Var2.S) {
                x340Var2.l(n4kVar);
            } else {
                x340Var2.v0();
            }
            nko1.H(mbhVarA, x340Var2, lljVar);
            nko1.H(xos0VarM3, x340Var2, lljVar2);
            x0d.q(iHashCode3, x340Var2, lljVar3, x340Var2);
            nko1.H(qim0VarE3, x340Var2, vu30Var3);
            if (headerContent != null) {
                x340Var2.i0(-322965346);
                qim0 qim0VarN2 = anm1.N("messaging_inlinecard_header_content", nim0Var);
                float f = cbx.b(x340Var2).b.b;
                cvx cvxVar3 = cbx.b(x340Var2).b;
                y9j0.h(headerContent, messageTemplate, uyn1.B(qim0VarN2, 0.0f, 0.0f, f, 8.0f, 3), 5, new zic0(1), x340Var2, HeaderContent.$stable, 0);
                x340Var2.r(false);
            } else if (signifier == null || (text = signifier.getText()) == null || text.length() <= 0) {
                x340Var2.i0(-321513368);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-322308673);
                zov0 zov0Var3 = cbx.b(x340Var2).g;
                zic0 zic0Var = new zic0(1);
                long jP = v9p1.P(v9p1.G(messageTemplate, x340Var2), signifier.getTextColor());
                lee1 lee1Var = cbx.d(x340Var2).k;
                qim0 qim0VarN3 = anm1.N("messaging_inlinecard_signifier", nim0Var);
                float f2 = cbx.b(x340Var2).b.b;
                cvx cvxVar4 = cbx.b(x340Var2).b;
                x340 x340Var3 = x340Var2;
                y9j0.o(signifier, messageTemplate, uyn1.B(qim0VarN3, 0.0f, 0.0f, f2, 8.0f, 3), 5, 16.0f, jP, zic0Var, lee1Var, x340Var3, Signifier.$stable, 0);
                x340Var2 = x340Var3;
                x340Var2.r(false);
            }
            int length = messageText.getText().length();
            bjc0 bjc0Var = bjc0.a;
            if (length > 0) {
                x340Var2.i0(-321424987);
                qim0 qim0VarF4 = u291.f(nim0Var, 1.0f);
                float f3 = cbx.b(x340Var2).b.b;
                cvx cvxVar5 = cbx.b(x340Var2).b;
                MessageTemplate messageTemplate3 = messageTemplate;
                x340 x340Var4 = x340Var2;
                y9j0.i(0, 5, MessageText.$stable | 12582912, 288, messageTemplate3, messageText, "messaging_inlinecard_headline", x340Var4, (iu30) null, bjc0Var, uyn1.B(qim0VarF4, 0.0f, 0.0f, f3, 4.0f, 3), cbx.d(x340Var2).h);
                messageTemplate = messageTemplate3;
                x340Var2 = x340Var4;
                x340Var2.r(false);
            } else {
                x340Var2.i0(-320789208);
                x340Var2.r(false);
            }
            if (messageText2 == null || (text2 = messageText2.getText()) == null || text2.length() <= 0) {
                z = false;
                x340Var2.i0(-320224760);
                x340Var2.r(false);
            } else {
                x340Var2.i0(-320700052);
                MessageTemplate messageTemplate4 = messageTemplate;
                x340 x340Var5 = x340Var2;
                y9j0.b(0, 5, MessageText.$stable | 100663296, 160, messageTemplate4, messageText2, "messaging_inlinecard_body", x340Var5, (iu30) null, bjc0Var, uyn1.B(u291.f(nim0Var, 1.0f), 0.0f, 0.0f, cbx.b(x340Var2).b.b, 0.0f, 11), cbx.d(x340Var2).j);
                messageTemplate = messageTemplate4;
                x340Var2 = x340Var5;
                z = false;
                x340Var2.r(false);
            }
            x340Var2.r(true);
            x340Var2.r(true);
            if (button == null) {
                x340Var2.i0(-1264519695);
                x340Var2.r(z);
            } else {
                x340Var2.i0(-1264519694);
                plx plxVar = plx.c;
                qim0 qim0VarN4 = anm1.N("messaging_inlinecard_card_button", nim0Var);
                cvx cvxVar6 = cbx.b(x340Var2).b;
                qim0 qim0VarB = uyn1.B(qim0VarN4, 16.0f, 0.0f, 0.0f, 0.0f, 14);
                boolean zG = x340Var2.g(iu30Var) | x340Var2.i(button);
                Object objT2 = x340Var2.T();
                if (zG || objT2 == m4cVar) {
                    objT2 = new u5a(iu30Var, button, (byte) 13);
                    x340Var2.s0(objT2);
                }
                x340 x340Var6 = x340Var2;
                y9j0.l(plxVar, messageTemplate, isl.a, qim0VarB, 0L, 0.0f, (Function0) objT2, x340Var6, plx.d | 384, 48);
                x340Var2 = x340Var6;
                x340Var2.r(false);
            }
            x340Var2.r(true);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object j(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        ((eoc) this.b).a((wda0) this.c, (Function0) this.d, (Function0) this.e, (Function0) this.f, (Function0) this.g, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object k(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        nyo1.f((String) this.b, (zsu0) this.c, (qxc0) this.d, (ArrayList) this.e, (r3d0) this.f, (Function0) this.g, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object m(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        d3p1.a((f0e0) this.b, (lb50) this.c, (yqg) this.d, (iu30) this.e, (j2i) this.f, (j2i) this.g, (qim0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    private final Object n(Object obj, Object obj2) {
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        iu30 iu30Var = (iu30) this.e;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            aff0 aff0Var = (aff0) ((ven0) this.f).getValue();
            xpw xpwVar = (xpw) ((ven0) this.g).getValue();
            xpw xpwVar2 = (xpw) this.b;
            xpw xpwVar3 = (xpw) this.c;
            xpw xpwVar4 = (xpw) ((ven0) this.h).getValue();
            xpw xpwVar5 = (xpw) ((qhm) this.d).d;
            boolean zG = x340Var2.g(iu30Var);
            Object objT = x340Var2.T();
            if (zG || objT == fkj0.X) {
                objT = new jwa0(iu30Var, (byte) 25);
                x340Var2.s0(objT);
            }
            x760.h(aff0Var, xpwVar, xpwVar2, xpwVar3, xpwVar4, (qim0) null, xpwVar5, (iu30) objT, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object o(Object obj, Object obj2) {
        ArrayList arrayList = (ArrayList) this.f;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        m4c m4cVar = fkj0.X;
        Function0 function0 = (Function0) this.b;
        Object obj3 = this.c;
        scx scxVar = (scx) obj3;
        x340 x340Var2 = x340Var;
        if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
            boolean zG = x340Var2.g(function0) | x340Var2.g(scxVar);
            Object obj4 = this.h;
            ven0 ven0Var = (ven0) obj4;
            Object objT = x340Var2.T();
            if (zG || objT == m4cVar) {
                objT = new dt90(function0, scxVar, ven0Var, (byte) 15);
                x340Var2.s0(objT);
            }
            Function0 function1 = (Function0) objT;
            Object obj5 = this.d;
            boolean zG2 = x340Var2.g((Function0) obj5);
            Object obj6 = this.e;
            boolean zG3 = zG2 | x340Var2.g((tm21) obj6) | x340Var2.g(arrayList);
            Object obj7 = this.g;
            boolean zG4 = x340Var2.g(scxVar) | zG3 | x340Var2.g((y7e1) obj7);
            Function0 function2 = (Function0) obj5;
            tm21 tm21Var = (tm21) obj6;
            y7e1 y7e1Var = (y7e1) obj7;
            scx scxVar2 = (scx) obj3;
            ven0 ven0Var2 = (ven0) obj4;
            Object objT2 = x340Var2.T();
            if (zG4 || objT2 == m4cVar) {
                dy7 dy7Var = new dy7(function2, tm21Var, arrayList, y7e1Var, scxVar2, ven0Var2);
                x340Var2.s0(dy7Var);
                objT2 = dy7Var;
            }
            tm80.e(function1, (Function0) objT2, x340Var2, 0);
        } else {
            x340Var2.b0();
        }
        return rih1.a;
    }

    private final Object p(Object obj, Object obj2) {
        ((Number) obj2).intValue();
        tm80.j((tm21) this.b, (Function0) this.c, (iu30) this.e, (Function0) this.d, (Function0) this.f, (Function0) this.g, (Function0) this.h, (b0k) obj, czo1.p(1));
        return rih1.a;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.NoWhenBranchMatchedException */
    /* JADX WARN: Code duplicated, block: B:243:0x09c6  */
    /* JADX WARN: Code duplicated, block: B:246:0x0a1a A[LOOP:1: B:244:0x0a17->B:246:0x0a1a, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:250:0x0a56 A[LOOP:2: B:248:0x0a53->B:250:0x0a56, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:254:0x0aa1  */
    /* JADX WARN: Code duplicated, block: B:258:0x0aca  */
    /* JADX WARN: Code duplicated, block: B:261:0x0aed  */
    /* JADX WARN: Code duplicated, block: B:264:0x0b0a  */
    public final Object invoke(Object obj, Object obj2) throws NoWhenBranchMatchedException {
        int i;
        x340 x340Var;
        ihl ihlVarK;
        nnb0 nnb0VarK;
        nnb0[] nnb0VarArr;
        yhc yhcVar;
        int i2;
        int i3;
        thl thlVar;
        boolean zI;
        Object objT;
        boolean zI2;
        Object objT2;
        x340 x340Var2;
        Object objT3;
        vgm0 vgm0Var;
        boolean z;
        int i4;
        float f;
        gfn0 gfn0VarA;
        byte b = this.a;
        nim0 nim0Var = nim0.a;
        n4k n4kVar = hmb0.t1;
        Object obj3 = this.b;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.h;
        Object obj5 = this.d;
        Object obj6 = this.g;
        Object obj7 = this.c;
        Object obj8 = this.e;
        Object obj9 = this.f;
        switch (b) {
            case 0:
                x340 x340Var3 = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                iu30 iu30Var = (iu30) obj8;
                mfs0 mfs0Var = (mfs0) obj5;
                m4c m4cVar = fkj0.X;
                eb5 eb5Var = (eb5) obj9;
                mhg1 mhg1Var = (mhg1) obj7;
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    hrr0 hrr0Var = mhg1Var.e;
                    hrr0 hrr0Var2 = mhg1Var.d;
                    Object value = hrr0Var.getValue();
                    Object obj10 = this.b;
                    boolean zH = x340Var4.h(u890.j(obj10, value));
                    Object objT4 = x340Var4.T();
                    if (zH || objT4 == m4cVar) {
                        objT4 = (!u890.j(obj10, hrr0Var.getValue()) || mfs0Var == null) ? (u890.j(obj10, mhg1Var.f().e()) || u890.j(obj10, mhg1Var.f().b())) ? (p9m) iu30Var.invoke(eb5Var) : (p9m) iu30Var.invoke(new mfs0(eb5Var, mhg1Var.f().e(), obj10)) : (p9m) iu30Var.invoke(mfs0Var);
                        x340Var4.s0(objT4);
                    }
                    p9m p9mVar = (p9m) objT4;
                    boolean zH2 = x340Var4.h(u890.j(mhg1Var.f().b(), obj10)) | x340Var4.h(u890.j(obj10, hrr0Var.getValue()));
                    Object objT5 = x340Var4.T();
                    if (zH2 || objT5 == m4cVar) {
                        objT5 = (u890.j(mhg1Var.f().b(), obj10) || (u890.j(obj10, hrr0Var.getValue()) && mfs0Var != null)) ? ln00.b : (u890.j(obj10, mhg1Var.f().e()) || u890.j(obj10, mhg1Var.f().b())) ? ((p9m) iu30Var.invoke(eb5Var)).b : ((p9m) iu30Var.invoke(new mfs0(eb5Var, obj10, mhg1Var.f().e()))).b;
                        x340Var4.s0(objT5);
                    }
                    ln00 ln00Var = (ln00) objT5;
                    Object objT6 = x340Var4.T();
                    if (objT6 == m4cVar) {
                        objT6 = new ya5(u890.j(obj10, hrr0Var2.getValue()));
                        x340Var4.s0(objT6);
                    }
                    ya5 ya5Var = (ya5) objT6;
                    bby bbyVar = p9mVar.a;
                    h3n1 h3n1Var = new h3n1(p9mVar.c.s(), obj10);
                    ya5Var.a.setValue(Boolean.valueOf(u890.j(obj10, hrr0Var2.getValue())));
                    ya5Var.b.setValue(Boolean.valueOf((!u890.j(obj10, hrr0Var.getValue()) || u890.j(obj10, hrr0Var2.getValue()) || u890.j(obj10, mhg1Var.a.P0())) ? false : true));
                    qim0 qim0VarThen = h3n1Var.then(ya5Var);
                    mhg1 mhg1Var2 = (mhg1) obj7;
                    boolean zI3 = x340Var4.i(obj10);
                    Object objT7 = x340Var4.T();
                    if (zI3 || objT7 == m4cVar) {
                        objT7 = new sa5(obj10, (byte) 0);
                        x340Var4.s0(objT7);
                    }
                    iu30 iu30Var2 = (iu30) objT7;
                    boolean zG = x340Var4.g(ln00Var);
                    Object objT8 = x340Var4.T();
                    if (zG || objT8 == m4cVar) {
                        objT8 = new xb2(ln00Var, (byte) 17);
                        x340Var4.s0(objT8);
                    }
                    fq7.a(mhg1Var2, iu30Var2, qim0VarThen, bbyVar, ln00Var, (vu30) objT8, apo.r(1831990167, new k8(obj10, (bw91) obj6, eb5Var, (zu30) obj4, (byte) 8), x340Var4), x340Var4, 100663296);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 1:
                x340 x340Var5 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                tob1 tob1Var = (tob1) obj4;
                rin0 rin0Var = (rin0) obj3;
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    bin.a(rin0Var.e, (uy2) obj7, (ContextTrack) tob1Var.getValue(), (qim0) null, x340Var6, 0);
                    yto.a(rin0Var.f, (u961) obj5, (ContextTrack) tob1Var.getValue(), (qim0) null, x340Var6, 0);
                    pqo.a(rin0Var.g, (oj80) obj8, (qim0) null, x340Var6, 0);
                    tz2.a(rin0Var.h, (h72) obj9, (qim0) null, x340Var6, 0);
                    fz2.c(rin0Var.i, (kp5) obj6, (qim0) null, x340Var6, 0);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                d1u.a((String) obj3, (ArrayList) obj7, (String) obj5, (Function0) obj9, (iu30) obj8, (qim0) obj6, (iu30) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 3:
                ((Number) obj2).intValue();
                c680.c((c380) obj7, this.b, (iu30) obj8, (j2i) obj5, (azb) obj9, (qim0) obj6, (String) obj4, (b0k) obj, czo1.p(3073));
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                k1o1.a((ykd) obj3, (yqg) obj7, (Function0) obj5, (xid) obj8, (los) obj9, (bf4) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                hso1.j((String) obj3, (String) obj7, (String) obj5, (String) obj8, (String) obj9, (Function0) obj6, (j2i) obj4, (b0k) obj, czo1.p(1572865));
                return rih1Var;
            case 6:
                ((Number) obj2).intValue();
                c4p1.h((llw0) obj3, (String) obj7, (String) obj5, (String) obj8, (sxq0) obj9, (List) obj6, (qim0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 7:
                rih1 rih1Var2 = rih1Var;
                fih fihVar = (fih) obj4;
                x340 x340Var7 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                m4c m4cVar2 = fkj0.X;
                xhl xhlVar = (xhl) obj7;
                x340 x340Var8 = (b0k) obj9;
                if ((iIntValue3 & 11) == 2) {
                    x340 x340Var9 = x340Var7;
                    if (x340Var9.H()) {
                        x340Var9.b0();
                    } else {
                        ((ven0) obj3).setValue(rih1Var2);
                        i = ((uhl) xhlVar).b;
                        xhlVar.m();
                        x340Var = x340Var8;
                        x340Var.i0(1150087455);
                        xhl xhlVar2 = (xhl) xhlVar.l().b;
                        ihlVarK = xhlVar2.k();
                        nnb0 nnb0VarK2 = xhlVar2.k();
                        nnb0VarK = xhlVar2.k();
                        nnb0VarArr = new nnb0[]{nnb0VarK2, nnb0VarK};
                        onb0 onb0Var = new onb0(Integer.valueOf(xhlVar.f()));
                        yhcVar = new yhc(new char[0]);
                        for (i2 = 0; i2 < 2; i2++) {
                            yhcVar.n(gic.n(nnb0VarArr[i2].a().toString()));
                        }
                        eic eicVarB = xhlVar.b(onb0Var);
                        rih1Var2 = rih1Var2;
                        eicVarB.K("type", "barrier");
                        eicVarB.K("direction", "start");
                        eicVarB.J("margin", 0.0f);
                        eicVarB.I("contains", yhcVar);
                        xhlVar.i(10);
                        for (i3 = 0; i3 < 2; i3++) {
                            xhlVar.i(nnb0VarArr[i3].hashCode());
                        }
                        xhlVar.i(Float.hashCode(0.0f));
                        thlVar = new thl(((nnb0) onb0Var).a, 0, onb0Var);
                        oih oihVar = (oih) obj6;
                        iu30 iu30Var3 = (iu30) obj8;
                        uwr uwrVar = cbx.a;
                        cvx cvxVar = cbx.b(x340Var8).b;
                        nim0 nim0Var2 = nim0.a;
                        qim0 qim0VarB = uyn1.B(nim0Var2, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                        zI = x340Var.i(thlVar);
                        objT = x340Var.T();
                        if (zI || objT == m4cVar2) {
                            objT = new iih(thlVar, (byte) 0);
                            x340Var.s0(objT);
                        }
                        oihVar.i(fihVar, iu30Var3, xhl.j(qim0VarB, ihlVarK, (iu30) objT), (b0k) obj9, 0);
                        zI2 = x340Var.i(ihlVarK) | x340Var.i(nnb0VarK);
                        objT2 = x340Var.T();
                        if (zI2 || objT2 == m4cVar2) {
                            objT2 = new jih(ihlVarK, nnb0VarK, (byte) 0);
                            x340Var.s0(objT2);
                        }
                        op71.g(x340Var8, xhl.j(nim0Var2, nnb0VarK2, (iu30) objT2));
                        oih oihVar2 = (oih) obj6;
                        iu30 iu30Var4 = (iu30) obj8;
                        x340Var2 = x340Var8;
                        objT3 = x340Var2.T();
                        if (objT3 == m4cVar2) {
                            objT3 = cgh.R0;
                            x340Var2.s0(objT3);
                        }
                        oihVar2.g(fihVar, iu30Var4, xhl.j(nim0Var2, nnb0VarK, (iu30) objT3), (b0k) obj9, 0);
                        x340Var2.r(false);
                        if (((uhl) xhlVar).b != i) {
                            qxd0.S((su) obj5, x340Var7);
                        }
                    }
                } else {
                    ((ven0) obj3).setValue(rih1Var2);
                    i = ((uhl) xhlVar).b;
                    xhlVar.m();
                    x340Var = x340Var8;
                    x340Var.i0(1150087455);
                    xhl xhlVar3 = (xhl) xhlVar.l().b;
                    ihlVarK = xhlVar3.k();
                    nnb0 nnb0VarK3 = xhlVar3.k();
                    nnb0VarK = xhlVar3.k();
                    nnb0VarArr = new nnb0[]{nnb0VarK3, nnb0VarK};
                    onb0 onb0Var2 = new onb0(Integer.valueOf(xhlVar.f()));
                    yhcVar = new yhc(new char[0]);
                    while (i2 < 2) {
                        yhcVar.n(gic.n(nnb0VarArr[i2].a().toString()));
                    }
                    eic eicVarB2 = xhlVar.b(onb0Var2);
                    rih1Var2 = rih1Var2;
                    eicVarB2.K("type", "barrier");
                    eicVarB2.K("direction", "start");
                    eicVarB2.J("margin", 0.0f);
                    eicVarB2.I("contains", yhcVar);
                    xhlVar.i(10);
                    while (i3 < 2) {
                        xhlVar.i(nnb0VarArr[i3].hashCode());
                    }
                    xhlVar.i(Float.hashCode(0.0f));
                    thlVar = new thl(((nnb0) onb0Var2).a, 0, onb0Var2);
                    oih oihVar3 = (oih) obj6;
                    iu30 iu30Var5 = (iu30) obj8;
                    uwr uwrVar2 = cbx.a;
                    cvx cvxVar2 = cbx.b(x340Var8).b;
                    nim0 nim0Var3 = nim0.a;
                    qim0 qim0VarB2 = uyn1.B(nim0Var3, 0.0f, 8.0f, 0.0f, 0.0f, 13);
                    zI = x340Var.i(thlVar);
                    objT = x340Var.T();
                    if (zI) {
                        objT = new iih(thlVar, (byte) 0);
                        x340Var.s0(objT);
                    } else {
                        objT = new iih(thlVar, (byte) 0);
                        x340Var.s0(objT);
                    }
                    oihVar3.i(fihVar, iu30Var5, xhl.j(qim0VarB2, ihlVarK, (iu30) objT), (b0k) obj9, 0);
                    zI2 = x340Var.i(ihlVarK) | x340Var.i(nnb0VarK);
                    objT2 = x340Var.T();
                    if (zI2) {
                        objT2 = new jih(ihlVarK, nnb0VarK, (byte) 0);
                        x340Var.s0(objT2);
                    } else {
                        objT2 = new jih(ihlVarK, nnb0VarK, (byte) 0);
                        x340Var.s0(objT2);
                    }
                    op71.g(x340Var8, xhl.j(nim0Var3, nnb0VarK3, (iu30) objT2));
                    oih oihVar4 = (oih) obj6;
                    iu30 iu30Var6 = (iu30) obj8;
                    x340Var2 = x340Var8;
                    objT3 = x340Var2.T();
                    if (objT3 == m4cVar2) {
                        objT3 = cgh.R0;
                        x340Var2.s0(objT3);
                    }
                    oihVar4.g(fihVar, iu30Var6, xhl.j(nim0Var3, nnb0VarK, (iu30) objT3), (b0k) obj9, 0);
                    x340Var2.r(false);
                    if (((uhl) xhlVar).b != i) {
                        qxd0.S((su) obj5, x340Var7);
                    }
                }
                return rih1Var2;
            case 8:
                ((Number) obj2).intValue();
                bth.k((hob1) obj3, (xho) obj7, (hft0) obj5, (qim0) obj9, (hjv0) obj6, (njv0) obj4, (iu30) obj8, (b0k) obj, czo1.p(32833));
                return rih1Var;
            case 9:
                txj txjVar = (txj) obj9;
                x340 x340Var10 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                String str = (String) obj6;
                x340 x340Var11 = x340Var10;
                if (x340Var11.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    txjVar.a(48, apo.r(51650946, new jxj((cxc0) obj4, str, txjVar, ((List) obj8).size() + ((List) obj5).size() + ((List) obj7).size() + ((List) obj3).size() + 1), x340Var11), x340Var11, anm1.N("list_ux_platform_section_with_description: ".concat(str), nim0Var));
                } else {
                    x340Var11.b0();
                }
                return rih1Var;
            case 10:
                ((Number) obj2).intValue();
                yto.b((List) obj3, (xnk) obj7, (Function0) obj5, (iu30) obj8, (qim0) obj9, (iu30) obj6, (Function0) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 11:
                ((Number) obj2).intValue();
                pro1.d((String) obj3, (String) obj7, (iu30) obj8, (iu30) obj5, (ezc) obj9, (qim0) obj6, (a3o) obj4, (b0k) obj, czo1.p(1));
                return rih1Var;
            case 12:
                x340 x340Var12 = (b0k) obj;
                int iIntValue5 = ((Number) obj2).intValue();
                iu30 iu30Var7 = (iu30) obj9;
                ven0 ven0Var = (ven0) obj6;
                Context context = (Context) obj3;
                h5o h5oVar = (j5o) obj7;
                byte b2 = 1;
                x340 x340Var13 = x340Var12;
                if (x340Var13.Y(iIntValue5 & 1, (iIntValue5 & 3) != 2)) {
                    qim0 qim0VarB3 = s161.b(nim0Var, false, new y0o(h5oVar, context, b2));
                    iu30 iu30Var8 = (iu30) obj8;
                    if (h5oVar instanceof h5o) {
                        h5o h5oVar2 = h5oVar;
                        ArrayList<g5o> arrayList = h5oVar2.b;
                        ArrayList arrayList2 = new ArrayList(q7h.U(arrayList, 10));
                        for (g5o g5oVar : arrayList) {
                            String str2 = g5oVar.a.a;
                            String str3 = g5oVar.b;
                            arrayList2.add(new bgm0(str2, str3 != null ? new td10(str3, str2, null, null) : null));
                        }
                        c380 c380VarA = mqo1.A(arrayList2);
                        int iC = l1d.C(h5oVar2.c);
                        if (iC == 0) {
                            i4 = 1;
                        } else {
                            if (iC != 1) {
                                eg.o();
                                return null;
                            }
                            i4 = 2;
                        }
                        vgm0Var = new vgm0(i4, iu30Var8, c380VarA);
                    } else {
                        vgm0Var = wgm0.a;
                    }
                    pzn pznVar = new pzn((af10) obj5);
                    boolean zI4 = x340Var13.i(h5oVar) | x340Var13.i(context) | x340Var13.g(iu30Var7) | x340Var13.i(ven0Var);
                    Object objT9 = x340Var13.T();
                    if (zI4 || objT9 == fkj0.X) {
                        objT9 = new ggh((Object) h5oVar, (Object) context, iu30Var7, (Object) ven0Var, (byte) 12);
                        x340Var13.s0(objT9);
                    }
                    bro1.a(vgm0Var, pznVar, qim0VarB3, (iu30) objT9, x340Var13, 0);
                    jy2 jy2Var = (jy2) ven0Var.getValue();
                    if (jy2Var == null) {
                        x340Var13.i0(-920471253);
                        z = false;
                    } else {
                        z = false;
                        x340Var13.i0(-920471252);
                        ((ly2) obj4).a(jy2Var, x340Var13);
                    }
                    x340Var13.r(z);
                } else {
                    x340Var13.b0();
                }
                return rih1Var;
            case 13:
                x340 x340Var14 = (b0k) obj;
                int iIntValue6 = ((Number) obj2).intValue();
                m4c m4cVar3 = fkj0.X;
                vzq0 vzq0Var = (vzq0) obj3;
                x340 x340Var15 = x340Var14;
                boolean zY = x340Var15.Y(iIntValue6 & 1, (iIntValue6 & 3) != 2);
                j06 j06Var = x340Var15.a;
                if (!zY) {
                    x340Var15.b0();
                    return rih1Var;
                }
                View view = (View) x340Var15.k(AndroidCompositionLocals_androidKt.f);
                wat watVar = (wat) x340Var15.k(t4k.h);
                boolean zG2 = x340Var15.g(view);
                Object objT10 = x340Var15.T();
                if (zG2 || objT10 == m4cVar3) {
                    objT10 = szf0.b(view);
                    x340Var15.s0(objT10);
                }
                rzf0 rzf0Var = (rzf0) objT10;
                float fA = vzq0Var.a();
                float f2 = zjy.p(0.0f, new p3v(((rzf0Var == null || (gfn0VarA = rzf0Var.a()) == null) ? fA : watVar.M0(gfn0VarA.d(watVar))) - fA)).a;
                qim0 qim0VarD = u291.d(too1.i(uyn1.w((qim0) obj7, vzq0Var), vzq0Var), 1.0f);
                g1t g1tVar = (g1t) obj5;
                hlu hluVar = (hlu) obj9;
                hrr0 hrr0Var3 = hluVar.c;
                upb0 upb0Var = (upb0) obj6;
                iu30 iu30Var9 = (iu30) obj8;
                qvm1 qvm1Var = (qvm1) obj4;
                gra graVar = een.d;
                gfh0 gfh0VarC = t1c.c(graVar, false);
                int iHashCode = Long.hashCode(x340Var15.T);
                xos0 xos0VarM = x340Var15.m();
                qim0 qim0VarE = zr7.E(x340Var15, qim0VarD);
                hzj.A.getClass();
                if (j06Var == null) {
                    tgp1.p();
                    throw null;
                }
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                llj lljVar = y580.O0;
                nko1.H(gfh0VarC, x340Var15, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, x340Var15, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, x340Var15, lljVar3);
                nko1.F(x340Var15);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, x340Var15, lljVar4);
                Object objT11 = x340Var15.T();
                if (objT11 == m4cVar3) {
                    objT11 = v8r.q(Boolean.FALSE);
                    x340Var15.s0(objT11);
                }
                ven0 ven0Var2 = (ven0) objT11;
                Object objT12 = x340Var15.T();
                ven0 ven0Var3 = (ven0) (objT12 == m4cVar3 ? ktd.o(0.0f, x340Var15) : objT12);
                uwr uwrVar3 = cbx.a;
                cvx cvxVar3 = cbx.b(x340Var15).b;
                float f3 = p3v.b(((p3v) ven0Var3.getValue()).a, 0.0f) > 0 ? ((p3v) ven0Var3.getValue()).a + 12.0f : 0.0f;
                tvb0 tvb0Var = g1tVar.c;
                List list = (List) hrr0Var3.getValue();
                qim0 qim0VarN = anm1.N("your_library_list_test_tag", u291.d(nim0Var, 1.0f));
                i4d0 i4d0Var = (i4d0) hluVar.d.getValue();
                zzq0 zzq0VarJ = uyn1.j(0.0f, 0.0f, 0.0f, f2 + f3, 7);
                boolean zBooleanValue = ((Boolean) ven0Var2.getValue()).booleanValue();
                boolean zG3 = x340Var15.g(hluVar);
                Object objT13 = x340Var15.T();
                if (zG3 || objT13 == m4cVar3) {
                    objT13 = new vas(hluVar, (byte) 24);
                    x340Var15.s0(objT13);
                }
                oqn1.f(list, i4d0Var, upb0Var, qim0VarN, iu30Var9, zzq0VarJ, (iu30) objT13, zBooleanValue, tvb0Var, x340Var15, 3072, 0);
                Object objT14 = x340Var15.T();
                if (objT14 == m4cVar3) {
                    objT14 = yv91.a(new ppk(upb0Var, (byte) 2));
                    x340Var15.s0(objT14);
                }
                tob1 tob1Var2 = (tob1) objT14;
                Object objT15 = x340Var15.T();
                if (objT15 == m4cVar3) {
                    objT15 = v8r.q("");
                    x340Var15.s0(objT15);
                }
                ven0 ven0Var4 = (ven0) objT15;
                Integer numValueOf2 = Integer.valueOf(((Number) tob1Var2.getValue()).intValue());
                List list2 = (List) hrr0Var3.getValue();
                boolean zG4 = x340Var15.g(hluVar) | x340Var15.i(g1tVar);
                Object objT16 = x340Var15.T();
                if (zG4 || objT16 == m4cVar3) {
                    objT16 = new sr1(hluVar, tob1Var2, g1tVar, ven0Var4, (lnm) null, (byte) 12);
                    x340Var15.s0(objT16);
                }
                qxd0.s(numValueOf2, list2, (vu30) objT16, x340Var15);
                int i5 = qvm1Var.b;
                h2c h2cVar = h2c.a;
                if (i5 > 30) {
                    x340Var15.i0(-1245317665);
                    String str4 = (String) ven0Var4.getValue();
                    boolean zI5 = x340Var15.i(g1tVar);
                    Object objT17 = x340Var15.T();
                    if (zI5 || objT17 == m4cVar3) {
                        objT17 = new l1k(0, g1tVar, g1t.class, "currentTimeProvider", "currentTimeProvider()J", 0, (byte) 29);
                        x340Var15.s0(objT17);
                    }
                    int i6 = qvm1Var.h;
                    f = f2;
                    qim0 qim0VarB4 = uyn1.B(h2cVar.a(nim0Var, een.f), 0.0f, 0.0f, 0.0f, f, 7);
                    Function0 function0 = (nla0) objT17;
                    Object objT18 = x340Var15.T();
                    if (objT18 == m4cVar3) {
                        objT18 = new bzm(ven0Var2, (byte) 26);
                        x340Var15.s0(objT18);
                    }
                    zko1.h(upb0Var, str4, function0, qim0VarB4, i6, (iu30) objT18, x340Var15, 1572870);
                    x340Var15.r(false);
                } else {
                    f = f2;
                    x340Var15.i0(-1244872102);
                    x340Var15.r(false);
                }
                ven0 ven0VarS = v8r.s(iu30Var9, x340Var15);
                Object objT19 = x340Var15.T();
                if (objT19 == m4cVar3) {
                    pns pnsVar = new pns(new bzm(ven0VarS, (byte) 27), ((lvq) g1tVar.k.a.c).c());
                    x340Var15.s0(pnsVar);
                    objT19 = pnsVar;
                }
                pns pnsVar2 = (pns) objT19;
                qim0 qim0VarB5 = uyn1.B(h2cVar.a(nim0Var, een.t), 0.0f, 0.0f, 0.0f, f + 12.0f, 7);
                boolean zG5 = x340Var15.g(watVar);
                Object objT20 = x340Var15.T();
                if (zG5 || objT20 == m4cVar3) {
                    objT20 = new kxl(watVar, ven0Var3, (byte) 1);
                    x340Var15.s0(objT20);
                }
                qim0 qim0VarU = lrn1.u(qim0VarB5, (iu30) objT20);
                gfh0 gfh0VarC2 = t1c.c(graVar, false);
                int iHashCode2 = Long.hashCode(x340Var15.T);
                xos0 xos0VarM2 = x340Var15.m();
                qim0 qim0VarE2 = zr7.E(x340Var15, qim0VarU);
                x340Var15.m0();
                if (x340Var15.S) {
                    x340Var15.l(n4kVar);
                } else {
                    x340Var15.v0();
                }
                nko1.H(gfh0VarC2, x340Var15, lljVar);
                nko1.H(xos0VarM2, x340Var15, lljVar2);
                x0d.q(iHashCode2, x340Var15, lljVar3, x340Var15);
                nko1.H(qim0VarE2, x340Var15, lljVar4);
                otw.c(pnsVar2, fx51.a, (qim0) null, (ipb1) null, x340Var15, 48, 12);
                x340Var15.r(true);
                x340Var15.r(true);
                return rih1Var;
            case 14:
                ((Number) obj2).intValue();
                e130.d((ji0) obj3, (j2i) obj7, (Function0) obj5, (Function0) obj8, (Function0) obj9, (Function0) obj6, (qim0) obj4, (b0k) obj, czo1.p(49));
                return rih1Var;
            case 15:
                x340 x340Var16 = (b0k) obj;
                int iIntValue7 = ((Number) obj2).intValue();
                x340 x340Var17 = x340Var16;
                boolean zY2 = x340Var17.Y(iIntValue7 & 1, (iIntValue7 & 3) != 2);
                j06 j06Var2 = x340Var17.a;
                rih1 rih1Var3 = rih1.a;
                if (zY2) {
                    nim0 nim0Var4 = nim0.a;
                    qim0 qim0VarD2 = u291.d(nim0Var4, 1.0f);
                    y7e1 y7e1Var = (y7e1) obj3;
                    String str5 = (String) obj7;
                    bou bouVar = (bou) obj5;
                    iu30 iu30Var10 = (iu30) obj8;
                    zeu zeuVar = (zeu) obj9;
                    tm tmVar = (tm) obj6;
                    ngs0 ngs0Var = (ngs0) obj4;
                    era eraVar = een.P0;
                    f36 f36Var = h36.c;
                    mbh mbhVarA = jbh.a(f36Var, eraVar, x340Var17, 0);
                    int iHashCode3 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM3 = x340Var17.m();
                    qim0 qim0VarE3 = zr7.E(x340Var17, qim0VarD2);
                    hzj.A.getClass();
                    if (j06Var2 == null) {
                        tgp1.p();
                        throw null;
                    }
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    llj lljVar5 = y580.O0;
                    nko1.H(mbhVarA, x340Var17, lljVar5);
                    llj lljVar6 = y580.N0;
                    nko1.H(xos0VarM3, x340Var17, lljVar6);
                    Integer numValueOf3 = Integer.valueOf(iHashCode3);
                    llj lljVar7 = y580.R0;
                    nko1.H(numValueOf3, x340Var17, lljVar7);
                    nko1.F(x340Var17);
                    llj lljVar8 = y580.Y;
                    nko1.H(qim0VarE3, x340Var17, lljVar8);
                    pbh pbhVar = pbh.a;
                    qim0 qim0VarH = l6o1.H(bmq0.L(pbhVar.a(1.0f, nim0Var4, true), k1o1.q(x340Var17), (g6o0) null), l6o1.C(0, 0, 1, x340Var17), false, 14);
                    mbh mbhVarA2 = jbh.a(f36Var, eraVar, x340Var17, 0);
                    int iHashCode4 = Long.hashCode(x340Var17.T);
                    xos0 xos0VarM4 = x340Var17.m();
                    qim0 qim0VarE4 = zr7.E(x340Var17, qim0VarH);
                    x340Var17.m0();
                    if (x340Var17.S) {
                        x340Var17.l(n4kVar);
                    } else {
                        x340Var17.v0();
                    }
                    nko1.H(mbhVarA2, x340Var17, lljVar5);
                    nko1.H(xos0VarM4, x340Var17, lljVar6);
                    x0d.q(iHashCode4, x340Var17, lljVar7, x340Var17);
                    nko1.H(qim0VarE4, x340Var17, lljVar8);
                    boolean z2 = bouVar.a;
                    boolean z3 = bouVar.i;
                    if (z2 && z3) {
                        x340Var17.i0(1104760700);
                        uwr uwrVar4 = cbx.a;
                        cvx cvxVar4 = cbx.b(x340Var17).b;
                        otw.c(tmVar, rih1Var3, uyn1.B(nim0Var4, 16.0f, 0.0f, 0.0f, 0.0f, 14), (ipb1) null, x340Var17, 48, 8);
                        pxd0.r(0, bouVar.d, x340Var17, null);
                        x340Var17.r(false);
                    } else {
                        x340Var17.i0(1104986535);
                        x340Var17.r(false);
                    }
                    op71.g(x340Var17, pbhVar.a(1.0f, (qim0) 
                    /*  JADX ERROR: Method code generation error
                        jadx.core.utils.exceptions.CodegenException: Error generate insn: 0x0315: INVOKE 
                          (r0v45 'x340Var17' p.x340)
                          (wrap p.qim0:0x0311: INVOKE (r5v44 'pbhVar' p.pbh), (1.0f float), (wrap p.qim0:?: CAST (p.qim0) (r29v7 ?? I:??[OBJECT, ARRAY])), true VIRTUAL call: p.pbh.a(float, p.qim0, boolean):p.qim0 A[WRAPPED] (LINE:786))
                         STATIC call: p.op71.g(p.b0k, p.qim0):void (LINE:790) in method: p.ta5.invoke(java.lang.Object, java.lang.Object):java.lang.Object, file: /workspace/spotify-analysis/dex-input/classes7.dex
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:310)
                        	at jadx.core.codegen.InsnGen.makeInsn(InsnGen.java:273)
                        	at jadx.core.codegen.RegionGen.makeSimpleBlock(RegionGen.java:94)
                        	at jadx.core.dex.nodes.IBlock.generate(IBlock.java:15)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeIf(RegionGen.java:126)
                        	at jadx.core.dex.regions.conditions.IfRegion.generate(IfRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.RegionGen.makeRegionIndent(RegionGen.java:83)
                        	at jadx.core.codegen.RegionGen.makeSwitch(RegionGen.java:267)
                        	at jadx.core.dex.regions.SwitchRegion.generate(SwitchRegion.java:90)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.dex.regions.Region.generate(Region.java:35)
                        	at jadx.core.codegen.RegionGen.makeRegion(RegionGen.java:66)
                        	at jadx.core.codegen.MethodGen.addRegionInsns(MethodGen.java:291)
                        	at jadx.core.codegen.MethodGen.addInstructions(MethodGen.java:270)
                        	at jadx.core.codegen.ClassGen.addMethodCode(ClassGen.java:420)
                        	at jadx.core.codegen.ClassGen.addMethod(ClassGen.java:345)
                        	at jadx.core.codegen.ClassGen.lambda$addInnerClsAndMethods$3(ClassGen.java:299)
                        	at java.base/java.util.stream.ForEachOps$ForEachOp$OfRef.accept(ForEachOps.java:184)
                        	at java.base/java.util.ArrayList.forEach(ArrayList.java:1596)
                        	at java.base/java.util.stream.SortedOps$RefSortingSink.end(SortedOps.java:395)
                        	at java.base/java.util.stream.Sink$ChainedReference.end(Sink.java:261)
                        Caused by: jadx.core.utils.exceptions.JadxRuntimeException: Code variable not set in r29v7 ??
                        	at jadx.core.dex.instructions.args.SSAVar.getCodeVar(SSAVar.java:236)
                        */
                    /*
                        Method dump skipped, instruction units count: 3774
                        To view this dump change 'Code comments level' option to 'DEBUG'
                    */
                    throw new UnsupportedOperationException("Method not decompiled: p.ta5.invoke(java.lang.Object, java.lang.Object):java.lang.Object");
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ta5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, int i, byte b) {
                    super(2);
                    this.a = b;
                    this.b = obj;
                    this.c = obj2;
                    this.d = obj3;
                    this.e = obj4;
                    this.f = obj5;
                    this.g = obj6;
                    this.h = obj7;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ta5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, iu30 iu30Var, byte b) {
                    super(2);
                    this.a = b;
                    this.b = obj;
                    this.c = obj2;
                    this.d = obj3;
                    this.f = obj4;
                    this.g = obj5;
                    this.h = obj6;
                    this.e = iu30Var;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ta5(Object obj, Object obj2, iu30 iu30Var, Object obj3, Object obj4, Object obj5, Object obj6, byte b) {
                    super(2);
                    this.a = b;
                    this.b = obj;
                    this.c = obj2;
                    this.e = iu30Var;
                    this.d = obj3;
                    this.f = obj4;
                    this.g = obj5;
                    this.h = obj6;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ta5(Object obj, Object obj2, iu30 iu30Var, cv30 cv30Var, Object obj3, Object obj4, Object obj5, int i, byte b) {
                    super(2);
                    this.a = b;
                    this.b = obj;
                    this.c = obj2;
                    this.e = iu30Var;
                    this.d = cv30Var;
                    this.f = obj3;
                    this.g = obj4;
                    this.h = obj5;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta5(String str, ArrayList arrayList, String str2, Function0 function0, iu30 iu30Var, qim0 qim0Var, iu30 iu30Var2, int i) {
                    super(2);
                    this.a = (byte) 2;
                    this.b = str;
                    this.c = arrayList;
                    this.d = str2;
                    this.f = function0;
                    this.e = iu30Var;
                    this.g = qim0Var;
                    this.h = iu30Var2;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public /* synthetic */ ta5(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7, byte b) {
                    super(2);
                    this.a = b;
                    this.b = obj;
                    this.c = obj2;
                    this.d = obj3;
                    this.e = obj4;
                    this.f = obj5;
                    this.g = obj6;
                    this.h = obj7;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta5(c380 c380Var, Object obj, iu30 iu30Var, j2i j2iVar, azb azbVar, qim0 qim0Var, String str, int i) {
                    super(2);
                    this.a = (byte) 3;
                    this.c = c380Var;
                    this.b = obj;
                    this.e = iu30Var;
                    this.d = j2iVar;
                    this.f = azbVar;
                    this.g = qim0Var;
                    this.h = str;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta5(xkf0 xkf0Var, iu30 iu30Var, r9u0 r9u0Var, xym xymVar, iu30 iu30Var2, j2i j2iVar, vu30 vu30Var) {
                    super(2);
                    this.a = (byte) 29;
                    this.b = xkf0Var;
                    this.e = iu30Var;
                    this.c = r9u0Var;
                    this.d = xymVar;
                    this.f = iu30Var2;
                    this.g = j2iVar;
                    this.h = vu30Var;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta5(vzq0 vzq0Var, qim0 qim0Var, g1t g1tVar, hlu hluVar, upb0 upb0Var, iu30 iu30Var, qvm1 qvm1Var) {
                    super(2);
                    this.a = (byte) 13;
                    this.b = vzq0Var;
                    this.c = qim0Var;
                    this.d = g1tVar;
                    this.f = hluVar;
                    this.g = upb0Var;
                    this.e = iu30Var;
                    this.h = qvm1Var;
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public ta5(hob1 hob1Var, xho xhoVar, hft0 hft0Var, qim0 qim0Var, hjv0 hjv0Var, njv0 njv0Var, iu30 iu30Var, int i) {
                    super(2);
                    this.a = (byte) 8;
                    this.b = hob1Var;
                    this.c = xhoVar;
                    this.d = hft0Var;
                    this.f = qim0Var;
                    this.g = hjv0Var;
                    this.h = njv0Var;
                    this.e = iu30Var;
                }
            }
