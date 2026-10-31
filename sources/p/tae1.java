package p;

import com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.TriggerType;
import com.spotify.pendragon.v1.proto.Text;
import com.spotify.pendragon.v1.proto.Trigger;
import java.util.Locale;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class tae1 implements iu30 {
    public static final /* synthetic */ tae1 b = new tae1(4);
    public final /* synthetic */ byte a;

    public /* synthetic */ tae1(byte b2) {
        this.a = b2;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0062  */
    public final Object invoke(Object obj) {
        Enum r0 = null;
        switch (this.a) {
            case 0:
                Text text = (Text) obj;
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.ui.Text(text.p(), text.q());
            case 1:
                Trigger trigger = (Trigger) obj;
                String upperCase = trigger.p().name().toUpperCase(Locale.ROOT);
                Enum r1 = TriggerType.TRIGGER_TYPE_UNKNOWN;
                for (Enum r5 : TriggerType.values()) {
                    if (u890.j(r5.name(), upperCase)) {
                        r0 = r5;
                        if (r0 != null) {
                            r1 = r0;
                        }
                        return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger(r1, trigger.o());
                    }
                }
                if (r0 != null) {
                    r1 = r0;
                }
                return new com.spotify.messaging.clientmessagingplatform.clientmessagingplatformsdk.api.models.Trigger(r1, trigger.o());
            case 2:
                kf30 kf30Var = (kf30) obj;
                if (kf30Var != null) {
                    return Boolean.valueOf(!kf30Var.equals(rfb1.y));
                }
                hhg1.n("Argument for @NotNull parameter 'name' of kotlin/reflect/jvm/internal/impl/types/TypeSubstitutor$1.invoke must not be null");
                return null;
            case 3:
                by10.b.get(((Number) obj).intValue());
                return null;
            default:
                int i = mvo1.a;
                return String.valueOf(((qvo1) obj).c);
        }
    }
}
