package p;

import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.util.Collections;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class cjb0 implements ytw {
    public final String a;
    public final int b;
    public final izr0 c;
    public final bae d;
    public gtf1 e;
    public String f;
    public ie30 g;
    public byte h;
    public int i;
    public int j;
    public short k;
    public long l;
    public boolean m;
    public int n;
    public int o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public int f25p;
    public boolean q;
    public long r;
    public int s;
    public long t;
    public int u;
    public String v;

    public cjb0(String str, int i) {
        this.a = str;
        this.b = i;
        izr0 izr0Var = new izr0(SemanticState.ReadOnly);
        this.c = izr0Var;
        byte[] bArr = izr0Var.a;
        this.d = new bae(bArr, bArr.length);
        this.l = -9223372036854775807L;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Type inference failed for: r1v31, types: [int, short] */
    @Override // p.ytw
    public final void a(izr0 izr0Var) throws ParserException {
        int iG;
        boolean zF;
        this.e.getClass();
        while (izr0Var.a() > 0) {
            byte b = this.h;
            if (b != 0) {
                if (b != 1) {
                    izr0 izr0Var2 = this.c;
                    bae baeVar = this.d;
                    if (b == 2) {
                        int iE = ((this.k & (-225)) << 8) | izr0Var.E();
                        this.j = iE;
                        if (iE > izr0Var2.a.length) {
                            izr0Var2.O(iE);
                            byte[] bArr = izr0Var2.a;
                            baeVar.l(bArr, bArr.length);
                        }
                        this.i = 0;
                        this.h = (byte) 3;
                    } else {
                        if (b != 3) {
                            bhn0.w();
                            return;
                        }
                        int iMin = Math.min(izr0Var.a(), this.j - this.i);
                        izr0Var.o(this.i, baeVar.b, iMin);
                        int i = this.i + iMin;
                        this.i = i;
                        if (i == this.j) {
                            baeVar.m(0);
                            if (baeVar.f()) {
                                if (this.m) {
                                }
                                this.h = (byte) 0;
                            } else {
                                this.m = true;
                                int iG2 = baeVar.g(1);
                                int iG3 = iG2 == 1 ? baeVar.g(1) : 0;
                                this.n = iG3;
                                if (iG3 != 0) {
                                    throw ParserException.a((RuntimeException) null, (String) null);
                                }
                                if (iG2 == 1) {
                                    baeVar.g((baeVar.g(2) + 1) * 8);
                                }
                                if (!baeVar.f()) {
                                    throw ParserException.a((RuntimeException) null, (String) null);
                                }
                                this.o = baeVar.g(6);
                                int iG4 = baeVar.g(4);
                                int iG5 = baeVar.g(3);
                                if (iG4 != 0 || iG5 != 0) {
                                    throw ParserException.a((RuntimeException) null, (String) null);
                                }
                                if (iG2 == 0) {
                                    int iE2 = baeVar.e();
                                    int iB = baeVar.b();
                                    v vVarV = c8o.v(baeVar, true);
                                    this.v = vVarV.c;
                                    this.s = vVarV.a;
                                    this.u = vVarV.b;
                                    int iB2 = iB - baeVar.b();
                                    baeVar.m(iE2);
                                    byte[] bArr2 = new byte[(iB2 + 7) / 8];
                                    baeVar.h(bArr2, iB2);
                                    ge30 ge30Var = new ge30();
                                    ge30Var.a = this.f;
                                    ge30Var.n = asj0.p("video/mp2t");
                                    ge30Var.o = asj0.p("audio/mp4a-latm");
                                    ge30Var.k = this.v;
                                    ge30Var.I = this.u;
                                    ge30Var.K = this.s;
                                    ge30Var.r = Collections.singletonList(bArr2);
                                    ge30Var.d = this.a;
                                    ge30Var.f = this.b;
                                    ie30 ie30Var = new ie30(ge30Var);
                                    if (!ie30Var.equals(this.g)) {
                                        this.g = ie30Var;
                                        this.t = 1024000000 / ((long) ie30Var.L);
                                        this.e.a(ie30Var);
                                    }
                                } else {
                                    int iG6 = baeVar.g((baeVar.g(2) + 1) * 8);
                                    int iB3 = baeVar.b();
                                    v vVarV2 = c8o.v(baeVar, true);
                                    this.v = vVarV2.c;
                                    this.s = vVarV2.a;
                                    this.u = vVarV2.b;
                                    baeVar.o(iG6 - (iB3 - baeVar.b()));
                                }
                                int iG7 = baeVar.g(3);
                                this.f25p = iG7;
                                if (iG7 == 0) {
                                    baeVar.o(8);
                                } else if (iG7 == 1) {
                                    baeVar.o(9);
                                } else if (iG7 == 3 || iG7 == 4 || iG7 == 5) {
                                    baeVar.o(6);
                                } else {
                                    if (iG7 != 6 && iG7 != 7) {
                                        bhn0.w();
                                        return;
                                    }
                                    baeVar.o(1);
                                }
                                boolean zF2 = baeVar.f();
                                this.q = zF2;
                                this.r = 0L;
                                if (zF2) {
                                    if (iG2 == 1) {
                                        this.r = baeVar.g((baeVar.g(2) + 1) * 8);
                                    } else {
                                        do {
                                            zF = baeVar.f();
                                            this.r = (this.r << 8) + ((long) baeVar.g(8));
                                        } while (zF);
                                    }
                                }
                                if (baeVar.f()) {
                                    baeVar.o(8);
                                }
                            }
                            if (this.n != 0) {
                                throw ParserException.a((RuntimeException) null, (String) null);
                            }
                            if (this.o != 0) {
                                throw ParserException.a((RuntimeException) null, (String) null);
                            }
                            if (this.f25p != 0) {
                                throw ParserException.a((RuntimeException) null, (String) null);
                            }
                            int i2 = 0;
                            do {
                                iG = baeVar.g(8);
                                i2 += iG;
                            } while (iG == 255);
                            int iE3 = baeVar.e();
                            if ((iE3 & 7) == 0) {
                                izr0Var2.R(iE3 >> 3);
                            } else {
                                baeVar.h(izr0Var2.a, i2 * 8);
                                izr0Var2.R(0);
                            }
                            this.e.f(i2, izr0Var2);
                            dm5.y(this.l != -9223372036854775807L);
                            this.e.b(this.l, 1, i2, 0, null);
                            this.l += this.t;
                            if (this.q) {
                                baeVar.o((int) this.r);
                            }
                            this.h = (byte) 0;
                        } else {
                            continue;
                        }
                    }
                } else {
                    ?? E = izr0Var.E();
                    if ((E & 224) == 224) {
                        this.k = E;
                        this.h = (byte) 2;
                    } else if (E != 86) {
                        this.h = (byte) 0;
                    }
                }
            } else if (izr0Var.E() == 86) {
                this.h = (byte) 1;
            }
        }
    }

    @Override // p.ytw
    public final void b() {
        this.h = (byte) 0;
        this.l = -9223372036854775807L;
        this.m = false;
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        wwg1Var.a();
        wwg1Var.b();
        this.e = gc10Var.w(wwg1Var.d, 1);
        wwg1Var.b();
        this.f = wwg1Var.e;
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        this.l = j;
    }
}
