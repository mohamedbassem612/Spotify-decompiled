package p;

import android.os.Bundle;
import com.spotify.base.java.logging.Logger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.DismissType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.LoggingData;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.MessageResponseToken;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Button;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.ClickAction;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class x1q0 implements v1q0 {
    public final dg30 a;
    public final mmc b;
    public final hmc c;
    public final qic d;
    public final z4q0 e;

    public x1q0(dg30 dg30Var, mmc mmcVar, hmc hmcVar, qic qicVar, z4q0 z4q0Var) {
        this.a = dg30Var;
        this.b = mmcVar;
        this.c = hmcVar;
        this.d = qicVar;
        this.e = z4q0Var;
    }

    /* JADX WARN: Code duplicated, block: B:14:0x004f  */
    public final void a(MessageResponseToken messageResponseToken, Button button, Bundle bundle, DismissType dismissType, Function0 function0) {
        g50 g50Var;
        ClickAction clickAction = button.getClickAction();
        WeakReference weakReference = (WeakReference) this.d.a.get(this.a.getLocalClassName());
        j50 j50Var = weakReference != null ? (j50) weakReference.get() : null;
        if (j50Var != null) {
            String clickActionIdentifier = clickAction.getClickActionIdentifier();
            kly0 kly0Var = (kly0) j50Var.b.get(clickActionIdentifier);
            if (kly0Var == null || (g50Var = (g50) kly0Var.get()) == null) {
                kly0 kly0Var2 = (kly0) ((Map) j50Var.a.get()).get(clickActionIdentifier);
                if (kly0Var2 != null) {
                    g50Var = (g50) kly0Var2.get();
                } else {
                    g50Var = null;
                }
            }
        } else {
            g50Var = null;
        }
        String actionUrl = clickAction.getActionUrl();
        if (actionUrl == null) {
            actionUrl = "";
        }
        String str = actionUrl;
        LoggingData loggingData = messageResponseToken.getMessageData().getLoggingData();
        Serializable serializable = bundle != null ? bundle.getSerializable("CLICK_ACTION_METADATA") : null;
        HashMap map = serializable instanceof HashMap ? (HashMap) serializable : null;
        if (map == null) {
            map = new HashMap();
        }
        b7x metadata = clickAction.getMetadata();
        if (metadata == null) {
            metadata = b7x.a;
        }
        HashMap map2 = new HashMap((Map) metadata);
        map2.putAll(map);
        Bundle bundle2 = bundle == null ? new Bundle() : bundle;
        bundle2.putSerializable("CLICK_ACTION_METADATA", map2);
        bundle2.putString("PAGE_URI", messageResponseToken.getMessageRequest().getPageUri());
        if (g50Var == null) {
            Logger.g("ClientMessagingPlatform: Matching ActionHandler not found ", new Object[0]);
        }
        if (g50Var != null) {
            g50Var.a(loggingData.getMessageUuid(), str, bundle2, new w1q0(dismissType, messageResponseToken, this, button, function0));
        }
        this.b.a.accept(new nak1(yhm0.p(messageResponseToken.getMessageRequest(), messageResponseToken.getRequestId()), messageResponseToken.getMessageData(), button));
    }
}
