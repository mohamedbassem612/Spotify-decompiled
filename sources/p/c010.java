package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class c010 {
    public static final zz00 a = new zz00();
    public static final zz00 b;

    static {
        liy0 liy0Var = liy0.c;
        zz00 zz00Var = null;
        try {
            zz00Var = (zz00) Class.forName("androidx.glance.appwidget.protobuf.ExtensionSchemaFull").getDeclaredConstructor(null).newInstance(null);
        } catch (Exception unused) {
        }
        b = zz00Var;
    }
}
