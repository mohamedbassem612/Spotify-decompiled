package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class utc0 {
    public static final stc0 a;
    public static final stc0 b;

    static {
        liy0 liy0Var = liy0.c;
        stc0 stc0Var = null;
        try {
            stc0Var = (stc0) Class.forName("androidx.glance.appwidget.protobuf.ListFieldSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = stc0Var;
        b = new stc0();
    }
}
