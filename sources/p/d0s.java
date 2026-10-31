package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.FullscreenTemplate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class d0s extends hab0 implements xu30 {
    public final /* synthetic */ es41 a;
    public final /* synthetic */ zaj0 b;
    public final /* synthetic */ FullscreenTemplate.BaseFullscreen c;
    public final /* synthetic */ iu30 d;
    public final /* synthetic */ float e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0s(es41 es41Var, zaj0 zaj0Var, FullscreenTemplate.BaseFullscreen baseFullscreen, iu30 iu30Var, float f, f0s f0sVar) {
        super(3);
        this.a = es41Var;
        this.b = zaj0Var;
        this.c = baseFullscreen;
        this.d = iu30Var;
        this.e = f;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        boolean z;
        MessageTemplate messageTemplate;
        x340 x340Var;
        boolean z2;
        boolean z3;
        Button button;
        float f;
        i2c i2cVar = (i2c) obj;
        b0k b0kVar = (b0k) obj2;
        ((Number) obj3).intValue();
        m4c m4cVar = fkj0.X;
        float fC = i2cVar.c();
        float fD = i2cVar.d();
        nim0 nim0Var = nim0.a;
        qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), this.a, false, 14);
        era eraVar = een.Q0;
        f36 f36Var = h36.c;
        mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar, 0);
        x340 x340Var2 = (x340) b0kVar;
        int iHashCode = Long.hashCode(x340Var2.T);
        xos0 xos0VarM = x340Var2.m();
        qim0 qim0VarE = zr7.E(b0kVar, qim0VarH);
        hzj.A.getClass();
        x340 x340Var3 = (x340) b0kVar;
        Float fValueOf = null;
        if (x340Var3.a == null) {
            tgp1.p();
            throw null;
        }
        x340Var3.m0();
        boolean z4 = x340Var3.S;
        n4k n4kVar = hmb0.t1;
        if (z4) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        llj lljVar = y580.O0;
        nko1.H(mbhVarA, b0kVar, lljVar);
        llj lljVar2 = y580.N0;
        nko1.H(xos0VarM, b0kVar, lljVar2);
        Integer numValueOf = Integer.valueOf(iHashCode);
        llj lljVar3 = y580.R0;
        nko1.H(numValueOf, b0kVar, lljVar3);
        nko1.F(b0kVar);
        llj lljVar4 = y580.Y;
        nko1.H(qim0VarE, b0kVar, lljVar4);
        qim0 qim0VarJ = u291.j(fC, 0.0f, 2, u291.f(nim0Var, 1.0f));
        zaj0 zaj0Var = this.b;
        ContentAlignment contentAlignment = zaj0Var.i;
        Button button2 = zaj0Var.f;
        AccessoryContentSize accessoryContentSize = zaj0Var.h;
        gfh0 gfh0VarC = t1c.c(d2t.a[contentAlignment.ordinal()] == 1 ? een.X : een.h, false);
        int iHashCode2 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM2 = x340Var3.m();
        qim0 qim0VarE2 = zr7.E(b0kVar, qim0VarJ);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(gfh0VarC, b0kVar, lljVar);
        nko1.H(xos0VarM2, b0kVar, lljVar2);
        i3a.l(iHashCode2, b0kVar, lljVar3, b0kVar);
        nko1.H(qim0VarE2, b0kVar, lljVar4);
        qim0 qim0VarF = u291.f(nim0Var, 1.0f);
        mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar, 0);
        int iHashCode3 = Long.hashCode(x340Var3.T);
        xos0 xos0VarM3 = x340Var3.m();
        qim0 qim0VarE3 = zr7.E(b0kVar, qim0VarF);
        x340Var3.m0();
        if (x340Var3.S) {
            x340Var3.l(n4kVar);
        } else {
            x340Var3.v0();
        }
        nko1.H(mbhVarA2, b0kVar, lljVar);
        nko1.H(xos0VarM3, b0kVar, lljVar2);
        i3a.l(iHashCode3, b0kVar, lljVar3, b0kVar);
        nko1.H(qim0VarE3, b0kVar, lljVar4);
        zaj0 zaj0Var2 = zaj0Var;
        AccessoryContent accessoryContent = zaj0Var2.b;
        MessageTemplate messageTemplate2 = this.c;
        if (accessoryContent == null) {
            x340Var3.i0(2051336526);
            z2 = false;
            x340Var3.r(false);
            zaj0Var2 = zaj0Var2;
            messageTemplate = messageTemplate2;
            x340Var = x340Var3;
            z = true;
        } else {
            x340Var3.i0(2051336527);
            AccessoryContentSize accessoryContentSizeM = fyo1.m(accessoryContentSize, this.e);
            if ((accessoryContent instanceof AccessoryContent.Image) && accessoryContentSizeM == null) {
                x340Var3.i0(-131204662);
                z2 = false;
                x340Var3.r(false);
                messageTemplate = messageTemplate2;
                x340Var = x340Var3;
                z = true;
            } else {
                x340Var3.i0(-131804326);
                if (accessoryContentSizeM != null) {
                    accessoryContentSize = accessoryContentSizeM;
                }
                int i = e0s.a[accessoryContentSize.ordinal()];
                z = true;
                if (i == 1) {
                    fValueOf = Float.valueOf(1.0f);
                } else if (i == 2) {
                    fValueOf = Float.valueOf(0.75f);
                } else if (i == 3) {
                    fValueOf = Float.valueOf(0.62f);
                } else if (i == 4) {
                    fValueOf = Float.valueOf(0.22f);
                } else if (i != 5) {
                    eg.o();
                    return null;
                }
                float f2 = yoi1.m(new p3v(fValueOf != null ? fValueOf.floatValue() * fD : 150.0f), new p3v(0.5f * fC)).a;
                uwr uwrVar = cbx.a;
                zov0 zov0Var = cbx.b(b0kVar).g;
                cua cuaVar = cbx.b(b0kVar).f;
                messageTemplate = messageTemplate2;
                x340Var = x340Var3;
                y9j0.a(accessoryContent, messageTemplate, null, null, f2, 48.0f, null, 8.0f, b0kVar, AccessoryContent.$stable, 76);
                b0kVar = b0kVar;
                op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
                z2 = false;
                x340Var.r(false);
            }
            x340Var.r(z2);
        }
        MessageText messageText = zaj0Var2.c;
        uwr uwrVar2 = cbx.a;
        lee1 lee1Var = cbx.d(b0kVar).d;
        boolean z5 = z;
        int i2 = MessageText.$stable;
        MessageTemplate messageTemplate3 = messageTemplate;
        bjc0 bjc0Var = bjc0.a;
        y9j0.i(0, 0, i2, 484, messageTemplate3, messageText, null, b0kVar, null, bjc0Var, null, lee1Var);
        cvx cvxVar = cbx.b(b0kVar).b;
        op71.g(b0kVar, u291.r(nim0Var, 12.0f));
        y9j0.b(0, 0, i2, 484, messageTemplate3, zaj0Var2.d, null, b0kVar, null, bjc0Var, null, cbx.d(b0kVar).g);
        op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
        Button button3 = zaj0Var2.e;
        qim0 qim0VarN = anm1.N("messaging-fullscreen-primary-button", nim0Var);
        iu30 iu30Var = this.d;
        boolean zG = x340Var.g(iu30Var) | x340Var.i(zaj0Var2);
        Object objT = x340Var.T();
        if (zG || objT == m4cVar) {
            objT = new nxr(iu30Var, zaj0Var2, (byte) 3);
            x340Var.s0(objT);
        }
        int i3 = Button.$stable;
        y9j0.e(button3, messageTemplate3, qim0VarN, null, null, bjc0Var, (Function0) objT, b0kVar, i3, 24);
        if (button2 == null) {
            x340Var.i0(2053370498);
            z3 = false;
            x340Var.r(false);
            button = button2;
        } else {
            z3 = false;
            x340Var.i0(2053370499);
            op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
            qim0 qim0VarN2 = anm1.N("messaging-fullscreen-secondary-button", nim0Var);
            boolean zG2 = x340Var.g(iu30Var) | x340Var.i(button2);
            Object objT2 = x340Var.T();
            if (zG2 || objT2 == m4cVar) {
                objT2 = new u5a(iu30Var, button2, (byte) 10);
                x340Var.s0(objT2);
            }
            button = button2;
            y9j0.e(button, messageTemplate3, qim0VarN2, null, null, bjc0Var, (Function0) objT2, b0kVar, i3, 24);
            x340Var.r(false);
        }
        Disclaimer disclaimer = zaj0Var2.g;
        if (disclaimer == null) {
            x340Var.i0(2053947067);
            x340Var.r(z3);
        } else {
            x340Var.i0(2053947068);
            if (button != null) {
                x340Var.i0(-468231567);
                cvx cvxVar2 = cbx.b(b0kVar).b;
                x340Var.r(z3);
                f = 16.0f;
            } else {
                x340Var.i0(-468149138);
                f = cbx.b(b0kVar).b.b;
                x340Var.r(z3);
            }
            op71.g(b0kVar, u291.r(nim0Var, f));
            boolean zI = x340Var.i(disclaimer) | x340Var.g(iu30Var);
            Object objT3 = x340Var.T();
            if (zI || objT3 == m4cVar) {
                objT3 = new s5a(disclaimer, iu30Var, (byte) 2);
                x340Var.s0(objT3);
            }
            y9j0.f(disclaimer, messageTemplate3, null, null, bjc0Var, 0, 0, null, (Function0) objT3, null, b0kVar, Disclaimer.$stable, 748);
            x340Var.r(z3);
        }
        us71.m(x340Var, z5, z5, z5);
        return rih1.a;
    }
}
