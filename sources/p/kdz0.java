package p;

import java.util.function.BiFunction;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final /* synthetic */ class kdz0 implements BiFunction {
    public static final kdz0 b = new kdz0(0);
    public static final kdz0 c = new kdz0(1);
    public static final kdz0 d = new kdz0(2);
    public final /* synthetic */ byte a;

    public /* synthetic */ kdz0(byte b2) {
        this.a = b2;
    }

    @Override // java.util.function.BiFunction
    public final Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 0:
                return Integer.valueOf(((Number) obj2).intValue() + ((Number) obj).intValue());
            case 1:
                r811 r811Var = (r811) obj2;
                if (r811Var == null) {
                    return new r811();
                }
                r811Var.a.incrementAndGet();
                return r811Var;
            default:
                ym71 ym71Var = (ym71) obj2;
                return ym71Var == ym71.c ? ym71.a : ym71Var;
        }
    }
}
