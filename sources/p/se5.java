package p;

import com.spotify.wrapped.v1.proto.Paragraph;
import java.util.ArrayList;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes11.dex */
public final class se5 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(int i, vu30 vu30Var, boolean z) {
        super(2);
        this.a = (byte) 3;
        this.c = i;
        this.b = z;
        this.d = vu30Var;
    }

    public final Object invoke(Object obj, Object obj2) {
        Integer num;
        yb51 yb51Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        int i = this.c;
        boolean z = this.b;
        Object obj3 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                nyn1.w(z, (o95) obj3, i, (b0k) obj, czo1.p(65));
                return rih1Var;
            case 1:
                ((Number) obj2).intValue();
                vby0.i((u8w) obj3, z, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 2:
                ((Number) obj2).intValue();
                lrn1.a(czo1.p(i | 1), (b0k) obj, (c380) obj3, z);
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(1 & iIntValue, (iIntValue & 3) != 2)) {
                    mod.b(alg0.h.a(Integer.valueOf(i)), apo.r(1241489057, new n7f((byte) 2, (vu30) obj3, z), x340Var2), x340Var2, 56);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                ((Number) obj2).intValue();
                ((osq0) obj3).f(z, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 5:
                ((Number) obj2).intValue();
                zj01.g((Paragraph) obj3, z, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
            case 6:
                ec51 ec51Var = (ec51) obj;
                long jLongValue = ((Number) obj2).longValue();
                int i2 = ec51Var.e;
                ac51 ac51Var = ec51Var.g;
                bc51 bc51Var = (bc51) obj3;
                cc51 cc51Var = cc51.f;
                if (bc51Var != null && i == i2) {
                    if ((ac51Var != null ? ac51Var.d : null) == cc51Var) {
                        return new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, 0, (Integer) null, ac51.a(ac51Var, (cc51) null, (Long) null, 0L, 0, (ArrayList) null, bc51Var.a <= 0 ? ac51Var.i : 2, (Long) null, bc51Var, 767), 0L, 191), (zb51) null, 6);
                    }
                }
                if (i == i2 && (num = ec51Var.f) != null && i == num.intValue()) {
                    if ((ac51Var != null ? ac51Var.d : null) == cc51.d) {
                        if (bc51Var == null || bc51Var.a <= 0 || z) {
                            bc51 bc51Var2 = (bc51) obj3;
                            yb51Var = new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, 0, (Integer) null, ac51.a(ac51.a(ac51Var.b(jLongValue, cc51.e), cc51Var, (Long) null, jLongValue, 0, (ArrayList) null, 0, (Long) null, (bc51) null, 2007), (cc51) null, (Long) null, 0L, 0, (ArrayList) null, (bc51Var2 == null || bc51Var2.a <= 0) ? ac51Var.i : 2, (Long) null, bc51Var2, 767), 0L, 159), (zb51) null, 6);
                        } else {
                            yb51Var = new yb51(ec51.a(ec51Var, 0, 0L, 0L, 0, 0, (Integer) null, (ac51) null, 0L, 159), ac51.a(ac51Var, (cc51) null, (Long) null, 0L, 0, (ArrayList) null, 0, (Long) null, (bc51) obj3, 1023).c(2, jLongValue), 4);
                        }
                        return yb51Var;
                    }
                }
                return new yb51(ec51Var, (zb51) null, 6);
            default:
                ((Number) obj2).intValue();
                wro1.D((nbh) obj3, z, (b0k) obj, czo1.p(i | 1));
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(int i, c380 c380Var, boolean z) {
        super(2);
        this.a = (byte) 2;
        this.b = z;
        this.d = c380Var;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ se5(Object obj, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(bc51 bc51Var, int i, boolean z) {
        super(2);
        this.a = (byte) 6;
        this.d = bc51Var;
        this.c = i;
        this.b = z;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public se5(boolean z, o95 o95Var, int i, int i2) {
        super(2);
        this.a = (byte) 0;
        this.b = z;
        this.d = o95Var;
        this.c = i;
    }
}
