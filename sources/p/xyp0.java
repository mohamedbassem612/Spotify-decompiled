package p;

import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class xyp0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ byte b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r1v1, types: [byte, int] */
    /* JADX WARN: Type inference failed for: r1v3, types: [byte, int] */
    public xyp0(long j, TimeUnit timeUnit, byte b) {
        super(1);
        this.a = b;
        switch (b) {
            case 1:
                this.b = (int) j;
                this.c = timeUnit;
                super(1);
                break;
            default:
                this.b = (int) j;
                this.c = timeUnit;
                break;
        }
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        byte b2 = this.b;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                ((zyp0) obj).x = z4n1.b("timeout", b2, (TimeUnit) obj2);
                break;
            case 1:
                ((zyp0) obj).A = z4n1.b("timeout", b2, (TimeUnit) obj2);
                break;
            default:
                ((iu30) obj2).invoke(Integer.valueOf(yoi1.p((int) ((Number) obj).floatValue(), 0, b2 - 1)));
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public xyp0(int i, iu30 iu30Var) {
        super(1);
        this.a = (byte) 2;
        this.c = iu30Var;
        this.b = i;
    }
}
