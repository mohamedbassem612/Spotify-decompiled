package p;

import android.content.Context;
import android.os.Looper;
import android.view.ViewGroup;
import com.spotify.automix.proto.TransitionOuterClass$Overlap;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.List;
import java.util.Set;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes5.dex */
public final class z77 extends hab0 implements Function0 {
    public final /* synthetic */ byte a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ z77(Object obj, Object obj2, byte b) {
        super(0);
        this.a = b;
        this.b = obj;
        this.c = obj2;
    }

    public final Object invoke() {
        byte b = this.a;
        rih1 rih1Var = rih1.a;
        Object obj = this.c;
        Object obj2 = this.b;
        switch (b) {
            case 0:
                ((o77) obj2).o.invoke(new pa7((i) obj));
                return rih1Var;
            case 1:
                ((g87) obj2).c.invoke(new sa7(((yrd) obj).e));
                return rih1Var;
            case 2:
                xh7 xh7Var = (xh7) obj2;
                Context context = (Context) obj;
                fns fnsVar = igu.a;
                fn31.T(ov40.a, b3s.c, 0, new vh7(xh7Var, context, (lnm) null), 2);
                c921.x(igu.a, 4, new vh7(context, xh7Var, (lnm) null));
                return rih1Var;
            case 3:
                ((dj7) obj2).a.b((String) obj);
                return rih1Var;
            case 4:
                return new ak7((maa) ((iu30) obj2).invoke((d0r) obj));
            case 5:
                ((iu30) obj2).invoke((m5f) obj);
                return rih1Var;
            case 6:
                return new kpg0((xpw) ((vq7) obj2).a.invoke((oud) obj), rq7.d);
            case 7:
                at7 at7Var = ((zs7) obj2).a;
                f70 f70Var = new f70((byte) 3);
                q8n q8nVar = (q8n) at7Var.h;
                ps7 ps7Var = new ps7(r7r.D(), (byte) 0);
                wh71 wh71Var = (wh71) at7Var.d;
                c8o.l(wh71Var);
                s6v0 s6v0Var = (s6v0) at7Var.c;
                qwe1 qwe1Var = (qwe1) at7Var.e;
                vr51 vr51Var = (vr51) at7Var.g;
                Context context2 = (Context) at7Var.f;
                return new kpg0(new u7p0(f70Var, new ys7(q8nVar, ps7Var, wh71Var, (oud) obj, new o0g1(at7Var.b, s6v0Var, qwe1Var, vr51Var, context2, (byte) 15), context2, vr51Var)), rq7.O0);
            case 8:
                ((iu30) obj2).invoke((sx7) obj);
                return rih1Var;
            case 9:
                ((iu30) obj2).invoke((tx7) obj);
                return rih1Var;
            case 10:
                ((iu30) obj2).invoke((yx7) obj);
                return rih1Var;
            case 11:
                ((yo00) obj2).P((oz7) obj);
                return rih1Var;
            case 12:
                er91 er91Var = (er91) ((Function0) obj2).invoke();
                kt91 kt91Var = ((g58) obj).b;
                if (kt91Var.g()) {
                    kt91Var.k(er91Var);
                } else {
                    kt91Var.o(er91Var);
                }
                return rih1Var;
            case 13:
                o88 o88Var = (o88) obj2;
                iu30 iu30Var = (iu30) obj;
                if (o88Var.a.f.b.length() == 0) {
                    iu30Var.invoke(i88.a);
                } else {
                    iu30Var.invoke(new h88(o88Var.a.f.b));
                }
                return rih1Var;
            case 14:
                return ((t8u0) obj2).a(((iac0) obj).getLifecycle());
            case 15:
                vyo vyoVar = (vyo) ((a680) obj2).c;
                p1f0 p1f0Var = (p1f0) obj;
                zxu zxuVar = (zxu) p1f0Var.e;
                List list = ((oyu) p1f0Var.f).o;
                if (list != null) {
                    return f6o1.A(vyo.b(vyoVar, zxuVar, list), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3);
                }
                u890.C("_gates");
                throw null;
            case 16:
                yxb0 yxb0Var = (yxb0) obj2;
                r6h1 r6h1Var = (r6h1) yxb0Var.f;
                if (r6h1Var != null) {
                    i8h1 i8h1Var = (i8h1) ((kly0) yxb0Var.e).get();
                    String str = ((kn9) obj).d;
                    y6h1 y6h1Var = y6h1.i;
                    x6h1 x6h1VarI = i3o1.i();
                    x6h1VarI.h = "music";
                    x6h1VarI.a = "mobile-byom-playback-unavailable-snackbar";
                    x6h1VarI.f = "1.0.0";
                    x6h1VarI.g = "22.0.0";
                    x6h1VarI.b = "npv_scroll_card";
                    x6h1VarI.d = str;
                    y6h1 y6h1VarA = x6h1VarI.a();
                    k7h1 k7h1Var = new k7h1();
                    ((xjn) k7h1Var).a = y6h1VarA;
                    ((xjn) k7h1Var).b = r6h1Var;
                    ((xjn) k7h1Var).c = Long.valueOf(System.currentTimeMillis());
                    i8h1Var.f(k7h1Var.a(), (Set) null);
                }
                return rih1Var;
            case 17:
                ((or9) obj2).a((c9n) obj);
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_A_FIELD_NUMBER /* 18 */:
                ((iu30) obj2).invoke(Float.valueOf(((drr0) obj).s()));
                return rih1Var;
            case TransitionOuterClass$Overlap.ITEM_SPEED_B_FIELD_NUMBER /* 19 */:
                ((ven0) obj).setValue(Boolean.FALSE);
                r1q0 r1q0Var = (r1q0) obj2;
                if (r1q0Var != null) {
                    r1q0Var.d();
                }
                return rih1Var;
            case 20:
                return new kpg0((xpw) ((d0a) obj2).a.invoke((oud) obj), fr9.P0);
            case 21:
                ((iu30) obj2).invoke(((v3a) obj).c ? r3a.b : r3a.a);
                return rih1Var;
            case 22:
                ((iu30) obj2).invoke((n8j0) obj);
                return rih1Var;
            case 23:
                ((i5a) obj2).c.invoke((h8a) obj);
                return rih1Var;
            case 24:
                ((n5a) obj2).h.invoke((h8a) obj);
                return rih1Var;
            case 25:
                jvd jvdVarF = ((x9a) obj).f();
                ((fjb) obj2).getClass();
                return new kvd(jvdVarF);
            case 26:
                ((iu30) obj2).invoke(((qb81) obj).d.c);
                return rih1Var;
            case 27:
                ((pka) obj2).e = true;
                ((Function0) obj).invoke();
                return rih1Var;
            case 28:
                ((ala) obj2).d = true;
                ((Function0) obj).invoke();
                return rih1Var;
            default:
                uoa uoaVar = (uoa) obj2;
                Runnable nx30Var = new nx30(uoaVar, (m0u0) obj, (byte) 6);
                if (u890.j(Looper.getMainLooper(), Looper.myLooper())) {
                    nx30Var.run();
                } else {
                    uoaVar.e.post(nx30Var);
                }
                return rih1Var;
        }
    }
}
