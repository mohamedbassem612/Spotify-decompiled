package p;

import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class cwj extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ zu30 b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ cwj(zu30 zu30Var, byte b) {
        super(1);
        this.a = b;
        this.b = zu30Var;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        zu30 zu30Var = this.b;
        switch (b) {
            case 0:
                return new lo8(zu30Var, (Function0) obj, (byte) 5);
            default:
                ((qtr) obj).b(new q7a1(zu30Var, null, (byte) 3));
                return rih1.a;
        }
    }
}
