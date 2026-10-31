package p;

import java.util.Collections;
import java.util.List;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public final class hfy0 extends ef40 {
    public static final hfy0 g1;
    public static final tja0 h1 = new tja0(8);
    public List N0;
    public int O0;
    public List P0;
    public List Q0;
    public List R0;
    public List S0;
    public List T0;
    public List U0;
    public int V0;
    public int W0;
    public List X;
    public rgy0 X0;
    public int Y;
    public int Y0;
    public List Z;
    public List Z0;
    public xgy0 a1;
    public final qhc b;
    public List b1;
    public int c;
    public ehy0 c1;
    public int d;
    public List d1;
    public int e;
    public byte e1;
    public int f;
    public int f1;
    public List g;
    public List h;
    public List i;
    public int t;

    static {
        hfy0 hfy0Var = new hfy0();
        g1 = hfy0Var;
        hfy0Var.n();
    }

    /*  JADX ERROR: Types fix failed
        jadx.core.utils.exceptions.JadxRuntimeException: Type update failed for variable: r7v0 ??, new type: int
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:109)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:59)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryPossibleTypes(FixTypesVisitor.java:186)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.deduceType(FixTypesVisitor.java:245)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryDeduceTypes(FixTypesVisitor.java:224)
        	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
        Caused by: java.lang.NullPointerException: Cannot invoke "jadx.core.dex.instructions.args.InsnArg.getType()" because "arg" is null
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.verifyType(TypeUpdate.java:210)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.queueTypeUpdate(TypeUpdate.java:171)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.sameFirstArgListener(TypeUpdate.java:454)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.requestUpdate(TypeUpdate.java:310)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.runUpdate(TypeUpdate.java:124)
        	at jadx.core.dex.visitors.typeinference.TypeUpdate.apply(TypeUpdate.java:91)
        	... 5 more
        */
    public hfy0(p.mwg r22, p.vz00 r23) {
        /*
            Method dump skipped, instruction units count: 1618
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: p.hfy0.<init>(p.mwg, p.vz00):void");
    }

    @Override // p.t8
    public final int a() {
        List list;
        List list2;
        List list3;
        List list4;
        List list5;
        int i = this.f1;
        if (i != -1) {
            return i;
        }
        int iG = (this.c & 1) == 1 ? w4c0.g(1, this.d) : 0;
        int i2 = 0;
        int iH = 0;
        while (true) {
            int size = this.i.size();
            list = this.i;
            if (i2 >= size) {
                break;
            }
            iH += w4c0.h(((Integer) list.get(i2)).intValue());
            i2++;
        }
        int i3 = iG + iH;
        if (!list.isEmpty()) {
            i3 = i3 + 1 + w4c0.h(iH);
        }
        this.t = iH;
        if ((this.c & 2) == 2) {
            i3 += w4c0.g(3, this.e);
        }
        if ((this.c & 4) == 4) {
            i3 += w4c0.g(4, this.f);
        }
        for (int i4 = 0; i4 < this.g.size(); i4++) {
            i3 += w4c0.i(5, (t8) this.g.get(i4));
        }
        for (int i5 = 0; i5 < this.h.size(); i5++) {
            i3 += w4c0.i(6, (t8) this.h.get(i5));
        }
        int i6 = 0;
        int iH2 = 0;
        while (true) {
            int size2 = this.X.size();
            list2 = this.X;
            if (i6 >= size2) {
                break;
            }
            iH2 += w4c0.h(((Integer) list2.get(i6)).intValue());
            i6++;
        }
        int i7 = i3 + iH2;
        if (!list2.isEmpty()) {
            i7 = i7 + 1 + w4c0.h(iH2);
        }
        this.Y = iH2;
        for (int i8 = 0; i8 < this.P0.size(); i8++) {
            i7 += w4c0.i(8, (t8) this.P0.get(i8));
        }
        for (int i9 = 0; i9 < this.Q0.size(); i9++) {
            i7 += w4c0.i(9, (t8) this.Q0.get(i9));
        }
        for (int i10 = 0; i10 < this.R0.size(); i10++) {
            i7 += w4c0.i(10, (t8) this.R0.get(i10));
        }
        for (int i11 = 0; i11 < this.S0.size(); i11++) {
            i7 += w4c0.i(11, (t8) this.S0.get(i11));
        }
        for (int i12 = 0; i12 < this.T0.size(); i12++) {
            i7 += w4c0.i(13, (t8) this.T0.get(i12));
        }
        int i13 = 0;
        int iH3 = 0;
        while (true) {
            int size3 = this.U0.size();
            list3 = this.U0;
            if (i13 >= size3) {
                break;
            }
            iH3 += w4c0.h(((Integer) list3.get(i13)).intValue());
            i13++;
        }
        int i14 = i7 + iH3;
        if (!list3.isEmpty()) {
            i14 = i14 + 2 + w4c0.h(iH3);
        }
        this.V0 = iH3;
        if ((this.c & 8) == 8) {
            i14 += w4c0.g(17, this.W0);
        }
        if ((this.c & 16) == 16) {
            i14 += w4c0.i(18, this.X0);
        }
        if ((this.c & 32) == 32) {
            i14 += w4c0.g(19, this.Y0);
        }
        for (int i15 = 0; i15 < this.Z.size(); i15++) {
            i14 += w4c0.i(20, (t8) this.Z.get(i15));
        }
        int i16 = 0;
        int iH4 = 0;
        while (true) {
            int size4 = this.N0.size();
            list4 = this.N0;
            if (i16 >= size4) {
                break;
            }
            iH4 += w4c0.h(((Integer) list4.get(i16)).intValue());
            i16++;
        }
        int i17 = i14 + iH4;
        if (!list4.isEmpty()) {
            i17 = i17 + 2 + w4c0.h(iH4);
        }
        this.O0 = iH4;
        for (int i18 = 0; i18 < this.Z0.size(); i18++) {
            i17 += w4c0.i(25, (t8) this.Z0.get(i18));
        }
        if ((this.c & 64) == 64) {
            i17 += w4c0.i(30, this.a1);
        }
        int i19 = 0;
        int iH5 = 0;
        while (true) {
            int size5 = this.b1.size();
            list5 = this.b1;
            if (i19 >= size5) {
                break;
            }
            iH5 += w4c0.h(((Integer) list5.get(i19)).intValue());
            i19++;
        }
        int size6 = (list5.size() * 2) + i17 + iH5;
        if ((this.c & 128) == 128) {
            size6 += w4c0.i(32, this.c1);
        }
        for (int i20 = 0; i20 < this.d1.size(); i20++) {
            size6 += w4c0.i(33, (t8) this.d1.get(i20));
        }
        int size7 = this.b.size() + h() + size6;
        this.f1 = size7;
        return size7;
    }

    @Override // p.t8
    public final xe40 c() {
        ffy0 ffy0VarH = ffy0.h();
        ffy0VarH.i(this);
        return ffy0VarH;
    }

    @Override // p.t8
    public final void d(w4c0 w4c0Var) {
        a();
        kp00 kp00Var = new kp00(this);
        if ((this.c & 1) == 1) {
            w4c0Var.P(1, this.d);
        }
        if (this.i.size() > 0) {
            w4c0Var.Y(18);
            w4c0Var.Y(this.t);
        }
        for (int i = 0; i < this.i.size(); i++) {
            w4c0Var.Q(((Integer) this.i.get(i)).intValue());
        }
        if ((this.c & 2) == 2) {
            w4c0Var.P(3, this.e);
        }
        if ((this.c & 4) == 4) {
            w4c0Var.P(4, this.f);
        }
        for (int i2 = 0; i2 < this.g.size(); i2++) {
            w4c0Var.R(5, (t8) this.g.get(i2));
        }
        for (int i3 = 0; i3 < this.h.size(); i3++) {
            w4c0Var.R(6, (t8) this.h.get(i3));
        }
        if (this.X.size() > 0) {
            w4c0Var.Y(58);
            w4c0Var.Y(this.Y);
        }
        for (int i4 = 0; i4 < this.X.size(); i4++) {
            w4c0Var.Q(((Integer) this.X.get(i4)).intValue());
        }
        for (int i5 = 0; i5 < this.P0.size(); i5++) {
            w4c0Var.R(8, (t8) this.P0.get(i5));
        }
        for (int i6 = 0; i6 < this.Q0.size(); i6++) {
            w4c0Var.R(9, (t8) this.Q0.get(i6));
        }
        for (int i7 = 0; i7 < this.R0.size(); i7++) {
            w4c0Var.R(10, (t8) this.R0.get(i7));
        }
        for (int i8 = 0; i8 < this.S0.size(); i8++) {
            w4c0Var.R(11, (t8) this.S0.get(i8));
        }
        for (int i9 = 0; i9 < this.T0.size(); i9++) {
            w4c0Var.R(13, (t8) this.T0.get(i9));
        }
        if (this.U0.size() > 0) {
            w4c0Var.Y(130);
            w4c0Var.Y(this.V0);
        }
        for (int i10 = 0; i10 < this.U0.size(); i10++) {
            w4c0Var.Q(((Integer) this.U0.get(i10)).intValue());
        }
        if ((this.c & 8) == 8) {
            w4c0Var.P(17, this.W0);
        }
        if ((this.c & 16) == 16) {
            w4c0Var.R(18, this.X0);
        }
        if ((this.c & 32) == 32) {
            w4c0Var.P(19, this.Y0);
        }
        for (int i11 = 0; i11 < this.Z.size(); i11++) {
            w4c0Var.R(20, (t8) this.Z.get(i11));
        }
        if (this.N0.size() > 0) {
            w4c0Var.Y(170);
            w4c0Var.Y(this.O0);
        }
        for (int i12 = 0; i12 < this.N0.size(); i12++) {
            w4c0Var.Q(((Integer) this.N0.get(i12)).intValue());
        }
        for (int i13 = 0; i13 < this.Z0.size(); i13++) {
            w4c0Var.R(25, (t8) this.Z0.get(i13));
        }
        if ((this.c & 64) == 64) {
            w4c0Var.R(30, this.a1);
        }
        for (int i14 = 0; i14 < this.b1.size(); i14++) {
            w4c0Var.P(31, ((Integer) this.b1.get(i14)).intValue());
        }
        if ((this.c & 128) == 128) {
            w4c0Var.R(32, this.c1);
        }
        for (int i15 = 0; i15 < this.d1.size(); i15++) {
            w4c0Var.R(33, (t8) this.d1.get(i15));
        }
        kp00Var.l(19000, w4c0Var);
        w4c0Var.U(this.b);
    }

    @Override // p.u2j0
    public final t8 getDefaultInstanceForType() {
        return g1;
    }

    @Override // p.u2j0
    public final boolean isInitialized() {
        byte b = this.e1;
        if (b == 1) {
            return true;
        }
        if (b == 0) {
            return false;
        }
        if ((this.c & 2) != 2) {
            this.e1 = (byte) 0;
            return false;
        }
        for (int i = 0; i < this.g.size(); i++) {
            if (!((wgy0) this.g.get(i)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (!((rgy0) this.h.get(i2)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i3 = 0; i3 < this.Z.size(); i3++) {
            if (!((rgy0) this.Z.get(i3)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i4 = 0; i4 < this.P0.size(); i4++) {
            if (!((kfy0) this.P0.get(i4)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i5 = 0; i5 < this.Q0.size(); i5++) {
            if (!((yfy0) this.Q0.get(i5)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i6 = 0; i6 < this.R0.size(); i6++) {
            if (!((ggy0) this.R0.get(i6)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i7 = 0; i7 < this.S0.size(); i7++) {
            if (!((tgy0) this.S0.get(i7)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        for (int i8 = 0; i8 < this.T0.size(); i8++) {
            if (!((tfy0) this.T0.get(i8)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 16) == 16 && !this.X0.isInitialized()) {
            this.e1 = (byte) 0;
            return false;
        }
        for (int i9 = 0; i9 < this.Z0.size(); i9++) {
            if (!((efy0) this.Z0.get(i9)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        if ((this.c & 64) == 64 && !this.a1.isInitialized()) {
            this.e1 = (byte) 0;
            return false;
        }
        for (int i10 = 0; i10 < this.d1.size(); i10++) {
            if (!((ify0) this.d1.get(i10)).isInitialized()) {
                this.e1 = (byte) 0;
                return false;
            }
        }
        if (g()) {
            this.e1 = (byte) 1;
            return true;
        }
        this.e1 = (byte) 0;
        return false;
    }

    public final void n() {
        this.d = 6;
        this.e = 0;
        this.f = 0;
        List list = Collections.EMPTY_LIST;
        this.g = list;
        this.h = list;
        this.i = list;
        this.X = list;
        this.Z = list;
        this.N0 = list;
        this.P0 = list;
        this.Q0 = list;
        this.R0 = list;
        this.S0 = list;
        this.T0 = list;
        this.U0 = list;
        this.W0 = 0;
        this.X0 = rgy0.U0;
        this.Y0 = 0;
        this.Z0 = list;
        this.a1 = xgy0.g;
        this.b1 = list;
        this.c1 = ehy0.e;
        this.d1 = list;
    }

    public hfy0() {
        this.t = -1;
        this.Y = -1;
        this.O0 = -1;
        this.V0 = -1;
        this.e1 = (byte) -1;
        this.f1 = -1;
        this.b = qhc.a;
    }

    public hfy0(ffy0 ffy0Var) {
        super(ffy0Var);
        this.t = -1;
        this.Y = -1;
        this.O0 = -1;
        this.V0 = -1;
        this.e1 = (byte) -1;
        this.f1 = -1;
        this.b = ffy0Var.a;
    }
}
