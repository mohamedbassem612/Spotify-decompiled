package p;

import android.view.View;
import android.widget.ImageView;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class fp00 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public boolean d;
    public boolean e;
    public Object f;

    public fp00() {
        this.a = (byte) 2;
        g();
    }

    public static boolean f(View view, s611 s611Var) {
        g611 layoutParams = view.getLayoutParams();
        return !layoutParams.a.v() && layoutParams.a.o() >= 0 && layoutParams.a.o() < s611Var.b();
    }

    public void a() {
        boolean z = this.d;
        dyb0 dyb0Var = (dyb0) this.f;
        this.c = z ? dyb0Var.i() : dyb0Var.m();
    }

    public void b(View view, int i) {
        boolean z = this.d;
        dyb0 dyb0Var = (dyb0) this.f;
        if (z) {
            this.c = ((dyb0) this.f).o() + dyb0Var.d(view);
        } else {
            this.c = dyb0Var.g(view);
        }
        this.b = i;
    }

    public void c(View view, int i) {
        int iO = ((dyb0) this.f).o();
        if (iO >= 0) {
            b(view, i);
            return;
        }
        this.b = i;
        boolean z = this.d;
        dyb0 dyb0Var = (dyb0) this.f;
        if (!z) {
            int iG = dyb0Var.g(view);
            int iM = iG - ((dyb0) this.f).m();
            this.c = iG;
            if (iM > 0) {
                int i2 = (((dyb0) this.f).i() - Math.min(0, (((dyb0) this.f).i() - iO) - ((dyb0) this.f).d(view))) - (((dyb0) this.f).e(view) + iG);
                if (i2 < 0) {
                    this.c -= Math.min(iM, -i2);
                    return;
                }
                return;
            }
            return;
        }
        int i3 = (dyb0Var.i() - iO) - ((dyb0) this.f).d(view);
        this.c = ((dyb0) this.f).i() - i3;
        if (i3 > 0) {
            int iE = this.c - ((dyb0) this.f).e(view);
            int iM2 = ((dyb0) this.f).m();
            int iMin = iE - (Math.min(((dyb0) this.f).g(view) - iM2, 0) + iM2);
            if (iMin < 0) {
                this.c = Math.min(i3, -iMin) + this.c;
            }
        }
    }

    public int d(int i) {
        if (this.d) {
            return 0;
        }
        if (!this.e) {
            return -((int) ((1.0f - (i / this.b)) * (((ImageView) this.f).getMeasuredHeight() - this.b)));
        }
        float f = i;
        return (int) ((1.4f * f) - f);
    }

    public void e(int i) {
        this.d |= i > 0;
        this.b += i;
    }

    public void g() {
        this.b = -1;
        this.c = os00.INVALID_ID;
        this.d = false;
        this.e = false;
    }

    public String toString() {
        switch (this.a) {
            case 2:
                StringBuilder sb = new StringBuilder("AnchorInfo{mPosition=");
                sb.append(this.b);
                sb.append(", mCoordinate=");
                sb.append(this.c);
                sb.append(", mLayoutFromEnd=");
                sb.append(this.d);
                sb.append(", mValid=");
                return f4i1.g(sb, this.e, '}');
            default:
                return super.toString();
        }
    }

    public /* synthetic */ fp00(Object obj, byte b) {
        this.a = b;
        this.f = obj;
    }
}
