package p;

import android.content.Context;
import android.view.ViewGroup;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public final class wmx0 extends hab0 implements zu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ wmx0(Object obj, Object obj2, byte b) {
        super(4);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    @Override // p.zu30
    public final Object J(Object obj, Object obj2, Object obj3, Object obj4) {
        byte b = this.a;
        Object obj5 = this.c;
        Object obj6 = this.b;
        switch (b) {
            case 0:
                return new vmx0((Context) obj2, (ViewGroup) obj3, (qfv) obj6, (kly0) obj5, (byte) 0);
            default:
                b0k b0kVar = (b0k) obj3;
                ((kd41) obj6).c(obj2, apo.r(-1249228760, new vvb((j2i) obj5, obj2, (byte) 7), b0kVar), b0kVar, ((((Number) obj4).intValue() >> 3) & 14) | 48);
                return rih1.a;
        }
    }
}
