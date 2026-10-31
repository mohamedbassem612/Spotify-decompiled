package p;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.spotify.nowplaying.scroll.ScrollCardType;
import java.util.WeakHashMap;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes9.dex */
public final class byg0 implements g4h1 {
    public final q7r0 a;
    public final iug0 b;
    public final ao0 c;
    public final cyg0 d;
    public final gw70 e;
    public final qr20 f;
    public final sw9 g;
    public final lug0 h;
    public final kt91 i;
    public final dto0 j;
    public final tm4 k;
    public final boolean l;
    public final cir0 m;
    public h72 n;
    public boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final er91 f6p;

    public byg0(q7r0 q7r0Var, iug0 iug0Var, ao0 ao0Var, cyg0 cyg0Var, gw70 gw70Var, qr20 qr20Var, sw9 sw9Var, lug0 lug0Var, kt91 kt91Var, dto0 dto0Var, tm4 tm4Var, boolean z, cir0 cir0Var) {
        this.a = q7r0Var;
        this.b = iug0Var;
        this.c = ao0Var;
        this.d = cyg0Var;
        this.e = gw70Var;
        this.f = qr20Var;
        this.g = sw9Var;
        this.h = lug0Var;
        this.i = kt91Var;
        this.j = dto0Var;
        this.k = tm4Var;
        this.l = z;
        this.m = cir0Var;
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{2131960399});
        n57.k(true, "Invalid resource ID provided: %s", new Object[]{null});
        this.f6p = new er91((fs91) null, "", 2131960399, (String) null, (Integer) null, (View.OnClickListener) null, (cvr) null, (xq91) null, false);
    }

    public final f4h1 a(Context context, Bundle bundle, LayoutInflater layoutInflater, ViewGroup viewGroup) {
        dg30 dg30Var = context instanceof dg30 ? (dg30) context : null;
        byte b = 0;
        this.o = bundle != null ? bundle.getBoolean("is_animation_completed", false) : false;
        xxg0 xxg0Var = new xxg0(this, dg30Var, b);
        q0g0 q0g0Var = new q0g0(this, dg30Var, (byte) 9);
        xxg0 xxg0Var2 = new xxg0(this, dg30Var, (byte) 1);
        tzf0 tzf0Var = new tzf0(this, (byte) 19);
        fpo fpoVar = new fpo(this, dg30Var, (lnm) null, (byte) 20);
        ao0 ao0Var = this.c;
        sw9 sw9Var = this.g;
        qr20 qr20Var = this.f;
        tm4 tm4Var = this.k;
        boolean z = this.l;
        gw70 gw70Var = this.e;
        lug0 lug0Var = this.h;
        laa laaVarA = z ? f6o1.A(new mvg0(gw70Var, lug0Var, qr20Var, sw9Var, ao0Var, xxg0Var, q0g0Var, xxg0Var2, tzf0Var, fpoVar, tm4Var.d()), (ViewGroup.LayoutParams) null, (ScrollCardType) null, 3) : new s060(gw70Var, lug0Var, qr20Var, sw9Var, ao0Var, xxg0Var, q0g0Var, xxg0Var2, tzf0Var, fpoVar, tm4Var.d());
        iug0 iug0Var = this.b;
        ewg0 ewg0Var = new ewg0(iug0Var.a, iug0Var.b, iug0Var.c, iug0Var.d, iug0Var.e, iug0Var.f, iug0Var.h, iug0Var.i, iug0Var.t, iug0Var.X, iug0Var.Y, iug0Var.Z, iug0Var.O0, iug0Var.P0, iug0Var.Q0);
        tka0 tka0Var = dtw.C;
        View view = mhc.b(context, viewGroup, laaVarA, ewg0Var, (ipb1) null, 112).w;
        if (!z) {
            View viewFindViewById = view.findViewById(2131429903);
            View viewFindViewById2 = view.findViewById(2131429902);
            View viewFindViewById3 = view.findViewById(2131429900);
            ConstraintLayout constraintLayoutFindViewById = view.findViewById(2131429901);
            viewFindViewById.getClass();
            viewFindViewById2.getClass();
            viewFindViewById3.getClass();
            constraintLayoutFindViewById.getClass();
            this.n = new h72(viewFindViewById, viewFindViewById2, viewFindViewById3, constraintLayoutFindViewById);
            ViewGroup viewGroup2 = (ViewGroup) view.findViewById(2131429906);
            if (viewGroup2 != null) {
                viewGroup2.setClipChildren(false);
                r10 r10Var = new r10(viewFindViewById3);
                WeakHashMap weakHashMap = b8k1.a;
                r7k1.c(viewGroup2, r10Var);
                viewGroup2.addOnAttachStateChangeListener(new yxg0((byte) 0));
            }
        }
        this.m.j(new a0c(this, dg30Var, (byte) 2));
        return new l59(view, (Object) this, (byte) 4);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005e, code lost:
    
        if (p.hap1.i(1000, r0) == r6) goto L26;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final java.lang.Object b(p.dg30 r11, p.onm r12) {
        /*
            r10 = this;
            boolean r0 = r12 instanceof p.zxg0
            if (r0 == 0) goto L13
            r0 = r12
            p.zxg0 r0 = (p.zxg0) r0
            int r1 = r0.d
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.d = r1
            goto L18
        L13:
            p.zxg0 r0 = new p.zxg0
            r0.<init>(r10, r12)
        L18:
            java.lang.Object r12 = r0.b
            int r1 = r0.d
            r2 = 0
            p.rih1 r3 = p.rih1.a
            r4 = 2
            r5 = 1
            p.d9n r6 = p.d9n.a
            if (r1 == 0) goto L3b
            if (r1 == r5) goto L35
            if (r1 != r4) goto L2f
            p.dg30 r11 = r0.a
            p.hm5.M(r12)
            goto L61
        L2f:
            java.lang.String r10 = "call to 'resume' before 'invoke' with coroutine"
            p.eg.m(r10)
            return r2
        L35:
            p.dg30 r11 = r0.a
            p.hm5.M(r12)
            goto L4c
        L3b:
            p.hm5.M(r12)
            if (r11 != 0) goto L41
            goto L98
        L41:
            r0.a = r11
            r0.d = r5
            java.lang.Object r12 = r10.c(r0)
            if (r12 != r6) goto L4c
            goto L60
        L4c:
            java.lang.Boolean r12 = (java.lang.Boolean) r12
            boolean r12 = r12.booleanValue()
            if (r12 == 0) goto L98
            r0.a = r11
            r0.d = r4
            r4 = 1000(0x3e8, double:4.94E-321)
            java.lang.Object r12 = p.hap1.i(r4, r0)
            if (r12 != r6) goto L61
        L60:
            return r6
        L61:
            p.yro0 r4 = new p.yro0
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131960388(0x7f132244, float:1.9557443E38)
            java.lang.String r6 = r12.getString(r0)
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131960385(0x7f132241, float:1.9557437E38)
            java.lang.String r7 = r12.getString(r0)
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131960387(0x7f132243, float:1.9557441E38)
            java.lang.String r8 = r12.getString(r0)
            android.content.res.Resources r12 = r11.getResources()
            r0 = 2131960386(0x7f132242, float:1.955744E38)
            java.lang.String r9 = r12.getString(r0)
            r5 = 7
            r4.<init>(r5, r6, r7, r8, r9)
            p.dto0 r10 = r10.j
            r10.d(r11, r4, r2)
        L98:
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: p.byg0.b(p.dg30, p.onm):java.lang.Object");
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public final Object c(onm onmVar) {
        ayg0 ayg0Var;
        if (onmVar instanceof ayg0) {
            ayg0Var = (ayg0) onmVar;
            int i = ayg0Var.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                ayg0Var.c = i - Integer.MIN_VALUE;
            } else {
                ayg0Var = new ayg0(this, onmVar);
            }
        } else {
            ayg0Var = new ayg0(this, onmVar);
        }
        Object objO = ayg0Var.a;
        int i2 = ayg0Var.c;
        lnm lnmVar = null;
        byte b = 1;
        if (i2 == 0) {
            hm5.M(objO);
            uug0 uug0Var = new uug0(this, lnmVar, b);
            ayg0Var.c = 1;
            objO = rc2.O(2000L, uug0Var, ayg0Var);
            d9n d9nVar = d9n.a;
            if (objO == d9nVar) {
                return d9nVar;
            }
        } else {
            if (i2 != 1) {
                eg.m("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            hm5.M(objO);
        }
        Boolean bool = (Boolean) objO;
        return Boolean.valueOf(bool != null ? bool.booleanValue() : false);
    }
}
