package p;

import java.nio.ByteBuffer;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yjp0 {
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final boolean j;
    public final int k;
    public final boolean l;
    public final boolean m;
    public final boolean n;
    public final boolean o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public final boolean f176p;
    public final int q;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r8v4, types: [int] */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6 */
    public yjp0(xjp0 xjp0Var) {
        int iG;
        int iG2;
        boolean zF;
        ?? r8;
        boolean zF2;
        boolean zF3;
        boolean zF4;
        boolean zF5;
        byte bG;
        byte bG2;
        byte bG3;
        boolean zF6;
        int i = xjp0Var.a;
        ByteBuffer byteBuffer = xjp0Var.b;
        boolean zF7 = true;
        dm5.m(i == 1);
        int iRemaining = byteBuffer.remaining();
        byte[] bArr = new byte[iRemaining];
        byteBuffer.asReadOnlyBuffer().get(bArr);
        bae baeVar = new bae(bArr, iRemaining);
        this.g = baeVar.g(3);
        baeVar.n();
        boolean zF8 = baeVar.f();
        this.a = zF8;
        if (zF8) {
            iG2 = baeVar.g(5);
            this.b = false;
            this.j = false;
            r8 = 0;
            iG = 0;
        } else {
            if (baeVar.f()) {
                baeVar.o(64);
                if (baeVar.f()) {
                    int i2 = 0;
                    while (!baeVar.f()) {
                        i2++;
                    }
                    if (i2 < 32) {
                        baeVar.o(i2);
                    }
                }
                boolean zF9 = baeVar.f();
                this.b = zF9;
                if (zF9) {
                    baeVar.o(47);
                }
            } else {
                this.b = false;
            }
            this.j = baeVar.f();
            int iG3 = baeVar.g(5);
            int iG4 = 0;
            int i3 = 0;
            boolean z = false;
            iG = 0;
            while (i3 <= iG3) {
                baeVar.o(12);
                if (i3 == 0) {
                    iG4 = baeVar.g(5);
                    if (iG4 > 7) {
                        zF = z;
                        zF = baeVar.f();
                    }
                } else if (baeVar.g(5) > 7) {
                    zF = z;
                    baeVar.n();
                    zF = z;
                }
                zF = z;
                zF = z;
                if (this.b) {
                    baeVar.n();
                }
                if (this.j && baeVar.f()) {
                    if (i3 == 0) {
                        iG = baeVar.g(4);
                    } else {
                        baeVar.o(4);
                    }
                }
                i3++;
                z = zF;
            }
            iG2 = iG4;
            r8 = z;
        }
        int iG5 = baeVar.g(4);
        int iG6 = baeVar.g(4);
        baeVar.o(iG5 + 1);
        baeVar.o(iG6 + 1);
        if (this.a) {
            this.c = false;
            zF2 = false;
        } else {
            zF2 = baeVar.f();
            this.c = zF2;
        }
        if (zF2) {
            baeVar.o(4);
            baeVar.o(3);
        }
        baeVar.o(3);
        if (this.a) {
            this.e = true;
            this.d = true;
            this.f = 0;
        } else {
            baeVar.o(4);
            boolean zF10 = baeVar.f();
            if (zF10) {
                baeVar.o(2);
            }
            if (baeVar.f()) {
                this.d = true;
                zF3 = true;
            } else {
                zF3 = baeVar.f();
                this.d = zF3;
            }
            if (!zF3 || baeVar.f()) {
                this.e = true;
            } else {
                this.e = baeVar.f();
            }
            if (zF10) {
                this.f = baeVar.g(3) + 1;
            } else {
                this.f = 0;
            }
        }
        this.h = iG2;
        this.i = r8;
        this.k = iG;
        baeVar.o(3);
        boolean zF11 = baeVar.f();
        this.l = zF11;
        if (this.g == 2 && zF11) {
            zF4 = baeVar.f();
            this.m = zF4;
        } else {
            this.m = false;
            zF4 = false;
        }
        if (this.g != 1) {
            zF5 = baeVar.f();
            this.n = zF5;
        } else {
            this.n = false;
            zF5 = false;
        }
        if (baeVar.f()) {
            bG2 = (byte) baeVar.g(8);
            bG3 = (byte) baeVar.g(8);
            bG = (byte) baeVar.g(8);
        } else {
            bG = 0;
            bG2 = 0;
            bG3 = 0;
        }
        if (zF5) {
            baeVar.n();
            this.o = false;
            this.f176p = false;
            this.q = 0;
        } else if (bG2 == 1 && bG3 == 13 && bG == 0) {
            this.o = false;
            this.f176p = false;
            this.q = 0;
        } else {
            baeVar.n();
            int i4 = this.g;
            if (i4 == 0) {
                this.o = true;
                this.f176p = true;
                zF6 = true;
            } else if (i4 == 1) {
                this.o = false;
                this.f176p = false;
                zF6 = false;
                zF7 = false;
            } else {
                if (zF4) {
                    zF7 = baeVar.f();
                    this.o = zF7;
                    if (zF7) {
                        zF6 = baeVar.f();
                        this.f176p = zF6;
                    } else {
                        this.f176p = false;
                    }
                } else {
                    this.o = true;
                    this.f176p = false;
                }
                zF6 = false;
            }
            if (zF7 && zF6) {
                this.q = baeVar.g(2);
            } else {
                this.q = 0;
            }
        }
        baeVar.n();
    }
}
