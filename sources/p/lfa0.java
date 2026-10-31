package p;

import androidx.media3.common.ParserException;
import app.p000rive.semantics.SemanticState;
import java.util.Objects;
import org.xmlpull.v1.XmlPullParserException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class lfa0 implements ec10 {
    public gc10 b;
    public byte c;
    public int d;
    public int e;
    public enm0 g;
    public fc10 h;
    public o0g i;
    public qpm0 j;
    public final izr0 a = new izr0(2);
    public long f = -1;

    @Override // p.ec10
    public final void a(long j, long j2) {
        if (j == 0) {
            this.c = (byte) 0;
            this.j = null;
        } else if (this.c == 5) {
            qpm0 qpm0Var = this.j;
            qpm0Var.getClass();
            qpm0Var.a(j, j2);
        }
    }

    @Override // p.ec10
    public final void b(gc10 gc10Var) {
        this.b = gc10Var;
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: androidx.media3.common.ParserException */
    /* JADX WARN: Code duplicated, block: B:51:0x0100  */
    @Override // p.ec10
    public final int c(fc10 fc10Var, sfv0 sfv0Var) throws ParserException {
        String strZ;
        o0g o0gVarO;
        bg11 bg11Var;
        int i;
        enm0 enm0Var;
        long j;
        byte b = this.c;
        long j2 = -1;
        izr0 izr0Var = this.a;
        if (b == 0) {
            izr0Var.O(2);
            fc10Var.readFully(izr0Var.a, 0, 2);
            int iL = izr0Var.L();
            this.d = iL;
            if (iL == 65498) {
                if (this.f != -1) {
                    this.c = (byte) 4;
                    return 0;
                }
                f();
                return 0;
            }
            if ((iL < 65488 || iL > 65497) && iL != 65281) {
                this.c = (byte) 1;
            }
            return 0;
        }
        if (b == 1) {
            izr0Var.O(2);
            fc10Var.h(0, izr0Var.a, 2);
            this.e = izr0Var.L() - 2;
            fc10Var.u(2);
            this.c = (byte) 2;
            return 0;
        }
        if (b != 2) {
            if (b != 4) {
                if (b != 5) {
                    if (b == 6) {
                        return -1;
                    }
                    bhn0.w();
                    return 0;
                }
                if (this.i == null || fc10Var != this.h) {
                    this.h = fc10Var;
                    this.i = new o0g(fc10Var, this.f);
                }
                qpm0 qpm0Var = this.j;
                qpm0Var.getClass();
                int iC = qpm0Var.c(this.i, sfv0Var);
                if (iC == 1) {
                    sfv0Var.a += this.f;
                }
                return iC;
            }
            long position = fc10Var.getPosition();
            long j3 = this.f;
            if (position != j3) {
                sfv0Var.a = j3;
                return 1;
            }
            if (!fc10Var.d(izr0Var.a, 0, 1, true)) {
                f();
                return 0;
            }
            fc10Var.f();
            if (this.j == null) {
                this.j = new qpm0(jqc1.o0, 8);
            }
            o0g o0gVar = new o0g(fc10Var, this.f);
            this.i = o0gVar;
            if (!this.j.d(o0gVar)) {
                f();
                return 0;
            }
            qpm0 qpm0Var2 = this.j;
            long j4 = this.f;
            gc10 gc10Var = this.b;
            gc10Var.getClass();
            qpm0Var2.b(new o0g(j4, gc10Var, (byte) 15));
            enm0 enm0Var2 = this.g;
            enm0Var2.getClass();
            gc10 gc10Var2 = this.b;
            gc10Var2.getClass();
            gtf1 gtf1VarW = gc10Var2.w(SemanticState.ReadOnly, 4);
            ge30 ge30Var = new ge30();
            ge30Var.n = asj0.p("image/jpeg");
            ge30Var.l = new hjj0(enm0Var2);
            xvj1.q(ge30Var, gtf1VarW);
            this.c = (byte) 5;
            return 0;
        }
        if (this.d == 65505) {
            izr0 izr0Var2 = new izr0(this.e);
            fc10Var.readFully(izr0Var2.a, 0, this.e);
            if (this.g == null && "http://ns.adobe.com/xap/1.0/".equals(izr0Var2.z()) && (strZ = izr0Var2.z()) != null) {
                long length = fc10Var.getLength();
                if (length == -1) {
                    enm0Var = null;
                } else {
                    try {
                        o0gVarO = ppo1.o(strZ);
                    } catch (XmlPullParserException | ParserException | NumberFormatException unused) {
                        oon1.H("Ignoring unexpected XMP metadata");
                        o0gVarO = null;
                    }
                    if (o0gVarO != null && (i = (bg11Var = (bg11) o0gVarO.c).d) >= 2) {
                        int i2 = i - 1;
                        long j5 = -1;
                        long j6 = -1;
                        long j7 = -1;
                        long j8 = -1;
                        while (i2 >= 0) {
                            dnm0 dnm0Var = (dnm0) bg11Var.get(i2);
                            String str = dnm0Var.a;
                            boolean z = str.equals("video/mp4") || str.equals("video/quicktime");
                            if (i2 == 0) {
                                length -= dnm0Var.c;
                                j = 0;
                            } else {
                                j = length - dnm0Var.b;
                            }
                            long j9 = length;
                            length = j;
                            if (z && length != j9) {
                                j8 = j9 - length;
                                j7 = length;
                            }
                            if (i2 == 0) {
                                j6 = j9;
                                j5 = length;
                            }
                            i2--;
                            j2 = j2;
                        }
                        long j10 = j2;
                        if (j7 == j10 || j8 == j10 || j5 == j10 || j6 == j10) {
                            enm0Var = null;
                        } else {
                            enm0Var = new enm0(j5, j6, o0gVarO.b, j7, j8);
                        }
                    } else {
                        enm0Var = null;
                    }
                }
                this.g = enm0Var;
                if (enm0Var != null) {
                    this.f = enm0Var.d;
                }
            }
        } else {
            fc10Var.u(this.e);
        }
        this.c = (byte) 0;
        return 0;
    }

    @Override // p.ec10
    public final boolean d(fc10 fc10Var) {
        String strZ;
        izr0 izr0Var = this.a;
        izr0Var.O(2);
        fc10Var.h(0, izr0Var.a, 2);
        if (izr0Var.L() == 65496) {
            while (true) {
                izr0Var.O(2);
                fc10Var.h(0, izr0Var.a, 2);
                int iL = izr0Var.L();
                this.d = iL;
                if (iL == 65498) {
                    break;
                }
                izr0Var.O(2);
                fc10Var.h(0, izr0Var.a, 2);
                int iL2 = izr0Var.L() - 2;
                if (iL2 < 0) {
                    break;
                }
                if (this.d != 65505) {
                    fc10Var.k(iL2);
                } else {
                    izr0Var.O(iL2);
                    fc10Var.h(0, izr0Var.a, iL2);
                    if (Objects.equals(izr0Var.z(), "http://ns.adobe.com/xap/1.0/") && (strZ = izr0Var.z()) != null) {
                        for (int i = 0; i < 4; i++) {
                            if (strZ.contains(ppo1.a[i] + "=\"1\"")) {
                                return true;
                            }
                        }
                    }
                }
            }
        }
        return false;
    }

    public final void f() {
        gc10 gc10Var = this.b;
        gc10Var.getClass();
        gc10Var.s();
        this.b.c(new bc9(-9223372036854775807L));
        this.c = (byte) 6;
    }

    @Override // p.ec10
    public final void release() {
        qpm0 qpm0Var = this.j;
        if (qpm0Var != null) {
            qpm0Var.getClass();
        }
    }
}
