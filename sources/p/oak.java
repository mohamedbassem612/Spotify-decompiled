package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oak extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ rak b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oak(rak rakVar, byte b) {
        super(1);
        this.a = b;
        this.b = rakVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rak rakVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj).intValue();
                return rakVar.Y.b();
            default:
                gbk gbkVar = (gbk) obj;
                Consumer consumer = (Consumer) rakVar.h.getValue();
                if (consumer != null) {
                    consumer.accept(new zak(gbkVar.a, gbkVar.b));
                }
                return rih1.a;
        }
    }
}
