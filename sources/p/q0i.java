package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class q0i extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ q0i(Object obj, Object obj2, byte b) {
        super(1);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        Object obj2 = this.c;
        Object obj3 = this.b;
        switch (b) {
            case 0:
                Boolean bool = (Boolean) ((a1i) obj).b.invoke(obj3, obj2);
                bool.getClass();
                return bool;
            default:
                Boolean bool2 = (Boolean) ((a1i) obj).a.invoke(obj3, obj2);
                bool2.getClass();
                return bool2;
        }
    }
}
