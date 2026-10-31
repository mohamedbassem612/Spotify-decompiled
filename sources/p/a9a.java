package p;

import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a;
import com.google.android.recaptcha.internal.zzals;
import java.lang.reflect.Array;
import java.util.Arrays;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes4.dex */
public final class a9a implements hw3 {
    public final /* synthetic */ byte a;
    public int b;
    public int c;
    public int d;
    public Object e;

    public a9a(int i, int i2) {
        this.a = (byte) 0;
        this.e = new b9a[i];
        for (int i3 = 0; i3 < i; i3++) {
            ((b9a[]) this.e)[i3] = new b9a(((i2 + 4) * 17) + 1);
        }
        this.d = i2 * 17;
        this.c = i;
        this.b = -1;
    }

    public static final void L(int i) {
        if ((i & 3) == 0) {
            return;
        }
        x4n1.g("Failed to parse the message.");
    }

    public static final void M(int i) {
        if ((i & 7) == 0) {
            return;
        }
        x4n1.g("Failed to parse the message.");
    }

    public void A(win1 win1Var) {
        int iD;
        if ((this.b & 7) != 2) {
            x4n1.a();
            return;
        }
        do {
            win1Var.add(O());
            din1 din1Var = (din1) this.e;
            if (din1Var.a()) {
                return;
            } else {
                iD = din1Var.d();
            }
        } while (iD == this.b);
        this.d = iD;
    }

