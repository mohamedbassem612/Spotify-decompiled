package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class iz3 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zud0 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ iz3(zud0 zud0Var, byte b) {
        super(1);
        this.a = b;
        this.b = zud0Var;
    }

    public final Object invoke(Object obj) {
        Consumer consumer;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        zud0 zud0Var = this.b;
        switch (b) {
            case 0:
                n560 n560Var = (n560) obj;
                Consumer consumer2 = (Consumer) ((s59) zud0Var.b).b;
                if (consumer2 != null) {
                    consumer2.accept(new ljg0(n560Var));
                }
                break;
            default:
                sg20 sg20Var = (vg20) obj;
                s59 s59Var = (s59) zud0Var.b;
                if (sg20Var instanceof sg20) {
                    String str = sg20Var.a;
                    Consumer consumer3 = (Consumer) s59Var.b;
                    if (consumer3 != null) {
                        consumer3.accept(new wjg0(str));
                    }
                } else if (sg20Var.equals(tg20.a) && (consumer = (Consumer) s59Var.b) != null) {
                    consumer.accept(new wjg0(""));
                }
                break;
        }
        return rih1Var;
    }
}
