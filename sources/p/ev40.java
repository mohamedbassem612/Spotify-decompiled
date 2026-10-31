package p;

import android.media.VolumeProvider;
import android.os.Build;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ev40 {
    public final int a;
    public final int b;
    public final String c;
    public int d;
    public VolumeProvider e;
    public final /* synthetic */ byte f;
    public final /* synthetic */ Object g;

    public ev40(int i, int i2, int i3, String str) {
        this.a = i;
        this.b = i2;
        this.d = i3;
        this.c = str;
    }

    public VolumeProvider a() {
        switch (this.f) {
            case 1:
                VolumeProvider volumeProviderB = b();
                volumeProviderB.getClass();
                return volumeProviderB;
            default:
                return b();
        }
    }

    public final VolumeProvider b() {
        ev40 ev40Var;
        if (this.e != null) {
            ev40Var = this;
        } else if (Build.VERSION.SDK_INT >= 30) {
            ev40Var = this;
            ev40Var.e = new atk1(ev40Var, this.a, this.b, this.d, this.c);
        } else {
            ev40Var = this;
            ev40Var.e = new btk1(ev40Var, ev40Var.a, ev40Var.b, ev40Var.d);
        }
        return ev40Var.e;
    }

    public final void c(int i) {
        byte b = this.f;
        int i2 = 1;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((kv40) ((lc20) obj).d).a.post(new dv40(this, i, (byte) 1));
                break;
            default:
                av7 av7Var = (av7) obj;
                if (i <= 0) {
                    i2 = i < 0 ? 2 : 3;
                }
                av7Var.h(i2);
                break;
        }
    }

    public final void d(int i) {
        byte b = this.f;
        Object obj = this.g;
        switch (b) {
            case 0:
                ((kv40) ((lc20) obj).d).a.post(new dv40(this, i, (byte) 0));
                break;
            default:
                ((av7) obj).i(i);
                break;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ev40(av7 av7Var, kyh0 kyh0Var, ysk1 ysk1Var, int i, int i2, int i3) {
        this(i, i2, i3, null);
        this.f = (byte) 1;
        this.g = av7Var;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ev40(lc20 lc20Var, int i, int i2, int i3, String str) {
        this(i, i2, i3, str);
        this.f = (byte) 0;
        this.g = lc20Var;
    }
}
