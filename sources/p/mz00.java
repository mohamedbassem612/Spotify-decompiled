package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public abstract class mz00 {
    public static final Class a;

    static {
        Class<?> cls;
        try {
            cls = Class.forName("androidx.glance.appwidget.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            cls = null;
        }
        a = cls;
    }
}
