package p;

import com.spotify.mobius.functions.Consumer;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class kf extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ kf(Consumer consumer, byte b) {
        super(0);
        this.a = b;
        this.b = consumer;
    }

    public final Object invoke() {
        byte b = this.a;
        u9u u9uVar = u9u.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                consumer.accept(l9u.a);
                break;
            case 1:
                consumer.accept(lf7.a);
                break;
            case 2:
                consumer.accept(pzv.a);
                break;
            case 3:
                consumer.accept(h0w.a);
                break;
            case 4:
                consumer.accept(la50.a);
                break;
            case 5:
                consumer.accept(u9uVar);
                break;
            case 6:
                consumer.accept(u9uVar);
                break;
            default:
                consumer.accept(x9u.a);
                break;
        }
        return rih1Var;
    }
}
