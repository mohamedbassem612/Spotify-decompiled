package p;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlinx.serialization.SerializationException;
import kotlinx.serialization.protobuf.internal.ProtobufDecodingException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes2.dex */
public class wiy0 extends jme implements dar, x1k {
    public final ghy0 c;
    public final yiy0 d;
    public final h661 e;
    public final int[] f;
    public HashMap g;
    public HashMap h;
    public boolean i;
    public final xrw t;

    public wiy0(ghy0 ghy0Var, yiy0 yiy0Var, h661 h661Var) {
        super((byte) 2);
        this.c = ghy0Var;
        this.d = yiy0Var;
        this.e = h661Var;
        this.t = new xrw(h661Var, new nsm0(this));
        int iD = h661Var.d();
        if (iD >= 32) {
            f1(h661Var, iD);
            return;
        }
        int i = iD + 1;
        int[] iArr = new int[i];
        for (int i2 = 0; i2 < i; i2++) {
            iArr[i2] = -1;
        }
        for (int i3 = 0; i3 < iD; i3++) {
            int iT = sio1.t(h661Var, i3, false);
            if (iT > iD || iT == -2) {
                f1(h661Var, iD);
                return;
            }
            iArr[iT] = i3;
        }
        this.f = iArr;
    }

    @Override // p.x1k
    public final Object A(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        z0(e1(h661Var, i));
        return V0(nma0Var, obj);
    }

    @Override // p.x1k
    public final Object B(h661 h661Var, int i, nma0 nma0Var, Object obj) {
        z0(e1(h661Var, i));
        if (this.i) {
            return null;
        }
        return V0(nma0Var, obj);
    }

    @Override // p.dar
    public final short C() {
        return (short) Z0(x0());
    }

    @Override // p.x1k
    public final double D(h661 h661Var, int i) {
        return X0(e1(h661Var, i));
    }

    @Override // p.dar
    public final float F() {
        return Y0(x0());
    }

    @Override // p.dar
    public final double H() {
        return X0(x0());
    }

    @Override // p.dar
    public final boolean K() {
        return W0(x0());
    }

    @Override // p.x1k
    public final boolean M(h661 h661Var, int i) {
        return W0(e1(h661Var, i));
    }

    @Override // p.dar
    public final char N() {
        return (char) Z0(x0());
    }

    @Override // p.x1k
    public final float Q(h661 h661Var, int i) {
        return Y0(e1(h661Var, i));
    }

    @Override // p.dar
    public final int T(h661 h661Var) {
        int iZ0 = Z0(x0());
        if (iZ0 < h661Var.d() && iZ0 >= 0 && sio1.t(h661Var, iZ0, true) == iZ0) {
            return iZ0;
        }
        int iD = h661Var.d();
        for (int i = 0; i < iD; i++) {
            if (sio1.t(h661Var, i, true) == iZ0) {
                return i;
            }
        }
        throw new ProtobufDecodingException(iZ0 + " is not among valid " + this.e.h() + " enum proto numbers", null);
    }

    @Override // p.dar
    public final String V() {
        return b1(x0());
    }

    public final Object V0(nma0 nma0Var, Object obj) {
        String string;
        vic1 vic1Var = vic1.h;
        try {
            if (nma0Var instanceof dog0) {
                return d1(nma0Var, obj);
            }
            if (u890.j(nma0Var.getDescriptor(), ogc.c.b)) {
                return c1((byte[]) obj);
            }
            if (!u890.j(nma0Var.getDescriptor(), s3h1.c.b)) {
                return nma0Var instanceof l6 ? ((l6) nma0Var).e(this, obj) : nma0Var.deserialize(this);
            }
            q3h1 q3h1Var = (q3h1) obj;
            byte[] bArrC = q3h1Var != null ? q3h1Var.c() : null;
            return q3h1.b(c1(bArrC != null ? bArrC : null));
        } catch (ProtobufDecodingException e) {
            long jL0 = l0();
            h661 descriptor = nma0Var.getDescriptor();
            h661 h661Var = this.e;
            if (u890.j(h661Var, descriptor)) {
                string = "Error while decoding " + h661Var.h();
            } else if (u890.j(h661Var.getKind(), uic1.i) && !u890.j(nma0Var.getDescriptor().getKind(), vic1Var)) {
                StringBuilder sb = new StringBuilder("Error while decoding index ");
                sb.append(((int) (jL0 & 2147483647L)) - 1);
                sb.append(" in repeated field of ");
                sb.append(nma0Var.getDescriptor().h());
                string = sb.toString();
            } else if (u890.j(h661Var.getKind(), vic1Var)) {
                int i = ((int) (jL0 & 2147483647L)) - 1;
                StringBuilder sbS = l1d.s(i / 2, "Error while decoding ", i % 2 == 0 ? "key" : "value", " of index ", " in map field of ");
                sbS.append(nma0Var.getDescriptor().h());
                string = sbS.toString();
            } else {
                string = "Error while decoding " + nma0Var.getDescriptor().h() + " at proto number " + ((int) (jL0 & 2147483647L)) + " of " + h661Var.h();
            }
            throw new ProtobufDecodingException(string, e);
        }
    }

