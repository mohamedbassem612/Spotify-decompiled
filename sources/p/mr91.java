package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class mr91 extends Throwable {
    public static final /* synthetic */ int b = 0;
    public final String a;

    public mr91(String str, Throwable th, lr91 lr91Var) {
        super(str, th);
        this.a = str;
        setStackTrace((StackTraceElement[]) lr91Var.a.toArray(new StackTraceElement[0]));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        return this.a;
    }

    public /* synthetic */ mr91(String str, lr91 lr91Var) {
        this(str, null, lr91Var);
    }
}
