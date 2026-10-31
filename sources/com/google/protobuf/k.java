package com.google.protobuf;

import java.util.Iterator;
import java.util.Map;
import p.eg;
import p.gf40;
import p.hg91;
import p.i6b;
import p.if40;
import p.l220;
import p.l36;
import p.nul1;
import p.oiy0;
import p.phc;
import p.poz0;
import p.rwg;
import p.s2j0;
import p.sm41;
import p.uz00;
import p.wob0;
import p.xz00;
import p.zb01;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes.dex */
public final class k implements sm41 {
    public final s2j0 a;
    public final m b;
    public final boolean c;
    public final xz00 d;

    public k(m mVar, xz00 xz00Var, s2j0 s2j0Var) {
        this.b = mVar;
        this.c = xz00Var.e(s2j0Var);
        this.d = xz00Var;
        this.a = s2j0Var;
    }

    @Override // p.sm41
    public final void a(Object obj) {
        ((o) this.b).getClass();
        n nVar = ((h) obj).unknownFields;
        if (nVar.e) {
            nVar.e = false;
        }
        this.d.f(obj);
    }

    @Override // p.sm41
    public final boolean b(Object obj) {
        return this.d.c(obj).g();
    }

    @Override // p.sm41
    public final Object c() {
        s2j0 s2j0Var = this.a;
        return s2j0Var instanceof h ? ((h) s2j0Var).newMutableInstance() : s2j0Var.newBuilderForType().buildPartial();
    }

    @Override // p.sm41
    public final void d(Object obj, Object obj2) {
        l.m(this.b, obj, obj2);
        if (this.c) {
            l.l(this.d, obj, obj2);
        }
    }

    @Override // p.sm41
    public final int e(h hVar) {
        ((o) this.b).getClass();
        int iHashCode = hVar.unknownFields.hashCode();
        if (!this.c) {
            return iHashCode;
        }
        return this.d.c(hVar).a.hashCode() + (iHashCode * 53);
    }

    @Override // p.sm41
    public final int f(h hVar) {
        ((o) this.b).getClass();
        n nVar = hVar.unknownFields;
        int iA = nVar.d;
        if (iA == -1) {
            iA = 0;
            for (int i = 0; i < nVar.a; i++) {
                int iW = poz0.w(nVar.b[i]);
                iA += rwg.a(3, (phc) nVar.c[i]) + rwg.f(iW) + rwg.e(2) + (rwg.e(1) * 2);
            }
            nVar.d = iA;
        }
        if (!this.c) {
            return iA;
        }
        hg91 hg91Var = this.d.c(hVar).a;
        int i2 = hg91Var.b;
        int iF = 0;
        for (int i3 = 0; i3 < i2; i3++) {
            iF += l220.f(hg91Var.c(i3));
        }
        Iterator it = hg91Var.d().iterator();
        while (it.hasNext()) {
            iF += l220.f((Map.Entry) it.next());
        }
        return iA + iF;
    }

    @Override // p.sm41
    public final boolean g(h hVar, h hVar2) {
        o oVar = (o) this.b;
        oVar.getClass();
        n nVar = hVar.unknownFields;
        oVar.getClass();
        if (!nVar.equals(hVar2.unknownFields)) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        xz00 xz00Var = this.d;
        return xz00Var.c(hVar).equals(xz00Var.c(hVar2));
    }

    @Override // p.sm41
    public final void h(Object obj, i6b i6bVar) {
        Iterator itI = this.d.c(obj).i();
        while (itI.hasNext()) {
            wob0 wob0Var = (Map.Entry) itI.next();
            gf40 gf40Var = (gf40) wob0Var.getKey();
            if (gf40Var.c.a != nul1.i || gf40Var.d || gf40Var.e) {
                eg.m("Found invalid MessageSet item.");
                return;
            }
            boolean z = wob0Var instanceof wob0;
            int i = gf40Var.b;
            if (z) {
                wob0Var.a();
                throw null;
            }
            i6bVar.S(i, wob0Var.getValue());
        }
        ((o) this.b).getClass();
        n nVar = ((h) obj).unknownFields;
        nVar.getClass();
        i6bVar.getClass();
        for (int i2 = 0; i2 < nVar.a; i2++) {
            i6bVar.S(poz0.w(nVar.b[i2]), nVar.c[i2]);
        }
    }

