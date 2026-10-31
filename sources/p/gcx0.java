package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class gcx0 extends hab0 implements xu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ gcx0(Consumer consumer, byte b) {
        super(3);
        this.a = b;
        this.b = consumer;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                consumer.accept(new qax0((obx0) obj, (tv80) obj3));
                break;
            case 1:
                ((Number) obj2).intValue();
                consumer.accept(new qax0((obx0) obj, (tv80) obj3));
                break;
            default:
                ((Number) obj2).intValue();
                consumer.accept(new rax0((obx0) obj, (tv80) obj3));
                break;
        }
        return rih1Var;
    }
}
