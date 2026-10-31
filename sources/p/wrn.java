package p;

import java.util.Set;
import java.util.concurrent.TimeUnit;
import java.util.function.UnaryOperator;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class wrn implements UnaryOperator {
    public static final wrn b = new wrn(0);
    public static final wrn c = new wrn(1);
    public static final wrn d = new wrn(2);
    public static final wrn e = new wrn(3);
    public static final wrn f = new wrn(4);
    public static final wrn g = new wrn(5);
    public final /* synthetic */ byte a;

    public /* synthetic */ wrn(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.Function
    public final Object apply(Object obj) {
        byte b2 = this.a;
        TimeUnit timeUnit = TimeUnit.SECONDS;
        switch (b2) {
            case 0:
                return ((yyp0) ((l270) obj)).f(30L, timeUnit).g(30L, timeUnit);
            case 1:
                qa20 qa20Var = (qa20) obj;
                return new qa20(qa20Var.a, false, qa20Var.c);
            case 2:
                return ((yyp0) ((l270) obj)).f(60L, timeUnit).d(new xyp0(90L, timeUnit, (byte) 0));
            case 3:
                return ((yyp0) ((l270) obj)).f(60L, timeUnit).d(new xyp0(90L, timeUnit, (byte) 0));
            case 4:
                return ((yyp0) ((l270) obj)).f(30L, timeUnit).g(30L, timeUnit);
            default:
                ij91 ij91Var = (ij91) obj;
                ij91Var.getClass();
                return ij91.a(ij91Var, (Set) null, (nl91) null, 7);
        }
    }
}
