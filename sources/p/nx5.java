package p;

import android.appwidget.AppWidgetManager;
import android.view.View;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes8.dex */
public final class nx5 extends a8d1 implements vu30 {
    public final /* synthetic */ byte a;
    public /* synthetic */ int b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nx5(Object obj, int i, lnm lnmVar, byte b) {
        super(2, lnmVar);
        this.a = b;
        this.c = obj;
        this.b = i;
    }

    public final lnm create(Object obj, lnm lnmVar) {
        byte b = this.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                return new nx5((ox5) obj2, this.b, lnmVar, (byte) 0);
            case 1:
                return new nx5((ajq0) obj2, this.b, lnmVar, (byte) 1);
            case 2:
                return new nx5((s1m) obj2, this.b, lnmVar, (byte) 2);
            case 3:
                return new nx5((rfm) obj2, this.b, lnmVar, (byte) 3);
            case 4:
                return new nx5((vl30) obj2, this.b, lnmVar, (byte) 4);
            case 5:
                return new nx5((ro30) obj2, this.b, lnmVar, (byte) 5);
            case 6:
                return new nx5((ohd) obj2, this.b, lnmVar, (byte) 6);
            case 7:
                return new nx5((upb0) obj2, this.b, lnmVar, (byte) 7);
            case 8:
                return new nx5((fvb0) obj2, this.b, lnmVar, (byte) 8);
            case 9:
                return new nx5((p3u0) obj2, this.b, lnmVar, (byte) 9);
            case 10:
                return new nx5((vi11) obj2, this.b, lnmVar, (byte) 10);
            case 11:
                return new nx5((nn61) obj2, this.b, lnmVar, (byte) 11);
            case 12:
                return new nx5((vxe1) obj2, this.b, lnmVar, (byte) 12);
            default:
                nx5 nx5Var = new nx5((wen0) obj2, lnmVar);
                nx5Var.b = ((Number) obj).intValue();
                return nx5Var;
        }
    }

    public final Object invoke(Object obj, Object obj2) {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        switch (b) {
            case 0:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 1:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 2:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 3:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 4:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 5:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            case 6:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 7:
                create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 8:
                create((bs41) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 9:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 10:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 11:
                create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
            case 12:
                return create((c9n) obj, (lnm) obj2).invokeSuspend(rih1Var);
            default:
                create(Integer.valueOf(((Number) obj).intValue()), (lnm) obj2).invokeSuspend(rih1Var);
                return rih1Var;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0102  */
    /* JADX WARN: Multi-variable type inference failed */
    public final Object invokeSuspend(Object obj) {
        int i;
        avb0 avb0Var;
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj2 = this.c;
        switch (b) {
            case 0:
                hm5.M(obj);
                return ((AppWidgetManager) ((ox5) obj2).c.getValue()).getAppWidgetOptions(this.b);
            case 1:
                hm5.M(obj);
                kt91 kt91Var = (kt91) ((ajq0) obj2).b;
                int i2 = this.b;
                n57.k(i2 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i2)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var.k(new er91((fs91) null, "", Integer.valueOf(i2), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 2:
                hm5.M(obj);
                s1m s1mVar = (s1m) obj2;
                b431 b431Var = s1mVar.f;
                String str = s1mVar.a;
                int i3 = this.b;
                b431Var.a(new jse(str, i3 != 0 ? Collections.singletonList(ktd.t(i3)) : p7h.M(new String[]{"LYRICS_STICKERS", "GIFS"}), (String) null), (String) null);
                return rih1Var;
            case 3:
                hm5.M(obj);
                rfm rfmVar = (rfm) obj2;
                kt91 kt91Var2 = rfmVar.c2;
                if (kt91Var2 == null) {
                    u890.C("snackbarManager");
                    throw null;
                }
                int i4 = this.b;
                n57.k(i4 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i4)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var2.k(new er91((fs91) null, "", Integer.valueOf(i4), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                if (rfmVar.q0()) {
                    th30 th30Var = ((zf30) rfmVar).U0;
                    if (th30Var != null ? th30Var.U() : false) {
                        rfmVar.Y0();
                    } else {
                        rfmVar.dismiss();
                    }
                }
                return rih1Var;
            case 4:
                hm5.M(obj);
                vl30 vl30Var = (vl30) obj2;
                xok0 xok0Var = vl30Var.c;
                i8h1 i8h1Var = vl30Var.a;
                y6h1 y6h1Var = xok0Var.b;
                switch (l1d.C(this.b)) {
                    case 0:
                    case 5:
                    case 6:
                        return rih1Var;
                    case 1:
                        x6h1 x6h1VarC = y6h1Var.c();
                        x6h1VarC.i.add(new a7h1("jam_capped_queue_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC.j = true;
                        y6h1 y6h1VarA = x6h1VarC.a();
                        k7h1 k7h1Var = new k7h1();
                        ((xjn) k7h1Var).a = y6h1VarA;
                        ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                        return i8h1Var.f(k7h1Var.a(), (Set) null);
                    case 2:
                        x6h1 x6h1VarC2 = y6h1Var.c();
                        x6h1VarC2.i.add(new a7h1("jam_capped_play_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC2.j = true;
                        y6h1 y6h1VarA2 = x6h1VarC2.a();
                        k7h1 k7h1Var2 = new k7h1();
                        ((xjn) k7h1Var2).a = y6h1VarA2;
                        ((xjn) k7h1Var2).c = Long.valueOf(System.currentTimeMillis());
                        return i8h1Var.f(k7h1Var2.a(), (Set) null);
                    case 3:
                        x6h1 x6h1VarC3 = y6h1Var.c();
                        x6h1VarC3.i.add(new a7h1("jam_capped_skip_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC3.j = true;
                        y6h1 y6h1VarA3 = x6h1VarC3.a();
                        k7h1 k7h1Var3 = new k7h1();
                        ((xjn) k7h1Var3).a = y6h1VarA3;
                        ((xjn) k7h1Var3).c = Long.valueOf(System.currentTimeMillis());
                        return i8h1Var.f(k7h1Var3.a(), (Set) null);
                    case 4:
                        x6h1 x6h1VarC4 = y6h1Var.c();
                        x6h1VarC4.i.add(new a7h1("jam_capped_shuffle_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC4.j = true;
                        y6h1 y6h1VarA4 = x6h1VarC4.a();
                        k7h1 k7h1Var4 = new k7h1();
                        ((xjn) k7h1Var4).a = y6h1VarA4;
                        ((xjn) k7h1Var4).c = Long.valueOf(System.currentTimeMillis());
                        return i8h1Var.f(k7h1Var4.a(), (Set) null);
                    case 7:
                        x6h1 x6h1VarC5 = y6h1Var.c();
                        x6h1VarC5.i.add(new a7h1("jam_capped_transition_snackbar", (String) null, (Integer) null, (String) null, (String) null));
                        x6h1VarC5.j = true;
                        y6h1 y6h1VarA5 = x6h1VarC5.a();
                        k7h1 k7h1Var5 = new k7h1();
                        ((xjn) k7h1Var5).a = y6h1VarA5;
                        ((xjn) k7h1Var5).c = Long.valueOf(System.currentTimeMillis());
                        return i8h1Var.f(k7h1Var5.a(), (Set) null);
                    default:
                        eg.o();
                        return null;
                }
            case 5:
                hm5.M(obj);
                at40 at40Var = (at40) ((idd1) ((ro30) obj2).c).getValue();
                int i5 = this.b;
                if (at40Var.b.getAppWidgetInfo(i5) != null) {
                    return new kx5(i5);
                }
                hhg1.n("Invalid AppWidget ID.");
                return null;
            case 6:
                hm5.M(obj);
                ohd ohdVar = (ohd) obj2;
                if (ohdVar.s() instanceof ago0) {
                    ohdVar.resumeWith("#".concat(Integer.toHexString(this.b).substring(2)));
                }
                return rih1Var;
            case 7:
                hm5.M(obj);
                ((upb0) obj2).j(this.b, 0, true);
                return rih1Var;
            case 8:
                hm5.M(obj);
                fvb0 fvb0Var = (fvb0) obj2;
                int i6 = this.b;
                uu0 uu0Var = fvb0Var.c;
                err0 err0Var = (err0) uu0Var.d;
                err0 err0Var2 = (err0) uu0Var.f;
                Object[] objArr = (err0Var.s() == i6 && err0Var2.s() == 0) ? false : true;
                if (objArr != false) {
                    bsb0 bsb0Var = fvb0Var.t;
                    bsb0Var.e();
                    bsb0Var.b = null;
                    bsb0Var.c = -1;
                }
                yub0 yub0Var = (yub0) fvb0Var.d.getValue();
                yub0 yub0Var2 = zub0.a;
                List list = yub0Var.m;
                if (list.isEmpty()) {
                    avb0Var = null;
                } else {
                    int i7 = ((avb0) o7h.q0(list)).a;
                    if (i6 > ((avb0) o7h.A0(list)).a || i7 > i6) {
                        avb0Var = null;
                    } else {
                        List list2 = yub0Var.m;
                        int size = list2.size();
                        p7h.Q(list2.size(), size);
                        int i8 = size - 1;
                        int i9 = 0;
                        while (true) {
                            if (i9 <= i8) {
                                i = (i9 + i8) >>> 1;
                                int i10 = ((avb0) list2.get(i)).a - i6;
                                if (i10 < 0) {
                                    i9 = i + 1;
                                } else if (i10 > 0) {
                                    i8 = i - 1;
                                }
                            } else {
                                i = -(i9 + 1);
                            }
                        }
                        avb0Var = (avb0) o7h.t0(i, list);
                    }
                }
                if (avb0Var == null || !objArr == true) {
                    int[] iArr = (int[]) ((c4z) uu0Var.b).invoke(Integer.valueOf(i6), Integer.valueOf(((int[]) uu0Var.c).length));
                    int length = iArr.length;
                    int[] iArr2 = new int[length];
                    for (int i11 = 0; i11 < length; i11++) {
                        iArr2[i11] = 0;
                    }
                    uu0Var.c = iArr;
                    ((err0) uu0Var.d).t(uu0.h(iArr));
                    uu0Var.e = iArr2;
                    err0Var2.t(uu0.i(iArr, iArr2));
                    ((ksb0) uu0Var.h).c(i6);
                    uu0Var.g = null;
                } else {
                    qqq0 qqq0Var = yub0Var.u;
                    int[] iArr3 = yub0Var.b;
                    long j = avb0Var.w;
                    int i12 = (int) (qqq0Var == qqq0.a ? j & 4294967295L : j >> 32);
                    int length2 = iArr3.length;
                    int[] iArr4 = new int[length2];
                    for (int i13 = 0; i13 < length2; i13++) {
                        iArr4[i13] = iArr3[i13] + i12;
                    }
                    uu0Var.e = iArr4;
                    err0Var2.t(uu0.i((int[]) uu0Var.c, iArr4));
                }
                hmb0 hmb0Var = fvb0Var.h;
                if (hmb0Var != null) {
                    hmb0Var.l();
                }
                return rih1Var;
            case 9:
                hm5.M(obj);
                p3u0 p3u0Var = (p3u0) obj2;
                int i14 = this.b;
                if (p3u0Var.S0) {
                    p3u0Var.c.m0(new i3u0(p3u0Var, i14, (byte) 0));
                } else {
                    p3u0Var.h.s(p3u0Var.i, i14);
                }
                return rih1Var;
            case 10:
                hm5.M(obj);
                kt91 kt91Var3 = (kt91) ((vi11) obj2).d;
                int i15 = this.b;
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i15)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var3.k(new er91((fs91) null, "", Integer.valueOf(i15), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 11:
                hm5.M(obj);
                kt91 kt91Var4 = (kt91) ((nn61) obj2).b;
                int i16 = this.b;
                n57.k(i16 != 0, "Invalid resource ID provided: %s", new Object[]{Integer.valueOf(i16)});
                n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
                kt91Var4.k(new er91((fs91) null, "", Integer.valueOf(i16), (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false));
                return rih1Var;
            case 12:
                hm5.M(obj);
                return ((vxe1) obj2).a.v(this.b, 3, 2);
            default:
                int i17 = this.b;
                hm5.M(obj);
                Integer num = new Integer(i17);
                bpb1 bpb1Var = (wen0) obj2;
                bpb1Var.getClass();
                bpb1Var.m((Object) null, num);
                return rih1Var;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nx5(wen0 wen0Var, lnm lnmVar) {
        super(2, lnmVar);
        this.a = (byte) 13;
        this.c = wen0Var;
    }
}
