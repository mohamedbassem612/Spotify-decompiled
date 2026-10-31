package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes7.dex */
public interface wh80 {
    boolean a();

    default uh80 b(boolean z) {
        return new uh80(z, getUri(), getUid(), a(), getContextUri(), g(), d(), c(), f(), e(), 1024);
    }

    String c();

    boolean d();

    boolean e();

    boolean f();

    boolean g();

    String getContextUri();

    String getUid();

    String getUri();
}
