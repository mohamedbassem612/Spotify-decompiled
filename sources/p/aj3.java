package p;

import android.content.Context;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ClientMessage;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ConflictResolutionStrategy;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissReason;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DynamicTagsMetadata;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessagePresentationStatus;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponse;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Pacing;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.PacingTimeUnit;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonIconAlignment;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonStyle;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ButtonType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.EncoreFont;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Format;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Icon;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.templates.BottomSheetTemplate;
import io.reactivex.rxjava3.core.Single;
import io.reactivex.rxjava3.internal.operators.maybe.MaybeFlatMapCompletable;
import java.util.Map;
import java.util.UUID;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class aj3 {
    public final Context a;
    public final ljg b;
    public final ajq0 c;
    public final x5j1 d;
    public final oj80 e;
    public final kt91 f;
    public final c9n g;

    public aj3(Context context, ljg ljgVar, ajq0 ajq0Var, x5j1 x5j1Var, oj80 oj80Var, kt91 kt91Var, c9n c9nVar) {
        this.a = context;
        this.b = ljgVar;
        this.c = ajq0Var;
        this.d = x5j1Var;
        this.e = oj80Var;
        this.f = kt91Var;
        this.g = c9nVar;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object a(Button button, slc0 slc0Var, onm onmVar) {
        wi3 wi3Var;
        if (onmVar instanceof wi3) {
            wi3Var = (wi3) onmVar;
            int i = wi3Var.d;
            if ((i & Integer.MIN_VALUE) != 0) {
                wi3Var.d = i - Integer.MIN_VALUE;
            } else {
                wi3Var = new wi3(this, onmVar);
            }
        } else {
            wi3Var = new wi3(this, onmVar);
        }
        Object obj = wi3Var.b;
        int i2 = wi3Var.d;
        try {
            if (i2 == 0) {
                hm5.M(obj);
                String identifier = button.getIdentifier();
                boolean zJ = u890.j(identifier, "linkAccount");
                oj80 oj80Var = this.e;
                if (zJ) {
                    MaybeFlatMapCompletable maybeFlatMapCompletableU = this.c.u(slc0Var, 1, oj80Var.l());
                    wi3Var.a = slc0Var;
                    wi3Var.d = 1;
                    Object objI = fc11.i(maybeFlatMapCompletableU, wi3Var);
                    d9n d9nVar = d9n.a;
                    if (objI == d9nVar) {
                        return d9nVar;
                    }
                } else if (u890.j(identifier, "dismissCta")) {
                    oj80Var.k();
                    er91 er91VarC = k4k.p(2131952208).c();
                    kt91 kt91Var = this.f;
                    if (kt91Var.g()) {
                        kt91Var.k(er91VarC);
                    } else {
                        kt91Var.o(er91VarC);
                    }
                }
                return rih1.a;
            }
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            slc0Var = wi3Var.a;
            hm5.M(obj);
            d();
        } catch (Throwable unused) {
            c(slc0Var);
        }
        return rih1.a;
    }

    /* JADX WARN: Code duplicated, block: B:34:0x015e  */
    /* JADX WARN: Code duplicated, block: B:36:0x0168  */
    /* JADX WARN: Code duplicated, block: B:40:0x017e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0194  */
    /* JADX WARN: Code duplicated, block: B:44:0x0198  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    public final Object b(slc0 slc0Var, int i, onm onmVar) {
        xi3 xi3Var;
        slc0 slc0Var2;
        int i2;
        MessagePresentationStatus.Dismissed dismissed;
        DismissReason.MessageButtonTapped dismissReason;
        er91 er91VarC;
        kt91 kt91Var;
        Button button;
        int i3 = i;
        if (onmVar instanceof xi3) {
            xi3Var = (xi3) onmVar;
            int i4 = xi3Var.e;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                xi3Var.e = i4 - Integer.MIN_VALUE;
            } else {
                xi3Var = new xi3(this, onmVar);
            }
        } else {
            xi3Var = new xi3(this, onmVar);
        }
        xi3 xi3Var2 = xi3Var;
        Object objJ = xi3Var2.c;
        int i5 = xi3Var2.e;
        oj80 oj80Var = this.e;
        rih1 rih1Var = rih1.a;
        d9n d9nVar = d9n.a;
        if (i5 == 0) {
            hm5.M(objJ);
            oj80Var.q(i3);
            String string = UUID.randomUUID().toString();
            Context context = this.a;
            Single singleA = this.b.a("spotify:alexa-account-linking:v1", (152 & 2) != 0 ? TriggerType.CLIENT_EVENT : null, (152 & 8) != 0 ? z6x.a : k4p1.x(new ClientMessage("ALEXA_CMP_ACCOUNT_LINKING", string, new Format.BottomSheet(new BottomSheetTemplate.RichBottomSheet(null, "https://partner-account-linking-cdn.spotifycdn.com/alexa-link-128.png", context.getString(2131952210), context.getString(2131952209), new Button("linkAccount", new ButtonStyle(context.getString(2131952207), (String) null, (String) null, (Icon) null, ButtonType.PRIMARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)), new Button("dismissCta", new ButtonStyle(context.getString(2131952206), (String) null, (String) null, (Icon) null, ButtonType.TERTIARY, (EncoreFont) null, (ButtonIconAlignment) null, 96, (DefaultConstructorMarker) null), new ClickAction("DISMISS", (String) null, (Map) null, 4, (DefaultConstructorMarker) null)))), w7x.a, new Pacing(0, PacingTimeUnit.HOURS))), (152 & 16) != 0 ? null : null, (152 & 4) != 0 ? "" : null, (152 & 32) != 0 ? vks.a : null, (152 & 64) != 0 ? new DynamicTagsMetadata(null, null, null, null, 15, null) : null, (152 & 128) != 0 ? ConflictResolutionStrategy.DISCARD_SELF : null, (152 & 256) != 0 ? new d3j0(new z2j0(false), x2j0.a) : null);
            slc0Var2 = slc0Var;
            xi3Var2.a = slc0Var2;
            xi3Var2.b = i3;
            xi3Var2.e = 1;
            objJ = fc11.j(singleA, xi3Var2);
            if (objJ != d9nVar) {
            }
            return d9nVar;
        }
        if (i5 == 1) {
            i3 = xi3Var2.b;
            slc0Var2 = xi3Var2.a;
            hm5.M(objJ);
        } else {
            if (i5 != 2) {
                if (i5 == 3) {
                    hm5.M(objJ);
                    return rih1Var;
                }
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            i2 = xi3Var2.b;
            slc0Var2 = xi3Var2.a;
            hm5.M(objJ);
        }
        dismissed = (MessagePresentationStatus) objJ;
        if (dismissed instanceof MessagePresentationStatus.Dismissed) {
            dismissReason = dismissed.getDismissReason();
            if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                oj80Var.k();
                er91VarC = k4k.p(2131952208).c();
                kt91Var = this.f;
                if (kt91Var.g()) {
                    kt91Var.k(er91VarC);
                    return rih1Var;
                }
                kt91Var.o(er91VarC);
                return rih1Var;
            }
            button = dismissReason.getButton();
            xi3Var2.a = null;
            xi3Var2.b = i2;
            xi3Var2.e = 3;
            if (a(button, slc0Var2, xi3Var2) == d9nVar) {
                return d9nVar;
            }
        }
        return rih1Var;
        int i6 = i3;
        MessageResponse messageResponse = (MessageResponse) objJ;
        if (messageResponse instanceof MessageResponse.Success) {
            fu20 fu20VarQ = f5p1.q(yoi1.g(this.b.e().b(((MessageResponse.Success) messageResponse).getMessageRequestId())), new yi3(new l811(), this, slc0Var2, i6, (lnm) null));
            s4 s4Var = new s4((byte) 10);
            xi3Var2.a = slc0Var2;
            xi3Var2.b = i6;
            xi3Var2.e = 2;
            objJ = b5p1.l(fu20VarQ, s4Var, xi3Var2);
            if (objJ != d9nVar) {
                i2 = i6;
                dismissed = (MessagePresentationStatus) objJ;
                if (dismissed instanceof MessagePresentationStatus.Dismissed) {
                    dismissReason = dismissed.getDismissReason();
                    if (dismissReason instanceof DismissReason.MessageButtonTapped) {
                        oj80Var.k();
                        er91VarC = k4k.p(2131952208).c();
                        kt91Var = this.f;
                        if (kt91Var.g()) {
                            kt91Var.k(er91VarC);
                            return rih1Var;
                        }
                        kt91Var.o(er91VarC);
                        return rih1Var;
                    }
                    button = dismissReason.getButton();
                    xi3Var2.a = null;
                    xi3Var2.b = i2;
                    xi3Var2.e = 3;
                    if (a(button, slc0Var2, xi3Var2) == d9nVar) {
                    }
                }
            }
            return d9nVar;
        }
        return rih1Var;
    }

    public final void c(slc0 slc0Var) {
        lgy lgyVarP = k4k.p(2131952205);
        lgyVarP.a(this.a.getString(2131952211));
        lgyVarP.j(new cg1(this, slc0Var, (byte) 4));
        this.f.o(lgyVarP.c());
    }

    public final void d() {
        lgy lgyVarP = k4k.p(2131952212);
        lgyVarP.a(this.a.getString(2131952213));
        lgyVarP.j(new c20(this, (byte) 4));
        this.f.o(lgyVarP.c());
    }
}
