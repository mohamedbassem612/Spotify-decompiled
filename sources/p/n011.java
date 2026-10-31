package p;

import android.content.Intent;
import com.spotify.widgets.npvwidget.WidgetInteraction;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class n011 extends hab0 implements xu30 {
    public final /* synthetic */ int N0;
    public final /* synthetic */ kee1 X;
    public final /* synthetic */ boolean Y;
    public final /* synthetic */ int Z;
    public final /* synthetic */ int a;
    public final /* synthetic */ int b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ c380 d;
    public final /* synthetic */ float e;
    public final /* synthetic */ mp10 f;
    public final /* synthetic */ String g;
    public final /* synthetic */ String h;
    public final /* synthetic */ String i;
    public final /* synthetic */ boolean t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n011(int i, int i2, boolean z, c380 c380Var, float f, mp10 mp10Var, String str, String str2, String str3, boolean z2, kee1 kee1Var, boolean z3, int i3, int i4) {
        super(3);
        this.a = i;
        this.b = i2;
        this.c = z;
        this.d = c380Var;
        this.e = f;
        this.f = mp10Var;
        this.g = str;
        this.h = str2;
        this.i = str3;
        this.t = z2;
        this.X = kee1Var;
        this.Y = z3;
        this.Z = i3;
        this.N0 = i4;
    }

    public final Object invoke(Object obj, Object obj2, Object obj3) {
        cz31 whb1Var;
        ((Number) obj3).intValue();
        x340 x340Var = (b0k) obj2;
        x340Var.i0(-1226535382);
        int i = this.a;
        int i2 = i;
        while (true) {
            int i3 = this.b;
            et40 et40Var = et40.a;
            int i4 = this.N0;
            boolean z = this.c;
            if (i2 >= i3) {
                x340Var.r(false);
                for (int i5 = this.Z; i5 < i4; i5++) {
                    if (!z || i5 <= 0) {
                        x340Var.i0(633258645);
                        x340Var.r(false);
                    } else {
                        x340Var.i0(633174077);
                        fc11.g(dm5.h0(et40Var, 8.0f), x340Var, 0);
                        x340Var.r(false);
                    }
                    j2h1.b(y3o1.i(i4, i5, z), (ql3) null, jcj.a, x340Var, 384, 2);
                }
                return rih1.a;
            }
            if (!z || i2 <= i) {
                x340Var.i0(632262677);
                x340Var.r(false);
            } else {
                x340Var.i0(632178109);
                fc11.g(dm5.h0(et40Var, 8.0f), x340Var, 0);
                x340Var.r(false);
            }
            u011 u011Var = (u011) this.d.get(i2);
            mp10 mp10Var = this.f;
            boolean z2 = mp10Var instanceof ui90;
            String str = this.g;
            String str2 = this.h;
            String str3 = this.i;
            if (z2) {
                whb1Var = new cz31(w0h1.A(new y60[]{new y60(apl1.b, (WidgetInteraction) new r011(u011Var, mp10Var, i2, str, str2).invoke()), new y60(apl1.a, str3)}));
            } else {
                if (!(mp10Var instanceof vi90)) {
                    eg.o();
                    return null;
                }
                Intent intentB = dro.B(u011Var.e.toString(), str3, (WidgetInteraction) new s011(str, str2).invoke());
                intentB.setFlags(268435456);
                whb1Var = new whb1(intentB, w0h1.A((y60[]) Arrays.copyOf(new y60[0], 0)), apl1.a());
            }
            x340 x340Var2 = x340Var;
            ryo1.j(u011Var, this.e, whb1Var, this.t ? new vy01(this.X) : uy01.c, y3o1.i(i4, i2 - i, z), this.Y, x340Var2, 0);
            x340Var = x340Var2;
            i2++;
        }
    }
}