    /* JADX WARN: Code duplicated, block: B:35:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:38:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:51:0x00d3 A[EDGE_INSN: B:51:0x00d3->B:39:0x00d3 BREAK  A[LOOP:1: B:21:0x0079->B:29:0x00a8], SYNTHETIC] */
    @Override // p.sm41
    public final void i(Object obj, byte[] bArr, int i, int i2, l36 l36Var) throws InvalidProtocolBufferException {
        k kVar = this;
        h hVar = (h) obj;
        n nVar = hVar.unknownFields;
        if (nVar == n.f) {
            nVar = new n();
            hVar.unknownFields = nVar;
        }
        n nVar2 = nVar;
        GeneratedMessageLite$ExtendableMessage generatedMessageLite$ExtendableMessage = (GeneratedMessageLite$ExtendableMessage) obj;
        l220 l220VarClone = generatedMessageLite$ExtendableMessage.a;
        if (l220VarClone.b) {
            l220VarClone = l220VarClone.clone();
            generatedMessageLite$ExtendableMessage.a = l220VarClone;
        }
        l220 l220Var = l220VarClone;
        int iN = i;
        if40 if40Var = null;
        while (iN < i2) {
            if40 if40Var2 = if40Var;
            int iH = a.H(bArr, iN, l36Var);
            int i3 = l36Var.a;
            uz00 uz00Var = l36Var.d;
            s2j0 s2j0Var = kVar.a;
            xz00 xz00Var = kVar.d;
            int i4 = 2;
            if (i3 == 11) {
                int i5 = 0;
                phc phcVar = null;
                while (iH < i2) {
                    iH = a.H(bArr, iH, l36Var);
                    int i6 = l36Var.a;
                    int iW = poz0.w(i6);
                    int iX = poz0.x(i6);
                    if (iW != i4) {
                        if (iW == 3) {
                            if (if40Var2 != null) {
                                iH = a.o(oiy0.c.a(if40Var2.b.getClass()), bArr, iH, i2, l36Var);
                                l220Var.l(if40Var2.c, l36Var.c);
                            } else if (iX == 2) {
                                iH = a.b(bArr, iH, l36Var);
                                phcVar = (phc) l36Var.c;
                            } else if (i6 == 12) {
                                break;
                            } else {
                                iH = a.N(i6, bArr, iH, i2, l36Var);
                            }
                        } else {
                            if (i6 == 12) {
                                break;
                                break;
                            }
                            iH = a.N(i6, bArr, iH, i2, l36Var);
                        }
                    } else if (iX == 0) {
                        iH = a.H(bArr, iH, l36Var);
                        i5 = l36Var.a;
                        if40Var2 = (if40) xz00Var.b(uz00Var, s2j0Var, i5);
                    } else {
                        if (i6 == 12) {
                            break;
                            break;
                        }
                        iH = a.N(i6, bArr, iH, i2, l36Var);
                    }
                    i4 = 2;
                }
                if (phcVar != null) {
                    nVar2.f(poz0.E(i5, 2), phcVar);
                }
                kVar = this;
                iN = iH;
            } else if (poz0.x(i3) == 2) {
                if40Var2 = (if40) xz00Var.b(uz00Var, s2j0Var, poz0.w(i3));
                if (if40Var2 != null) {
                    iN = a.o(oiy0.c.a(if40Var2.b.getClass()), bArr, iH, i2, l36Var);
                    l220Var.l(if40Var2.c, l36Var.c);
                } else {
                    iN = a.F(i3, bArr, iH, i2, nVar2, l36Var);
                }
            } else {
                iN = a.N(i3, bArr, iH, i2, l36Var);
            }
            if40Var = if40Var2;
        }
        if (iN != i2) {
            throw InvalidProtocolBufferException.g();
        }
    }

    @Override // p.sm41
    public final void j(Object obj, zb01 zb01Var, uz00 uz00Var) {
        m mVar = this.b;
        n nVarA = mVar.a(obj);
        xz00 xz00Var = this.d;
        l220 l220VarD = xz00Var.d(obj);
        while (zb01Var.z() != Integer.MAX_VALUE) {
            try {
                k kVar = this;
                zb01 zb01Var2 = zb01Var;
                uz00 uz00Var2 = uz00Var;
                if (!kVar.k(zb01Var2, uz00Var2, xz00Var, l220VarD, mVar, nVarA)) {
                    break;
                }
                this = kVar;
                zb01Var = zb01Var2;
                uz00Var = uz00Var2;
            } finally {
                ((h) obj).unknownFields = nVarA;
            }
        }
    }

    public final boolean k(zb01 zb01Var, uz00 uz00Var, xz00 xz00Var, l220 l220Var, m mVar, n nVar) throws InvalidProtocolBufferException {
        int tag = zb01Var.getTag();
        int iG = 0;
        s2j0 s2j0Var = this.a;
        if (tag != 11) {
            if (poz0.x(tag) != 2) {
                return zb01Var.O();
            }
            Object objB = xz00Var.b(uz00Var, s2j0Var, poz0.w(tag));
            if (objB == null) {
                return mVar.b(0, nVar, zb01Var);
            }
            xz00Var.h(zb01Var, objB, uz00Var, l220Var);
            return true;
        }
        Object objB2 = null;
        phc phcVarN = null;
        while (zb01Var.z() != Integer.MAX_VALUE) {
            int tag2 = zb01Var.getTag();
            if (tag2 != 16) {
                if (tag2 != 26) {
                    if (tag2 == 12 || !zb01Var.O()) {
                        break;
                    }
                } else if (objB2 != null) {
                    xz00Var.h(zb01Var, objB2, uz00Var, l220Var);
                } else {
                    phcVarN = zb01Var.n();
                }
            } else {
                iG = zb01Var.g();
                objB2 = xz00Var.b(uz00Var, s2j0Var, iG);
            }
        }
        if (zb01Var.getTag() != 12) {
            throw InvalidProtocolBufferException.a();
        }
        if (phcVarN != null) {
            if (objB2 != null) {
                xz00Var.i(phcVarN, objB2, uz00Var, l220Var);
                return true;
            }
            ((o) mVar).getClass();
            nVar.f(poz0.E(iG, 2), phcVarN);
        }
        return true;
    }
}
