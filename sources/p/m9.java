package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class m9 extends Throwable {
    public final /* synthetic */ byte a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(byte b) {
        super("Failure occurred while trying to finish a future.");
        this.a = b;
        switch (b) {
            case 3:
                break;
            case 4:
                super("In order to provide an accessible experience for our users, it's required to provide the reason on why this\ncomponent is disabled. It's possible to do this by using the XML attribute `app:disabledStateReason` or the\nKotlin property `disabledStateReason`.");
                break;
            case 5:
            default:
                break;
            case 6:
                super("To insert a view inside this component you need to use the attr 'slot' to define where the component will be placed.");
                break;
        }
    }

    @Override // java.lang.Throwable
    public synchronized Throwable fillInStackTrace() {
        switch (this.a) {
            case 0:
                synchronized (this) {
                }
                return this;
            case 2:
                synchronized (this) {
                }
                return this;
            case 7:
                synchronized (this) {
                }
                return this;
            case 8:
                synchronized (this) {
                }
                return this;
            default:
                return super.fillInStackTrace();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m9(String str, wfs0 wfs0Var) {
        super(str + ". Error: " + wfs0Var);
        this.a = (byte) 1;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9(String str, byte b) {
        super(str);
        this.a = b;
    }
}
