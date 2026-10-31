package p;

import com.spotify.mobius.functions.Consumer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes10.dex */
public final class my71 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Consumer b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ my71(Consumer consumer, byte b) {
        super(1);
        this.a = b;
        this.b = consumer;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Consumer consumer = this.b;
        switch (b) {
            case 0:
                if (((ixb) obj) == ixb.c) {
                    consumer.accept(vmi1.a);
                }
                return rih1Var;
            default:
                jwa1 jwa1Var = (kwa1) obj;
                if (jwa1Var instanceof jwa1) {
                    consumer.accept(new ata1(jwa1Var.a));
                    return rih1Var;
                }
                if (jwa1Var instanceof iwa1) {
                    consumer.accept(new ata1(((iwa1) jwa1Var).a));
                    return rih1Var;
                }
                eg.o();
                return null;
        }
    }
}
