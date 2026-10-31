package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageTemplate;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.ModalTemplate;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class tem0 extends hab0 implements vu30 {
    public final /* synthetic */ uem0 a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public tem0(uem0 uem0Var) {
        super(2);
        this.a = uem0Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        sem0 sem0Var;
        String str;
        aqw m231Var;
        x340 x340Var = (b0k) obj;
        int iIntValue = ((Number) obj2).intValue();
        x340 x340Var2 = x340Var;
        boolean zY = x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2);
        rih1 rih1Var = rih1.a;
        if (!zY) {
            x340Var2.b0();
            return rih1Var;
        }
        Object objT = x340Var2.T();
        Object obj3 = fkj0.X;
        if (objT == obj3) {
            objT = qxd0.M(o6x.a, x340Var2);
            x340Var2.s0(objT);
        }
        c9n c9nVar = (c9n) objT;
        uem0 uem0Var = this.a;
        bpb1 bpb1Var = uem0Var.o;
        MessageResponseToken messageResponseToken = uem0Var.b.a;
        bpb1 bpb1Var2 = uem0Var.n;
        boolean zI = x340Var2.i(c9nVar) | x340Var2.i(uem0Var);
        Object objT2 = x340Var2.T();
        if (zI || objT2 == obj3) {
            objT2 = new hyg0(c9nVar, uem0Var, null, (byte) 14);
            x340Var2.s0(objT2);
        }
        qxd0.s(bpb1Var, bpb1Var2, (vu30) objT2, x340Var2);
        Object objT3 = x340Var2.T();
        if (objT3 == obj3) {
            objT3 = new sem0(uem0Var, c9nVar);
            x340Var2.s0(objT3);
        }
        sem0 sem0Var2 = (sem0) objT3;
        Object objT4 = x340Var2.T();
        if (objT4 == obj3) {
            iem0 iem0Var = uem0Var.c;
            ModalTemplate.JitModal jitModal = (ModalTemplate) p3d1.i(messageResponseToken);
            iem0Var.getClass();
            if (jitModal instanceof ModalTemplate.JitModal) {
                ModalTemplate.JitModal jitModal2 = jitModal;
                m231Var = new aqw(new hem0(iem0Var, (byte) 0), new qgj0(messageResponseToken, jitModal2.getHtmlString(), jitModal2.getButtons(), true));
            } else if (jitModal instanceof ModalTemplate.BasicModal) {
                ModalTemplate.BasicModal basicModal = (ModalTemplate.BasicModal) jitModal;
                m231Var = new aqw(new hem0(iem0Var, (byte) 1), new jdj0(messageResponseToken, new cdj0(basicModal.getBackgroundColor(), basicModal.getAccessoryContent(), basicModal.getHeadline(), basicModal.getBody(), basicModal.getPrimaryButton(), null, null, basicModal.getAccessoryContentSize(), basicModal.getContentAlignment())));
            } else if (jitModal instanceof ModalTemplate.BaseModal) {
                ModalTemplate.BaseModal baseModal = (ModalTemplate.BaseModal) jitModal;
                m231Var = new aqw(new hem0(iem0Var, (byte) 2), new jdj0(messageResponseToken, new cdj0(baseModal.getBackground(), baseModal.getAccessoryContent(), baseModal.getHeadline(), baseModal.getBody(), baseModal.getPrimaryButton(), baseModal.getSecondaryButton(), baseModal.getDisclaimer(), baseModal.getAccessoryContentSize(), baseModal.getContentAlignment())));
            } else {
                m231Var = new m231(new IllegalArgumentException("No element found for template: " + jitModal));
            }
            objT4 = new e331(m231Var);
            x340Var2.s0(objT4);
        }
        Object obj4 = ((e331) objT4).a;
        Throwable thA = e331.a(obj4);
        if (thA == null) {
            aqw aqwVar = (aqw) obj4;
            x340Var2.i0(1484978249);
            d7q d7qVar = uem0Var.i;
            boolean zI2 = x340Var2.i(uem0Var);
            Object objT5 = x340Var2.T();
            if (zI2 || objT5 == obj3) {
                objT5 = new lem0(uem0Var, (byte) 0);
                x340Var2.s0(objT5);
            }
            aqw aqwVar2 = new aqw((iu30) objT5, rih1Var);
            boolean zI3 = x340Var2.i(uem0Var);
            Object objT6 = x340Var2.T();
            if (zI3 || objT6 == obj3) {
                objT6 = new lem0(uem0Var, (byte) 1);
                x340Var2.s0(objT6);
            }
            aqw aqwVar3 = new aqw((iu30) objT6, rih1Var);
            MessageTemplate messageTemplateI = p3d1.i(messageResponseToken);
            if (messageTemplateI instanceof ModalTemplate.JitModal) {
                str = "messaging-modal-content-html";
            } else {
                if (!(messageTemplateI instanceof ModalTemplate.BaseModal) && !(messageTemplateI instanceof ModalTemplate.BasicModal)) {
                    hhg1.n("Unknown ModalTemplate type");
                    return null;
                }
                str = "messaging-modal-content-basic";
            }
            r8s r8sVarA = d7qVar.a(sem0Var2, aqwVar2, aqwVar, aqwVar3, "messaging-modal-slate", "messaging-modal-header", str, "messaging-modal-footer");
            sem0Var = sem0Var2;
            otw.c(r8sVarA, new ifj0(messageResponseToken, false), (qim0) null, (ipb1) null, x340Var2, 64, 12);
            x340Var2.r(false);
        } else {
            sem0Var = sem0Var2;
            x340Var2.i0(-854060557);
            boolean zI4 = x340Var2.i(sem0Var) | x340Var2.i(uem0Var) | x340Var2.i(thA);
            Object objT7 = x340Var2.T();
            if (zI4 || objT7 == obj3) {
                objT7 = new mem0(sem0Var, uem0Var, thA, null);
                x340Var2.s0(objT7);
            }
            int i = MessageResponseToken.$stable;
            qxd0.t(messageResponseToken, x340Var2, (vu30) objT7);
            t1c.a(nim0.a, x340Var2, 6);
            x340Var2.r(false);
        }
        boolean zI5 = x340Var2.i(uem0Var);
        Object objT8 = x340Var2.T();
        if (zI5 || objT8 == obj3) {
            objT8 = new nem0(uem0Var, null, (byte) 0);
            x340Var2.s0(objT8);
        }
        qxd0.t(sem0Var, x340Var2, (vu30) objT8);
        return rih1Var;
    }
}
