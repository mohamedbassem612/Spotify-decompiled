package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class hg7 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ hg7(Consumer consumer, byte b) {
        super(2);
        this.a = b;
        this.b = consumer;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                consumer.accept(new wf7(null, (r620) obj));
                return rih1Var;
            case 1:
                s451 s451Var = (s451) obj;
                boolean z = s451Var instanceof q451;
                r620 r620Var = r620.TOP;
                if (z) {
                    String str = ((q451) s451Var).a;
                    consumer.accept(new wf7(str, str.length() == 0 ? r620Var : null));
                } else if (s451Var instanceof p451) {
                    consumer.accept(new wf7("", r620Var));
                } else if (!(s451Var instanceof r451)) {
                    eg.o();
                    return null;
                }
                return rih1Var;
            default:
                consumer.accept(new nax0((obx0) obj, ((Number) obj2).intValue()));
                return rih1Var;
        }
    }
}
