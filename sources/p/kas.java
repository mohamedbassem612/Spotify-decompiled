package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContent;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.AccessoryContentSize;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ContentAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Disclaimer;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.MessageText;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class kas extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ float b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kas(ce6 ce6Var, rk41 rk41Var, float f, vu30 vu30Var, ven0 ven0Var) {
        super(3);
        this.c = ce6Var;
        this.d = rk41Var;
        this.b = f;
        this.e = vu30Var;
        this.f = ven0Var;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        b0k b0kVar;
        boolean z;
        iu30 iu30Var;
        m4c m4cVar;
        boolean z2;
        float f;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj4 = this.f;
        Object obj5 = this.d;
        Object obj6 = this.e;
        Object obj7 = this.c;
        switch (b) {
            case 0:
                i2c i2cVar = (i2c) obj;
                b0k b0kVar2 = (b0k) obj2;
                ((Number) obj3).intValue();
                m4c m4cVar2 = fkj0.X;
                float fC = i2cVar.c();
                float fD = i2cVar.d();
                nim0 nim0Var = nim0.a;
                qim0 qim0VarH = l6o1.H(u291.d(nim0Var, 1.0f), (es41) obj7, false, 14);
                era eraVar = een.Q0;
                cdj0 cdj0Var = (cdj0) obj5;
                MessageTemplate messageTemplate = (ModalTemplate) obj6;
                iu30 iu30Var2 = (iu30) obj4;
                f36 f36Var = h36.c;
                mbh mbhVarA = jbh.a(f36Var, eraVar, b0kVar2, 0);
                x340 x340Var = (x340) b0kVar2;
                int iHashCode = Long.hashCode(x340Var.T);
                xos0 xos0VarM = x340Var.m();
                qim0 qim0VarE = zr7.E(b0kVar2, qim0VarH);
                hzj.A.getClass();
                x340 x340Var2 = (x340) b0kVar2;
                if (x340Var2.a == null) {
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
                nko1.H(mbhVarA, b0kVar2, lljVar);
                llj lljVar2 = y580.N0;
                nko1.H(xos0VarM, b0kVar2, lljVar2);
                Integer numValueOf = Integer.valueOf(iHashCode);
                llj lljVar3 = y580.R0;
                nko1.H(numValueOf, b0kVar2, lljVar3);
                nko1.F(b0kVar2);
                llj lljVar4 = y580.Y;
                nko1.H(qim0VarE, b0kVar2, lljVar4);
                qim0 qim0VarJ = u291.j(fC, 0.0f, 2, u291.f(nim0Var, 1.0f));
                ContentAlignment contentAlignment = cdj0Var.i;
                Button button = cdj0Var.f;
                AccessoryContentSize accessoryContentSize = cdj0Var.h;
                Button button2 = button;
                gfh0 gfh0VarC = t1c.c(d2t.a[contentAlignment.ordinal()] == 1 ? een.X : een.h, false);
                int iHashCode2 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM2 = x340Var2.m();
                qim0 qim0VarE2 = zr7.E(b0kVar2, qim0VarJ);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(gfh0VarC, b0kVar2, lljVar);
                nko1.H(xos0VarM2, b0kVar2, lljVar2);
                i3a.l(iHashCode2, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE2, b0kVar2, lljVar4);
                qim0 qim0VarF = u291.f(nim0Var, 1.0f);
                mbh mbhVarA2 = jbh.a(f36Var, eraVar, b0kVar2, 0);
                int iHashCode3 = Long.hashCode(x340Var2.T);
                xos0 xos0VarM3 = x340Var2.m();
                qim0 qim0VarE3 = zr7.E(b0kVar2, qim0VarF);
                x340Var2.m0();
                if (x340Var2.S) {
                    x340Var2.l(n4kVar);
                } else {
                    x340Var2.v0();
                }
                nko1.H(mbhVarA2, b0kVar2, lljVar);
                nko1.H(xos0VarM3, b0kVar2, lljVar2);
                i3a.l(iHashCode3, b0kVar2, lljVar3, b0kVar2);
                nko1.H(qim0VarE3, b0kVar2, lljVar4);
                AccessoryContent accessoryContent = cdj0Var.b;
                if (accessoryContent == null) {
                    x340Var2.i0(1568259163);
                    z = false;
                    x340Var2.r(false);
                    b0kVar = b0kVar2;
                } else {
                    x340Var2.i0(1568259164);
                    AccessoryContentSize accessoryContentSizeM = fyo1.m(accessoryContentSize, this.b);
                    if ((accessoryContent instanceof AccessoryContent.Image) && accessoryContentSizeM == null) {
                        x340Var2.i0(1747650263);
                        z = false;
                        x340Var2.r(false);
                        b0kVar = b0kVar2;
                    } else {
                        x340Var2.i0(1747050599);
                        if (accessoryContentSizeM != null) {
                            accessoryContentSize = accessoryContentSizeM;
                        }
                        float f2 = yoi1.m(new p3v((mas.a[accessoryContentSize.ordinal()] == 1 ? 0.22f : 0.62f) * fD), new p3v(fC * 0.5f)).a;
                        uwr uwrVar = cbx.a;
                        zov0 zov0Var = cbx.b(b0kVar2).g;
                        cua cuaVar = cbx.b(b0kVar2).f;
                        y9j0.a(accessoryContent, messageTemplate, null, null, f2, 48.0f, null, 8.0f, b0kVar2, AccessoryContent.$stable | (ModalTemplate.$stable << 3), 76);
                        b0kVar = b0kVar2;
                        op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
                        z = false;
                        x340Var2.r(false);
                    }
                    x340Var2.r(z);
                }
                MessageText messageText = cdj0Var.c;
                djc0 djc0Var = bjc0.a;
                if (messageText == null) {
                    x340Var2.i0(1569176763);
                    x340Var2.r(z);
                } else {
                    x340Var2.i0(1569176764);
                    uwr uwrVar2 = cbx.a;
                    y9j0.i(0, 0, MessageText.$stable | (ModalTemplate.$stable << 3), 484, messageTemplate, messageText, null, b0kVar, null, djc0Var, null, cbx.d(b0kVar).d);
                    messageTemplate = messageTemplate;
                    djc0Var = djc0Var;
                    cvx cvxVar = cbx.b(b0kVar).b;
                    op71.g(b0kVar, u291.r(nim0Var, 12.0f));
                    x340Var2.r(false);
                }
                MessageText messageText2 = cdj0Var.d;
                uwr uwrVar3 = cbx.a;
                lee1 lee1Var = cbx.d(b0kVar).g;
                int i = MessageText.$stable;
                int i2 = ModalTemplate.$stable << 3;
                MessageTemplate messageTemplate2 = messageTemplate;
                djc0 djc0Var2 = djc0Var;
                y9j0.b(0, 0, i | i2, 484, messageTemplate2, messageText2, null, b0kVar, null, djc0Var2, null, lee1Var);
                Button button3 = cdj0Var.e;
                if (button3 == null) {
                    x340Var2.i0(1569775621);
                    z2 = false;
                    x340Var2.r(false);
                    m4cVar = m4cVar2;
                } else {
                    x340Var2.i0(1569775622);
                    op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
                    qim0 qim0VarN = anm1.N("messaging-modal-primary-button", nim0Var);
                    boolean zG = x340Var2.g(iu30Var) | x340Var2.i(button3);
                    Object objT = x340Var2.T();
                    if (zG) {
                        iu30Var = iu30Var2;
                        m4cVar = m4cVar2;
                    } else {
                        m4cVar = m4cVar2;
                        if (objT == m4cVar) {
                        }
                        iu30Var = iu30Var2;
                        y9j0.e(button3, messageTemplate2, qim0VarN, null, null, djc0Var2, (Function0) objT, b0kVar, Button.$stable | i2, 24);
                        z2 = false;
                        x340Var2.r(false);
                    }
                    iu30Var = iu30Var2;
                    objT = new u5a(iu30Var, button3, (byte) 11);
                    x340Var2.s0(objT);
                    iu30Var = iu30Var2;
                    y9j0.e(button3, messageTemplate2, qim0VarN, null, null, djc0Var2, (Function0) objT, b0kVar, Button.$stable | i2, 24);
                    z2 = false;
                    x340Var2.r(false);
                }
                if (button2 == null) {
                    iu30Var = iu30Var2;
                    x340Var2.i0(1570295553);
                    x340Var2.r(z2);
                } else {
                    x340Var2.i0(1570295554);
                    op71.g(b0kVar, u291.r(nim0Var, cbx.b(b0kVar).b.b));
                    qim0 qim0VarN2 = anm1.N("messaging-modal-secondary-button", nim0Var);
                    boolean zG2 = x340Var2.g(iu30Var) | x340Var2.i(button2);
                    Object objT2 = x340Var2.T();
                    if (zG2 || objT2 == m4cVar) {
                        iu30Var = iu30Var2;
                        objT2 = new u5a(iu30Var, button2, (byte) 12);
                        x340Var2.s0(objT2);
                    }
                    y9j0.e(button2, messageTemplate2, qim0VarN2, null, null, djc0Var2, (Function0) objT2, b0kVar, Button.$stable | i2, 24);
                    button2 = button2;
                    z2 = false;
                    x340Var2.r(false);
                }
                Disclaimer disclaimer = cdj0Var.g;
                if (disclaimer == null) {
                    x340Var2.i0(1570822553);
                    x340Var2.r(z2);
                } else {
                    x340Var2.i0(1570822554);
                    if (button2 != null) {
                        x340Var2.i0(1347813564);
                        cvx cvxVar2 = cbx.b(b0kVar).b;
                        x340Var2.r(z2);
                        f = 16.0f;
                    } else {
                        x340Var2.i0(1347895993);
                        f = cbx.b(b0kVar).b.b;
                        x340Var2.r(z2);
                    }
                    op71.g(b0kVar, u291.r(nim0Var, f));
                    boolean zI = x340Var2.i(disclaimer) | x340Var2.g(iu30Var);
                    Object objT3 = x340Var2.T();
                    if (zI || objT3 == m4cVar) {
                        objT3 = new s5a(disclaimer, iu30Var, (byte) 3);
                        x340Var2.s0(objT3);
                    }
                    y9j0.f(disclaimer, messageTemplate2, null, null, djc0Var2, 0, 0, null, (Function0) objT3, null, b0kVar, Disclaimer.$stable | i2, 748);
                    x340Var2.r(false);
                }
                us71.m(x340Var2, true, true, true);
                return rih1Var;
            default:
                ce6 ce6Var = (ce6) obj7;
                l7f1 l7f1Var = (l7f1) ce6Var.c;
                nbh nbhVar = (nbh) obj;
                x340 x340Var3 = (b0k) obj2;
                int iIntValue = ((Number) obj3).intValue();
                m4c m4cVar3 = fkj0.X;
                vu30 vu30Var = (vu30) obj6;
                rk41 rk41Var = (rk41) obj5;
                if ((iIntValue & 6) == 0) {
                    iIntValue |= x340Var3.g(nbhVar) ? 4 : 2;
                }
                x340 x340Var4 = x340Var3;
                if (!x340Var4.Y(iIntValue & 1, (iIntValue & 19) != 18)) {
                    x340Var4.b0();
                } else if (l7f1Var.c.isEmpty()) {
                    ((xgm1) rk41Var.c).a(fgm1.a);
                } else {
                    int i3 = iIntValue;
                    c380 c380Var = l7f1Var.c;
                    boolean z4 = rk41Var.a;
                    boolean zG3 = x340Var4.g(vu30Var);
                    Object objT4 = x340Var4.T();
                    if (zG3 || objT4 == m4cVar3) {
                        objT4 = new pm0(vu30Var, (byte) 8);
                        x340Var4.s0(objT4);
                    }
                    ce6Var.e(nbhVar, c380Var, this.b, z4, (iu30) objT4, x340Var4, (i3 & 14) | 64);
                    c380 c380Var2 = l7f1Var.c;
                    boolean z5 = rk41Var.a;
                    Integer num = (Integer) ((ven0) obj4).getValue();
                    boolean zG4 = x340Var4.g(vu30Var);
                    Object objT5 = x340Var4.T();
                    if (zG4 || objT5 == m4cVar3) {
                        objT5 = new pm0(vu30Var, (byte) 9);
                        x340Var4.s0(objT5);
                    }
                    iu30 iu30Var3 = (iu30) objT5;
                    boolean zI2 = x340Var4.i(rk41Var);
                    Object objT6 = x340Var4.T();
                    if (zI2 || objT6 == m4cVar3) {
                        objT6 = new kf6(rk41Var, (byte) 3);
                        x340Var4.s0(objT6);
                    }
                    ce6Var.f(c380Var2, z5, num, iu30Var3, (Function0) objT6, x340Var4, 8);
                }
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public kas(es41 es41Var, cdj0 cdj0Var, ModalTemplate modalTemplate, float f, nas nasVar, iu30 iu30Var) {
        super(3);
        this.c = es41Var;
        this.d = cdj0Var;
        this.e = modalTemplate;
        this.b = f;
        this.f = iu30Var;
    }
}
