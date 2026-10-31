package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class ygv implements ytw {
    public final /* synthetic */ byte a;
    public boolean b;
    public long c;
    public int d;
    public int e;
    public final Object f;
    public Object g;

    public ygv(List list) {
        this.a = (byte) 0;
        this.f = list;
        this.g = new gtf1[list.size()];
        this.c = -9223372036854775807L;
    }

    @Override // p.ytw
    public final void a(izr0 izr0Var) {
        boolean z;
        boolean z2;
        switch (this.a) {
            case 0:
                if (this.b) {
                    if (this.d == 2) {
                        if (izr0Var.a() == 0) {
                            z2 = false;
                        } else {
                            if (izr0Var.E() != 32) {
                                this.b = false;
                            }
                            this.d--;
                            z2 = this.b;
                        }
                        if (!z2) {
                        }
                    }
                    if (this.d == 1) {
                        if (izr0Var.a() == 0) {
                            z = false;
                        } else {
                            if (izr0Var.E() != 0) {
                                this.b = false;
                            }
                            this.d--;
                            z = this.b;
                        }
                        if (!z) {
                        }
                    }
                    int i = izr0Var.b;
                    int iA = izr0Var.a();
                    for (gtf1 gtf1Var : (gtf1[]) this.g) {
                        izr0Var.R(i);
                        gtf1Var.f(iA, izr0Var);
                    }
                    this.e += iA;
                }
                break;
            default:
                izr0 izr0Var2 = (izr0) this.f;
                ((gtf1) this.g).getClass();
                if (this.b) {
                    int iA2 = izr0Var.a();
                    int i2 = this.e;
                    if (i2 < 10) {
                        int iMin = Math.min(iA2, 10 - i2);
                        System.arraycopy(izr0Var.a, izr0Var.b, izr0Var2.a, this.e, iMin);
                        if (this.e + iMin == 10) {
                            izr0Var2.R(0);
                            if (73 == izr0Var2.E() && 68 == izr0Var2.E() && 51 == izr0Var2.E()) {
                                izr0Var2.S(3);
                                this.d = izr0Var2.D() + 10;
                            } else {
                                oon1.H("Discarding invalid ID3 tag");
                                this.b = false;
                            }
                        }
                    }
                    int iMin2 = Math.min(iA2, this.d - this.e);
                    ((gtf1) this.g).f(iMin2, izr0Var);
                    this.e += iMin2;
                    break;
                }
                break;
        }
    }

    @Override // p.ytw
    public final void b() {
        switch (this.a) {
            case 0:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
            default:
                this.b = false;
                this.c = -9223372036854775807L;
                break;
        }
    }

    @Override // p.ytw
    public final void d(gc10 gc10Var, wwg1 wwg1Var) {
        switch (this.a) {
            case 0:
                gtf1[] gtf1VarArr = (gtf1[]) this.g;
                for (int i = 0; i < gtf1VarArr.length; i++) {
                    vwg1 vwg1Var = (vwg1) ((List) this.f).get(i);
                    wwg1Var.a();
                    wwg1Var.b();
                    gtf1 gtf1VarW = gc10Var.w(wwg1Var.d, 3);
                    ge30 ge30Var = new ge30();
                    wwg1Var.b();
                    ge30Var.a = wwg1Var.e;
                    ge30Var.n = asj0.p("video/mp2t");
                    ge30Var.o = asj0.p("application/dvbsubs");
                    ge30Var.r = Collections.singletonList(vwg1Var.b);
                    ge30Var.d = vwg1Var.a;
                    xvj1.q(ge30Var, gtf1VarW);
                    gtf1VarArr[i] = gtf1VarW;
                }
                break;
            default:
                wwg1Var.a();
                wwg1Var.b();
                gtf1 gtf1VarW2 = gc10Var.w(wwg1Var.d, 5);
                this.g = gtf1VarW2;
                ge30 ge30Var2 = new ge30();
                wwg1Var.b();
                ge30Var2.a = wwg1Var.e;
                ge30Var2.n = asj0.p("video/mp2t");
                ge30Var2.o = asj0.p("application/id3");
                xvj1.q(ge30Var2, gtf1VarW2);
                break;
        }
    }

    @Override // p.ytw
    public final void e() {
        int i;
        switch (this.a) {
            case 0:
                if (this.b) {
                    dm5.y(this.c != -9223372036854775807L);
                    for (gtf1 gtf1Var : (gtf1[]) this.g) {
                        gtf1Var.b(this.c, 1, this.e, 0, null);
                    }
                    this.b = false;
                }
                break;
            default:
                ((gtf1) this.g).getClass();
                if (this.b && (i = this.d) != 0 && this.e == i) {
                    dm5.y(this.c != -9223372036854775807L);
                    ((gtf1) this.g).b(this.c, 1, this.d, 0, null);
                    this.b = false;
                    break;
                }
                break;
        }
    }

    @Override // p.ytw
    public final void f(int i, long j) {
        switch (this.a) {
            case 0:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.e = 0;
                    this.d = 2;
                    break;
                }
                break;
            default:
                if ((i & 4) != 0) {
                    this.b = true;
                    this.c = j;
                    this.d = 0;
                    this.e = 0;
                    break;
                }
                break;
        }
    }

    public ygv() {
        this.a = (byte) 1;
        this.f = new izr0(10);
        this.c = -9223372036854775807L;
    }
}
