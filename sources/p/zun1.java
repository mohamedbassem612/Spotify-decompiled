package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class zun1 extends Throwable {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ zun1(String str, byte b) {
        super(str);
        this.a = b;
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        byte b = this.a;
        return this;
    }
}
