package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class oci0 extends hab0 implements iu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ n0o b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ oci0(n0o n0oVar, byte b) {
        super(1);
        this.a = b;
        this.b = n0oVar;
    }

    public final Object invoke(Object obj) {
        byte b = this.a;
        n0o n0oVar = this.b;
        switch (b) {
            case 0:
                String str = ((mey0) obj).c;
                if (((gci0) n0oVar.e).c) {
                    return str;
                }
                return null;
            default:
                String str2 = ((mey0) obj).c;
                if (((gci0) n0oVar.e).a) {
                    return str2;
                }
                return null;
        }
    }
}
