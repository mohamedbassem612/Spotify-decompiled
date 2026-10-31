package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.data.models.Message;
import java.util.Collection;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class ff90 implements ty31 {
    public final /* synthetic */ byte a;

    public final rqg0 a(Message message, gmc gmcVar, klc klcVar) {
        byte b = this.a;
        vy31 vy31Var = vy31.f;
        switch (b) {
            case 0:
                nlc nlcVar = klcVar.i.a;
                return (gmcVar.c == TriggerType.URI && ((nlcVar instanceof nlc) && !u890.j(nlcVar.a, gmcVar.b))) ? new wy31(null) : vy31Var;
            case 1:
                String str = gmcVar.b;
                Set set = s4b1.f;
                s4b1 s4b1VarX = uic.x(str);
                xj61 xj61Var = new xj61();
                xj61Var.add(str);
                try {
                    xj61Var.add(nhc1.W(str, s4b1VarX.h(), "?"));
                    break;
                } catch (UnsupportedOperationException unused) {
                }
                xj61 xj61VarJ = cwl1.j(xj61Var);
                if (gmcVar.c == TriggerType.CLIENT_EVENT) {
                    List<Trigger> triggers = message.getTriggers();
                    if (!(triggers instanceof Collection) || !triggers.isEmpty()) {
                        for (Trigger trigger : triggers) {
                            if (trigger.getType() == TriggerType.CLIENT_EVENT) {
                                if (xj61VarJ.a.containsKey(trigger.getPattern())) {
                                    return vy31Var;
                                }
                            }
                        }
                    }
                }
                return new wy31(null);
            default:
                nlc nlcVar2 = klcVar.i.a;
                return ((nlcVar2 instanceof nlc) && u890.j(nlcVar2.a, nik1.l1.a)) ? vy31Var : new wy31(null);
        }
    }

    public final void dispose() {
        byte b = this.a;
    }

    private final void b() {
    }

    private final void c() {
    }

    private final void d() {
    }
}