    public final boolean W0(long j) {
        int iZ0 = Z0(j);
        if (iZ0 == 0) {
            return false;
        }
        if (iZ0 == 1) {
            return true;
        }
        uh61.j(f4i1.c(iZ0, "Unexpected boolean value: "));
        return false;
    }

    @Override // p.dar
    public final boolean X() {
        return !this.i;
    }

    public final double X0(long j) {
        yiy0 yiy0Var = this.d;
        try {
            return j == 19500 ? yiy0Var.k() : yiy0Var.j();
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (j & 2147483647L), this.e.h(), e);
            return 0.0d;
        }
    }

    @Override // p.dar
    public final Object Y(nma0 nma0Var) {
        return V0(nma0Var, null);
    }

    public final float Y0(long j) {
        yiy0 yiy0Var = this.d;
        try {
            return j == 19500 ? yiy0Var.m() : yiy0Var.l();
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (j & 2147483647L), this.e.h(), e);
            return 0.0f;
        }
    }

    public final int Z0(long j) {
        yiy0 yiy0Var = this.d;
        try {
            return j == 19500 ? yiy0Var.o() : yiy0Var.n(sio1.v(j));
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (j & 2147483647L), this.e.h(), e);
            return 0;
        }
    }

    public final long a1(long j) {
        yiy0 yiy0Var = this.d;
        try {
            return j == 19500 ? yiy0Var.s() : yiy0Var.q(sio1.v(j));
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (j & 2147483647L), this.e.h(), e);
            return 0L;
        }
    }

    @Override // p.dar
    public x1k b(h661 h661Var) {
        Integer num;
        h661 h661Var2 = this.e;
        try {
            yoi1 kind = h661Var.getKind();
            uic1 uic1Var = uic1.i;
            boolean zJ = u890.j(kind, uic1Var);
            ghy0 ghy0Var = this.c;
            yiy0 yiy0Var = this.d;
            try {
                if (zJ) {
                    long jL0 = l0();
                    if (!u890.j(h661Var2.getKind(), uic1Var) || jL0 == 19500 || h661Var2.equals(h661Var)) {
                        return (yiy0Var.c == jiy0.SIZE_DELIMITED && sio1.x(h661Var.g(0))) ? new nzq0(ghy0Var, new yiy0(yiy0Var.e()), h661Var) : new ef21(ghy0Var, yiy0Var, jL0, h661Var);
                    }
                    yiy0 yiy0VarE = u2o1.e(yiy0Var, jL0);
                    yiy0VarE.v();
                    return new ef21(ghy0Var, yiy0VarE, 1L, h661Var);
                }
                if (!u890.j(kind, uic1.h) && !u890.j(kind, uic1.j) && !(kind instanceof scv0)) {
                    if (u890.j(kind, vic1.h)) {
                        return new fng0(ghy0Var, u2o1.f(yiy0Var, l0()), l0(), h661Var);
                    }
                    throw new SerializationException("Primitives are not supported at top-level");
                }
                long jL1 = l0();
                if (jL1 == 19500 && u890.j(h661Var2, h661Var)) {
                    return this;
                }
                if (!sio1.w(jL1)) {
                    return new wiy0(ghy0Var, u2o1.e(yiy0Var, jL1), h661Var);
                }
                int i = ((int) (jL1 & 2147483647L)) - 1;
                HashMap map = this.h;
                if (map != null && (num = (Integer) map.get(Integer.valueOf(i))) != null) {
                    jL1 = sio1.A(num.intValue(), jL1);
                }
                return new xhq0(ghy0Var, yiy0Var, jL1, h661Var);
            } catch (ProtobufDecodingException e) {
                e = e;
            }
        } catch (ProtobufDecodingException e2) {
            e = e2;
        }
        throw new ProtobufDecodingException("Fail to begin structure for " + h661Var.h() + " in " + h661Var2.h() + " at proto number " + ((int) (2147483647L & l0())), e);
    }

    @Override // p.x1k
    public final short b0(inw0 inw0Var, int i) {
        return (short) Z0(e1(inw0Var, i));
    }

    public String b1(long j) {
        yiy0 yiy0Var = this.d;
        try {
            return j == 19500 ? yiy0Var.u() : yiy0Var.t();
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (j & 2147483647L), this.e.h(), e);
            return null;
        }
    }

    @Override // p.x1k
    public final kl1 c() {
        return j761.a;
    }

    @Override // p.dar
    public final byte c0() {
        return (byte) Z0(x0());
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [p.jme, p.wiy0] */
    /* JADX WARN: Type inference failed for: r4v1, types: [p.wiy0] */
    /* JADX WARN: Type inference failed for: r4v10 */
    /* JADX WARN: Type inference failed for: r4v6, types: [byte[]] */
    /* JADX WARN: Type inference failed for: r4v9 */
    public final byte[] c1(byte[] bArr) {
        byte[] bArrH;
        byte[] bArrI;
        long jL0 = l0();
        yiy0 yiy0Var = this.d;
        try {
            if (jL0 == 19500) {
                bArrI = yiy0Var.i();
            } else {
                bArrH = yiy0Var.h();
            }
            if (bArr == null) {
                this = bArrH;
                this = bArrI;
                return this;
            }
            this = bArrH;
            this = bArrI;
            return f46.x0(bArr, this);
        } catch (ProtobufDecodingException e) {
            nkx0.h((int) (jL0 & 2147483647L), this.e.h(), e);
            return null;
        }
    }

    public final LinkedHashMap d1(nma0 nma0Var, Object obj) {
        dog0 dog0Var = (dog0) nma0Var;
        hng0 hng0Var = new hng0(dog0Var.i(), dog0Var.j(), (byte) 0);
        Map map = obj instanceof Map ? (Map) obj : null;
        Set<Map.Entry> set = (Set) new r36(hng0Var, (byte) 1).e(this, map != null ? map.entrySet() : null);
        int iS = zno1.s(q7h.U(set, 10));
        if (iS < 16) {
            iS = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iS);
        for (Map.Entry entry : set) {
            linkedHashMap.put(entry.getKey(), entry.getValue());
        }
        return linkedHashMap;
    }

    @Override // p.x1k
    public final char e0(inw0 inw0Var, int i) {
        return (char) Z0(e1(inw0Var, i));
    }

    public long e1(h661 h661Var, int i) {
        return sio1.s(h661Var, i);
    }

    @Override // p.x1k
    public final String f(h661 h661Var, int i) {
        return b1(e1(h661Var, i));
    }

    public final void f1(h661 h661Var, int i) {
        HashMap map = new HashMap(i, 1.0f);
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            if (sio1.t(h661Var, i3, false) == -2) {
                h661 h661VarG = h661Var.g(i3);
                kl1 kl1Var = j761.a;
                List listU = sio1.u(h661VarG);
                ArrayList arrayList = new ArrayList(q7h.U(listU, 10));
                Iterator it = listU.iterator();
                while (it.hasNext()) {
                    arrayList.add(Integer.valueOf((int) (sio1.s((h661) it.next(), 0) & 2147483647L)));
                }
                Iterator it2 = arrayList.iterator();
                while (it2.hasNext()) {
                    map.put(Integer.valueOf(((Number) it2.next()).intValue()), Integer.valueOf(i3));
                }
                i2++;
            } else {
                map.put(Integer.valueOf(sio1.t(h661Var, i3, false)), Integer.valueOf(i3));
            }
        }
        if (i2 > 0) {
            this.h = new HashMap(i2, 1.0f);
        }
        this.g = map;
    }

    @Override // p.x1k
    public final long i0(h661 h661Var, int i) {
        return a1(e1(h661Var, i));
    }

    @Override // p.dar
    public final int n() {
        return Z0(x0());
    }

    @Override // p.x1k
    public final int o(h661 h661Var, int i) {
        return Z0(e1(h661Var, i));
    }

    public int p(h661 h661Var) {
        int iIntValue;
        HashMap map;
        yiy0 yiy0Var = this.d;
        while (true) {
            try {
                int iV = yiy0Var.v();
                xrw xrwVar = this.t;
                if (iV == -1) {
                    return xrwVar.b();
                }
                if (iV == 0) {
                    throw new SerializationException("0 is not allowed as the protobuf field number in " + h661Var.h() + ", the input bytes may have been corrupted");
                }
                int[] iArr = this.f;
                if (iArr != null) {
                    iIntValue = (iV < 0 || iV >= iArr.length) ? -1 : iArr[iV];
                } else {
                    HashMap map2 = this.g;
                    map2.getClass();
                    Object obj = map2.get(Integer.valueOf(iV));
                    if (obj == null) {
                        obj = -1;
                    }
                    iIntValue = ((Number) obj).intValue();
                }
                if (iIntValue != -1) {
                    if (sio1.w(sio1.s(h661Var, iIntValue)) && (map = this.h) != null) {
                    }
                    xrwVar.a(iIntValue);
                    return iIntValue;
                }
                yiy0Var.w();
            } catch (ProtobufDecodingException e) {
                throw new ProtobufDecodingException("Fail to get element index for " + h661Var.h() + " in " + this.e.h(), e);
            }
        }
    }

    @Override // p.x1k
    public final byte q(inw0 inw0Var, int i) {
        return (byte) Z0(e1(inw0Var, i));
    }

    @Override // p.x1k
    public final dar t(inw0 inw0Var, int i) {
        long jE1 = e1(inw0Var, i);
        inw0Var.g(i);
        z0(jE1);
        return this;
    }

    @Override // p.dar
    public final long u() {
        return a1(x0());
    }

    @Override // p.dar
    public final dar w(h661 h661Var) {
        z0(x0());
        return this;
    }

    @Override // p.x1k
    public final void a(h661 h661Var) {
    }
}
