package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class ftd extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ tm b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ ftd(tm tmVar, byte b) {
        super(4);
        this.a = b;
        this.b = tmVar;
    }

    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        tm tmVar = this.b;
        switch (b) {
            case 0:
                etd etdVar = (etd) obj;
                return ((itd) tmVar.d).i(((Number) obj3).intValue(), etdVar.d, (r6h1) obj4, etdVar.h);
            default:
                return ((itd) tmVar.d).k((ctd) obj4, ((etd) obj2).d);
        }
    }
}
