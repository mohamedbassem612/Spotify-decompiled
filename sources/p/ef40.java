package p;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException;

/* JADX INFO: loaded from: /workspace/spotify-analysis/dex-input/classes12.dex */
public abstract class ef40 extends kf40 {
    public final m220 a;

    public ef40(df40 df40Var) {
        df40Var.b.f();
        df40Var.c = false;
        this.a = df40Var.b;
    }

    public final boolean g() {
        ig91 ig91Var = this.a.a;
        for (int i = 0; i < ig91Var.b.size(); i++) {
            if (!m220.e((Map.Entry) ig91Var.b.get(i))) {
                return false;
            }
        }
        Iterator it = ig91Var.c().iterator();
        while (it.hasNext()) {
            if (!m220.e((Map.Entry) it.next())) {
                return false;
            }
        }
        return true;
    }

    public final int h() {
        ig91 ig91Var = this.a.a;
        int iD = 0;
        for (int i = 0; i < ig91Var.b.size(); i++) {
            Map.Entry entry = (Map.Entry) ig91Var.b.get(i);
            iD += m220.d((ff40) entry.getKey(), entry.getValue());
        }
        for (Map.Entry entry2 : ig91Var.c()) {
            iD += m220.d((ff40) entry2.getKey(), entry2.getValue());
        }
        return iD;
    }

    public final Object i(hf40 hf40Var) {
        m(hf40Var);
        ff40 ff40Var = hf40Var.d;
        Object obj = this.a.a.get(ff40Var);
        if (obj == null) {
            return hf40Var.b;
        }
        if (!ff40Var.c) {
            return hf40Var.a(obj);
        }
        if (ff40Var.b.a != oul1.ENUM) {
            return obj;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = ((List) obj).iterator();
        while (it.hasNext()) {
            arrayList.add(hf40Var.a(it.next()));
        }
        return arrayList;
    }

    public final boolean j(hf40 hf40Var) {
        m(hf40Var);
        ff40 ff40Var = hf40Var.d;
        m220 m220Var = this.a;
        m220Var.getClass();
        if (!ff40Var.c) {
            return m220Var.a.get(ff40Var) != null;
        }
        hhg1.n("hasField() can only be called on non-repeated fields.");
        return false;
    }

    public final void k() {
        this.a.f();
    }

    /* JADX INFO: Thrown type has an unknown type hierarchy: kotlin.reflect.jvm.internal.impl.protobuf.InvalidProtocolBufferException */
    /* JADX WARN: Code duplicated, block: B:4:0x0019  */
    public final boolean l(mwg mwgVar, w4c0 w4c0Var, vz00 vz00Var, int i) throws InvalidProtocolBufferException {
        boolean z;
        boolean z2;
        Object objA;
        t8 t8Var;
        int i2 = i & 7;
        hf40 hf40Var = (hf40) vz00Var.a.get(new qz00(getDefaultInstanceForType(), i >>> 3));
        if (hf40Var == null) {
            z2 = true;
            z = false;
        } else {
            ff40 ff40Var = hf40Var.d;
            lul1 lul1Var = ff40Var.b;
            m220 m220Var = m220.c;
            if (i2 == lul1Var.b) {
                z2 = false;
                z = false;
            } else if (ff40Var.c && lul1Var.a() && i2 == 2) {
                z = true;
                z2 = false;
            } else {
                z2 = true;
                z = false;
            }
        }
        if (z2) {
            return mwgVar.q(i, w4c0Var);
        }
        xe40 xe40VarB = null;
        m220 m220Var2 = this.a;
        if (z) {
            int iE = mwgVar.e(mwgVar.k());
            ff40 ff40Var2 = hf40Var.d;
            if (ff40Var2.b != lul1.g) {
                while (mwgVar.c() > 0) {
                    m220Var2.a(ff40Var2, m220.h(mwgVar, ff40Var2.b));
                }
            } else if (mwgVar.c() > 0) {
                mwgVar.k();
                throw null;
            }
            mwgVar.d(iE);
            return true;
        }
        ff40 ff40Var3 = hf40Var.d;
        lul1 lul1Var2 = ff40Var3.b;
        boolean z3 = ff40Var3.c;
        lul1 lul1Var3 = ff40Var3.b;
        int iOrdinal = lul1Var2.a.ordinal();
        if (iOrdinal == 7) {
            mwgVar.k();
            throw null;
        }
        if (iOrdinal != 8) {
            objA = m220.h(mwgVar, lul1Var3);
        } else {
            if (!z3 && (t8Var = (t8) m220Var2.a.get(ff40Var3)) != null) {
                xe40VarB = t8Var.c();
            }
            if (xe40VarB == null) {
                xe40VarB = hf40Var.c.b();
            }
            if (lul1Var3 == lul1.e) {
                short s = ff40Var3.a;
                mwgVar.b();
                mwgVar.i++;
                xe40VarB.b(mwgVar, vz00Var);
                mwgVar.a((s << 3) | 4);
                mwgVar.i--;
            } else {
                int iK = mwgVar.k();
                mwgVar.b();
                int iE2 = mwgVar.e(iK);
                mwgVar.i++;
                xe40VarB.b(mwgVar, vz00Var);
                mwgVar.a(0);
                mwgVar.i--;
                mwgVar.d(iE2);
            }
            objA = xe40VarB.a();
        }
        if (z3) {
            m220Var2.a(ff40Var3, hf40Var.b(objA));
            return true;
        }
        m220Var2.i(ff40Var3, hf40Var.b(objA));
        return true;
    }

    public final void m(hf40 hf40Var) {
        if (hf40Var.a == getDefaultInstanceForType()) {
            return;
        }
        hhg1.n("This extension is for a different message type.  Please make sure that you are not suppressing any generics type warnings.");
    }

    public ef40() {
        this.a = new m220();
    }
}
