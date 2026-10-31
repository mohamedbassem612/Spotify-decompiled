package p;

import android.text.Layout;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cxg1 {
    public String a;
    public int b;
    public boolean c;
    public int d;
    public boolean e;
    public float k;
    public String l;
    public Layout.Alignment o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public Layout.Alignment f30p;
    public e4e1 r;
    public String t;
    public String u;
    public String v;
    public int f = -1;
    public int g = -1;
    public int h = -1;
    public int i = -1;
    public int j = -1;
    public int m = -1;
    public int n = -1;
    public int q = -1;
    public float s = Float.MAX_VALUE;

    public final void a(cxg1 cxg1Var) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (cxg1Var != null) {
            if (!this.c && cxg1Var.c) {
                this.b = cxg1Var.b;
                this.c = true;
            }
            if (this.h == -1) {
                this.h = cxg1Var.h;
            }
            if (this.i == -1) {
                this.i = cxg1Var.i;
            }
            if (this.a == null && (str = cxg1Var.a) != null) {
                this.a = str;
            }
            if (this.f == -1) {
                this.f = cxg1Var.f;
            }
            if (this.g == -1) {
                this.g = cxg1Var.g;
            }
            if (this.n == -1) {
                this.n = cxg1Var.n;
            }
            if (this.o == null && (alignment2 = cxg1Var.o) != null) {
                this.o = alignment2;
            }
            if (this.f30p == null && (alignment = cxg1Var.f30p) != null) {
                this.f30p = alignment;
            }
            if (this.q == -1) {
                this.q = cxg1Var.q;
            }
            if (this.j == -1) {
                this.j = cxg1Var.j;
                this.k = cxg1Var.k;
            }
            if (this.r == null) {
                this.r = cxg1Var.r;
            }
            if (this.s == Float.MAX_VALUE) {
                this.s = cxg1Var.s;
            }
            if (this.t == null) {
                this.t = cxg1Var.t;
            }
            if (this.u == null) {
                this.u = cxg1Var.u;
            }
            if (this.v == null) {
                this.v = cxg1Var.v;
            }
            if (!this.e && cxg1Var.e) {
                this.d = cxg1Var.d;
                this.e = true;
            }
            if (this.m != -1 || (i = cxg1Var.m) == -1) {
                return;
            }
            this.m = i;
        }
    }
}
