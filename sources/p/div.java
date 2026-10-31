package p;

import android.content.Context;
import com.spotify.widgets.widgetstate.WidgetState;
import java.util.Map;
import java.util.concurrent.atomic.AtomicReferenceArray;
import kotlin.KotlinNothingValueException;
import kotlin.jvm.functions.Function0;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public class div extends ws40 {
    public static final mnv0 l = new mnv0("dynamicnpvwidget_state_key");
    public final float b;
    public final String c;
    public final String d;
    public final fg50 e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final Function0 i;
    public final v291 j;
    public final v441 k;

    /* JADX WARN: Illegal instructions before constructor call */
    public div(String str, String str2, Function0 function0, int i) {
        if ((i & 2) != 0) {
            AtomicReferenceArray atomicReferenceArray = p6r0.e;
            str = yon1.j4().c;
        }
        this(0.0f, str, str2, fg50.a, false, (i & 32) != 0, true, function0);
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    /* JADX WARN: Code duplicated, block: B:7:0x0013  */
    public static void g(div divVar, kx5 kx5Var, onm onmVar) throws KotlinNothingValueException {
        biv bivVar;
        if (onmVar instanceof biv) {
            bivVar = (biv) onmVar;
            int i = bivVar.c;
            if ((i & Integer.MIN_VALUE) != 0) {
                bivVar.c = i - Integer.MIN_VALUE;
            } else {
                bivVar = new biv(divVar, onmVar);
            }
        } else {
            bivVar = new biv(divVar, onmVar);
        }
        Object obj = bivVar.a;
        int i2 = bivVar.c;
        if (i2 != 0) {
            if (i2 == 1) {
                throw l1d.v(obj);
            }
            eg.m("call to 'resume' before 'invoke' with coroutine");
        } else {
            hm5.M(obj);
            j2i j2iVar = new j2i(1594431723, new civ(kx5Var, divVar), true);
            bivVar.c = 1;
            cev0.I(j2iVar, bivVar);
        }
    }

    public final v291 b() {
        return this.j;
    }

    public final v441 c() {
        return this.k;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.KotlinNothingValueException */
    public void d(Context context, kx5 kx5Var, lnm lnmVar) throws KotlinNothingValueException {
        g(this, kx5Var, (onm) lnmVar);
    }

    public final void f(WidgetState widgetState, String str, String str2, b0k b0kVar, int i, int i2) {
        int i3;
        String str3;
        String str4;
        String str5;
        String widgetCategory;
        x340 x340Var = (x340) b0kVar;
        x340Var.k0(1125147919);
        if ((i & 6) == 0) {
            i3 = (x340Var.i(widgetState) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            if ((i2 & 2) == 0) {
                str3 = str;
                int i4 = x340Var.g(str3) ? 32 : 16;
                i3 |= i4;
            } else {
                str3 = str;
            }
            i3 |= i4;
        } else {
            str3 = str;
        }
        if ((i & 384) == 0) {
            if ((i2 & 4) == 0) {
                str4 = str2;
                int i5 = x340Var.g(str4) ? 256 : 128;
                i3 |= i5;
            } else {
                str4 = str2;
            }
            i3 |= i5;
        } else {
            str4 = str2;
        }
        if ((i & 3072) == 0) {
            i3 |= x340Var.h(false) ? 2048 : 1024;
        }
        if ((i & 24576) == 0) {
            i3 |= (32768 & i) == 0 ? x340Var.g(this) : x340Var.i(this) ? 16384 : 8192;
        }
        if (x340Var.Y(i3 & 1, (i3 & 9363) != 9362)) {
            x340Var.d0();
            if ((i & 1) == 0 || x340Var.E()) {
                str5 = (i2 & 2) != 0 ? this.c : str3;
                if ((i2 & 4) != 0) {
                    widgetCategory = widgetState.getWidgetCategory();
                }
                x340Var.s();
                mod.c(new ely0[]{vce0.a.a((Map) this.i.invoke()), wol1.a.a(widgetCategory), wol1.b.a(str5), wol1.c.a(this.d), r4k.a.a(new p3v(this.b)), r4k.b.a(this.e), r4k.c.a(Boolean.valueOf(this.f)), wol1.d.a(Boolean.valueOf(this.h))}, apo.r(422947279, new o1t(widgetState, this, (byte) 15), x340Var), x340Var, 56);
            } else {
                x340Var.b0();
                str5 = str3;
            }
            widgetCategory = str4;
            x340Var.s();
            mod.c(new ely0[]{vce0.a.a((Map) this.i.invoke()), wol1.a.a(widgetCategory), wol1.b.a(str5), wol1.c.a(this.d), r4k.a.a(new p3v(this.b)), r4k.b.a(this.e), r4k.c.a(Boolean.valueOf(this.f)), wol1.d.a(Boolean.valueOf(this.h))}, apo.r(422947279, new o1t(widgetState, this, (byte) 15), x340Var), x340Var, 56);
        } else {
            x340Var.b0();
            str5 = str3;
            widgetCategory = str4;
        }
        h311 h311VarV = x340Var.v();
        if (h311VarV != null) {
            h311VarV.d = new nj2(this, widgetState, str5, widgetCategory, i, i2, (byte) 6);
        }
    }

    public div(float f, String str, String str2, fg50 fg50Var, boolean z, boolean z2, boolean z3, Function0 function0) {
        this.b = f;
        this.c = str;
        this.d = str2;
        this.e = fg50Var;
        this.f = z;
        this.g = z2;
        this.h = z3;
        this.i = function0;
        this.j = v291.a;
        this.k = v441.a;
    }
}
