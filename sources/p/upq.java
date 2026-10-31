package p;

import android.net.Uri;
import android.os.Bundle;
import java.util.Objects;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class upq {
    public Object A;
    public Object B;
    public Object C;
    public Object D;
    public Object E;
    public Object F;
    public Object G;
    public Object H;
    public Object I;
    public Object J;
    public Object K;
    public Object a;
    public Object b;
    public Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;
    public Object k;
    public Object l;
    public Object m;
    public Object n;
    public Object o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Object f152p;
    public Object q;
    public Object r;
    public Object s;
    public Object t;
    public Object u;
    public Object v;
    public Object w;
    public Object x;
    public Object y;
    public Object z;

    public upq() {
        w280 w280Var = b380.b;
        this.K = bg11.e;
    }

    public void a(byte[] bArr, int i) {
        if (((byte[]) this.k) == null || i == 3 || !Objects.equals((Integer) this.m, 3)) {
            this.k = (byte[]) bArr.clone();
            this.l = null;
            this.m = Integer.valueOf(i);
        }
    }

    public void b(tqh0 tqh0Var) {
        if (tqh0Var == null) {
            return;
        }
        b380 b380Var = tqh0Var.L;
        byte[] bArr = tqh0Var.k;
        CharSequence charSequence = tqh0Var.a;
        if (charSequence != null) {
            this.a = charSequence;
        }
        CharSequence charSequence2 = tqh0Var.b;
        if (charSequence2 != null) {
            this.b = charSequence2;
        }
        CharSequence charSequence3 = tqh0Var.c;
        if (charSequence3 != null) {
            this.c = charSequence3;
        }
        CharSequence charSequence4 = tqh0Var.d;
        if (charSequence4 != null) {
            this.d = charSequence4;
        }
        CharSequence charSequence5 = tqh0Var.e;
        if (charSequence5 != null) {
            this.e = charSequence5;
        }
        CharSequence charSequence6 = tqh0Var.f;
        if (charSequence6 != null) {
            this.f = charSequence6;
        }
        CharSequence charSequence7 = tqh0Var.g;
        if (charSequence7 != null) {
            this.g = charSequence7;
        }
        Long l = tqh0Var.h;
        if (l != null) {
            d(l);
        }
        esz0 esz0Var = tqh0Var.i;
        if (esz0Var != null) {
            this.i = esz0Var;
        }
        esz0 esz0Var2 = tqh0Var.j;
        if (esz0Var2 != null) {
            this.j = esz0Var2;
        }
        Uri uri = tqh0Var.n;
        if (uri != null || bArr != null) {
            this.n = uri;
            c(bArr, tqh0Var.m);
            this.l = tqh0Var.l;
        }
        Integer num = tqh0Var.o;
        if (num != null) {
            this.o = num;
        }
        Integer num2 = tqh0Var.f142p;
        if (num2 != null) {
            this.f152p = num2;
        }
        Integer num3 = tqh0Var.q;
        if (num3 != null) {
            this.q = num3;
        }
        Boolean bool = tqh0Var.r;
        if (bool != null) {
            this.r = bool;
        }
        Boolean bool2 = tqh0Var.s;
        if (bool2 != null) {
            this.s = bool2;
        }
        Integer num4 = tqh0Var.t;
        if (num4 != null) {
            this.t = num4;
        }
        Integer num5 = tqh0Var.u;
        if (num5 != null) {
            this.t = num5;
        }
        Integer num6 = tqh0Var.v;
        if (num6 != null) {
            this.u = num6;
        }
        Integer num7 = tqh0Var.w;
        if (num7 != null) {
            this.v = num7;
        }
        Integer num8 = tqh0Var.x;
        if (num8 != null) {
            this.w = num8;
        }
        Integer num9 = tqh0Var.y;
        if (num9 != null) {
            this.x = num9;
        }
        Integer num10 = tqh0Var.z;
        if (num10 != null) {
            this.y = num10;
        }
        CharSequence charSequence8 = tqh0Var.A;
        if (charSequence8 != null) {
            this.z = charSequence8;
        }
        CharSequence charSequence9 = tqh0Var.B;
        if (charSequence9 != null) {
            this.A = charSequence9;
        }
        CharSequence charSequence10 = tqh0Var.C;
        if (charSequence10 != null) {
            this.B = charSequence10;
        }
        CharSequence charSequence11 = tqh0Var.D;
        if (charSequence11 != null) {
            this.C = charSequence11;
        }
        Integer num11 = tqh0Var.E;
        if (num11 != null) {
            this.D = num11;
        }
        Integer num12 = tqh0Var.F;
        if (num12 != null) {
            this.E = num12;
        }
        CharSequence charSequence12 = tqh0Var.G;
        if (charSequence12 != null) {
            this.F = charSequence12;
        }
        CharSequence charSequence13 = tqh0Var.H;
        if (charSequence13 != null) {
            this.G = charSequence13;
        }
        CharSequence charSequence14 = tqh0Var.I;
        if (charSequence14 != null) {
            this.H = charSequence14;
        }
        Integer num13 = tqh0Var.J;
        if (num13 != null) {
            this.I = num13;
        }
        Bundle bundle = tqh0Var.K;
        if (bundle != null) {
            this.J = bundle;
        }
        if (b380Var.isEmpty()) {
            return;
        }
        this.K = b380.p(b380Var);
    }

    public void c(byte[] bArr, Integer num) {
        this.k = bArr == null ? null : (byte[]) bArr.clone();
        this.l = null;
        this.m = num;
    }

    public void d(Long l) {
        dm5.m(l == null || l.longValue() >= 0);
        this.h = l;
    }
}
