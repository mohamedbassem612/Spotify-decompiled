package p;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import com.spotify.mobius.First;
import java.util.LinkedHashSet;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class yd2 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Context b;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yd2(zd2 zd2Var, Context context) {
        super(2);
        this.a = (byte) 0;
        this.b = context;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Context context = this.b;
        switch (b) {
            case 0:
                ulc.r(context, (String) obj, (tv80) obj2);
                return rih1Var;
            case 1:
                lt7 lt7Var = (lt7) obj2;
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                u771 u771Var = lt7Var.a;
                if (u771Var.b.d) {
                    vve1 vve1Var = lt7Var.X;
                    linkedHashSet.add(new et7(u771Var, vve1Var != null ? vve1Var.a : 0L, lt7Var.Y));
                }
                if (lt7Var.Z != null) {
                    linkedHashSet.add(new dt7(context.getString(2131960177)));
                }
                return First.c(lt7Var, linkedHashSet);
            case 2:
                ((Number) obj2).intValue();
                context.startActivity(new Intent("android.intent.action.VIEW", Uri.parse((String) obj)));
                return rih1Var;
            case 3:
                x340 x340Var = (b0k) obj;
                int iIntValue = ((Number) obj2).intValue();
                x340 x340Var2 = x340Var;
                if (x340Var2.Y(iIntValue & 1, (iIntValue & 3) != 2)) {
                    uwo1.e(context.getString(2131954524), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var2, 0, 0, 2046);
                } else {
                    x340Var2.b0();
                }
                return rih1Var;
            case 4:
                x340 x340Var3 = (b0k) obj;
                int iIntValue2 = ((Number) obj2).intValue();
                x340 x340Var4 = x340Var3;
                if (x340Var4.Y(iIntValue2 & 1, (iIntValue2 & 3) != 2)) {
                    o4p1.g(context.getString(2131959285), (gt40) null, nee1.h, 0, x340Var4, 0, 10);
                } else {
                    x340Var4.b0();
                }
                return rih1Var;
            case 5:
                x340 x340Var5 = (b0k) obj;
                int iIntValue3 = ((Number) obj2).intValue();
                x340 x340Var6 = x340Var5;
                if (x340Var6.Y(iIntValue3 & 1, (iIntValue3 & 3) != 2)) {
                    String string = context.getString(2131957332);
                    uwr uwrVar = cbx.a;
                    uwo1.e(string, (qim0) null, cbx.d(x340Var6).k, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var6, 0, 0, 2042);
                } else {
                    x340Var6.b0();
                }
                return rih1Var;
            case 6:
                x340 x340Var7 = (b0k) obj;
                int iIntValue4 = ((Number) obj2).intValue();
                x340 x340Var8 = x340Var7;
                if (x340Var8.Y(iIntValue4 & 1, (iIntValue4 & 3) != 2)) {
                    uwo1.e(context.getString(2131959690), (qim0) null, (lee1) null, 0L, (a0e1) null, (iu30) null, 0, false, (djc0) null, 0, (qx8) null, x340Var8, 0, 0, 2046);
                } else {
                    x340Var8.b0();
                }
                return rih1Var;
            case 7:
                a3e1 a3e1Var = (a3e1) obj2;
                u771 u771Var2 = a3e1Var.a;
                eee1 eee1Var = a3e1Var.f;
                LinkedHashSet linkedHashSet2 = new LinkedHashSet();
                y2e1 y2e1Var = a3e1Var.c;
                if (y2e1Var instanceof w2e1) {
                    if (eee1Var instanceof eee1) {
                        linkedHashSet2.add(new m2e1(u771Var2, a3e1Var.e, eee1Var.a));
                    }
                } else if (y2e1Var instanceof x2e1) {
                    linkedHashSet2.add(new i2e1(a3e1Var.d, a3e1Var.a, a3e1Var.e, eee1Var.a, (String) null));
                } else {
                    if (!(y2e1Var instanceof v2e1)) {
                        eg.o();
                        return null;
                    }
                    linkedHashSet2.add(new h2e1(u771Var2));
                }
                if (a3e1Var.O0 != null) {
                    linkedHashSet2.add(new l2e1(context.getString(2131960177)));
                }
                return First.c(a3e1Var, linkedHashSet2);
            case 8:
                s5k1 s5k1Var = (s5k1) obj2;
                u771 u771Var3 = s5k1Var.i;
                LinkedHashSet linkedHashSet3 = new LinkedHashSet();
                q5k1 q5k1Var = s5k1Var.N0;
                if (q5k1Var instanceof o5k1) {
                    linkedHashSet3.add(new a5k1(u771Var3, s5k1Var.t, s5k1Var.Z));
                } else if (q5k1Var instanceof p5k1) {
                    linkedHashSet3.add(new w4k1(s5k1Var.i, s5k1Var.X, s5k1Var.t, s5k1Var.Y, (String) null));
                } else {
                    if (!(q5k1Var instanceof n5k1)) {
                        eg.o();
                        return null;
                    }
                    linkedHashSet3.add(new u4k1(u771Var3));
                }
                if (s5k1Var.P0 != null) {
                    linkedHashSet3.add(new z4k1(context.getString(2131960177)));
                }
                return First.c(s5k1Var, linkedHashSet3);
            default:
                context.getClass();
                return new hem1(new w6e0(context, ((cdm1) obj).c), (iu30) obj2);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ yd2(Context context, byte b) {
        super(2);
        this.a = b;
        this.b = context;
    }
}
