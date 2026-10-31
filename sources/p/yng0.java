package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class yng0 {
    public static final ung0 a;
    public static final ung0 b;

    static {
        liy0 liy0Var = liy0.c;
        ung0 ung0Var = null;
        try {
            ung0Var = (ung0) Class.forName("androidx.glance.appwidget.protobuf.MapFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = ung0Var;
        b = new ung0();
    }
}
