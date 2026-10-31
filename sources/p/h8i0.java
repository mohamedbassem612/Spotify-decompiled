package p;

import android.graphics.Bitmap;
import java.util.ArrayList;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class h8i0 extends hab0 implements vu30 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object e;
    public final /* synthetic */ Object f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i0(xud1 xud1Var, sud1 sud1Var, boolean z, iu30 iu30Var, int i) {
        super(2);
        this.a = (byte) 11;
        this.d = xud1Var;
        this.e = sud1Var;
        this.b = z;
        this.f = iu30Var;
        this.c = i;
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        int i = this.c;
        rih1 rih1Var = rih1.a;
        Object obj3 = this.f;
        Object obj4 = this.e;
        Object obj5 = this.d;
        switch (b) {
            case 0:
                ((Number) obj2).intValue();
                int iP = czo1.p(i | 1);
                boolean z = this.b;
                ((k8i0) obj5).h((Bitmap) obj4, z, (qim0) obj3, (b0k) obj, iP);
                break;
            case 1:
                ((Number) obj2).intValue();
                int iP2 = czo1.p(i | 1);
                ((t8k0) obj5).h((uuj0) obj4, (lhg1) obj3, this.b, (b0k) obj, iP2);
                break;
            case 2:
                ((Number) obj2).intValue();
                int iP3 = czo1.p(i | 1);
                ((wik0) obj5).i((kak0) obj4, (t4h1) obj3, this.b, (b0k) obj, iP3);
                break;
            case 3:
                ((Number) obj2).intValue();
                int iP4 = czo1.p(i | 1);
                boolean z2 = this.b;
                x3p1.d((fcf0) obj5, (kbf0) obj4, z2, (iu30) obj3, (b0k) obj, iP4);
                break;
            case 4:
                ((Number) obj2).intValue();
                Function0 function0 = (Function0) obj3;
                int iP5 = czo1.p(i | 1);
                boolean z3 = this.b;
                jap1.e((String) obj5, z3, (Function0) obj4, function0, (b0k) obj, iP5);
                break;
            case 5:
                ((Number) obj2).intValue();
                int iP6 = czo1.p(i | 1);
                gxo1.f((aob1) obj5, (maa) obj4, (kly0) obj3, this.b, (b0k) obj, iP6);
                break;
            case 6:
                ((Number) obj2).intValue();
                int iP7 = czo1.p(i | 1);
                boolean z4 = this.b;
                y2o1.a((xxr0) obj5, (iyr0) obj4, z4, (vb1) obj3, (b0k) obj, iP7);
                break;
            case 7:
                ((Number) obj2).intValue();
                int iP8 = czo1.p(1);
                boolean z5 = this.b;
                int i2 = this.c;
                ((yxb0) obj5).f(z5, (ArrayList) obj4, i2, (qim0) obj3, (b0k) obj, iP8);
                break;
            case 8:
                ((Number) obj2).intValue();
                int iP9 = czo1.p(1);
                int i3 = this.c;
                boolean z6 = this.b;
                rr51.d(i3, (Integer) obj5, z6, (Function0) obj4, (Function0) obj3, (b0k) obj, iP9);
                break;
            case 9:
                ((Number) obj2).intValue();
                int iP10 = czo1.p(i | 1);
                boolean z7 = this.b;
                tho1.l(z7, (String) obj5, (Function0) obj4, (j2i) obj3, (b0k) obj, iP10);
                break;
            case 10:
                ((Number) obj2).intValue();
                int iP11 = czo1.p(i | 1);
                boolean z8 = this.b;
                ((u7p0) obj5).e((String) obj4, z8, (iu30) obj3, (b0k) obj, iP11);
                break;
            case 11:
                ((Number) obj2).intValue();
                int iP12 = czo1.p(i | 1);
                boolean z9 = this.b;
                ((xud1) obj5).a((sud1) obj4, z9, (iu30) obj3, (b0k) obj, iP12);
                break;
            case 12:
                ((Number) obj2).intValue();
                int iP13 = czo1.p(i | 1);
                boolean z10 = this.b;
                oon1.j((cxc0) obj5, z10, (String) obj4, (Function0) obj3, (b0k) obj, iP13);
                break;
            case 13:
                ((Number) obj2).intValue();
                Function0 function1 = (Function0) obj3;
                int iP14 = czo1.p(i | 1);
                boolean z11 = this.b;
                uah1.a((String) obj5, z11, (Integer) obj4, function1, (b0k) obj, iP14);
                break;
            case 14:
                ((Number) obj2).intValue();
                int iP15 = czo1.p(1);
                int i4 = this.c;
                boolean z12 = this.b;
                eko1.e(i4, (mvh1) obj5, z12, (bih1) obj4, (iu30) obj3, (b0k) obj, iP15);
                break;
            default:
                ((Number) obj2).intValue();
                int iP16 = czo1.p(i | 1);
                boolean z13 = this.b;
                vyo1.r((dyi1) obj5, (iu30) obj4, z13, (j2i) obj3, (b0k) obj, iP16);
                break;
        }
        return rih1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8i0(byte b, int i, Object obj, Object obj2, Function0 function0, boolean z) {
        super(2);
        this.a = b;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.f = function0;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8i0(Object obj, Object obj2, Object obj3, boolean z, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.f = obj3;
        this.b = z;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8i0(Object obj, Object obj2, boolean z, Object obj3, int i, byte b) {
        super(2);
        this.a = b;
        this.d = obj;
        this.e = obj2;
        this.b = z;
        this.f = obj3;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i0(yxb0 yxb0Var, boolean z, ArrayList arrayList, int i, qim0 qim0Var, int i2) {
        super(2);
        this.a = (byte) 7;
        this.d = yxb0Var;
        this.b = z;
        this.e = arrayList;
        this.c = i;
        this.f = qim0Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ h8i0(byte b, int i, int i2, Object obj, Object obj2, cv30 cv30Var, boolean z) {
        super(2);
        this.a = b;
        this.c = i;
        this.d = obj;
        this.b = z;
        this.e = obj2;
        this.f = cv30Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i0(dyi1 dyi1Var, iu30 iu30Var, boolean z, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 15;
        this.d = dyi1Var;
        this.e = iu30Var;
        this.b = z;
        this.f = j2iVar;
        this.c = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h8i0(boolean z, String str, Function0 function0, j2i j2iVar, int i) {
        super(2);
        this.a = (byte) 9;
        this.b = z;
        this.d = str;
        this.e = function0;
        this.f = j2iVar;
        this.c = i;
    }
}