    public void B(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    sin1Var.zzh(din1Var.q());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                sin1Var.zzh(din1Var.q());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Integer.valueOf(din1Var.q()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.q()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void C(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    sin1Var.zzh(din1Var.r());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                sin1Var.zzh(din1Var.r());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Integer.valueOf(din1Var.r()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.r()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void D(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iQ = din1Var.q();
                L(iQ);
                int iB = din1Var.b() + iQ;
                do {
                    sin1Var.zzh(din1Var.s());
                } while (din1Var.b() < iB);
                return;
            }
            if (i2 != 5) {
                x4n1.a();
                return;
            }
            do {
                sin1Var.zzh(din1Var.s());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iQ2 = din1Var.q();
                L(iQ2);
                int iB2 = din1Var.b() + iQ2;
                do {
                    win1Var.add(Integer.valueOf(din1Var.s()));
                } while (din1Var.b() < iB2);
                return;
            }
            if (i3 != 5) {
                x4n1.a();
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.s()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void E(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof bjn1;
        int i = this.b;
        if (z) {
            bjn1 bjn1Var = (bjn1) win1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iQ = din1Var.q();
                M(iQ);
                int iB = din1Var.b() + iQ;
                do {
                    bjn1Var.d(din1Var.t());
                } while (din1Var.b() < iB);
                return;
            }
            do {
                bjn1Var.d(din1Var.t());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iQ2 = din1Var.q();
                M(iQ2);
                int iB2 = din1Var.b() + iQ2;
                do {
                    win1Var.add(Long.valueOf(din1Var.t()));
                } while (din1Var.b() < iB2);
                return;
            }
            do {
                win1Var.add(Long.valueOf(din1Var.t()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void F(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    sin1Var.zzh(din1Var.u());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                sin1Var.zzh(din1Var.u());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Integer.valueOf(din1Var.u()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.u()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void G(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof bjn1;
        int i = this.b;
        if (z) {
            bjn1 bjn1Var = (bjn1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    bjn1Var.d(din1Var.v());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                bjn1Var.d(din1Var.v());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Long.valueOf(din1Var.v()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Long.valueOf(din1Var.v()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void H(int i) {
        if ((this.b & 7) == i) {
            return;
        }
        x4n1.a();
    }

    public void I(Object obj, qjn1 qjn1Var, hin1 hin1Var) {
        din1 din1Var = (din1) this.e;
        int iW = din1Var.w();
        if (din1Var.a + din1Var.b >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int iX = din1Var.x(iW);
        din1Var.a++;
        qjn1Var.f(obj, this, hin1Var);
        din1Var.e();
        din1Var.a--;
        if (din1Var.z() == 0) {
            din1Var.y(iX);
        } else {
            x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
        }
    }

    public void J(Object obj, qjn1 qjn1Var, hin1 hin1Var) {
        din1 din1Var = (din1) this.e;
        int i = din1Var.a;
        int i2 = din1Var.b;
        if (i + i2 >= 100) {
            x4n1.g("Protocol message had too many levels of nesting.  May be malicious.  Use setRecursionLimit() to increase the recursion depth limit.");
            return;
        }
        int i3 = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        din1Var.b = i2 + 1;
        try {
            qjn1Var.f(obj, this, hin1Var);
            if (this.b != this.c) {
                throw new zzals("Failed to parse the message.");
            }
            din1Var.b--;
            this.c = i3;
        } catch (Throwable th) {
            din1Var.b--;
            this.c = i3;
            throw th;
        }
    }

    public void K(int i) {
        if (((din1) this.e).b() == i) {
            return;
        }
        x4n1.g("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
    }

    public int N() {
        int iD = this.d;
        if (iD != 0) {
            this.b = iD;
            this.d = 0;
        } else {
            iD = ((din1) this.e).d();
            this.b = iD;
        }
        if (iD == 0 || iD == this.c) {
            return Integer.MAX_VALUE;
        }
        return iD >>> 3;
    }

    public ain1 O() {
        H(2);
        return ((din1) this.e).p();
    }

    public void P(win1 win1Var) {
        int iD;
        din1 din1Var = (din1) this.e;
        int i = this.b & 7;
        if (i == 1) {
            do {
                win1Var.add(Double.valueOf(din1Var.f()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        if (i != 2) {
            x4n1.a();
            return;
        }
        int iQ = din1Var.q();
        M(iQ);
        int iB = din1Var.b() + iQ;
        do {
            win1Var.add(Double.valueOf(din1Var.f()));
        } while (din1Var.b() < iB);
    }

    public void Q(win1 win1Var) {
        int iD;
        din1 din1Var = (din1) this.e;
        int i = this.b & 7;
        if (i == 2) {
            int iQ = din1Var.q();
            L(iQ);
            int iB = din1Var.b() + iQ;
            do {
                win1Var.add(Float.valueOf(din1Var.g()));
            } while (din1Var.b() < iB);
            return;
        }
        if (i != 5) {
            x4n1.a();
            return;
        }
        do {
            win1Var.add(Float.valueOf(din1Var.g()));
            if (din1Var.a()) {
                return;
            } else {
                iD = din1Var.d();
            }
        } while (iD == this.b);
        this.d = iD;
    }

    public void R(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof bjn1;
        int i = this.b;
        if (z) {
            bjn1 bjn1Var = (bjn1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    bjn1Var.d(din1Var.h());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                bjn1Var.d(din1Var.h());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Long.valueOf(din1Var.h()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Long.valueOf(din1Var.h()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void S(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof bjn1;
        int i = this.b;
        if (z) {
            bjn1 bjn1Var = (bjn1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    bjn1Var.d(din1Var.i());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                bjn1Var.d(din1Var.i());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Long.valueOf(din1Var.i()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Long.valueOf(din1Var.i()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public synchronized nu3 a() {
        nu3 nu3Var;
        try {
            int i = this.c + 1;
            this.c = i;
            int i2 = this.d;
            if (i2 > 0) {
                nu3[] nu3VarArr = (nu3[]) this.e;
                int i3 = i2 - 1;
                this.d = i3;
                nu3Var = nu3VarArr[i3];
                nu3Var.getClass();
                ((nu3[]) this.e)[this.d] = null;
            } else {
                nu3 nu3Var2 = new nu3(new byte[65536], 0);
                nu3[] nu3VarArr2 = (nu3[]) this.e;
                if (i > nu3VarArr2.length) {
                    this.e = (nu3[]) Arrays.copyOf(nu3VarArr2, nu3VarArr2.length * 2);
                }
                nu3Var = nu3Var2;
            }
        } catch (Throwable th) {
            throw th;
        }
        return nu3Var;
    }

    public void b(int i, int i2) {
        if (i < 0) {
            hhg1.n("Layout positions must be non-negative");
            return;
        }
        if (i2 < 0) {
            hhg1.n("Pixel distance must be non-negative");
            return;
        }
        int i3 = this.d;
        int i4 = i3 * 2;
        int[] iArr = (int[]) this.e;
        if (iArr == null) {
            int[] iArr2 = new int[4];
            this.e = iArr2;
            Arrays.fill(iArr2, -1);
        } else if (i4 >= iArr.length) {
            int[] iArr3 = new int[i3 * 4];
            this.e = iArr3;
            System.arraycopy(iArr, 0, iArr3, 0, iArr.length);
        }
        int[] iArr4 = (int[]) this.e;
        iArr4[i4] = i;
        iArr4[i4 + 1] = i2;
        this.d++;
    }

    public yw51 c(int i) {
        return new yw51(ajo1.u((y9e1) this.e, i), 1L, i);
    }

    public synchronized void d(z1c z1cVar) {
        while (z1cVar != null) {
            nu3[] nu3VarArr = (nu3[]) this.e;
            int i = this.d;
            this.d = i + 1;
            nu3 nu3Var = (nu3) z1cVar.c;
            nu3Var.getClass();
            nu3VarArr[i] = nu3Var;
            this.c--;
            z1cVar = (z1c) z1cVar.d;
            if (z1cVar == null || ((nu3) z1cVar.c) == null) {
                z1cVar = null;
            }
        }
    }

    public synchronized void e() {
        int iMax = Math.max(0, zoi1.g(this.b, 65536) - this.c);
        int i = this.d;
        if (iMax >= i) {
            return;
        }
        Arrays.fill((nu3[]) this.e, iMax, i, (Object) null);
        this.d = iMax;
    }

    public synchronized void f(nu3 nu3Var) {
        nu3[] nu3VarArr = (nu3[]) this.e;
        int i = this.d;
        this.d = i + 1;
        nu3VarArr[i] = nu3Var;
        this.c--;
    }

    public int g() {
        return 65536;
    }

    public xqt h() {
        dm5.m(this.c <= this.d);
        return new xqt(this);
    }

    public void i() {
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        this.d = 0;
    }

    public void j(RecyclerView recyclerView, boolean z) {
        this.d = 0;
        int[] iArr = (int[]) this.e;
        if (iArr != null) {
            Arrays.fill(iArr, -1);
        }
        a aVar = recyclerView.Q0;
        if (recyclerView.P0 == null || aVar == null || !aVar.t) {
            return;
        }
        if (z) {
            if (!recyclerView.e.w()) {
                aVar.v(recyclerView.P0.e(), this);
            }
        } else if (!recyclerView.X()) {
            aVar.u(this.b, this.c, recyclerView.H1, this);
        }
        int i = this.d;
        if (i > aVar.X) {
            aVar.X = i;
            aVar.Y = z;
            recyclerView.c.o();
        }
    }

    public b9a k() {
        return ((b9a[]) this.e)[this.b];
    }

    public int l(int i) {
        return ((amq0) this.e).d[this.c + i];
    }

    public Object m(int i) {
        return ((amq0) this.e).f[this.d + i];
    }

    public klq0 n() {
        return ((amq0) this.e).b[this.b];
    }

    public byte[][] o(int i, int i2) {
        int i3 = this.c * i2;
        byte[][] bArr = (byte[][]) Array.newInstance((Class<?>) Byte.TYPE, i3, this.d * i);
        for (int i4 = 0; i4 < i3; i4++) {
            int i5 = (i3 - i4) - 1;
            byte[] bArr2 = ((b9a[]) this.e)[i4 / i2].a;
            int length = bArr2.length * i;
            byte[] bArr3 = new byte[length];
            for (int i6 = 0; i6 < length; i6++) {
                bArr3[i6] = bArr2[i6 / i];
            }
            bArr[i5] = bArr3;
        }
        return bArr;
    }

    public boolean p(int i) {
        if (((int[]) this.e) != null) {
            int i2 = this.d * 2;
            for (int i3 = 0; i3 < i2; i3 += 2) {
                if (((int[]) this.e)[i3] == i) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean q() {
        int i = this.b;
        amq0 amq0Var = (amq0) this.e;
        if (i >= amq0Var.c) {
            return false;
        }
        klq0 klq0VarN = n();
        this.c += klq0VarN.a;
        this.d += klq0VarN.b;
        int i2 = this.b + 1;
        this.b = i2;
        return i2 < amq0Var.c;
    }

    public void r(int i, int i2) {
        this.b = i;
        this.c = i2;
    }

    public synchronized void s(int i) {
        boolean z = i < this.b;
        this.b = i;
        if (z) {
            e();
        }
    }

    public void t(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 != 0) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iB = din1Var.b() + din1Var.q();
                do {
                    sin1Var.zzh(din1Var.j());
                } while (din1Var.b() < iB);
                K(iB);
                return;
            }
            do {
                sin1Var.zzh(din1Var.j());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 0) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iB2 = din1Var.b() + din1Var.q();
                do {
                    win1Var.add(Integer.valueOf(din1Var.j()));
                } while (din1Var.b() < iB2);
                K(iB2);
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.j()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public String toString() {
        switch (this.a) {
            case 5:
                int i = this.b;
                y9e1 y9e1Var = (y9e1) this.e;
                int iU = ajo1.u(y9e1Var, i);
                int i2 = this.c;
                int iU2 = ajo1.u(y9e1Var, i2);
                int i3 = this.d;
                StringBuilder sbR = cy30.r(i, "SelectionInfo(id=1, range=(", "-");
                sbR.append(fd21.p(iU));
                sbR.append(",");
                sbR.append(i2);
                sbR.append("-");
                sbR.append(fd21.p(iU2));
                sbR.append("), prevOffset=");
                sbR.append(i3);
                sbR.append(")");
                return sbR.toString();
            default:
                return super.toString();
        }
    }

    public void u(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof bjn1;
        int i = this.b;
        if (z) {
            bjn1 bjn1Var = (bjn1) win1Var;
            int i2 = i & 7;
            if (i2 != 1) {
                if (i2 != 2) {
                    x4n1.a();
                    return;
                }
                int iQ = din1Var.q();
                M(iQ);
                int iB = din1Var.b() + iQ;
                do {
                    bjn1Var.d(din1Var.k());
                } while (din1Var.b() < iB);
                return;
            }
            do {
                bjn1Var.d(din1Var.k());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 != 1) {
                if (i3 != 2) {
                    x4n1.a();
                    return;
                }
                int iQ2 = din1Var.q();
                M(iQ2);
                int iB2 = din1Var.b() + iQ2;
                do {
                    win1Var.add(Long.valueOf(din1Var.k()));
                } while (din1Var.b() < iB2);
                return;
            }
            do {
                win1Var.add(Long.valueOf(din1Var.k()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void v(win1 win1Var) {
        int iD;
        int iD2;
        din1 din1Var = (din1) this.e;
        boolean z = win1Var instanceof sin1;
        int i = this.b;
        if (z) {
            sin1 sin1Var = (sin1) win1Var;
            int i2 = i & 7;
            if (i2 == 2) {
                int iQ = din1Var.q();
                L(iQ);
                int iB = din1Var.b() + iQ;
                do {
                    sin1Var.zzh(din1Var.l());
                } while (din1Var.b() < iB);
                return;
            }
            if (i2 != 5) {
                x4n1.a();
                return;
            }
            do {
                sin1Var.zzh(din1Var.l());
                if (din1Var.a()) {
                    return;
                } else {
                    iD2 = din1Var.d();
                }
            } while (iD2 == this.b);
        } else {
            int i3 = i & 7;
            if (i3 == 2) {
                int iQ2 = din1Var.q();
                L(iQ2);
                int iB2 = din1Var.b() + iQ2;
                do {
                    win1Var.add(Integer.valueOf(din1Var.l()));
                } while (din1Var.b() < iB2);
                return;
            }
            if (i3 != 5) {
                x4n1.a();
                return;
            }
            do {
                win1Var.add(Integer.valueOf(din1Var.l()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            iD2 = iD;
        }
        this.d = iD2;
    }

    public void w(win1 win1Var) {
        int iD;
        din1 din1Var = (din1) this.e;
        int i = this.b & 7;
        if (i == 0) {
            do {
                win1Var.add(Boolean.valueOf(din1Var.m()));
                if (din1Var.a()) {
                    return;
                } else {
                    iD = din1Var.d();
                }
            } while (iD == this.b);
            this.d = iD;
            return;
        }
        if (i != 2) {
            x4n1.a();
            return;
        }
        int iB = din1Var.b() + din1Var.q();
        do {
            win1Var.add(Boolean.valueOf(din1Var.m()));
        } while (din1Var.b() < iB);
        K(iB);
    }

    public void x(win1 win1Var, boolean z) {
        String strN;
        int iD;
        din1 din1Var = (din1) this.e;
        if ((this.b & 7) != 2) {
            x4n1.a();
            return;
        }
        do {
            if (z) {
                H(2);
                strN = din1Var.o();
            } else {
                H(2);
                strN = din1Var.n();
            }
            win1Var.add(strN);
            if (din1Var.a()) {
                return;
            } else {
                iD = din1Var.d();
            }
        } while (iD == this.b);
        this.d = iD;
    }

    public void y(win1 win1Var, qjn1 qjn1Var, hin1 hin1Var) {
        int iD;
        int i = this.b;
        if ((i & 7) != 2) {
            x4n1.a();
            return;
        }
        do {
            rin1 rin1VarZza = qjn1Var.zza();
            I(rin1VarZza, qjn1Var, hin1Var);
            qjn1Var.b(rin1VarZza);
            win1Var.add(rin1VarZza);
            din1 din1Var = (din1) this.e;
            if (din1Var.a() || this.d != 0) {
                return;
            } else {
                iD = din1Var.d();
            }
        } while (iD == i);
        this.d = iD;
    }

    public void z(win1 win1Var, qjn1 qjn1Var, hin1 hin1Var) {
        int iD;
        int i = this.b;
        if ((i & 7) != 3) {
            x4n1.a();
            return;
        }
        do {
            rin1 rin1VarZza = qjn1Var.zza();
            J(rin1VarZza, qjn1Var, hin1Var);
            qjn1Var.b(rin1VarZza);
            win1Var.add(rin1VarZza);
            din1 din1Var = (din1) this.e;
            if (din1Var.a() || this.d != 0) {
                return;
            } else {
                iD = din1Var.d();
            }
        } while (iD == i);
        this.d = iD;
    }

    public a9a(din1 din1Var) {
        this.a = (byte) 6;
        this.d = 0;
        this.e = din1Var;
        din1Var.c = this;
    }

    public a9a(byte b) {
        this.a = b;
        switch (b) {
            case 3:
                break;
            default:
                this.d = 0;
                this.e = new nu3[100];
                break;
        }
    }

    public a9a(int i) {
        this.a = (byte) 2;
        this.b = i;
    }

    public a9a(amq0 amq0Var) {
        this.a = (byte) 4;
        this.e = amq0Var;
    }

    public a9a(int i, int i2, int i3, y9e1 y9e1Var) {
        this.a = (byte) 5;
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = y9e1Var;
    }
}
