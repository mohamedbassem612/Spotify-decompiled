package p;

import app.p000rive.semantics.SemanticState;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes3.dex */
public final class yxs implements ig70 {
    public int a;
    public final List b;

    public /* synthetic */ yxs(int i, List list) {
        this.a = i;
        this.b = list;
    }

    public String a(float f, wc9 wc9Var) {
        int i = 0;
        int i2 = wc9Var != null ? wc9Var.i : 0;
        int i3 = this.a;
        if (i3 >= i2) {
            this.a = 0;
        } else {
            i = i3;
        }
        this.a = i + 1;
        return (String) this.b.get(i);
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code duplicated, block: B:38:0x0061  */
    public xwg1 b(int i, b8p1 b8p1Var) {
        String str = (String) b8p1Var.c;
        if (i != 2) {
            if (i == 3 || i == 4) {
                return new kts0(new wpm0(str, b8p1Var.q(), "video/mp2t"));
            }
            if (i == 21) {
                return new kts0(new ygv());
            }
            if (i == 27) {
                if (d(4)) {
                    return null;
                }
                return new kts0(new jr50(new gt51(c(b8p1Var), (byte) 0), d(1), d(8)));
            }
            if (i == 36) {
                return new kts0(new mr50(new gt51(c(b8p1Var), (byte) 0)));
            }
            if (i == 45) {
                return new kts0(new ypm0());
            }
            if (i == 89) {
                return new kts0(new ygv((List) b8p1Var.d));
            }
            if (i == 172) {
                return new kts0(new ua((byte) 1, b8p1Var.q(), str, "video/mp2t"));
            }
            if (i == 257) {
                return new ni51(new r0s0("application/vnd.dvb.ait"));
            }
            if (i != 138) {
                if (i == 139) {
                    return new kts0(new dev(str, b8p1Var.q(), 5408));
                }
                switch (i) {
                    case 15:
                        if (d(2)) {
                            return null;
                        }
                        return new kts0(new q72(b8p1Var.q(), str, "video/mp2t", false));
                    case 16:
                        return new kts0(new gr50(new gt51(c(b8p1Var), (byte) 1)));
                    case 17:
                        if (d(2)) {
                            return null;
                        }
                        return new kts0(new cjb0(str, b8p1Var.q()));
                    default:
                        switch (i) {
                            case SemanticState.Focused /* 128 */:
                                break;
                            case 129:
                                return new kts0(new ua((byte) 0, b8p1Var.q(), str, "video/mp2t"));
                            case 130:
                                if (!d(64)) {
                                    return null;
                                }
                                break;
                            default:
                                switch (i) {
                                    case 134:
                                        if (d(16)) {
                                            return null;
                                        }
                                        return new ni51(new r0s0("application/x-scte35"));
                                    case 135:
                                        return new kts0(new ua((byte) 0, b8p1Var.q(), str, "video/mp2t"));
                                    case 136:
                                        break;
                                    default:
                                        return null;
                                }
                                break;
                        }
                        break;
                }
            }
            return new kts0(new dev(str, b8p1Var.q(), SemanticState.Obscured));
        }
        return new kts0(new dr50(new gt51(c(b8p1Var), (byte) 1), "video/mp2t"));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r10v3 */
    public List c(b8p1 b8p1Var) {
        String str;
        int i;
        List listSingletonList;
        boolean zD = d(32);
        List list = this.b;
        if (zD) {
            return list;
        }
        izr0 izr0Var = new izr0((byte[]) b8p1Var.e);
        ArrayList arrayList = list;
        while (izr0Var.a() > 0) {
            int iE = izr0Var.E();
            int iE2 = izr0Var.b + izr0Var.E();
            if (iE == 134) {
                arrayList = new ArrayList();
                int iE3 = izr0Var.E() & 31;
                for (int i2 = 0; i2 < iE3; i2++) {
                    String strC = izr0Var.C(3, StandardCharsets.UTF_8);
                    int iE4 = izr0Var.E();
                    boolean z = (iE4 & SemanticState.Focused) != 0;
                    if (z) {
                        i = iE4 & 63;
                        str = "application/cea-708";
                    } else {
                        str = "application/cea-608";
                        i = 1;
                    }
                    byte bE = (byte) izr0Var.E();
                    izr0Var.S(1);
                    if (z) {
                        boolean z2 = (bE & 64) != 0;
                        byte[] bArr = kwg.a;
                        listSingletonList = Collections.singletonList(z2 ? new byte[]{1} : new byte[]{0});
                    } else {
                        listSingletonList = null;
                    }
                    ge30 ge30Var = new ge30();
                    ge30Var.o = asj0.p(str);
                    ge30Var.d = strC;
                    ge30Var.O = i;
                    ge30Var.r = listSingletonList;
                    arrayList.add(new ie30(ge30Var));
                }
            }
            izr0Var.R(iE2);
            arrayList = arrayList;
        }
        return arrayList;
    }

    public boolean d(int i) {
        return (this.a & i) != 0;
    }

    public yxs(jmd0 jmd0Var) {
        this.b = jmd0Var.g;
    }
}
