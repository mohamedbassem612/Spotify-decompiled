package p;

import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ymn extends hab0 implements xu30 {
    public final /* synthetic */ byte a = 1;
    public final /* synthetic */ ann b;
    public final /* synthetic */ ldo c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymn(ann annVar, ldo ldoVar) {
        super(3);
        this.b = annVar;
        this.c = ldoVar;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        ann annVar = this.b;
        switch (b) {
            case 0:
                ((Number) obj3).intValue();
                hux huxVar = annVar.a;
                List list = annVar.f;
                this.c.k(huxVar, list, (qim0) null, (b0k) obj2, 8);
                break;
            default:
                b0k b0kVar = (b0k) obj2;
                ((Number) obj3).intValue();
                n9p1.i(384, annVar.f, apo.r(-1771905863, new jjk(this.c, annVar, (byte) 27), b0kVar), b0kVar, (qim0) null);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ymn(ldo ldoVar, ann annVar) {
        super(3);
        this.c = ldoVar;
        this.b = annVar;
    }
}
