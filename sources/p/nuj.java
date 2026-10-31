package p;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nuj extends hab0 implements ev30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nuj(Object obj, byte b) {
        super(7);
        this.a = b;
        this.b = obj;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6, Object obj7) {
        byte b = this.a;
        Object obj8 = this.b;
        switch (b) {
            case 0:
                int iIntValue = ((Number) obj7).intValue();
                j82.p(((Number) obj3).floatValue(), (xtb0) obj, (c380) obj4, (vzq0) obj2, (vu30) obj5, ((tuj) obj8).n, (b0k) obj6, ((iIntValue >> 6) & 14) | ((iIntValue << 3) & 112) | ((iIntValue >> 3) & 896) | ((iIntValue << 6) & 7168) | (iIntValue & 57344), 0);
                return rih1.a;
            default:
                return new ceb1((xkk1) obj2, (qfd) obj, (hll) obj3, ((kmj1) ((fob) obj8).g).c((Boolean) obj4, (qxc0) obj5), rqt0.C((mtl) obj6, (Boolean) obj7));
        }
    }
}
