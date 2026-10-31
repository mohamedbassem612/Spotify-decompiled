package p;

import com.spotify.eventsender.eventsender.EventSenderDatabase_Impl;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public final class bc00 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ EventSenderDatabase_Impl b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ bc00(EventSenderDatabase_Impl eventSenderDatabase_Impl, byte b) {
        super(0);
        this.a = b;
        this.b = eventSenderDatabase_Impl;
    }

    public final Object invoke() {
        byte b = this.a;
        EventSenderDatabase_Impl eventSenderDatabase_Impl = this.b;
        switch (b) {
            case 0:
                return new ld00(eventSenderDatabase_Impl);
            case 1:
                return new ud00(eventSenderDatabase_Impl);
            default:
                return new rrz0(eventSenderDatabase_Impl);
        }
    }
}
