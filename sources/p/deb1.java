package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class deb1 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ fob b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ deb1(fob fobVar, byte b) {
        super(1);
        this.a = b;
        this.b = fobVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        fob fobVar = this.b;
        switch (b) {
            case 0:
                return d3p1.H(fobVar.b, fobVar.d, (xdb1) obj);
            case 1:
                String str = ((xdb1) obj).a;
                if (fobVar.c) {
                    return str;
                }
                return null;
            case 2:
                String str2 = ((xdb1) obj).a;
                if (fobVar.c) {
                    return str2;
                }
                return null;
            default:
                return (String) fobVar.f;
        }
    }
}
