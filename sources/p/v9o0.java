package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class v9o0 {
    public static final r9o0 a;
    public static final r9o0 b;

    static {
        liy0 liy0Var = liy0.c;
        r9o0 r9o0Var = null;
        try {
            r9o0Var = (r9o0) Class.forName("androidx.glance.appwidget.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        a = r9o0Var;
        b = new r9o0();
    }
}
